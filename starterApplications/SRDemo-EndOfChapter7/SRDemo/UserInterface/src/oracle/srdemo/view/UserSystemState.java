package oracle.srdemo.view;

import java.util.HashMap;

import javax.faces.context.FacesContext;

import oracle.srdemo.view.util.JSFUtils;
import javax.faces.context.FacesContext;


/**
 * UserSystemState provides a scoped value holder and convenience methods
 * that store ongoing UI State information in a single plave which can
 * be simply accessed through EL or Java
 *
 * $Id: UserSystemState.java,v 1.4 2005/12/07 18:17:38 duncan Exp $
 */
public class UserSystemState {

  private HashMap _settings = new HashMap(7);
  private static final String CURRENT_SVR_ID = "CURRENT_SVR_ID";
  private static final String RETURN_NAVIGATION_RULE = "RETURN_NAVIGATION_RULE";
  private static final String REFRESH = "REFRESH";
  private static final String EDIT_REFRESH = "EDIT_REFRESH";  
  private static final String LIST_MODE = "LIST_MODE";
  private static final String SEARCH_FIRSTTIME_FLAG = "SEARCH_FIRSTTIME_FLAG";
  private static final String STAFF_SEARCH_FIRSTTIME_FLAG = "STAFF_SEARCH_FIRSTTIME_FLAG";

  private static final String LIST_MODE_OPEN = "Open";
  private static final String LIST_MODE_PENDING = "Pending";
  private static final String LIST_MODE_CLOSED = "Closed";
  private static final String LIST_MODE_ALL = "%";

  public UserSystemState() {
    //define some defaults
    _settings.put(SEARCH_FIRSTTIME_FLAG,true);
    _settings.put(STAFF_SEARCH_FIRSTTIME_FLAG,true);    
    _settings.put(LIST_MODE,LIST_MODE_OPEN);
  }

  /**
   * Get the state of the refresh indicator
   * @return boolean
   */
  public boolean isRefresh(){
    Boolean refresh = (Boolean)_settings.get(REFRESH);
    if (refresh == null){
      refresh = false;
    }
    return refresh.booleanValue();
  }
  
  /**
   * Get the state of the refresh indicator
   * for the edit page
   * @return boolean
   */
  public boolean isEditRefresh(){
    Boolean refresh = (Boolean)_settings.get(EDIT_REFRESH);
    if (refresh == null){
      refresh = false;
    }
    return refresh.booleanValue();
  }
  

  /**
   * Get the current service request of interest
   * @return Id as Integer
    Default value ste to "1" for testing
   */
  public Integer getCurrentSvrId(){
	Integer svrId = (Integer)_settings.get(CURRENT_SVR_ID);
	if (svrId == null)
    	return new Integer(1);
    else
    	return svrId;
  }

  /**
   * Get the saved navigation rule
   * @return navigation outcome as String
   */
  public String getReturnNavigationRule(){
    String rule = (String)_settings.get(RETURN_NAVIGATION_RULE);
    if (rule == null) {
      rule = "GlobalHome";
    }
    return rule;
  }

  /**
   * Get the current list mode
   * @return Mode as String
   */
  public String getListMode(){
    String mode = (String)_settings.get(LIST_MODE);
    if (mode == null) {
      mode = LIST_MODE_OPEN;
    }
    return mode;
  }
  
  /**
   * Get the state of the search firstTime flag
   * @return boolean
   */
  public boolean isSearchFirstTime(){
    Boolean firstTime = (Boolean)_settings.get(SEARCH_FIRSTTIME_FLAG);
    if (firstTime == null){
      firstTime = true;
    }
    return firstTime.booleanValue();
  }  

  /**
   * Get the state of the search firstTime flag
   * @return boolean
   */
  public boolean isStaffSearchFirstTime(){
    Boolean firstTime = (Boolean)_settings.get(STAFF_SEARCH_FIRSTTIME_FLAG);
    if (firstTime == null){
      firstTime = true;
    }
    return firstTime.booleanValue();
  }  
  

  /**
   * Convenience function to help in the selected evaluation on the menu items
   */
   public boolean isListModeOpen() {
     return getListMode().equals(LIST_MODE_OPEN);
   }

  /**
   * Convenience function to help in the selected evaluation on the menu items
   */
   public boolean isListModePending() {
     return getListMode().equals(LIST_MODE_PENDING);
   }

  /**
   * Convenience function to help in the selected evaluation on the menu items
   */
   public boolean isListModeClosed() {
     return getListMode().equals(LIST_MODE_CLOSED);
   }

  /**
   * Convenience function to help in the selected evaluation on the menu items
   */
   public boolean isListModeAll() {
     return getListMode().equals(LIST_MODE_ALL);
   }


  /**
   * Set the refresh value
   * @param flag
   */
  public void setRefresh(boolean flag){
    _settings.put(REFRESH, new Boolean(flag));
  }

    /**
     * Set the eidt refresh value
     * @param flag
     */
    public void setEditRefresh(boolean flag){
      _settings.put(EDIT_REFRESH, new Boolean(flag));
    }  
    
  /**
   * Set the search firstTime Flag
   * @param flag
   */
  public void setSearchFirstTime(boolean flag){
    _settings.put(SEARCH_FIRSTTIME_FLAG, new Boolean(flag));
  }  
  
  /**
   * Set the staff search firstTime Flag
   * @param flag
   */
  public void setStaffSearchFirstTime(boolean flag){
    _settings.put(STAFF_SEARCH_FIRSTTIME_FLAG, new Boolean(flag));
  }   

  /**
   * Set the current service request id of interest
   * @param svrId
   */
  public void setCurrentSvrId(Integer svrId){
    _settings.put(CURRENT_SVR_ID,svrId);
    //And reset the refresh flag as well
     _settings.put(REFRESH,false);
  }

  /**
   * Set the return navigation rule
   * @param rule
   */
  public void setReturnNavigationRule(String rule){
    _settings.put(RETURN_NAVIGATION_RULE,rule);
  }

  /**
   * Set the current list mode
   * @param mode
   */
  public void setListMode(String mode){
    _settings.put(LIST_MODE,mode);
  }

  //Static convenience methods used from coded calls rather than EL
  // We still call back into JSF to set the values then the bean can be moved
  // in scope terms without this code having to be changed
  public static void storeCurrentSvrID(Integer svrId){
    FacesContext ctx = FacesContext.getCurrentInstance();
    JSFUtils.setManagedBeanValue(ctx,"userState.currentSvrId",svrId);
  }

  public static void storeReturnNavigationRule(String rule){
    FacesContext ctx = FacesContext.getCurrentInstance();
    JSFUtils.setManagedBeanValue(ctx,"userState.returnNavigationRule",rule);
  }

  public static String retrieveReturnNavigationRule(){
    FacesContext ctx = FacesContext.getCurrentInstance();
    return (String)JSFUtils.getManagedBeanValue(ctx,"userState.returnNavigationRule");
  }


  public static void refreshNeeded(){
    FacesContext ctx = FacesContext.getCurrentInstance();
    JSFUtils.setManagedBeanValue(ctx,"userState.refresh",true);
  }

}

