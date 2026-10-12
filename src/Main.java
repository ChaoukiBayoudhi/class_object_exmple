void main() {

        Student s1 = new Student(11,"Mohamed",LocalDate.of(2005,1,12),5);//using the default java constructor
        IO.println("@s1= " + s1);
        IO.println("Introduce the student 1 details :");
        s1.getInformation();
        Student s2 = new Student();
        IO.println("@s2= " + s2);
        IO.println("Introduce the student 2 details :");
        s2.getInformation();
        IO.println("p2.Student 1 information :");
        s1.showDetails();
        IO.println("p2.Student 2 information :");
        s2.showDetails();
    }

