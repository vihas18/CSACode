package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.* ;
import java.util.Arrays;
import java.util.List;

public class board implements ActionListener {
    JButton p00;
    JButton p10;
    JButton p20;
    JButton p01;
    JButton p11;
    JButton p21;
    JButton p02;
    JButton p12;
    JButton p22;
    String[][] board;
    List<Integer[]> possibleMoves = Arrays.asList(new Integer[]{0,0},new Integer[]{1,0},new Integer[]{2,0},new Integer[]{2,1},new Integer[]{1,1},new Integer[]{0,1},new Integer[]{0,2},new Integer[]{1,2},new Integer[]{2,2});
    JFrame frame;
    JButton[][] boardButton = {{p00, p01, p02},{p10, p11,p12},{p20,p21,p22}};
    GridBagConstraints c;
    String player;
    JLabel output;
    int moves;
    public board(){
        player = "X";
        board = new String[][]{
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };
        c = new GridBagConstraints();
        moves = 0;
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        output = new JLabel("X to play!");
        output.setHorizontalAlignment(SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 3;
        frame.add(output, c);

        p00 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        frame.add(p00, c);



        p01 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        frame.add(p01, c);


        p02 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth =1;
        frame.add(p02, c);

        p10 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 1;
        frame.add(p10, c);
        frame.setVisible(true);

        p11 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        frame.add(p11, c);
        frame.setVisible(true);

        p12 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 1;
        frame.add(p12, c);
        frame.setVisible(true);

        p20 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        frame.add(p20, c);
        frame.setVisible(true);

        p21 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        frame.add(p21, c);
        frame.setVisible(true);

        p22 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 2;
        frame.add(p22, c);
        frame.setVisible(true);
        p00.setFocusPainted(false);
        p10.setFocusPainted(false);
        p20.setFocusPainted(false);
        p01.setFocusPainted(false);
        p11.setFocusPainted(false);
        p21.setFocusPainted(false);
        p02.setFocusPainted(false);
        p12.setFocusPainted(false);
        p22.setFocusPainted(false);


        p00.addActionListener(this);
        p01.addActionListener(this);
        p02.addActionListener(this);
        p10.addActionListener(this);
        p11.addActionListener(this);
        p12.addActionListener(this);
        p20.addActionListener(this);
        p21.addActionListener(this);
        p22.addActionListener(this);
        boardButton = new JButton[][]{{p00, p01, p02},{p10, p11,p12},{p20,p21,p22}};


    }
    public void disableAllButtons(){
        for(int i = 0; i < boardButton.length; i++){
            for(int j = 0; j < boardButton[0].length; j++){
                boardButton[i][j].setEnabled(false);
            }
        }
    }
    public void move(String player, Integer[] position, boolean show){
        board[position[0]][position[1]] = player;
        if(show) {
            boardButton[position[0]][position[1]].setText(player);
            boardButton[position[0]][position[1]].setEnabled(false);
            int index = 0;
            for()
            possibleMoves.remove(position);

            if (!victory().equals("")) {
                output.setText(player + " wins!");
                disableAllButtons();
            } else if (moves == 8) {
                output.setText("Tie");
                disableAllButtons();
            } else {
                nextPlayer();
                moves += 1;
            }
        }
        if(player == "O"){
            bestMove();
        }
    }
    public void actionPerformed(ActionEvent e) {
        int row = 0;
        int column = 0;
        for(int i = 0; i< boardButton.length; i++){
            for(int j = 0; j < boardButton[0].length; j++){
                if (e.getSource().equals(boardButton[i][j])){
                    row = i;
                    column = j;
                }
            }
        }
        move(player, new Integer[]{row,column}, true);


    }
    public void bestMove(){
        int[] output = new int[2];
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                move(player, new Integer[]{row,col}, false);
                if(!victory().equals("")){
                    move(player, new Integer[]{row, col}, true);
                }
                else{
                    board[row][col] = "-";
                }
            }
        }
        int index= (int) (Math.random() * possibleMoves.size());
        move(player, possibleMoves.get(index), true);

    }
    public void nextPlayer(){
        if(player.equals("X")){
            player = "O";
        }
        else{
            player = "X";
        }
        output.setText(player +  " to play!");

    }
    public String victory(){
        for(int i = 0; i < board.length; i++){
            if (column(i)){
                return board[i][0];
            }
        }
        for(int i = 0; i < board.length; i++){
            if (row(i)){
                return board[0][i];
            }
        }

        if(diagonalTLBR()){
            return board[0][0];
        }
        else if(diagonalTRBL()){
            return board[0][2];
        }
        else{
            return "";
        }
    }
    private boolean column(int column) {
        if(board[0][column].equals("-") || board[1][column].equals("-") || board[2][column].equals("-"))
            return false;
        return board[0][column].equals(board[1][column]) && board[0][column].equals(board[2][column]);
    }
    private boolean row(int row) {
        if(board[row][0].equals("-") || board[row][1].equals("-") || board[row][2].equals("-"))
            return false;
        return board[row][0].equals(board[row][1]) && board[row][0].equals(board[row][2]);
    }
    private boolean diagonalTLBR(){
        if(board[0][0].equals("-") || board[1][1].equals("-") || board[2][2].equals("-"))
            return false;
        return board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]);
    }
    private boolean diagonalTRBL(){
        if(board[0][2].equals("-") || board[1][1].equals("-") || board[2][0].equals("-"))
            return false;
        return board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]);
    }

}
