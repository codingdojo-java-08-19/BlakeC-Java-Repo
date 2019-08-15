public class ProjectClassTest {
    public static void main(String[] args) {
        ProjectClass testProject = new ProjectClass("Blah Blah", "Hello Hello Hello", 100.99);
        testProject.setName("HELLO HELLO");
        testProject.setDescription("Welcome To the Thunderdome");
        testProject.setCost(100.11);
        // System.out.println(testProject.getName());
        // System.out.println(testProject.getDescription());
        // System.out.println(testProject.getCost());
        System.out.println(testProject.elevatorPitch());
    }
}