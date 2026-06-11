package Chap5;

public class Bank {
    String name;
    String address;

public boolean equals(Object o){
    if(o == this)return true;
    if(o == null)return false;
    if(!(o instanceof Bank))return false;
    Bank r = (Bank)o;
    if(!this.name.equals(r.name))return false;
    if(!this.address.equals(r.address))return false;
    return  true;
}
}


