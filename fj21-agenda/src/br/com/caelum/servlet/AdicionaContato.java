package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;


public class AdicionaContato extends HttpServlet {
	private static final long serialVersionUID = 2905278671952420595L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String dataEmTexto = "10/10/2011";
		Calendar dataNascimento = null;
		
		java.util.Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (java.text.ParseException e) {
			out.println("Erro");
			return;
		}
	//String dataTexto = request.getParameter("data");
	
	//Monta objeto
	Contato c = new Contato();
	c.setNome(nome);
	c.setEmail(email);
	c.setDataNascimento(dataNascimento);
	
	ContatoDAO dao = new ContatoDAO();
	dao.adiciona(c);
	
	RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
	rd.forward(request, response);
	
	//imprime
	//out.println("<html>");
	//out.println("<body><br/>");
	//out.println("Contato <b>" + c.getNome() + "</b> adicionado com sucesso!!<br/>");
	//out.println("</body>");
	//out.println("</html>");
	}
}
