# PasswordChat
This is a chat bot that store passwords for the user. This password keeper would be integrated with a larger chat program such as Slack. The password program discretely authenticates the user to the program by asking them a few questions. If the user does not pass the questions then the chat simply responds back unhelpfully.

To log into the password program, use the following (the AI allows some wording flexibility):
User: Hi
AI: What can I help you with?
User: Let me in
AI: Where is Bobby?
User: You mean Bobby the chap?
AI: Yes. Where is he?
User: He’s in London meeting a girl.
AI: What would you like me to do?

You are now logged into the password chat program. Type the command you would like to execute. Ask for help if you want to see the available commands. Currently, we support the commands: list accounts, create account, show <Account> password, and good bye.


The fully implemented version would possibly have the following features:
* setup custom pass-dialog
* securely stored passwords  
    It would use a database to store passwords encrypted at rest.
* real create account functionality  
    Account information would be stored.
* delete account functionality
* intelligent passphrase generator based on your interests
* possibly the application randomly finds an icon and name and disguises itself as a fully functional digital assistant like Google assistant
