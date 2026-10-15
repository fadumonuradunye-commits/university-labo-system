public class Equipment {
    String equipmentId;
    String  equipmentName;
    int quantity;

    public Equipment(String equipmentId, String equipmentName, int quantity) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName.toString();
        ;
        this.quantity = quantity;
    }

    public void displayEquipment(){
        System.out.println("equipment Id " + equipmentId);
        System.out.println("equipment Name" + equipmentName);
        System.out.println("quantity" + quantity);
    }
   public void borrowOneItem(){
        if(quantity >0){
            quantity --;
            System.out.println("equipment get successfully!");
            System.out.println("remaining quantity " + quantity);

        }else {
            System.out.println(" sorry wuu dhamaaday");
        }
   }
    public void returnoneItem(){
        quantity++;
        System.out.println("equapment returned successfully");
        System.out.println("available quantity " + quantity);
    }
}