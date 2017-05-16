package oracle.srdemo.view.menu;

import java.beans.IntrospectionException;

import java.io.Serializable;

import oracle.adf.view.faces.model.MenuModel;
import oracle.adf.view.faces.model.ProcessMenuModel;

/**
 * Holds the various nodes in a processTrain
 * $Id: TrainModelAdapter.java,v 1.1 2005/11/10 10:30:18 duncan Exp $
 */
public class TrainModelAdapter implements Serializable {
    private String _propertyName = null;
    private Object _instance = null;
    private transient MenuModel _model = null;
    private Object _maxPathKey = null;

    public MenuModel getModel() throws IntrospectionException {
        if (_model == null)
        {
          _model = new ProcessMenuModel(getInstance(), 
                                        getViewIdProperty(),
                                        getMaxPathKey());
        }
        return _model;
    }

    public String getViewIdProperty() {
        return _propertyName;
    }

    /**
     * Sets the property to use to get at view id
     * @param propertyName
     */
    public void setViewIdProperty(String propertyName) {
        _propertyName = propertyName;
        _model = null;
    }

    public Object getInstance() {
        return _instance;
    }

    /**
     * Sets the treeModel
     * @param instance must be something that can be converted into a TreeModel
     */
    public void setInstance(Object instance) {
        _instance = instance;
        _model = null;
    }
    

    public Object getMaxPathKey()
    {
      return _maxPathKey;
    }

    public void setMaxPathKey(Object maxPathKey)
    {
      _maxPathKey = maxPathKey;
    } 
}
