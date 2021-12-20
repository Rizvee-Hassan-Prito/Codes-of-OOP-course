package awt;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Awt extends Frame {

    Awt() {
        Button b = new Button("Click");
        b.setBounds(600, 510, 80, 60);
        Font f3 = new Font("Click", 30, 30);
        b.setFont(f3);
        b.setBackground(Color.blue);
        add(b);

        setSize(1370, 800);
        setLayout(null);
        setVisible(true);
        setBackground(Color.green);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        Label l1 = new Label("   Welcome to Bank  ");
        l1.setBounds(400, 150, 500, 50);
        l1.setBackground(Color.red);
        Font f = new Font("", 50, 50);
        l1.setFont(f);
        add(l1);

        Label l2 = new Label("Press click to continue");
        l2.setBounds(400, 345, 500, 30);
        l2.setBackground(Color.cyan);
        Font f2 = new Font("", 30, 30);
        l2.setFont(f2);
        add(l2);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //dispose();
                Frame frame = new Frame();
                frame.setSize(1370, 800);
                frame.setLayout(null);
                frame.setVisible(true);
                frame.setBackground(Color.BLUE);

                frame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        frame.dispose();
                    }
                });

                Label l3 = new Label("Log in as:");
                l3.setBounds(500, 150, 230, 60);
                l3.setBackground(Color.red);
                Font f4 = new Font("Log in as:", 50, 50);
                l3.setFont(f4);
                frame.add(l3);

                CheckboxGroup cbg = new CheckboxGroup();
                Checkbox checkBox1 = new Checkbox("Admin", cbg, false);
                Font f5 = new Font("Admin", 40, 40);
                checkBox1.setFont(f5);
                checkBox1.setBounds(500, 250, 230, 60);
                checkBox1.setBackground(Color.CYAN);

                Checkbox checkBox2 = new Checkbox("User", cbg, false);
                Font f6 = new Font("User", 40, 40);
                checkBox2.setFont(f6);
                checkBox2.setBounds(500, 350, 230, 60);
                checkBox2.setBackground(Color.CYAN);
                frame.add(checkBox1);
                frame.add(checkBox2);

                Button b = new Button("Previous");
                b.setBounds(50, 670, 100, 40);
                Font f3 = new Font("", 20, 20);
                b.setFont(f3);
                b.setBackground(Color.green);
                frame.add(b);

                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        setVisible(true);
                        frame.dispose();
                    }
                });

                checkBox1.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        Frame frame2 = new Frame();
                        frame2.setSize(1370, 800);
                        frame2.setLayout(null);
                        frame2.setVisible(true);
                        frame2.setBackground(Color.GREEN);

                        Label l4 = new Label("Loging as Admin");
                        l4.setBounds(500, 550, 230, 40);
                        frame.add(l4);
                        l4.setBackground(Color.RED);
                        Font f7 = new Font("Loging as Admin. . . .", 25, 25);
                        l4.setFont(f7);
                        try {
                            Thread.sleep(1000);
                        } catch (Exception ex) {
                        }

                        frame2.addWindowListener(new WindowAdapter() {
                            public void windowClosing(WindowEvent e) {
                                frame2.dispose();
                                frame.remove(l4);
                            }
                        });

                        Button b = new Button("Previous");
                        b.setBounds(50, 670, 100, 40);
                        Font f101 = new Font("", 20, 20);
                        b.setFont(f101);
                        b.setBackground(Color.blue);
                        frame2.add(b);

                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent ae) {
                                frame.setVisible(true);
                                frame2.dispose();
                                frame.remove(l4);

                                Button b = new Button("Next");
                                b.setBounds(1250, 670, 100, 40);
                                Font f101 = new Font("", 20, 20);
                                b.setFont(f101);
                                b.setBackground(Color.green);
                                frame.add(b);

                                b.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent ae) {
                                        frame2.setVisible(true);
                                        frame.add(l4);
                                    }
                                });
                            }
                        });

                        Label l3 = new Label("ADMIN");
                        l3.setBounds(400, 130, 170, 60);
                        l3.setBackground(Color.blue);
                        Font f4 = new Font("", 50, 50);
                        l3.setFont(f4);
                        frame2.add(l3);

                        Label l6 = new Label("Please give Name and Password for Admin:");
                        l6.setBounds(400, 230, 550, 50);
                        Font f8 = new Font("", 25, 25);
                        l6.setFont(f8);
                        l6.setBackground(Color.RED);
                        frame2.add(l6);

                        Label l7 = new Label("Name:");
                        l7.setBounds(400, 290, 250, 50);
                        Font f9 = new Font("", 23, 23);
                        l7.setFont(f9);
                        frame2.add(l7);

                        TextField tf = new TextField();
                        tf.setBounds(400, 340, 250, 50);
                        tf.setBackground(Color.WHITE);
                        frame2.add(tf);

                        Label l8 = new Label("Password:");
                        l8.setBounds(400, 400, 250, 50);
                        Font f10 = new Font("Password:", 23, 23);
                        l8.setFont(f10);
                        frame2.add(l8);

                        TextField tf2 = new TextField();
                        tf2.setBounds(400, 450, 250, 50);
                        tf2.setBackground(Color.WHITE);
                        frame2.add(tf2);

                        Button b2 = new Button("Enter");
                        b2.setBounds(400, 530, 50, 30);
                        Font f3 = new Font("Enter", 15, 15);
                        b2.setFont(f3);
                        b2.setBackground(Color.RED);
                        frame2.add(b2);

                        b2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent ae) {
                                File file = new File("F:\\Admin.txt");
                                try {
                                    Scanner input = new Scanner(file);
                                    int c1 = 0;
                                    while (input.hasNext()) {
                                        String a = input.nextLine();
                                        if (a.equals(tf.getText())) {
                                            String b = input.nextLine();
                                            if (b.equals(tf2.getText())) {
                                                c1 = 1;
                                                Frame frame4 = new Frame();
                                                frame4.setSize(1370, 800);
                                                frame4.setLayout(null);
                                                frame4.setVisible(true);
                                                frame4.setBackground(Color.blue);

                                                frame4.addWindowListener(new WindowAdapter() {
                                                    public void windowClosing(WindowEvent e) {
                                                        frame4.dispose();
                                                    }
                                                });

                                                Button bb = new Button("Previous");
                                                bb.setBounds(50, 670, 100, 40);
                                                Font f101 = new Font("", 20, 20);
                                                bb.setFont(f101);
                                                bb.setBackground(Color.green);
                                                frame4.add(bb);

                                                bb.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent ae) {
                                                        frame2.setVisible(true);
                                                        frame4.dispose();

                                                        Button b = new Button("Next");
                                                        b.setBounds(1200, 670, 100, 40);
                                                        Font f101 = new Font("", 20, 20);
                                                        b.setFont(f101);
                                                        b.setBackground(Color.blue);
                                                        frame2.add(b);

                                                        b.addActionListener(new ActionListener() {
                                                            public void actionPerformed(ActionEvent ae) {
                                                                frame4.setVisible(true);
                                                            }
                                                        });
                                                    }
                                                });

                                                Label l1 = new Label("Admin Profile");
                                                l1.setBounds(490, 70, 310, 60);
                                                l1.setBackground(Color.red);
                                                Font f = new Font("", 50, 50);
                                                l1.setFont(f);
                                                frame4.add(l1);

                                                Label l2 = new Label(" Admin Name:");
                                                l2.setBounds(130, 190, 190, 30);
                                                l2.setBackground(Color.red);
                                                Font f2 = new Font("", 30, 30);
                                                l2.setFont(f2);
                                                frame4.add(l2);

                                                Label l3 = new Label(a);
                                                l3.setBounds(340, 190, 300, 30);
                                                l3.setBackground(Color.cyan);
                                                Font f3 = new Font("", 30, 30);
                                                l3.setFont(f3);
                                                frame4.add(l3);

                                                Label l4 = new Label("Admin Information:");
                                                l4.setBounds(130, 280, 250, 30);
                                                l4.setBackground(Color.red);
                                                Font f4 = new Font("", 30, 30);
                                                l4.setFont(f4);
                                                frame4.add(l4);

                                                TextArea ta = new TextArea(input.nextLine() + "\n\n" + input.nextLine() + "\n\n" + input.nextLine());
                                                ta.setBackground(Color.cyan);
                                                ta.setBounds(390, 280, 300, 120);
                                                Font f5 = new Font("", 20, 20);
                                                ta.setFont(f5);
                                                frame4.add(ta);

                                                Label l5 = new Label("Other Admins:");
                                                l5.setBounds(130, 450, 200, 30);
                                                l5.setBackground(Color.red);
                                                Font f6 = new Font("", 30, 30);
                                                l5.setFont(f6);
                                                frame4.add(l5);

                                                File file2 = new File("F:\\Admin.txt");
                                                Scanner input2 = new Scanner(file2);
                                                String b1 = "";
                                                while (input2.hasNext()) {
                                                    String a1 = input2.nextLine();
                                                    if (!a.equals(a1)) {
                                                        b1 += a1 + "\n";
                                                    }
                                                    for (int i = 1; i <= 4; i++) {
                                                        input2.nextLine();
                                                    }
                                                }
                                                TextArea ta1 = new TextArea(b1);
                                                ta1.setBackground(Color.cyan);
                                                ta1.setBounds(390, 450, 300, 120);
                                                Font f7 = new Font("", 20, 20);
                                                ta1.setFont(f7);
                                                frame4.add(ta1);

                                                Label l7 = new Label("User's Account Information:");
                                                l7.setBounds(860, 160, 370, 30);
                                                l7.setBackground(Color.red);
                                                Font f8 = new Font("", 30, 30);
                                                l7.setFont(f8);
                                                frame4.add(l7);

                                                File file3 = new File("F:\\User.txt");
                                                Scanner input3 = new Scanner(file3);
                                                String g = "";
                                                while (input3.hasNext()) {
                                                    g += "User Name:" + input3.nextLine() + "\n\n";
                                                    input3.nextLine();
                                                    g += "Name:" + input3.nextLine() + "\n\n" + "Mobile Number:" + input3.nextLine() + "\n\n" + "Email:"
                                                            + input3.nextLine() + "\n\n" + "Present Address:" + input3.nextLine() + "\n\n";
                                                }
                                                TextArea ta2 = new TextArea(g);
                                                ta2.setBackground(Color.cyan);
                                                ta2.setBounds(900, 210, 300, 170);
                                                Font f9 = new Font("", 20, 20);
                                                ta2.setFont(f9);
                                                frame4.add(ta2);

                                                Label l8 = new Label("User's Bank Account Information:");
                                                l8.setBounds(860, 410, 450, 30);
                                                l8.setBackground(Color.red);
                                                Font f10 = new Font("", 30, 30);
                                                l8.setFont(f10);
                                                frame4.add(l8);

                                                /*File file03 = new File("F:\\User Bank Accounts.txt");
                                                Scanner input03 = new Scanner(file03);
                                                String g0 = "";
                                                String g1 = "";
                                                while (input03.hasNext()) {
                                                    g0 += "User Name:" + input03.nextLine() + "\n\n";
                                                    g1 = input03.nextLine();
                                                    if (g1.equals("Saving Account")) {
                                                        g0 += "Account Type:" + g1 + "\n\n" + "Account Number:" + input03.nextLine() + "\n\n" + "Account Balance:"
                                                                + input03.nextLine() + "\n\n";
                                                    } else {
                                                        g0 += "Account Type:" + g1 + "\n\n" + "Account Number:" + input03.nextLine() + "\n\n" + "Credit Card Number:" + input03.nextLine() + "\n\n" + "Account Balance:"
                                                                + input03.nextLine() + "\n\n";
                                                    }
                                                }

                                                TextArea ta3 = new TextArea(g0);
                                                ta3.setBackground(Color.cyan);
                                                ta3.setBounds(900, 460, 400, 120);
                                                Font f13 = new Font("", 25, 25);
                                                ta3.setFont(f13);
                                                frame4.add(ta3);*/

                                                Button b2 = new Button("Bank Account Information");
                                                b2.setBounds(880, 610, 370, 50);
                                                Font f14 = new Font("", 25, 25);
                                                b2.setFont(f14);
                                                b2.setBackground(Color.green);
                                                frame4.add(b2);

                                                b2.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent ae2) {
                                                        Frame frame5 = new Frame();
                                                        frame5.setSize(1370, 800);
                                                        frame5.setLayout(null);
                                                        frame5.setVisible(true);
                                                        frame5.setBackground(Color.green);

                                                        Button bb = new Button("Previous");
                                                        bb.setBounds(50, 670, 100, 40);
                                                        Font f101 = new Font("", 20, 20);
                                                        bb.setFont(f101);
                                                        bb.setBackground(Color.blue);
                                                        frame5.add(bb);

                                                        bb.addActionListener(new ActionListener() {
                                                            public void actionPerformed(ActionEvent ae) {
                                                                frame4.setVisible(true);
                                                                frame5.dispose();

                                                                Button b = new Button("Next");
                                                                b.setBounds(1210, 674, 100, 40);
                                                                Font f101 = new Font("", 20, 20);
                                                                b.setFont(f101);
                                                                b.setBackground(Color.green);
                                                                frame4.add(b);

                                                                b.addActionListener(new ActionListener() {
                                                                    public void actionPerformed(ActionEvent ae) {
                                                                        frame5.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });

                                                        frame5.addWindowListener(new WindowAdapter() {
                                                            public void windowClosing(WindowEvent e) {
                                                                frame5.dispose();
                                                            }
                                                        });

                                                        Label l2 = new Label("Credit Account:");
                                                        l2.setBounds(150, 110, 210, 30);
                                                        l2.setBackground(Color.blue);
                                                        Font f2 = new Font("", 30, 30);
                                                        l2.setFont(f2);
                                                        frame5.add(l2);

                                                        File f1 = new File("F:\\Bank Account Information.txt");
                                                        try {
                                                            Scanner input = new Scanner(f1);
                                                            String g1 = input.nextLine();
                                                            Label l3 = new Label("Interest Amount: " + g1 + " %");
                                                            l3.setBounds(190, 210, 310, 30);
                                                            Font f3 = new Font("", 30, 30);
                                                            l3.setFont(f3);
                                                            frame5.add(l3);

                                                            Label l5 = new Label("New Interest Amount:");
                                                            l5.setBounds(720, 210, 290, 30);
                                                            l5.setBackground(Color.red);
                                                            Font f6 = new Font("", 30, 30);
                                                            l5.setFont(f6);
                                                            frame5.add(l5);

                                                            TextField ta1 = new TextField(g1);
                                                            ta1.setBackground(Color.white);
                                                            ta1.setBounds(1020, 210, 200, 30);
                                                            Font f7 = new Font("", 20, 20);
                                                            ta1.setFont(f7);
                                                            frame5.add(ta1);

                                                            String[] s = new String[5];
                                                            String g2 = input.nextLine();
                                                            Label l6 = new Label("Credit Amount: " + g2 + " Taka");
                                                            l6.setBounds(190, 310, 370, 30);
                                                            Font f8 = new Font("", 30, 30);
                                                            l6.setFont(f8);
                                                            frame5.add(l6);

                                                            Label l8 = new Label("New Credit Amount:");
                                                            l8.setBounds(720, 310, 280, 30);
                                                            l8.setBackground(Color.red);
                                                            Font f5 = new Font("", 30, 30);
                                                            l8.setFont(f5);
                                                            frame5.add(l8);

                                                            TextField ta2 = new TextField(g2);
                                                            ta2.setBackground(Color.white);
                                                            ta2.setBounds(1020, 310, 200, 30);
                                                            Font f10 = new Font("", 20, 20);
                                                            ta2.setFont(f10);
                                                            frame5.add(ta2);

                                                            Label l11 = new Label("Savings Account:");
                                                            l11.setBounds(150, 400, 240, 32);
                                                            l11.setBackground(Color.blue);
                                                            Font f12 = new Font("", 30, 30);
                                                            l11.setFont(f12);
                                                            frame5.add(l11);

                                                            String g3 = input.nextLine();
                                                            Label l31 = new Label("Interest Amount: " + g3 + " %");
                                                            l31.setBounds(190, 490, 330, 30);
                                                            Font f31 = new Font("", 30, 30);
                                                            l31.setFont(f31);
                                                            frame5.add(l31);

                                                            Label l51 = new Label("New Interest Amount:");
                                                            l51.setBounds(730, 490, 290, 30);
                                                            l51.setBackground(Color.red);
                                                            Font f61 = new Font("", 30, 30);
                                                            l51.setFont(f61);
                                                            frame5.add(l51);

                                                            TextField ta11 = new TextField(g3);
                                                            ta11.setBackground(Color.white);
                                                            ta11.setBounds(1040, 490, 200, 30);
                                                            Font f71 = new Font("", 20, 20);
                                                            ta11.setFont(f71);
                                                            frame5.add(ta11);

                                                            String g4 = input.nextLine();
                                                            Label l61 = new Label("Withdrawal Limit: " + g4 + " Taka");
                                                            l61.setBounds(190, 540, 410, 30);
                                                            Font f81 = new Font("", 30, 30);
                                                            l61.setFont(f81);
                                                            frame5.add(l61);

                                                            Label l82 = new Label("New Withdrawal Limit:");
                                                            l82.setBounds(730, 540, 300, 30);
                                                            l82.setBackground(Color.red);
                                                            Font f52 = new Font("", 30, 30);
                                                            l82.setFont(f52);
                                                            frame5.add(l82);

                                                            TextField ta22 = new TextField(g4);
                                                            ta22.setBackground(Color.white);
                                                            ta22.setBounds(1040, 540, 200, 30);
                                                            Font f21 = new Font("", 20, 20);
                                                            ta22.setFont(f21);
                                                            frame5.add(ta22);

                                                            String g5 = input.nextLine();
                                                            Label l62 = new Label("Minimum Deposit: " + g5 + " Taka");
                                                            l62.setBounds(190, 590, 410, 30);
                                                            Font f82 = new Font("", 30, 30);
                                                            l62.setFont(f82);
                                                            frame5.add(l62);

                                                            Label l83 = new Label("New Minimum deposit:");
                                                            l83.setBounds(730, 590, 300, 30);
                                                            l83.setBackground(Color.red);
                                                            Font f53 = new Font("", 30, 30);
                                                            l83.setFont(f53);
                                                            frame5.add(l83);

                                                            TextField ta23 = new TextField(g5);
                                                            ta23.setBackground(Color.white);
                                                            ta23.setBounds(1040, 590, 200, 30);
                                                            Font f23 = new Font("", 20, 20);
                                                            ta23.setFont(f23);
                                                            frame5.add(ta23);

                                                            Button bb12 = new Button("Enter");
                                                            bb12.setBounds(1070, 630, 80, 30);
                                                            Font f112 = new Font("", 15, 15);
                                                            bb12.setFont(f112);
                                                            bb12.setBackground(Color.RED);
                                                            frame5.add(bb12);

                                                            bb12.addActionListener(new ActionListener() {
                                                                public void actionPerformed(ActionEvent ae2) {
                                                                    PrintWriter output101 = null;
                                                                    try {
                                                                        Label l83 = new Label("Information Changed");
                                                                        l83.setBounds(1010, 670, 300, 35);
                                                                        l83.setBackground(Color.red);
                                                                        Font f53 = new Font("", 30, 30);
                                                                        l83.setFont(f53);
                                                                        frame5.add(l83);

                                                                        s[0] = ta1.getText();
                                                                        s[1] = ta2.getText();
                                                                        s[2] = ta11.getText();
                                                                        s[3] = ta22.getText();
                                                                        s[4] = ta23.getText();
                                                                        File file3 = new File("F:\\Bank Account Information.txt");
                                                                        output101 = new PrintWriter(file3);
                                                                        for (int i = 0; i < 5; i++) {
                                                                            output101.println(s[i]);
                                                                        }
                                                                    } catch (FileNotFoundException ex) {
                                                                    } finally {
                                                                        output101.close();
                                                                    }
                                                                }
                                                            });

                                                        } catch (FileNotFoundException ex) {
                                                            System.out.println("Error");
                                                        }
                                                    }
                                                });
                                            } else {
                                                Label l = new Label("Your password is incorrect.");
                                                l.setBounds(400, 570, 350, 50);
                                                Font f10 = new Font("", 25, 25);
                                                l.setFont(f10);
                                                l.setBackground(Color.red);
                                                frame2.add(l);
                                            }
                                        }
                                    }
                                    if (c1 == 0) {
                                        Label l = new Label("Your name is incorrect.");
                                        l.setBounds(400, 570, 350, 50);
                                        Font f10 = new Font("", 25, 25);
                                        l.setFont(f10);
                                        l.setBackground(Color.red);
                                        frame2.add(l);
                                    }
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Awt.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }
                });

                checkBox2.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        Label l5 = new Label("Loging as User");
                        l5.setBounds(500, 550, 230, 60);
                        frame.add(l5);
                        l5.setBackground(Color.red);
                        Font f7 = new Font("Loging as User", 25, 25);
                        l5.setFont(f7);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                        Frame frame3 = new Frame();
                        frame3.setSize(1370, 800);
                        frame3.setLayout(null);
                        frame3.setVisible(true);
                        frame3.setBackground(Color.GREEN);

                        frame3.addWindowListener(new WindowAdapter() {
                            public void windowClosing(WindowEvent e) {
                                frame3.dispose();
                                frame3.remove(l5);
                            }
                        });

                        Button b = new Button("Previous");
                        b.setBounds(50, 670, 100, 40);
                        Font f101 = new Font("", 20, 20);
                        b.setFont(f101);
                        b.setBackground(Color.blue);
                        frame3.add(b);

                        b.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent ae) {
                                frame.setVisible(true);
                                frame3.dispose();
                                frame.remove(l5);

                                Button b = new Button("Next");
                                b.setBounds(1250, 670, 100, 40);
                                Font f101 = new Font("", 20, 20);
                                b.setFont(f101);
                                b.setBackground(Color.green);
                                frame.add(b);

                                b.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent ae) {
                                        frame3.setVisible(true);
                                        frame.add(l5);
                                    }
                                });
                            }
                        });

                        Label l3 = new Label("USER");
                        l3.setBounds(400, 130, 170, 60);
                        l3.setBackground(Color.blue);
                        Font f4 = new Font("USER", 50, 50);
                        l3.setFont(f4);
                        frame3.add(l3);

                        Label l6 = new Label("Please give Username and Password for User:");
                        l6.setBounds(400, 230, 550, 50);
                        Font f8 = new Font("Please give Username and Password for User:", 25, 25);
                        l6.setFont(f8);
                        l6.setBackground(Color.RED);
                        frame3.add(l6);

                        Label l7 = new Label("Username:");
                        l7.setBounds(400, 290, 250, 50);
                        Font f9 = new Font("Username:", 23, 23);
                        l7.setFont(f9);
                        frame3.add(l7);

                        TextField tf = new TextField();
                        tf.setBounds(400, 340, 250, 50);
                        tf.setBackground(Color.WHITE);
                        frame3.add(tf);

                        Label l8 = new Label("Password:");
                        l8.setBounds(400, 400, 250, 50);
                        Font f10 = new Font("Password:", 23, 23);
                        l8.setFont(f10);
                        frame3.add(l8);

                        TextField tf2 = new TextField();
                        tf2.setBounds(400, 450, 250, 50);
                        tf2.setBackground(Color.WHITE);
                        frame3.add(tf2);

                        Button b2 = new Button("Enter");
                        b2.setBounds(400, 530, 50, 30);
                        Font f3 = new Font("Enter", 15, 15);
                        b2.setFont(f3);
                        b2.setBackground(Color.RED);
                        frame3.add(b2);

                        Label l9 = new Label("Don't have an account? click Create Account to continue.");
                        l9.setBounds(400, 570, 650, 50);
                        Font f11 = new Font("", 23, 23);
                        l9.setFont(f11);
                        frame3.add(l9);

                        Button b3 = new Button("Create Account");
                        b3.setBounds(400, 630, 110, 30);
                        Font f12 = new Font("", 15, 15);
                        b3.setFont(f12);
                        b3.setBackground(Color.RED);
                        frame3.add(b3);

                        b3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent ae) {
                                Frame frame4 = new Frame();
                                frame4.setSize(1370, 800);
                                frame4.setLayout(null);
                                frame4.setVisible(true);
                                frame4.setBackground(Color.blue);

                                Button bb = new Button("Previous");
                                bb.setBounds(50, 670, 100, 40);
                                Font f101 = new Font("", 20, 20);
                                bb.setFont(f101);
                                bb.setBackground(Color.green);
                                frame4.add(bb);

                                bb.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent ae) {
                                        frame3.setVisible(true);
                                        frame4.dispose();

                                        Button b = new Button("Next");
                                        b.setBounds(1200, 674, 100, 40);
                                        Font f101 = new Font("", 20, 20);
                                        b.setFont(f101);
                                        b.setBackground(Color.blue);
                                        frame3.add(b);

                                        b.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent ae) {
                                                frame4.setVisible(true);
                                            }
                                        });
                                    }
                                });

                                frame4.addWindowListener(new WindowAdapter() {
                                    public void windowClosing(WindowEvent e) {
                                        frame4.dispose();
                                    }
                                });
                                Label l3 = new Label("User Account");
                                l3.setBounds(500, 70, 310, 60);
                                l3.setBackground(Color.red);
                                Font f4 = new Font("", 50, 50);
                                l3.setFont(f4);
                                frame4.add(l3);

                                Label l8 = new Label("Name:");
                                l8.setBounds(200, 170, 80, 30);
                                l8.setBackground(Color.red);
                                Font f10 = new Font("", 23, 23);
                                l8.setFont(f10);
                                frame4.add(l8);

                                TextField tf2 = new TextField();
                                tf2.setBounds(200, 220, 250, 50);
                                tf2.setBackground(Color.WHITE);
                                frame4.add(tf2);

                                Label l9 = new Label("Mobile Number:");
                                l9.setBounds(850, 170, 170, 30);
                                l9.setBackground(Color.red);
                                Font f11 = new Font("", 23, 23);
                                l9.setFont(f11);
                                frame4.add(l9);

                                TextField tf3 = new TextField();
                                tf3.setBounds(850, 220, 250, 50);
                                tf3.setBackground(Color.WHITE);
                                frame4.add(tf3);

                                Label l11 = new Label("Email:");
                                l11.setBounds(200, 320, 80, 30);
                                l11.setBackground(Color.red);
                                Font f12 = new Font("", 23, 23);
                                l11.setFont(f12);
                                frame4.add(l11);

                                TextField tf4 = new TextField();
                                tf4.setBounds(200, 370, 250, 50);
                                tf4.setBackground(Color.WHITE);
                                frame4.add(tf4);

                                Label l12 = new Label("Present Address:");
                                l12.setBounds(850, 320, 190, 30);
                                l12.setBackground(Color.red);
                                Font f13 = new Font("", 23, 23);
                                l12.setFont(f13);
                                frame4.add(l12);

                                TextField tf5 = new TextField();
                                tf5.setBounds(850, 370, 250, 50);
                                tf5.setBackground(Color.WHITE);
                                frame4.add(tf5);

                                Label l13 = new Label("User Name:");
                                l13.setBounds(200, 460, 130, 30);
                                l13.setBackground(Color.red);
                                Font f15 = new Font("", 23, 23);
                                l13.setFont(f15);
                                frame4.add(l13);

                                TextField tf6 = new TextField();
                                tf6.setBounds(200, 520, 250, 50);
                                tf6.setBackground(Color.WHITE);
                                frame4.add(tf6);

                                Label l14 = new Label("Password:");
                                l14.setBounds(850, 460, 130, 30);
                                l14.setBackground(Color.red);
                                Font f16 = new Font("", 23, 23);
                                l14.setFont(f16);
                                frame4.add(l14);

                                TextField tf7 = new TextField();
                                tf7.setBounds(850, 510, 250, 50);
                                tf7.setBackground(Color.WHITE);
                                frame4.add(tf7);

                                Button b3 = new Button("Create");
                                b3.setBounds(600, 630, 80, 30);
                                Font f14 = new Font("", 15, 15);
                                b3.setFont(f14);
                                b3.setBackground(Color.RED);
                                frame4.add(b3);

                                b3.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent ae2) {

                                        Label l12 = new Label("Your user account is created.");
                                        l12.setBounds(850, 630, 300, 30);
                                        l12.setBackground(Color.red);
                                        Font f13 = new Font("", 23, 23);
                                        l12.setFont(f13);
                                        frame4.add(l12);
                                        File file2 = new File("F:\\User.txt");
                                        try {
                                            FileWriter o = new FileWriter(file2, true);
                                            BufferedWriter o1 = new BufferedWriter(o);
                                            PrintWriter output = new PrintWriter(o1);
                                            output.println(tf6.getText());
                                            output.println(tf7.getText());
                                            output.println(tf2.getText());
                                            output.println(tf3.getText());
                                            output.println(tf4.getText());
                                            output.println(tf5.getText());
                                            output.flush();
                                        } catch (IOException ex) {
                                            Logger.getLogger(Awt.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                });
                            }
                        });

                        b2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent ae2) {
                                File file = new File("F:\\User.txt");
                                try {
                                    Scanner input = new Scanner(file);
                                    int c = 0;
                                    while (input.hasNext()) {
                                        String a = input.nextLine();
                                        if (a.equals(tf.getText())) {
                                            String b = input.nextLine();
                                            if (b.equals(tf2.getText())) {
                                                c = 1;
                                                Frame frame4 = new Frame();
                                                frame4.setSize(1370, 800);
                                                frame4.setLayout(null);
                                                frame4.setVisible(true);
                                                frame4.setBackground(Color.blue);

                                                Button bb = new Button("Previous");
                                                bb.setBounds(50, 670, 100, 40);
                                                Font f101 = new Font("", 20, 20);
                                                bb.setFont(f101);
                                                bb.setBackground(Color.green);
                                                frame4.add(bb);

                                                bb.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent ae) {
                                                        frame3.setVisible(true);
                                                        frame4.dispose();
                                                    }
                                                });

                                                Label l1 = new Label("Welcome to Banking Account Using Process");
                                                l1.setBounds(210, 100, 1000, 60);
                                                l1.setBackground(Color.red);
                                                Font f = new Font("", 50, 50);
                                                l1.setFont(f);
                                                frame4.add(l1);

                                                Label l2 = new Label("What do you want to do?");
                                                l2.setBounds(370, 230, 480, 50);
                                                l2.setBackground(Color.red);
                                                Font f2 = new Font("", 40, 40);
                                                l2.setFont(f2);
                                                frame4.add(l2);

                                                CheckboxGroup cbg = new CheckboxGroup();
                                                Checkbox checkBox1 = new Checkbox("I want to open a Credit Account", cbg, false);
                                                Font f5 = new Font("", 30, 30);
                                                checkBox1.setFont(f5);
                                                checkBox1.setBounds(370, 320, 480, 50);
                                                checkBox1.setBackground(Color.cyan);

                                                Checkbox checkBox2 = new Checkbox("I want to open a Savings Account", cbg, false);
                                                Font f6 = new Font("", 30, 30);
                                                checkBox2.setFont(f6);
                                                checkBox2.setBounds(370, 410, 480, 50);
                                                checkBox2.setBackground(Color.cyan);

                                                Checkbox checkBox3 = new Checkbox("I want to visit my Bank Account", cbg, false);
                                                Font f7 = new Font("", 30, 30);
                                                checkBox3.setFont(f7);
                                                checkBox3.setBounds(370, 500, 480, 50);
                                                checkBox3.setBackground(Color.cyan);
                                                frame4.add(checkBox1);
                                                frame4.add(checkBox2);
                                                frame4.add(checkBox3);

                                                checkBox3.addItemListener(new ItemListener() {
                                                    public void itemStateChanged(ItemEvent e) {
                                                        Frame frame5 = new Frame();
                                                        frame5.setSize(1370, 800);
                                                        frame5.setLayout(null);
                                                        frame5.setVisible(true);
                                                        frame5.setBackground(Color.green);

                                                        Button bb = new Button("Previous");
                                                        bb.setBounds(50, 670, 100, 40);
                                                        Font f101 = new Font("", 20, 20);
                                                        bb.setFont(f101);
                                                        bb.setBackground(Color.blue);
                                                        frame5.add(bb);

                                                        bb.addActionListener(new ActionListener() {
                                                            public void actionPerformed(ActionEvent ae) {
                                                                frame4.setVisible(true);
                                                                frame5.dispose();

                                                                Button b = new Button("Next");
                                                                b.setBounds(1250, 670, 100, 40);
                                                                Font f101 = new Font("", 20, 20);
                                                                b.setFont(f101);
                                                                b.setBackground(Color.green);
                                                                frame4.add(b);

                                                                b.addActionListener(new ActionListener() {
                                                                    public void actionPerformed(ActionEvent ae) {
                                                                        frame5.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });

                                                        frame5.addWindowListener(new WindowAdapter() {
                                                            public void windowClosing(WindowEvent e) {
                                                                frame5.dispose();
                                                            }
                                                        });

                                                        Label l1 = new Label("My Bank Account");
                                                        l1.setBounds(440, 70, 410, 60);
                                                        l1.setBackground(Color.blue);
                                                        Font f = new Font("", 50, 50);
                                                        l1.setFont(f);
                                                        frame5.add(l1);

                                                        try {
                                                            File f23 = new File("F:\\User Bank Accounts.txt");
                                                            Scanner input1 = new Scanner(f23);
                                                            while (input1.hasNext()) {
                                                                if (a.equals(input1.nextLine())) {

                                                                    Label l2 = new Label("Account Type:");
                                                                    l2.setBounds(200, 210, 170, 30);
                                                                    l2.setBackground(Color.red);
                                                                    Font f2 = new Font("", 25, 25);
                                                                    l2.setFont(f2);
                                                                    frame5.add(l2);

                                                                    String c = input1.nextLine();
                                                                    Label l02 = new Label(c);
                                                                    l02.setBounds(380, 210, 190, 30);
                                                                    l02.setBackground(Color.blue);
                                                                    Font f02 = new Font("", 25, 25);
                                                                    l02.setFont(f02);
                                                                    frame5.add(l02);

                                                                    Label l14 = new Label("Account Number:");
                                                                    l14.setBounds(200, 310, 200, 30);
                                                                    l14.setBackground(Color.red);
                                                                    Font f13 = new Font("", 25, 25);
                                                                    l14.setFont(f13);
                                                                    frame5.add(l14);

                                                                    Label l014 = new Label(input1.nextLine());
                                                                    l014.setBounds(410, 310, 100, 30);
                                                                    l014.setBackground(Color.blue);
                                                                    Font f013 = new Font("", 25, 25);
                                                                    l014.setFont(f013);
                                                                    frame5.add(l014);

                                                                    Label l6 = new Label("Card Number:");
                                                                    l6.setBounds(800, 210, 160, 30);
                                                                    l6.setBackground(Color.red);
                                                                    Font f6 = new Font("", 25, 25);
                                                                    l6.setFont(f6);
                                                                    frame5.add(l6);

                                                                    if (c.equals("Credit Account")) {
                                                                        Label l06 = new Label(input1.nextLine());
                                                                        l06.setBounds(970, 210, 100, 30);
                                                                        l06.setBackground(Color.blue);
                                                                        Font f06 = new Font("", 25, 25);
                                                                        l06.setFont(f06);
                                                                        frame5.add(l06);
                                                                    }

                                                                    Label l3 = new Label("Account Balance:");
                                                                    l3.setBounds(200, 410, 200, 30);
                                                                    l3.setBackground(Color.red);
                                                                    Font f3 = new Font("", 25, 25);
                                                                    l3.setFont(f3);
                                                                    frame5.add(l3);

                                                                    String c1 = input1.nextLine();
                                                                    Label l03 = new Label(c1);
                                                                    l03.setBounds(410, 410, 90, 30);
                                                                    l03.setBackground(Color.blue);
                                                                    Font f03 = new Font("", 25, 25);
                                                                    l03.setFont(f03);
                                                                    frame5.add(l03);

                                                                    File f24 = new File("F:\\User Bank Account Information.txt");
                                                                    Scanner input10 = new Scanner(f24);
                                                                    while (input10.hasNext()) {
                                                                        if (input10.nextLine().equals(a)) {
                                                                            Label l4 = new Label("Last Deposit:");
                                                                            l4.setBounds(200, 510, 150, 30);
                                                                            l4.setBackground(Color.red);
                                                                            Font f4 = new Font("", 25, 25);
                                                                            l4.setFont(f4);
                                                                            frame5.add(l4);

                                                                            String c01 = input10.nextLine();
                                                                            Label l04 = new Label(c01);
                                                                            l04.setBounds(360, 510, 90, 30);
                                                                            l04.setBackground(Color.blue);
                                                                            Font f04 = new Font("", 25, 25);
                                                                            l04.setFont(f04);
                                                                            frame5.add(l04);

                                                                            Label l5 = new Label("Last Withdraw:");
                                                                            l5.setBounds(200, 610, 180, 30);
                                                                            l5.setBackground(Color.red);
                                                                            Font f5 = new Font("", 25, 25);
                                                                            l5.setFont(f5);
                                                                            frame5.add(l5);

                                                                            String c02 = input10.nextLine();
                                                                            Label l05 = new Label(c02);
                                                                            l05.setBounds(390, 610, 90, 30);
                                                                            l05.setBackground(Color.blue);
                                                                            Font f05 = new Font("", 25, 25);
                                                                            l05.setFont(f05);
                                                                            frame5.add(l05);

                                                                            Label l8 = new Label("Last Visited Time:");
                                                                            l8.setBounds(800, 310, 210, 30);
                                                                            l8.setBackground(Color.red);
                                                                            Font f8 = new Font("", 25, 25);
                                                                            l8.setFont(f8);
                                                                            frame5.add(l8);

                                                                            Label l08 = new Label(input10.nextLine());
                                                                            l08.setBounds(1020, 310, 240, 30);
                                                                            l08.setBackground(Color.blue);
                                                                            Font f08 = new Font("", 25, 25);
                                                                            l08.setFont(f08);
                                                                            frame5.add(l08);
                                                                        }
                                                                    }
                                                                    File f240 = new File("F:\\User Bank Account Information.txt");
                                                                    Scanner p2 = new Scanner(f240);
                                                                    ArrayList<String> arr = new ArrayList<String>();
                                                                    while (p2.hasNext()) {
                                                                        arr.add(p2.nextLine());
                                                                    }
                                                                    PrintWriter p = new PrintWriter(f240);
                                                                    Date d = new Date();
                                                                    String a1 = d.toString();
                                                                    for (int i = 0; i < arr.size(); i++) {
                                                                        if (arr.get(i).equals(a)) {
                                                                            arr.set(i + 3, a1);
                                                                        }
                                                                        p.println(arr.get(i));
                                                                    }
                                                                    p.close();

                                                                    Label l7 = new Label("New Deposit:");
                                                                    l7.setBounds(800, 410, 165, 30);
                                                                    l7.setBackground(Color.red);
                                                                    Font f7 = new Font("", 25, 25);
                                                                    l7.setFont(f7);
                                                                    frame5.add(l7);

                                                                    TextField tf7 = new TextField();
                                                                    tf7.setBounds(1010, 410, 200, 30);
                                                                    tf7.setBackground(Color.WHITE);
                                                                    frame5.add(tf7);

                                                                    Label l12 = new Label("Taka");
                                                                    l12.setBounds(1220, 410, 80, 30);
                                                                    Font f11 = new Font("", 25, 25);
                                                                    l12.setFont(f11);
                                                                    frame5.add(l12);

                                                                    Label l10 = new Label("New Withdraw:");
                                                                    l10.setBounds(800, 510, 180, 30);
                                                                    l10.setBackground(Color.red);
                                                                    Font f10 = new Font("", 25, 25);
                                                                    l10.setFont(f10);
                                                                    frame5.add(l10);

                                                                    TextField tf8 = new TextField();
                                                                    tf8.setBounds(1010, 510, 200, 30);
                                                                    tf8.setBackground(Color.WHITE);
                                                                    frame5.add(tf8);

                                                                    Label l13 = new Label("Taka");
                                                                    l13.setBounds(1220, 510, 80, 30);
                                                                    Font f12 = new Font("", 25, 25);
                                                                    l13.setFont(f12);
                                                                    frame5.add(l13);

                                                                    Button b3 = new Button("Enter");
                                                                    b3.setBounds(1050, 580, 80, 30);
                                                                    Font f122 = new Font("", 15, 15);
                                                                    b3.setFont(f122);
                                                                    b3.setBackground(Color.RED);
                                                                    frame5.add(b3);

                                                                    b3.addActionListener(new ActionListener() {
                                                                        public void actionPerformed(ActionEvent ae2) {

                                                                            int amount = 0;
                                                                            String amount3 = "";
                                                                            if (!tf7.getText().equals("") && !tf7.getText().equals("0") && Integer.parseInt(tf7.getText()) >= 500) {
                                                                                if (c.equals("Savings Account")) {
                                                                                    amount = Integer.parseInt(tf7.getText());
                                                                                    int amount2 = Integer.parseInt(c1);
                                                                                    amount3 = String.valueOf(amount + amount2);
                                                                                } else {
                                                                                    amount = Integer.parseInt(tf7.getText());
                                                                                    int amount2 = Integer.parseInt(c1);
                                                                                    amount3 = String.valueOf(amount2 - amount);
                                                                                }
                                                                                File f2 = new File("F:\\User Bank Accounts.txt");
                                                                                File f3 = new File("F:\\User Bank Account Information.txt");
                                                                                try {
                                                                                    Scanner p2 = new Scanner(f2);
                                                                                    Scanner p3 = new Scanner(f3);
                                                                                    ArrayList<String> arr = new ArrayList<String>();
                                                                                    while (p2.hasNext()) {
                                                                                        arr.add(p2.nextLine());
                                                                                    }
                                                                                    PrintWriter p = new PrintWriter(f2);
                                                                                    for (int i = 0; i < arr.size(); i++) {
                                                                                        if (arr.get(i).equals(a)) {
                                                                                            if (c.equals("Savings Account")) {
                                                                                                arr.set(i + 3, amount3);
                                                                                            } else {
                                                                                                arr.set(i + 4, amount3);
                                                                                            }
                                                                                        }
                                                                                        p.println(arr.get(i));
                                                                                    }
                                                                                    ArrayList<String> arr2 = new ArrayList<String>();
                                                                                    while (p3.hasNext()) {
                                                                                        arr2.add(p3.nextLine());
                                                                                    }
                                                                                    PrintWriter p03 = new PrintWriter(f3);
                                                                                    for (int i = 0; i < arr2.size(); i++) {
                                                                                        if (arr2.get(i).equals(a)) {
                                                                                            arr2.set(i + 1, String.valueOf(amount));
                                                                                        }
                                                                                        p03.println(arr2.get(i));
                                                                                    }
                                                                                    p.close();
                                                                                    p03.close();
                                                                                    Label l3 = new Label("Your balance is changed.");
                                                                                    l3.setBounds(830, 640, 390, 40);
                                                                                    l3.setBackground(Color.cyan);
                                                                                    Font f03 = new Font("", 30, 30);
                                                                                    l3.setFont(f03);
                                                                                    frame5.add(l3);
                                                                                } catch (Exception e) {
                                                                                };
                                                                            } else if (!tf8.getText().equals("") && !tf8.getText().equals("0") && Integer.parseInt(tf8.getText()) > 0) {
                                                                                if (c.equals("Credit Account")) {
                                                                                    amount = Integer.parseInt(tf8.getText());
                                                                                    int amount2 = Integer.parseInt(c1);
                                                                                    amount3 = String.valueOf(amount2 + amount);
                                                                                } else {
                                                                                    amount = Integer.parseInt(tf8.getText());
                                                                                    int amount2 = Integer.parseInt(c1);
                                                                                    amount3 = String.valueOf(amount2 - amount);
                                                                                }
                                                                                File f2 = new File("F:\\User Bank Accounts.txt");
                                                                                File f3 = new File("F:\\User Bank Account Information.txt");
                                                                                try {
                                                                                    Scanner p2 = new Scanner(f2);
                                                                                    Scanner p3 = new Scanner(f3);
                                                                                    ArrayList<String> arr = new ArrayList<String>();
                                                                                    while (p2.hasNext()) {
                                                                                        arr.add(p2.nextLine());
                                                                                    }
                                                                                    PrintWriter p = new PrintWriter(f2);
                                                                                    for (int i = 0; i < arr.size(); i++) {
                                                                                        if (arr.get(i).equals(a)) {
                                                                                            if (c.equals("Savings Account")) {
                                                                                                arr.set(i + 3, amount3);
                                                                                            } else {
                                                                                                arr.set(i + 4, amount3);
                                                                                            }
                                                                                        }
                                                                                        p.println(arr.get(i));
                                                                                    }
                                                                                    ArrayList<String> arr2 = new ArrayList<String>();
                                                                                    while (p3.hasNext()) {
                                                                                        arr2.add(p3.nextLine());
                                                                                    }
                                                                                    PrintWriter p03 = new PrintWriter(f3);
                                                                                    for (int i = 0; i < arr2.size(); i++) {
                                                                                        if (arr2.get(i).equals(a)) {
                                                                                            arr2.set(i + 2, String.valueOf(amount));
                                                                                        }
                                                                                        p03.println(arr2.get(i));
                                                                                    }
                                                                                    p.close();
                                                                                    p03.close();
                                                                                    Label l3 = new Label("Your balance is changed.");
                                                                                    l3.setBounds(830, 640, 390, 40);
                                                                                    l3.setBackground(Color.cyan);
                                                                                    Font f03 = new Font("", 30, 30);
                                                                                    l3.setFont(f03);
                                                                                    frame5.add(l3);
                                                                                } catch (Exception e) {
                                                                                };
                                                                            } else {
                                                                                Label l3 = new Label("Please insert a valid amount of money.");
                                                                                l3.setBounds(780, 640, 520, 40);
                                                                                l3.setBackground(Color.cyan);
                                                                                Font f3 = new Font("", 30, 30);
                                                                                l3.setFont(f3);
                                                                                frame5.add(l3);
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        } catch (Exception t1) {
                                                        };
                                                    }
                                                });

                                                checkBox2.addItemListener(new ItemListener() {
                                                    public void itemStateChanged(ItemEvent e) {

                                                        Frame frame6 = new Frame();
                                                        frame6.setSize(1370, 800);
                                                        frame6.setLayout(null);
                                                        frame6.setVisible(true);
                                                        frame6.setBackground(Color.green);

                                                        Button bb = new Button("Previous");
                                                        bb.setBounds(50, 670, 100, 40);
                                                        Font f101 = new Font("", 20, 20);
                                                        bb.setFont(f101);
                                                        bb.setBackground(Color.blue);
                                                        frame6.add(bb);

                                                        bb.addActionListener(new ActionListener() {
                                                            public void actionPerformed(ActionEvent ae) {
                                                                frame4.setVisible(true);
                                                                frame6.dispose();

                                                                Button b = new Button("Next");
                                                                b.setBounds(1250, 670, 100, 40);
                                                                Font f101 = new Font("", 20, 20);
                                                                b.setFont(f101);
                                                                b.setBackground(Color.green);
                                                                frame4.add(b);

                                                                b.addActionListener(new ActionListener() {
                                                                    public void actionPerformed(ActionEvent ae) {
                                                                        frame6.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });

                                                        frame6.addWindowListener(new WindowAdapter() {
                                                            public void windowClosing(WindowEvent e) {
                                                                frame6.dispose();
                                                            }
                                                        });
                                                        File f22 = new File("F:\\Bank Account Information.txt");
                                                        try {
                                                            Scanner input = new Scanner(f22);
                                                            input.nextLine();
                                                            input.nextLine();

                                                            File f23 = new File("F:\\User Bank Accounts.txt");
                                                            File f24 = new File("F:\\User Bank Account Information.txt");
                                                            try {
                                                                FileWriter ff = new FileWriter(f23, true);
                                                                PrintWriter p = new PrintWriter(ff);
                                                                p.println(a);
                                                                p.println("Savings Account");

                                                                FileWriter ff2 = new FileWriter(f24, true);
                                                                PrintWriter p2 = new PrintWriter(ff2);
                                                                p2.println(a);

                                                                try {
                                                                    Scanner input23 = new Scanner(f23);

                                                                    Label l1 = new Label("Savings Account");
                                                                    l1.setBounds(400, 70, 390, 60);
                                                                    l1.setBackground(Color.blue);
                                                                    Font f = new Font("", 50, 50);
                                                                    l1.setFont(f);
                                                                    frame6.add(l1);

                                                                    Label l2 = new Label("Account Number:");
                                                                    l2.setBounds(200, 210, 210, 30);
                                                                    l2.setBackground(Color.red);
                                                                    Font f2 = new Font("", 25, 25);
                                                                    l2.setFont(f2);
                                                                    frame6.add(l2);

                                                                    int r = (int) (Math.random() * 10000 + (int) Math.random() * 10);
                                                                    String str = String.valueOf(r);
                                                                    p.println(str);

                                                                    Label l23 = new Label(str);
                                                                    l23.setBounds(410, 210, 90, 30);
                                                                    l23.setBackground(Color.red);
                                                                    Font f01 = new Font("", 25, 25);
                                                                    l23.setFont(f01);
                                                                    frame6.add(l23);

                                                                    Label l6 = new Label("Interest Rate:" + input.nextLine() + " %");
                                                                    l6.setBounds(200, 310, 210, 30);
                                                                    l6.setBackground(Color.red);
                                                                    Font f6 = new Font("", 25, 25);
                                                                    l6.setFont(f6);
                                                                    frame6.add(l6);

                                                                    Label l7 = new Label("Withdrawal Limit: " + input.nextLine() + " Taka");
                                                                    l7.setBounds(800, 210, 310, 30);
                                                                    l7.setBackground(Color.red);
                                                                    Font f7 = new Font("", 25, 25);
                                                                    l7.setFont(f7);
                                                                    frame6.add(l7);

                                                                    Label l8 = new Label("Minimum Deposit: " + input.nextLine() + " Taka");
                                                                    l8.setBounds(800, 310, 320, 30);
                                                                    l8.setBackground(Color.red);
                                                                    Font f8 = new Font("", 25, 25);
                                                                    l8.setFont(f8);
                                                                    frame6.add(l8);

                                                                    Label l3 = new Label("How much money do you want to deposit?");
                                                                    l3.setBounds(310, 410, 650, 40);
                                                                    l3.setBackground(Color.red);
                                                                    Font f3 = new Font("", 35, 35);
                                                                    l3.setFont(f3);
                                                                    frame6.add(l3);

                                                                    TextField tf8 = new TextField();
                                                                    tf8.setBounds(490, 500, 230, 50);
                                                                    tf8.setBackground(Color.WHITE);
                                                                    frame6.add(tf8);

                                                                    Label l13 = new Label("Taka");
                                                                    l13.setBounds(730, 500, 80, 50);
                                                                    Font f12 = new Font("", 30, 30);
                                                                    l13.setFont(f12);
                                                                    frame6.add(l13);

                                                                    Button b3 = new Button("Deposit");
                                                                    b3.setBounds(570, 580, 80, 30);
                                                                    Font f14 = new Font("", 15, 15);
                                                                    b3.setFont(f14);
                                                                    b3.setBackground(Color.red);
                                                                    frame6.add(b3);
                                                                    b3.addActionListener(new ActionListener() {
                                                                        public void actionPerformed(ActionEvent ae2) {
                                                                            if (tf8.getText().equals("")) {
                                                                                Label l3 = new Label("Please insert deposit amount");
                                                                                l3.setBounds(410, 640, 450, 40);
                                                                                l3.setBackground(Color.cyan);
                                                                                Font f3 = new Font("", 35, 35);
                                                                                l3.setFont(f3);
                                                                                frame6.add(l3);
                                                                            } else {
                                                                                Label l3 = new Label("Your savings account is successfully created");
                                                                                l3.setBounds(295, 640, 700, 40);
                                                                                l3.setBackground(Color.cyan);
                                                                                Font f3 = new Font("", 35, 35);
                                                                                l3.setFont(f3);
                                                                                frame6.add(l3);
                                                                                p.println(tf8.getText());
                                                                                p2.println(tf8.getText());
                                                                                p2.println("0");
                                                                                p2.println("0");
                                                                                p.close();
                                                                                p2.close();
                                                                            }
                                                                        }
                                                                    });
                                                                } catch (Exception e1) {
                                                                };
                                                            } catch (Exception e1) {
                                                            };
                                                        } catch (FileNotFoundException ex) {
                                                            Logger.getLogger(Awt.class.getName()).log(Level.SEVERE, null, ex);
                                                        }
                                                    }
                                                });

                                                checkBox1.addItemListener(new ItemListener() {
                                                    public void itemStateChanged(ItemEvent e) {

                                                        Frame frame7 = new Frame();
                                                        frame7.setSize(1370, 800);
                                                        frame7.setLayout(null);
                                                        frame7.setVisible(true);
                                                        frame7.setBackground(Color.green);

                                                        frame7.addWindowListener(new WindowAdapter() {
                                                            public void windowClosing(WindowEvent e) {
                                                                frame7.dispose();
                                                            }
                                                        });

                                                        Button bb = new Button("Previous");
                                                        bb.setBounds(50, 670, 100, 40);
                                                        Font f101 = new Font("", 20, 20);
                                                        bb.setFont(f101);
                                                        bb.setBackground(Color.blue);
                                                        frame7.add(bb);

                                                        bb.addActionListener(new ActionListener() {
                                                            public void actionPerformed(ActionEvent ae) {
                                                                frame4.setVisible(true);
                                                                frame7.dispose();

                                                                Button b = new Button("Next");
                                                                b.setBounds(1250, 670, 100, 40);
                                                                Font f101 = new Font("", 20, 20);
                                                                b.setFont(f101);
                                                                b.setBackground(Color.green);
                                                                frame4.add(b);

                                                                b.addActionListener(new ActionListener() {
                                                                    public void actionPerformed(ActionEvent ae) {
                                                                        frame7.setVisible(true);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        File f1 = new File("F:\\Bank Account Information.txt");
                                                        try {
                                                            Label l1 = new Label("Credit Account");
                                                            l1.setBounds(460, 70, 360, 60);
                                                            l1.setBackground(Color.blue);
                                                            Font f = new Font("", 50, 50);
                                                            l1.setFont(f);
                                                            frame7.add(l1);

                                                            File f23 = new File("F:\\User Bank Accounts.txt");
                                                            File f24 = new File("F:\\User Bank Account Information.txt");
                                                            try {
                                                                FileWriter ff = new FileWriter(f23, true);
                                                                PrintWriter p = new PrintWriter(ff);
                                                                p.println(a);
                                                                p.println("Credit Account");

                                                                FileWriter ff2 = new FileWriter(f24, true);
                                                                PrintWriter p2 = new PrintWriter(ff2);
                                                                p2.println(a);
                                                                try {
                                                                    Scanner input23 = new Scanner(f23);

                                                                    Label l2 = new Label("Account Number:");
                                                                    l2.setBounds(200, 210, 210, 30);
                                                                    l2.setBackground(Color.red);
                                                                    Font f2 = new Font("", 25, 25);
                                                                    l2.setFont(f2);
                                                                    frame7.add(l2);

                                                                    int r = (int) (Math.random() * 10000 + (int) Math.random() * 10);
                                                                    String str = String.valueOf(r);
                                                                    p.println(str);

                                                                    Label l23 = new Label(str);
                                                                    l23.setBounds(410, 210, 90, 30);
                                                                    l23.setBackground(Color.red);
                                                                    Font f01 = new Font("", 25, 25);
                                                                    l23.setFont(f01);
                                                                    frame7.add(l23);

                                                                    Scanner input = new Scanner(f1);
                                                                    Label l6 = new Label("Interest Rate: " + input.nextLine() + " %");
                                                                    l6.setBounds(200, 310, 210, 30);
                                                                    l6.setBackground(Color.red);
                                                                    Font f6 = new Font("", 25, 25);
                                                                    l6.setFont(f6);
                                                                    frame7.add(l6);

                                                                    Label l7 = new Label("Credit Card Number:");
                                                                    l7.setBounds(800, 210, 240, 30);
                                                                    l7.setBackground(Color.red);
                                                                    Font f7 = new Font("", 25, 25);
                                                                    l7.setFont(f7);
                                                                    frame7.add(l7);

                                                                    long r2 = (long) (Math.random() * 100000 + Math.random() * 10);
                                                                    String str2 = String.valueOf(r2);
                                                                    p.println(str2);//Credit Card Number

                                                                    Label l07 = new Label(str2);
                                                                    l07.setBounds(1040, 210, 90, 30);
                                                                    l07.setBackground(Color.red);
                                                                    Font f07 = new Font("", 25, 25);
                                                                    l07.setFont(f07);
                                                                    frame7.add(l07);

                                                                    Label l8 = new Label("Credit Limit: " + input.nextLine() + " Taka");
                                                                    l8.setBounds(800, 310, 290, 30);
                                                                    l8.setBackground(Color.red);
                                                                    Font f8 = new Font("", 25, 25);
                                                                    l8.setFont(f8);
                                                                    frame7.add(l8);

                                                                    Label l3 = new Label("How much money do you want to withdraw?");
                                                                    l3.setBounds(310, 410, 680, 40);
                                                                    l3.setBackground(Color.red);
                                                                    Font f3 = new Font("", 35, 35);
                                                                    l3.setFont(f3);
                                                                    frame7.add(l3);

                                                                    TextField tf8 = new TextField();
                                                                    tf8.setBounds(490, 500, 230, 50);
                                                                    tf8.setBackground(Color.WHITE);
                                                                    frame7.add(tf8);

                                                                    Label l13 = new Label("Taka");
                                                                    l13.setBounds(730, 500, 80, 50);
                                                                    Font f12 = new Font("", 30, 30);
                                                                    l13.setFont(f12);
                                                                    frame7.add(l13);

                                                                    Button b3 = new Button("Withdraw");
                                                                    b3.setBounds(570, 580, 80, 30);
                                                                    Font f14 = new Font("", 15, 15);
                                                                    b3.setFont(f14);
                                                                    b3.setBackground(Color.red);
                                                                    frame7.add(b3);

                                                                    b3.addActionListener(new ActionListener() {
                                                                        public void actionPerformed(ActionEvent ae2) {
                                                                            if (tf8.getText().equals("")) {
                                                                                Label l3 = new Label("Please insert withdraw amount");
                                                                                l3.setBounds(410, 640, 480, 40);
                                                                                l3.setBackground(Color.cyan);
                                                                                Font f3 = new Font("", 35, 35);
                                                                                l3.setFont(f3);
                                                                                frame7.add(l3);
                                                                            } else {
                                                                                Label l3 = new Label("Your credit account is successfully created");
                                                                                l3.setBounds(295, 640, 670, 40);
                                                                                l3.setBackground(Color.cyan);
                                                                                Font f3 = new Font("", 35, 35);
                                                                                l3.setFont(f3);
                                                                                frame7.add(l3);
                                                                                p.println(tf8.getText());
                                                                                p2.println(tf8.getText());
                                                                                p2.println("0");
                                                                                p2.println("0");
                                                                                p.close();
                                                                                p2.close();
                                                                            }
                                                                        }
                                                                    });
                                                                } catch (FileNotFoundException ex) {
                                                                }
                                                            } catch (Exception e1) {
                                                            };
                                                        } catch (Exception e1) {
                                                        };
                                                    }
                                                });
                                                frame4.addWindowListener(new WindowAdapter() {
                                                    public void windowClosing(WindowEvent e) {
                                                        frame4.dispose();
                                                    }
                                                });
                                            } else {
                                                Label l = new Label("Your password is incorrect.");
                                                l.setBounds(870, 640, 335, 50);
                                                Font f10 = new Font("", 25, 25);
                                                l.setFont(f10);
                                                l.setBackground(Color.red);
                                                frame3.add(l);
                                            }
                                        }
                                    }
                                    if (c == 0) {
                                        Label l = new Label("Your username is incorrect.");
                                        l.setBounds(870, 640, 335, 50);
                                        Font f10 = new Font("", 25, 25);
                                        l.setFont(f10);
                                        l.setBackground(Color.red);
                                        frame3.add(l);
                                    }
                                } catch (FileNotFoundException ex) {
                                }
                            }
                        });

                    }
                });

            }
        }
        );
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Awt a = new Awt();
    }
}
