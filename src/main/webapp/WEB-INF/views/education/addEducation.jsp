<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>


<!-- Page Content-->
<div class="container-fluid p-0">
    <form method="post" action='<c:url value="/education/add"/>'>
        <div class="form-group">
            <label for="education">Edukacja</label>
            <input type="text" class="form-control" id="education" name="education" placeholder="Wprowadź edukację" style="max-width: 800px;" required>
        </div>
        <div class="form-group">
            <label for="technology">Technologia</label>
            <input type="text" class="form-control" id="technology" name="technology" placeholder="Wprowadź technologię" style="max-width: 600px;" required>
        </div>
        <div class="form-group">
            <label for="description">Opis</label>
            <textarea class="form-control" id="description" name="description" rows="4" placeholder="Wprowadź opis" style="max-width: 500px;" required></textarea>
        </div>
        <div class="form-group">
            <label for="ranking">Ranking</label>
            <input type="number" step="0.01" class="form-control" id="ranking" name="ranking" placeholder="Wprowadź ranking" style="max-width: 200px;" required>
        </div>
        <button type="submit" class="btn btn-primary">Dodaj edukację</button>
    </form>




    <div class="container">
        <form method="post" action='<c:url value="#"/>'>
            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput1">Tytuł</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput1" name="title" placeholder="uzupełnij tytuł">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput2">Podtytuł</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="exampleFormControlInput2" name="subTitle" placeholder="uzupełnij podtytuł">
                </div>
            </div>


            <div class="form-group row">
                <label class="col-2" for="exampleFormControlInput3">Treść</label>
                <div class="col-10">
                    <textarea type="text" class="form-control" rows="5" id="exampleFormControlInput3" name="description" placeholder="uzupełnij treść"></textarea>
                </div>
            </div>


            <input type="submit" class="btn btn-success" value="Zapisz">
        </form>
    </div>


</div>
