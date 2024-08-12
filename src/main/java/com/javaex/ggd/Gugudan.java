package com.javaex.ggd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ggd")		 //임의로 정한 이름(가상으로 준 주소. 주소창에 jsp부분)
public class Gugudan extends HttpServlet {
	
	//필드
	private static final long serialVersionUID = 1L;
       
    
    
	//생성자
	
	//메서드 gs
	
	
	//메서드 일반
	
	//인터넷이 실행되면 doGet으로 읽어옴
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//구구단 출력하는 코드 짜는곳
		System.out.println("doGet() 실행");
		
		int dan = Integer.parseInt(request.getParameter("dan"));    
		
		System.out.println(dan);
		
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<h1>servlet</h1> ");
		writer.println("<table border=\"1\">");
		writer.println("	<tbody>");
		
		for(int i=1; i<=9; i++) {
		
		writer.println("		<tr>");
		writer.println("			<td>" + dan + "</td>");
		writer.println("			<td>" + i + "</td>");
		writer.println("			<td>" + dan*i + "</td>");
		writer.println("		</tr>");
		
		}
		
		writer.println("	</tbody>");
		writer.println("<table>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
