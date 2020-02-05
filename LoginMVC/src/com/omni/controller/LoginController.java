package com.omni.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.omni.config.model.Users;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String uname,@RequestParam("password") String pass) {
		ModelAndView mv=new ModelAndView();
			if(uname.equals("admin")&& pass.equals("admin")) {
				System.out.println("Succesfully Logged in");
			
				mv.setViewName("login.jsp");
				mv.addObject("username",uname);
				return mv;
			
			}else {
				String str="Please Try Again";
				mv.setViewName("index.jsp");
				mv.addObject("errmsg", str);
			}
		mv.setViewName("index.jsp");
		return mv;
	}
	@RequestMapping("/")
	public void display(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		req.getRequestDispatcher("index.jsp").forward(req, res);
		
	}
	@RequestMapping("/register")
	public void registerDispatcher(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		req.getRequestDispatcher("register.jsp").forward(req, res);
		
	}
	@RequestMapping("/registeruser")
	@ResponseBody
	public String registerUser(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("country") String country) throws ServletException, IOException {
		
		Users user=new Users(id, name, country);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Users.class);
		
		SessionFactory factory=con.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
		
		return "User Added...";
		
	}

}
