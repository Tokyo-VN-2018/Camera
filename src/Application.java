import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import controller.BlockController;
import controller.RoomController;
import georegression.struct.point.Point3D_F32;
import model.Camera;
import service.ReadFileService;
import service.impl.ReadFileServiceImpl;
import view.FirstXPlane;
import view.FirstYPlane;
import view.LastXPlane;
import view.LastYPlane;
import view.ParentPlane;
import view.ZPlane;

import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Application {

	private JFrame frmCameraProjector;
	private JTextField txtFileLink;
	private JTextField txtAccuracy;
	
	public static ReadFileService readFileService = new ReadFileServiceImpl();

	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frmCameraProjector.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Application() {
		initialize();
	}

	private void initialize() {
		frmCameraProjector = new JFrame();
		frmCameraProjector.setTitle("Camera Projector");
		frmCameraProjector.setBounds(100, 100, 808, 518);
		frmCameraProjector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCameraProjector.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tokyo Team");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 28));
		lblNewLabel.setBounds(277, 10, 241, 48);
		frmCameraProjector.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Object-oriented programming Class");
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(181, 390, 408, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lecturer: Nguyen Tien Thanh");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(191, 430, 408, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("MEMBERS");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(24, 83, 110, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("NGUYEN VIET HOANG");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1.setBounds(24, 134, 201, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("NGO VAN ANH");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1_1.setBounds(24, 185, 201, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("CHU TIEN DAT");
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1_2.setBounds(24, 236, 201, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("NGUYEN TIEN DUNG");
		lblNewLabel_1_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1_3.setBounds(24, 287, 201, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("INPUT DATA");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_2.setBounds(513, 83, 110, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("FILE LINK");
		lblNewLabel_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_3.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_3.setBounds(271, 134, 110, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1_3);
		
		txtFileLink = new JTextField();
		txtFileLink.setBounds(391, 135, 352, 25);
		frmCameraProjector.getContentPane().add(txtFileLink);
		txtFileLink.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("ACCURACY");
		lblNewLabel_1_1_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_3_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_3_1.setBounds(271, 198, 110, 41);
		frmCameraProjector.getContentPane().add(lblNewLabel_1_1_1_3_1);
		
		txtAccuracy = new JTextField();
		txtAccuracy.setBounds(391, 197, 352, 25);
		frmCameraProjector.getContentPane().add(txtAccuracy);
		txtAccuracy.setColumns(10);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int accu = 0;
				float percentObser = 0;
				
				String fileLink = txtFileLink.getText();
				String accuracy = txtAccuracy.getText();
				
				try {
					accu = Integer.parseInt(accuracy);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Accuracy must be Integer number !!!");
				}
				
				if (accu == 10 || accu == 100) {
					
					// Get file's content
			    	List<String> strings = readFileService.readFilefromS(fileLink);
			    	
			    	// Get room coordinates
			    	Point3D_F32[] coorRoom = readFileService.getCoorRoom(strings);
			    	
			    	// Initialize Room Controller
			    	RoomController roomController = new RoomController(coorRoom);
			    	
			    	// Get number of Blocks
//					int nOB = readFileService.getNumOfBlock(strings);
					
					// Get blocks' coordinates
					List<Point3D_F32[]> coorBlocks = readFileService.getCoorBlock(strings);
					
					// Add block to Room
					for (Point3D_F32[] blockPoints : coorBlocks) {
						BlockController blockController = new BlockController(blockPoints);
						roomController.addBlock(blockController.getBlock());
					}
					
					//int numOfCam = readFileService.getNumOfCam(strings);
					
					// Get cameras' coordinates ( 1st, 2nd, 3rd is camera's location, 4th, 5th is camera's angle)
					List<Float[]> camInfos = readFileService.getCamInfo(strings);
					
					for (Float[] camPoints : camInfos) {
						roomController.addCamera(new Camera(new Point3D_F32(camPoints[0],camPoints[1],camPoints[2]),camPoints[3].intValue(), camPoints[4].intValue(), 10000));
					}
					
					// Calculate Observable Point
					roomController.calculateObservablePoint();
					
					percentObser = roomController.getObservablePercent();
					
					// Get state of points
					boolean[][][] state = roomController.getPointsState();
					
					ViewFrame viewFrame = new ViewFrame(state, percentObser);
					viewFrame.setVisible(true);
					

				}else {
					JOptionPane.showMessageDialog(null, "Accuracy must be 10 or 100 !!!");
				}
				
			}
		});
		btnCalculate.setFont(new Font("Showcard Gothic", Font.PLAIN, 16));
		btnCalculate.setBounds(495, 287, 148, 48);
		frmCameraProjector.getContentPane().add(btnCalculate);
		
		JLabel lblNewLabel_2 = new JLabel("10:   Accurate to the decimeter");
		lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(391, 232, 352, 25);
		frmCameraProjector.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("100: Accurate to the centimeter");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(391, 252, 352, 25);
		frmCameraProjector.getContentPane().add(lblNewLabel_2_1);
	}
}
