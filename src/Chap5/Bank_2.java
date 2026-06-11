package Chap5;
import org.apache.commons.lang3.builder.*;

public class Bank_2 {
String name;
String address;

public boolean equals(Object o){
    return EqualsBuilder.reflectionEquals(this,o);
}
public int hashcode(){
    return HashCodeBuilder.reflectionHashCode(this);
}

}
