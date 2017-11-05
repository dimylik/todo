define([
        'angular',
        './input-editor.component'
    ],
    function (angular,
              inputEditorComponent) {

        angular
            .module('ui.common', [])
            .component( 'inputEditor', inputEditorComponent )
        ;
    }
);

