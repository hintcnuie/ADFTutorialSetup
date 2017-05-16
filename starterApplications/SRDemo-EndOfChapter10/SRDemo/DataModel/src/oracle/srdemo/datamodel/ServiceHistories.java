package oracle.srdemo.datamodel;

import java.sql.Timestamp;

import oracle.toplink.indirection.ValueHolder;
import oracle.toplink.indirection.ValueHolderInterface;

public class ServiceHistories {

    /**Map serviceRequests <-> oracle.srdemo.datamodel.ServiceRequests
     * @associates <{oracle.srdemo.datamodel.ServiceRequests}>
     */
    private ValueHolderInterface serviceRequests;

    /**Map users <-> oracle.srdemo.datamodel.Users
     * @associates <{oracle.srdemo.datamodel.Users}>
     */
    private ValueHolderInterface users;

    private Integer lineNo;
    private Timestamp svhDate;
    private String notes;
    private String svhType;

    public ServiceHistories() {
        super();
        this.serviceRequests = new ValueHolder();
        this.users = new ValueHolder();
    }

    public ServiceHistories(ServiceRequests sr, Users user) {
        this();
        sr.addServiceHistories(this);  
        setUsers(user);
        setLineNo(null);
        setSvhDate(null);
    }


    public Integer getLineNo() {
        return this.lineNo;
    }

    public String getNotes() {
        return this.notes;
    }

    public ServiceRequests getServiceRequests() {
        return (ServiceRequests)this.serviceRequests.getValue();
    }

    public Timestamp getSvhDate() {
        return this.svhDate;
    }

    public String getSvhType() {
        return this.svhType;
    }



    public Users getUsers() {
        return (Users)this.users.getValue();
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = (lineNo==null)?getNextLineItem():lineNo;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setServiceRequests(ServiceRequests serviceRequests) {
        this.serviceRequests.setValue(serviceRequests);
    }

    public void setSvhDate(Timestamp svhDate) {
        this.svhDate = (svhDate==null)
        ?new Timestamp(System.currentTimeMillis()):svhDate;
    }

    public void setSvhType(String svhType) {
        this.svhType = svhType;
    }



    public void setUsers(Users users) {
        this.users.setValue(users);
    }

    public Integer getNextLineItem() {
        int maxLineNo = 0;
        for (ServiceHistories svh:getServiceRequests().getServiceHistoriesCollection()){
            if (svh.getLineNo() !=null) {
                int testLineNo = svh.getLineNo().intValue();
                if (testLineNo > maxLineNo){
                    maxLineNo = testLineNo;
                }
            } 
        }
    return ++maxLineNo;
    }

}
