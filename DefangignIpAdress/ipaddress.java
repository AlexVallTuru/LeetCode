package DefangignIpAdress;

public class ipaddress {
    
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
