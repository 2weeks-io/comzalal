package com.weeks.dto;

public class ItemDto extends BaseDto{

	private int itemId;
	private int price;
	private String itemAddInfo;
	private String itemDetail;
	private String repImgPath;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemAddInfo() {
		return itemAddInfo;
	}
	public void setItemAddInfo(String itemAddInfo) {
		this.itemAddInfo = itemAddInfo;
	}
	public String getItemDetail() {
		return itemDetail;
	}
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}
	public String getRepImgPath() {
		return repImgPath;
	}
	public void setRepImgPath(String repImgPath) {
		this.repImgPath = repImgPath;
	}
	
}
