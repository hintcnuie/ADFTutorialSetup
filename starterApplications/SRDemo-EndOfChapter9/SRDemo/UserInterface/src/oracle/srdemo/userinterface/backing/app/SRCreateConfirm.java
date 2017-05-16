package oracle.srdemo.userinterface.backing.app;

import javax.faces.component.UIParameter;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputFormat;

import javax.faces.context.ExternalContext;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;

import oracle.adf.view.faces.component.core.layout.CorePanelBox;
import oracle.adf.view.faces.component.core.layout.CorePanelButtonBar;
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
import oracle.binding.OperationBinding;

import oracle.srdemo.datamodel.ServiceRequests;


public class SRCreateConfirm {


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
    private CoreOutputFormatted outputFormatted1;
    private CoreObjectSpacer objectSpacer2;
    private CorePanelBox panelBox1;
    private CoreOutputFormatted outputFormatted2;
    private CoreOutputText outputText2;
    private CoreObjectSpacer objectSpacer4;
    private CorePanelBox panelBox11;
    private CoreOutputFormatted outputFormatted21;
    private CoreObjectSpacer objectSpacer31;
    private CoreOutputText outputText21;
    private CoreObjectSpacer objectSpacer5;
    private CorePanelBox panelBox111;
    private CoreOutputFormatted outputFormatted211;
    private CoreObjectSpacer objectSpacer311;
    private CoreOutputText outputText211;
    private CoreObjectSpacer objectSpacer6;
    private CorePanelButtonBar panelButtonBar1;
    private CoreCommandButton commandButton1;
    private CoreCommandButton commandButton2;
    private CoreMessages messages1;
    private CoreCommandButton saveButton;
    private BindingContainer bindings;
    private CoreObjectSpacer objectSpacer3;

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

    public void setCreateStepsTrain(CoreProcessTrain createStepsTrain) {
        this.createStepsTrain = createStepsTrain;
    }

    public CoreProcessTrain getCreateStepsTrain() {
        return createStepsTrain;
    }

    public void setTrainNode(CoreCommandMenuItem trainNode) {
        this.trainNode = trainNode;
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

    public void setOutputFormatted1(CoreOutputFormatted outputFormatted1) {
        this.outputFormatted1 = outputFormatted1;
    }

    public CoreOutputFormatted getOutputFormatted1() {
        return outputFormatted1;
    }

    public void setObjectSpacer2(CoreObjectSpacer objectSpacer2) {
        this.objectSpacer2 = objectSpacer2;
    }

    public CoreObjectSpacer getObjectSpacer2() {
        return objectSpacer2;
    }

    public void setPanelBox1(CorePanelBox panelBox1) {
        this.panelBox1 = panelBox1;
    }

    public CorePanelBox getPanelBox1() {
        return panelBox1;
    }

    public void setOutputFormatted2(CoreOutputFormatted outputFormatted2) {
        this.outputFormatted2 = outputFormatted2;
    }

    public CoreOutputFormatted getOutputFormatted2() {
        return outputFormatted2;
    }


    public void setOutputText2(CoreOutputText outputText2) {
        this.outputText2 = outputText2;
    }

    public CoreOutputText getOutputText2() {
        return outputText2;
    }

    public void setObjectSpacer4(CoreObjectSpacer objectSpacer4) {
        this.objectSpacer4 = objectSpacer4;
    }

    public CoreObjectSpacer getObjectSpacer4() {
        return objectSpacer4;
    }

    public void setPanelBox11(CorePanelBox panelBox11) {
        this.panelBox11 = panelBox11;
    }

    public CorePanelBox getPanelBox11() {
        return panelBox11;
    }

    public void setOutputFormatted21(CoreOutputFormatted outputFormatted21) {
        this.outputFormatted21 = outputFormatted21;
    }

    public CoreOutputFormatted getOutputFormatted21() {
        return outputFormatted21;
    }

    public void setObjectSpacer31(CoreObjectSpacer objectSpacer31) {
        this.objectSpacer31 = objectSpacer31;
    }

    public CoreObjectSpacer getObjectSpacer31() {
        return objectSpacer31;
    }

    public void setOutputText21(CoreOutputText outputText21) {
        this.outputText21 = outputText21;
    }

    public CoreOutputText getOutputText21() {
        return outputText21;
    }

    public void setObjectSpacer5(CoreObjectSpacer objectSpacer5) {
        this.objectSpacer5 = objectSpacer5;
    }

    public CoreObjectSpacer getObjectSpacer5() {
        return objectSpacer5;
    }

    public void setPanelBox111(CorePanelBox panelBox111) {
        this.panelBox111 = panelBox111;
    }

    public CorePanelBox getPanelBox111() {
        return panelBox111;
    }

    public void setOutputFormatted211(CoreOutputFormatted outputFormatted211) {
        this.outputFormatted211 = outputFormatted211;
    }

    public CoreOutputFormatted getOutputFormatted211() {
        return outputFormatted211;
    }

    public void setObjectSpacer311(CoreObjectSpacer objectSpacer311) {
        this.objectSpacer311 = objectSpacer311;
    }

    public CoreObjectSpacer getObjectSpacer311() {
        return objectSpacer311;
    }

    public void setOutputText211(CoreOutputText outputText211) {
        this.outputText211 = outputText211;
    }

    public CoreOutputText getOutputText211() {
        return outputText211;
    }

    public void setObjectSpacer6(CoreObjectSpacer objectSpacer6) {
        this.objectSpacer6 = objectSpacer6;
    }

    public CoreObjectSpacer getObjectSpacer6() {
        return objectSpacer6;
    }

    public void setPanelButtonBar1(CorePanelButtonBar panelButtonBar1) {
        this.panelButtonBar1 = panelButtonBar1;
    }

    public CorePanelButtonBar getPanelButtonBar1() {
        return panelButtonBar1;
    }

    public void setCommandButton1(CoreCommandButton commandButton1) {
        this.commandButton1 = commandButton1;
    }

    public CoreCommandButton getCommandButton1() {
        return commandButton1;
    }

    public void setCommandButton2(CoreCommandButton commandButton2) {
        this.commandButton2 = commandButton2;
    }

    public CoreCommandButton getCommandButton2() {
        return commandButton2;
    }

    public void setMessages1(CoreMessages messages1) {
        this.messages1 = messages1;
    }

    public CoreMessages getMessages1() {
        return messages1;
    }

    public void setSaveButton(CoreCommandButton commandButton3) {
        this.saveButton = commandButton3;
    }

    public CoreCommandButton getSaveButton() {
        return saveButton;
    }

    public BindingContainer getBindings() {
        return this.bindings;
    }

    public void setBindings(BindingContainer bindings) {
        this.bindings = bindings;
    }

    public String saveButton_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = 
            bindings.getOperationBinding("createServiceRequests");
        ServiceRequests result = (ServiceRequests)operationBinding.execute();
        Integer svrId = result.getSvrId();
        ExternalContext ectx =
              FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest)ectx.getRequest();
        request.setAttribute("SRDEMO_CREATED_SVRID",svrId);
        return "complete";
        }


    public void setObjectSpacer3(CoreObjectSpacer objectSpacer3) {
        this.objectSpacer3 = objectSpacer3;
    }

    public CoreObjectSpacer getObjectSpacer3() {
        return objectSpacer3;
    }
}
