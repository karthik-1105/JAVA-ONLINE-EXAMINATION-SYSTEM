package main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

	private static JPanel MainPanel;

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
		//frame.add(new Help());
	}
	public MainFrame() {
		setResizable(false);
		setTitle("ONLINE EXAMINATION SYSTEM\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 584);
		MainPanel = new JPanel();
		MainPanel.setBounds(new Rectangle(0, 0, 1000, 600));
		MainPanel.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
		setContentPane(MainPanel);
		MainPanel.setLayout(null);
		AddPanel(new Panel1());
			}
	public static void AddPanel(JPanel p)
	{
		MainFrame.RemoveAllPanel();
		p.setBackground(Color.blue);
		p.setBounds(new Rectangle(0, 0, 1000, 600));
		MainPanel.add(p);
	}
	public static void RemoveAllPanel()
	{
		MainPanel.removeAll();
		MainPanel.repaint();
		MainPanel.revalidate();
	}
	public static Rectangle Dimensions()
	{
		return MainPanel.getBounds();
	}
}
