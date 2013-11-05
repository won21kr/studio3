<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Crafter Studio - Build and Manage Web Content</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="stylesheet" href="studio-ui/lib/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="studio-ui/lib/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="studio-ui/lib/toastr/css/toastr.min.css">

    <link rel="stylesheet" href="studio-ui/styles/studio.css">
</head>

<body ng-app="studio-ui" ng-controller="AppCtrl">

<div id="studio" class="{{AppCtrl.appState}} {{AppCtrl.fullScreen}}">
    <div>
        <navigation></navigation>
        <div id="main-container">
            <div class="content container-fluid" ng-view></div>
        </div>
    </div>
</div>

<script src="studio-ui/lib/jquery/js/jquery.min.js"></script>
<script src="studio-ui/lib/toastr/js/toastr.min.js"></script>
<script src="studio-ui/lib/angular/js/angular.min.js"></script>
<script src="studio-ui/lib/angular-bootstrap/js/ui-bootstrap.min.js"></script>
<script src="studio-ui/lib/angular-resource/js/angular-resource.min.js"></script>
<script src="studio-ui/lib/angular-sanitize/js/angular-sanitize.min.js"></script>
<script src="studio-ui/lib/angular-cookies/js/angular-cookies.min.js"></script>
<script src="studio-ui/lib/angular-translate/js/angular-translate.min.js"></script>
<script src="studio-ui/lib/angular-translate-storage-cookie/js/angular-translate-storage-cookie.min.js"></script>
<script src="studio-ui/lib/angular-translate-storage-local/js/angular-translate-storage-local.min.js"></script>
<script src="studio-ui/lib/angular-translate-loader-static-files/js/angular-translate-loader-static-files.min.js"></script>


<script src="studio-ui/scripts/scripts.js"></script>


</body>
</html>
