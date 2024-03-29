package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutdeveloper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>iNotes</title>\n");
      out.write("    <!-- Meta -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"Responsive HTML5 Website landing Page for Developers\">\n");
      out.write("    <meta name=\"author\" content=\"3rd Wave Media\">\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,300italic,400italic' rel='stylesheet'\n");
      out.write("        type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"font-awesome/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("    <!-- github acitivity css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/octicons/2.0.2/octicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://caseyscarborough.github.io/github-activity/github-activity-0.1.0.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Lato', arial, sans-serif;\n");
      out.write("            color: #434343;\n");
      out.write("            background: #dae3e7;\n");
      out.write("            font-size: 16px;\n");
      out.write("            -webkit-font-smoothing: antialiased;\n");
      out.write("            -moz-osx-font-smoothing: grayscale;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1,\n");
      out.write("        h2,\n");
      out.write("        h3,\n");
      out.write("        h4,\n");
      out.write("        h5,\n");
      out.write("        h6 {\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("            font-weight: 700;\n");
      out.write("            color: #778492;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            color: #3aaa64;\n");
      out.write("            -webkit-transition: all 0.4s ease-in-out;\n");
      out.write("            -moz-transition: all 0.4s ease-in-out;\n");
      out.write("            -ms-transition: all 0.4s ease-in-out;\n");
      out.write("            -o-transition: all 0.4s ease-in-out;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("            color: #5f6b77;\n");
      out.write("            color: #2d844e;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn,\n");
      out.write("        a.btn {\n");
      out.write("            -webkit-transition: all 0.4s ease-in-out;\n");
      out.write("            -moz-transition: all 0.4s ease-in-out;\n");
      out.write("            -ms-transition: all 0.4s ease-in-out;\n");
      out.write("            -o-transition: all 0.4s ease-in-out;\n");
      out.write("            font-family: 'Montserrat', arial, sans-serif;\n");
      out.write("            padding: 8px 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn .fa,\n");
      out.write("        a.btn .fa {\n");
      out.write("            margin-right: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:focus,\n");
      out.write("        a.btn:focus {\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a.btn-cta-primary,\n");
      out.write("        .btn-cta-primary {\n");
      out.write("            background: #54ba4e;\n");
      out.write("            border: 1px solid #54ba4e;\n");
      out.write("            color: #fff;\n");
      out.write("            font-weight: 600;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a.btn-cta-primary:hover,\n");
      out.write("        .btn-cta-primary:hover {\n");
      out.write("            background: #49ac43;\n");
      out.write("            border: 1px solid #49ac43;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a.btn-cta-secondary,\n");
      out.write("        .btn-cta-secondary {\n");
      out.write("            background: #479fc8;\n");
      out.write("            border: 1px solid #479fc8;\n");
      out.write("            color: #fff;\n");
      out.write("            font-weight: 600;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a.btn-cta-secondary:hover,\n");
      out.write("        .btn-cta-secondary:hover {\n");
      out.write("            background: #3893bd;\n");
      out.write("            border: 1px solid #3893bd;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .text-highlight {\n");
      out.write("            color: #32383e;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .label-theme {\n");
      out.write("            background: #3aaa64;\n");
      out.write("            font-size: 12px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a.dotted-link {\n");
      out.write("            border-bottom: 1px dotted #778492;\n");
      out.write("            color: #778492;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a.dotted-link:hover {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #49515a;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header {\n");
      out.write("            padding: 30px 0;\n");
      out.write("            background: #f5f5f5;\n");
      out.write("            border-top: 10px solid #778492;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header .btn {\n");
      out.write("            margin-top: 60px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header .profile-image {\n");
      out.write("            margin-right: 30px;\n");
      out.write("            width: 300px;\n");
      out.write("            height: 300px;\n");
      out.write("            border-radius: 300px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header .profile-content .name {\n");
      out.write("            color: #49515a;\n");
      out.write("            font-size: 38px;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header .profile-content .desc {\n");
      out.write("            color: #778492;\n");
      out.write("            font-family: \"Lato\", arial, sans-serif;\n");
      out.write("            font-weight: 400;\n");
      out.write("            font-size: 24px;\n");
      out.write("            margin-top: 0;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header .profile-content .social a {\n");
      out.write("            background: #b0b7bf;\n");
      out.write("            width: 36px;\n");
      out.write("            height: 36px;\n");
      out.write("            display: inline-block;\n");
      out.write("            -webkit-border-radius: 50%;\n");
      out.write("            -moz-border-radius: 50%;\n");
      out.write("            -ms-border-radius: 50%;\n");
      out.write("            -o-border-radius: 50%;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            -moz-background-clip: padding;\n");
      out.write("            -webkit-background-clip: padding-box;\n");
      out.write("            background-clip: padding-box;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header .profile-content .social a:hover {\n");
      out.write("            background: #778492;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header .profile-content .social a .fa {\n");
      out.write("            font-size: 20px;\n");
      out.write("            padding-top: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* ======= Sections======= */\n");
      out.write("        .sections-wrapper {\n");
      out.write("            padding-top: 60px;\n");
      out.write("            padding-bottom: 60px;\n");
      out.write("            padding-left: 300px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section {\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section .section-inner {\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 30px;\n");
      out.write("            width: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section .heading {\n");
      out.write("            margin-top: 0;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("            color: #545e69;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .section .content .more-link .fa {\n");
      out.write("            margin-right: 5px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- ******HEADER****** -->\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <img class=\"profile-image img-responsive pull-left\" src=\"https://media-exp1.licdn.com/dms/image/C4E03AQF-vAVfmf-9xA/profile-displayphoto-shrink_800_800/0/1592166890729?e=1628726400&v=beta&t=zIsw6KCC61JO8HS5w245mbDI2DvYwnk5-DbCa3BgiPc\" alt=\"James Lee\" />\n");
      out.write("            <div class=\"profile-content pull-left\">\n");
      out.write("                <h1 class=\"name\">Hardik Rawat</h1>\n");
      out.write("                <h5 class=\"desc\">Android Developer • Electronics Engineer</h2>\n");
      out.write("                    <ul class=\"social list-inline\">\n");
      out.write("                        <li><a href=\"https://www.facebook.com/hardik.rawat.1999\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"https://www.instagram.com/hardik.rawat.1999/\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"https://www.linkedin.com/in/hardikrawat/\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                        <li><a href=\"https://github.com/hardikrawat\"><i class=\"fa fa-github-alt\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--//profile-->\n");
      out.write("            <a class=\"btn btn-cta-primary pull-right\" href=\"mailto: hardik.education963@gmail.com\" target=\"_blank\">\n");
      out.write("                Contact Me</a>\n");
      out.write("        </div>\n");
      out.write("        <!--//container-->\n");
      out.write("    </header>\n");
      out.write("    <!--//header-->\n");
      out.write("\n");
      out.write("    <div class=\"container sections-wrapper\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"primary col-md-8 col-sm-12 col-xs-12\">\n");
      out.write("                <section class=\"about section\">\n");
      out.write("                    <div class=\"section-inner\">\n");
      out.write("                        <h2 class=\"heading\">About Me</h2>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <p> > This Product - iNotes (an online notes portal) is Designed and Developed by Me.<br>\n");
      out.write("                                <br>\n");
      out.write("                                > <strong>Explore my other Projects:</strong> <br><br>\n");
      out.write("\n");
      out.write("                                <B>1) Student Plus – Android App on Google Play Store</B>\n");
      out.write("                                Technologies Used: Android Java, XML for UI/UX, Android SQLite\n");
      out.write("                                Description: This product is an Android Application, made by a team of three students.\n");
      out.write("                                It has Five section to ease study,\n");
      out.write("                                they are: Study Material, Exam Results, Basic Tools (like Calculator, Resistance Calc.,\n");
      out.write("                                Unit Convertor, etc.), Tools Plus (like\n");
      out.write("                                Notepad, Study Alarm, Drawing Tool, Todo Tasks, QR Scanner) and Quiz Section. The app\n");
      out.write("                                also has the feature of “Quick\n");
      out.write("                                Access” to directly navigate through the whole application.\n");
      out.write("                                <br>\n");
      out.write("                                Download URL: <a\n");
      out.write("                                    href=\"https://play.google.com/store/apps/details?id=hrworks.innovations.studentplus\">Here</a>\n");
      out.write("                                <br><br>\n");
      out.write("                                <B>2) WordPad++ – The Enhanced Word Processor</B>\n");
      out.write("                                Technologies Used: Java SE, Java Swing and AWT for UI/UX.\n");
      out.write("                                Description: This product is a Software Application which can run on Windows and Linux\n");
      out.write("                                (Tested). This Application has\n");
      out.write("                                three modules, they are: Normal Word Processing Mode, Code Editing Mode and Image\n");
      out.write("                                Processing Mode. All three modes\n");
      out.write("                                have their own internal rich sub-features.\n");
      out.write("                                <br>\n");
      out.write("                                Download URL:<a href=\"https://github.com/hardikrawat\">Here</a>\n");
      out.write("                                <br><br>\n");
      out.write("                                <B>3) Arduino Based Basic Mobile Phone</B>\n");
      out.write("                                Technologies Used: C for Arduino and NodeMCU, Internet of Things, Digital Electronics,\n");
      out.write("                                Google Firebase\n");
      out.write("                                Description: This product is an attempt to implement theoretical electronics knowledge\n");
      out.write("                                to practical works. It has three\n");
      out.write("                                Modes, they are: The Calculator Mode (Arduino + Keypad + 16x2 LCD), The Calling Mode (no\n");
      out.write("                                Internet/Sim required) and\n");
      out.write("                                Cloud-Save Mode (NodeMCU + Keypad + Google Firebase).\n");
      out.write("                                <br><br>\n");
      out.write("                                <B>4) Advance Bus Detailing and Auto SMSing System</B>\n");
      out.write("                                Technologies Used: C for Arduino, NodeMCU, Embedded System, Digital Electronics,\n");
      out.write("                                Internet of Things\n");
      out.write("                                Description: This product is created to replace the Old Announcement Bus Detailing\n");
      out.write("                                Mechanism of colleges. In this we\n");
      out.write("                                developed a display board consisting of the WS2811 LED STRIPS and a home made seven\n");
      out.write("                                segment display to display the\n");
      out.write("                                area(route) and the bus number moving to that particular area. we also designed the\n");
      out.write("                                mechanism to send message to all\n");
      out.write("                                the students (which are registered in our database), before regular completion of\n");
      out.write("                                college (15 min.)and until the buses\n");
      out.write("                                starts moving out of the college and if there is any issue regarding sending message due\n");
      out.write("                                to network problem then it will\n");
      out.write("                                go on (retry) sending the message again and again until the message is received by the\n");
      out.write("                                student whose details are stored\n");
      out.write("                                in the database.\n");
      out.write("                                <br> <br>\n");
      out.write("                                <B>+ 2 more projects</B>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <!--//content-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--//section-inner-->\n");
      out.write("                </section>\n");
      out.write("                <!--//section-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
