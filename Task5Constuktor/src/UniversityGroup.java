public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public UniversityGroup(String groupName, int startYear) {
        this.startYear = startYear;
        this.endYear = startYear + 5;
        this.groupName = groupName;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.startYear = startYear;
        this.studentArray = studentArray;
        this.endYear = startYear + 5;
        this.groupName = groupName;
    }

    public void addStudent(String[] students) {
        if (studentArray == null) {
            studentArray = students;
        }
    }

    public void getGroupDescription() {
        System.out.printf("\nGroup:%s\nStart year of education:%d\nEnd year of education:%d\nStudents:"
                , groupName, startYear, endYear);
        for (int i = 0; i < studentArray.length; i++) {
            System.out.printf(studentArray[i] + ", ");
        }
    }

    public static void main(String[] args) {
        String[] students = new String[]{"Ivan Ivanuch", "Maksim Maksimuch"};
        String[] students2 = new String[]{"Evhen Evhenich", "Vladislav Vladislavuch"};
        UniversityGroup group1 = new UniversityGroup("First", 2022);
        UniversityGroup group2 = new UniversityGroup("Second", 2023);
        group1.addStudent(students);
        group1.getGroupDescription();
        group2.addStudent(students2);
        group2.getGroupDescription();
    }
}
