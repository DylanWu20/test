package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>欢迎页面</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\tSSHE示例项目是一个由Eclipse Kepler创建，Struts2.3.x+Spring3.2.x+Hibernate4.2.x+CXF2.7.x+EasyUI1.3.4+Maven架构的示例程序\r\n");
      out.write("\t<br /> 当前示例演示了包括：权限控制、超大附件文件上传、EasyUI基本组件使用等等功能，具体请自行看本示例演示功能\r\n");
      out.write("\t<br />SSHE框架环境需求：JAVA环境：JDK7+；数据库环境：oracle10g+/sqlserver2000+/mysql5+；WEB容器环境：jetty6+/tomcat6+；编译环境：maven：3.x+\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<a href=\"https://me.alipay.com/sypro\" target=\"_blank\"><img alt=\"捐助SSHE/SYPRO\" src=\"");
      out.print(contextPath);
      out.write("/style/images/alipay.jpg\" /></a>如果您觉得我的源码对您有帮助的话，请给我更有利的支持吧^_^\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<h1>\r\n");
      out.write("\t\t<a href=\"http://pan.baidu.com/share/home?uk=1526873401#category/type=0\" target=\"_blank\">源码下载(里面有很多分享，请进入SSHE示例项目文件夹进行下载)</a>\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t如果发现系统有BUG，请给我发Email:89333367@qq.com\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20131010\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>添加了一个WebService(CXF)的示例，请点击<a target=\"_blank\" href=\"");
      out.print(contextPath);
      out.write("/ws\">这里来查看</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20131009\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>更新了jetty插件的JAR包为最新版本</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20131003\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>改变了所有编辑功能页面的等待提示z-index级别，避免页面没有加载完毕，就点击了编辑按钮会出错的BUG</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20131001\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>新增了combobox/combogrid的一个扩展，用于检验用户autocomplete后的值是否存在与下拉列表中，如果不存在则认为用户输入无效</li>\r\n");
      out.write("\t\t<li>修正初始化数据库时，如果改动了资源或者机构的父节点，会初始化不成功的BUG</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130930\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>新增了combobox的autocomplete功能，在首页登录页面演示</li>\r\n");
      out.write("\t\t<li>新增了combogrid的自动补全功能，在首页登录页面演示</li>\r\n");
      out.write("\t\t<li>其他细节修改</li>\r\n");
      out.write("\t\t<li>一些BUG的修正</li>\r\n");
      out.write("\t\t<li>升级了所有能升级的JAR包</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130927\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>修正了角色管理，排序报错的问题</li>\r\n");
      out.write("\t\t<li>修正角色分布图表中，导出PDF格式显示不正确的问题</li>\r\n");
      out.write("\t\t<li>修正Highcharts导出JPEG图片时，后台报错的问题</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130926\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>修改了File404Filter的判断方式，尽量提升响应速度</li>\r\n");
      out.write("\t\t<li>修正了谷歌浏览器下，不能点击删除按钮的BUG</li>\r\n");
      out.write("\t\t<li>修正了某些情况下init数据库失效的问题</li>\r\n");
      out.write("\t\t<li>修正某些情况下机构删除出错的问题</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130925\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>修改了inc.jsp，引入版本号概念，避免IE缓存导致样式或JS不更新导致错误</li>\r\n");
      out.write("\t\t<li>tabs的tools添加文字提示</li>\r\n");
      out.write("\t\t<li>添加了官方演示示例和API等链接</li>\r\n");
      out.write("\t\t<li>更新了syExtCss.css样式</li>\r\n");
      out.write("\t\t<li>其他小细节修改</li>\r\n");
      out.write("\t\t<li>修改了上传文件的路径，便于部署项目后，上传的文件依然存在</li>\r\n");
      out.write("\t\t<li>修正了west没有滚动条的BUG</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130924\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>为图表功能增加了导出文件功能，可以导出为PNG/JPEG/PDF类型的文件</li>\r\n");
      out.write("\t\t<li>初始化数据库添加synchronized修饰符</li>\r\n");
      out.write("\t\t<li>修改默认日志级别</li>\r\n");
      out.write("\t\t<li>增加了tabs的演示，tabs可以选择上下左右显示</li>\r\n");
      out.write("\t\t<li>修正了几个页面的editable:false问题</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130923\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>修正了syExtEasyUI.js扩展中，idField/textField/parentField的命名错误问题</li>\r\n");
      out.write("\t\t<li>新增用户登录注销历史记录功能</li>\r\n");
      out.write("\t\t<li>演示了用户增加session属性时的监听示例，记录了用户登录、注销的相关信息</li>\r\n");
      out.write("\t\t<li>修正一些grid的显示问题</li>\r\n");
      out.write("\t\t<li>升级了struts2的版本到2.3.15.2</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130922\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>统计报表中，增加等待提示功能，避免用户看到白板</li>\r\n");
      out.write("\t\t<li>修正初始化数据库的时候，超级管理员没有赋予所有机构，导致他不能给他人分配机构的BUG</li>\r\n");
      out.write("\t\t<li>调节了一下grid中按钮显示的顺序</li>\r\n");
      out.write("\t\t<li>修正了用户管理中，给用户选择机构的时候，一个显示问题的BUG</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130921\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>修正，当添加资源时，url为空的时候，删除资源会发生删不掉的情况</li>\r\n");
      out.write("\t\t<li>修正，当执行初始化数据库功能时，以前添加的资源、角色会看不到的情况</li>\r\n");
      out.write("\t\t<li>默认配置了缓存静态内容、关闭了开发模式配置，如需改动请自行修改struts.xml的配置</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130920\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>增加了一个过滤器，用于用户上传的文件丢失时，返回一个默认的图片</li>\r\n");
      out.write("\t\t<li>修正了用户编辑和显示时，如果photo字段是空，会报错的问题</li>\r\n");
      out.write("\t\t<li>新增一个用户登录、注销监听器，二次开发时可以利用这个监听器做某些事情</li>\r\n");
      out.write("\t\t<li>优化了treegrid/datagrid的显示速度，增加了展开搜索刷新功能</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130918\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>添加了一个饼图的示例</li>\r\n");
      out.write("\t\t<li>更新了log4j的配置信息</li>\r\n");
      out.write("\t\t<li>更新了pom.xml，目前最新JAR包依赖</li>\r\n");
      out.write("\t\t<li>文件上传添加可配置上传路径参数</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130916\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>修正用户管理中，新增用户可以重复登录名的BUG</li>\r\n");
      out.write("\t\t<li>修正用户管理中，新增用户没有默认密码的BUG</li>\r\n");
      out.write("\t\t<li>修正用户管理中，编辑用户可以重复登录名的BUG</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130915\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>修正了文件上传后，回显路径不对的问题</li>\r\n");
      out.write("\t\t<li>修正了IE浏览器下，选择上传文件后，看不到删除按钮的问题</li>\r\n");
      out.write("\t\t<li>用户管理，增加了过滤条件功能</li>\r\n");
      out.write("\t\t<li>更新了一些预设图标显示</li>\r\n");
      out.write("\t\t<li>增加了一个图表示例</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\tSSHE v20130914\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>重构了2012年SSHE示例的所有代码，使类和文件更加清晰，便于管理</li>\r\n");
      out.write("\t\t<li>配置文件分离，不同功能放到不同的配置文件中</li>\r\n");
      out.write("\t\t<li>新增了文件上传的功能，演示在用户添加/编辑中，真实上传文件进度条</li>\r\n");
      out.write("\t\t<li>支持超大附件上传(理论上无限大附件)，演示系统有限制，请自行下载源码，修改其中配置；上传原理，利用plupload插件，将要上传的附件进行分块(分块大小取决于配置)；例如要上传一个1GB的附件，那么在上传的时候，plupload会自动进行文件切割，将1GB的文件分割成N小块，然后分批上传，避开了浏览器上传大附件的限制；最后全部上传成功后，在后台进行文件合并，将N块文件合并成正确的文件</li>\r\n");
      out.write("\t\t<li>升级了easyui版本到1.3.4，支持IE6/7/8/9/10/火狐/谷歌等浏览器</li>\r\n");
      out.write("\t\t<li>升级所有JAR包到最新</li>\r\n");
      out.write("\t\t<li>使用了jetty插件的SSHE项目可单独运行，不需要发布到WEB容器</li>\r\n");
      out.write("\t\t<li>尽可能的标注了更详细的注释</li>\r\n");
      out.write("\t\t<li>新增了项目监控功能</li>\r\n");
      out.write("\t\t<li>新增了机构管理</li>\r\n");
      out.write("\t\t<li>权限架构：一个用户可以属于多个角色，一个用户也可以属于多个机构；一个角色可以访问多个资源，一个机构也可以访问多个资源；</li>\r\n");
      out.write("\t\t<li>更新部署说明</li>\r\n");
      out.write("\t\t<li>还有一些其他细节更新</li>\r\n");
      out.write("\t</ul>\r\n");
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
