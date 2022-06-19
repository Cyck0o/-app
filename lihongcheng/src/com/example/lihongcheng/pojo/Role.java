package com.example.lihongcheng.pojo;

public class Role {
	 private int roleImage;
	 private String roleName;
	 private String roleActor;
	 private String roleInfo;
	 
	 public Role(int roleImage, String roleName, String roleActor,
	   String roleInfo) {
	  super();
	  this.roleImage = roleImage;
	  this.roleName = roleName;
	  this.roleActor = roleActor;
	  this.roleInfo = roleInfo;
	 }
	 
	 public int getRoleImage() {
	  return roleImage;
	 }

	 public void setRoleIamge(int roleImage) {
	  this.roleImage = roleImage;
	 }

	 public String getRoleName() {
	  return roleName;
	 }

	 public void setRoleName(String roleName) {
	  this.roleName = roleName;
	 }

	 public String getRoleActor() {
	  return roleActor;
	 }

	 public void setRoleActor(String roleActor) {
	  this.roleActor = roleActor;
	 }

	 public String getRoleInfo() {
	  return roleInfo;
	 }

	 public void setRoleInfo(String roleInfo) {
	  this.roleInfo = roleInfo;
	 }

	}
