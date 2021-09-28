/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2_program16;

/**
 *
 * @author Shadesh
 */
public class Level2_Program16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MealCard mc1 = new MealCard();

        MealCard mc2 = new MealCard();
        MealCard mc3 = new MealCard();
        System.out.println("Meal Card 1 point is: " + mc1.getNoOfPoint());

        System.out.println("Meal Card 2 point is: " + mc2.getNoOfPoint()); System.out.println("Meal Card 3 point is: " + mc3.getNoOfPoint()); mc1.buyFood();

        mc2.purchasePoints(100);
        mc2.buyFood();
        mc3.purchasePoints(200);
        System.out.println("Meal Card 1 point is: " + mc1.getNoOfPoint());
        System.out.println("Meal Card 2 point is: " + mc2.getNoOfPoint());
        System.out.println("Meal Card 3 point is: " + mc3.getNoOfPoint());
    }
    
}

    class MealCard {
        private int noOfPoint;
        private boolean isBuySuccessfull;
    
        public MealCard() {
            this.noOfPoint = 100;
        }
        
        public MealCard(int noOfPoint, boolean isBuySuccessfull) {
            this.noOfPoint = noOfPoint;
            this.isBuySuccessfull = isBuySuccessfull;
        }
    
        public int getNoOfPoint() {
            return noOfPoint;
        }
        
        public void setNoOfPoint(int noOfPoint) {
            this.noOfPoint = noOfPoint;
        }
        
        public boolean isBuySuccessfull() {
            return isBuySuccessfull;
        }
    
        public void setBuySuccessfull(boolean isBuySuccessfull) {
            this.isBuySuccessfull = isBuySuccessfull;
        }
        
        public void buyFood() {
            if(this.getNoOfPoint() > 0) {
                this.setBuySuccessfull(true);
                this.setNoOfPoint(this.noOfPoint -= 100);
                System.out.println("Buy food successfull");
            }
            else {
                this.setBuySuccessfull(false);
                System.out.println("Not enough credit. Please recharge");
            }
        }
        
        public void purchasePoints(int point) {
            this.setNoOfPoint(this.noOfPoint += point);
            System.out.println("Credit successfuly added");
        }
    }

