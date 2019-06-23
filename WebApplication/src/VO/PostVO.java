package VO;

import java.sql.Timestamp;

public class PostVO implements VOIntf{

	private Timestamp when;
	private String postName;
	private int permission;
	private String postContents;
	private int postnumber;
	public Timestamp getWhen() {
		return when;
	}
	public PostVO setWhen(Timestamp when) {
		this.when = when;
		return this;
	}
	public String getPostName() {
		return postName;
	}
	public PostVO setPostName(String postName) {
		this.postName = postName;
		return this;

	}
	public int getPermission() {
		return permission;
	}
	public PostVO setPermission(int permission) {
		this.permission = permission;
		return this;
	}
	public String getPostContents() {
		return postContents;
	}
	public PostVO setPostContents(String postContents) {
		this.postContents = postContents;
		return this;
	}
	public int getPostnumber() {
		return postnumber;
	}
	public PostVO setPostnumber(int postnumber) {
		this.postnumber = postnumber;
		return this;
	}
	@Override
	public String toString() {
		return this.postName;
	}
	@Override
	public VOIntf get() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void set(VOIntf elem) {
		// TODO Auto-generated method stub
		
	}
}
