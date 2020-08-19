/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ZY
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
                //定义变量用于接收表单的值
		String username = request.getParameter("username");
		String email = request.getParameter("eamil");
		String age = request.getParameter("age");
		String time = request.getParameter("time");
		String[] os = request.getParameterValues("os");
		String[] language = request.getParameterValues("language");
		String advise = request.getParameter("advice");
		out.print("姓名："+username);
		out.print("<br>");
		out.print("email:&nbsp;"+email);
		out.print("<br>");
		out.print("年龄："+age);
		out.print("<br>");
		out.print("编程时间："+time);
		out.print("<br>");
		out.print("使用的操作系统：");
		for(int i = 0;i<os.length;i++){
			out.print(os[i]+"&nbsp;&nbsp;&nbsp;");
		}
                out.print("<br>");
		out.print("使用的编程语言：");
		for(int s = 0;s<language.length;s++){
			out.print(language[s]+"&nbsp;&nbsp;&nbsp;");
		}
		out.print("<br>");
		out.println("建议："+ advise);
		out.flush();
		out.close();
	}
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
