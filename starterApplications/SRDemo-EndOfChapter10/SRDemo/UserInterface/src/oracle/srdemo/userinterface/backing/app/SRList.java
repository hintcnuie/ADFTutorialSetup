package oracle.srdemo.userinterface.backing.app;

import javax.faces.component.UIParameter;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlOutputFormat;

import javax.faces.context.FacesContext;

import oracle.adf.view.faces.component.core.data.CoreColumn;
import oracle.adf.view.faces.component.core.data.CoreTable;
import oracle.adf.view.faces.component.core.data.CoreTableSelectOne;
import oracle.adf.view.faces.component.core.layout.CorePanelPage;
import oracle.adf.view.faces.component.core.nav.CoreCommandButton;
import oracle.adf.view.faces.component.core.nav.CoreCommandLink;
import oracle.adf.view.faces.component.core.nav.CoreCommandMenuItem;
import oracle.adf.view.faces.component.core.nav.CoreMenuBar;
import oracle.adf.view.faces.component.core.output.CoreMessages;
import oracle.adf.view.faces.component.core.output.CoreOutputText;
import oracle.adf.view.faces.component.html.HtmlBody;
import oracle.adf.view.faces.component.html.HtmlHead;
import oracle.adf.view.faces.component.html.HtmlHtml;

import oracle.binding.BindingContainer;

import oracle.jbo.uicli.binding.JUCtrlValueBindingRef;

import oracle.srdemo.view.UserSystemState;


public class SRList {


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
    private CoreMessages messages1;
    private CoreTable srtable;
    private CoreColumn column1;
    private CoreColumn column2;
    private CoreOutputText outputText3;
    private CoreColumn column3;
    private CoreOutputText outputText4;
    private CoreColumn column4;
    private CoreOutputText outputText5;
    private CoreColumn column5;
    private CoreOutputText outputText6;
    private CoreTableSelectOne tableSelectOne1;
    private CoreCommandButton editButton;
    
    private BindingContainer bindings;
    private CoreCommandButton viewButton;
    private CoreMenuBar menuBar1;
    private CoreCommandMenuItem commandLink3;
    private CoreCommandMenuItem commandLink4;
    private CoreCommandMenuItem commandLink5;
    private CoreCommandMenuItem commandLink6;
    private CoreCommandMenuItem commandMenuItem1;
    private CoreCommandLink commandLink7;

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

    public void setTableSelectOne1(CoreTableSelectOne tableSelectOne1) {
        this.tableSelectOne1 = tableSelectOne1;
    }

    public CoreTableSelectOne getTableSelectOne1() {
        return tableSelectOne1;
    }

    public void setEditButton(CoreCommandButton commandButton1) {
        this.editButton = commandButton1;
    }

    public CoreCommandButton getEditButton() {
        return editButton;
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
        ("globalHome");

    }

    public void setBindings(BindingContainer bindings) {
        this.bindings = bindings;
    }

    public BindingContainer getBindings() {
        return bindings;
    }

    public void setViewButton(CoreCommandButton commandButton1) {
        this.viewButton = commandButton1;
    }

    public CoreCommandButton getViewButton() {
        return viewButton;
    }

    public String viewButton_action() {
        // Add event code here...
        return drillDown_action();
    }

    private String drillDown_action() {
        setCurrentSvrIdFromRow();
        return "view";

    }

    public void setMenuBar1(CoreMenuBar menuBar1) {
        this.menuBar1 = menuBar1;
    }

    public CoreMenuBar getMenuBar1() {
        return menuBar1;
    }


    public void setCommandLink3(CoreCommandMenuItem commandLink3) {
        this.commandLink3 = commandLink3;
    }

    public CoreCommandMenuItem getCommandLink3() {
        return commandLink3;
    }

    public void setCommandLink4(CoreCommandMenuItem commandLink4) {
        this.commandLink4 = commandLink4;
    }

    public CoreCommandMenuItem getCommandLink4() {
        return commandLink4;
    }

    public void setCommandLink5(CoreCommandMenuItem commandLink5) {
        this.commandLink5 = commandLink5;
    }

    public CoreCommandMenuItem getCommandLink5() {
        return commandLink5;
    }

    public void setCommandLink6(CoreCommandMenuItem commandLink6) {
        this.commandLink6 = commandLink6;
    }

    public CoreCommandMenuItem getCommandLink6() {
        return commandLink6;
    }

    public void setCommandMenuItem1(CoreCommandMenuItem commandMenuItem1) {
        this.commandMenuItem1 = commandMenuItem1;
    }

    public CoreCommandMenuItem getCommandMenuItem1() {
        return commandMenuItem1;
    }

    public void setCommandLink7(CoreCommandLink commandLink7) {
        this.commandLink7 = commandLink7;
    }

    public CoreCommandLink getCommandLink7() {
        return commandLink7;
    }
}
