package oracle.srdemo.userinterface.backing.app;

import javax.faces.component.UIParameter;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputFormat;

import oracle.adf.model.AttributeBinding;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.faces.component.core.input.CoreInputText;
import oracle.adf.view.faces.component.core.input.CoreSelectOneListbox;
import oracle.adf.view.faces.component.core.layout.CorePanelButtonBar;
import oracle.adf.view.faces.component.core.layout.CorePanelForm;
import oracle.adf.view.faces.component.core.layout.CorePanelHorizontal;
import oracle.adf.view.faces.component.core.layout.CorePanelPage;
import oracle.adf.view.faces.component.core.nav.CoreCommandButton;
import oracle.adf.view.faces.component.core.nav.CoreCommandLink;
import oracle.adf.view.faces.component.core.nav.CoreCommandMenuItem;
import oracle.adf.view.faces.component.core.nav.CoreProcessTrain;
import oracle.adf.view.faces.component.core.output.CoreMessages;
import oracle.adf.view.faces.component.core.output.CoreObjectSpacer;
import oracle.adf.view.faces.component.core.output.CoreOutputFormatted;
import oracle.adf.view.faces.component.core.output.CoreOutputText;
import oracle.adf.view.faces.component.html.HtmlBody;
import oracle.adf.view.faces.component.html.HtmlHead;
import oracle.adf.view.faces.component.html.HtmlHtml;
import oracle.binding.BindingContainer;

import oracle.srdemo.view.util.ADFUtils;


public class SRCreate {


    private HtmlHtml html1;
    private HtmlHead head1;
    private HtmlBody body1;
    private HtmlForm form1;
    private CorePanelPage panelPage1;
    private HtmlGraphicImage graphicImage1;
    private CoreOutputText outputText1;
    private CoreCommandLink commandLink1;
    private CoreCommandLink commandLink2;
    private HtmlOutputFormat outputFormat1;
    private UIParameter param1;
    private CoreProcessTrain createStepsTrain;
    private CoreCommandMenuItem trainNode;
    private CoreObjectSpacer objectSpacer1;
    private CorePanelHorizontal panelHorizontal1;
    private CoreOutputText outputText2;
    private CoreCommandLink commandLink3;
    private CoreObjectSpacer objectSpacer2;
    private CoreObjectSpacer objectSpacer3;
    private CoreOutputFormatted outputFormatted1;
    private CoreObjectSpacer objectSpacer4;
    private CorePanelForm panelForm1;
    private CoreMessages messages1;
    private CoreSelectOneListbox navList1;
    private UISelectItems selectItems1;
    private CoreInputText inputText1;
    private CorePanelButtonBar panelButtonBar1;
    private CoreCommandButton cancelButton;
    private CoreCommandButton commandButton1;
    
    private BindingContainer bindings;
    public BindingContainer getBindings() {
        return this.bindings;}
    public void setBindings(BindingContainer bindings) {
           this.bindings = bindings;}


    public void setHtml1(HtmlHtml html1) {
        this.html1 = html1;
    }

    public HtmlHtml getHtml1() {
        return html1;
    }

    public void setHead1(HtmlHead head1) {
        this.head1 = head1;
    }

    public HtmlHead getHead1() {
        return head1;
    }

    public void setBody1(HtmlBody body1) {
        this.body1 = body1;
    }

    public HtmlBody getBody1() {
        return body1;
    }

    public void setForm1(HtmlForm form1) {
        this.form1 = form1;
    }

    public HtmlForm getForm1() {
        return form1;
    }

    public void setPanelPage1(CorePanelPage panelPage1) {
        this.panelPage1 = panelPage1;
    }

    public CorePanelPage getPanelPage1() {
        return panelPage1;
    }

    public void setGraphicImage1(HtmlGraphicImage graphicImage1) {
        this.graphicImage1 = graphicImage1;
    }

    public HtmlGraphicImage getGraphicImage1() {
        return graphicImage1;
    }

    public void setOutputText1(CoreOutputText outputText1) {
        this.outputText1 = outputText1;
    }

    public CoreOutputText getOutputText1() {
        return outputText1;
    }

    public void setCommandLink1(CoreCommandLink commandLink1) {
        this.commandLink1 = commandLink1;
    }

    public CoreCommandLink getCommandLink1() {
        return commandLink1;
    }

    public void setCommandLink2(CoreCommandLink commandLink2) {
        this.commandLink2 = commandLink2;
    }

    public CoreCommandLink getCommandLink2() {
        return commandLink2;
    }

    public void setOutputFormat1(HtmlOutputFormat outputFormat1) {
        this.outputFormat1 = outputFormat1;
    }

    public HtmlOutputFormat getOutputFormat1() {
        return outputFormat1;
    }

