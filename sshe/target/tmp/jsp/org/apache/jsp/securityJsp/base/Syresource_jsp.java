package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Syresource_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

	String contextPath = request.getContextPath();
	sy.util.base.SecurityUtil securityUtil = new sy.util.base.SecurityUtil(session);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../inc.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar grid;\r\n");
      out.write("\tvar addFun = function() {\r\n");
      out.write("\t\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\t\ttitle : '添加资源信息',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/securityJsp/base/SyresourceForm.jsp',\r\n");
      out.write("\t\t\tbuttons : [ {\r\n");
      out.write("\t\t\t\ttext : '添加',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tdialog.find('iframe').get(0).contentWindow.submitForm(dialog, grid, parent.$, parent.mainMenu);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\tvar showFun = function(id) {\r\n");
      out.write("\t\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\t\ttitle : '查看资源信息',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/securityJsp/base/SyresourceForm.jsp?id=' + id\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\tvar editFun = function(id) {\r\n");
      out.write("\t\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\t\ttitle : '编辑资源信息',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/securityJsp/base/SyresourceForm.jsp?id=' + id,\r\n");
      out.write("\t\t\tbuttons : [ {\r\n");
      out.write("\t\t\t\ttext : '编辑',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tdialog.find('iframe').get(0).contentWindow.submitForm(dialog, grid, parent.$, parent.mainMenu);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\tvar removeFun = function(id) {\r\n");
      out.write("\t\tparent.$.messager.confirm('询问', '您确定要删除此记录？', function(r) {\r\n");
      out.write("\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t$.post(sy.contextPath + '/base/syresource!delete.sy', {\r\n");
      out.write("\t\t\t\t\tid : id\r\n");
      out.write("\t\t\t\t}, function() {\r\n");
      out.write("\t\t\t\t\tgrid.treegrid('reload');\r\n");
      out.write("\t\t\t\t\tparent.mainMenu.tree('reload');\r\n");
      out.write("\t\t\t\t}, 'json');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\tvar redoFun = function() {\r\n");
      out.write("\t\tvar node = grid.treegrid('getSelected');\r\n");
      out.write("\t\tif (node) {\r\n");
      out.write("\t\t\tgrid.treegrid('expandAll', node.id);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tgrid.treegrid('expandAll');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\tvar undoFun = function() {\r\n");
      out.write("\t\tvar node = grid.treegrid('getSelected');\r\n");
      out.write("\t\tif (node) {\r\n");
      out.write("\t\t\tgrid.treegrid('collapseAll', node.id);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tgrid.treegrid('collapseAll');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tgrid = $('#grid').treegrid({\r\n");
      out.write("\t\t\ttitle : '',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/base/syresource!treeGrid.sy',\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\ttreeField : 'name',\r\n");
      out.write("\t\t\tparentField : 'pid',\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tpagination : false,\r\n");
      out.write("\t\t\tsortName : 'seq',\r\n");
      out.write("\t\t\tsortOrder : 'asc',\r\n");
      out.write("\t\t\tfrozenColumns : [ [ {\r\n");
      out.write("\t\t\t\twidth : '200',\r\n");
      out.write("\t\t\t\ttitle : '资源名称',\r\n");
      out.write("\t\t\t\tfield : 'name'\r\n");
      out.write("\t\t\t} ] ],\r\n");
      out.write("\t\t\tcolumns : [ [ {\r\n");
      out.write("\t\t\t\twidth : '200',\r\n");
      out.write("\t\t\t\ttitle : '图标名称',\r\n");
      out.write("\t\t\t\tfield : 'iconCls'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '200',\r\n");
      out.write("\t\t\t\ttitle : '资源路径',\r\n");
      out.write("\t\t\t\tfield : 'url',\r\n");
      out.write("\t\t\t\tformatter : function(value, row) {\r\n");
      out.write("\t\t\t\t\tif(value){\r\n");
      out.write("\t\t\t\t\t\treturn sy.formatString('<span title=\"{0}\">{1}</span>', value, value);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '60',\r\n");
      out.write("\t\t\t\ttitle : '资源类型',\r\n");
      out.write("\t\t\t\tfield : 'syresourcetype',\r\n");
      out.write("\t\t\t\tformatter : function(value, row) {\r\n");
      out.write("\t\t\t\t\treturn value.name;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '150',\r\n");
      out.write("\t\t\t\ttitle : '创建时间',\r\n");
      out.write("\t\t\t\tfield : 'createdatetime',\r\n");
      out.write("\t\t\t\thidden : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '150',\r\n");
      out.write("\t\t\t\ttitle : '修改时间',\r\n");
      out.write("\t\t\t\tfield : 'updatedatetime',\r\n");
      out.write("\t\t\t\thidden : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '200',\r\n");
      out.write("\t\t\t\ttitle : '资源描述',\r\n");
      out.write("\t\t\t\tfield : 'description',\r\n");
      out.write("\t\t\t\tformatter : function(value, row) {\r\n");
      out.write("\t\t\t\t\tif(value){\r\n");
      out.write("\t\t\t\t\t\treturn sy.formatString('<span title=\"{0}\">{1}</span>', value, value);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '80',\r\n");
      out.write("\t\t\t\ttitle : '排序',\r\n");
      out.write("\t\t\t\tfield : 'seq',\r\n");
      out.write("\t\t\t\thidden : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\ttitle : '操作',\r\n");
      out.write("\t\t\t\tfield : 'action',\r\n");
      out.write("\t\t\t\twidth : '60',\r\n");
      out.write("\t\t\t\tformatter : function(value, row) {\r\n");
      out.write("\t\t\t\t\tvar str = '';\r\n");
      out.write("\t\t\t\t\t");
