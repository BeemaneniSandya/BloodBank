package org.hcl.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.Admin;
import org.hcl.models.DonateBlood;
import org.hcl.models.RequestBlood;
import org.hcl.services.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping("adminFront")
	public String adminLogin(Model model) {
		model.addAttribute("Adminlogin", new Admin());
		return "admin_login";
	}

	@PostMapping("adminValid")
	public String validateAdmin(@ModelAttribute("Adminlogin") Admin admin, Model model, HttpServletRequest request) {
		try {
			adminService.validateAdmin(admin);
			request.getSession().setAttribute("admin", admin);
			return "redirect:/adminRequestList";

		} catch (ApplicationException e) {
			model.addAttribute("error", e.getMessage());
			return "admin_login";
		}

	}

	@RequestMapping("adminRequestList")
	public String getRequestList(Model model, HttpServletRequest request) {
		Admin admin = (Admin) request.getSession().getAttribute("admin");

		if (admin != null) {
			List<RequestBlood> requestAdminList = adminService.getRequestList();
			if (requestAdminList.size() > 0) {

				model.addAttribute("requestAdminList", requestAdminList);
				return "admin_home";
			} else {
				model.addAttribute("message", "No accept requests to show.");
				return "admin_home";
			}

		} else {
			return "redirect:/adminFront";
		}
	}

	@RequestMapping("approveRequest/{patientId}")
	public String approveRequest(@PathVariable("patientId") long patientId, HttpServletRequest request) {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin != null) {
			adminService.acceptRequest(patientId);
			return "redirect:/adminRequestList";
		} else {
			return "redirect:/adminFront";
		}

	}

	@RequestMapping("rejectRequest/{patientId}")
	public String rejectRequest(@PathVariable("patientId") long patientId, HttpServletRequest request) {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin != null) {
			adminService.rejectRequest(patientId);
			return "redirect:/adminRequestList";
		} else {
			return "redirect:/adminFront";
		}

	}

	@RequestMapping("adminDonarList")
	public String getDonarList(Model model, HttpServletRequest request) {
		Admin admin = (Admin) request.getSession().getAttribute("admin");

		if (admin != null) {
			List<DonateBlood> donateAdminList = adminService.getDonarList();
			if (donateAdminList.size() > 0) {

				model.addAttribute("donateAdminList", donateAdminList);
				return "admin_donar";
			} else {
				model.addAttribute("message", "No accept requests to show.");
				return "admin_donar";
			}
		} else {
			return "redirect:/adminFront";
		}

	}

	@RequestMapping("approveDonar/{patientId}")
	public String acceptDonar(@PathVariable("patientId") long patientId, HttpServletRequest request) {
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if (admin != null) {
			adminService.acceptDonar(patientId);
			return "redirect:/adminDonarList";
		} else {
			return "redirect:/adminFront";

		}
	}

	@RequestMapping("rejectDonar/{patientId}")
	public String rejectDonar(@PathVariable("patientId") long patientId, HttpServletRequest request) {
		Admin admin = (Admin) request.getSession().getAttribute("admin");

		if (admin != null) {
			adminService.rejectDonar(patientId);
			return "redirect:/adminDonarList";
		} else {
			return "redirect:/adminFront";

		}

	}

}