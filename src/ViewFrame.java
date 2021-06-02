
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import view.FirstXPlane;
import view.FirstYPlane;
import view.LastXPlane;
import view.LastYPlane;
import view.ParentPlane;
import view.ZPlane;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewFrame extends JFrame {

	private JPanel contentPane;

	public ViewFrame(boolean[][][] state, float percent) {
		setTitle("RESULT");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1192, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ParentPlane[] planes = new ParentPlane[5];

		planes[0] = new FirstXPlane(state);
		planes[0].setPreferredSize(new Dimension(400, 400));

		planes[1] = new LastXPlane(state);
		planes[1].setPreferredSize(new Dimension(400, 400));

		planes[2] = new FirstYPlane(state);
		planes[2].setPreferredSize(new Dimension(400, 400));

		planes[3] = new LastYPlane(state);
		planes[3].setPreferredSize(new Dimension(400, 400));

		planes[4] = new ZPlane(state);
		planes[4].setPreferredSize(new Dimension(400, 400));

		JScrollPane scrollPane_0 = new JScrollPane();
		scrollPane_0.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane_0.setBounds(22, 25, 350, 300);
		scrollPane_0.setViewportView(planes[0]);
		contentPane.add(scrollPane_0);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane_1.setBounds(414, 25, 350, 300);
		scrollPane_1.setViewportView(planes[1]);
		contentPane.add(scrollPane_1);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane_2.setBounds(805, 25, 350, 300);
		scrollPane_2.setViewportView(planes[2]);
		contentPane.add(scrollPane_2);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane_3.setBounds(22, 370, 350, 300);
		scrollPane_3.setViewportView(planes[3]);
		contentPane.add(scrollPane_3);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane_4.setBounds(414, 370, 350, 300);
		scrollPane_4.setViewportView(planes[4]);
		contentPane.add(scrollPane_4);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(805, 370, 350, 300);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblMessage = new JLabel("Volume of the room that can be seen");
		lblMessage.setBounds(31, 81, 290, 47);
		panel.add(lblMessage);
		lblMessage.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblPercent = new JLabel("");
		lblPercent.setBounds(114, 138, 118, 36);
		panel.add(lblPercent);
		lblPercent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPercent.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblPercent.setText(Float.toString(percent * 100) + " %");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
		btnCancel.setBounds(122, 206, 104, 42);
		panel.add(btnCancel);

	}
}