if (securityUtil.havePermission("/base/syresource!getById")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\tstr += sy.formatString('<img class=\"iconImg ext-icon-note\" title=\"查看\" onclick=\"showFun(\\'{0}\\');\"/>', row.id);\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
if (securityUtil.havePermission("/base/syresource!update")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\tstr += sy.formatString('<img class=\"iconImg ext-icon-note_edit\" title=\"编辑\" onclick=\"editFun(\\'{0}\\');\"/>', row.id);\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
if (securityUtil.havePermission("/base/syresource!delete")) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\tstr += sy.formatString('<img class=\"iconImg ext-icon-note_delete\" title=\"删除\" onclick=\"removeFun(\\'{0}\\');\"/>', row.id);\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\treturn str;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ] ],\r\n");
      out.write("\t\t\ttoolbar : '#toolbar',\r\n");
      out.write("\t\t\tonBeforeLoad : function(row, param) {\r\n");
      out.write("\t\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonLoadSuccess : function(row, data) {\r\n");
      out.write("\t\t\t\t$('.iconImg').attr('src', sy.pixel_0);\r\n");
      out.write("\t\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t<div id=\"toolbar\" style=\"display: none;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");
if (securityUtil.havePermission("/base/syresource!save")) {
      out.write("\r\n");
      out.write("\t\t\t\t<td><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-note_add',plain:true\" onclick=\"addFun();\">添加</a></td>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t<td><div class=\"datagrid-btn-separator\"></div></td>\r\n");
      out.write("\t\t\t\t<td><a onclick=\"redoFun();\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'ext-icon-resultset_next'\">展开</a><a onclick=\"undoFun();\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'ext-icon-resultset_previous'\">折叠</a></td>\r\n");
      out.write("\t\t\t\t<td><div class=\"datagrid-btn-separator\"></div></td>\r\n");
      out.write("\t\t\t\t<td><a onclick=\"grid.treegrid('reload');\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'ext-icon-arrow_refresh'\">刷新</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center',fit:true,border:false\">\r\n");
      out.write("\t\t<table id=\"grid\" data-options=\"fit:true,border:false\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
