/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.AccountService;

/**
 *
 * @author 794974
 */
public class newPasswordServlet extends HttpServlet {

  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uuid = request.getParameter("uuid");
       
        request.setAttribute("uuid", uuid);
            System.out.println(uuid);
        request.getRequestDispatcher("/WEB-INF/resetNewPassword.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        AccountService accountservice = new AccountService();
        String newpass = request.getParameter("newpass");
        String confirmpass = request.getParameter("confirmpass");
        String trigger = request.getParameter("getval");
        String  email = (String) session.getAttribute("email");
        String e = request.getParameter("resetemail");
        String uuid = request.getParameter("uuid");
        
        

        
        if(trigger.equalsIgnoreCase("update")){
            //System.out.println("trigger works");
            //System.out.println(email);
            System.out.println(e + ":" + uuid);
            //System.out.println(confirmpass);
            if(newpass.equals(confirmpass)){
                //System.out.println("password confirmation works");
                accountservice.changePassword(uuid, confirmpass);
                System.out.println(uuid + " " + confirmpass);
                request.setAttribute("confirmation",true);
                response.sendRedirect("login");
            }
        }
       
    }

}
