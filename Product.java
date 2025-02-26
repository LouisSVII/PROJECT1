package Product; 

public class Product {
   private String name;
   private double cost;
   private int currentStock;
   private int maxStock;
   private int lowPercentage;
   
   public Product(String name, double cost, int currentStock, int maxStock) {
      this.name = name;
      this.currentStock = currentStock;
      this.maxStock = maxStock;
      lowPercentage = 20;
   }
   public Product(String name, double cost, int currentStock, int maxStock, int lowPercentage) {
      this.name = name;
      this.currentStock = currentStock;
      this.maxStock = maxStock;
      this.lowPercentage = lowPercentage;
   }
   
   public int getStockPercentage() { //returns the current stock level as a whole percentage
      return (int)(currentStock / maxStock);
   }
   public double increasePrice(double percentage) { //increases price based on percentage passed (ex. 0.5 = 50%)
      cost += (cost*percentage);
      return cost;
   }
   public double decreasePrice(double percentage) { //decreases price based on percentage passed (ex. 0.5 = 50%)
      cost -= (cost*percentage);
      return cost;
   }
   
   public String getName() {
      return name;
   }
   public double getCost() {
      return cost;
   }
   public int getCurrentStock() {
      return currentStock;
   }
   public int getMaxStock() {
      return maxStock;
   }
   public int getLowPercentage() {
      return lowPercentage;
   }
   
   public void setName(String newName) {
      name = newName;
   }
   public void setCost(double newCost) {
      cost = newCost;
   }
   public void setCurrentStock(int newCurrentStock) {
      currentStock = newCurrentStock;
   }
   public void setMaxStock(int newMaxStock) {
      maxStock = newMaxStock;
   }
   public void setLowPercentage(int newLowPercentage) {
      lowPercentage = newLowPercentage;
   }
   
}
