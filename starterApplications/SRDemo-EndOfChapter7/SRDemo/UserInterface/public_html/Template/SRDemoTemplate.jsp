<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces" prefix="af"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces/html" prefix="afh"%>
<f:view>
  <afh:html>
    <f:loadBundle basename="UIResources" var="res"/>
    <afh:head title="SRDemoTemplate">
      <meta http-equiv="Content-Type"
            content="text/html; charset=windows-1252"/>
    </afh:head>
    <afh:body>
      <h:form>
        <af:panelPage title="Change me">
          <f:facet name="menu1"/>
          <f:facet name="menuGlobal"/>
          <f:facet name="branding">
            <h:graphicImage height="69" width="340"
                            url="../images/SRBranding.gif"/>
          </f:facet>
          <f:facet name="brandingApp"/>
          <f:facet name="appCopyright">
            <af:outputText value="#{res[\'srdemo.copyright\']}" escape="false"/>
          </f:facet>
          <f:facet name="appPrivacy">
            <af:commandLink text="#{res[\'srdemo.contact\']}"
                            action="dialog:globalContact"/>
          </f:facet>
          <f:facet name="appAbout">
            <af:commandLink text="#{res[\'srdemo.about\']}" immediate="true"/>
          </f:facet>
          <f:facet name="infoUser">
            <h:outputFormat value="#{res[\'srdemo.connectedUser\']}"
                            rendered="#{userInfo.authenticated}">
              <f:param value="#{userInfo.userName}"/>
            </h:outputFormat>
          </f:facet>
        </af:panelPage>
      </h:form>
    </afh:body>
  </afh:html>
</f:view>