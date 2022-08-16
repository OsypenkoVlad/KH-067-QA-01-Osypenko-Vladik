
public class UniversityGroup {
    private String groupName;
    private int starYear;
    private int endYear;
    public static String[] studentArray = new String[]{};

    public String getGroupName() {

        return groupName;
    }

    public int getStarYear() {
        return starYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void getStudentArray() {
        for (int i = 0; i < studentArray.length; i++) {
            System.out.printf("\nStudent: " + studentArray[i]);
        }
    }

    public UniversityGroup(String groupName, int starYear) {
        this.starYear = starYear;
        this.endYear = starYear + 5;
        this.groupName = groupName;

    }

    public UniversityGroup(String groupName, int starYear, String[] studentArray) {
        this.starYear = starYear;
        this.endYear = starYear + 5;
        this.groupName = groupName;
        this.studentArray = studentArray;

    }

    public void setAddStudent(String[] studentArray) {
        if (this.studentArray.length == 0) {
            this.studentArray = studentArray;
        } else {
            System.out.printf("\nArray is not empty");
        }

    }

    public void getGroupDescription(String[] studentArray) {
        groupName = getGroupName();
        starYear = getStarYear();
        endYear = getEndYear();
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = studentArray[i];
            System.out.printf("\nStudent: " + studentArray[i] + " Group: " + groupName +
                    " StartYear: " + starYear + " endYear: " + endYear);
        }
    }

    public static void main(String[] args) {
        String[] students = new String[]{"Petya Petrov", "Ivan Ivanov"};
        UniversityGroup obj1 = new UniversityGroup("123", 2019);
        obj1.getGroupDescription(studentArray);
        obj1.setAddStudent(students);
        obj1.getGroupDescription(studentArray);
        obj1.getStudentArray();

        UniversityGroup obj = new UniversityGroup("124", 2020, students);
        obj.setAddStudent(students);
        obj.getGroupDescription(studentArray);
        obj.setAddStudent(students);
    }
}

