This is a program where a user can order cinema tickets.
It takes the input values from the html, and if all inputs field are valid, the program makes an object.
The object is a ticket, and the attributes from the POJO will be given values.
The attributes are movieName, nrOfTickets, firstName, lastName, phoneNumber and emailAddress
The object is added to an array on the server.
For each registration, the array of ticket objects will be shown underneath in a table.
The user also have the opportunity to delete all tickets.

In the TicketController I have an empty array.
I also have methods in my TicketController:
-one that adds objects to the array
-one that returns all objects of an array
-one that clears the array

The first method is accessed with a PostMapping, because the user is giving information to the server
For the other two I use PostMapping. Here the server sends information.

