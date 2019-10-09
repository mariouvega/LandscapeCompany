/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landscapecompany;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario.Vega003
 */

public class LandscapeCompany {
    private int sizeOfLawn, numberOfPets;
    private double price;

    public LandscapeCompany(int sizeOfLawn, double price, int numberOfPets) {
        this.sizeOfLawn = sizeOfLawn;
        this.numberOfPets = numberOfPets;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LandscapeCompany{" + "sizeOfLawn=" + sizeOfLawn + ", numberOfPets=" + numberOfPets + ", price=" + price + '}';
    }

    public int getSizeOfLawn() {
        return sizeOfLawn;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public double getPrice() {
        return price;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Write a program that reads in the csv data
        // square footage of lawn, price of the service, number of pets
        // read in the data into am ArrayList (use a class)
        // make a menu system where you ask the user whether they want to search
        // by yard size, price, or number of pets
        // depending on what the user wants to know...show the user the info
        // about the lawns
        
        
        ArrayList<LandscapeCompany> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("LandscapingData.csv");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {                
                String line = sc.nextLine();
                String[] elements = line.split(",");
                arrayList.add(new LandscapeCompany(Integer.parseInt(elements[0]), Double.parseDouble(elements[1]), Integer.parseInt(elements[2])));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LandscapeCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to sort from largest to smallest by lawn size");
        System.out.println("Enter 2 to sort from highest to lowest price");
        System.out.println("Enter 3 to sort from amount of pets (largest to least)");
        int userResponse = scan.nextInt();
        
        switch(userResponse)
        {
            case 1:
                for(LandscapeCompany c : arrayList){
                    System.out.println(c);
                }
                break;
            case 2:
                for(LandscapeCompany c : arrayList){
                    System.out.println(c);
                }
                break;
            case 3:
                for(LandscapeCompany c : arrayList){
                    System.out.println(c);
                }
                break;
        }
    }
    
}
