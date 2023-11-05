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

            <!-- Existing static data -->
            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">Senior Web Developer</h3>
                    <div class="subheading mb-3">Intelitec Solutions</div>
                    <p>Bring to the table win-win survival strategies to ensure proactive domination. At the end of the day, going forward, a new normal that has evolved from generation X is on the runway heading towards a streamlined cloud solution. User generated content in real-time will have multiple touchpoints for offshoring.</p>
                </div>
                <div class="flex-shrink-0"><span class="text-primary">March 2013 - Present</span></div>
            </div>

            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">Web Developer</h3>
                    <div class="subheading mb-3">Intelitec Solutions</div>
                    <p>Capitalize on low hanging fruit to identify a ballpark value added activity to beta test. Override the digital divide with additional clickthroughs from DevOps. Nanotechnology immersion along the information highway will close the loop on focusing solely on the bottom line.</p>
                </div>
                <div class="flex-shrink-0"><span class="text-primary">December 2011 - March 2013</span></div>
            </div>

            <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                <div class="flex-grow-1">
                    <h3 class="mb-0">Junior Web Designer</h3>
                    <div class="subheading mb-3">Shout! Media Productions</div>
                    <p>Podcasting operational change management inside of workflows to establish a framework. Taking seamless key performance indicators offline to maximise the long tail. Keeping your eye on the ball while performing a deep dive on the start-up mentality to derive convergence on cross-platform integration.</p>
                </div>
                <div class="flex-shrink-0"><span class="text-primary">July 2010 - December 2011</span></div>
            </div>

            <div class="d-flex flex-column flex-md-row justify-content-between">
                <div class="flex-grow-1">
                    <h3 class="mb-0">Web Design Intern</h3>
                    <div class="subheading mb-3">Shout! Media Productions</div>
                    <p>Collaboratively administrate empowered markets via plug-and-play networks. Dynamically procrastinate B2C users after installed base benefits. Dramatically visualize customer directed convergence without revolutionary ROI.</p>
                </div>
                <div class="flex-shrink-0"><span class="text-primary">September 2008 - June 2010</span></div>
            </div>

            <!-- Dynamic experience entries -->
            <c:forEach items="${experiences}" var="experience">
                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                    <div class="flex-grow-1">
                        <h3 class="mb-0">${experience.title}</h3>
                        <div class="subheading mb-3">${experience.subtitle}</div>
                        <p>${experience.description}</p>
                        <!-- Warunek sprawdzający, czy data nie jest pusta -->
                        <c:if test="${not empty experience.startDate}">
                            <!-- Konwersja daty ze String na obiekt Date -->
                            <c:set var="startDate" value='<fmt:parseDate value="${experience.startDate}" pattern="yyyy-MM-dd"/>' />
                            <c:set var="endDate" value='<fmt:parseDate value="${experience.endDate}" pattern="yyyy-MM-dd"/>' />
                            <!-- Formatowanie i wyświetlanie daty -->
                            <p><fmt:parseDate value="${experience.startDate}" pattern="yyyy-MM-dd"/>
                                - <fmt:parseDate value="${experience.startDate}" pattern="yyyy-MM-dd"/>
                            </p>
                        </c:if>
                    </div>
                </div>
            </c:forEach>

        </div>
    </section>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="js/scripts.js"></script>
</body>
</html>
