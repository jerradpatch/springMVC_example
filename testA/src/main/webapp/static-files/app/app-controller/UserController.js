
(function () {
    'use strict';
 
    angular
        .module('app')
        .controller('UserController', UserController);
 
    UserController.$inject = ['UserService'];
    function UserController(UserService) {
        var vm = this; 
              
        vm.GetAllUserData = GetAllUserData;
        
        vm.userData = null;
        
        function GetAllUserData() {
            UserService.GetAllData()
            	.then(function (response){
            	if(response != null && response.success){
            		vm.userData = response.message;
            	} else {
            		vm.userData = null;
            	}
            });
        }        
        
        return vm;
    }
})();
