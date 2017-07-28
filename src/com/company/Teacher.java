package com.company;

/**
 * Created by alamm7 on 7/27/17.
 */
public class Teacher {
        String firstName;
        String lastName;
        int id;
        int grade;

        public Teacher(String firstName, String lastName, int id, int grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.grade = grade;
        }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

}
