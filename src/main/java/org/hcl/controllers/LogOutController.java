package org.hcl.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogOutController {

	@GetMapping("userLogout")
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		request.getSession().invalidate();
		return "redirect:/login";
	}

	@GetMapping("adminLogout")
	public String adminLogout(HttpServletRequest request) {
		request.getSession().removeAttribute("admin");
		request.getSession().invalidate();
		return "redirect:/adminFront";

	}
}