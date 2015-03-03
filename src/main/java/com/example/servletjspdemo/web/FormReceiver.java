package com.example.servletjspdemo.web;
import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.servlet.http.HttpSessionEvent;



@WebServlet("/FormReceiver")
	public class FormReceiver extends HttpServlet {
		private static final long serialVersionUID = 1L;
		public FormReceiver() {
			super();
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ArrayList<Person> persons = new ArrayList<Person>(5);
			
			String[] radioValues = new String[5];
			radioValues[0] = "Ogloszenie z pracy";
			radioValues[1] = "Ogloszenie na uczelni";
			radioValues[2] = "Facebook";
			radioValues[3] = "Znajomi";
			radioValues[4] = "Inne:";
			
			PrintWriter out = response.getWriter();
			
			int id = 1;
			
			try{
				if(persons.size() == 5){
					out.println("Brak dostepnych miejsc");
				}else{
					if(request.getSession(false) == null){
						
						out.println("Witaj poraz pierwszy.");
						String name		=	request.getParameter("name");
						String surname	=	request.getParameter("surname");
						String email	=	request.getParameter("email");
						String employer	=	request.getParameter("employer");
						int radioChoise	= 	Integer.parseInt(request.getParameter("radio"));
						String whatDo	=	request.getParameter("whatDo");
						
						Person person = new Person(id,  name, surname, email, employer, radioValues[radioChoise], whatDo);
						
						try{
							persons.add(person);
						}catch(ArrayIndexOutOfBoundsException e){
							out.println("Niestety lista gości zamknięta. Brak wolnych miejsc.");
						}
						
						
						id++;
												
						HttpSession session = request.getSession(true);	
						out.println(persons.get(0).getName());
					}else{
				        out.println("Niestety jestes juz zarejestrowany.");
					}
				}}finally{
					
				}
				
			}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		}
		
		
}

		
