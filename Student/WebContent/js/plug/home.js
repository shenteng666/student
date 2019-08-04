/**
 * 
 */       var app=angular.module('student', []);//定义模块 
       app.controller('homeController' ,function($scope,$http){
           //读取列表数据绑定到表单中  
           $scope.findAll=function(){
               $http.get('../home/findAll.do').success(
                   function(response){
                       $scope.list=response;
                   }
               );
           }
       });