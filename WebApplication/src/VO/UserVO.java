package VO;

public class UserVO implements VOIntf{

	private int idNum;
	private String id;
	private String pw;
	private String name;
	private String introduction;
	private String major;
	private int permission;
	private String phone;
	private String address;
	private MenuVO menu;
	
	public UserVO() {
	}

	public int getIdNum() {
		return idNum;
	}
	public UserVO setIdNum(int idNum) {
		this.idNum = idNum;
		return this;
	}
	public String getId() {
		return id;
	}
	public UserVO setId(String id) {
		this.id = id;
		return this;
	}
	public String getPw() {
		return pw;
	}
	public UserVO setPw(String pw) {
		this.pw = pw;
		return this;
	}
	public String getName() {
		return name;
	}
	public UserVO setName(String name) {
		this.name = name;
		return this;
	}
	public String getIntroduction() {
		return introduction;
	}
	public UserVO setIntroduction(String introduction) {
		this.introduction = introduction;
		return this;
	}
	public String getMajor() {
		return major;
	}
	public UserVO setMajor(String major) {
		this.major = major;
		return this;
	}
	public int getPermission() {
		return permission;
	}
	public UserVO setPermission(int permission) {
		this.permission = permission;
		return this;
	}
	public String getPhone() {
		return phone;
	}
	public UserVO setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public UserVO setAddress(String address) {
		this.address = address;
		return this;
	}
	public MenuVO getMenu() {
		if(menu == null)
			menu = new MenuVO();
		return menu;
	}
	public UserVO setMenu(MenuVO menu) {
		this.menu = menu;
		return this;
	}
	public UserVO setMenu() {
		this.menu = new MenuVO();
		return this;
	}
	@Override
	public VOIntf get() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public void set(VOIntf elem)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		
		return idNum+id+pw+introduction;
	}
}
