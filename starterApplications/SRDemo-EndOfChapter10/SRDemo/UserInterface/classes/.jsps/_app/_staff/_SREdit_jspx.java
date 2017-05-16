package _app._staff;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SREdit_jspx extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _SREdit_jspx page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" SYSTEM \"http://www.w3.org/TR/html4/loose.dtd\" >" );
      {
        com.sun.faces.taglib.jsf_core.ViewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.ViewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ViewTag.class,"com.sun.faces.taglib.jsf_core.ViewTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            {
              oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag __jsp_taghandler_2=(oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag id binding");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setId("html1");
              __jsp_taghandler_2.setBinding("#{backing_app_staff_SREdit.html1}");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                {
                  com.sun.faces.taglib.jsf_core.LoadBundleTag __jsp_taghandler_3=(com.sun.faces.taglib.jsf_core.LoadBundleTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.LoadBundleTag.class,"com.sun.faces.taglib.jsf_core.LoadBundleTag basename var");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_3.setBasename("UIResources");
                  __jsp_taghandler_3.setVar("res");
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                }
                {
                  oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag __jsp_taghandler_4=(oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag id title binding");
                  __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_4.setId("head1");
                  __jsp_taghandler_4.setTitle("#{res['srdemo.browserTitle']}");
                  __jsp_taghandler_4.setBinding("#{backing_app_staff_SREdit.head1}");
                  __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    out.write( "<meta"+ " http-equiv=\"" + "Content-Type"+ "\"" + " content=\"" + "text/html; charset=windows-1252"+ "\"" +"/>");
                  }
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                }
                {
                  oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag __jsp_taghandler_5=(oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag id binding");
                  __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_5.setId("body1");
                  __jsp_taghandler_5.setBinding("#{backing_app_staff_SREdit.body1}");
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    {
                      oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag __jsp_taghandler_6=(oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag id binding");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setId("messages1");
                      __jsp_taghandler_6.setBinding("#{backing_app_staff_SREdit.messages1}");
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                    }
                    {
                      com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag id binding");
                      __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_7.setId("form1");
                      __jsp_taghandler_7.setBinding("#{backing_app_staff_SREdit.form1}");
                      __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        {
                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag __jsp_taghandler_8=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag id title binding");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_8.setId("panelPage1");
                          __jsp_taghandler_8.setTitle("#{res['sredit.pageTitle']}");
                          __jsp_taghandler_8.setBinding("#{backing_app_staff_SREdit.panelPage1}");
                          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_9=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_9.setName("menu1");
                              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_10=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_10.setName("menuGlobal");
                              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_11=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_11.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_11.setName("branding");
                              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_12=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag id url height width binding");
                                    __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                                    __jsp_taghandler_12.setId("graphicImage1");
                                    __jsp_taghandler_12.setUrl("/images/SRBranding.gif");
                                    __jsp_taghandler_12.setHeight("69");
                                    __jsp_taghandler_12.setWidth("340");
                                    __jsp_taghandler_12.setBinding("#{backing_app_staff_SREdit.graphicImage1}");
                                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,7);
                                  }
                                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_13=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_13.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_13.setName("brandingApp");
                              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_14=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_14.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_14.setName("appCopyright");
                              __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_15=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id escape value binding");
                                    __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                                    __jsp_taghandler_15.setId("outputText1");
                                    __jsp_taghandler_15.setEscape("false");
                                    __jsp_taghandler_15.setValue("#{res['srdemo.copyright']}");
                                    __jsp_taghandler_15.setBinding("#{backing_app_staff_SREdit.outputText1}");
                                    __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                                    if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,7);
                                  }
                                } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_16=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_16.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_16.setName("appPrivacy");
                              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag __jsp_taghandler_17=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag id text action binding");
                                    __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                                    __jsp_taghandler_17.setId("commandLink1");
                                    __jsp_taghandler_17.setText("#{res['srdemo.contact']}");
                                    __jsp_taghandler_17.setAction("dialog:globalContact");
                                    __jsp_taghandler_17.setBinding("#{backing_app_staff_SREdit.commandLink1}");
                                    __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                                    if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,7);
                                  }
                                } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_18=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_18.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_18.setName("appAbout");
                              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag __jsp_taghandler_19=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag id text immediate binding");
                                    __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                                    __jsp_taghandler_19.setId("commandLink2");
                                    __jsp_taghandler_19.setText("#{res['srdemo.about']}");
                                    __jsp_taghandler_19.setImmediate("true");
                                    __jsp_taghandler_19.setBinding("#{backing_app_staff_SREdit.commandLink2}");
                                    __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                                    if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,7);
                                  }
                                } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_20=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_20.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_20.setName("infoUser");
                              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    com.sun.faces.taglib.html_basic.OutputFormatTag __jsp_taghandler_21=(com.sun.faces.taglib.html_basic.OutputFormatTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputFormatTag.class,"com.sun.faces.taglib.html_basic.OutputFormatTag id rendered value binding");
                                    __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                    __jsp_taghandler_21.setId("outputFormat1");
                                    __jsp_taghandler_21.setRendered("#{userInfo.authenticated}");
                                    __jsp_taghandler_21.setValue("#{res['srdemo.connectedUser']}");
                                    __jsp_taghandler_21.setBinding("#{backing_app_staff_SREdit.outputFormat1}");
                                    __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      {
                                        com.sun.faces.taglib.jsf_core.ParameterTag __jsp_taghandler_22=(com.sun.faces.taglib.jsf_core.ParameterTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ParameterTag.class,"com.sun.faces.taglib.jsf_core.ParameterTag binding id value");
                                        __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                                        __jsp_taghandler_22.setBinding("#{backing_app_staff_SREdit.param1}");
                                        __jsp_taghandler_22.setId("param1");
                                        __jsp_taghandler_22.setValue("#{userInfo.userName}");
                                        __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                                        if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,8);
                                      }
                                    }
                                    if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,7);
                                  }
                                } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag __jsp_taghandler_23=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag id binding");
                              __jsp_taghandler_23.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_23.setId("panelBox1");
                              __jsp_taghandler_23.setBinding("#{backing_app_staff_SREdit.panelBox1}");
                              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                {
                                  oracle.adfinternal.view.faces.taglib.core.layout.CorePanelFormTag __jsp_taghandler_24=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelFormTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelFormTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelFormTag id binding");
                                  __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                                  __jsp_taghandler_24.setId("panelForm1");
                                  __jsp_taghandler_24.setBinding("#{backing_app_staff_SREdit.panelForm1}");
                                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    {
                                      oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag __jsp_taghandler_25=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag id label binding");
                                      __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_25.setId("panelLabelAndMessage1");
                                      __jsp_taghandler_25.setLabel("#{bindings.svrId.label}");
                                      __jsp_taghandler_25.setBinding("#{backing_app_staff_SREdit.panelLabelAndMessage1}");
                                      __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        {
                                          oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_26=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                          __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                          __jsp_taghandler_26.setId("outputText2");
                                          __jsp_taghandler_26.setValue("#{bindings.svrId.inputValue}");
                                          __jsp_taghandler_26.setBinding("#{backing_app_staff_SREdit.outputText2}");
                                          __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            {
                                              com.sun.faces.taglib.jsf_core.ConvertNumberTag __jsp_taghandler_27=(com.sun.faces.taglib.jsf_core.ConvertNumberTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ConvertNumberTag.class,"com.sun.faces.taglib.jsf_core.ConvertNumberTag groupingUsed pattern");
                                              __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                                              __jsp_taghandler_27.setGroupingUsed("false");
                                              __jsp_taghandler_27.setPattern("#{bindings.svrId.format}");
                                              __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                                              if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,10);
                                            }
                                          }
                                          if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,9);
                                        }
                                      }
                                      if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,8);
                                    }
                                    {
                                      oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag __jsp_taghandler_28=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag id label binding");
                                      __jsp_taghandler_28.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_28.setId("panelLabelAndMessage3");
                                      __jsp_taghandler_28.setLabel("#{res['sredit.createdBy.label']}");
                                      __jsp_taghandler_28.setBinding("#{backing_app_staff_SREdit.panelLabelAndMessage3}");
                                      __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        {
                                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag __jsp_taghandler_29=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag id binding");
                                          __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                                          __jsp_taghandler_29.setId("panelHorizontal1");
                                          __jsp_taghandler_29.setBinding("#{backing_app_staff_SREdit.panelHorizontal1}");
                                          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            {
                                              oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_30=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                              __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                              __jsp_taghandler_30.setId("outputText4");
                                              __jsp_taghandler_30.setValue("#{bindings.UsersfirstName.inputValue}");
                                              __jsp_taghandler_30.setBinding("#{backing_app_staff_SREdit.outputText4}");
                                              __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                              if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,10);
                                            }
                                            {
                                              oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_31=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                              __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                                              __jsp_taghandler_31.setId("outputText5");
                                              __jsp_taghandler_31.setValue("#{bindings.UserslastName.inputValue}");
                                              __jsp_taghandler_31.setBinding("#{backing_app_staff_SREdit.outputText5}");
                                              __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                              if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,10);
                                            }
                                            {
                                              javax.faces.webapp.FacetTag __jsp_taghandler_32=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                              __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                                              __jsp_taghandler_32.setName("separator");
                                              __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                              {
                                                do {
                                                  {
                                                    oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_33=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id width height binding");
                                                    __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                                                    __jsp_taghandler_33.setId("objectSpacer1");
                                                    __jsp_taghandler_33.setWidth("4");
                                                    __jsp_taghandler_33.setHeight("10");
                                                    __jsp_taghandler_33.setBinding("#{backing_app_staff_SREdit.objectSpacer1}");
                                                    __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                                    if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                      return;
                                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,11);
                                                  }
                                                } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              }
                                              if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,10);
                                            }
                                          }
                                          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,9);
                                        }
                                      }
                                      if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,8);
                                    }
                                    {
                                      oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag __jsp_taghandler_34=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag id label binding");
                                      __jsp_taghandler_34.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_34.setId("panelLabelAndMessage2");
                                      __jsp_taghandler_34.setLabel("#{bindings.requestDate.label}");
                                      __jsp_taghandler_34.setBinding("#{backing_app_staff_SREdit.panelLabelAndMessage2}");
                                      __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        {
                                          oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_35=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                          __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                                          __jsp_taghandler_35.setId("outputText3");
                                          __jsp_taghandler_35.setValue("#{bindings.requestDate.inputValue}");
                                          __jsp_taghandler_35.setBinding("#{backing_app_staff_SREdit.outputText3}");
                                          __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            {
                                              com.sun.faces.taglib.jsf_core.ConvertDateTimeTag __jsp_taghandler_36=(com.sun.faces.taglib.jsf_core.ConvertDateTimeTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ConvertDateTimeTag.class,"com.sun.faces.taglib.jsf_core.ConvertDateTimeTag pattern");
                                              __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                                              __jsp_taghandler_36.setPattern("#{bindings.requestDate.format}");
                                              __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                                              if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,10);
                                            }
                                          }
                                          if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,9);
                                        }
                                      }
                                      if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,8);
                                    }
                                    {
                                      oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag __jsp_taghandler_37=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelLabelAndMessageTag id label binding");
                                      __jsp_taghandler_37.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_37.setId("panelLabelAndMessage4");
                                      __jsp_taghandler_37.setLabel("#{res['sredit.assignedTo.label']}");
                                      __jsp_taghandler_37.setBinding("#{backing_app_staff_SREdit.panelLabelAndMessage4}");
                                      __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        {
                                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag __jsp_taghandler_38=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelHorizontalTag id binding");
                                          __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                                          __jsp_taghandler_38.setId("panelHorizontal2");
                                          __jsp_taghandler_38.setBinding("#{backing_app_staff_SREdit.panelHorizontal2}");
                                          __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            {
                                              oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_39=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                              __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                                              __jsp_taghandler_39.setId("outputText6");
                                              __jsp_taghandler_39.setValue("#{bindings.UsersfirstName1.inputValue}");
                                              __jsp_taghandler_39.setBinding("#{backing_app_staff_SREdit.outputText6}");
                                              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                                              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,10);
                                            }
                                            {
                                              oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_40=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                              __jsp_taghandler_40.setParent(__jsp_taghandler_38);
                                              __jsp_taghandler_40.setId("outputText7");
                                              __jsp_taghandler_40.setValue("#{bindings.UserslastName1.inputValue}");
                                              __jsp_taghandler_40.setBinding("#{backing_app_staff_SREdit.outputText7}");
                                              __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                                              if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,10);
                                            }
                                            {
                                              javax.faces.webapp.FacetTag __jsp_taghandler_41=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                              __jsp_taghandler_41.setParent(__jsp_taghandler_38);
                                              __jsp_taghandler_41.setName("separator");
                                              __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                              {
                                                do {
                                                  {
                                                    oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_42=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id width height binding");
                                                    __jsp_taghandler_42.setParent(__jsp_taghandler_41);
                                                    __jsp_taghandler_42.setId("objectSpacer2");
                                                    __jsp_taghandler_42.setWidth("4");
                                                    __jsp_taghandler_42.setHeight("10");
                                                    __jsp_taghandler_42.setBinding("#{backing_app_staff_SREdit.objectSpacer2}");
                                                    __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                                                    if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                      return;
                                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,11);
                                                  }
                                                } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              }
                                              if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,10);
                                            }
                                          }
                                          if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,9);
                                        }
                                      }
                                      if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,8);
                                    }
                                    {
                                      oracle.adfinternal.view.faces.taglib.core.input.CoreSelectOneChoiceTag __jsp_taghandler_43=(oracle.adfinternal.view.faces.taglib.core.input.CoreSelectOneChoiceTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.input.CoreSelectOneChoiceTag.class,"oracle.adfinternal.view.faces.taglib.core.input.CoreSelectOneChoiceTag id label autoSubmit immediate value binding");
                                      __jsp_taghandler_43.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_43.setId("statusSelection");
                                      __jsp_taghandler_43.setLabel("#{bindings.ServiceRequestsstatus.label}");
                                      __jsp_taghandler_43.setAutoSubmit("true");
                                      __jsp_taghandler_43.setImmediate("true");
                                      __jsp_taghandler_43.setValue("#{bindings.ServiceRequestsstatus.inputValue}");
                                      __jsp_taghandler_43.setBinding("#{backing_app_staff_SREdit.statusSelection}");
                                      __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        {
                                          com.sun.faces.taglib.jsf_core.SelectItemsTag __jsp_taghandler_44=(com.sun.faces.taglib.jsf_core.SelectItemsTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.SelectItemsTag.class,"com.sun.faces.taglib.jsf_core.SelectItemsTag binding id value");
                                          __jsp_taghandler_44.setParent(__jsp_taghandler_43);
                                          __jsp_taghandler_44.setBinding("#{backing_app_staff_SREdit.selectItems1}");
                                          __jsp_taghandler_44.setId("selectItems1");
                                          __jsp_taghandler_44.setValue("#{bindings.ServiceRequestsstatus.items}");
                                          __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                                          if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,9);
                                        }
                                      }
                                      if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,8);
                                    }
                                    {
                                      oracle.adfinternal.view.faces.taglib.core.input.CoreSelectInputDateTag __jsp_taghandler_45=(oracle.adfinternal.view.faces.taglib.core.input.CoreSelectInputDateTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.input.CoreSelectInputDateTag.class,"oracle.adfinternal.view.faces.taglib.core.input.CoreSelectInputDateTag id disabled label required value binding");
                                      __jsp_taghandler_45.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_45.setId("selectInputDate1");
                                      __jsp_taghandler_45.setDisabled("#{backing_app_staff_SREdit.statusSelection.value=='2'}");
                                      __jsp_taghandler_45.setLabel("#{bindings.assignedDate.label}");
                                      __jsp_taghandler_45.setRequired("#{bindings.assignedDate.mandatory}");
                                      __jsp_taghandler_45.setValue("#{bindings.assignedDate.inputValue}");
                                      __jsp_taghandler_45.setBinding("#{backing_app_staff_SREdit.selectInputDate1}");
                                      __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        {
                                          oracle.adfinternal.view.faces.taglib.ValidatorTag __jsp_taghandler_46=(oracle.adfinternal.view.faces.taglib.ValidatorTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.ValidatorTag.class,"oracle.adfinternal.view.faces.taglib.ValidatorTag binding");
                                          __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                                          __jsp_taghandler_46.setBinding("#{bindings.assignedDate.validator}");
                                          __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                                          if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,9);
                                        }
                                        {
                                          com.sun.faces.taglib.jsf_core.ConvertDateTimeTag __jsp_taghandler_47=(com.sun.faces.taglib.jsf_core.ConvertDateTimeTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ConvertDateTimeTag.class,"com.sun.faces.taglib.jsf_core.ConvertDateTimeTag pattern");
                                          __jsp_taghandler_47.setParent(__jsp_taghandler_45);
                                          __jsp_taghandler_47.setPattern("#{bindings.assignedDate.format}");
                                          __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                                          if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,9);
                                        }
                                      }
                                      if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,8);
                                    }
                                    {
                                      oracle.adfinternal.view.faces.taglib.core.input.CoreInputTextTag __jsp_taghandler_48=(oracle.adfinternal.view.faces.taglib.core.input.CoreInputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.input.CoreInputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.input.CoreInputTextTag id rows disabled partialTriggers label columns required value binding");
                                      __jsp_taghandler_48.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_48.setId("inputText2");
                                      __jsp_taghandler_48.setRows("4");
                                      __jsp_taghandler_48.setDisabled("#{backing_app_staff_SREdit.statusSelection.value=='2'}");
                                      __jsp_taghandler_48.setPartialTriggers("statusSelection");
                                      __jsp_taghandler_48.setLabel("#{bindings.problemDescription.label}");
                                      __jsp_taghandler_48.setColumns("#{bindings.problemDescription.displayWidth}");
                                      __jsp_taghandler_48.setRequired("#{bindings.problemDescription.mandatory}");
                                      __jsp_taghandler_48.setValue("#{bindings.problemDescription.inputValue}");
                                      __jsp_taghandler_48.setBinding("#{backing_app_staff_SREdit.inputText2}");
                                      __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        {
                                          oracle.adfinternal.view.faces.taglib.ValidatorTag __jsp_taghandler_49=(oracle.adfinternal.view.faces.taglib.ValidatorTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.ValidatorTag.class,"oracle.adfinternal.view.faces.taglib.ValidatorTag binding");
                                          __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                                          __jsp_taghandler_49.setBinding("#{bindings.problemDescription.validator}");
                                          __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                                          if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                            return;
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,9);
                                        }
                                      }
                                      if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,8);
                                    }
                                    {
                                      javax.faces.webapp.FacetTag __jsp_taghandler_50=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                      __jsp_taghandler_50.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_50.setName("footer");
                                      __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          {
                                            oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag __jsp_taghandler_51=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag id binding");
                                            __jsp_taghandler_51.setParent(__jsp_taghandler_50);
                                            __jsp_taghandler_51.setId("panelButtonBar1");
                                            __jsp_taghandler_51.setBinding("#{backing_app_staff_SREdit.panelButtonBar1}");
                                            __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                            {
                                              {
                                                oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag __jsp_taghandler_52=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag id text binding");
                                                __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                                                __jsp_taghandler_52.setId("commandButton1");
                                                __jsp_taghandler_52.setText("#{res['srdemo.cancel']}");
                                                __jsp_taghandler_52.setBinding("#{backing_app_staff_SREdit.commandButton1}");
                                                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                                {
                                                  {
                                                    oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag __jsp_taghandler_53=(oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag.class,"oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag to from");
                                                    __jsp_taghandler_53.setParent(__jsp_taghandler_52);
                                                    __jsp_taghandler_53.setTo("#{userState.refresh}");
                                                    __jsp_taghandler_53.setFrom("#{true}");
                                                    __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                                                    if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                      return;
                                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,11);
                                                  }
                                                }
                                                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                  return;
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,10);
                                              }
                                              {
                                                oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag __jsp_taghandler_54=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag id text disabled action actionListener binding");
                                                __jsp_taghandler_54.setParent(__jsp_taghandler_51);
                                                __jsp_taghandler_54.setId("commandButton2");
                                                __jsp_taghandler_54.setText("#{res['srdemo.save']}");
                                                __jsp_taghandler_54.setDisabled("#{!bindings.mergeEntity.enabled}");
                                                __jsp_taghandler_54.setAction("#{userState.retrieveReturnNavigationRule}");
                                                __jsp_taghandler_54.setActionListener("#{bindings.mergeEntity.execute}");
                                                __jsp_taghandler_54.setBinding("#{backing_app_staff_SREdit.commandButton2}");
                                                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                                {
                                                  {
                                                    oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag __jsp_taghandler_55=(oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag.class,"oracle.adfinternal.view.faces.taglib.listener.SetActionListenerTag to from");
                                                    __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                                                    __jsp_taghandler_55.setTo("#{userState.refresh}");
                                                    __jsp_taghandler_55.setFrom("#{true}");
                                                    __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                                                    if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                      return;
                                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,11);
                                                  }
                                                }
                                                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                  return;
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,10);
                                              }
                                            }
                                            if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,9);
                                          }
                                        } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,8);
                                    }
                                  }
                                  if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,7);
                                }
                              }
                              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,6);
                            }
                          }
                          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,5);
                        }
                      }
                      if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,4);
                    }
                  }
                  if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                }
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }


    }
    catch( Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch( Exception clearException) {
        }
        pageContext.handlePageException( e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
}
