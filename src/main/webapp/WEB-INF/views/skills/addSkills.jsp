<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<%--<%@ page contentType="text/html; charset=UTF-8"%>--%>
<%--<%@include file="../dynamic/header.jspf"%>--%>

<%--        <!-- Page Content-->--%>
<%--        <div class="container-fluid p-0">--%>
<%--            <!-- Skills-->--%>
<%--            <section class="resume-section" id="skills">--%>
<%--                <div class="resume-section-content">--%>
<%--                    <h2 class="mb-5">Skills</h2>--%>


<%--                    <form action="${pageContext.request.contextPath}/skills/addSkill" method="post">--%>
<%--                    <div class="form-group">--%>
<%--                    <label for="nazwa">Nazwa:</label>--%>
<%--                    <input type="text" class="form-control" id="nazwa" name="nazwa" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="opis">Opis:</label>--%>
<%--                    <textarea class="form-control" id="opis" name="opis" rows="3" required></textarea>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="data">Data osiągnięcia:</label>--%>
<%--                    <input type="date" class="form-control" id="data" name="data" required>--%>
<%--                </div>--%>
<%--                <!-- Dodaj więcej pól według potrzeb, np. pole do wyboru ikony -->--%>
<%--                <button type="submit" class="btn btn-primary">Dodaj Osiągnięcie</button>--%>
<%--            </form>--%>
<%--                </div>--%>
<%--            </section>--%>
<%--        </div>--%>
<%--        <!-- Bootstrap core JS-->--%>
<%--        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>--%>
<%--        <!-- Core theme JS-->--%>
<%--        <script src="js/scripts.js"></script>--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

<!-- Page Content-->
<div class="container-fluid p-0">
    <!-- Skills-->
    <section class="resume-section" id="skills">
        <div class="resume-section-content">
            <h2 class="mb-5">Skills</h2>

            <!-- Display skills -->
            <div class="subheading mb-3">Programming Languages & Tools</div>
            <ul class="list-inline dev-icons">
                <!-- Loop through your skills list here -->
                <c:forEach var="skill" items="${skillsList}">
                    <li class="list-inline-item"><i class="fab fa-html5"></i>${skill.name}</li>
                </c:forEach>
            </ul>

            <!-- Your existing form to add a skill -->
            <form action="${pageContext.request.contextPath}/skills/addSkill" method="post">
                <!-- Your form fields here -->
                <button type="submit" class="btn btn-primary">Dodaj Osiągnięcie</button>
            </form>
        </div>
    </section>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="js/scripts.js"></script>
</body>
</html>
