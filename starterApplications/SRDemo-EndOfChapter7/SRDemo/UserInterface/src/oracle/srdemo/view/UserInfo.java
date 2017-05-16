package oracle.srdemo.view;

import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import oracle.adf.model.OperationBinding;

import oracle.binding.BindingContainer;

import oracle.srdemo.datamodel.Users;


/**
 * UserInfo provides access to static security information obtained from the container
 * security
 * It also provides the ability to define artificial values for development time purposes
 *
 * $Id: UserInfo.java,v 1.1 2005/11/25 19:14:14 duncan Exp $
 */
public class UserInfo {
    //Constants used to identify user's role.
    private static final int NOT_AUTHENTICATED = 0;
    private static final int USER_ROLE = 1;
    private static final int TECHNICIAN_ROLE = 2;
    private static final int MANAGER_ROLE = 3;

    private static final String[] ROLE_NAMES = {"no role", "user", "technician", "manager"};

    private int     _userRole = NOT_AUTHENTICATED;
    private Integer _userId;
    private String  _userName = null;
    private boolean _devMode = false;
    private BindingContainer _bindings;
    Users userobject = null;

    /**
     * Constructor
     */
    public UserInfo() {
        //need to work out how to get to the request
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();

        //Only allow Development mode functions if security is not active
        _devMode = (ectx.getAuthType() == null);

        //Ask the container who the user logged in as
        _userName = ectx.getRemoteUser();

        //Default the value if not authenticated
        if (_userName == null || _userName.length()==0) {
            _userName = "Not Authenticated";
        }

        //Set the user role flag
        for (int i=1;i<ROLE_NAMES.length;i++)  {
            if (ectx.isUserInRole(ROLE_NAMES[i])){
                _userRole = i;
                break;
            }
        }
    }

    /**
     * Function to take the logon name from the container and
     * match that against the email id in the USERs table.
     * Not this is NOT an authentication step, the user is already
     * authenticated at this stage by container security
     * The binding container is injected from faces config
     * and refers to a special pageDef "headless_UserInfoPageDef" which only
     * contains the defintion of this method call
     */
    private Integer lookupUserId(String userName) {

        OperationBinding oper = (OperationBinding)getBindings().getOperationBinding("findUserByEmail");
        //now set the argument to the function with the username we are interested in
        Map params = oper.getParamsMap();
        params.put("emailParam",userName);
        // And execute
        Users user = (Users)oper.execute();
	setUserobject(user);
        Integer x = user.getUserId();
        return user.getUserId();
        
    }

    //** Development Mode functions **
    /**
     * Used for development purposes - Artifically set the
     * role value by name
     * Note that this function will <u>not</u> work when container security is
     * enabled as a security precaution
     * @param userRoleName
     */
    public void setUserRole(String userRoleName) {
        if (_devMode) {
            for (int i=1;i<ROLE_NAMES.length;i++)  {
                if (ROLE_NAMES[i].equals(userRoleName)){
                    _userRole = i;
                    break;
                }
            }
        }
    }

    /**
     * Used for development only - allows the developer to artificially
     * set the userName if container managed security is being used.
     * Note that this function will <u>not</u> work when container security is
     * enabled as a security precaution
     * @param userName
     */
    public void setUserName(String userName) {
        if (_devMode){
            _userName = userName;
        }
    }

    // **General Public APIs **

    /**
     * @return the String role name
     */
    public String getUserRole() {
        return ROLE_NAMES[_userRole];
    }

    /**
     * Get the container user name of the current user
     * As an additional precation make it clear when we are running in
     * Dev mode
     * @return users login name which in this case is also their email id
     */
    public String getUserName() {
      StringBuffer name = new StringBuffer(_userName);
      if (_devMode) {
        name.append(" (Development Mode)");
      }
      return name.toString();
    }

    /**
     * Function designed to be used from Expression Language
     * for swiching UI Features based on role
     * @return boolean
     */
    public boolean isCustomer() {
        return (_userRole==USER_ROLE);
    }

    /**
     * Function designed to be used from Expression Language
     * for switching UI Features based on role
     * @return boolean
     */
    public boolean isTechnician() {
        return (_userRole==TECHNICIAN_ROLE);
    }

    /**
     * Function designed to be used from Expression Language
     * for switching UI Features based on role
     * @return boolean
     */
    public boolean isManager() {
        return (_userRole==MANAGER_ROLE);
    }

    /**
     * Function designed to be used from Expression Language
     * for switching UI Features based on role.
     * This particular function indicates if the user is either
     * a technician or manager
     * @return boolean
     */
    public boolean isStaff() {
        return (_userRole>USER_ROLE);
    }

    /**
     * Function designed to be used from Expression Language
     * for switching UI Features based on role.
     * This particular function indicates if the session is actually authenticated
     * @return boolean
     */
    public boolean isAuthenticated() {
        return (_userRole>NOT_AUTHENTICATED);
    }

    /**
     * Function used internally by the system when creating new records
     * @return the numerical user id that is the primary key in the USERs table
     */
    public Integer getUserId() {
        if (_userId == null){
        _userId = lookupUserId(_userName);
        }
        return _userId;
    }

    public void setBindings(BindingContainer bindings) {
        this._bindings = bindings;
    }

    public BindingContainer getBindings() {
        return _bindings;
    }
    public void setUserobject(Users userobject) {
        this.userobject = userobject;
    }

    public Users getUserobject() {
        return userobject;
    } 
}
