package com.test.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * Servlet�̶�?
 * 
 * Servlet interface�� implement�Ͽ� ������ �ڹ� Ŭ����
 * �������� ������ ������ ���� �������ϸ�, ���� ����ڿ� ���� ȣ��� �� �ֵ�.
 * 
 * �ڵ����� ������ ������ �ϱ⶧���� ! ��Ƽ������ ���ۿ� ���ؼ� ������ �˴ϴ�.
 * 
 * 
 * ������ �ۼ� ��Ģ
 *  + ������ javax.servlet.http.HttpServlet Ŭ������ ����ؾ��Ѵ�.
 *  + doGet �Ǵ� doPost �޼��� �ȿ� Ŭ���̾�Ʈ�� ��û�� ���� �� ó������ �� �ϵ��� ���.
 *  + doGet �Ǻz doPost�� �ι�° �ڸ� �̿��Ͽ� html ������ ����ϴµ� �̿��Ѵ�. (HttpServleResponse) 
 *  
 *  + HttpServletRequest : ������� ������ ������ ������ �����ϴ� ��ü
 *   . �Ķ������ �̸��� ��
 *   . ����� ��ǻ�� �̸�
 *   . ��û�޴� ������ �̸�
 *   . input type �� ������
 *   . �޼ҵ� : getParameterValues(), getPrameter(), getRemoteHost(), getServerName()
 *   
 *   
 *  + HttpServletRespose : �������� ���� ������ "��ȣȭ" �ؼ� ����ڿ��� �����ϴ� ��ü
 *   . �������� ���Ǵ� content�� ����
 *   . �������� ���Ǵ� content�� Ÿ��, ȭ�鿡 ����ؾ� �� ��� ��                                                         
 *   . �޼ҵ� : setContentType(String type) , setContentLength(int length), getWriter()
 *   
 *   
 * 
 * */

@WebServlet("/Sev01")
public class Servlet_Demo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet_Demo01() {
        super();
    }

	//request : Ŭ���̾�Ʈ�� ��û �� / response : �������� ����ڿ���
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}