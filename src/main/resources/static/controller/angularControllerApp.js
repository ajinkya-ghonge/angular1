angularPostApp.controller("angularControllerApp", ['$scope', '$http', function($scope, $http) {
$http.get('/data/angularGet.json')
    .then(function(response) {
        $scope.names = response.data.res;
    },
    function(error) {
    alert("Error");
    });
$scope.consumedName = [];
$scope.consumed = function(idx){
$scope.consumedName.push($scope.names[idx]);
};

$scope.removed = function(idx){
consumedName.push($scope.names[idx]);
};

$scope.submit = function(data){
 var data2 = angular.toJson($scope.consumedName[0], true);

$http.post('http://localhost:8080/test/', data2)
.then(
function(data){
alert("reached success"+data);
},
function(data){
alert("try again"+data);
});

 };

}]);