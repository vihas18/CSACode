package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class board {
    String[][] board;
    JFrame frame;
    JButton[][] boardButton;
    GridBagConstraints c;
    public board(){
        board = new String[][]{
                {"","",""},
                {"","",""},
                {"","",""}
        };
        c = new GridBagConstraints();

        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton p00 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        frame.add(p00, c);


        JButton p01 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        frame.add(p00, c);


        JButton p02 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        frame.add(p00, c);

        JButton p10 = new JButton("-");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        frame.add(p00, c);
        frame.setVisible(true);
    }
    public void move(String player, int[] position){
        board[position[0]][position[1]] = player;
    }
    public String victory(){
        for(int i = 0; i < board.length; i++){
            if (column(i) || row(i)){
                return board[i][0];
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
        return board[0][column].equals(board[1][column]) && board[0][column].equals(board[2][column]);
    }
    private boolean row(int row) {
        return board[row][0].equals(board[row][1]) && board[row][0].equals(board[row][2]);
    }
    private boolean diagonalTLBR(){
        return board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]);
    }
    private boolean diagonalTRBL(){
        return board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]);
    }

}
