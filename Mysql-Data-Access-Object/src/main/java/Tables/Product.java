package Tables;

public class Product {
	private int pid;
	private String productName;
	private String productDetail;
	private int price;
	public Class<Product> getProductClass(){
		return Product.class;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPid() {
		return pid;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	public String getProductDetail() {
		return productDetail;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
