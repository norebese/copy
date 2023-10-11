package com.kh.contorller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class requestGetServlet
 */
@WebServlet("/test1.do")
public class requestGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public requestGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get방식으로 요청시 해당 doGet메소드가 저절로 호출된다.
		
		//System.out.println("GET요청 정상적으로 받았습니다.");
		
		/**
		 * 첫번째 매개변수인 request에는 요청시 전달된 내용들 담겨있음(사용자가 입력한 값, 요천전송방식, 요청자의 ip주소 등등)
		 * 두번째 매개변수인 response는 요청 처리 후 응답할 때 사용되는 객체
		 * 
		 * 요청 처리를 위해서 요청시 전달된 값들 추출
		 * request의 parameter 영역 안에 존재 (키=벨류 세트로 담겨있음)
		 * 
		 * 따라서 request의 parameter영역으로부터 전달된 데이터 추출하는 메소드
		 * >request.getParameter("키") : String 
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
