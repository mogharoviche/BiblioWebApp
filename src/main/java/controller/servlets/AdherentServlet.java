package controller.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.AdherentDao;
import model.entity.Adherent;
import service.AdherentService;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Adh")
public class AdherentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdherentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the list of adherents using the DAO
	    ArrayList<Adherent> adhList = new AdherentDao().getAllAdherent();

	    // Set the adherents list as an attribute in the request
	    request.setAttribute("adherents", adhList);

	    // Forward the request and response to the JSP for rendering
	    this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Adherent.jsp").forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getData from user:
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String email = request.getParameter("email");
			//telephone to int :
			String telephone = request.getParameter("telephone");

		//Creat User Object:
			Adherent newAdherent = new Adherent(nom,prenom,email,telephone);
			AdherentService adhService =new AdherentService();
			adhService.registerUser(newAdherent);
		doGet(request, response);
	}

}
