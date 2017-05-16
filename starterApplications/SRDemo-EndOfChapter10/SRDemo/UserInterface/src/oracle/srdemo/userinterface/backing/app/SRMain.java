package oracle.srdemo.userinterface.backing.app;

import javax.faces.component.UIParameter;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputFormat;

import javax.faces.context.FacesContext;

import oracle.adf.view.faces.component.core.data.CoreColumn;
import oracle.adf.view.faces.component.core.data.CoreTable;
import oracle.adf.view.faces.component.core.input.CoreInputText;
import oracle.adf.view.faces.component.core.input.CoreSelectInputDate;
import oracle.adf.view.faces.component.core.layout.CorePanelForm;
import oracle.adf.view.faces.component.core.layout.CorePanelLabelAndMessage;
import oracle.adf.view.faces.component.core.layout.CorePanelPage;
import oracle.adf.view.faces.component.core.nav.CoreCommandButton;
import oracle.adf.view.faces.component.core.nav.CoreCommandLink;
import oracle.adf.view.faces.component.core.output.CoreMessages;
import oracle.adf.view.faces.component.core.output.CoreOutputText;
import oracle.adf.view.faces.component.html.HtmlBody;
import oracle.adf.view.faces.component.html.HtmlHead;
import oracle.adf.view.faces.component.html.HtmlHtml;
import oracle.adf.view.faces.component.html.HtmlRowLayout;
import oracle.adf.view.faces.component.html.HtmlTableLayout;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.srdemo.view.UserInfo;
import oracle.srdemo.view.util.ADFUtils;
import oracle.srdemo.view.util.JSFUtils;


public class SRMain {


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
    private HtmlTableLayout tableLayout1;
    private HtmlRowLayout rowLayout1;
    private HtmlRowLayout rowLayout2;
    private HtmlRowLayout rowLayout3;
    private CoreMessages messages1;
    private CorePanelForm panelForm1;
    private CorePanelLabelAndMessage panelLabelAndMessage1;
    private CoreOutputText outputText2;
    private CorePanelLabelAndMessage panelLabelAndMessage2;
    private CoreOutputText outputText3;
    private CorePanelLabelAndMessage panelLabelAndMessage3;
    private CoreOutputText outputText4;
    private CorePanelLabelAndMessage panelLabelAndMessage4;
    private CoreOutputText outputText5;
    private CoreInputText inputText1;
    private CorePanelForm panelForm2;
    private CoreInputText inputText2;
    private CoreInputText inputText3;
    private CoreInputText inputText4;
    private CoreSelectInputDate selectInputDate1;
    private CoreInputText inputText5;
    private CoreCommandButton addNoteButton;
    private BindingContainer bindings;
    private CoreTable table1;
    private CoreColumn column4;
    private CoreOutputText outputText9;
    private CoreColumn column3;
    private CoreOutputText outputText8;
    private CoreColumn column5;
    private CoreOutputText outputText10;

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

    public void setTableLayout1(HtmlTableLayout tableLayout1) {
        this.tableLayout1 = tableLayout1;
    }

    public HtmlTableLayout getTableLayout1() {
        return tableLayout1;
    }

    public void setRowLayout1(HtmlRowLayout rowLayout1) {
        this.rowLayout1 = rowLayout1;
    }

    public HtmlRowLayout getRowLayout1() {
        return rowLayout1;
    }


    public void setRowLayout2(HtmlRowLayout rowLayout2) {
        this.rowLayout2 = rowLayout2;
    }

    public HtmlRowLayout getRowLayout2() {
        return rowLayout2;
    }

    public void setRowLayout3(HtmlRowLayout rowLayout3) {
        this.rowLayout3 = rowLayout3;
    }

    public HtmlRowLayout getRowLayout3() {
        return rowLayout3;
    }

    public void setMessages1(CoreMessages messages1) {
        this.messages1 = messages1;
    }

    public CoreMessages getMessages1() {
        return messages1;
    }

    public void setPanelForm1(CorePanelForm panelForm1) {
        this.panelForm1 = panelForm1;
    }

    public CorePanelForm getPanelForm1() {
        return panelForm1;
    }

    public void setPanelLabelAndMessage1(CorePanelLabelAndMessage panelLabelAndMessage1) {
        this.panelLabelAndMessage1 = panelLabelAndMessage1;
    }

    public CorePanelLabelAndMessage getPanelLabelAndMessage1() {
        return panelLabelAndMessage1;
    }

    public void setOutputText2(CoreOutputText outputText2) {
        this.outputText2 = outputText2;
    }

    public CoreOutputText getOutputText2() {
        return outputText2;
    }


    public void setPanelLabelAndMessage2(CorePanelLabelAndMessage panelLabelAndMessage2) {
        this.panelLabelAndMessage2 = panelLabelAndMessage2;
    }

