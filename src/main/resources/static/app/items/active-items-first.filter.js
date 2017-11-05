'use strict';

define([], function(){
    return function () {
        return function (items) {
            items.sort(function (left, right) {
                if (left.status == right.status) {
                    return 0;
                }
                return left.status ? 1 : -1;
            });
            return items;
        }
    };
});

