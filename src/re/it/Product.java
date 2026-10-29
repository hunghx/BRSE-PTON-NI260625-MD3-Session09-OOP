package re.it;

public class Product {
    private String id; // chỉ cho phép truy cập trong nội bộ Lớp
    String name;       // cho phép truy cập trong cùng gói (package)
    protected float price; // cho phép truy cập trong quan hệ kế thừa
    public int quantity;  // cho phép truy cập mọi nơi
    public String createdAt;

    public Product(){
        id = "P001";
    }

    // 4 phạm vi truy cập : private, default, protected , public dùng để giới hạn phạm vi sử dụng
    // cho: Lớp, Thuộc tính, Phương thức
}
