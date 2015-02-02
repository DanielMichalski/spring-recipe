package pl.dmichalski.c06_02.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

/**
 * Author: Daniel
 */
public class CityServiceRequestFilter implements Filter {

    private CityServiceRequestAuditor cityServiceRequestAuditor;

    @Override
    public void init(FilterConfig filterConfig)
            throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        Map<String, String[]> parameterMap = servletRequest.getParameterMap();
        cityServiceRequestAuditor.log(parameterMap);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }

    public void setCityServiceRequestAuditor(CityServiceRequestAuditor cityServiceRequestAuditor) {
        this.cityServiceRequestAuditor = cityServiceRequestAuditor;
    }

}
