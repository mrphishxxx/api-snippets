<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; 
$token = "{{ auth_token }}"; 
$client = new Services_Twilio($sid, $token);

// Loop over the list of connect_apps and echo a property for each one
foreach ($client->account->connect_apps as $connect_app) {
    echo $connect_app->friendly_name;
}
