package com.company;
import java.util.*;


public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        ArrayList<Student> firstGradeStudents = new ArrayList<>();

        Student brad = new Student("Brad", "Jordan", 1, 1);
        Student bushwick = new Student("Bushwick", "Bill", 2, 1);
        Student eric = new Student("Eric", "B", 3, 1);
        Student will = new Student("Will", "Griffin", 4, 1);
        Student willie= new Student("Willie", "Dennis", 5, 1);
        Student vinnie = new Student("Vinnie", "Paz", 6, 1);
        Student chuck = new Student("Chuck", "D", 7, 1);
        Student marshall = new Student("Marshall", "Mathers", 8, 1);
        Student sean = new Student("Sean", "Price", 9, 1);
        Student tupac = new Student("Tupac", "Shakur", 10, 1);
        Student chris = new Student("Chris", "Wallace", 11, 1);
        Student flava = new Student("Flava", "Flave", 12, 1);
        Student nathan = new Student("Nathan", "Wilson", 13, 1);
        Student nasir = new Student("Nasir", "Jones", 14, 1);
        Student ra = new Student("R.A.", "Thorburn", 15, 1);

//        firstGradeStudents.add(new Student("Eric", "B", 3, 1));


//        System.out.println("First grade class roster:"+ firstGradeStudents);
        Set<Student> studentListOne = new HashSet<>();
        studentListOne.add(bushwick);
        studentListOne.add(eric);
        studentListOne.add(will);
        studentListOne.add(willie);
        studentListOne.add(vinnie);

        Set<Student> studentListTwo = new HashSet<>();
        studentListOne.add(chuck);
        studentListOne.add(marshall);
        studentListOne.add(sean);
        studentListOne.add(tupac);
        studentListOne.add(chris);

        Set<Student> studentListThree = new HashSet<>();
        studentListOne.add(flava);
        studentListOne.add(nathan);
        studentListOne.add(nasir);
        studentListOne.add(ra);
        studentListOne.add(brad);


        ArrayList<Teacher> teachers = new ArrayList<>();

        Teacher billy = new Teacher("Billy", "Dee", 1, 1);
        Teacher ernie = new Teacher("Ernie", "C", 2, 5);
        Teacher ice = new Teacher("Ice", "Muthafuckin' T", 3, 3);

//        System.out.println("School teacher roster:"+ teachers);
//make two more of these
        Map<Teacher, Set> rosterMap = new HashMap<>();
        rosterMap.put(billy, studentListOne);
        rosterMap.put(ernie, studentListTwo);
        rosterMap.put(ice, studentListThree);

        for( Teacher key: rosterMap.keySet()){

            System.out.println(key);
        }


        for( Set value : rosterMap.values()){
            System.out.println(value);

        }
    }

}
