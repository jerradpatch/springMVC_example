(function () {
    'use strict';
 
    angular
        .module('app', ['ngRoute', 'ngCookies'])
        .config(config)
        .run(run);
 
    config.$inject = ['$routeProvider', '$locationProvider'];
    function config($routeProvider, $locationProvider) {
        $routeProvider
	        .when('/UserView', {
	        	controller: 'UserController',
	            templateUrl: '/TestTest/static-files/app/app-view/UserView.html',
	            controllerAs: 'vm'
	        })
            .otherwise({ redirectTo: '/UserView' });
        
//        if(window.history && window.history.pushState){
//            $locationProvider.html5Mode(true);
//        }
    }
 
    run.$inject = ['$rootScope', '$location', '$cookieStore', '$http'];
    function run($rootScope, $location, $cookieStore, $http) {

    }
 
})();