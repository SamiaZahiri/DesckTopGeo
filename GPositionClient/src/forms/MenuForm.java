package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MenuForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuForm frame = new MenuForm();
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
	public MenuForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(5, 5, 806, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\menu4.png"));
		lblNewLabel.setBounds(24, 11, 46, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Utilisateur");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(5, 72, 806, 521);
		contentPane.add(desktopPane);
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserForm u =new UserForm();
				desktopPane.removeAll();
				desktopPane.add(u);
				int a=desktopPane.getWidth(), b=desktopPane.getHeight();
				u.setSize(a, b);
				u.setLocation((desktopPane.getWidth()- desktopPane.getWidth()),(desktopPane.getHeight()-desktopPane.getHeight()));
				u.setVisible(true);
			}
		});
		lblNewLabel_1.setBounds(109, 19, 98, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SmarthPhone");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SmartPhoneForm u =new SmartPhoneForm();
				desktopPane.removeAll();
				desktopPane.add(u);
				int a=desktopPane.getWidth(), b=desktopPane.getHeight();
				u.setSize(a, b);
				u.setLocation((desktopPane.getWidth()- desktopPane.getWidth()),(desktopPane.getHeight()-desktopPane.getHeight()));
				u.setVisible(true);
			}
		});
		lblNewLabel_2.setBounds(233, 19, 107, 26);
		panel.add(lblNewLabel_2);
		
		
	}
}
