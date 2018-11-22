
function loginUser() {
    var email = jQuery("#form-username").val();
    var pwd = jQuery("#form-password").val();
    {
        /*
        * Ajax
        * */
        $.ajax({
            type: 'POST',
            url: "loginUser",
            dataType: "json",
            data: {
                id : email,
                pwd : pwd
            },
        }).done(function(message,page) {
            window.location = message;
        });
    }
}


