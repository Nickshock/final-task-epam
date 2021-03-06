package com.epam.hotelbooking.command.common;

import com.epam.hotelbooking.command.Command;
import com.epam.hotelbooking.command.JspConstants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is show command which only returns jsp page.
 *
 * @author Nickolai Barysevich.
 */
public class ShowRegistrationCommand implements Command {

    private static final String REGISTRATION_ERROR = "registrationError";

    /**
     * Specifies message parameters and return registration.jsp.
     *
     * @param request  http request that was got from browser
     * @param response http response that should be sent to browser
     * @return registration.jsp.
     */
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String registrationError = request.getParameter(REGISTRATION_ERROR);
        request.setAttribute(REGISTRATION_ERROR, registrationError);

        return JspConstants.REGISTRATION_JSP;
    }


}
