package VO;

import java.util.Deque;
import java.util.LinkedList;

public class PostLink extends LinkedList<PostVO> implements VOIntf,Deque<PostVO> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6890705199965039650L;
	private String user_id;
	private String menu_str;
	public PostLink() {
		super();
	}
	public PostLink(PostVO elem)
	{
		super();
		this.add(elem);
	}
	@Override
	public VOIntf get() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public void set(VOIntf elem) {
		// TODO Auto-generated method stub
	}
	public String getUser_id() {
		return user_id;
	}
	public PostLink setUser_id(String user_id) {
		this.user_id = user_id;
		return this;
	}
	public String getMenu_str() {
		return menu_str;
	}
	public PostLink setMenu_str(String menu_str) {
		this.menu_str = menu_str;
		return this;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
