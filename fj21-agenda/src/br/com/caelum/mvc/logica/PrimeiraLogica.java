package br.com.caelum.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		System.out.println("Executa logica");
		
		RequestDispatcher rd = req.getRequestDispatcher("/primeira-logica.jsp");
		rd.forward(req, res);
	}

}
