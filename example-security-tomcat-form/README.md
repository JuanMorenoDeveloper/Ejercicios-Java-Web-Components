# example-security-tomcat
Para usar este ejemplo debe configurar en el tomcat-users.xml las siguientes entradas
<!--Roles de prueba-->
<role rolename="administrator"/>
<role rolename="user"/>
<!--Usuarios de prueba-->
<user username="root" password="@dm1n" roles="administrator,user"/>
<user username="simpleuser" password="pass123" roles="user"/>