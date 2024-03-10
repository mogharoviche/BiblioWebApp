<!DOCTYPE html>
<html>
<head>
<title>Adherent</title>
<style>
        .form-container {
            text-align: center;
            display: inline-block;
            margin-top: 20px; /* Adjust the top margin as needed */
            display: flex;
    		justify-content: center;
    		align-items: center;
    		
        }
        .form-container label {
            display: block;
            margin-bottom: 5px; /* Adjust the bottom margin for each label */
        }
    </style>
</head>
<body>
<div class="form-container">
	<form action="/BiblioWebApp/adherent" method="post">
	
	    <label for="nom">Nom</label>
	    <input id="nom" type="text" name="nom" required="required">
	<br>
	    <label for="prenom">Prenom</label>
	    <input id="prenom" type="text" name="prenom" required="required">
	<br>
	    <label for="email">EMail</label>
	    <input id="email" type="text" name="email" required="required">
	<br>
	    <label for="telephone">N° Telephone</label>
	    <input id="telephone" type="text" name="telephone" required="required">
	<br>
	    <input type="submit" value="Register" style="margin-top: 20px;">
	</form>
</div>
	
<!-- Table To display Adherent List from DB -->
	<table>
		<thead>
		<tr >
			<th style="colspan=5"> <p>"List des Adhérents"</p></th>
		</tr>
		<tr>
			<th>Nom</th>
			<th>Prenom</th>
			<th>EMail</th>
			<th>date d'insccription</th>
			<th>N° Telephone</th>
		</tr>
		</thead> 
		
		<tbody>
         <c:choose>
                <c:when test="${not empty adherents}">
                    <c:forEach var="adherent" items="${adherents}">
                        <tr>
                            <td>${adherent.nom}</td>
                            <td>${adherent.prenom}</td>
                            <td>${adherent.mail}</td>
                            <td>${adherent.telephone}</td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="5">No adherents found.</td>
                    </tr>
                </c:otherwise>
            </c:choose>
    </tbody>
	</table>
</body>
</html>