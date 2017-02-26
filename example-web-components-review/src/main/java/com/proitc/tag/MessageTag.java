package com.proitc.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class MessageTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private String from;
	private String subject;

	@Override
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().write("from: " + from + " subject: " + subject);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Tag.EVAL_PAGE;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
