<?php

// This line loads the library
require('Services/Twilio.php');

// Find your Account Sid and Token at twilio.com/user/account
$sid = "ACCOUNT_SID";
$token = "AUTH_TOKEN";

// Initialize the client
$client = new IPMessaging_Services_Twilio($sid, $token);

//Retrieve the service
$service = $client->services->get("SERVICE_SID");

//Retrieve the channel
$channel = $service->channels->get("CHANNEL_ID");

//List the messages
$messages = $channel->messages;
$all_messages = print_r($messages, true);
print $all_messages;