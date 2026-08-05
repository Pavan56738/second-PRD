public class Main {
    public static void main(String[] args) {
    
            String personName;
            double heightInMetres;
            double weightInKilograms;
            int age;
            int dailyActivityHours;
            int waterIntake;
            int sleepHours;

                personName = "Pavan";
                heightInMetres = 1.75;
                weightInKilograms = 70;
                age = 21;
                dailyActivityHours = 2;
                waterIntake = 3;
                sleepHours = 8;
            
            double bmi = weightInKilograms / (heightInMetres * heightInMetres);

            String bmiCategory;

            if (bmi < 18.5) {
                bmiCategory = "Underweight";
            } else if (bmi < 25) {
                bmiCategory = "Normal";
            } else if (bmi < 30) {
                bmiCategory = "Overweight";
            } else {
                bmiCategory = "Obese";
            }
            String activityStatus = (dailyActivityHours >= 1) ? "Good" : "Poor";
            String waterStatus = (waterIntake >= 2) ? "Good" : "Poor";
            String sleepStatus;

            if (sleepHours >= 7 && sleepHours <= 9) {
                sleepStatus = "Healthy";
            } else if (sleepHours > 9) {
                sleepStatus = "Oversleep";
            } else {
                sleepStatus = "Poor";
            }
            String overallStatus;
            String message;

            if (bmiCategory.equals("Normal")
                    && activityStatus.equals("Good")
                    && waterStatus.equals("Good")
                    && sleepStatus.equals("Healthy")) {
                overallStatus = "HEALTHY";
                message = "Continue maintaining the same routine.";
            } else {
                overallStatus = "NEEDS IMPROVEMENT";
                message = "Exercise regularly, drink more water, and maintain healthy sleep.";
            }

            System.out.println();
            System.out.println("HEALTH AND FITNESS REPORT");
            System.out.println();
            System.out.println("Name: " + personName);
            System.out.println("Age: " + age);
            System.out.println("BMI: " +bmi);
            System.out.println("BMI Category: " + bmiCategory);
            System.out.println();

            System.out.println("Activity Status: " + activityStatus);
            System.out.println("Water Intake Status: " + waterStatus);
            System.out.println("Sleep Status: " + sleepStatus);
            System.out.println();

            System.out.println("Overall Fitness Status: " + overallStatus);
            System.out.println("Message: " + message);
            System.out.println();

            
        }
    }
