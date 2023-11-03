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
            <form action="${pageContext.request.contextPath}/experience/add" method="post">
                <button type="submit">Dodaj doświadczenie</button>
                <div class="form-group">
                    <label for="title">Tytuł:</label>
                    <input type="text" id="title" name="title" required>
                </div>
                <div class="form-group">
                    <label for="subtitle">Podtytuł:</label>
                    <input type="text" id="subtitle" name="subtitle" required>
                </div>
                <div class="form-group">
                    <label for="description">Opis:</label>
                    <textarea id="description" name="description" required></textarea>
                </div>
                <div class="form-group">
                    <label for="start">Data rozpoczęcia:</label>
                    <input type="date" id="start" name="start" required>
                </div>
                <div class="form-group">
                    <label for="end">Data zakończenia:</label>
                    <input type="date" id="end" name="end" required>
                </div>
                <button type="submit">Dodaj doświadczenie</button>
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
</body>
</html>


<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<%--<%@ page contentType="text/html; charset=UTF-8"%>--%>
<%--<%@include file="../dynamic/header.jspf"%>--%>
<%--<!-- Page Content-->--%>
<%--<div class="container-fluid p-0">--%>
<%--    <!-- Experience-->--%>
<%--    <section class="resume-section" id="experience">--%>
<%--        <div class="resume-section-content">--%>
<%--            <h2 class="mb-5">Experience</h2>--%>
<%--            <!-- Form for adding new experience -->--%>
<%--            <form action="${pageContext.request.contextPath}/experience/add" method="post">--%>
<%--                <button type="submit">Dodaj doświadczenie</button>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="title">Tytuł:</label>--%>
<%--                    <input type="text" id="title" name="title" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="subtitle">Podtytuł:</label>--%>
<%--                    <input type="text" id="subtitle" name="subtitle" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="description">Opis:</label>--%>
<%--                    <textarea id="description" name="description" required></textarea>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="start">Data rozpoczęcia:</label>--%>
<%--                    <input type="date" id="start" name="start" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="end">Data zakończenia:</label>--%>
<%--                    <input type="date" id="end" name="end" required>--%>
<%--                </div>--%>
<%--                <button type="submit">Dodaj doświadczenie</button>--%>
<%--            </form>--%>

<%--            <!-- Existing experience entries -->--%>
<%--            <table>--%>
<%--                <tr>--%>
<%--                    <th>Tytuł</th>--%>
<%--                    <th>Podtytuł</th>--%>
<%--                    <th>Opis</th>--%>
<%--                    <th>Data rozpoczęcia</th>--%>
<%--                    <th>Data zakończenia</th>--%>
<%--                </tr>--%>
<%--                <c:forEach items="${experience}" var="exp">--%>
<%--                    <tr>--%>
<%--                        <td>${exp.title}</td>--%>
<%--                        <td>${exp.subtitle}</td>--%>
<%--                        <td>${exp.description}</td>--%>
<%--                        <td><fmt:formatDate value="${exp.start}" pattern="yyyy-MM-dd"/></td>--%>
<%--                        <td><fmt:formatDate value="${exp.end}" pattern="yyyy-MM-dd"/></td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
<%--            </table>--%>

<%--        </div>--%>
<%--    </section>--%>
<%--</div>--%>

<%--<!-- Bootstrap core JS-->--%>
<%--<script src="1"></script>--%>
<%--<!-- Core theme JS-->--%>
<%--<script src="js/scripts.js"></script>--%>
<%--</body>--%>
<%--</html>--%>
