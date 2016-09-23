<%-- Inits --%>
<%@ include file="init.jsp" %>

<portlet:renderURL portletMode="view" var="viewURL"/>
<portlet:actionURL name="addCatAction" var="addCatActionURL"/>

<aui:form action="<%= addCatActionURL %>" name="<portlet:namespace />fm">
    <aui:layout>
        <aui:column columnWidth="100" first="true">
            <aui:fieldset>
                <aui:input name="cat" label="Cat" showRequiredLabel="false">
                    <aui:validator name="required"/>
                </aui:input>

            </aui:fieldset>
        </aui:column>
    </aui:layout>

    <aui:button-row cssClass="text-right">
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
        <aui:button type="submit" value="Continue"/>
    </aui:button-row>
</aui:form>