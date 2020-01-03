<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head lang="en">
    <head>
    </head>
<body>
<div class="container">
    <div class="row"></div>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Matricula</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Carrera</th>
            <th scope="col">Telefono</th>
        </tr>
        </thead>
        <tbody>
        <#list formularios as x>
            <tr>
                <th scope="row">${x.id?long?c}</th>
                <td>${x.pregunta1}</td>
                <td>${x.pregunta2}</td>
                <td>${x.pregunta3}</td>
                <td>${x.pregunta4}</td>

            </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>