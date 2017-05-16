package oracle.srdemo.datamodel;

import java.util.ArrayList;
import java.util.List;

public class Products {

    /**Map serviceRequestsCollection <-> oracle.srdemo.datamodel.ServiceRequests
     * @associates <{oracle.srdemo.datamodel.ServiceRequests}>
     */
    private List serviceRequestsCollection;

    /**Map expertiseAreasCollection <-> oracle.srdemo.datamodel.ExpertiseAreas
     * @associates <{oracle.srdemo.datamodel.ExpertiseAreas}>
     */
    private List expertiseAreasCollection;
    private Integer prodId;
    private String name;
    private String image;
    private String description;

    public Products() {
        super();
        this.expertiseAreasCollection = new ArrayList();
        this.serviceRequestsCollection = new ArrayList();
    }

    public void addExpertiseAreas(int index, ExpertiseAreas anExpertiseAreas) {
        this.expertiseAreasCollection.add(index, anExpertiseAreas);
        anExpertiseAreas.setProducts(this);
    }

    public void addExpertiseAreas(ExpertiseAreas anExpertiseAreas) {
        this.expertiseAreasCollection.add(anExpertiseAreas);
        anExpertiseAreas.setProducts(this);
    }

    public void addServiceRequests(ServiceRequests aServiceRequests) {
        this.serviceRequestsCollection.add(aServiceRequests);
        aServiceRequests.setProducts(this);
    }

    public void addServiceRequests(int index, 
                                   ServiceRequests aServiceRequests) {
        this.serviceRequestsCollection.add(index, aServiceRequests);
        aServiceRequests.setProducts(this);
    }

    public String getDescription() {
        return this.description;
    }

    public List<ExpertiseAreas> getExpertiseAreasCollection() {
        return this.expertiseAreasCollection;
    }

    public String getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public Integer getProdId() {
        return this.prodId;
    }

    public List<ServiceRequests> getServiceRequestsCollection() {
        return this.serviceRequestsCollection;
    }

    public void removeExpertiseAreas(ExpertiseAreas anExpertiseAreas) {
        this.expertiseAreasCollection.remove(anExpertiseAreas);
    }

    public void removeServiceRequests(ServiceRequests aServiceRequests) {
        this.serviceRequestsCollection.remove(aServiceRequests);
        aServiceRequests.setProducts(null);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExpertiseAreasCollection(List<ExpertiseAreas> expertiseAreasCollection) {
        this.expertiseAreasCollection = expertiseAreasCollection;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public void setServiceRequestsCollection(List<ServiceRequests> serviceRequestsCollection) {
        this.serviceRequestsCollection = serviceRequestsCollection;
    }

}
