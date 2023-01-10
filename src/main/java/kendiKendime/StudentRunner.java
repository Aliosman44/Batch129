package kendiKendime;

public class StudentRunner {

    public static void main(String[] args) {


        Student std1 = new Student("ali", 23, 25, "as12", "ankara");
        Student std2 = new Student("ahmet", 10, 20, "al12", "istanbul");
        Student std3 = new Student("ali", 35, "as16");

        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);

    }
}
