/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-19 08:31:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class item_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<link href=\"/js/kindeditor-4.1.10/themes/default/default.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/kindeditor-4.1.10/kindeditor-all-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/kindeditor-4.1.10/lang/zh_CN.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".form-item {\r\n");
      out.write("\tmargin-bottom: 15px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write(".form-item>label {\r\n");
      out.write("\tmin-width: 72px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write(".form-item input, select {\r\n");
      out.write("\twidth: 170px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"super-theme-example\">\r\n");
      out.write("\t<form id=\"itemEditForm\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\">\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\">商品类目:</label> <a\r\n");
      out.write("\t\t\t\thref=\"javascript:void(0)\" class=\"easyui-linkbutton selectItemCat\">选择类目</a>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"cid\" style=\"width: 280px;\"></input>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\">商品标题:</label> <input\r\n");
      out.write("\t\t\t\tclass=\"easyui-textbox\" type=\"text\" name=\"title\"\r\n");
      out.write("\t\t\t\tdata-options=\"required:true\" style=\"width: 280px;\"></input>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\">商品卖点:</label> <input\r\n");
      out.write("\t\t\t\tclass=\"easyui-textbox\" name=\"sellPoint\"\r\n");
      out.write("\t\t\t\tdata-options=\"multiline:true,validType:'length[0,150]'\"\r\n");
      out.write("\t\t\t\tstyle=\"height: 60px; width: 280px;\"></input>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\">商品价格:</label> <input\r\n");
      out.write("\t\t\t\tclass=\"easyui-numberbox\" type=\"text\" name=\"priceView\"\r\n");
      out.write("\t\t\t\tdata-options=\"min:1,max:99999999,precision:2,required:true\" /> <input\r\n");
      out.write("\t\t\t\ttype=\"hidden\" name=\"price\" value=\"0\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\">库存数量:</label> <input\r\n");
      out.write("\t\t\t\tclass=\"easyui-numberbox\" type=\"text\" name=\"num\"\r\n");
      out.write("\t\t\t\tdata-options=\"min:1,max:99999999,precision:0,required:true\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\">条形码:</label>\r\n");
      out.write("\t\t\t<input class=\"easyui-textbox\" type=\"text\" name=\"barcode\" data-options=\"validType:'length[1,30]'\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\">商品图片:</label>\r\n");
      out.write("\t\t\t <a href=\"javascript:void(0)\" class=\"easyui-linkbutton picFileUpload\">上传图片</a>\r\n");
      out.write("\t                 <input type=\"hidden\" name=\"image\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top\" style=\"align-content: center;\">商品描述:</label>\r\n");
      out.write("\t\t\t  <textarea style=\"width:800px;height:300px;visibility:hidden;\" name=\"desc\"></textarea>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<label for=\"\" class=\"label-top params hide\">商品规格:</label>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-item\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton warning\"\r\n");
      out.write("\t\t\t\tonclick=\"clearForm()\">取消</a> <a href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\tclass=\"easyui-linkbutton success\" onclick=\"submitForm()\">提交</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar itemEditEditor ;\r\n");
      out.write("\t//页面初始化完毕后执行此方法\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//创建富文本编辑器\r\n");
      out.write("\t\titemEditEditor = TT.createEditor(\"#itemEditForm [name=desc]\");\r\n");
      out.write("\t\t//初始化类目选择和图片上传器\r\n");
      out.write("\t\tTT.init({\r\n");
      out.write("\t\t\tfun : function(node) {\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//提交表单\r\n");
      out.write("\tfunction submitForm(){\r\n");
      out.write("\t\t//有效性验证\r\n");
      out.write("\t\tif(!$('#itemEditForm').form('validate')){\r\n");
      out.write("\t\t\t$.messager.alert('提示','表单还未填写完成!');\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//同步文本框中的商品描述\r\n");
      out.write("\t\titemEditEditor.sync();\r\n");
      out.write("\t\t//ajax的post方式提交表单\r\n");
      out.write("\t\t//$(\"#itemEditForm\").serialize()将表单序列号为key-value形式的字符串\r\n");
      out.write("\t\t$.post(\"/item/update\",$(\"#itemEditForm\").serialize(), function(data){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(data.status == 200){\r\n");
      out.write("\t\t\t\t$(\"#dgTbItem\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t$.messager.alert('操作成功', '恭喜您更新产品成功', 'warning', function() {\r\n");
      out.write("\t\t\t\t\t$('#editwin').window('close');\r\n");
      out.write("\t\t\t\t\t$('#item-list').click();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clearForm(){\r\n");
      out.write("\t\t$('#itemEditForm').form('reset');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
