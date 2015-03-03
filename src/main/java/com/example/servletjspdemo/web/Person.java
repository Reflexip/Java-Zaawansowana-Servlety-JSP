package com.example.servletjspdemo.web;

public class Person {
	
	private int 	id;
	private String 	name;
	private String 	surname;
	private String 	email;
	private String 	employer;
	private String	radio;
	private String 	whatDo;
	
		Person(int id, String name, String surname, String email, String employer, String radio, String whatDo){
			
			this.id			= id;
			this.name 		= name;
			this.surname	= surname;
			this.email 		= email;
			this.employer 	= employer;
			this.radio 		= radio;
			this.whatDo 	= whatDo;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmployer() {
			return employer;
		}

		public void setEmployer(String employer) {
			this.employer = employer;
		}

		public String getRadio() {
			return radio;
		}

		public void setRadio(String radio) {
			this.radio = radio;
		}

		public String getWhatDo() {
			return whatDo;
		}

		public void setWhatDo(String whatDo) {
			this.whatDo = whatDo;
		}

}
