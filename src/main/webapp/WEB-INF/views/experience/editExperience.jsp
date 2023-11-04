<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

<!-- Page Content-->
<div class="container">
    <h2>Edytuj doświadczenie</h2>
    <form method="post" action='<c:url value="/experience/edit/${experienceModel.id}" />'>
        <div class="form-group">
            <label for="title">Tytuł:</label>
            <input type="text" id="title" name="title" value="${experienceModel.title}" required>
        </div>
        <!-- Pozostałe pola do edycji -->
        <button type="submit">Zapisz zmiany</button>
    </form>
</div>