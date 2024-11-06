import java.util.ArrayList;

public class InventoryManager{
    public ArrayList<product> ls;

    public InventoryManager() {
        ls = new ArrayList<product>();
    }

    public void addProduct(product p) {
        ls.add(p);
    }

    public void removeProduct(int id) {
        for (int i = 0; i < ls.size(); i++) {
            if (id == ls.get(i).getId()) {
                ls.remove(i);
            }
        }
    }

    public void displayAll() {
        System.out.println("\nProducts:\n");
        for (product p : ls) {
            p.displayInfo();
            System.out.println();
        }
    }
    public product findById(int id){
        for(product p : ls){
            if(id==p.getId()){
                return p;
            }
        }
        return null;
    }

}
