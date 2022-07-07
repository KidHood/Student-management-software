package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Examinee;
import model.ManageExamnineeModel;
import model.Provinces;
import myUtils.MyUtils;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.ProviderNotFoundException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.ManageEController;

import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;

public class ManageEView extends JFrame {

	private JPanel contentPane;
	public ManageExamnineeModel model;
	private JTextField tfield_Id;
	private JTable table;
	private JTextField textField_idInfor;
	private JTextField textField_Fullname;
	private JTextField textField_mark1;
	private JTextField textField_mark2;
	private JTextField textField_mark3;
	private JTextField textField_birthday_Infor;
	private ButtonGroup btn_sex;
	private JComboBox comboBox_birthPlace_Info;
	private JRadioButton rdbtnmale;
	private JRadioButton rdbtnfemale;
	private JComboBox comboBox_birthPlace_Search;
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageEView frame = new ManageEView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getTfield_Id() {
		return tfield_Id;
	}

	public void setTfield_Id(JTextField tfield_Id) {
		this.tfield_Id = tfield_Id;
	}

	public JTextField getTextField_idInfor() {
		return textField_idInfor;
	}

	public void setTextField_idInfor(JTextField textField_idInfor) {
		this.textField_idInfor = textField_idInfor;
	}

	public JTextField getTextField_Fullname() {
		return textField_Fullname;
	}

	public void setTextField_Fullname(JTextField textField_Fullname) {
		this.textField_Fullname = textField_Fullname;
	}

	public JTextField getTextField_mark1() {
		return textField_mark1;
	}

	public void setTextField_mark1(JTextField textField_mark1) {
		this.textField_mark1 = textField_mark1;
	}

	public JTextField getTextField_mark2() {
		return textField_mark2;
	}

	public void setTextField_mark2(JTextField textField_mark2) {
		this.textField_mark2 = textField_mark2;
	}

	public JTextField getTextField_mark3() {
		return textField_mark3;
	}

	public void setTextField_mark3(JTextField textField_mark3) {
		this.textField_mark3 = textField_mark3;
	}

	public JTextField getTextField_birthday_Infor() {
		return textField_birthday_Infor;
	}

	public void setTextField_birthday_Infor(JTextField textField_birthday_Infor) {
		this.textField_birthday_Infor = textField_birthday_Infor;
	}

	public ButtonGroup getBtn_sex() {
		return btn_sex;
	}

	public void setBtn_sex(ButtonGroup btn_sex) {
		this.btn_sex = btn_sex;
	}

	public JComboBox getComboBox_birthPlace_Info() {
		return comboBox_birthPlace_Info;
	}

	public void setComboBox_birthPlace_Info(JComboBox comboBox_birthPlace_Info) {
		this.comboBox_birthPlace_Info = comboBox_birthPlace_Info;
	}

	/**
	 * Create the frame.
	 */
	public ManageEView() {
		this.model = new ManageExamnineeModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 704);

