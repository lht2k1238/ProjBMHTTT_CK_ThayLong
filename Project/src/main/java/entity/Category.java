package entity;

public class Category {
	private int cId;
	private String cName;

	public Category() {

	}

	public Category(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Category:" + "cId=" + cId + ", cName=" + cName + '}';
	}

}
