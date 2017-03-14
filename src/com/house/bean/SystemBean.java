package com.house.bean;

/**
 * 系统设置
 * 
 * @author TrueBt
 *
 */
public class SystemBean {

	private String id;

	private String code;

	private String content;

	private String flag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "SystemBean [id=" + id + ", code=" + code + ", content=" + content + ", flag=" + flag + "]";
	}
}
