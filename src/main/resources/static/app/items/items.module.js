define([
        'angular',
        './items.service.js',
        './items.controller.js',
        './active-items-first.filter'
    ],
    function (angular,
              itemsService,
              itemsController,
              activeItemsFirst) {

        angular
            .module('app.items', [])

            .config(function ($routeProvider) {
                $routeProvider
                    .when('/items', {
                        templateUrl: 'app/items/items.tpl.html',
                        controller: 'itemsController',
                        controllerAs: 'itemsCtrl'
                    })
                ;
            })
            .service('itemsService', itemsService)

            .controller('itemsController', itemsController)

            .filter('activeItemsFirst', activeItemsFirst)

        ;
    }
);

