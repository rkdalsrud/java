package xyz.itwill.student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class WindowBuilderApp extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderApp frame = new WindowBuilderApp();
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
	public WindowBuilderApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 486);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton red = new JButton("New button");
		red.setFont(new Font("바탕체", Font.PLAIN, 12));
		panel.add(red);
		
		btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		panel.add(tglbtnNewToggleButton);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.EAST);
	}

}
