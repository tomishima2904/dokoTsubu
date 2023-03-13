package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Login;
import model.LoginLogic;
import model.User;
/**
 * Servlet implementation class DokoTsubuServlet
 */
@WebServlet("/DokoTsubuServlet")
public class DokoTsubuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		// フォワード
		String forwardPath = "index.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String user_name = request.getParameter("user_name");
		String pass = request.getParameter("pass");

		// ログインしているユーザー名とパスワードをセッションスコープで保持
		User loginingUser = new User(user_name, pass);
		HttpSession session = request.getSession();
		session.setAttribute("loginingUser", loginingUser);
		
		// ログインできるかどうかを判断するモデル
		LoginLogic logic = new LoginLogic();
		
		// ログインに成功したかどうかをリクエストスコープで保持
		Login canLogin = new Login(logic.execute(loginingUser));
		request.setAttribute("canLogin", canLogin);
		
		// フォワード
		String forwardPath = "WEB-INF/jsp/loginResult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

}
