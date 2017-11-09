<%-- 
    Document   : documentList
    Created on : 09-nov-2017, 1:27:31
    Author     : alonsorn
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Upload</title>
    </head>
    <body>
        <table style="border: 1px solid black">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>Name</th>
                    <th>Type</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${documents}" var="doc" varStatus="counter">
                    <tr>
                        <td>${counter.index + 1}</td>
                        <td>${doc.name}</td>
                        <td>${doc.type}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <form:form method="POST" action="add" modelAttribute="fileBucket" enctype="multipart/form-data"> 
            <label>Upload a document</label>
            <form:input type="file" path="file" id="file"></form:input>
            
            <input type="submit" value="Upload">
        </form:form>
    </body>
</html>
