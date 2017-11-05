'use strict';

define([], function(){
    return function ($http) {

        this.findAll = function () {
            return $http.get('/items');
        };

        this.deleteItem = function (id) {
            return $http.delete('/items/' + id);
        };

        this.addItem = function (value) {
            return $http.put('/items', value);
        };

        this.changeItemStatus = function (id) {
            return $http.post('/items/' + id);
        };

    };
});

