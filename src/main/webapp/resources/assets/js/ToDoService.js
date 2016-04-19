/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var services = angular.module('ToDoServices');

services.factory('toDoSvc', ['$http', function ($http) {
        return {
            getAllToDos: function () {
                return $http.get('http://localhost:8080/SpringToDos/todo/');
            }
        };
    }]);
