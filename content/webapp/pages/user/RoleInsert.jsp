<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<html>
	<head>
		<title><s:text name="role.add" />
		</title>
		<%@ include file="/common/meta.jsp"%>
		<s:head/>
	</head>
	<body id="all_title">
		<div id="container">
			<div id="header">
				<h1>
					<s:text name="role.add" />
				</h1>
			</div>
			<s:fielderror />
				<s:form action="insert" method="post" namespace="/role"
					validate="true">
						<s:textfield name="role.rolename" key="role.rolename" cssClass="input_w w_15" 
				        />
						<s:textfield name="role.privilegesFlag" key="role.privilegesflag"
							cssClass="input_w w_15" />
						<s:submit key="prompt.ok" cssClass="button_ty" />
				</s:form>
			<br>
			<button id="addButton" onclick="location.href='prepareQuery.do'"
				class="button_ty">
				<s:text name="prompt.back" />
			</button>
		</div>
	</body>
</html>
