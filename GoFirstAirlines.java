
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
// Abstract class representing an Airplane
abstract class Airplane {
protected String uniqueId;
protected String name;
protected int yearOfManufacture;
protected int numOfTrips;
protected int capacity;
protected String modelNo;
public Airplane(String uniqueId, String name, int yearOfManufacture, int numOfTrips, int capacity, String modelNo) {
this.uniqueId = uniqueId;
this.name = name;
this.yearOfManufacture = yearOfManufacture;
this.numOfTrips = numOfTrips;
this.capacity = capacity;
this.modelNo = modelNo;
}
public abstract void takeOff();
public abstract void fly();
public abstract void land();
public void printFlightInformation() {
System.out.println("Flight Information:");
System.out.println("Unique ID: " + uniqueId);
System.out.println("Name: " + name);
System.out.println("Year of Manufacture: " + yearOfManufacture);
System.out.println("Number of Trips: " + numOfTrips);
System.out.println("Capacity: " + capacity);
System.out.println("Model No.: " + modelNo);
System.out.println("-----------------------------");
}
}
// Charter Plane class extending Airplane
class CharterPlane extends Airplane {
private int numOfBedrooms;
private boolean isPetFriendly;
private boolean isWIFIEnabled;
public CharterPlane(String uniqueId, String name, int yearOfManufacture, int numOfTrips, int capacity,
String modelNo, int numOfBedrooms, boolean isPetFriendly, boolean isWIFIEnabled) {
super(uniqueId, name, yearOfManufacture, numOfTrips, capacity, modelNo);
this.numOfBedrooms = numOfBedrooms;
this.isPetFriendly = isPetFriendly;
this.isWIFIEnabled = isWIFIEnabled;
}
@Override
public void takeOff() {
System.out.println("Charter Plane is taking off...");
}
@Override
public void fly() {
System.out.println("Charter Plane is flying...");
}
@Override
public void land() {
System.out.println("Charter Plane is landing...");
}
public void printCharterPlaneInformation() {
printFlightInformation();
System.out.println("Number of Bedrooms: " + numOfBedrooms);
System.out.println("Pet Friendly: " + isPetFriendly);
System.out.println("WIFI Enabled: " + isWIFIEnabled);
System.out.println("-----------------------------");
}
}
// Air Ambulance class extending Airplane
class AirAmbulance extends Airplane {
private int numOfDoctors;
private int numOfMonitoringUnits;
private List<String> monitoringDevices;
public AirAmbulance(String uniqueId, String name, int yearOfManufacture, int numOfTrips, int capacity,
String modelNo, int numOfDoctors, int numOfMonitoringUnits, List<String> monitoringDevices) {
super(uniqueId, name, yearOfManufacture, numOfTrips, capacity, modelNo);
this.numOfDoctors = numOfDoctors;
this.numOfMonitoringUnits = numOfMonitoringUnits;
this.monitoringDevices = monitoringDevices;
}
@Override
public void takeOff() {
System.out.println("Air Ambulance is taking off...");
}
@Override
public void fly() {
System.out.println("Air Ambulance is flying...");
}
@Override
public void land() {
System.out.println("Air Ambulance is landing...");
}
public void printAirAmbulanceInformation() {
printFlightInformation();
System.out.println("Number of Doctors: " + numOfDoctors);
System.out.println("Number of Monitoring Units: " + numOfMonitoringUnits);
System.out.println("Monitoring Devices: " + monitoringDevices);
System.out.println("-----------------------------");
}
}
// Passenger class
class Passenger {
private static int passengerIdCounter = 1;
private int passengerId;
private String firstName;
private String lastName;
private String gender;
private LocalDate dateOfBirth;
private int age;
private String mobileNumber;
private String aadharNumber;
private String address;
private String medicalHistory;
private String fsId;
public Passenger(String firstName, String lastName, String gender, LocalDate dateOfBirth, String mobileNumber,
String aadharNumber, String address, String medicalHistory, String fsId) {
this.passengerId = passengerIdCounter++;
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.dateOfBirth = dateOfBirth;
this.age = calculateAge(dateOfBirth);
this.mobileNumber = mobileNumber;
this.aadharNumber = aadharNumber;
this.address = address;
this.medicalHistory = medicalHistory;
this.fsId = fsId;
}
private int calculateAge(LocalDate dateOfBirth) {
LocalDate currentDate = LocalDate.now();
Period period = Period.between(dateOfBirth, currentDate);
return period.getYears();
}
public void printPassengerInformation() {
System.out.println("Passenger Information:");
System.out.println("Passenger ID: " + passengerId);
System.out.println("First Name: " + firstName);
System.out.println("Last Name: " + lastName);
System.out.println("Gender: " + gender);
System.out.println("Date of Birth: " + dateOfBirth);
System.out.println("Age: " + age);
System.out.println("Mobile Number: " + mobileNumber);
System.out.println("Aadhar Number: " + aadharNumber);
System.out.println("Address: " + address);
System.out.println("Medical History: " + medicalHistory);
System.out.println("Flight Schedule ID: " + fsId);
System.out.println("-----------------------------");
}
}
// Pilot class
class Pilot {
private static int pilotIdCounter = 1;
private int pilotId;
private String firstName;
private String lastName;
private String gender;
private LocalDate dateOfBirth;
private String mobileNumber;
private String aadharNumber;
private LocalDate dateOfJoining;
private String post;
private double salary;
private List<String> flightSchedules;
public Pilot(String firstName, String lastName, String gender, LocalDate dateOfBirth, String mobileNumber,
String aadharNumber, LocalDate dateOfJoining, String post, double salary) {
this.pilotId = pilotIdCounter++;
this.firstName = firstName;
this.lastName = lastName;
this.gender = gender;
this.dateOfBirth = dateOfBirth;
this.mobileNumber = mobileNumber;
this.aadharNumber = aadharNumber;
this.dateOfJoining = dateOfJoining;
this.post = post;
this.salary = salary;
this.flightSchedules = new ArrayList<>();
}
public int getPilotId() {
return pilotId;
}
public String getFirstName() {
return firstName;
}
public String getLastName() {
return lastName;
}
public LocalDate getDateOfJoining() {
return dateOfJoining;
}
public String getPost() {
return post;
}
public void addFlightSchedule(String fsId) {
flightSchedules.add(fsId);
}
public void printPilotInformation() {
System.out.println("Pilot Information:");
System.out.println("Pilot ID: " + pilotId);
System.out.println("First Name: " + firstName);
System.out.println("Last Name: " + lastName);
System.out.println("Gender: " + gender);
System.out.println("Date of Birth: " + dateOfBirth);
System.out.println("Mobile Number: " + mobileNumber);
System.out.println("Aadhar Number: " + aadharNumber);
System.out.println("Date of Joining: " + dateOfJoining);
System.out.println("Post: " + post);
System.out.println("Salary: " + salary);
System.out.println("Flight Schedules: " + flightSchedules);
System.out.println("-----------------------------");
}
}
// Flight Schedule class
class FlightSchedule {
private static int fsIdCounter = 1;
private int fsId;
private String uniqueId;
private String sourceCity;
private String destinationCity;
private LocalDate date;
private String pilotId1;
private String pilotId2;
public FlightSchedule(String uniqueId, String sourceCity, String destinationCity, LocalDate date,
String pilotId1, String pilotId2) {
this.fsId = fsIdCounter++;
this.uniqueId = uniqueId;
this.sourceCity = sourceCity;
this.destinationCity = destinationCity;
this.date = date;
this.pilotId1 = pilotId1;
this.pilotId2 = pilotId2;
}
public void assignPilot1(Pilot pilot) {
if (isPilotEligible(pilot, 10)) {
pilotId1 = Integer.toString(pilot.getPilotId());
pilot.addFlightSchedule(Integer.toString(fsId));
} else {
throw new NotEligibleException("Pilot 1 is not eligible due to tenure < 10 years");
}
}
public void assignPilot2(Pilot pilot) {
if (isPilotEligible(pilot, 5)) {
pilotId2 = Integer.toString(pilot.getPilotId());
pilot.addFlightSchedule(Integer.toString(fsId));
} else {
throw new NotEligibleException("Pilot 2 is not eligible due to tenure < 5 years");
}
}
private boolean isPilotEligible(Pilot pilot, int yearsThreshold) {
LocalDate currentDate = LocalDate.now();
Period period = Period.between(pilot.getDateOfJoining(), currentDate);
return period.getYears() >= yearsThreshold;
}
public void printFlightScheduleInformation() {
System.out.println("Flight Schedule Information:");
System.out.println("Flight Schedule ID: " + fsId);
System.out.println("Unique ID: " + uniqueId);
System.out.println("Source City: " + sourceCity);
System.out.println("Destination City: " + destinationCity);
System.out.println("Date: " + date);
System.out.println("Pilot 1 ID: " + pilotId1);
System.out.println("Pilot 2 ID: " + pilotId2);
System.out.println("-----------------------------");
}
}
// Custom exception class for pilot eligibility
class NotEligibleException extends RuntimeException {
public NotEligibleException(String message) {
super(message);
}
}
// Main class
public class GoFirstAirlines {
public static void main(String[] args) {
// Create charter plane
CharterPlane charterPlane = new CharterPlane("CP001", "Charter Plane 1", 2022, 10, 100, "CP-001",
3, true, true);
charterPlane.printCharterPlaneInformation();
// Create air ambulance
List<String> monitoringDevices = new ArrayList<>();
monitoringDevices.add("ECG");
monitoringDevices.add("Oxygen");
monitoringDevices.add("CPR");
monitoringDevices.add("Ventilator");
AirAmbulance airAmbulance = new AirAmbulance("AA001", "Air Ambulance 1", 2021, 5, 50, "AA-001",
5, 10, monitoringDevices);
airAmbulance.printAirAmbulanceInformation();
// Create passengers
Passenger passenger1 = new Passenger("John", "Doe", "Male", LocalDate.of(1990, 5, 15),
"1234567890", "123456789012", "Address 1", "NIL", "FS001");
Passenger passenger2 = new Passenger("Jane", "Smith", "Female", LocalDate.of(1995, 8, 22),
"9876543210", "987654321098", "Address 2", "Allergic to peanuts", "FS001");
passenger1.printPassengerInformation();
passenger2.printPassengerInformation();
// Create pilots
Pilot pilot1 = new Pilot("John", "Smith", "Male", LocalDate.of(1985, 3, 10),
"1234567890", "123456789012", LocalDate.of(2010, 5, 1), "Sr. Pilot", 50000);
Pilot pilot2 = new Pilot("Sarah", "Johnson", "Female", LocalDate.of(1992, 7, 5),
"9876543210", "987654321098", LocalDate.of(2015, 8, 15), "Jr. Pilot", 40000);
pilot1.printPilotInformation();
pilot2.printPilotInformation();
// Create flight schedule
FlightSchedule flightSchedule1 = new FlightSchedule(charterPlane.uniqueId, "City A", "City B",
LocalDate.of(2023, 6, 1), "", "");
try {
flightSchedule1.assignPilot1(pilot1);
flightSchedule1.assignPilot2(pilot2);
} catch (NotEligibleException e) {
System.out.println(e.getMessage());
}
flightSchedule1.printFlightScheduleInformation();
}
}


