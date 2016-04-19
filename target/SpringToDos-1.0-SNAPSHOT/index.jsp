<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="ModuleToDos">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ToDos con Angular</title>
    </head>
    <body ng-controller="ToDoCtlr">
        <h2>ToDos: </h2>
        <hr>
        <div class="row">
            <div class="col-lg-5">
                <div ng-repeat="todo in todos">
                    <h3><b>ID: <b><span ng-bind="todo.id"></span></b></h3>
                    <h4>Title: <b><span ng-bind="todo.title"></span></b></h4>
                    <h4>Description: <b><span ng-bind="todo.description"></span></b></h4>
                    <h4>Due Date: <b><span ng-bind="todo.dueDate"></span></b></h4>
                    <h4>Finished: <b><span ng-bind="todo.isFinished"></span></b></h4>
                    <hr>
                </div>
            </div>

        </div>

        <script src="resources/assets/libs/jquery-1.11.1.min.js"></script>
        <script src="resources/assets/libs/lodash.min.js"></script>
        <script src="resources/assets/libs/angular.min.js"></script>
        <script src="resources/assets/js/moduleRegistration.js"></script>
        <script src="resources/assets/js/ToDoService.js"></script>
        <script src="resources/assets/js/ToDoController.js"></script>

        <script src="resources/assets/js/app.js"></script>


    </body>

</html>
