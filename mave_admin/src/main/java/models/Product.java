package models;

/*
 * @author mafemartinez
 * @author angiecgomez
 * @author juanruiz 
 */
public class Product {

    private Integer cod;
    private String name;
    private String state;
    private Number value;

    public Product() {
    }

    public Product(Integer cod, String name, String state, Number value) {
        this.cod = cod;
        this.name = name;
        this.state = state;
        this.value = value;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }
    
    
}
