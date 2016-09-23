package io.lims.kotlin

import com.liferay.portal.kernel.log.LogFactoryUtil
import com.liferay.portal.kernel.util.ParamUtil
import com.liferay.util.bridges.mvc.MVCPortlet
import io.lims.kotlin.service.generated.service.CatLocalServiceUtil
import javax.portlet.ActionRequest
import javax.portlet.ActionResponse
import javax.portlet.RenderRequest
import javax.portlet.RenderResponse

class KotlinPortlet: MVCPortlet() {

    // Log
    private val log = LogFactoryUtil.getLog(KotlinPortlet::class.java)

    /**
     * This method is called whenever the view is rendered
     *
     * @param renderRequest  RenderRequest
     * @param renderResponse RenderResponse
     */
    override fun doView(renderRequest: RenderRequest?, renderResponse: RenderResponse?) {

        // Get cats from database
        val cats = CatLocalServiceUtil.getCats(0, 100)

        // Pass cats to JSP
        renderRequest?.setAttribute("cats", cats)

        // Just logging some cat names to show that Kotlin objects work too
        log.info("Cats: ${Cats.names}")

        // Here we are showing that extension works too.
        // RenderRequest has no `themeDisplay()`. This method is added in RequestExtensions.kt
        renderRequest?.themeDisplay()?.user?.fullName?.let {
            renderRequest.setAttribute("name", it)
        }

        include("/html/view.jsp", renderRequest, renderResponse)
    }

    @Suppress("unused")
    fun addCatAction(actionRequest: ActionRequest, @Suppress("UNUSED_PARAMETER") actionResponse: ActionResponse) {
        ParamUtil.getString(actionRequest, "cat", null)?.let {

            // Log
            log.info("Adding cat $it to database")

            // Save cat
            CatLocalServiceUtil.addCat(it)
        }
    }
}