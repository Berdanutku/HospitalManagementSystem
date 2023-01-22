import a.Appointment;
import a.Doctors;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Main {

    static Scanner scan = new Scanner(System.in);
    static Random rn = new Random();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Doctors> doctors = new ArrayList<>();
    static ArrayList<Appointment>  appointments = new ArrayList<>();


    static void setUsers(int choice) {

        int tempId, age;
        float height;
        String password, tempPassword, name, bloodType;
        boolean condition;

        do {
            if (choice==1) {
                scan.nextLine();
                System.out.println("Please enter your password:");
                password=scan.nextLine();

                System.out.println("Please enter your Name and Surname:");
                name=scan.nextLine();

                System.out.println("Please enter your blood type:");
                bloodType=scan.nextLine();

                System.out.println("Please enter your age:");
                age = scan.nextInt();

                System.out.println("Please enter your height:");
                height=scan.nextFloat();

                tempId = rn.nextInt(999) + 2000;
                System.out.println("You have been assigned with the ID:" + tempId);


                User tempNewUser = new User(tempId , name,bloodType,age, height, password);
                users.add(tempNewUser);

                System.out.println("Your account has been set. Welcome to the HMS " + name + "!\n");
                userLogin(true, tempNewUser);
                condition = false;

            } else if (choice==2) {

                System.out.println("Please enter your ID:");
                tempId=scan.nextInt();
                scan.nextLine();

                System.out.println("Please enter your Full Name:");
                name = scan.nextLine();

                System.out.println("Please enter your password:");
                tempPassword=scan.nextLine();



                User tempUser = new User(name,tempId, tempPassword);


                userLogin(users.contains(tempUser), users.get(userIndex(tempUser)));
                condition = false;

            } else if (choice==3) {
                break;
            } else {
                System.out.println("\nInvalid User Input!\n");
                displayRegisterMenu();
                condition = true;
            }
        } while (condition);

    }
    static int userIndex(User user) {
        int index = 0;
        for (int i = 0; i < users.size(); i++) {
            if (user.getUserID() == user.getUserID()) {
                break;
            }
            index++;
        }
        return index;
    }

    static void displayUserMenu(User user) {
        System.out.println("\n\n"+
                "*-*-*-*-*-*-* Welcome to the a.Main Page of HMS *-*-*-*-*-*-*\n"+
                "\n- Enter 1 book appointment \n" +
                "\n- Enter 2 display appointments \n" +
                "- Enter 3 to Exit \n"+
                "Enter your choice: \n");
        int choice;
        choice = scan.nextInt();
        scan.nextLine();
        if (choice==1) {
            displayAppointmentMenu(user);
        } else if (choice==2) {
            displayAppointments(appointments);
        }  else if (choice==3) {
            displayRegisterMenu();
        } else {
            System.out.println("Invalid User Input!");
            displayUserMenu(user);
        }
    }

    static void displayAppointments(ArrayList<Appointment> appointments) {

        System.out.println("\n*-*-*-* Appointments *-*-*-*");
        for(int i = 0;i < appointments.size(); i++) {

            System.out.println((i+1) + "-) " + "User:\t\t " + appointments.get(i).getUser().getUserFullName() +
                    "\n    Doctor:\t\t " + appointments.get(i).getDoctor().getDoctorFullName() +
                    "\n    Time:\t\t " + appointments.get(i).getTime() +
                    "\n    Date:\t\t " + appointments.get(i).getDate() +
                    "\n");
        }
    }
    static void displayAppointmentMenu(User user) {
        Doctors.displayDoctors(doctors);
        System.out.println("Please enter the number of Doctor you want to book an appointment:");
        int tempNumber = scan.nextInt();
        scan.nextLine();
        Appointment tempAppointment = new Appointment(user,doctors.get(tempNumber-1),doctors.get(tempNumber-1).getAvailableDate(), doctors.get(tempNumber-1).getAvailableTime());
        System.out.println("Your appointment with "+ doctors.get(tempNumber-1).getDoctorFullName() +" has been booked!");
        appointments.add(tempAppointment);
        displayAppointmentMenu(user);
    }





    static void userLogin(boolean login, User user) {
        if(login) {
            System.out.println("Login successful "+ user.getUserFullName() +"!");
            displayUserMenu(user);

        } else {
            int tempChoice;
            boolean condition;
            System.out.println("Invalid User ID or Password!\n");
            do {
                System.out.println("- Enter 1 to try again \n- Enter 2 for Register Menu\nEnter your choice:\n");
                tempChoice = scan.nextInt();
                if (tempChoice == 1) {
                    setUsers(2);
                    condition = false;
                } else if (tempChoice == 2) {
                    displayRegisterMenu();
                    int choice;
                    choice = scan.nextInt();
                    setUsers(choice);
                    condition = false;
                } else {
                    System.out.println("Invalid User Input!");
                    condition = true;
                }
            } while (condition);
        }
    }

    static void displayRegisterMenu() {

        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        System.out.println("\tWelcome to HMS(Hospital Management System)!\n-) If you haven't registered please enter 1 to register " +
                "\n-) If you have already registered please enter 2 to login" +
                "\n-) Enter 3 to exit: ");
        int choice = scan.nextInt();
        setUsers(choice);
    }
    public static void main(String[] args) {
        User user1 = new User( "Ergin Yalman",6400, "ErginPass" );
        User user2 = new User("Berdan Utku Türk",7373, "UtkuPass");
        User user3 = new User("Özge Serap Elibol",1234, "ÖzgePass");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Doctors doc1 = new Doctors("Physician",44,"Emily Williams", 12.30,22082022);
        Doctors doc2 = new Doctors("Neurologists",55,"Johnny Depp", 14.30,14092022);
        Doctors doc3 = new Doctors("Radiologists",38,"Robert Downey Jr.", 12.30,12092022);
        Doctors doc4 = new Doctors("Pediatricians",35,"Billie Joel", 12.30,07122022);
        Doctors doc5 = new Doctors("Gynecologists",48,"Chris Brown", 12.30,01072022);
        doctors.add(doc1);
        doctors.add(doc2);
        doctors.add(doc3);
        doctors.add(doc4);
        doctors.add(doc5);
        displayRegisterMenu();



    }
}