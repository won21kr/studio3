package org.craftercms.studio.controller.services.rest;

import java.util.Map;

import org.craftercms.studio.api.analytics.AnalyticsManager;
import org.craftercms.studio.api.dto.AnalyticsReport;
import org.craftercms.studio.api.dto.Context;
import org.craftercms.studio.api.exception.StudioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Handles the JSON API for Analytics module.
 */
@Controller
@RequestMapping("/api/1/analytics")
public class AnalyticsController {

    /**
     * Analytics Manager instance.
     */
    @Autowired
    private AnalyticsManager analyticsManager;

    /**
     * Default Ctr.
     */
    public AnalyticsController() {
    }

    /**
     * Interface to generate a report.
     *
     * @param site   Site on which the report is.
     * @param report Name of the Report to be Run
     * @param params Report specific Parameters
     * @return the result of the report, define in
     *         {@link AnalyticsManager#report(Context, String, String, java.util.Map)}
     */
    @RequestMapping(value = "/report/{site}/{report}",
            produces = "application/json",
            method = RequestMethod.GET)
    @ResponseBody
    public AnalyticsReport report(@PathVariable final String site,
                                  @PathVariable final String report,
                                  @MatrixVariable(pathVar = "report") Map<String, Object> paramsMatrixVars)
            throws StudioException

    {

        return this.analyticsManager.report(new Context(), site, report, paramsMatrixVars);
    }


}