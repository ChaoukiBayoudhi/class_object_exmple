import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student {
    //attributes or fields or properties
    private int id;
    private String name;
    private LocalDate birthday;
    private int groupNumber;
    //constructor
    public Student(int id1, String name1, LocalDate birthday1, int groupNumber){
        id=id1;
        name=name1;
        birthday=birthday1;
        this.groupNumber=groupNumber;
    }

    public void showDetails(){
        IO.println("id = "+ id);
        IO.println("name = "+ name);
        IO.println("birthday = " + birthday);
        IO.println("group number = "+ groupNumber);
    }

    public void getInformation(){
        Scanner sc=new Scanner(System.in);
        IO.println("Enter the id value : ");
        id=sc.nextInt();
        IO.println("Enter the name value : ");
        name=sc.nextLine();
        IO.println("Enter the group number : ");
        groupNumber=sc.nextInt();

        //get Local date from the keyboard
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        IO.println("Enter the birthday (dd/MM/yyyy)");
        String birth=sc.next();
        //convert from String to LocalDate
        birthday=LocalDate.parse(birth,formatter);

    }
    public int getId(){return id;}
    public void setId(int newId){id=newId;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
