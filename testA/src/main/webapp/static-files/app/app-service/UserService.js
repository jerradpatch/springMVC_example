(function () {
    'use strict';
 
    angular
        .module('app')
        .factory('UserService', UserService);
 
    UserService.$inject = ['$http'];
    function UserService($http) {
    	
    	var baseUrl = '/TestTest/UserService/'
    	var service = {};
    	service.baseUrl = baseUrl;
    	service.GetAllData = GetAllData;
    	
    	function GetAllData() {
            return $http.get(baseUrl+'getAllUserData', {}).then(handleSuccess, handleError('Error UserService.getAllUserData'));
        }
 
    	//private functions
    	function handleSuccess(res) {
            return { success: true, message: res.data };
        }
 
        function handleError(error) {
            return function () {
                return { success: false, message: error };
            };
        }
        
        return service;
    }
 
})();
