package Java.work;

public class Animal_details {
    Animal_details(String Dog_name, String Dog_breed, Integer Dog_Price){
        System.out.println("Name : " + Dog_name + "\n" +  "Breed : " + Dog_breed +"\n" + "Price : " + Dog_Price);

    }

    public static void main(String[] args) {
        Animal_details obj = new Animal_details("MAX","Labrador",30000);
    }
}