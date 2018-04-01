package us.codecraft.tinyioc;

/**
 * 用于Bean的属性注入
 */
public class PropertyValue {

    private String name;
    private Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
