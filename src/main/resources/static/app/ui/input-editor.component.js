'use strict';

define([], function () {
        return {
            templateUrl: 'app/ui/input-editor.tpl.html',
            bindings: {
                title: '@',
                onSave: '&'
            },
            controller: function () {

                this.$onInit = function () {
                    this.model = {
                        showEditor: false,
                        value: undefined
                    };
                };

                this.switchView = function () {
                    this.model.showEditor = !this.model.showEditor;
                    if (this.model.showEditor) {
                        this.model.value = undefined;
                    }
                };

                this.clearValue = function () {
                    this.model.showEditor = false;
                    this.model.value = undefined;
                };

                this.saveValue = function () {
                    this.onSave({value: this.model.value});
                    this.clearValue();
                };

            }
        };
    }
);

