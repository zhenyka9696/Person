package Person;

import java.util.Date;

class Person {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public TypeSex getSex() {
        return sex;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", dateBirth=" + dateBirth +
                '}';
    }

    public Person(String firstName, String lastName, TypeSex sex, Date dateBirth) {
        this(firstName, lastName);
        this.sex = sex;
        this.dateBirth = dateBirth;
    }

    private String firstName;
    private String lastName;
    private TypeSex sex;
    private Date dateBirth;


    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
