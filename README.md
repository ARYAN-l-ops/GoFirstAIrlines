# GoFirstAIrlines
this code is about scheduling flights, time management, past records, user info, etc.


## problem Statement ##
GoFirst Airlines is a company that provides Air travel services. The company offers
travel in 2 types of airplanes (Flights) viz. Charter Plane and Air Ambulance.
The basic information included in each type is as follows
Airplane - uniqueId, Name, year of manufacture, no. of trips (one way - till date),
capacity (i.e. no. of seats), model no., takeOff(), fly(), land()
Charter Plane - no. of bedrooms, is pet friendly (boolean variable), is wifi enabled(boolean variable)
Air Ambulance - no. of doctors, no. of monitoring units, list of monitoring devices
(ex. ECG, Oxygen, CPR, ventilator, etc.)
GoFirst wants to automate its business process (management of passengers,
flights, and employees) and has outsourced the software designing task to you, you are assigned to implement
following modules of the system.


Passenger information:
pId (auto-generated), First Name, Last Name, Gender, Date of Birth, age, Mobile
Number, Aadhar Number, address, medical history (if no medical condition, put
NIL), fsId (flight schedule Id)
Pilot information:
piloted, First Name, Last Name, Gender, Date of Birth, Mobile Number, Aadhar
Number, date of joining, post (Sr. pilot/Jr. pilot/Chief Pilot), salary, List of flight
schedules
Flight Schedule:
find, uniqueId (ID of the plane assigned), source city, destination city, date, time,
piloted of 1st pilot, piloted of 2nd pilot, assignPilot1(), assignPilot2()

1. Print the information on the flights that have been scheduled in the
past, till date.

(NOTE: Use abstract, super, static, inheritance, association, and method overloading in
the best possible way → It is mandatory to implement)

2. Find the tenure of a pilot before assigning him/her to a flight schedule
as a Pilot 1. If the tenure is &lt;10 years, throw an exception
“NotEligibleException” else do the assignment. Do the same for Pilot
2 with a tenure &lt;5 years.
