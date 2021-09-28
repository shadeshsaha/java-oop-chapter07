/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem14;

/**
 *
 * @author Shadesh
 */
public class Level1_Problem14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();	
	System.out.println(p.getName());	

    }
    
}


class Person {
    private String name;
    
    public Person(){
        name = "Unknown";
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}				
