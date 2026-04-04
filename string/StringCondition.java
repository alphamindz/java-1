



package string;

public class StringCondition {
    public static void main(String[] args) {
        
        // String variable
        String fileNameString = "resume.pdf";

        // Condition check
        if (fileNameString.endsWith(".pdf")) {
            System.out.println("File Type: PDF Document");
        } else {
            System.out.println("File Type: Unknown");
        }

        // Print final name
        System.out.println("Processing file: " + fileNameString);
    }
}