<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="java.util.List" %>


<h1>User List</h1>
<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>
				<a href="edit?id=${user.id}">Edit</a>
				<a href="delete?id=${user.id}">Delete</a>
			</td>
		</tr>
	</c:forEach>
</table>

<h2>Add User</h2>
<form action="add" method="post">
	<label>Name:</label>
	<input type="text" name="name" required />
	<label>Email:</label>
	<input type="email" name="email" required />
	<button type="submit">Add</button>
</form>
