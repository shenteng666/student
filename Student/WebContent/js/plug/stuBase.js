/**
 * 
 */
var app = angular.module('student', ['pagination']);// 定义模块
app.controller('stuController', function($scope, $http) {
	// 读取列表数据绑定到表单中
	$scope.findAll = function() {
		$http.get('../stu/findAll.do').success(function(response) {
			$scope.list = response;
		});
	}

	//分页控件配置
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [5, 10, 15, 20],
        onChange: function(){
            $scope.reloadList();//重新加载
        }
    };
    //重新加载列表 数据
    $scope.reloadList=function(){
        //切换页码
        $scope.findPage( $scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    }
    //分页
    $scope.findPage=function(page,rows){//page:当前页码,rows:每页显示记录数
        $http.get('../stu/findPage.do?page='+page+'&rows='+rows).success(
            function(response){
                $scope.list=response.rows;//返回的rows:是查询出来的当前页的数据集合List<Brand>
                $scope.paginationConf.totalItems=response.total;//total:返回的总记录数
            }
        );
    }
	


	//保存 
	$scope.save=function(){
			var methodName='add';//方法名称
			if($scope.entity.id!=null){//如果有ID
				methodName='update';//则执行修改方法 
			}	
			$http.post('../stu/'+ methodName +'.do',$scope.entity ).success(
					function(response){
						if(response.success){
							   //重新查询 
					            $scope.reloadList();//重新加载
						}else{
							   alert(response.message);
						 }
					}		
			);				
	}
	
	//查询实体
	$scope.findOne=function(id){
	    $http.get('../stu/findOne.do?id='+id).success(
	        function(response){
	            $scope.entity= response;
	        }
	    );
	}
		
	$scope.selectIds=[];//选中的ID集合
	//更新复选
	       $scope.updateSelection = function($event, id) {
	           if($event.target.checked){//如果是被选中,则增加到数组
	               $scope.selectIds.push( id);
	           }else{
	               var index= $scope.selectIds.indexOf(id);
	               $scope.selectIds.splice(index, 1);//删除
	           }
	       }
	//批量删除
	       $scope.dele=function(){
	           //获取选中的复选框
	           $http.get('../stu/delete.do?ids='+$scope.selectIds).success(
	               function(response){
	                   if(response.success){
	                       $scope.reloadList();//刷新列表  暂时没用
	                   }else{
	                    alert(response.message);
	                 }

	               }
	           );
	       }
	
	       //根据名字查询
	       $scope.searchEntity={};//定义搜索对象
	       $scope.search=function(){
	    	   $http.post('../stu/search.do',$scope.searchEntity).success(
		               function(response){
		            	   $scope.list=response;
		               }
		           );
	    	}
});





