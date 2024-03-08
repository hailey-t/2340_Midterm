import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {

    private ArrayList<User> users;

    private ArrayList<Appointment> appointments;

    // Singleton object
    private static AppointmentManager appointmentManager;

    // Private constructor to prevent instantiation from outside
    private AppointmentManager() {
        users = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public boolean registerUser(User user) {
        users.add(user);
        // return true if this was successful
    }
    
    // Method to get the single instance of AppointmentManager
    // This also ensures only one instance of AppointmentManager can exist at a time
    public static AppointmentManager getInstance() {
        if (appointmentManager == null) {
            appointmentManager = new AppointmentManager();
        }
        return appointmentManager;
    }

    // Method to schedule an appointment
    public void scheduleAppointment(User user, Map<Doctor, Float> recommendedDoctors) {
        Appointment potentialAppointment = *GET APPOINTMENT*; // prompt user to select date/time
        Doctor chosenDoctor = *CHOOSE DOCTOR*; // prompt user to select doctor from list
        if (potentialAppointent.getTime() is available for chosenDoctor and chosenDoctor accepts appointment) {
            // 1. Add appointment to both user and doctor schedules
            // 2. Send appointment confirmation to user and doctor
        } else {
            // alternativeCase - selected appointment time does not work
            handleMatchingFailure(user, recommendedDoctors, chosenDoctor, "Selected appointment time does not work!");
        }
    }
    
    // Method to recommend doctors based on user symptoms, discomfort level, and insurance coverage
    public void recommendDoctors(User user, String symptoms, int discomfortLevel, String healthInsurance) {
        // Logic to recommend doctors based on user's symptoms, discomfort level, and insurance coverage
        // Gives a list of recommended doctors
        Map<Doctor, Float> recommendedDoctors = new HashMap<>();
        for (Doctor d : allDoctors) {
            // Evaluate compatability and update recommended doctors map if compatibility > 0
            // Compatibility is negative if the match doesn't work
            // If it's positive, a higher number represents a better match
        }
        // Alternative case - no matching doctors found
        if (reccomendedDoctors.size() == 0) {
            handleMatchingFailure(User, recommendedDoctors, null, "No matching doctors found!");
        }

        // call scheduleAppointment
        scheduleAppointment(user, recommendedDoctors);
    }


    // Alternative scenario when preferred doctor is unavailable or no matches found
    public void handleMatchingFailure(User user, HashMap<Doctor, Float> recommendedDoctors, Doctor doctor, String explanation) {
        // Step 1: Inform user doctor was unavailable using provided explanation

        // Step 2: Promt user to make an alternative choice
        switch (prompt user for choice to proceed)

            // User can choose another doctor from the list of recommended doctors
            case otherDoctor:
                // Recall scheduleAppointment so user can choose another doctor (unavailable doctor removed from hashmap)
                scheduleAppointment(user, recommendedDoctors);

            // User can adjust the search criteria (discomfort level, location, etc.) and refresh their doctor search
            case adjustCriteria:
                // User updates criteria here
                // Call recommendDoctors with updated criteria
                recommendDoctors(User user, String symptoms, int discomfortLevel, String healthInsurance);

            // User can reschedule appointment with current doctor at better time
            case reschedule:
                // Recall scheduleAppointment (user can choose better time)
                scheduleAppointment(user, recommendedDoctors);
    }

}
