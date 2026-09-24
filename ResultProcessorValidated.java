import java.util.Scanner;

public class ResultProcessorValidated {

    public static void main(String[] args) {

        final double PROGRESSIVE_WEIGHT = 0.10;
        final double TEST_WEIGHT = 0.10;
        final double PRACTICAL_WEIGHT = 0.20;
        final double EXAM_WEIGHT = 0.60;

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println();
            System.out.println("----- ICT2104B RESULT PROCESSOR -----");
            System.out.println("1. Compute My Grade");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 1) {

                double progressive = 0;
                double tests = 0;
                double practical = 0;
                double exam = 0;

                boolean isValid;

                // Validate Progressive Assessment
                isValid = false;

                while (!isValid) {

                    System.out.print(
                        "Progressive Assessment mark (/100): "
                    );

                    if (input.hasNextDouble()) {

                        progressive = input.nextDouble();

                        if (progressive >= 0 && progressive <= 100) {
                            isValid = true;
                        } else {
                            System.out.println(
                                "Mark must be between 0 and 100."
                            );
                        }

                    } else {

                        System.out.println(
                            "Please enter a valid number."
                        );

                        input.next();
                    }
                }

                // Validate Tests
                isValid = false;

                while (!isValid) {

                    System.out.print("Tests mark (/100): ");

                    if (input.hasNextDouble()) {

                        tests = input.nextDouble();

                        if (tests >= 0 && tests <= 100) {
                            isValid = true;
                        } else {
                            System.out.println(
                                "Mark must be between 0 and 100."
                            );
                        }

                    } else {

                        System.out.println(
                            "Please enter a valid number."
                        );

                        input.next();
                    }
                }

                // Validate Practical/Presentation
                isValid = false;

                while (!isValid) {

                    System.out.print(
                        "Practical/Presentation mark (/100): "
                    );

                    if (input.hasNextDouble()) {

                        practical = input.nextDouble();

                        if (practical >= 0 && practical <= 100) {
                            isValid = true;
                        } else {
                            System.out.println(
                                "Mark must be between 0 and 100."
                            );
                        }

                    } else {

                        System.out.println(
                            "Please enter a valid number."
                        );

                        input.next();
                    }
                }

                // Validate Final Exam
                isValid = false;

                while (!isValid) {

                    System.out.print(
                        "Final Exam mark (/100): "
                    );

                    if (input.hasNextDouble()) {

                        exam = input.nextDouble();

                        if (exam >= 0 && exam <= 100) {
                            isValid = true;
                        } else {
                            System.out.println(
                                "Mark must be between 0 and 100."
                            );
                        }

                    } else {

                        System.out.println(
                            "Please enter a valid number."
                        );

                        input.next();
                    }
                }

                // Calculate weighted total
                double totalMark =
                        (progressive * PROGRESSIVE_WEIGHT)
                        + (tests * TEST_WEIGHT)
                        + (practical * PRACTICAL_WEIGHT)
                        + (exam * EXAM_WEIGHT);

                // Determine grade
                char grade;

                if (totalMark >= 80) {
                    grade = 'A';

                } else if (totalMark >= 70) {
                    grade = 'B';

                } else if (totalMark >= 60) {
                    grade = 'C';

                } else if (totalMark >= 50) {
                    grade = 'D';

                } else {
                    grade = 'F';
                }

                System.out.println();
                System.out.println(
                    "Total: " + totalMark + "% Grade: " + grade
                );

            } else if (choice != 0) {

                System.out.println(
                    "Invalid option, try again."
                );
            }

        } while (choice != 0);

        System.out.println("Goodbye!");

        input.close();
    }
}