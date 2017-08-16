package br.com.fabricadeprogramador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ClienteServlet() {
		System.out.println("Contruindo o servlet...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Inicializando o servlet...");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamou o método service...");
		super.service(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("Destruindo o servlet...");
		super.destroy();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamou pelo método GET.");
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Chamou pelo método GET.");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamou pelo método POST.");
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print("Chamou pelo método POST.");
	}

}
