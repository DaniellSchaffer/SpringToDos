/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var controllerModule = angular.module('ToDoControllers');

controllerModule.controller('ToDoCtlr', ['$scope', 'toDoSvc', '_', function ($scope, toDoSvc, _) {
        $scope.todos = [];
       
        $scope.getAllToDos = function () {
            toDoSvc.getAllToDos().then(function (response) {
                $scope.todos = response.data;
            });
        };

        $scope.getAllToDos();
       
    }]);
