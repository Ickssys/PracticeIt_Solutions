public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private double discount;
    private int discountedItems;

    //constructor
   public DiscountBill(Employee clerk, boolean preferred){
    super(clerk);
    this.preferred = preferred;
    discount = 0.0;
    discountedItems = 0;
   } 

   //methods
   @Override
   public void add(Item i){
    super.add(i);
    if(preferred && i.getDiscount() > 0){
        discountedItems++;
        discount += i.getDiscount();
    }
   }

   @Override
   public double getTotal(){
    return super.getTotal() - discount;

   }
   public int getDiscountCount(){
    //todo
    return discountedItems;
   }

   public double getDiscountAmount(){
    //todo
    return discount;
   }

   public double getDiscountPercent(){
    //todo
    return discount / super.getTotal() * 100;
   }
}
