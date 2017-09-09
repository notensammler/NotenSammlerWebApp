package de.edu.notecollect.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping(value="/welcome")
public class WelcomeController {

    final public static String MESSAGE = "message";

	@SuppressWarnings("unused")
	private final static Logger LOG = LoggerFactory.getLogger(WelcomeController.class);


    @Autowired
    public WelcomeController() {

    }

   	@RequestMapping(method= RequestMethod.GET)
	public String handleWelcome(
		HttpServletRequest request,
		ModelMap model)
	throws IOException {

		return null;
	}
}