    public void setParam1(UIParameter param1) {
        this.param1 = param1;
    }

    public UIParameter getParam1() {
        return param1;
    }

    public void setCreateStepsTrain(CoreProcessTrain processTrain1) {
        this.createStepsTrain = processTrain1;
    }

    public CoreProcessTrain getCreateStepsTrain() {
        return createStepsTrain;
    }

    public void setTrainNode(CoreCommandMenuItem commandMenuItem1) {
        this.trainNode = commandMenuItem1;
    }

    public CoreCommandMenuItem getTrainNode() {
        return trainNode;
    }

    public void setObjectSpacer1(CoreObjectSpacer objectSpacer1) {
        this.objectSpacer1 = objectSpacer1;
    }

    public CoreObjectSpacer getObjectSpacer1() {
        return objectSpacer1;
    }

    public void setPanelHorizontal1(CorePanelHorizontal panelHorizontal1) {
        this.panelHorizontal1 = panelHorizontal1;
    }

    public CorePanelHorizontal getPanelHorizontal1() {
        return panelHorizontal1;
    }

    public void setOutputText2(CoreOutputText outputText2) {
        this.outputText2 = outputText2;
    }

    public CoreOutputText getOutputText2() {
        return outputText2;
    }

    public void setCommandLink3(CoreCommandLink commandLink3) {
        this.commandLink3 = commandLink3;
    }

    public CoreCommandLink getCommandLink3() {
        return commandLink3;
    }

    public void setObjectSpacer2(CoreObjectSpacer objectSpacer2) {
        this.objectSpacer2 = objectSpacer2;
    }

    public CoreObjectSpacer getObjectSpacer2() {
        return objectSpacer2;
    }

    public void setObjectSpacer3(CoreObjectSpacer objectSpacer3) {
        this.objectSpacer3 = objectSpacer3;
    }

    public CoreObjectSpacer getObjectSpacer3() {
        return objectSpacer3;
    }

    public void setOutputFormatted1(CoreOutputFormatted outputFormatted1) {
        this.outputFormatted1 = outputFormatted1;
    }

    public CoreOutputFormatted getOutputFormatted1() {
        return outputFormatted1;
    }

    public void setObjectSpacer4(CoreObjectSpacer objectSpacer4) {
        this.objectSpacer4 = objectSpacer4;
    }

    public CoreObjectSpacer getObjectSpacer4() {
        return objectSpacer4;
    }

    public void setPanelForm1(CorePanelForm panelForm1) {
        this.panelForm1 = panelForm1;
    }

    public CorePanelForm getPanelForm1() {
        return panelForm1;
    }


    public void setMessages1(CoreMessages messages1) {
        this.messages1 = messages1;
    }

    public CoreMessages getMessages1() {
        return messages1;
    }


    public void setNavList1(CoreSelectOneListbox navList1) {
        this.navList1 = navList1;
    }

    public CoreSelectOneListbox getNavList1() {
        return navList1;
    }

    public void setSelectItems1(UISelectItems selectItems1) {
        this.selectItems1 = selectItems1;
    }

    public UISelectItems getSelectItems1() {
        return selectItems1;
    }

    public void setInputText1(CoreInputText inputText1) {
        this.inputText1 = inputText1;
    }

    public CoreInputText getInputText1() {
        return inputText1;
    }

    public void setPanelButtonBar1(CorePanelButtonBar panelButtonBar1) {
        this.panelButtonBar1 = panelButtonBar1;
    }

    public CorePanelButtonBar getPanelButtonBar1() {
        return panelButtonBar1;
    }

    public void setCancelButton(CoreCommandButton commandButton1) {
        this.cancelButton = commandButton1;
    }

    public CoreCommandButton getCancelButton() {
        return cancelButton;
    }

    public void setCommandButton1(CoreCommandButton commandButton1) {
        this.commandButton1 = commandButton1;
    }

    public CoreCommandButton getCommandButton1() {
        return commandButton1;
    }

    public String cancelButton_action() {
    /*
    This action is actually reused from two pages, so we just need to ensure that we use the correct binding container reference.
    */
    DCBindingContainer dcBindings = (DCBindingContainer)ADFUtils.findBindingContainer(getBindings(),
       "app_SRCreatePageDef"); 
    /*
    Reset the product list to the first item:
    */
    DCIteratorBinding productsIter = dcBindings.findIteratorBinding("findAllProductsIter");
    productsIter.setCurrentRowIndexInRange(0);
    /*
    Clean out the description field:
    */
    AttributeBinding problem = 
        (AttributeBinding)dcBindings.getControlBinding
    ("problemDescription");
    problem.setInputValue(null);
    /*
    Navigate back to the list page
    */
    return "GlobalHome";
    }
}
