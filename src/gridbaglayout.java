import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gridbaglayout {

	static int move = 0;
	static int winner = 0;
	static int gamesPlayed = 0;
	
	public static void buildingthepanel(Container frame, int board[][]){
			 
			JLabel lb1; // Alias to create labels
			JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9; // Alias to create the buttons
			JMenuBar m1;
			JMenu mn1, mn2; // Alias to create a menu objects
			JMenuItem mni1, mni2, mni3; // Alias to create the index on the menu objects
			GridBagConstraints gbc; // Alias to create the constraints
			
			//Set Font
			Font font1 = new Font("SansSerif", Font.BOLD, 50);
			
			//Creation of all the objects
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
			
			
			//Start the design with gridbaglayout
			
			
			frame.setLayout(new GridBagLayout());
			gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.ipady = 100; // default height
			gbc.ipadx = 100; // default width
			//gbc.weightx = 100;
			
			m1 = new JMenuBar();
			m1.setSelected(null);
			
			mn1 = new JMenu("Menu");
			mn2 = new JMenu("About");
			
			mni1= new JMenuItem("New Game");
			mn1.add(mni1);
			mni2 = new JMenuItem("Quit");
			mn1.add(mni2);
			
			mni3 = new JMenuItem("About me");
			mn2.add(mni3);
			
			m1.add(mn1);
			m1.add(mn2);
			
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.gridy = 0;
		    gbc.gridx = 0;
		    gbc.gridwidth = 3;
		    gbc.ipady = 10;
		    frame.add(m1, gbc);
			
		    lb1 = new JLabel("<html>WELCOME TO THE BEST TIC TAC TOE <br />Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
		    gbc.ipady = 100;
			//gbc.weightx = 100;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 4;
		    gbc.gridx = 0;
		    gbc.gridwidth = 3;
		    
		    frame.add(lb1, gbc);
			
			
			bt1 = new JButton(String.valueOf(pos00));
			gbc.gridwidth = 1;
			//gbc.weightx = 1.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 0;
		    //bt1.setFont(font1);
		    bt1.setFocusPainted(false);
		    frame.add(bt1, gbc);
		    
		    bt2 = new JButton(String.valueOf(pos01));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 1;
		    //bt2.setFont(font1);
		    bt2.setFocusPainted(false);
		    frame.add(bt2, gbc);
		    
		    bt3 = new JButton(String.valueOf(pos02));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 2;
		    bt3.setFocusPainted(false);
		    frame.add(bt3, gbc);
		    
		    bt4 = new JButton(String.valueOf(pos10));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 0;
		    bt4.setFocusPainted(false);
		    frame.add(bt4, gbc);
		    
		    bt5 = new JButton(String.valueOf(pos11));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 1;
		    bt5.setFocusPainted(false);
		    frame.add(bt5, gbc);
		    
		    bt6 = new JButton(String.valueOf(pos12));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 2;
		    bt6.setFocusPainted(false);
		    frame.add(bt6, gbc);
		    
		    bt7 = new JButton(String.valueOf(pos30));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 0;
		    bt7.setFocusPainted(false);
		    frame.add(bt7, gbc);
		    
		    bt8 = new JButton(String.valueOf(pos31));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 1;
		    bt8.setFocusPainted(false);
		    frame.add(bt8, gbc);
		    
		    bt9 = new JButton(String.valueOf(pos32));
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 2;
		    bt9.setFocusPainted(false);
		    frame.add(bt9, gbc);
		    
		    //Set all the actions with the objects
		    
		    mni1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					
					for(int i = 0; i < 3; i++) {
						for(int j = 0; j < 3; j++) {
							board[i][j] = 0;
						}
					}
					
					bt1.setText("*");
					bt1.setEnabled(true);
					bt2.setText("*");
					bt2.setEnabled(true);
					bt3.setText("*");
					bt3.setEnabled(true);
					bt4.setText("*");
					bt4.setEnabled(true);
					bt5.setText("*");
					bt5.setEnabled(true);
					bt6.setText("*");
					bt6.setEnabled(true);
					bt7.setText("*");
					bt7.setEnabled(true);
					bt8.setText("*");
					bt8.setEnabled(true);
					bt9.setText("*");
					bt9.setEnabled(true);
					
					move = 0;
					
					
					
				}
				
			});
		    
		    mni2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(frame, "Thank you and I hope you enjoyed!");
					
					System.exit(0);
					
					
				}
				
			});
		    
		    mni3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(frame, "Hello, I hope you have enjoyed this game!\n"
							+ "This project was done to study, I started a short time ago developing in java and it getting being so fun. This was my first project with GUI, I'm being using console to develop.\n"
							+ "I'm actualy studying Software Development in Anglia Ruskin University.\n\n"
							+ "My github: https://github.com/JayFoxFoxy");
					
					System.exit(0);
					
					
				}
				
			});
		    
		    
		    bt1.addActionListener(new ActionListener() {
				

				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[0][0] = player; 
					int value = gotValue(board, 0, 0);
					String nw = changeVariableValue(value);
					bt1.setText(nw);
					bt1.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[0][1] = player; 
					int value = gotValue(board, 0, 1);
					String nw = changeVariableValue(value);
					bt2.setText(nw);
					bt2.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[0][2] = player; 
					int value = gotValue(board, 0, 2);
					String nw = changeVariableValue(value);
					bt3.setText(nw);
					bt3.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[1][0] = player; 
					int value = gotValue(board, 1, 0);
					String nw = changeVariableValue(value);
					bt4.setText(nw);
					bt4.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[1][1] = player; 
					int value = gotValue(board, 1, 1);
					String nw = changeVariableValue(value);
					bt5.setText(nw);
					bt5.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt6.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[1][2] = player; 
					int value = gotValue(board, 1, 2);
					String nw = changeVariableValue(value);
					bt6.setText(nw);
					bt6.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt7.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[2][0] = player; 
					int value = gotValue(board, 2, 0);
					String nw = changeVariableValue(value);
					bt7.setText(nw);
					bt7.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt8.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[2][1] = player; 
					int value = gotValue(board, 2, 1);
					String nw = changeVariableValue(value);
					bt8.setText(nw);
					bt8.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
		    bt9.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int player = whoPlay(move);
					board[2][2] = player; 
					int value = gotValue(board, 2, 2);
					String nw = changeVariableValue(value);
					bt9.setText(nw);
					bt9.setEnabled(false);
					winner = checkWin(board);
					//System.out.println(winner);
					move = move + 1;
					if(player == 1) {
						lb1.setText("<html>Player O please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}else {
						lb1.setText("<html>Player X please choose your move! <br />Games played: " + gamesPlayed + "</html>");
					}
					if(winner == 1) {
						JOptionPane.showMessageDialog(frame, "Player X won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(winner == 2) {
						JOptionPane.showMessageDialog(frame, "Player O won the game!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}else if(move == 9) {
						JOptionPane.showMessageDialog(frame, "Game Over, the game ended in draw!");
						bt1.setEnabled(false);
						bt2.setEnabled(false);
						bt3.setEnabled(false);
						bt4.setEnabled(false);
						bt5.setEnabled(false);
						bt6.setEnabled(false);
						bt7.setEnabled(false);
						bt8.setEnabled(false);
						bt9.setEnabled(false);
						lb1.setText("Please Choose Menu > New Game to start a new game!");
						gamesPlayed = gamesPlayed + 1;
					}
				}
			});
		    
			
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
	
	static int checkWin(int board[][]) {
		
		int confirm = 0;
				
				if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
					confirm = 1;
				}else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1){
					confirm = 1;
				}else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1){
					confirm = 1;
				}else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1){
					confirm = 1;
				}else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1){
					confirm = 1;
				}else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1){
					confirm = 1;
				}else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1){
					confirm = 1;
				}else if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1){
					confirm = 1;
				}else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
					confirm = 2;
				}else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2){
					confirm = 2;
				}else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2){
					confirm = 2;
				}else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2){
					confirm = 2;
				}else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2){
					confirm = 2;
				}else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2){
					confirm = 2;
				}else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2){
					confirm = 2;
				}else if (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2){
					confirm = 2;
				}else {
					confirm = 0;
				}
				
				
				return confirm;
		
	}

}
