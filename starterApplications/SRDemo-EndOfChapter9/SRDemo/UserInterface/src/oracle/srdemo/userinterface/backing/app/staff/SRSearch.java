package oracle.srdemo.userinterface.backing.app.staff;

import javax.faces.component.UIParameter;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputFormat;

import javax.faces.context.FacesContext;

import oracle.adf.view.faces.component.core.data.CoreColumn;
import oracle.adf.view.faces.component.core.data.CoreTable;
import oracle.adf.view.faces.component.core.data.CoreTableSelectOne;
import oracle.adf.view.faces.component.core.input.CoreInputText;
import oracle.adf.view.faces.component.core.layout.CorePanelBox;
import oracle.adf.view.faces.component.core.layout.CorePanelForm;
import oracle.adf.view.faces.component.core.layout.CorePanelPage;
import oracle.adf.view.faces.component.core.nav.CoreCommandButton;
import oracle.adf.view.faces.component.core.nav.CoreCommandLink;
import oracle.adf.view.faces.component.core.output.CoreMessages;
import oracle.adf.view.faces.component.core.output.CoreOutputText;
import oracle.adf.view.faces.component.html.HtmlBody;
import oracle.adf.view.faces.component.html.HtmlHead;
import oracle.adf.view.faces.component.html.HtmlHtml;

import oracle.binding.BindingContainer;

import oracle.jbo.uicli.binding.JUCtrlValueBindingRef;

import oracle.srdemo.view.UserSystemState;


public class SRSearch {


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
    private CorePanelBox panelBox1;
    private CorePanelForm panelForm1;
    private CoreInputText inputText1;
    private CoreInputText inputText2;
    private CoreCommandButton commandButton1;
    private CoreMessages messages1;
    private CoreTable srtable;
    private CoreColumn column1;
    private CoreOutputText outputText2;
    private CoreTableSelectOne tableSelectOne1;
    private CoreColumn column5;
    private CoreOutputText outputText6;
    private CoreColumn column2;
    private CoreOutputText outputText3;
    private CoreColumn column4;
    private CoreOutputText outputText5;
    private CoreColumn column3;
    private CoreOutputText outputText4;
    private CoreCommandButton editButton;
    private CoreCommandButton viewButton;
    
    private BindingContainer bindings;

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

    public void setPanelBox1(CorePanelBox panelBox1) {
        this.panelBox1 = panelBox1;
    }

    public CorePanelBox getPanelBox1() {
        return panelBox1;
    }

    public void setPanelForm1(CorePanelForm panelForm1) {
        this.panelForm1 = panelForm1;
    }

    public CorePanelForm getPanelForm1() {
        return panelForm1;
    }

    public void setInputText1(CoreInputText inputText1) {
        this.inputText1 = inputText1;
    }

    public CoreInputText getInputText1() {
        return inputText1;
    }

    public void setInputText2(CoreInputText inputText2) {
        this.inputText2 = inputText2;
    }

    public CoreInputText getInputText2() {
        return inputText2;
    }

    public void setCommandButton1(CoreCommandButton commandButton1) {
        this.commandButton1 = commandButton1;
    }

    public CoreCommandButton getCommandButton1() {
        return commandButton1;
    }

    public void setMessages1(CoreMessages messages1) {
        this.messages1 = messages1;
    }

    public CoreMessages getMessages1() {
        return messages1;
    }

    public void setSrtable(CoreTable table1) {
        this.srtable = table1;
    }

    public CoreTable getSrtable() {
        return srtable;
    }

    public void setColumn1(CoreColumn column1) {
        this.column1 = column1;
    }

    public CoreColumn getColumn1() {
        return column1;
    }

    public void setOutputText2(CoreOutputText outputText2) {
        this.outputText2 = outputText2;
    }

    public CoreOutputText getOutputText2() {
        return outputText2;
    }


    public void setTableSelectOne1(CoreTableSelectOne tableSelectOne1) {
        this.tableSelectOne1 = tableSelectOne1;
    }

    public CoreTableSelectOne getTableSelectOne1() {
        return tableSelectOne1;
    }


    public void setColumn5(CoreColumn column5) {
        this.column5 = column5;
    }

    public CoreColumn getColumn5() {
        return column5;
    }

    public void setOutputText6(CoreOutputText outputText6) {
        this.outputText6 = outputText6;
    }

    public CoreOutputText getOutputText6() {
        return outputText6;
    }

    public void setColumn2(CoreColumn column2) {
        this.column2 = column2;
    }

    public CoreColumn getColumn2() {
        return column2;
    }

    public void setOutputText3(CoreOutputText outputText3) {
        this.outputText3 = outputText3;
    }

    public CoreOutputText getOutputText3() {
        return outputText3;
    }

    public void setColumn4(CoreColumn column4) {
        this.column4 = column4;
    }

    public CoreColumn getColumn4() {
        return column4;
    }

    public void setOutputText5(CoreOutputText outputText5) {
        this.outputText5 = outputText5;
    }

    public CoreOutputText getOutputText5() {
        return outputText5;
    }

    public void setColumn3(CoreColumn column3) {
        this.column3 = column3;
    }

    public CoreColumn getColumn3() {
        return column3;
    }

    public void setOutputText4(CoreOutputText outputText4) {
        this.outputText4 = outputText4;
    }

    public CoreOutputText getOutputText4() {
        return outputText4;
    }

    public void setEditButton(CoreCommandButton commandButton2) {
        this.editButton = commandButton2;
    }

    public CoreCommandButton getEditButton() {
        return editButton;
    }

    public void setViewButton(CoreCommandButton commandButton3) {
        this.viewButton = commandButton3;
    }

    public CoreCommandButton getViewButton() {
        return viewButton;
    }

    public String editButton_action() {
        setCurrentSvrIdFromRow();
        return "edit";
    }

    private void setCurrentSvrIdFromRow() {
        FacesContext ctx = FacesContext.getCurrentInstance();
              JUCtrlValueBindingRef tableRowRef =
              (JUCtrlValueBindingRef) this.getSrtable().getRowData();

        Integer svrId = 
        (Integer)tableRowRef.getRow().getAttribute("svrId");

              UserSystemState.storeCurrentSvrID(svrId);

        //Store away where we want to come back to
        UserSystemState.storeReturnNavigationRule
        ("GlobalHome");

    }

    public void setBindings(BindingContainer bindings) {
        this.bindings = bindings;
    }

    public BindingContainer getBindings() {
        return bindings;
    }

    public String viewButton_action() {
        // Add event code here...
        return drillDown_action();
    }

    private String drillDown_action() {
        setCurrentSvrIdFromRow();
        return "view";

    }
}
