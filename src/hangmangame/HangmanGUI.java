/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame;

import java.awt.event.*;
import javax.swing.JButton;

/**
 *
 * @author scarletspeedster
 */
class MyException extends Exception
{
    String msg;
    MyException(String msg)
    {
        this.msg=msg;
    }
    public String getMessage()
    {
        return msg;
    }
}
public class HangmanGUI extends javax.swing.JFrame
{

    /**
     * Creates new form HangmanGUI
     */
   
    private static String Org_movie,Guess_Movie;
    private static String player1Name,player2Name;
    private static int i ,flag=0,countTurns=9,counter=1;
    private static char ch[],checkChar;
   private static  boolean b;

   
    public HangmanGUI() {
        initComponents();  
        GuessMovie.addFocusListener(new FocusAdapter()
        {   
            public void focusGained(FocusEvent e)
                {
                    
                    player1Name=Dplayer.getText();
                    player2Name=Cplayer.getText();
                    ch=EnterMovie.getPassword();
                    Org_movie=new String(ch);
                    Org_movie=Org_movie.toUpperCase();
                    ch=Org_movie.toCharArray();
                    tleft1.setText("Turns Left :");
                    tleft2.setText(String.valueOf(countTurns));
                        for(i=0;i<ch.length;i++)
                         {
                                if(ch[i]=='A'||ch[i]=='I'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U')
                                {
                                    continue;
				}
                                	else if(ch[i]==' ')
                                        {
                                            ch[i]=' ';
                                        }
                                            else if(ch[i]=='-')
                                            {
                                		ch[i]='-';
                                            }
                                        	else if(ch[i]=='/')
                                                {
                                                    ch[i]='/';
                                                }
                                                	else if(ch[i]=='(')
                                                        {
                                    			ch[i]='(';
                                                        }
                                                            else if(ch[i]==')')
                                                            {
                                                                ch[i]=')';
                                                            }
                                                                else
                                                                {
                                                                    ch[i]='_';
                                                                }
                         }
                        Guess_Movie=new String(ch);
                        GuessMovie.setText(Guess_Movie);
                        disableVowels();
                }
        });
    }
    public void disableVowels()
    {
        A.setEnabled(false);
        I.setEnabled(false);
        O.setEnabled(false);
        U.setEnabled(false);
        E.setEnabled(false);
        
    }
    public boolean checkTurns(int countTurns)
	{
		boolean b=true;
		if(countTurns==0)
			b=false;
			else if(countTurns>0)
				b=true;

			return b;
	}
    public void disableButtons()
	{
		B.setEnabled(false);
		C.setEnabled(false);
		D.setEnabled(false);
                F.setEnabled(false);
		G.setEnabled(false);
		H.setEnabled(false);
                J.setEnabled(false);
		K.setEnabled(false);
		L.setEnabled(false);
                M.setEnabled(false);
		N.setEnabled(false);
		P.setEnabled(false);
		Q.setEnabled(false);
		R.setEnabled(false);
		S.setEnabled(false);
		T.setEnabled(false);
		V.setEnabled(false);
		W.setEnabled(false);
		X.setEnabled(false);
		Y.setEnabled(false);
		Z.setEnabled(false);
                zero.setEnabled(false);
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
                eight.setEnabled(false);
                nine.setEnabled(false);
	}
    public void enableButtons()
    {
                B.setEnabled(true);
		C.setEnabled(true);
		D.setEnabled(true);
                F.setEnabled(true);
		G.setEnabled(true);
                A.setEnabled(true);
		E.setEnabled(true);
		I.setEnabled(true);
                O.setEnabled(true);
		U.setEnabled(true);
		H.setEnabled(true);
                J.setEnabled(true);
		K.setEnabled(true);
		L.setEnabled(true);
                M.setEnabled(true);
		N.setEnabled(true);
		P.setEnabled(true);
		Q.setEnabled(true);
		R.setEnabled(true);
		S.setEnabled(true);
		T.setEnabled(true);
		V.setEnabled(true);
		W.setEnabled(true);
		X.setEnabled(true);
		Y.setEnabled(true);
		Z.setEnabled(true);
                zero.setEnabled(true);
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
                eight.setEnabled(true);
                nine.setEnabled(true);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Dplayer = new javax.swing.JTextField();
        Cplayer = new javax.swing.JTextField();
        tleft1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GuessMovie = new javax.swing.JTextField();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        Result = new javax.swing.JLabel();
        EnterMovie = new javax.swing.JPasswordField();
        tleft2 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman");
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Dominating Player ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Competing Player ");

        Dplayer.setBackground(new java.awt.Color(255, 255, 255));
        Dplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DplayerActionPerformed(evt);
            }
        });

        Cplayer.setBackground(new java.awt.Color(255, 255, 255));

        tleft1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tleft1.setForeground(new java.awt.Color(0, 102, 51));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Enter Movie ");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Guess Movie");

        GuessMovie.setEditable(false);
        GuessMovie.setBackground(new java.awt.Color(255, 255, 255));

        A.setBackground(new java.awt.Color(0, 204, 204));
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setBackground(new java.awt.Color(255, 0, 255));
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(0, 204, 204));
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setBackground(new java.awt.Color(255, 0, 255));
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        E.setBackground(new java.awt.Color(0, 204, 204));
        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        F.setBackground(new java.awt.Color(255, 0, 255));
        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        G.setBackground(new java.awt.Color(0, 204, 204));
        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.setBackground(new java.awt.Color(255, 0, 255));
        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        I.setBackground(new java.awt.Color(255, 0, 255));
        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        J.setBackground(new java.awt.Color(0, 204, 204));
        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        K.setBackground(new java.awt.Color(255, 0, 255));
        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        L.setBackground(new java.awt.Color(0, 204, 204));
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        M.setBackground(new java.awt.Color(255, 0, 255));
        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        N.setBackground(new java.awt.Color(0, 204, 204));
        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        O.setBackground(new java.awt.Color(255, 0, 255));
        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        P.setBackground(new java.awt.Color(0, 204, 204));
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        Q.setBackground(new java.awt.Color(0, 204, 204));
        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        R.setBackground(new java.awt.Color(255, 0, 255));
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        S.setBackground(new java.awt.Color(0, 204, 204));
        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        T.setBackground(new java.awt.Color(255, 0, 255));
        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        U.setBackground(new java.awt.Color(0, 204, 204));
        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        V.setBackground(new java.awt.Color(255, 0, 255));
        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        W.setBackground(new java.awt.Color(0, 204, 204));
        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        X.setBackground(new java.awt.Color(255, 0, 255));
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        Y.setBackground(new java.awt.Color(255, 0, 255));
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        Z.setBackground(new java.awt.Color(0, 204, 204));
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(255, 0, 255));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(0, 204, 204));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 0, 255));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(0, 204, 204));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 0, 255));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(0, 204, 204));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(0, 204, 204));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 0, 255));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(0, 204, 204));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 0, 255));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        Result.setForeground(new java.awt.Color(0, 0, 255));

        tleft2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tleft2.setForeground(new java.awt.Color(0, 102, 51));

        Reset.setBackground(new java.awt.Color(255, 0, 0));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Dplayer)
                                        .addComponent(Cplayer, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(EnterMovie))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(GuessMovie)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(I, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(J, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(C)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(E)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(K)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(L)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(N)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(O)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P)
                                    .addComponent(H)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Q)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(R)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(S)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(T)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Y)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Z)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(U, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(V))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(six)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seven)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nine))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tleft1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tleft2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(W)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(X))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dplayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cplayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EnterMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuessMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(D)
                    .addComponent(E)
                    .addComponent(F)
                    .addComponent(G)
                    .addComponent(H))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I)
                    .addComponent(J)
                    .addComponent(K)
                    .addComponent(L)
                    .addComponent(M)
                    .addComponent(N)
                    .addComponent(O)
                    .addComponent(P))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q)
                    .addComponent(R)
                    .addComponent(S)
                    .addComponent(T)
                    .addComponent(U)
                    .addComponent(V)
                    .addComponent(W)
                    .addComponent(X))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Y)
                    .addComponent(Z)
                    .addComponent(zero)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(four)
                    .addComponent(five))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(six)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(Reset))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tleft1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(tleft2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DplayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DplayerActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='J')
                {
                    ch[i]='J';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    J.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        J.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_JActionPerformed

    
    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='X')
                {
                    ch[i]='X';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    X.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        X.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
                
    }//GEN-LAST:event_XActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='5')
                {
                    ch[i]='5';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    five.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        five.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='6')
                {
                    ch[i]='6';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    six.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        six.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_sixActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='P')
                {
                    ch[i]='P';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    P.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        P.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_PActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='B')
                {
                    ch[i]='B';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    B.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        B.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='C')
                {
                    ch[i]='C';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    C.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        C.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='D')
                {
                    ch[i]='D';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    D.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        D.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='F')
                {
                    ch[i]='F';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    F.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        F.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='G')
                {
                    ch[i]='G';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    G.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        G.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='H')
                {
                    ch[i]='H';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    H.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        H.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='K')
                {
                    ch[i]='K';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    K.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        K.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='L')
                {
                    ch[i]='L';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    L.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        L.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='M')
                {
                    ch[i]='M';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    M.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        M.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='N')
                {
                    ch[i]='N';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    N.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        N.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='Q')
                {
                    ch[i]='Q';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    Q.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        Q.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='R')
                {
                    ch[i]='R';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    R.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        R.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='S')
                {
                    ch[i]='S';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    S.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        S.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='T')
                {
                    ch[i]='T';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    T.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        T.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='V')
                {
                    ch[i]='V';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    V.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        V.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='W')
                {
                    ch[i]='W';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    W.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        W.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_WActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='Y')
                {
                    ch[i]='Y';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    Y.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        Y.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        // TODO add your handling code here:
        
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='Z')
                {
                    ch[i]='Z';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    Z.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        Z.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_ZActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='0')
                {
                    ch[i]='0';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    zero.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        zero.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='1')
                {
                    ch[i]='1';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    one.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        one.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='2')
                {
                    ch[i]='2';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    two.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        two.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='3')
                {
                    ch[i]='3';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    three.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        three.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='4')
                {
                    ch[i]='4';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    four.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        four.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_fourActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='7')
                {
                    ch[i]='7';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    seven.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        seven.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='8')
                {
                    ch[i]='8';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    eight.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        eight.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        ch=Guess_Movie.toCharArray();
            for(i=0;i<Org_movie.length();i++)
            {
                if(Org_movie.charAt(i)=='9')
                {
                    ch[i]='9';
                    flag=1;
                }
            }
                if(flag==0)
                {
                    countTurns--;
                    tleft2.setText(String.valueOf(countTurns));
                    nine.setEnabled(false);
                }
                    else
                    {
                        Guess_Movie=new String(ch);
                        GuessMovie.setText("");
                        GuessMovie.setText(Guess_Movie);
                        nine.setEnabled(false);
                        flag=0;
                    }
                b=checkTurns(countTurns);
                    if(b==false)
                    {
                        Result.setText(player1Name+" Won !! and Correct Movie :"+Org_movie);
                        disableButtons();
                    
                    }
                    else if(b==true)
                    {
                        if(Org_movie.equals(Guess_Movie))
                        {
                        Result.setText(player2Name+" Won !!" );
                        disableButtons();
                        }
                    }
    }//GEN-LAST:event_nineActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        Cplayer.setText("");
        Dplayer.setText("");
        EnterMovie.setText("");
        GuessMovie.setText("");
        Result.setText("");
        countTurns=9;
        enableButtons();
    }//GEN-LAST:event_ResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JTextField Cplayer;
    private javax.swing.JButton D;
    private javax.swing.JTextField Dplayer;
    private javax.swing.JButton E;
    private javax.swing.JPasswordField EnterMovie;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JTextField GuessMovie;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Result;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JLabel tleft1;
    private javax.swing.JLabel tleft2;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
