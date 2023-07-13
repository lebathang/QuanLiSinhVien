package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Vector;

import model.QLSVModel;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.MutableComboBoxModel;


public class QLSVView extends JFrame {

	private JPanel contentPane;
	QLSVModel model;
	private JTextField textField_maSV;
	private JTable table;
	private JTextField textField_ID;
	private JTextField textField_hovaten;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setTitle("QUẢN LÝ SINH VIÊN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 712);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("FILE");
		menuBar.add(menuFile);
		
		JMenuItem MenuOpen = new JMenuItem("OPEN");
		menuFile.add(MenuOpen);
		
		JMenuItem menuClose = new JMenuItem("CLOSE");
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("EXIT");
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("ABOUT");
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("ABOUT ME");
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label_quequan = new JLabel("Quê quán");
		Label_quequan.setFont(new Font("Tahoma", Font.BOLD, 19));
		Label_quequan.setBounds(42, 10, 125, 45);
		contentPane.add(Label_quequan);
		
		JLabel Label_maSV = new JLabel("Mã sinh viên");
		Label_maSV.setFont(new Font("Tahoma", Font.BOLD, 19));
		Label_maSV.setBounds(434, 10, 125, 45);
		contentPane.add(Label_maSV);
		
		textField_maSV = new JTextField();
		textField_maSV.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_maSV.setColumns(10);
		textField_maSV.setBounds(592, 10, 200, 45);
		contentPane.add(textField_maSV);
		
		JButton btnTm = new JButton("TÌM");
		btnTm.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnTm.setBounds(840, 10, 104, 51);
		contentPane.add(btnTm);
		
		JComboBox comboBox_quequan = new JComboBox();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_quequan.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_quequan.addItem(tinh.getTenTinh());
		}
		comboBox_quequan.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_quequan.setBounds(190, 10, 200, 45);
		contentPane.add(comboBox_quequan);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 72, 965, 2);
		contentPane.add(separator_1);
		
		JLabel Label_quequan_1 = new JLabel("Danh sách sinh viên");
		Label_quequan_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		Label_quequan_1.setBounds(42, 84, 200, 45);
		contentPane.add(Label_quequan_1);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 sinh vi\u00EAn", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(42, 139, 902, 150);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 299, 965, 2);
		contentPane.add(separator_1_1);
		
		JLabel Label_ID = new JLabel("Mã sinh viên");
		Label_ID.setFont(new Font("Tahoma", Font.BOLD, 19));
		Label_ID.setBounds(42, 362, 125, 45);
		contentPane.add(Label_ID);
		
		textField_ID = new JTextField();
		textField_ID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_ID.setColumns(10);
		textField_ID.setBounds(200, 362, 200, 45);
		contentPane.add(textField_ID);
		
		textField_hovaten = new JTextField();
		textField_hovaten.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_hovaten.setColumns(10);
		textField_hovaten.setBounds(200, 417, 200, 45);
		contentPane.add(textField_hovaten);
		
		JLabel lblHVTn = new JLabel("Họ và tên");
		lblHVTn.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblHVTn.setBounds(42, 417, 125, 45);
		contentPane.add(lblHVTn);
		
		JLabel lblQuQun = new JLabel("Quê quán");
		lblQuQun.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblQuQun.setBounds(42, 469, 125, 45);
		contentPane.add(lblQuQun);
		
		JLabel lblNga = new JLabel("Ngày sinh");
		lblNga.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNga.setBounds(42, 524, 125, 45);
		contentPane.add(lblNga);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_3.setColumns(10);
		textField_3.setBounds(200, 524, 200, 45);
		contentPane.add(textField_3);
		
		JLabel lblGiiTnh = new JLabel("Giới tính");
		lblGiiTnh.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblGiiTnh.setBounds(586, 362, 125, 45);
		contentPane.add(lblGiiTnh);
		
		JLabel lblMn_mon_1 = new JLabel("Môn 1");
		lblMn_mon_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMn_mon_1.setBounds(586, 417, 125, 45);
		contentPane.add(lblMn_mon_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_5.setColumns(10);
		textField_5.setBounds(744, 417, 200, 45);
		contentPane.add(textField_5);
		
		JLabel lblMn_mon_2 = new JLabel("Môn 2");
		lblMn_mon_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMn_mon_2.setBounds(586, 469, 125, 45);
		contentPane.add(lblMn_mon_2);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_6.setColumns(10);
		textField_6.setBounds(744, 469, 200, 45);
		contentPane.add(textField_6);
		
		JLabel lblMn__mon_3 = new JLabel("Môn 3");
		lblMn__mon_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMn__mon_3.setBounds(586, 524, 125, 45);
		contentPane.add(lblMn__mon_3);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_7.setColumns(10);
		textField_7.setBounds(744, 524, 200, 45);
		contentPane.add(textField_7);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 579, 965, 2);
		contentPane.add(separator_1_1_1);
		
		JLabel Label_thongtinSV = new JLabel("Thông tin sinh viên");
		Label_thongtinSV.setFont(new Font("Tahoma", Font.BOLD, 19));
		Label_thongtinSV.setBounds(42, 311, 200, 45);
		contentPane.add(Label_thongtinSV);
		
		JComboBox comboBox_quequan_1 = new JComboBox();
		comboBox_quequan_1.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_quequan_1.addItem(tinh.getTenTinh());
		}
		comboBox_quequan_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_quequan_1.setBounds(200, 469, 200, 45);
		contentPane.add(comboBox_quequan_1);
		
		JRadioButton RadioButton_nam = new JRadioButton("Nam");
		RadioButton_nam.setFont(new Font("Tahoma", Font.BOLD, 19));
		RadioButton_nam.setBounds(744, 362, 96, 45);
		contentPane.add(RadioButton_nam);
		
		JRadioButton RadioButton_nu = new JRadioButton("Nữ");
		RadioButton_nu.setFont(new Font("Tahoma", Font.BOLD, 19));
		RadioButton_nu.setBounds(848, 362, 96, 45);
		contentPane.add(RadioButton_nu);
		
		JButton btnThm = new JButton("Thêm");
		btnThm.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnThm.setBounds(42, 591, 125, 51);
		contentPane.add(btnThm);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnXa.setBounds(231, 591, 125, 51);
		contentPane.add(btnXa);
		
		JButton btnCpNht = new JButton("Cập nhật");
		btnCpNht.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnCpNht.setBounds(434, 591, 125, 51);
		contentPane.add(btnCpNht);
		
		JButton btnLu = new JButton("Hủy bỏ");
		btnLu.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnLu.setBounds(819, 591, 125, 51);
		contentPane.add(btnLu);
		
		JButton btnLu_1 = new JButton("Lưu");
		btnLu_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnLu_1.setBounds(629, 591, 135, 51);
		contentPane.add(btnLu_1);
		
		this.setVisible(true);
	}
}
