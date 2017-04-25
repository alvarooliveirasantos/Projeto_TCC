package br.uninove.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/*controller")
public class Controller extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tarefa = req.getParameter("tarefa");
		
		tarefa = "br.uninove.controller."+tarefa;
		try{
		Class<?> tipo = Class.forName(tarefa);
		Tarefa instancia =(Tarefa) tipo.newInstance();
		String pagina = instancia.executa(req, resp);
		RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
		dispatcher.forward(req, resp);
	    }
		catch (Exception e) {
			// TODO: handle exception
		}

	}}
