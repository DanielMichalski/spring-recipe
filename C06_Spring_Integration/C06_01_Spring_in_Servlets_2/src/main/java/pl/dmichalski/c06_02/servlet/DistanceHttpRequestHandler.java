package pl.dmichalski.c06_02.servlet;

import org.springframework.web.HttpRequestHandler;
import pl.dmichalski.c06_02.service.CityService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: Daniel
 */
public class DistanceHttpRequestHandler implements HttpRequestHandler {

    private CityService cityService;

    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        if (httpServletRequest.getMethod().toUpperCase().equals("POST")) {
            String srcCity = httpServletRequest.getParameter("srcCity");
            String destCity = httpServletRequest.getParameter("destCity");
            double distance = cityService.findDistance(srcCity, destCity);
            httpServletRequest.setAttribute("distance", distance);
        }
        forward(httpServletRequest, httpServletResponse);

    }

    private void forward(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/distance.jsp");
        dispatcher.forward(req, resp);
    }

    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }
}
