<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

<!-- Page Content-->
<div class="container">
    <h2>Edytuj doświadczenie</h2>
    <form method="post" action="<c:url value='/experience/edit/${experienceModel.id}' />">
        <div class="form-group">
            <label for="title">Tytuł:</label>
            <form:input path="title" id="title" required="true" value="${experienceModel.title}" />
        </div>
        <div class="form-group">
            <label for="description">Opis:</label>
            <form:textarea path="description" id="description" rows="4" cols="50" required="true">${experienceModel.description}</form:textarea>
        </div>
        <div class="form-group">
            <label for="startDate">Data rozpoczęcia:</label>
            <form:input path="startDate" id="startDate" type="date" required="true" value="${experienceModel.startDate}" />
        </div>
        <div class="form-group">
            <label for="endDate">Data zakończenia:</label>
            <form:input path="endDate" id="endDate" type="date" required="true" value="${experienceModel.endDate}" />
        </div>
        <!-- Dodaj więcej pól w taki sam sposób -->
        <button type="submit">Zapisz zmiany</button>
    </form>
</div>
