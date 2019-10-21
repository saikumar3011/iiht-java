package com.springboot.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
@RequestMapping(value = "/stdLogin",method = RequestMethod.GET)
public String home()
{
return "Admin";
}

@RequestMapping(value="/welcome", method=RequestMethod.GET)
public String welcome()
{
	return "welcome";
}
@RequestMapping(value = "/Adminlogin",method = RequestMethod.GET)
public String adminlogoin(HttpServletRequest req)
{
String username = req.getParameter("uname");
String password= req.getParameter("pass");
if(username.equals("sai") && password.equals("739646"))
{
return "welcome";
}
else
{
return "Admin";
}
}
}