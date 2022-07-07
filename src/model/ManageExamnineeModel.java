package model;

import java.util.ArrayList;


public class ManageExamnineeModel {
	private ArrayList<Examinee> listExaminee;
	private String choice;
	private String nameFile;

	public ManageExamnineeModel() {
		this.listExaminee = new ArrayList<Examinee>();
		this.choice = "";
		this.nameFile = "";
	}

	
	public String getNameFile() {
		return nameFile;
	}


	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}


	public ManageExamnineeModel(ArrayList<Examinee> listExaminee) {
		this.listExaminee = listExaminee;
	}

	public ArrayList<Examinee> getListExaminee() {
		return listExaminee;
	}

	public void setListExaminee(ArrayList<Examinee> listExaminee) {
		this.listExaminee = listExaminee;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public void insert(Examinee e) {
		listExaminee.add(e);
	}

	public void delete(Examinee e) {
		listExaminee.remove(e);
	}

	public void edit(Examinee e) {
//		listExaminee.
	}
	
	public void update(Examinee e) {
		this.listExaminee.remove(e);
		this.listExaminee.add(e);
	}

	public boolean checkExit(Examinee ts) {
		for (Examinee examinee : listExaminee) {
			if(ts.getExamnineeID() == examinee.getExamnineeID())
				return true;
		}
		return false;
	}
}
