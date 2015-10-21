
public class items {
	private String itemdes,invoicenum;
	private int quantity;
	private Double price;
	public String getItemdes() {
	return itemdes;
	}
	public void setItemdes(String itemdes) {
	this.itemdes = itemdes;
	}
	public String getInvoicenum() {
	return invoicenum;
	}
	public void setInvoicenum(String invoicenum) {
	this.invoicenum = invoicenum;
	}
	public int getQuantity() {
	return quantity;
	}
	public void setQuantity(int quantity) {
	this.quantity = quantity;
	}
	public Double getPrice() {
	return price;
	}
	public void setPrice(Double price) {
	this.price = price;}
	
	public items (String itemdes,String invoicenum,int quantity,Double price)
	{
	this.itemdes=itemdes;
	this.invoicenum=invoicenum;
	this.price=price;
	this.quantity=quantity;
	}

}
