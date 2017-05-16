package _app;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SRCreateDone_jspx extends com.orionserver.http.OrionHttpJspPage {


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
    _SRCreateDone_jspx page = this;
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
              __jsp_taghandler_2.setBinding("#{backing_app_SRCreateDone.html1}");
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
                  __jsp_taghandler_4.setTitle("SRDemo Done");
                  __jsp_taghandler_4.setBinding("#{backing_app_SRCreateDone.head1}");
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
                  __jsp_taghandler_5.setBinding("#{backing_app_SRCreateDone.body1}");
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    {
                      com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag id binding");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setId("form1");
                      __jsp_taghandler_6.setBinding("#{backing_app_SRCreateDone.form1}");
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        {
                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag __jsp_taghandler_7=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag id title binding");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_7.setId("panelPage1");
                          __jsp_taghandler_7.setTitle("#{res['srcreate.pageTitle']}");
                          __jsp_taghandler_7.setBinding("#{backing_app_SRCreateDone.panelPage1}");
                          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_8=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_8.setName("menu1");
                              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_9=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_9.setName("menuGlobal");
                              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_10=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_10.setName("branding");
                              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag id url height width binding");
                                    __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                                    __jsp_taghandler_11.setId("graphicImage1");
                                    __jsp_taghandler_11.setUrl("../images/SRBranding.gif");
                                    __jsp_taghandler_11.setHeight("69");
                                    __jsp_taghandler_11.setWidth("340");
                                    __jsp_taghandler_11.setBinding("#{backing_app_SRCreateDone.graphicImage1}");
                                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,7);
                                  }
                                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_12=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_12.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_12.setName("brandingApp");
                              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_13=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_13.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_13.setName("appCopyright");
                              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_14=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag id escape value binding");
                                    __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                                    __jsp_taghandler_14.setId("outputText1");
                                    __jsp_taghandler_14.setEscape("false");
                                    __jsp_taghandler_14.setValue("#{res['srdemo.copyright']}");
                                    __jsp_taghandler_14.setBinding("#{backing_app_SRCreateDone.outputText1}");
                                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,7);
                                  }
                                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_15=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_15.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_15.setName("appPrivacy");
                              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag __jsp_taghandler_16=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag id text action binding");
                                    __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                                    __jsp_taghandler_16.setId("commandLink1");
                                    __jsp_taghandler_16.setText("#{res['srdemo.contact']}");
                                    __jsp_taghandler_16.setAction("dialog:globalContact");
                                    __jsp_taghandler_16.setBinding("#{backing_app_SRCreateDone.commandLink1}");
                                    __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                                    if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,7);
                                  }
                                } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_17=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_17.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_17.setName("appAbout");
                              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag __jsp_taghandler_18=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag id text immediate binding");
                                    __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                                    __jsp_taghandler_18.setId("commandLink2");
                                    __jsp_taghandler_18.setText("#{res['srdemo.about']}");
                                    __jsp_taghandler_18.setImmediate("true");
                                    __jsp_taghandler_18.setBinding("#{backing_app_SRCreateDone.commandLink2}");
                                    __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                                    if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,7);
                                  }
                                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,6);
                            }
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_19=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_19.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_19.setName("infoUser");
                              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  {
                                    com.sun.faces.taglib.html_basic.OutputFormatTag __jsp_taghandler_20=(com.sun.faces.taglib.html_basic.OutputFormatTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputFormatTag.class,"com.sun.faces.taglib.html_basic.OutputFormatTag id rendered value binding");
                                    __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                                    __jsp_taghandler_20.setId("outputFormat1");
                                    __jsp_taghandler_20.setRendered("#{userInfo.authenticated}");
                                    __jsp_taghandler_20.setValue("#{res['srdemo.connectedUser']}");
                                    __jsp_taghandler_20.setBinding("#{backing_app_SRCreateDone.outputFormat1}");
                                    __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      {
                                        com.sun.faces.taglib.jsf_core.ParameterTag __jsp_taghandler_21=(com.sun.faces.taglib.jsf_core.ParameterTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ParameterTag.class,"com.sun.faces.taglib.jsf_core.ParameterTag binding id value");
                                        __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                        __jsp_taghandler_21.setBinding("#{backing_app_SRCreateDone.param1}");
                                        __jsp_taghandler_21.setId("param1");
                                        __jsp_taghandler_21.setValue("#{userInfo.userName}");
                                        __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                        if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,8);
                                      }
                                    }
                                    if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,7);
                                  }
                                } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_22=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id height binding");
                              __jsp_taghandler_22.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_22.setId("objectSpacer1");
                              __jsp_taghandler_22.setHeight("10");
                              __jsp_taghandler_22.setBinding("#{backing_app_SRCreateDone.objectSpacer1}");
                              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag __jsp_taghandler_23=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelBoxTag id width binding");
                              __jsp_taghandler_23.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_23.setId("panelBox1");
                              __jsp_taghandler_23.setWidth("100%");
                              __jsp_taghandler_23.setBinding("#{backing_app_SRCreateDone.panelBox1}");
                              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_24=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id width height binding");
                                  __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                                  __jsp_taghandler_24.setId("objectSpacer2");
                                  __jsp_taghandler_24.setWidth("10");
                                  __jsp_taghandler_24.setHeight("10");
                                  __jsp_taghandler_24.setBinding("#{backing_app_SRCreateDone.objectSpacer2}");
                                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                                  if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,7);
                                }
                                {
                                  com.sun.faces.taglib.html_basic.OutputFormatTag __jsp_taghandler_25=(com.sun.faces.taglib.html_basic.OutputFormatTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputFormatTag.class,"com.sun.faces.taglib.html_basic.OutputFormatTag value escape");
                                  __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                                  __jsp_taghandler_25.setValue("#{res['srcreate.confirmPanel.message']}");
                                  __jsp_taghandler_25.setEscape("false");
                                  __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    {
                                      com.sun.faces.taglib.jsf_core.ParameterTag __jsp_taghandler_26=(com.sun.faces.taglib.jsf_core.ParameterTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ParameterTag.class,"com.sun.faces.taglib.jsf_core.ParameterTag value");
                                      __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                      __jsp_taghandler_26.setValue("#{requestScope.SRDEMO_CREATED_SVRID}");
                                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,8);
                                    }
                                  }
                                  if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,7);
                                }
                                {
                                  oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag __jsp_taghandler_27=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag id text action binding");
                                  __jsp_taghandler_27.setParent(__jsp_taghandler_23);
                                  __jsp_taghandler_27.setId("commandButton1");
                                  __jsp_taghandler_27.setText("#{res['srdemo.nextStep']}");
                                  __jsp_taghandler_27.setAction("globalHome");
                                  __jsp_taghandler_27.setBinding("#{backing_app_SRCreateDone.commandButton1}");
                                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,7);
                                }
                              }
                              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,6);
                            }
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_28=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag id width height binding");
                              __jsp_taghandler_28.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_28.setId("objectSpacer3");
                              __jsp_taghandler_28.setWidth("10");
                              __jsp_taghandler_28.setHeight("10");
                              __jsp_taghandler_28.setBinding("#{backing_app_SRCreateDone.objectSpacer3}");
                              __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                              if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
                            }
                          }
                          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                        }
                      }
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
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
