<%-- Inits --%>
<%@ include file="init.jsp" %>

<%--@elvariable id="name" type="String"--%>

<c:if test="${not empty name}">
    <div>
        You are logged in as: ${name}
    </div>
</c:if>

<div>
    <c:forEach items="${cats}" var="cat">
        <div>${cat.name}</div>
    </c:forEach>
</div>

<aui:button-row>
    <portlet:renderURL var="addCatURL">
        <portlet:param name="mvcPath" value="/html/add-cat.jsp"/>
    </portlet:renderURL>
    <aui:button onClick="<%= addCatURL %>" value="Add Cat"/>
</aui:button-row>