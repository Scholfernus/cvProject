<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Experience-->
    <section class="resume-section" id="experience">
        <div class="resume-section-content">
            <h2 class="mb-5">Experience</h2>

            <!-- Form for adding new experience -->
            <form action="${pageContext.request.contextPath}/experience/add" method="post" class="my-5">
            <div class="form-group">
                    <label for="title">Tytuł:</label>
                    <input type="text" id="title" name="title" class="form-control" required>
                </div>
                <div class="form-group">
                <label for="subtitle">Podtytuł:</label>
                <input type="text" id="subtitle" name="subtitle" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="description">Opis:</label>
            <textarea id="description" name="description" class="form-control" rows="4" required></textarea>
        </div>
        <div class="form-group">
            <label for="startDate">Data rozpoczęcia:</label>
            <input type="date" id="startDate" name="startDate" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="endDate">Data zakończenia:</label>
            <input type="date" id="endDate" name="endDate" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-primary">Dodaj doświadczenie</button>
        </form>

        <!-- Existing experience entries -->
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <!-- Add your existing experience entries here -->
            </div>
        </div>
    </section>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="js/scripts.js"></script>


