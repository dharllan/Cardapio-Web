package controle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/enviarListaItem")

public class servletListaItem extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		StringBuffer sb = new StringBuffer();
		String linha = null;
		
		try {
			BufferedReader reader = req.getReader();
			while ((linha = reader.readLine()) != null) {
				
				sb.append(linha);
			}
			
			
		} catch (Exception e) {
			System.out.println(sb.toString().replace("null,",""));
			HttpSession sessao = req.getSession();
			sessao.setAttribute("lista-item-json", sb.toString().replace("null,",""));
			
			PrintWriter out = resp.getWriter();
			out.print("form-cliente.jsp");
			
		}
		
	}

}






