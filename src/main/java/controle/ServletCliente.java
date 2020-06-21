package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;

@WebServlet(urlPatterns = "/servletCliente")
public class ServletCliente extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//super.doPost(req, resp);
	req.setCharacterEncoding("UTF-8");
	
	Cliente cliente = new Cliente();
	cliente.setNome(req.getParameter("nome"));
	cliente.setTelefone(req.getParameter("telefone"));
	cliente.setCidade(req.getParameter("cidade"));
	cliente.setEndereco(req.getParameter("endere�o"));
	
	System.out.println(cliente.toString());
}
}