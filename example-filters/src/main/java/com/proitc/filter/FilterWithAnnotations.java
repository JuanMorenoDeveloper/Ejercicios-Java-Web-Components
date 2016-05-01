package com.proitc.filter;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "filterWithAnnotations", urlPatterns = { "/*" }, initParams = { @WebInitParam(name = "param3", value = "filterWithAnnotations") })
public class FilterWithAnnotations implements Filter {
	private String attribValue;
	private static final Logger log = Logger.getLogger(FilterWithAnnotations.class.getName());

	public FilterWithAnnotations() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		attribValue = filterConfig.getInitParameter("param3");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		log.info("Filtrando por url en filtro con anotaciones");
		request.setAttribute("param3", attribValue);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}

}
