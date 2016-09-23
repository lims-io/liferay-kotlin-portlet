<%-- Taglibs --%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- Liferay Theme --%>
<liferay-theme:defineObjects/>

<%-- Portlet --%>
<portlet:defineObjects/>

<c:forEach items="${cats}" var="cat">
    <div>${cat}</div>
</c:forEach>