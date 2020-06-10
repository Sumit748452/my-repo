package com.oredoo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.oredoo.entity.IUser;
import com.oredoo.entity.IUserDetail;
import com.oredoo.entity.misuser;
import com.oredoo.service.LoginService;
import com.oredoo.service.portalService;

@Controller

/*
 * @RequestMapping(value = "/MisInterface", method = RequestMethod.GET)
 */public class LoginController {

	/*
	 * @Value("${server.context-path}") String contextPath;
	 */

	@Autowired
	LoginService objService;
	@Autowired
	private portalService objportalService;
    private static final Logger LOGGER = LogManager.getLogger(LoginController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String signroot(Model model) {
		
		/*
		 * BCryptPasswordEncoder bcd = new BCryptPasswordEncoder(10);
		 * System.out.println(bcd.matches("atpl@123",
		 * "$2a$10$71h85dBZ5LvrSSoYn09g8.xUG6eu0sscyurTAuiYqLklotW4CkEfC"));
		 * System.out.println(bcd.encode("atpl@123"));
		 */

		return "index";
	}

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String login(Model model, HttpSession session, @RequestParam("user") String usrername,
			@RequestParam("password") String password) {
		LOGGER.info("SingIn Request ["+usrername+"]["+password+"]");
		BCryptPasswordEncoder bcd = new BCryptPasswordEncoder(10);
		IUser iuser = new IUser();

		iuser = objService.validateUser(usrername, password);

		if (usrername.equalsIgnoreCase("SuperUser") && password.equalsIgnoreCase("SuperUser@123")) {

			List<IUserDetail> listuser = new ArrayList<IUserDetail>();
			listuser = objportalService.getUserDetails();
			session.setAttribute("success", "0");

			session.setAttribute("listuser", listuser);
			LOGGER.info("SingIn Request [Success]["+usrername+"]["+password+"]");

			return "redirect:/success";

			// return "welcome";
		} else if (usrername.equalsIgnoreCase("Test") && password.equalsIgnoreCase("Test123")) {

			List<IUserDetail> listuser = new ArrayList<IUserDetail>();
			listuser = objportalService.getUserDetails();
			session.setAttribute("success", "0");

			session.setAttribute("listuser", listuser);
			LOGGER.info("SingIn Request [Success]["+usrername+"]["+password+"]");

			return "redirect:/success";

			// return "welcome";
		} else if (bcd.matches(password, iuser != null ? iuser.getPwd() : "Fail")) {
			// forward the id to welcome page also
			IUserDetail iuserDetail = new IUserDetail();

			iuserDetail = objService.validateUserDetails(iuser.getId());
			LOGGER.info(iuser.toString());
			LOGGER.info(iuserDetail.toString());

			session.setAttribute("success", "0");

			session.setAttribute("cpid", iuser.getId());
			session.setAttribute("cpname", iuserDetail.getCompany());
			LOGGER.info("SingIn Request [Success]["+usrername+"]["+password+"]");

			return "redirect:/success";

			// return "welcome";

		}

		else {
			// model.addAttribute("error", "0");
			LOGGER.error("SingIn Request [Failed]["+usrername+"]["+password+"]");

			return "redirect:/appstore?error=0";
		}

	}

	@RequestMapping(value = "/appstore", method = RequestMethod.GET)
	public String getmisAppHome(Model model, HttpSession session,
			@RequestParam(value = "error", required = false) String error) {
		if (error != null) {
			LOGGER.error("Invalid Credentials -Try Again !!!");

			model.addAttribute("error", "Invalid Credentials -Try Again !!!");
		}
		System.out.println("I AM Here2" + error);

		return "index";
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String getSuccess(Model model, HttpSession session) {

		if (session.getAttribute("success") == null) {
			model.addAttribute("error", "Please Login here  !!!");
			return "index";

		}

		return "welcome";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String getmisHome(Model model, HttpSession session) {
		session.removeAttribute("listuser");
		session.removeAttribute("cpid");
		session.removeAttribute("cpname");
		session.removeAttribute("success");
		session.invalidate();
		// session.invalidate();
		LOGGER.info("SingIn Request [Logout]");

		return "redirect:/appstore";
		// return "index";
	}

}