		ActionListener ac = new ManageEController(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);

		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(ac);
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);

		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(ac);
		menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuSave);

		JSeparator separator = new JSeparator();
		menuFile.add(separator);

		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(ac);
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);

		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);

		JMenuItem menuAboutme = new JMenuItem("About me");
		menuAboutme.addActionListener(ac);
		menuAboutme.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuAboutme);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_birthPlace = new JLabel("Quê quán");
		label_birthPlace.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_birthPlace.setBounds(25, 14, 103, 36);
		contentPane.add(label_birthPlace);

		JLabel lblMThIinh = new JLabel("Mã thí sinh");
		lblMThIinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblMThIinh.setBounds(347, 14, 103, 36);
		contentPane.add(lblMThIinh);

		tfield_Id = new JTextField();
		tfield_Id.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfield_Id.setColumns(10);
		tfield_Id.setBounds(460, 13, 226, 41);
		contentPane.add(tfield_Id);

		JButton button_Search = new JButton("Tìm");
		button_Search.addActionListener(ac);
		button_Search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Search.setBounds(740, 15, 110, 37);
		contentPane.add(button_Search);

		comboBox_birthPlace_Search = new JComboBox();
		ArrayList<Provinces> listProvinces = Provinces.getListProvinces();
		comboBox_birthPlace_Search.addItem("");
		for (Provinces name : listProvinces) {
			comboBox_birthPlace_Search.addItem(name.getNameProvince());
		}
		comboBox_birthPlace_Search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_birthPlace_Search.setBounds(145, 15, 169, 36);
		contentPane.add(comboBox_birthPlace_Search);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 72, 1016, 2);
		contentPane.add(separator_1);

		JLabel label_listE = new JLabel("Danh sách thí sinh");
		label_listE.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_listE.setBounds(10, 79, 175, 36);
		contentPane.add(label_listE);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD T\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh",
						"Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3" }));

		table.setRowHeight(25);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 112, 1016, 232);
		contentPane.add(scrollPane);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 362, 1016, 2);
		contentPane.add(separator_1_1);

		JLabel label_inforE = new JLabel("Thông tin thí sinh");
		label_inforE.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_inforE.setBounds(10, 362, 155, 36);
		contentPane.add(label_inforE);

		textField_idInfor = new JTextField();
		textField_idInfor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_idInfor.setColumns(10);
		textField_idInfor.setBounds(169, 412, 156, 28);
		contentPane.add(textField_idInfor);

		JLabel label_Id_Infor = new JLabel("Mã thí sinh");
		label_Id_Infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_Id_Infor.setBounds(56, 407, 103, 36);
		contentPane.add(label_Id_Infor);

		textField_Fullname = new JTextField();
		textField_Fullname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Fullname.setColumns(10);
		textField_Fullname.setBounds(169, 455, 156, 28);
		contentPane.add(textField_Fullname);

		JLabel label_fullName_infor = new JLabel("Họ và Tên");
		label_fullName_infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_fullName_infor.setBounds(56, 450, 103, 36);
		contentPane.add(label_fullName_infor);

		JLabel label_birthPLace_Infor = new JLabel("Quê quán");
		label_birthPLace_Infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_birthPLace_Infor.setBounds(56, 492, 103, 36);
		contentPane.add(label_birthPLace_Infor);

		comboBox_birthPlace_Info = new JComboBox();
		comboBox_birthPlace_Info.addItem("");
		for (Provinces name : listProvinces) {
			comboBox_birthPlace_Info.addItem(name.getNameProvince());
		}
		comboBox_birthPlace_Info.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_birthPlace_Info.setBounds(169, 496, 156, 30);
		contentPane.add(comboBox_birthPlace_Info);

		JLabel label_birthday_Infor = new JLabel("Ngày sinh");
		label_birthday_Infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_birthday_Infor.setBounds(56, 538, 103, 36);
		contentPane.add(label_birthday_Infor);

		JLabel label_sex_Infor = new JLabel("Giới Tính");
		label_sex_Infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_sex_Infor.setBounds(560, 407, 103, 36);
		contentPane.add(label_sex_Infor);

		rdbtnmale = new JRadioButton("Nam");
		rdbtnmale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnmale.setBounds(689, 416, 81, 21);
		contentPane.add(rdbtnmale);

		rdbtnfemale = new JRadioButton("Nữ");
		rdbtnfemale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnfemale.setBounds(808, 416, 81, 21);
		contentPane.add(rdbtnfemale);

		btn_sex = new ButtonGroup();
		btn_sex.add(rdbtnmale);
		btn_sex.add(rdbtnfemale);

		JLabel label_mark1_infor = new JLabel("Điểm môn 1");
		label_mark1_infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_mark1_infor.setBounds(560, 450, 123, 36);
		contentPane.add(label_mark1_infor);

		textField_mark1 = new JTextField();
		textField_mark1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_mark1.setColumns(10);
		textField_mark1.setBounds(689, 455, 156, 28);
		contentPane.add(textField_mark1);

		JLabel label_mark2_infor = new JLabel("Điểm môn 2");
		label_mark2_infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_mark2_infor.setBounds(560, 492, 123, 36);
		contentPane.add(label_mark2_infor);

		textField_mark2 = new JTextField();
		textField_mark2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_mark2.setColumns(10);
		textField_mark2.setBounds(689, 497, 156, 28);
		contentPane.add(textField_mark2);

		JLabel label_mark3_infor = new JLabel("Điểm môn 3");
		label_mark3_infor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label_mark3_infor.setBounds(560, 535, 123, 36);
		contentPane.add(label_mark3_infor);

		textField_mark3 = new JTextField();
		textField_mark3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_mark3.setColumns(10);
		textField_mark3.setBounds(689, 543, 156, 28);
		contentPane.add(textField_mark3);

		textField_birthday_Infor = new JTextField();
		textField_birthday_Infor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_birthday_Infor.setColumns(10);
		textField_birthday_Infor.setBounds(169, 542, 156, 28);
		contentPane.add(textField_birthday_Infor);

		JButton button_Insert = new JButton("Thêm");
		button_Insert.addActionListener(ac);
		button_Insert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Insert.setBounds(75, 590, 110, 37);
		contentPane.add(button_Insert);

		JButton button_Delete = new JButton("Xóa");
		button_Delete.addActionListener(ac);
		button_Delete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Delete.setBounds(270, 590, 110, 37);
		contentPane.add(button_Delete);

		JButton button_Update = new JButton("Cập nhật");
		button_Update.addActionListener(ac);
		button_Update.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Update.setBounds(454, 590, 110, 37);
		contentPane.add(button_Update);

		JButton button_Save = new JButton("Lưu");
		button_Save.addActionListener(ac);
		button_Save.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Save.setBounds(660, 590, 110, 37);
		contentPane.add(button_Save);

		JButton button_Cancel = new JButton("Hủy bỏ");
		button_Cancel.addActionListener(ac);
		button_Cancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Cancel.setBounds(838, 590, 110, 37);
		contentPane.add(button_Cancel);

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 580, 1016, 2);
		contentPane.add(separator_1_1_1);

		JButton button_CancelSearch = new JButton("Hủy");
		button_CancelSearch.addActionListener(ac);
		button_CancelSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_CancelSearch.setBounds(894, 15, 110, 37);
		contentPane.add(button_CancelSearch);
		this.setVisible(true);
	}

	public void delete() {
		textField_birthday_Infor.setText("");
		textField_idInfor.setText("");
		textField_mark1.setText("");
		textField_mark2.setText("");
		textField_mark3.setText("");
		textField_Fullname.setText("");
		comboBox_birthPlace_Info.setSelectedIndex(-1);
		btn_sex.clearSelection();
	}

	public void add() {
		try {
			boolean cont = true;
//			int examnineeID = Integer.parseInt(this.getTextField_idInfor().getText());
			int examnineeID = MyUtils.getIntegerJtext(this, "Bạn xem lại phần nhập id", 
					this.getTextField_idInfor());
			
			String name = this.getTextField_Fullname().getText();
			int birthPlace = this.getComboBox_birthPlace_Info().getSelectedIndex() - 1;
			Provinces province = Provinces.getProvinceById(birthPlace);

			String birthday_temp = MyUtils.getDateDialog(this, "Birth day is invald!\nRe'input!!!",
													this.getTextField_birthday_Infor().getText());
			boolean sex = true;
			if (rdbtnmale.isSelected()) {
				sex = true;
			} else if (rdbtnfemale.isSelected()) {
				sex = false;
			}

			float mark1 = MyUtils.getFloatJtext(this, "Hãy xem lại phần nhập điểm 1", 
					this.getTextField_mark1());
			float mark2 = MyUtils.getFloatJtext(this, "Hãy xem lại phần nhập điểm 2", 
					this.getTextField_mark2());
			float mark3 = MyUtils.getFloatJtext(this, "Hãy xem lại phần nhập điểm 3", 
					this.getTextField_mark3());
			
			Examinee ts = new Examinee(examnineeID, name, province, birthday_temp, sex, mark1, mark2, mark3);
			if (this.model.getChoice().equals("") || this.model.getChoice().equals("Thêm")) {
				this.addExamnieeOrUpDate(ts);
			} else if (this.model.getChoice().equals("Cập nhật")) {
				this.addExamnieeOrUpDate(ts);
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public Examinee getExaminee_Chosing() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int eId = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
		String nameE = model_table.getValueAt(i_row, 1) + "";
		Provinces provinces = Provinces.getProvinceByName(model_table.getValueAt(i_row, 2) + "");
		String birthday = model_table.getValueAt(i_row, 3) + "";
		String sex_text = model_table.getValueAt(i_row, 4) + "";
		boolean sex = sex_text.equals("Nam");
		float mark1 = Float.valueOf(model_table.getValueAt(i_row, 5) + "");
		float mark2 = Float.valueOf(model_table.getValueAt(i_row, 6) + "");
		float mark3 = Float.valueOf(model_table.getValueAt(i_row, 7) + "");

		Examinee ts = new Examinee(eId, nameE, provinces, birthday, sex, mark1, mark2, mark3);
		return ts;
	}

	public void addExamineeAfterSearch (Examinee ts, DefaultTableModel model_table) {
		model_table.addRow(new Object[] { ts.getExamnineeID() + "", ts.getName() + "",
				ts.getBirthPlace().getNameProvince(), ts.getBirthday().toString(), (ts.isSex() ? "Nam" : "Nữ"),
				ts.getMark1() + "", ts.getMark2() + "", ts.getMark3() + "", });
	}
	
	public void addExamnieeOrUpDate(Examinee ts) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model.checkExit(ts)) {
			this.model.insert(ts);
			this.addExamineeAfterSearch(ts, model_table);
		} else {
			this.model.update(ts);
			int numberRow = model_table.getRowCount();
			for (int i = 0; i < numberRow; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(ts.getExamnineeID() + "")) {
					model_table.setValueAt(ts.getExamnineeID(), i, 0);
					model_table.setValueAt(ts.getName(), i, 1);
					model_table.setValueAt(ts.getBirthPlace().getNameProvince(), i, 2);
					model_table.setValueAt(ts.getBirthday().toString(), i, 3);
					model_table.setValueAt((ts.isSex() ? "Nam" : "Nữ"), i, 4);
					model_table.setValueAt(ts.getMark1(), i, 5);
					model_table.setValueAt(ts.getMark2(), i, 6);
					model_table.setValueAt(ts.getMark3(), i, 7);
				}

			}
		}
	}

	public void updateE(Examinee ts) {

	}

	public void showInfor_Choose() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();

		this.textField_idInfor.setText(model_table.getValueAt(i_row, 0) + "");
		this.textField_Fullname.setText(model_table.getValueAt(i_row, 1) + "");
		Provinces province_1 = Provinces.getProvinceByName(model_table.getValueAt(i_row, 2) + "");
		this.comboBox_birthPlace_Info.setSelectedItem(province_1.getNameProvince());
		this.textField_birthday_Infor.setText(model_table.getValueAt(i_row, 3) + "");
		String textSex = model_table.getValueAt(i_row, 4) + "";
		boolean sex = textSex.equals("Nam");
		if (sex) {
			rdbtnmale.setSelected(true);
		} else {
			rdbtnfemale.setSelected(true);
		}
		this.textField_mark1.setText(model_table.getValueAt(i_row, 5) + "");
		this.textField_mark2.setText(model_table.getValueAt(i_row, 6) + "");
		this.textField_mark3.setText(model_table.getValueAt(i_row, 7) + "");

	}

	public void ExcuteDelete() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();

		int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc muốn xóa?");
		if (choice == JOptionPane.YES_OPTION) {
			Examinee ts = getExaminee_Chosing();
			model_table.removeRow(i_row);
			this.model.delete(ts);
		}
	}

	public void excuteSearch() {
		//Gội hàm hủy tìm để có thể tìm 
//		this.excuteCancel();
		//Thực hiện tìm kiếm
		int birthPlaceId = this.comboBox_birthPlace_Search.getSelectedIndex() - 1;
		String idE = this.tfield_Id.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int numberRow = model_table.getRowCount();

		Set<Integer> IdofExamni_Delete = new TreeSet<Integer>();
		if (birthPlaceId >= 0) {
			Provinces province_Chosing = Provinces.getProvinceById(birthPlaceId);
			for (int i = 0; i < numberRow; i++) {
				String provinceName = model_table.getValueAt(i, 2) + "";
				String id = model_table.getValueAt(i, 0) + "";
				if (!provinceName.equals(province_Chosing.getNameProvince())){
					IdofExamni_Delete.add(Integer.valueOf(id));
				}
			}
		}
		if (idE.length() > 0) {
			for (int i = 0; i < numberRow; i++) {
				String idEInTable = model_table.getValueAt(i, 0) + "";
				if (! idEInTable.equals(idE)) {
					IdofExamni_Delete.add(Integer.valueOf(idEInTable));
				}
			}
		}
		
		for (Integer id : IdofExamni_Delete) {
			numberRow = model_table.getRowCount();
			for (int i = 0; i < numberRow; i++) {
				String idInTable = model_table.getValueAt(i, 0) + "";
				if (idInTable.equals(id.toString())) {
						try {
							model_table.removeRow(i);
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
				}
			}
		}
	}

	
	
	public void excuteRefresh() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int row_table = 0;
		
		while (true) {
			row_table = model_table.getRowCount();
			if(row_table == 0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					// TODO: handle exception
				}
		}
		
		for(Examinee ts:  this.model.getListExaminee()) {
			this.addExamineeAfterSearch(ts, model_table);
		}
		tfield_Id.setText("");
		comboBox_birthPlace_Search.setSelectedIndex(0);
	}

	public void showAbout() {
		JOptionPane.showMessageDialog(this, "Phần mềm quản lí sinh viên 1.0!");	
	}

	public void exitProgram() {
		int choice = JOptionPane.showConfirmDialog(this,
				"Bạn có muốn thoát khỏi chương trình?",
				"Exit",
				JOptionPane.YES_NO_OPTION);
		if (choice == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}
	public void saveFile(String path) {
		try {
			this.model.setNameFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Examinee e : this.model.getListExaminee()) {
				oos.writeObject(e);
			}
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void excuteSaveFile() {
		if(this.model.getNameFile().length() > 0) {
			saveFile(this.model.getNameFile());
		}else{
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
		
	}

	public void openFile(File file) {
		ArrayList<Examinee> list = new ArrayList<Examinee>();
		try {
			this.model.setNameFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Examinee e = null;
			while((e = (Examinee) ois.readObject()) != null) {
				list.add(e);
			}
			ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		this.model.setListExaminee(list);
	}
	
	public void excuteOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			this.excuteRefresh();
		}
	}
}
