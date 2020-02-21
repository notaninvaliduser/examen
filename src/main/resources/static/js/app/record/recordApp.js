var app = angular.module('recordModule', [])
.controller('recordController', function($http, $scope, $window){
        //Variable
        $scope.record = {
            id: null,
            album_title: null,
            artist_name: null,
            song_count: null
        };




        function list(){
            $http.get('/records/list').then((response) => {
                $scope.records = response.data;
            });
        }


        $scope.add = (record) => {
            $http.post('/records/add', record).then((response) => {
            $scope.record = {};
                list();
            });
        };


        $scope.selectEdit = (record) =>{
            $scope.record = record;

        }

        $scope.edit = (record) => {
                    $http.put('/records/update/' + record.id, record).then((response) => {
                    $scope.record = {};
                        list();
                    });

        };


        $scope.delete = (record) => {
            const conf = $window.confirm('Seguro de eliminar el registro ' + record.nombre_album + '?');
            if(conf){
            $http.delete('/records/delete/' + record.id).then((response) =>{
                $window.Alert("Registro Eliminado");
            });
            }
        };
        list();
});