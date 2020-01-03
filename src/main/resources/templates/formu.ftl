<!DOCTYPE html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Encuesta Barcamp</title>
</head>

<body>

<form name="f" action="/barcamp/saveform" method="POST">
    <label>¿Las charlas donde usted participó cumplieron con sus expectativas? </label>
    <input  name="pregunta1" type="number" <#if formulario??> value="${formulario.pregunta1?string.number}" </#if>/><br/>
    <label>¿Los expositores mostraron tener dominio del tema?</label>
    <input name="pregunta2" type="number" <#if formulario??> value="${formulario.pregunta2?string.number}" </#if>/> <br/>
    <label>¿Las instalaciones del evento fueron confortables para usted?.</label>
    <input name="pregunta3" type="number" <#if formulario??> value="${formulario.pregunta3?string.number}" </#if>/> <br/>
    <label> ¿Tiene algún comentario para los organizadores? (Comentario).</label>
    <input name="pregunta4" type="text" <#if formulario??> value="${formulario.pregunta4}" </#if>/> <br/>
    <input type="submit"/>

</form>
</body>
</html>

