<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<form:form action="processForm" modelAttribute="student"><!-- this modelAttribute name "student" should match with the model attribute in controller class  -->
First name:<form:input path="firstName" />
<br/><br/>
Last name:<form:input path="lastName" />
<br/><br/>
Select Country:<form:select path="country">
<!--<form:option value="India" label="India" />
<form:option value="America" label="America" />
<form:option value="UK" label="Uk" />
<form:option value="Germany" label="Germany" />
<form:option value="France" label="France" />-->
<form:options items="${student.countryOptions }" />
</form:select>
<br/><br/>
Java <form:radiobutton path="favoriteLanguage" value="Java" />
C#<form:radiobutton path="favoriteLanguage" value="C#" />
PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />
<br/><br/>
Operating Systems: 
Linux<form:checkbox path="operatingSystems" value="Linux" />
Mac OS<form:checkbox path="operatingSystems" value="Mac OS" />
Windows<form:checkbox path="operatingSystems" value="Windows" />
<br/><br/>
<input type="submit" value="Submit" />
<!-- when we load form, Spring MVC will call getter method(student.getFirstName(),student.getLastname() and when we submit the form, Spring will call setter methods(student.setFirstname(),studentsetLastName())) -->
</form:form>
</body>
</html>