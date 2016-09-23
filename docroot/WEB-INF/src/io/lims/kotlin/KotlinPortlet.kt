package io.lims.kotlin

import com.liferay.portal.kernel.log.LogFactoryUtil
import com.liferay.util.bridges.mvc.MVCPortlet
import javax.portlet.RenderRequest
import javax.portlet.RenderResponse

class KotlinPortlet: MVCPortlet() {

    // Log
    private val log = LogFactoryUtil.getLog(KotlinPortlet::class.java)

    override fun doView(renderRequest: RenderRequest?, renderResponse: RenderResponse?) {

        // Data can read from kotlin objects
        val cats = Cats.names

        // Log
        log.info(Cats.names)

        // Pass cats to JSP
        renderRequest?.setAttribute("cats", cats)

        include("/html/view.jsp", renderRequest, renderResponse)
    }
}