/*
 * Ajax
 * */
function loadCities() {
        $.ajax({
            type: 'GET',
            url: "loadCities",
            dataType: "json"
        }).done(function(message) {
            var citiesList = new Array();
           /* citiesList = message;
            $(".autocomplete").autocomplete({source:citiesList});*/
            console.log(citiesList);
        });
}

function loadMap(){
    $("#starting").geocomplete({
        map: "#google-map",
        details: "form",
        types: ["geocode", "establishment"],
        country: "IE"
    });
    $("#destination").geocomplete({
        map: "#google-map",
       // details: "end",
        details: "form",
        types: ["geocode", "establishment"],
        country: "IE"
    });

    $("#find1").click(function(){
        $("#starting").trigger("geocode");
    });
    $("#find2").click(function(){
        $("#destination").trigger("geocode");
    });
    var start = jQuery("#starting").val();
    var destination = jQuery("#destination").val();
    jQuery("#origin-input").val(start);
    jQuery("#destination-input").val(destination);
    $("input[id=changemode-driving]").prop('checked', true);

}




/**
 *
 */
function redirect() {
    $.ajax({
        type: 'GET',
        url: "redirectToPostRide",
    });
}
