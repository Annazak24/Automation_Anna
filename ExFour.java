public class ExFour {
    public static void main(String[] args) {
        courses("Spring", "EC");
    }

    public static void courses(String semester, String programName) {
        switch (semester) {
            case "Fall": {
                switch (programName) {
                    case "CS": {
                        System.out.println("Introduction to Computer Science");
                    }
                    break;
                    case "EC": {
                        System.out.println("English Literature");
                    }
                    break;
                }
                break;
            }
            case "Spring": {
                switch (programName) {
                    case "CS": {
                        System.out.println("Object Oriented Programming");
                    }
                    break;
                    case "EC": {
                        System.out.println("Introduction to Journalism");
                    }
                    break;
                }
                break;
            }
        }
    }
}