    public CorePanelLabelAndMessage getPanelLabelAndMessage2() {
        return panelLabelAndMessage2;
    }

    public void setOutputText3(CoreOutputText outputText3) {
        this.outputText3 = outputText3;
    }

    public CoreOutputText getOutputText3() {
        return outputText3;
    }

    public void setPanelLabelAndMessage3(CorePanelLabelAndMessage panelLabelAndMessage3) {
        this.panelLabelAndMessage3 = panelLabelAndMessage3;
    }

    public CorePanelLabelAndMessage getPanelLabelAndMessage3() {
        return panelLabelAndMessage3;
    }

    public void setOutputText4(CoreOutputText outputText4) {
        this.outputText4 = outputText4;
    }

    public CoreOutputText getOutputText4() {
        return outputText4;
    }


    public void setPanelLabelAndMessage4(CorePanelLabelAndMessage panelLabelAndMessage4) {
        this.panelLabelAndMessage4 = panelLabelAndMessage4;
    }

    public CorePanelLabelAndMessage getPanelLabelAndMessage4() {
        return panelLabelAndMessage4;
    }

    public void setOutputText5(CoreOutputText outputText5) {
        this.outputText5 = outputText5;
    }

    public CoreOutputText getOutputText5() {
        return outputText5;
    }

    public void setInputText1(CoreInputText inputText1) {
        this.inputText1 = inputText1;
    }

    public CoreInputText getInputText1() {
        return inputText1;
    }

    public void setPanelForm2(CorePanelForm panelForm2) {
        this.panelForm2 = panelForm2;
    }

    public CorePanelForm getPanelForm2() {
        return panelForm2;
    }

    public void setInputText2(CoreInputText inputText2) {
        this.inputText2 = inputText2;
    }

    public CoreInputText getInputText2() {
        return inputText2;
    }

    public void setInputText3(CoreInputText inputText3) {
        this.inputText3 = inputText3;
    }

    public CoreInputText getInputText3() {
        return inputText3;
    }

    public void setInputText4(CoreInputText inputText4) {
        this.inputText4 = inputText4;
    }

    public CoreInputText getInputText4() {
        return inputText4;
    }

    public void setSelectInputDate1(CoreSelectInputDate selectInputDate1) {
        this.selectInputDate1 = selectInputDate1;
    }

    public CoreSelectInputDate getSelectInputDate1() {
        return selectInputDate1;
    }

    public void setInputText5(CoreInputText inputText5) {
        this.inputText5 = inputText5;
    }

    public CoreInputText getInputText5() {
        return inputText5;
    }

    public void setAddNoteButton(CoreCommandButton commandButton1) {
        this.addNoteButton = commandButton1;
    }

    public CoreCommandButton getAddNoteButton() {
        return addNoteButton;
    }

    public BindingContainer getBindings() {
        return this.bindings;
    }

    public void setBindings(BindingContainer bindings) {
        this.bindings = bindings;
    }

    public String addNoteButton_action() {
    
        // START CUSTOM CODE TO SET SVHTYPE 

        FacesContext ctx = FacesContext.getCurrentInstance();
        String callType = "Customer";
        UserInfo user = 
            (UserInfo)JSFUtils.getManagedBeanValue(ctx, "userInfo");
            if (user.isStaff()) {
                callType = "Technician";
            }
        ADFUtils.setPageBoundAttributeValue(getBindings(),"svhType", callType);

    
    
    
    
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = 
            bindings.getOperationBinding("persistEntity");
        Object result = operationBinding.execute();
        
        //now re-execute the iterator to refresh the screen
        OperationBinding requery =
           bindings.getOperationBinding("findServiceRequestById");
        requery.execute();

        
        
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void setTable1(CoreTable table1) {
        this.table1 = table1;
    }

    public CoreTable getTable1() {
        return table1;
    }


    public void setColumn4(CoreColumn column4) {
        this.column4 = column4;
    }

    public CoreColumn getColumn4() {
        return column4;
    }

    public void setOutputText9(CoreOutputText outputText9) {
        this.outputText9 = outputText9;
    }

    public CoreOutputText getOutputText9() {
        return outputText9;
    }


    public void setColumn3(CoreColumn column3) {
        this.column3 = column3;
    }

    public CoreColumn getColumn3() {
        return column3;
    }

    public void setOutputText8(CoreOutputText outputText8) {
        this.outputText8 = outputText8;
    }

    public CoreOutputText getOutputText8() {
        return outputText8;
    }

    public void setColumn5(CoreColumn column5) {
        this.column5 = column5;
    }

    public CoreColumn getColumn5() {
        return column5;
    }

    public void setOutputText10(CoreOutputText outputText10) {
        this.outputText10 = outputText10;
    }

    public CoreOutputText getOutputText10() {
        return outputText10;
    }
}
