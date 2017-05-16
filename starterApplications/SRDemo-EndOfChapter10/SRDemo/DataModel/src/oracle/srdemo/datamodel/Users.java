package oracle.srdemo.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Users {

    /**Map createdByCollection <-> oracle.srdemo.datamodel.ServiceRequests
     * @associates <{oracle.srdemo.datamodel.ServiceRequests}>
     */
    private List createdByCollection;

    /**Map assignedToCollection <-> oracle.srdemo.datamodel.ServiceRequests
     * @associates <{oracle.srdemo.datamodel.ServiceRequests}>
     */
    private List assignedToCollection;

    /**Map serviceHistoriesCollection <-> oracle.srdemo.datamodel.ServiceHistories
     * @associates <{oracle.srdemo.datamodel.ServiceHistories}>
     */
    private List serviceHistoriesCollection;

    /**Map expertiseAreasCollection <-> oracle.srdemo.datamodel.ExpertiseAreas
     * @associates <{oracle.srdemo.datamodel.ExpertiseAreas}>
     */
    private List expertiseAreasCollection;
    private Integer userId;
    private String userRole;
    private String email;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String countryId;

    public Users() {
        super();
        this.assignedToCollection = new ArrayList();
        this.createdByCollection = new ArrayList();
        this.expertiseAreasCollection = new ArrayList();
        this.serviceHistoriesCollection = new ArrayList();
    }

    public void addAssignedTo(int index, ServiceRequests aServiceRequests) {
        this.assignedToCollection.add(index, aServiceRequests);
        aServiceRequests.setAssignedTo(this);
    }

    public void addAssignedTo(ServiceRequests aServiceRequests) {
        this.assignedToCollection.add(aServiceRequests);
        aServiceRequests.setAssignedTo(this);
    }

    public void addCreatedBy(ServiceRequests aServiceRequests) {
        this.createdByCollection.add(aServiceRequests);
        aServiceRequests.setCreatedBy(this);
    }

    public void addCreatedBy(int index, ServiceRequests aServiceRequests) {
        this.createdByCollection.add(index, aServiceRequests);
        aServiceRequests.setCreatedBy(this);
    }

    public void addExpertiseAreas(int index, ExpertiseAreas anExpertiseAreas) {
        this.expertiseAreasCollection.add(index, anExpertiseAreas);
        anExpertiseAreas.setUsers(this);
    }

    public void addExpertiseAreas(ExpertiseAreas anExpertiseAreas) {
        this.expertiseAreasCollection.add(anExpertiseAreas);
        anExpertiseAreas.setUsers(this);
    }

    public void addServiceHistories(ServiceHistories aServiceHistories) {
        this.serviceHistoriesCollection.add(aServiceHistories);
        aServiceHistories.setUsers(this);
    }

    public void addServiceHistories(int index, 
                                    ServiceHistories aServiceHistories) {
        this.serviceHistoriesCollection.add(index, aServiceHistories);
        aServiceHistories.setUsers(this);
    }

    public List<ServiceRequests> getAssignedToCollection() {
        return this.assignedToCollection;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public List<ServiceRequests> getCreatedByCollection() {
        return this.createdByCollection;
    }

    public String getEmail() {
        return this.email;
    }

    public List<ExpertiseAreas> getExpertiseAreasCollection() {
        return this.expertiseAreasCollection;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public List<ServiceHistories> getServiceHistoriesCollection() {
        return this.serviceHistoriesCollection;
    }

    public String getStateProvince() {
        return this.stateProvince;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getUserRole() {
        return this.userRole;
    }

    public void removeAssignedTo(ServiceRequests aServiceRequests) {
        this.assignedToCollection.remove(aServiceRequests);
        aServiceRequests.setAssignedTo(null);
    }

    public void removeCreatedBy(ServiceRequests aServiceRequests) {
        this.createdByCollection.remove(aServiceRequests);
        aServiceRequests.setCreatedBy(null);
    }

    public void removeExpertiseAreas(ExpertiseAreas anExpertiseAreas) {
        this.expertiseAreasCollection.remove(anExpertiseAreas);
    }

    public void removeServiceHistories(ServiceHistories aServiceHistories) {
        this.serviceHistoriesCollection.remove(aServiceHistories);
        aServiceHistories.setUsers(null);
    }

    public void setAssignedToCollection(List<ServiceRequests> assignedToCollection) {
        this.assignedToCollection = assignedToCollection;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setCreatedByCollection(List<ServiceRequests> createdByCollection) {
        this.createdByCollection = createdByCollection;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExpertiseAreasCollection(List<ExpertiseAreas> expertiseAreasCollection) {
        this.expertiseAreasCollection = expertiseAreasCollection;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setServiceHistoriesCollection(List<ServiceHistories> serviceHistoriesCollection) {
        this.serviceHistoriesCollection = serviceHistoriesCollection;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}
