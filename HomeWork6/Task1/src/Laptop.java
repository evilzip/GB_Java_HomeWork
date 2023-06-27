import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Laptop {

    private String brand;
    private String model;
    private String operationSystem;
    private Double displaySize;
    private String processor;
    private String graphics;
    private Integer graphicMemory;
    private Integer memoryRam;
    private String storageType;
    private Integer storageSize;
    private Double price;
    private Double weight;
    private int id;

    public Laptop(String brand, String model,String operationSystem, Double displaySize, String processor, String graphics,
                  Integer graphicMemory, Integer memoryRam,
                  String storageType, Integer storageSize, Double price, Double weight, int id) {
        this.brand = brand;
        this.model = model;
        this.operationSystem = operationSystem;
        this.displaySize = displaySize;
        this.processor = processor;
        this.graphics = graphics;
        this.graphicMemory = graphicMemory;
        this.memoryRam = memoryRam;
        this.storageType = storageType;
        this.storageSize = storageSize;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }

    public void addRAM(int extraRAM){
        memoryRam = memoryRam+ extraRAM;
    }

    public void changeOS(String newOS){
        operationSystem = newOS;
    }

    public double applyDiscount(Double discount){
        price= price - price/100*discount;
        return price;
    }
    public Object findLaptop(HashSet<Laptop> hashSet){

        if (hashSet.contains(this)){
            return this;
        }
        else{
            System.out.println("Объект не найден!");
            return null;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand,model,operationSystem,displaySize,processor,graphics,
                graphicMemory,memoryRam, storageType,storageSize, price, weight,id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!=obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        boolean b = (brand == laptop.brand) && (model == laptop.model) && (operationSystem == laptop.operationSystem) &&
                (displaySize == laptop.displaySize) && (processor == laptop.processor) && (graphics == laptop.graphics) &&
                (graphicMemory == laptop.graphicMemory) && (memoryRam == laptop.memoryRam) &&
                (storageType == laptop.storageType) && (storageSize == laptop.storageSize) && (price == laptop.price) &&
                (weight == laptop.weight);
        return b;
    }

    @Override
    public String toString() {
        String returnString = "ID: "+id +"\n" + "Brand: " + brand+"\n"+"Model: " + model+"\n"+"OS: " +
                operationSystem+"\n"+ "Display Size: " + displaySize+"\n"+"Processor: " + processor+"\n"+"Graphics: " +
                graphics+"\n"+"Graphic Memory" + graphicMemory+"\n"+ "RAM: " + memoryRam+"\n"+
                "Storage Type: " + storageType+"\n"+"Storage Capacity: " + storageSize+"\n"+
                "Price: " + price+"\n"+ "Weight: " + weight;
        return returnString;
    }
}
