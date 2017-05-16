package _app;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SRCreateConfirm_jspx extends com.orionserver.http.OrionHttpJspPage {


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
    _SRCreateConfirm_jspx page = this;
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
              __jsp_taghandler_2.setBinding("#{backing_app_SRCreateConfirm.html1}");
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
                  __jsp_taghandler_4.setTitle("SRDemo Confirm");
                  __jsp_taghandler_4.setBinding("#{backing_app_SRCreateConfirm.head1}");
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
                  __jsp_taghandler_5.setBinding("#{backing_app_SRCreateConfirm.body1}");
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    {
                      oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag __jsp_taghandler_6=(oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag id binding");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setId("messages1");
                      __jsp_taghandler_6.setBinding("#{backing_app_SRCreateConfirm.messages1}");
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                    }
                    {
                      com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag id binding");
                      __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_7.setId("form1");
                      __jsp_taghandler_7.setBinding("#{backing_app_SRCreateConfirm.form1}");
                      __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        {
                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag __jsp_taghandler_8=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag id title binding");
                          __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                          __jsp_taghandler_8.setId("panelPage1");
                          __jsp_taghandler_8.setTitle("#{res['srcreate.pageTitle']}");
                          __jsp_taghandler_8.setBinding("#{backing_app_SRCreateConfirm.panelPage1}");
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
                                    __jsp_taghandler_12.setUrl("../images/SRBranding.gif");
                                    __jsp_taghandler_12.setHeight("69");
                                    __jsp_taghandler_12.setWidth("340");
                                    __jsp_taghandler_12.setBinding("#{backing_app_SRCreateConfirm.graphicImage1}");
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
                                    __jsp_taghandler_15.setBinding("#{backing_app_SRCreateConfirm.outputText1}");
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
                                    __jsp_taghandler_17.setBinding("#{backing_app_SRCreateConfirm.commandLink1}");
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
                                    __jsp_taghandler_19.setBinding("#{backing_app_SRCreateConfirm.commandLink2}");
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
                                    __jsp_taghandler_21.setBinding("#{backing_app_SRCreateConfirm.outputFormat1}");
                                    __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      {
                                        com.sun.faces.taglib.jsf_core.ParameterTag __jsp_taghandler_22=(com.sun.faces.taglib.jsf_core.ParameterTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ParameterTag.class,"com.sun.faces.taglib.jsf_core.ParameterTag binding id value");
                                        __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                                        __jsp_taghandler_22.setBinding("#{backing_app_SRCreateConfirm.param1}");
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
                              oracle.adfinternal.view.faces.taglib.core.nav.CoreProcessTrainTag __jsp_taghandler_23=(oracle.adfinternal.view.faces.taglib.core.nav.CoreProcessTrainTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreProcessTrainTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreProcessTrainTag id value var binding");
                              __jsp_taghandler_23.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_23.setId("createStepsTrain");
                              __jsp_taghandler_23.setValue("#{createTrainMenuModel.model}");
                              __jsp_taghandler_23.setVar("train");
                              __jsp_taghandler_23.setBinding("#{backing_app_SRCreateConfirm.createStepsTrain}");
                              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                {
                                  javax.faces.webapp.FacetTag __jsp_taghandler_24=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                                  __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                                  __jsp_taghandler_24.setName("nodeStamp");
                                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    do {
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_25=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag id text readOnly action binding");
                                        __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                                        __jsp_taghandler_25.setId("trainNode");
                                        __jsp_taghandler_25.setText("#{train.label}");
                                        __jsp_taghandler_25.setReadOnly("#{createTrainMenuModel.model.readOnly}");
                                        __jsp_taghandler_25.setAction("#{train.getOutcome}");
                                        __jsp_taghandler_25.setBinding("#{backing_app_SRCreateConfirm.trainNode}");
                                        __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                        if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,8);
                                      }
                                    } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
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
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_26=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                              __jsp_taghandler_26.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_26.setId("objectSpacer1");
                              __jsp_taghandler_26.setHeight("20");
                              __jsp_taghandler_26.setBinding("#{backing_app_SRCreateConfirm.objectSpacer1}");
                              __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                              if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag __jsp_taghandler_27=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag id value binding");
                              __jsp_taghandler_27.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_27.setId("outputFormatted1");
                              __jsp_taghandler_27.setValue("#{res['srcreate.confirmText']}");
                              __jsp_taghandler_27.setBinding("#{backing_app_SRCreateConfirm.outputFormatted1}");
                              __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                              if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_28=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                              __jsp_taghandler_28.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_28.setId("objectSpacer2");
                              __jsp_taghandler_28.setHeight("20");
                              __jsp_taghandler_28.setBinding("#{backing_app_SRCreateConfirm.objectSpacer2}");
                              __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                              if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag __jsp_taghandler_29=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag id width binding");
                              __jsp_taghandler_29.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_29.setId("panelBox1");
                              __jsp_taghandler_29.setWidth("100%");
                              __jsp_taghandler_29.setBinding("#{backing_app_SRCreateConfirm.panelBox1}");
                              __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag __jsp_taghandler_30=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag id value binding");
                                  __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                  __jsp_taghandler_30.setId("outputFormatted2");
                                  __jsp_taghandler_30.setValue("#{res['srcreate.confirmLine.1']}");
                                  __jsp_taghandler_30.setBinding("#{backing_app_SRCreateConfirm.outputFormatted2}");
                                  __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                  if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_31=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                                  __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                                  __jsp_taghandler_31.setId("objectSpacer3");
                                  __jsp_taghandler_31.setHeight("20");
                                  __jsp_taghandler_31.setBinding("#{backing_app_SRCreateConfirm.objectSpacer3}");
                                  __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                  if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_32=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                  __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                                  __jsp_taghandler_32.setId("outputText2");
                                  __jsp_taghandler_32.setValue("#{userInfo.userName} #{userInfo.userId} ");
                                  __jsp_taghandler_32.setBinding("#{backing_app_SRCreateConfirm.outputText2}");
                                  __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                  if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,7);
                                }
                              }
                              if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_33=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                              __jsp_taghandler_33.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_33.setId("objectSpacer4");
                              __jsp_taghandler_33.setHeight("20");
                              __jsp_taghandler_33.setBinding("#{backing_app_SRCreateConfirm.objectSpacer4}");
                              __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                              if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag __jsp_taghandler_34=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag id width binding");
                              __jsp_taghandler_34.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_34.setId("panelBox11");
                              __jsp_taghandler_34.setWidth("100%");
                              __jsp_taghandler_34.setBinding("#{backing_app_SRCreateConfirm.panelBox11}");
                              __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag __jsp_taghandler_35=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag id value binding");
                                  __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                                  __jsp_taghandler_35.setId("outputFormatted21");
                                  __jsp_taghandler_35.setValue("#{res['srcreate.confirmLine.2']}");
                                  __jsp_taghandler_35.setBinding("#{backing_app_SRCreateConfirm.outputFormatted21}");
                                  __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                  if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_36=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                                  __jsp_taghandler_36.setParent(__jsp_taghandler_34);
                                  __jsp_taghandler_36.setId("objectSpacer31");
                                  __jsp_taghandler_36.setHeight("20");
                                  __jsp_taghandler_36.setBinding("#{backing_app_SRCreateConfirm.objectSpacer31}");
                                  __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                                  if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_37=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                  __jsp_taghandler_37.setParent(__jsp_taghandler_34);
                                  __jsp_taghandler_37.setId("outputText21");
                                  __jsp_taghandler_37.setValue("#{data.app_SRCreatePageDef.findAllProductsIter.currentRow.dataProvider['name']}");
                                  __jsp_taghandler_37.setBinding("#{backing_app_SRCreateConfirm.outputText21}");
                                  __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                                  if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,7);
                                }
                              }
                              if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_38=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                              __jsp_taghandler_38.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_38.setId("objectSpacer5");
                              __jsp_taghandler_38.setHeight("20");
                              __jsp_taghandler_38.setBinding("#{backing_app_SRCreateConfirm.objectSpacer5}");
                              __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                              if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag __jsp_taghandler_39=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag id width binding");
                              __jsp_taghandler_39.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_39.setId("panelBox111");
                              __jsp_taghandler_39.setWidth("100%");
                              __jsp_taghandler_39.setBinding("#{backing_app_SRCreateConfirm.panelBox111}");
                              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag __jsp_taghandler_40=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag id value binding");
                                  __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                                  __jsp_taghandler_40.setId("outputFormatted211");
                                  __jsp_taghandler_40.setValue("#{res['srcreate.confirmLine.3']}");
                                  __jsp_taghandler_40.setBinding("#{backing_app_SRCreateConfirm.outputFormatted211}");
                                  __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                                  if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_41=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                                  __jsp_taghandler_41.setParent(__jsp_taghandler_39);
                                  __jsp_taghandler_41.setId("objectSpacer311");
                                  __jsp_taghandler_41.setHeight("20");
                                  __jsp_taghandler_41.setBinding("#{backing_app_SRCreateConfirm.objectSpacer311}");
                                  __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                                  if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_42=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id value binding");
                                  __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                                  __jsp_taghandler_42.setId("outputText211");
                                  __jsp_taghandler_42.setValue("#{data.app_SRCreatePageDef.problemDescription.inputValue}");
                                  __jsp_taghandler_42.setBinding("#{backing_app_SRCreateConfirm.outputText211}");
                                  __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                                  if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,7);
                                }
                              }
                              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_43=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                              __jsp_taghandler_43.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_43.setId("objectSpacer6");
                              __jsp_taghandler_43.setHeight("20");
                              __jsp_taghandler_43.setBinding("#{backing_app_SRCreateConfirm.objectSpacer6}");
                              __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                              if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag __jsp_taghandler_44=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelButtonBarTag id binding");
                              __jsp_taghandler_44.setParent(__jsp_taghandler_8);
                              __jsp_taghandler_44.setId("panelButtonBar1");
                              __jsp_taghandler_44.setBinding("#{backing_app_SRCreateConfirm.panelButtonBar1}");
                              __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                {
                                  oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag __jsp_taghandler_45=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag id text action binding");
                                  __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                                  __jsp_taghandler_45.setId("commandButton1");
                                  __jsp_taghandler_45.setText("#{res['srdemo.cancel']}");
                                  __jsp_taghandler_45.setAction("#{backing_app_SRCreate.cancelButton_action}");
                                  __jsp_taghandler_45.setBinding("#{backing_app_SRCreateConfirm.commandButton1}");
                                  __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                                  if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag __jsp_taghandler_46=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag id text action binding");
                                  __jsp_taghandler_46.setParent(__jsp_taghandler_44);
                                  __jsp_taghandler_46.setId("commandButton2");
                                  __jsp_taghandler_46.setText("#{res['srdemo.previousStep']}");
                                  __jsp_taghandler_46.setAction("back");
                                  __jsp_taghandler_46.setBinding("#{backing_app_SRCreateConfirm.commandButton2}");
                                  __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                                  if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag __jsp_taghandler_47=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag id text disabled action binding");
                                  __jsp_taghandler_47.setParent(__jsp_taghandler_44);
                                  __jsp_taghandler_47.setId("saveButton");
                                  __jsp_taghandler_47.setText("#{res['srcreate.submit.button']}");
                                  __jsp_taghandler_47.setDisabled("false");
                                  __jsp_taghandler_47.setAction("#{backing_app_SRCreateConfirm.saveButton_action}");
                                  __jsp_taghandler_47.setBinding("#{backing_app_SRCreateConfirm.saveButton}");
                                  __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                                  if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,7);
                                }
                              }
                              if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
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
