package de.edu.notecollect.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExceptionPresenter implements HandlerExceptionResolver, Ordered {

	final private static Logger LOG = LoggerFactory.getLogger(ExceptionPresenter.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
	Object handler, Exception ex) {
        /*we must change the status to 200 otherwise we will get a nice html page from the apache which is not
         desired for a client that only understands json */
		response.setStatus(200);
        LOG.info("encountered an exception while calling a controller", ex);
		return new ModelAndView("exception_page", "exception", ex); //looks for a view with appropriate content type
	}

	@Override
	public int getOrder() {
		return 1;
	}
}