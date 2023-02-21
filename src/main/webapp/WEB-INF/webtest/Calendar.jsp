<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>캘린더입니당</title>
	<!-- bootstrap -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@5.2.3/dist/cerulean/bootstrap.min.css">
	<!-- calendar -->
	<script src="https://cdn.jsdelivr.net/npm/fullcalendar@6.1.4/index.global.min.js"></script>
	<script>
		document.addEventListener('DOMContentLoaded', function() {
        	const calendarEl = document.getElementById('calendar')
        	const calendar = new FullCalendar.Calendar(calendarEl, {
          		initialView: 'dayGridMonth',
          		headerToolbar: {
          			left: 'prev today next',
          			center: 'title',
          			right: ''
          		}
        	});
        calendar.render();
        });
		
	</script>
	
	<style>
		#calendar { width: 55%; float: left; margin-right: 20px; }
		#table_box { width: 30%; height: 700px; float: left; padding: 5px; }
		#table_box>table { margin-top: 20px; }
		
	</style>
</head>
<body>
	<h1>Hello ${title}</h1>
	<div class = "contents">
		<div id = "calendar"></div>
		<div id = "table_box">
			<button type="button" class="btn btn-primary">프로젝트</button>
			<table class="table table-hover">
				<thead>
					<tr class="table-primary">
				      <th></th>
				      <th>프로젝트명</th>
				      <th>회사명</th>
				      <th>시작날짜</th>
				    </tr>
			    </thead>
			    <tbody>
			    	<tr>
			    		<td>1</td>
			    		<td>프로젝트이름</td>
			    		<td>company</td>
			    		<td>20200101</td>
			    	</tr>
			    </tbody>
			</table>
		</div>
	</div>
</body>
</html>