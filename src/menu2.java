import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu2 {

	static int move = 0;
	
	public static void buildingthepanel(Container frame, int board[][]){
			 
			JLabel lb1; // Alias to create labels
			JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9; // Alias to create the buttons
			JMenuBar m1;
			JMenu mn1, mn2; // Alias to create a menu objects
			JMenuItem menuItem; // Alias to create the index on the menu objects
			GridBagConstraints gbc; // Alias to create the constraints
			
			int p1 = gotValue(board, 0, 0);
			int p2 = gotValue(board, 0, 1);
			int p3 = gotValue(board, 0, 2);
			int p4 = gotValue(board, 1, 0);
			int p5 = gotValue(board, 1, 1);
			int p6 = gotValue(board, 1, 2);
			int p7 = gotValue(board, 2, 0);
			int p8 = gotValue(board, 2, 1);
			int p9 = gotValue(board, 2, 2);
			
			String pos00 = changeVariableValue(p1);
			String pos01 = changeVariableValue(p2);
			String pos02 = changeVariableValue(p3);
			String pos10 = changeVariableValue(p4);
			String pos11 = changeVariableValue(p5);
			String pos12 = changeVariableValue(p6);
			String pos30 = changeVariableValue(p7);
			String pos31 = changeVariableValue(p8);
			String pos32 = changeVariableValue(p9);
			
			
			
			
			
			frame.setLayout(new GridBagLayout());
			gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.ipady = 100; // default height
			gbc.ipadx = 100; // default width
			//gbc.weightx = 100;
			
			m1 = new JMenuBar();
			
			mn1 = new JMenu("Menu");
			mn2 = new JMenu("About");
			
			menuItem = new JMenuItem("New Game");
			mn1.add(menuItem);
			menuItem = new JMenuItem("Quit");
			mn1.add(menuItem);
			
			menuItem = new JMenuItem("About me");
			mn2.add(menuItem);
			
			m1.add(mn1);
			m1.add(mn2);
			
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.gridy = 0;
		    gbc.gridx = 0;
		    gbc.gridwidth = 3;
		    frame.add(m1, gbc);
			
			
			
			
			bt1 = new JButton(String.valueOf(pos00));
			bt1.addActionListener(new ActionListener() {
				

				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[0][0] = player; 
					int value = gotValue(board, 0, 0);
					String nw = changeVariableValue(value);
					bt1.setText(nw);
					bt1.setEnabled(false);
					move = move + 1;
				}
			});
			
			gbc.gridwidth = 1;
			//gbc.weightx = 1.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 0; 
		    frame.add(bt1, gbc);
		    
		    bt2 = new JButton(String.valueOf(pos01));
		    bt2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[0][1] = player; 
					int value = gotValue(board, 0, 1);
					String nw = changeVariableValue(value);
					bt2.setText(nw);
					bt2.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 1;
		    frame.add(bt2, gbc);
		    
		    bt3 = new JButton(String.valueOf(pos02));
		    bt3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[0][2] = player; 
					int value = gotValue(board, 0, 2);
					String nw = changeVariableValue(value);
					bt3.setText(nw);
					bt3.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 2;
		    frame.add(bt3, gbc);
		    
		    bt4 = new JButton(String.valueOf(pos10));
		    bt4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[1][0] = player; 
					int value = gotValue(board, 1, 0);
					String nw = changeVariableValue(value);
					bt4.setText(nw);
					bt4.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 0;
		    frame.add(bt4, gbc);
		    
		    bt5 = new JButton(String.valueOf(pos11));
		    bt5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[1][1] = player; 
					int value = gotValue(board, 1, 1);
					String nw = changeVariableValue(value);
					bt5.setText(nw);
					bt5.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 1;
		    frame.add(bt5, gbc);
		    
		    bt6 = new JButton(String.valueOf(pos12));
		    bt6.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[1][2] = player; 
					int value = gotValue(board, 1, 2);
					String nw = changeVariableValue(value);
					bt6.setText(nw);
					bt6.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 2;
		    frame.add(bt6, gbc);
		    
		    bt7 = new JButton(String.valueOf(pos30));
		    bt7.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[2][0] = player; 
					int value = gotValue(board, 2, 0);
					String nw = changeVariableValue(value);
					bt7.setText(nw);
					bt7.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 0;
		    frame.add(bt7, gbc);
		    
		    bt8 = new JButton(String.valueOf(pos31));
		    bt8.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[2][1] = player; 
					int value = gotValue(board, 2, 1);
					String nw = changeVariableValue(value);
					bt8.setText(nw);
					bt8.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 1;
		    frame.add(bt8, gbc);
		    
		    bt9 = new JButton(String.valueOf(pos32));
		    bt9.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[2][2] = player; 
					int value = gotValue(board, 2, 2);
					String nw = changeVariableValue(value);
					bt9.setText(nw);
					bt9.setEnabled(false);
					move = move + 1;
				}
			});
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 2;
		    frame.add(bt9, gbc);
		    
		    lb1 = new JLabel("TIC TAC TOE");
		    //gbc.ipady = 200;
			//gbc.weightx = 100;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 4;
		    gbc.gridx = 0;
		    gbc.gridwidth = 3;
		    frame.add(lb1, gbc);
		    
			
		}
	
	public static void showGui() {
		
		int[][] board = new int[3][3];
		
		JFrame frame = new JFrame("TIC TAC TOE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel panel = new JPanel();
 
        //Set up the content pane.
        buildingthepanel(frame.getContentPane(), board);
 
        //Display the window.
        //frame.setSize(400, 400);
        //frame.add(panel);
        frame.setLocation(450, 50);
        frame.pack(); // Fit the frame to all the objects
        frame.setResizable(false);
        frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGui();
            }
        });
	}
	
	static String changeVariableValue(int value) {
		
		String c;
		
		if(value == 0) {
			c = "*";
		}else if(value == 1) {
			c = "X";
		}else {
			c = "O";
		}
		
		
		return c;
		
	}
	
	static int gotValue(int board[][], int r, int c) {
		
		int value;
		
		value = board[r][c];
		
		
		return value;
		
	}
	
	static int whoPlay(int value) {
		
		int r;
		
		if(value % 2 == 0) {
			r = 1;
		}else {
			r = 2;
		}
		
		return r;
		
	}

}
