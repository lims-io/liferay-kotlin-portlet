package io.lims.kotlin

import com.liferay.portal.kernel.util.WebKeys
import com.liferay.portal.theme.ThemeDisplay
import javax.portlet.PortletRequest

/**
 * Returns theme display related to the portlet request
 */
fun PortletRequest.themeDisplay(): ThemeDisplay? {
    return getAttribute(WebKeys.THEME_DISPLAY) as? ThemeDisplay
}