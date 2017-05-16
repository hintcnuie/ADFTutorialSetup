package oracle.srdemo.view.menu;

import java.util.List;

import oracle.adf.view.faces.component.core.nav.CoreCommandMenuItem;

/**
 * MenuItem is a simple bean that represents an item that will appear as a tab or subtab
 * in the SRDemo menu system. Menu Items are all configured through faces-config.xml
 * and hence setter injection
 * $Id: MenuItem.java,v 1.1 2005/10/20 06:45:43 duncan Exp $
 */
public class MenuItem {
    private String _label          = null;
    private String _outcome        = null;
    private String _viewId         = null;
    private String _destination    = null;
    private String _icon           = null;
    private String _type           = CoreCommandMenuItem.TYPE_DEFAULT;
    private List   _children       = null;
    
    //extended security attributes
    private boolean _readOnly = false;
    private boolean _shown = true; 

    public void setLabel(String label) {
        this._label = label;
    }

    /**
     * ToDo - return the looked up value of this String from the resource
     * bundle.
     * @return
     */
    public String getLabel() {
        return _label;
    }

    public void setOutcome(String outcome) {
        this._outcome = outcome;
    }

    public String getOutcome() {
        return _outcome;
    }

    public void setViewId(String viewId) {
        this._viewId = viewId;
    }

    public String getViewId() {
        return _viewId;
    }

    public void setDestination(String destination) {
        this._destination = destination;
    }

    public String getDestination() {
        return _destination;
    }

    public void setIcon(String icon) {
        this._icon = icon;
    }

    public String getIcon() {
        return _icon;
    }
    
    public String getIco() {
        return _icon;
    }    

    public void setType(String type) {
        this._type = type;
    }

    public String getType() {
        return _type;
    }

    public void setChildren(List children) {
        this._children = children;
    }

    public List getChildren() {
        return _children;
    }

    public void setReadOnly(boolean readOnly) {
        this._readOnly = readOnly;
    }

    public boolean isReadOnly() {
        return _readOnly;
    }

    public void setShown(boolean shown) {
        this._shown = shown;
    }

    public boolean isShown() {
        return _shown;
    }
}
