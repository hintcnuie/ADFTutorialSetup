package oracle.srdemo.datamodel;

import oracle.toplink.indirection.ValueHolder;
import oracle.toplink.indirection.ValueHolderInterface;

public class ExpertiseAreas {

    /**Map products <-> oracle.srdemo.datamodel.Products
     * @associates <{oracle.srdemo.datamodel.Products}>
     */
    private ValueHolderInterface products;

    /**Map users <-> oracle.srdemo.datamodel.Users
     * @associates <{oracle.srdemo.datamodel.Users}>
     */
    private ValueHolderInterface users;
    private String expertiseLevel;
    private String notes;

    public ExpertiseAreas() {
        super();
        this.products = new ValueHolder();
        this.users = new ValueHolder();
    }

    public String getExpertiseLevel() {
        return this.expertiseLevel;
    }

    public String getNotes() {
        return this.notes;
    }



    public Products getProducts() {
        return (Products)this.products.getValue();
    }



    public Users getUsers() {
        return (Users)this.users.getValue();
    }

    public void setExpertiseLevel(String expertiseLevel) {
        this.expertiseLevel = expertiseLevel;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    public void setProducts(Products products) {
        this.products.setValue(products);
    }


    public void setUsers(Users users) {
        this.users.setValue(users);
    }

}
