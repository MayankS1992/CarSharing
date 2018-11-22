<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>WROOM</title>

<%--
    <script src="js/jquery.js"></script>
--%>
    <script href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.2/jquery-ui.js"></script>
    <script src="assets/js/jquery-1.11.1.min.js"></script>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/jquery-ui-1.12.1/jquery-ui.js"></script>
    <script src="js/jquery.jqGrid.min.js"></script>
    <script src="js/grid.locale-en.js"></script>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui-bootstrap/0.5pre/css/custom-theme/jquery-ui-1.10.0.custom.css" rel="stylesheet"/>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/form-elements.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="css/dashboard.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

    <![endif]-->
    <!-- Javascript -->
    <script language=”javascript” type=”text/javascript” src=”http://ajax.aspnetcdn.com/ajax/jquery.validate/1.10.0/jquery.validate.min.js”></script>
    <script src="assets/bootstrap/js/bootstrapA.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.backstretch.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="js/bootstrap-datetimepicker.js"></script>
    <script src="js/dashboard.js"></script>
    <script type="text/javascript" src="js/autocomplete-0.3.0.min.js"></script>
 <%--   <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpNKW-nFyry735-zHqP8wwFh0Q3kt6C94&callback=initMap"
            type="text/javascript"></script>--%>

    <!-- Google Place library -->
    <script src="https://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places&key=AIzaSyDyIc_4kGdZkFYUidP3yuQMRr30QJ8FzfU"></script>
    <!-- Geocomplete plugin -->
    <script src="js/jQuery-Geocoding-Places-Autocomplete-with-Google-Maps-API-geocomplete/jquery.geocomplete.min.js"></script>
    <script src="js/mapComponent.js"></script>

    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <script src="assets/js/placeholder.js"></script>

    <!-- zz -->
    <link rel="shortcut icon" href="assets/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

</head>
<body>
<div class="container">
    <div id="topbar">
        <img id="bbcLogo">
        <div id="signOn" class="sign-In">
            <img id="signInLogo" class="signInLogo" src="assets/ico/favicon.png">
            <span id="signInfont" class="signInfont">WROOM</span>
        </div>
        <div   class="tabs">
            <span   class="tabsfont">News</span>
        </div>
        <div   class="tabs">
            <span   class="tabsfont">Sport</span>
        </div>
        <div   class="tabs">
            <span   class="tabsfont">Weather</span>
        </div>
        <div   class="tabs">
            <span   class="tabsfont">Shop</span>
        </div>
        <div   class="tabs">
            <span   class="tabsfont">Earth</span>
        </div>
        <div   class="tabs">
            <span   class="tabsfont">Travel</span>
        </div>
        <div class="tabs">
            <span id="finalTab" class="tabsfont">More</span>
        </div>
        <div class="tabs1">
            <input id="searchBox" type="text" value="Search">
        </div>
    </div>
    <div id="menuBar">
        <h1>WROOOM</h1>
    </div>
    <div class="container">
        <h2>Car Pooling</h2>
        <button  id="postBooking" action="redirectToPostRide" method="post" class="btn" data-dismiss="modal" aria-hidden="true">Post Booking</button>
        <p>Enter details to share your Ride</p>
        <form id="addressForm" class="form-inline">
            <div class="row">
                <div class="form-group col-xs-6">
                    <label class="sr-only">Leaving From:</label>
                    <div class="col-xs-5">
                        <input id="starting" type="text" class="form-control" name="address">
                    </div>
                </div>
                <div class="form-group col-xs-6">
                    <label class="sr-only">Destination:</label>
                    <div class="col-xs-5">
                        <input id="destination" type="text" class="form-control" name="address">
                    </div>
                </div>
            </div>
        </form>
        <div id="google-map" style="height: 60%;width: 50%"></div>
        <button href="#myModal" role="button" class="btn" data-toggle="modal">Book Ride</button>
        <div id="addressDetails" class="hide">
            <input name="lat" type="hidden" class="form-control" />
            <input name="lng" type="hidden" class="form-control" />
        </div>
    </div>
</div>
<script>
    var cities = [];
    $(function() {
        loadCities();
        loadMap();
    });
</script>
</body>
</html>