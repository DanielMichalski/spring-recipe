package pl.dmichalski.c06_03.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pl.dmichalski.c06_03.form.DistanceForm;
import pl.dmichalski.c06_03.service.CityService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: Daniel
 */
public class DistanceAction extends Action {

    private CityService cityService;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        if (request.getMethod().equals("POST")) {
            DistanceForm distanceForm = (DistanceForm) form;
            String srcCity = distanceForm.getSrcCity();
            String destCity = distanceForm.getDestCity();

            double distance = cityService.findDistance(srcCity, destCity);
            request.setAttribute("distance", distance);
        }
        return mapping.findForward("success");
    }

    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }
}
