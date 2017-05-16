package oracle.srdemo.datamodel;

import java.util.List;

import javax.ejb.Local;

@Local
public interface SRPublicFacadeLocal {
    Object mergeEntity(Object entity);

    Object persistEntity(Object entity);

    Object refreshEntity(Object entity);

    void removeEntity(Object entity);

    List<ExpertiseAreas> findAllExpertiseAreas();

    List<Products> findAllProducts();

    List<ServiceHistories> findAllServiceHistories();

    List<ServiceRequests> findAllServiceRequests();

    List<ServiceRequests> findServiceRequests(Integer filedBy, String status);

    List<Users> findAllUsers();

    ServiceRequests createServiceRequests(String problemDescription, Integer productId, Integer createdBy);
    

    List<ServiceRequests> searchServiceRequests(String descr, String status);

    Users findUserByEmail(String emailParam);

    Products findProductById(Integer prodId);

    ServiceRequests findServiceRequestById(Integer findSvrId);

    Users findUserById(Integer createdBy);
}
