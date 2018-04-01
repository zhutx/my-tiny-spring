package us.codecraft.tinyioc;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装一个Bean所有的PropertyValue。<br/>
 * 为了封装一些操作，我们不直接使用List，而是封装了一个PropertyValues。
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue pv) {
        //TODO: 这里可以对重复propertyName进行判断，直接用list没法做到
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
