// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
var authToken = "{{ auth_token }}";
var client = require('twilio')(accountSid, authToken);

client.media.list({ "dateCreated>": "2013-01-01" }, function(err, data) {
    data.medias.forEach(function(media) {
        console.log(media.ParentSid);
    });
});