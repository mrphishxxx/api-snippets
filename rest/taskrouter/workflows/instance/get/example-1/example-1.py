# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioTaskRouterClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
workspace_sid = "{{ workspace_sid }}"
workflow_sid = "{{ workflow_sid }}"

client = TwilioTaskRouterClient(account_sid, auth_token)

workflow = client.workflows(workspace_sid).get(workflow_sid)
print workflow.friendly_name