package hello.itemservice.domain.item;

import lombok.Data;

@Data /*In Spring if we use Data annotation we have to be careful. Because Data annotation can cause infinite Loop(when we call a toString Method*/
public class Item {//has getter and setter ==> @Data
    private Long id;
    private String itemName;
    private Integer price; //if we put a type as int the default value would be 0 ==> a price is 0 as a default? it is quite awkward
    private Integer quantity; // so we put Integer as a type its default value is null ==> null is more decisive(clear) than 0

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


}
