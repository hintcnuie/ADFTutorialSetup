package oracle.srdemo.datamodel;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;

import oracle.toplink.indirection.ValueHolder;
import oracle.toplink.indirection.ValueHolderInterface;

public class ServiceRequests {

    /**Map createdBy <-> oracle.srdemo.datamodel.Users
     * @associates <{oracle.srdemo.datamodel.Users}>
     */
    private ValueHolderInterface createdBy;

    /**Map assignedTo <-> oracle.srdemo.datamodel.Users
     * @associates <{oracle.srdemo.datamodel.Users}>
     */
    private ValueHolderInterface assignedTo;

    /**Map products <-> oracle.srdemo.datamodel.Products
     * @associates <{oracle.srdemo.datamodel.Products}>
     */
    private ValueHolderInterface products;

    /**Map serviceHistoriesCollection <-> oracle.srdemo.datamodel.ServiceHistories
     * @associates <{oracle.srdemo.datamodel.ServiceHistories}>
     */
    private List serviceHistoriesCollection;
    private Integer svrId;
    private String status;
    private Timestamp requestDate;
    private String problemDescription;
    private Timestamp assignedDate;

    public ServiceRequests() {
        super();
        this.assignedTo = new ValueHolder();
        this.createdBy = new ValueHolder();
        this.products = new ValueHolder();
        this.serviceHistoriesCollection = new ArrayList();
    }

    public void addServiceHistories(int index, 
                                    ServiceHistories aServiceHistories) {
        this.serviceHistoriesCollection.add(index, aServiceHistories);
        aServiceHistories.setServiceRequests(this);
    }

    public void addServiceHistories(ServiceHistories aServiceHistories) {
        this.serviceHistoriesCollection.add(aServiceHistories);
        aServiceHistories.setServiceRequests(this);
    }

    public Timestamp getAssignedDate() {
        return this.assignedDate;
    }

    public Users getAssignedTo() {
        return (Users)this.assignedTo.getValue();
    }

    public Users getCreatedBy() {
        return (Users)this.createdBy.getValue();
    }

    public String getProblemDescription() {
        return this.problemDescription;
    }

    public Products getProducts() {
        return (Products)this.products.getValue();
    }

    public Timestamp getRequestDate() {
        return this.requestDate;
    }

    public List<ServiceHistories> getServiceHistoriesCollection() {
        return this.serviceHistoriesCollection;
    }

    public String getStatus() {
        return this.status;
    }

    public Integer getSvrId() {
        return this.svrId;
    }

    public void removeServiceHistories(ServiceHistories aServiceHistories) {
        this.serviceHistoriesCollection.remove(aServiceHistories);
    }

    public void setAssignedDate(Timestamp assignedDate) {
        this.assignedDate = assignedDate;
    }

    public void setAssignedTo(Users assignedTo) {
        this.assignedTo.setValue(assignedTo);
    }

    public void setCreatedBy(Users createdBy) {
        this.createdBy.setValue(createdBy);
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public void setProducts(Products products) {
        this.products.setValue(products);
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = (requestDate==null)
        ?new Timestamp(System.currentTimeMillis()):requestDate;
    }

    public void setServiceHistoriesCollection(List<ServiceHistories> serviceHistoriesCollection) {
        this.serviceHistoriesCollection = serviceHistoriesCollection;
    }

    public void setStatus(String status) {
        this.status = (status==null)?"Open":status;
    }

    public void setSvrId(Integer svrId) {
        this.svrId = svrId;
    }

}
