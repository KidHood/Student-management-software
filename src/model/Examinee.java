package model;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Examinee implements Serializable{
	private int examnineeID;
	private String name;
	private Provinces birthPlace;
	private String birthday;
	private boolean sex;
	private float mark1;
	private float mark2;
	private float mark3;
	
	public Examinee() {
		// TODO Auto-generated constructor stub
	}

	public Examinee(int examnineeID, String name, Provinces birthPlace, String birthday, boolean sex, float mark1,
			float mark2, float mark3) {
		this.examnineeID = examnineeID;
		this.name = name;
		this.birthPlace = birthPlace;
		this.birthday = birthday;
		this.sex = sex;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public int getExamnineeID() {
		return examnineeID;
	}

	public void setExamnineeID(int examnineeID) {
		this.examnineeID = examnineeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Provinces getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(Provinces birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public float getMark1() {
		return mark1;
	}

	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}

	public float getMark2() {
		return mark2;
	}

	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}

	public float getMark3() {
		return mark3;
	}

	public void setMark3(float mark3) {
		this.mark3 = mark3;
	}

	@Override
	public String toString() {
		return "Examinee [examnineeID=" + examnineeID + ", name=" + name + ", birthPlace=" + birthPlace + ", birthday="
				+ birthday + ", sex=" + sex + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthPlace, birthday, examnineeID, mark1, mark2, mark3, name, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examinee other = (Examinee) obj;
		return Objects.equals(birthPlace, other.birthPlace) && Objects.equals(birthday, other.birthday)
				&& examnineeID == other.examnineeID && Float.floatToIntBits(mark1) == Float.floatToIntBits(other.mark1)
				&& Float.floatToIntBits(mark2) == Float.floatToIntBits(other.mark2)
				&& Float.floatToIntBits(mark3) == Float.floatToIntBits(other.mark3) && Objects.equals(name, other.name)
				&& sex == other.sex;
	}
	
	
	
}
