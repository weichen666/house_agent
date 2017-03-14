package com.house.bean;

/**
 * 用户
 * @author TrueBt
 *
 */
public class UserBean {
	
	private String id;
	
	private String username;
	
	private String passsword;
	
	private String type;
	
	private String sex;
	
	private String birth;
	
	private String phone;
	
	private String flag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", username=" + username + ", passsword=" + passsword + ", type=" + type
				+ ", sex=" + sex + ", birth=" + birth + ", phone=" + phone + ", flag=" + flag + "]";
	}
}
