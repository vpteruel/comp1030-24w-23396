public class MyInfo {
    public static void main(String[] args) {

        String myName = "Vinicius Picossi Teruel";
        String myCollege = "Georgian@ILAC";
        String myProgram = "Computer Programming";
        int startingYear = 2024;
        double minAverage = 60.0;
        boolean isImportant = true;

        System.out.println("My full name is: " + myName);
        System.out.println("My college name is: " + myCollege);
        System.out.println("My program is: " + myProgram);
        System.out.println("My program started in January of " + startingYear);
        System.out.println("The minimum average to pass is: " + minAverage);
        System.out.println("Java is an important language. "
                + (isImportant ? "Yes it is true" : "No it is false" ));
    }
}