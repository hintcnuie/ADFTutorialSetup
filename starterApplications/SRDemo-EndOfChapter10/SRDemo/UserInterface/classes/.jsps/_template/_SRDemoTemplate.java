package _template;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _SRDemoTemplate extends com.orionserver.http.OrionHttpJspPage {


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
    _SRDemoTemplate page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        com.sun.faces.taglib.jsf_core.ViewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.ViewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ViewTag.class,"com.sun.faces.taglib.jsf_core.ViewTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            out.write(__oracle_jsp_text[6]);
            {
              oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag __jsp_taghandler_2=(oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                out.write(__oracle_jsp_text[7]);
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
                out.write(__oracle_jsp_text[8]);
                {
                  oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag __jsp_taghandler_4=(oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag title");
                  __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_4.setTitle("SRDemoTemplate");
                  __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    out.write(__oracle_jsp_text[9]);
                  }
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                }
                out.write(__oracle_jsp_text[10]);
                {
                  oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag __jsp_taghandler_5=(oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag");
                  __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    out.write(__oracle_jsp_text[11]);
                    {
                      com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        out.write(__oracle_jsp_text[12]);
                        {
                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag __jsp_taghandler_7=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag title");
                          __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                          __jsp_taghandler_7.setTitle("Change me");
                          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            out.write(__oracle_jsp_text[13]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_8=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_8.setName("menu1");
                              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,6);
                            }
                            out.write(__oracle_jsp_text[14]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_9=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_9.setName("menuGlobal");
                              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,6);
                            }
                            out.write(__oracle_jsp_text[15]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_10=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_10.setName("branding");
                              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[16]);
                                  {
                                    com.sun.faces.taglib.html_basic.GraphicImageTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.GraphicImageTag.class,"com.sun.faces.taglib.html_basic.GraphicImageTag url height width");
                                    __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                                    __jsp_taghandler_11.setUrl("../images/SRBranding.gif");
                                    __jsp_taghandler_11.setHeight("69");
                                    __jsp_taghandler_11.setWidth("340");
                                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,7);
                                  }
                                  out.write(__oracle_jsp_text[17]);
                                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,6);
                            }
                            out.write(__oracle_jsp_text[18]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_12=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_12.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_12.setName("brandingApp");
                              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,6);
                            }
                            out.write(__oracle_jsp_text[19]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_13=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_13.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_13.setName("appCopyright");
                              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[20]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_14=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag escape value");
                                    __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                                    __jsp_taghandler_14.setEscape("false");
                                    __jsp_taghandler_14.setValue("#{res['srdemo.copyright']}");
                                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,7);
                                  }
                                  out.write(__oracle_jsp_text[21]);
                                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,6);
                            }
                            out.write(__oracle_jsp_text[22]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_15=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_15.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_15.setName("appPrivacy");
                              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[23]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag __jsp_taghandler_16=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag text action");
                                    __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                                    __jsp_taghandler_16.setText("#{res['srdemo.contact']}");
                                    __jsp_taghandler_16.setAction("dialog:globalContact");
                                    __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                                    if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,7);
                                  }
                                  out.write(__oracle_jsp_text[24]);
                                } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,6);
                            }
                            out.write(__oracle_jsp_text[25]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_17=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_17.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_17.setName("appAbout");
                              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[26]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag __jsp_taghandler_18=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandLinkTag text immediate");
                                    __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                                    __jsp_taghandler_18.setText("#{res['srdemo.about']}");
                                    __jsp_taghandler_18.setImmediate("true");
                                    __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                                    if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,7);
                                  }
                                  out.write(__oracle_jsp_text[27]);
                                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,6);
                            }
                            out.write(__oracle_jsp_text[28]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_19=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_19.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_19.setName("infoUser");
                              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[29]);
                                  {
                                    com.sun.faces.taglib.html_basic.OutputFormatTag __jsp_taghandler_20=(com.sun.faces.taglib.html_basic.OutputFormatTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputFormatTag.class,"com.sun.faces.taglib.html_basic.OutputFormatTag rendered value");
                                    __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                                    __jsp_taghandler_20.setRendered("#{userInfo.authenticated}");
                                    __jsp_taghandler_20.setValue("#{res['srdemo.connectedUser']}");
                                    __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      out.write(__oracle_jsp_text[30]);
                                      {
                                        com.sun.faces.taglib.jsf_core.ParameterTag __jsp_taghandler_21=(com.sun.faces.taglib.jsf_core.ParameterTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ParameterTag.class,"com.sun.faces.taglib.jsf_core.ParameterTag value");
                                        __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                        __jsp_taghandler_21.setValue("#{userInfo.userName}");
                                        __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                        if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,8);
                                      }
                                      out.write(__oracle_jsp_text[31]);
                                    }
                                    if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,7);
                                  }
                                  out.write(__oracle_jsp_text[32]);
                                } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,6);
                            }
                            out.write(__oracle_jsp_text[33]);
                          }
                          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                        }
                        out.write(__oracle_jsp_text[34]);
                      }
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                    }
                    out.write(__oracle_jsp_text[35]);
                  }
                  if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                }
                out.write(__oracle_jsp_text[36]);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[37]);
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
  private static final char __oracle_jsp_text[][]=new char[38][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n      <meta http-equiv=\"Content-Type\"\n            content=\"text/html; charset=windows-1252\"/>\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
