package org.hcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.User;
import org.hcl.services.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	@RequestMapping("front")
	public String addUserFront(Model model) {
		model.addAttribute("userDetails", new User());
		return "userregn";
	}

	@PostMapping("add")
	public String addUser(@ModelAttribute("userDetails") User user, Model model) {
		try {
			registrationService.validateUser(user);
			registrationService.doesUserExists(user);
			registrationService.addUser(user);
			return "registered";

		} catch (ApplicationException e) {
			model.addAttribute("error", e.getMessage());
			return "userregn";
		}

	}
}