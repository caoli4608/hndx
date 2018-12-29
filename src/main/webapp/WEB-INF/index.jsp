<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="renderer" content="webkit">
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<meta name="apple-mobile-web-app-title" content="App" />
	<title>iview example</title>
	<link rel="stylesheet" type="text/css" href="../css/iview.css">
	<script type="text/javascript" src="../js/vue.js"></script>
	<script type="text/javascript" src="../js/iview.min.js"></script>
</head>
<body>
<div id="app">
	<i-button>Default</i-button>
	<i-button type="primary">Primary</i-button>
	<i-button type="ghost">Ghost</i-button>
	<i-button type="dashed">Dashed</i-button>
	<i-button type="text">Text</i-button>
	<br><br>
	<i-button type="info">Info</i-button>
	<i-button type="success">Success</i-button>
	<i-button type="warning">Warning</i-button>
	<i-button type="error">Error</i-button>
</div>
<script>

    var Main = {

    }

    var Component = Vue.extend(Main)
    new Component().$mount('#app')
</script>
</body>
</html>
