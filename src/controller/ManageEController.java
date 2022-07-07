package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import model.Examinee;
import model.Provinces;
import myUtils.MyUtils;
import view.ManageEView;

public class ManageEController implements ActionListener {

	ManageEView manageEView;

	public ManageEController(ManageEView manageEView) {
		this.manageEView = manageEView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		switch (src) {
		case "Thêm":
			this.manageEView.delete();
			this.manageEView.model.setChoice("Thêm");
			break;
		case "Lưu":
			this.manageEView.add();
			break;
		case "Cập nhật":
			this.manageEView.showInfor_Choose();
			break;
		case "Xóa":
			this.manageEView.ExcuteDelete();
			break;
		case "Hủy bỏ":
			this.manageEView.delete();
			break;
		case "Tìm":
			this.manageEView.excuteSearch();
			break;
		case "Hủy":
			this.manageEView.excuteRefresh();
			break;
		case "About me":
			this.manageEView.showAbout();
			break;
		case "Exit":
			this.manageEView.exitProgram();
			break;
		case "Save":
			this.manageEView.excuteSaveFile();
			break;
		case "Open":
			this.manageEView.excuteOpenFile();
			break;
		}

	}

}
