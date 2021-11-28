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
import services.AccountService;

/**
 *
 * @author 794974
 */
public class resetPassword extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String uuid = request.getParameter("uuid");
        //System.out.println( "the uuid is " + uuid);
        
        
        
             request.getRequestDispatcher("/WEB-INF/reset.jsp").forward(request, response);
        
             
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        
        AccountService accountservice = new AccountService();
        String  trigger = request.getParameter("getval");
        String  email = request.getParameter("resetemail");
        String url = "http://localhost:8080/Demo11_JavaMail/newPassword";
        String path = getServletContext().getRealPath("/WEB-INF");
        
         
       
        if(trigger.equalsIgnoreCase("submit")  ){
            System.out.println("trigger works");
            if(email!=null || email !=""){
                System.out.println("email not null");
                accountservice.resetPassword(email, path, url);
               // System.out.println(email + " " + path +" "+ url);
            }else{
                request.setAttribute("emailerror",true);
            }
        }
      request.getRequestDispatcher("/WEB-INF/reset.jsp").forward(request, response);
        
    }

}
