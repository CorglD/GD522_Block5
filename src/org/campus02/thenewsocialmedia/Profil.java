package org.campus02.thenewsocialmedia;

public class Profil {
    @Override
    public String toString() {
        return "Profil{" +
                "eMail='" + eMail + '\'' +
                ", age=" + age +
                ", fullname='" + fullname + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", salary=" + salary +
                ", bestFriends=" + bestFriends +
                '}';
    }

    private String eMail;
    private int age;
    private String fullname;
    private String creditCardNumber;
    private double salary;

    private Profil bestFriends;



    public Profil(String eMail, int age, String fullname, String creditCardNumber, double salary) {
        this.eMail = eMail;
        this.age = age;
        this.fullname = fullname;
        this.creditCardNumber = creditCardNumber;
        this.salary = salary;

    }
    public void printProfile(AccessRoles role){
        System.out.println("My Profile");
        System.out.println("eMail = " + eMail);
        if(role == AccessRoles.BestFriend || role == AccessRoles.Self)
        {
            System.out.println("age = " + age);
        }

        System.out.println("fullname = " + fullname);

        if(role == AccessRoles.Self|| role == AccessRoles.Platform)
        {
            System.out.println("creditCardNumber = " + creditCardNumber);
        }

        System.out.println("salary = " + salary);
        System.out.println("bestFriends = " + bestFriends);
    }

    public void setBestFriend(Profil bestfriend){
        this.bestFriends = bestfriend;

    }
}
