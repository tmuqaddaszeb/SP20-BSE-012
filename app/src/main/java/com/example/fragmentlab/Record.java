package com.example.fragmentlab;

public class Record {

        private String name; // private = restricted access
        private int age;
        private String address;
        public String getName() {
            return name;
        }

        public void setName(String newName) {
            this.name = newName;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int newAge) {
            this.age = age;

        }
    public String getAddress() {
        return address;
    }

    public void setAddress(String newName) {
        this.address = address;}
}
