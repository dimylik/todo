'use strict';

requirejs.config({
    paths: {
        'angular': ['./webjars/angularjs/1.6.6/angular'],
        'angular-route': ['./webjars/angularjs/1.6.6/angular-route'],
        'angular-resource': ['./webjars/angularjs/1.6.6/angular-resource']
    },
    shim: {
        'angular': {
            exports: 'angular'
        },
        'angular-route': {
            deps: ['angular'],
            exports: 'angular'
        },
        'angular-resource': {
            deps: ['angular'],
            exports: 'angular'
        }
    }
});

require(
    [
        'angular',
        'angular-route',
        'angular-resource',
        './app/ui/ui.module.js',
        './app/items/items.module.js'
    ],
    function (angular) {

        var app = angular.module('app', [
            'ngRoute',
            'ngResource',
            'ui.common',
            'app.items'
        ]);

        app.config(function ($routeProvider) {
            $routeProvider
                .when('/', {
                    templateUrl: 'app/home/home.tpl.html',
                    controller: function () {
                    }
                })
                .otherwise({redirectTo: '/'});
        });

        app.config(function ($provide, $locationProvider) {
            $locationProvider.hashPrefix('');
        });

        angular.bootstrap(document.getElementById("appId"), ['app']);

    });

