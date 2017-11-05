'use strict';

define([], function(){
    return function ($scope, itemsService) {

        $scope.model = {
            items: []
        };

        this.loadItems = function () {
            itemsService.findAll().then(function (response) {
                $scope.model.items = response.data;
            })
        };
        this.loadItems();

        this.addItem = function (value) {
            itemsService.addItem(value).then(function (response) {
                var item = response.data;
                $scope.model.items.push(item);
            });
        };

        this.itemDone = function (originalItem) {
            itemsService.changeItemStatus(originalItem.id).then(function (response) {
                var item = response.data;
                originalItem.status = item.status;
            });
        };

        this.deleteItem = function (item) {
            if (confirm("Delete item '" + item.value + "' ?")) {
                itemsService.deleteItem(item.id).then(function () {
                    var idToDelete = item.id;
                    $scope.model.items = $scope.model.items.filter(function (obj) {
                        return obj.id != idToDelete;
                    });
                });
            }
        };

    };
});

