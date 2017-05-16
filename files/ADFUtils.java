package oracle.srdemo.view.util;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCParameter;
import oracle.adf.model.AttributeBinding;
import oracle.adf.model.BindingContext;
import oracle.binding.BindingContainer;
import java.lang.StringBuffer;



/**
 * A series of convenience functions for dealing with ADF Bindings
 * $Id: ADFUtils.java,v 1.1 2005/11/30 10:34:00 duncan Exp $
 */
public class ADFUtils {
          
    /**
     * Returns the evaluated value of a pageDef parameter
     * @param bindings reference to the page's binding container, usually obtained using getBindings()
     * @param parameterName name of the pagedef parameter
     * @return evaluated value of the parameter as a String
     */
    public static Object getPageDefParameterValue(BindingContainer bindings, String parameterName) {
        DCParameter param = ((DCBindingContainer)bindings).findParameter(parameterName);
        return param.getValue();
    }
    
    /**
     * Returns the evaluated value of a pageDef parameter
     * @param bindings reference to the current BindingContainer
     * @param pageDefName reference to the page definition file of the page with the parameter
     * @param parameterName name of the pagedef parameter
     * @return evaluated value of the parameter as a String
     */
    public static Object getPageDefParameterValue(BindingContainer bindings, String pageDefName, String parameterName) {
        BindingContainer paramBC = findBindingContainer(bindings,pageDefName);
        return getPageDefParameterValue(paramBC,parameterName);
    }
    
    public static void setPageBoundAttributeValue(BindingContainer bindings, String attributeName, Object value) {
        AttributeBinding binding = (AttributeBinding)bindings.getControlBinding(attributeName);
        binding.setInputValue(value);
    }
    
    public static void setPageBoundAttributeValue(BindingContainer bindings, String pageDefName, String attributeName, Object value) {
        BindingContainer remoteBC = findBindingContainer(bindings,pageDefName);
        setPageBoundAttributeValue(remoteBC,attributeName,value);
    }    
    
    private static String wrapInEL(String rawValue){
        StringBuffer buff = new StringBuffer("${'");
        buff.append(rawValue);
        buff.append("'}"); 
        return buff.toString();
    }

    /**
     * @param bindings
     * @param pageDefName name of the page defintion XML file to use 
     * @return BindingContainer ref for the named definition
     */
    public static BindingContainer findBindingContainer(BindingContainer bindings, String pageDefName){
        BindingContext bctx = ((DCBindingContainer)bindings).getBindingContext();
        BindingContainer foundContainer = bctx.findBindingContainer(pageDefName);
        return foundContainer;
    }     
}
