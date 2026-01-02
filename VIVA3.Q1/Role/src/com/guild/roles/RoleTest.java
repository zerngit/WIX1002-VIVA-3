package com.guild.roles;

/**
 *
 * @author tehjiajie
 */

public class RoleTest {

    public static void main(String[] args) {
        
    //Create several Role objects using both constructors. 
    Role m1 = new Role();
    Role m2 = new Role("Zhi Heng", 19, "Human", 100.0);

    System.out.println("Before setting:");
    System.out.println(m1.getName());
    System.out.println(m1.getMana());
    System.out.println(m1.getRace());
    System.out.println(m1.getAge());

    //Use setter methods to modify some attributes. 
    m1.setName("Jia Jie");
    m1.setAge(30);
    m1.setRace("Elf");
    m1.setMana(150.0);

    System.out.println("\nAfter setting:");
    System.out.println(m1.getName());
    System.out.println(m1.getMana());
    System.out.println(m1.getRace());
    System.out.println(m1.getAge());

    //Call performAction() for each object. 
    System.out.println("\nPerforming Actions:");
    m1.performAction();
    m2.performAction();

    //Print out all role details (name, age, race, mana).
    System.out.println("\nRole 1 Details:");
    System.out.println("Name: " + m1.getName());    
    System.out.println("Age: " + m1.getAge());
    System.out.println("Race: " + m1.getRace());
    System.out.println("Mana: " + m1.getMana());

    System.out.println("\nRole 2 Details:");    
    System.out.println("Name: " + m2.getName());
    System.out.println("Age: " + m2.getAge());
    System.out.println("Race: " + m2.getRace());
    System.out.println("Mana: " + m2.getMana());    

    }
}
