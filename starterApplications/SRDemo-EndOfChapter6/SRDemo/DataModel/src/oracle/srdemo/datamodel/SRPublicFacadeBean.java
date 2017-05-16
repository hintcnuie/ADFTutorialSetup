package oracle.srdemo.datamodel;

import java.util.List;
import java.util.Vector;

import javax.ejb.Stateless;

import oracle.toplink.sessions.Session;
import oracle.toplink.sessions.UnitOfWork;
import oracle.toplink.util.SessionFactory;

@Stateless(name="SRPublicFacade")
public class SRPublicFacadeBean implements SRPublicFacadeLocal {
    private SessionFactory sessionFactory;

    public SRPublicFacadeBean() {
        this.sessionFactory = 
                new SessionFactory("META-INF/sessions.xml", "SRDemoSession");
    }

    public Object mergeEntity(Object entity) {
        UnitOfWork uow = getSessionFactory().acquireUnitOfWork();
        Object workingCopy = uow.readObject(entity);
        if (workingCopy == null)
            throw new RuntimeException("Could not find entity to update");
        uow.deepMergeClone(entity);
        uow.commit();

        return workingCopy;
    }

    public Object persistEntity(Object entity) {
        UnitOfWork uow = getSessionFactory().acquireUnitOfWork();
        Object existingObject = uow.readObject(entity);
        if (existingObject != null)
            throw new RuntimeException("Entity already exists");
        Object newInstance = uow.deepMergeClone(entity);
        uow.commit();

        return newInstance;
    }

    public Object refreshEntity(Object entity) {
        Session session = getSessionFactory().acquireSession();
        Object refreshedEntity = session.refreshObject(entity);
        session.release();

        return refreshedEntity;
    }

    public void removeEntity(Object entity) {
        UnitOfWork uow = getSessionFactory().acquireUnitOfWork();
        Object workingCopy = uow.readObject(entity);
        if (workingCopy == null)
            throw new RuntimeException("Could not find entity to update");
        uow.deleteObject(workingCopy);
        uow.commit();
    }

    private SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public List<ExpertiseAreas> findAllExpertiseAreas() {
        Session session = getSessionFactory().acquireSession();
        List<ExpertiseAreas> results = 
            (List<ExpertiseAreas>)session.executeQuery("findAllExpertiseAreas", ExpertiseAreas.class);session.release();
        // Uncomment the following lines of code if the results from this query will be mutated.
        // See SessionFactory.detach() for more information.
        // results = (java.util.List<oracle.srdemo.datamodel.ExpertiseAreas>)getSessionFactory().detach(results);

        return results;
    }

    public List<Products> findAllProducts() {
        Session session = getSessionFactory().acquireSession();
        List<Products> results = 
            (List<Products>)session.executeQuery("findAllProducts", Products.class);session.release();
        // Uncomment the following lines of code if the results from this query will be mutated.
        // See SessionFactory.detach() for more information.
        // results = (java.util.List<oracle.srdemo.datamodel.Products>)getSessionFactory().detach(results);

        return results;
    }

    

    public List<ServiceHistories> findAllServiceHistories() {
        Session session = getSessionFactory().acquireSession();
        List<ServiceHistories> results = 
            (List<ServiceHistories>)session.executeQuery("findAllServiceHistories", ServiceHistories.class);session.release();
        // Uncomment the following lines of code if the results from this query will be mutated.
        // See SessionFactory.detach() for more information.
        // results = (java.util.List<oracle.srdemo.datamodel.ServiceHistories>)getSessionFactory().detach(results);

        return results;
    }

    public List<ServiceRequests> findAllServiceRequests() {
        Session session = getSessionFactory().acquireSession();
        List<ServiceRequests> results = 
            (List<ServiceRequests>)session.executeQuery("findAllServiceRequests", ServiceRequests.class);session.release();
        // Uncomment the following lines of code if the results from this query will be mutated.
        // See SessionFactory.detach() for more information.
        // results = (java.util.List<oracle.srdemo.datamodel.ServiceRequests>)getSessionFactory().detach(results);

        return results;
    }

    public List<ServiceRequests> findServiceRequests(Integer filedBy, 
                                                     String status) {
        Session session = getSessionFactory().acquireSession();
        Vector params = new Vector(2);
        params.add(filedBy);
        params.add(status);
        List<ServiceRequests> results = 
            (List<ServiceRequests>)session.executeQuery("findServiceRequests", 
                                                        ServiceRequests.class, params);session.release();
        // Uncomment the following lines of code if the results from this query will be mutated.
        // See SessionFactory.detach() for more information.
        // results = (java.util.List<oracle.srdemo.datamodel.ServiceRequests>)getSessionFactory().detach(results);

        return results;
    }

    

    public List<Users> findAllUsers() {
        Session session = getSessionFactory().acquireSession();
        List<Users> results = (List<Users>)session.executeQuery("findAllUsers", Users.class);session.release();
        // Uncomment the following lines of code if the results from this query will be mutated.
        // See SessionFactory.detach() for more information.
        // results = (java.util.List<oracle.srdemo.datamodel.Users>)getSessionFactory().detach(results);

        return results;
    }

    

    public ServiceRequests createServiceRequests
        (String problemDescription, Integer productId, Integer createdBy) 
        { UnitOfWork uow = getSessionFactory().acquireUnitOfWork(); 
        ServiceRequests newInstance = (ServiceRequests)uow.newInstance(ServiceRequests.class); 
        Products product = (Products)uow.executeQuery("findProductById", Products.class, productId); 
        Users user = (Users)uow.executeQuery("findUserById", Users.class, createdBy); 
        product.addServiceRequests(newInstance); 
        user.addCreatedBy(newInstance); 
        newInstance.setStatus(null); 
        newInstance.setRequestDate(null); 
        newInstance.setProblemDescription(problemDescription); 
        uow.commit(); return newInstance; }


    public Users findUserByEmail(String emailParam) {
        Session session = getSessionFactory().acquireSession();
        Vector params = new Vector(1);
        params.add(emailParam);
        Users result = 
            (Users)session.executeQuery("findUserByEmail", Users.class, params);session.release();
        result = (Users)getSessionFactory().detach(result);

        return result;
    }

    public Products findProductById(Integer prodId) {
        Session session = getSessionFactory().acquireSession();
        Vector params = new Vector(1);
        params.add(prodId);
        Products result = 
            (Products)session.executeQuery("findProductById", Products.class, params);session.release();
        result = (Products)getSessionFactory().detach(result);

        return result;
    }

    public ServiceRequests findServiceRequestById(Integer findSvrId) {
        Session session = getSessionFactory().acquireSession();
        Vector params = new Vector(1);
        params.add(findSvrId);
        ServiceRequests result = 
            (ServiceRequests)session.executeQuery("findServiceRequestById", 
                                                  ServiceRequests.class, params);session.release();
        result = (ServiceRequests)getSessionFactory().detach(result);

        return result;
    }

    public Users findUserById(Integer createdBy) {
        Session session = getSessionFactory().acquireSession();
        Vector params = new Vector(1);
        params.add(createdBy);
        Users result = (Users)session.executeQuery("findUserById", Users.class, params);session.release();
        result = (Users)getSessionFactory().detach(result);

        return result;
    }
}
