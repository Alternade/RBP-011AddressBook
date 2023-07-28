import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Rahul", "Saha","Delhi","Delhi","asdasd",12345);
        Person p2 = new Person("Rahul", "Saha","Delhi","Delhi","asdasd",12345);
        Person p3 = new Person("Rahul", "Saha","Delhi","Mumbai","asdasd",12345);
        Person p4 = new Person("Rahul", "Saha","Delhi","Delhi","asdasd",12345);
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> addressBook1 = new ArrayList<>();
        addressBook1.add(p1);
        addressBook1.add(p2);
        addressBook1.add(p3);
        addressBook1.add(p4);
        Main  m = new Main();

        System.out.println("Enter the option you want to perform: \n1 : Add \n2 : Search By Name \n3 : Search by last name \n4: Search by city \n5: Search by State \n6: Delete by state");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> addressBook1.add(m.add());
            case 2 -> m.searchByFirstName(addressBook1);
            case 3 -> m.searchByLastName(addressBook1);
            case 4 -> m.searchByCity(addressBook1);
            case 5 -> m.searchByState(addressBook1);
            case 6 -> m.delete(addressBook1);
        }
        for (Person p : addressBook1){
            System.out.println(p);
        }

    }

    public Person add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.next();
        System.out.println("Enter Last name");
        String lname = sc.next();
        System.out.println("Enter city name");
        String cname = sc.next();
        System.out.println("Enter state name");
        String sname = sc.next();
        System.out.println("Enter Email");
        String email = sc.next();
        System.out.println("Enter zip");
        int zip = sc.nextInt();
        return new Person(fname,lname,cname,sname,email,zip);
    }

    public void searchByFirstName(ArrayList<Person> a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to search");
        String temp = sc.next();
        int flag = 0;
        for(int i = 0 ; i< a.size();i++){
            Person p = a.get(i);
            if(temp.equals(p.firstName)){
                System.out.println("Element found");
                flag++;
                System.out.println(p);
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }
    }

    public void searchByLastName(ArrayList<Person> a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to search");
        String temp = sc.next();
        int flag = 0;
        for(int i = 0 ; i< a.size();i++){
            Person p = a.get(i);
            if(temp.equals(p.lastName)){
                System.out.println("Element found");
                flag++;
                System.out.println(p);
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }
    }

    public void searchByCity(ArrayList<Person> a){
        ArrayList<Person> tempList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to search");
        String temp = sc.next();
        int flag = 0;
        for(int i = 0 ; i< a.size();i++){
            Person p = a.get(i);
            if(temp.equals(p.city)){
                flag++;
                tempList.add(p);
            }
        }

        if(flag == 0){
            System.out.println("Element not found");
        }else {
            System.out.println(tempList);
        }
    }

    public void searchByState(ArrayList<Person> a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to search");
        String temp = sc.next();
        int flag = 0;
        for(int i = 0 ; i< a.size();i++){
            Person p = a.get(i);
            if(temp.equals(p.state)){
                System.out.println("Element found");
                flag++;
                System.out.println(p);
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }
    }

    public void delete(ArrayList<Person> a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to delete");
        String temp = sc.next();
        for(int i = 0 ; i< a.size();i++){
            Person p = a.get(i);
            if(temp.equals(p.state)){
                a.remove(i);
                break;

            }
        }
    }
}