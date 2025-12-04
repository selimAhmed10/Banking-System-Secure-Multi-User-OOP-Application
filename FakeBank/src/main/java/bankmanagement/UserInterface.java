package bankmanagement;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserInterface extends javax.swing.JFrame {
    public UserInterface() {
        initComponents();
        
        FileManager.readProfilesFromFile();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                FileManager.writeProfilesToFile();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpGender = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        SignUpPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        FirstNameSignUp = new javax.swing.JTextField();
        LastNameSignUp = new javax.swing.JTextField();
        EmailSignUp = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        MaleSignUp = new javax.swing.JRadioButton();
        FemaleSignUp = new javax.swing.JRadioButton();
        SignUpButton = new javax.swing.JButton();
        GoToLogin = new javax.swing.JButton();
        AgreeTerms = new javax.swing.JCheckBox();
        OtherSignUp = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        PasswordSignUp = new javax.swing.JTextField();
        LoginPanel = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        EmailLogin = new javax.swing.JTextField();
        PasswordLogin = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        GoToSignUp = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        ClientPanel = new javax.swing.JPanel();
        ClientFrames = new javax.swing.JTabbedPane();
        Transactions = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ClientName4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TransactionDate1 = new javax.swing.JLabel();
        Transaction1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TransactionDate2 = new javax.swing.JLabel();
        TransactionDate3 = new javax.swing.JLabel();
        Transaction2 = new javax.swing.JLabel();
        Transaction3 = new javax.swing.JLabel();
        Deposit = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ClientName3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ClientBalance3 = new javax.swing.JLabel();
        ClientLoan3 = new javax.swing.JLabel();
        DepositAmount = new javax.swing.JTextField();
        DepositProceed = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        LastDepositDate = new javax.swing.JLabel();
        LastDeposit = new javax.swing.JLabel();
        Withdraw = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ClientName2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        ClientBalance2 = new javax.swing.JLabel();
        ClientLoan2 = new javax.swing.JLabel();
        WithdrawAmount = new javax.swing.JTextField();
        WithdrawProceed = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        LastWithdrawDate = new javax.swing.JLabel();
        LastWithdraw = new javax.swing.JLabel();
        LoanClient = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        ClientName1 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        ClientBalance1 = new javax.swing.JLabel();
        ClientLoan1 = new javax.swing.JLabel();
        LoanAmount = new javax.swing.JTextField();
        LoanProceed = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        LastLoanDate = new javax.swing.JLabel();
        LastLoan = new javax.swing.JLabel();
        ClientDashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ClientBalance = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AdminPanel = new javax.swing.JPanel();
        AdminFrames = new javax.swing.JTabbedPane();
        Requests = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        PendingRequests = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        RejectRequest = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AllRequestTable = new javax.swing.JTable();
        AcceptRequest = new javax.swing.JButton();
        Accounts = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        TotalProfiles = new javax.swing.JLabel();
        RemoveProfile = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AllProfileTable = new javax.swing.JTable();
        AdminSidePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        AdminName = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        AllRequests = new javax.swing.JButton();
        AllProfiles = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        MainPanel.setMinimumSize(new java.awt.Dimension(820, 720));
        MainPanel.setPreferredSize(new java.awt.Dimension(820, 720));
        MainPanel.setLayout(new java.awt.BorderLayout());

        SignUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        SignUpPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SignUpPanel.setMaximumSize(new java.awt.Dimension(700, 600));
        SignUpPanel.setMinimumSize(new java.awt.Dimension(700, 600));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Sign Up");
        jLabel4.setToolTipText("");

        jLabel53.setText("It's quick and easy.");
        jLabel53.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FirstNameSignUp.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        FirstNameSignUp.setText("First name...");
        FirstNameSignUp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FirstNameSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstNameSignUpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FirstNameSignUpFocusLost(evt);
            }
        });
        FirstNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameSignUpActionPerformed(evt);
            }
        });

        LastNameSignUp.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        LastNameSignUp.setText("Last name...");
        LastNameSignUp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        LastNameSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastNameSignUpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LastNameSignUpFocusLost(evt);
            }
        });
        LastNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameSignUpActionPerformed(evt);
            }
        });

        EmailSignUp.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        EmailSignUp.setText("Email address...");
        EmailSignUp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        EmailSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailSignUpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailSignUpFocusLost(evt);
            }
        });
        EmailSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailSignUpActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Gender");

        SignUpGender.add(MaleSignUp);
        MaleSignUp.setText("Male");
        MaleSignUp.setBorder(new javax.swing.border.MatteBorder(null));
        MaleSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleSignUpActionPerformed(evt);
            }
        });

        SignUpGender.add(FemaleSignUp);
        FemaleSignUp.setText("Female");

        SignUpButton.setBackground(new java.awt.Color(0, 204, 51));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Sign Up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        GoToLogin.setBackground(new java.awt.Color(66, 103, 178));
        GoToLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GoToLogin.setForeground(new java.awt.Color(255, 255, 255));
        GoToLogin.setText("I have an account");
        GoToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToLoginActionPerformed(evt);
            }
        });

        AgreeTerms.setText("By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. ");
        AgreeTerms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreeTermsActionPerformed(evt);
            }
        });

        OtherSignUp.setText("Other");

        jLabel55.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setText("Fakebank © 2023");

        PasswordSignUp.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        PasswordSignUp.setText("New password...");
        PasswordSignUp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PasswordSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordSignUpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordSignUpFocusLost(evt);
            }
        });
        PasswordSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUpPanelLayout = new javax.swing.GroupLayout(SignUpPanel);
        SignUpPanel.setLayout(SignUpPanelLayout);
        SignUpPanelLayout.setHorizontalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignUpPanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addComponent(MaleSignUp)
                                .addGap(12, 12, 12)
                                .addComponent(FemaleSignUp)
                                .addGap(6, 6, 6)
                                .addComponent(OtherSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GoToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AgreeTerms, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SignUpPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        SignUpPanelLayout.setVerticalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel53)
                .addGap(6, 6, 6)
                .addComponent(FirstNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(LastNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(EmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel54)
                .addGap(6, 6, 6)
                .addGroup(SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaleSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FemaleSignUp)
                    .addComponent(OtherSignUp))
                .addGap(18, 18, 18)
                .addComponent(AgreeTerms)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(GoToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel55)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        MainPanel.add(SignUpPanel, java.awt.BorderLayout.CENTER);

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setMaximumSize(new java.awt.Dimension(800, 500));
        LoginPanel.setMinimumSize(new java.awt.Dimension(800, 500));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel56.setText("Welcome Back!");

        EmailLogin.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        EmailLogin.setText("Email address...");
        EmailLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        EmailLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailLoginFocusLost(evt);
            }
        });
        EmailLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailLoginActionPerformed(evt);
            }
        });

        PasswordLogin.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PasswordLogin.setText("Password...");
        PasswordLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        PasswordLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordLoginFocusLost(evt);
            }
        });
        PasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordLoginActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(66, 103, 178));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Log In");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        GoToSignUp.setBackground(new java.awt.Color(0, 204, 51));
        GoToSignUp.setForeground(new java.awt.Color(255, 255, 255));
        GoToSignUp.setText("Create new account");
        GoToSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToSignUpActionPerformed(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("Fakebank © 2023");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(EmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GoToSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jLabel58)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel57))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(EmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(GoToSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        MainPanel.add(LoginPanel, java.awt.BorderLayout.PAGE_START);

        ClientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Transactions.setBackground(new java.awt.Color(255, 255, 255));
        Transactions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        jLabel5.setText("jLabel5");
        Transactions.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 334, 114));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Transactions.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, -1, -1));

        ClientName4.setText("Ferdous Bin Hafiz ");
        Transactions.add(ClientName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 138, -1, -1));

        jLabel10.setText("11/09/2001");
        Transactions.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 160, 96, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Transactions:");
        Transactions.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 510, -1));

        TransactionDate1.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        TransactionDate1.setText("Date: 11/09/2001");
        Transactions.add(TransactionDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, -1));

        Transaction1.setText("- 2000$ add");
        Transactions.add(Transaction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 272, 150, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Fakebank © 2023");
        Transactions.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, -1, -1));

        TransactionDate2.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        TransactionDate2.setText("Date: 11/09/2001");
        Transactions.add(TransactionDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 306, 90, -1));

        TransactionDate3.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        TransactionDate3.setText("Date: 11/09/2001");
        Transactions.add(TransactionDate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 362, 90, -1));

        Transaction2.setText("2000$ add");
        Transactions.add(Transaction2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 328, 140, -1));

        Transaction3.setText("2000$ add");
        Transactions.add(Transaction3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 140, -1));

        ClientFrames.addTab("tab2", Transactions);

        Deposit.setBackground(new java.awt.Color(255, 255, 255));
        Deposit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        jLabel20.setText("jLabel5");
        Deposit.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 334, 114));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Deposit.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, -1, -1));

        ClientName3.setText("Ferdous Bin Hafiz ");
        Deposit.add(ClientName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 138, -1, -1));

        jLabel23.setText("11/09/2001");
        Deposit.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 160, 96, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Fakebank © 2023");
        Deposit.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setText("Deposit Menu");
        Deposit.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, 165, -1));

        ClientBalance3.setText("Current Balance: 0.00 BDT");
        Deposit.add(ClientBalance3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 261, -1, -1));

        ClientLoan3.setText("Pending Loan: 0.00 BDT");
        Deposit.add(ClientLoan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 283, -1, -1));

        DepositAmount.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        DepositAmount.setText("Enter Amount...");
        DepositAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        DepositAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DepositAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DepositAmountFocusLost(evt);
            }
        });
        DepositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositAmountActionPerformed(evt);
            }
        });
        Deposit.add(DepositAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 317, 292, -1));

        DepositProceed.setBackground(new java.awt.Color(66, 103, 178));
        DepositProceed.setForeground(new java.awt.Color(255, 255, 255));
        DepositProceed.setText("Proceed");
        DepositProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositProceedActionPerformed(evt);
            }
        });
        Deposit.add(DepositProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 349, -1, -1));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Deposit.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 349, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setText("Last Deposit: ");
        Deposit.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        LastDepositDate.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        LastDepositDate.setText("Date: 11/09/2001");
        Deposit.add(LastDepositDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 428, 94, -1));

        LastDeposit.setText("- 2000 BDT deposit from Mim");
        Deposit.add(LastDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        ClientFrames.addTab("", Deposit);

        Withdraw.setBackground(new java.awt.Color(255, 255, 255));
        Withdraw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        jLabel31.setText("jLabel5");
        Withdraw.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 334, 114));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Withdraw.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, -1, -1));

        ClientName2.setText("Ferdous Bin Hafiz ");
        Withdraw.add(ClientName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 138, -1, -1));

        jLabel34.setText("11/09/2001");
        Withdraw.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 160, 96, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Fakebank © 2023");
        Withdraw.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel36.setText("Withdraw Menu");
        Withdraw.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, -1, -1));

        ClientBalance2.setText("Current Balance: 0.00 BDT");
        Withdraw.add(ClientBalance2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 261, -1, -1));

        ClientLoan2.setText("Pending Loan: 0.00 BDT");
        Withdraw.add(ClientLoan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 283, -1, -1));

        WithdrawAmount.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        WithdrawAmount.setText("Enter Amount...");
        WithdrawAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        WithdrawAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                WithdrawAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                WithdrawAmountFocusLost(evt);
            }
        });
        WithdrawAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawAmountActionPerformed(evt);
            }
        });
        Withdraw.add(WithdrawAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 317, 292, -1));

        WithdrawProceed.setBackground(new java.awt.Color(66, 103, 178));
        WithdrawProceed.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawProceed.setText("Proceed");
        WithdrawProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawProceedActionPerformed(evt);
            }
        });
        Withdraw.add(WithdrawProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 349, -1, -1));

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Withdraw.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 349, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel39.setText("Last Withdraw: ");
        Withdraw.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        LastWithdrawDate.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        LastWithdrawDate.setText("Date: 11/09/2001");
        Withdraw.add(LastWithdrawDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 428, 94, -1));

        LastWithdraw.setText("- 2000 BDT Withdraw");
        Withdraw.add(LastWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 160, -1));

        ClientFrames.addTab("tab4", Withdraw);

        LoanClient.setBackground(new java.awt.Color(255, 255, 255));
        LoanClient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        jLabel42.setText("jLabel5");
        LoanClient.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 334, 114));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoanClient.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, -1, -1));

        ClientName1.setText("Ferdous Bin Hafiz ");
        LoanClient.add(ClientName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 138, -1, -1));

        jLabel45.setText("11/09/2001");
        LoanClient.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 160, 96, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Fakebank © 2023");
        LoanClient.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setText("Loan Menu");
        LoanClient.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, -1, -1));

        ClientBalance1.setText("Current Balance: 0.00 BDT");
        LoanClient.add(ClientBalance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 261, -1, -1));

        ClientLoan1.setText("Pending Loan: 0.00 BDT");
        LoanClient.add(ClientLoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 283, -1, -1));

        LoanAmount.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        LoanAmount.setText("Enter Amount...");
        LoanAmount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        LoanAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoanAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoanAmountFocusLost(evt);
            }
        });
        LoanAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanAmountActionPerformed(evt);
            }
        });
        LoanClient.add(LoanAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 317, 292, -1));

        LoanProceed.setBackground(new java.awt.Color(66, 103, 178));
        LoanProceed.setForeground(new java.awt.Color(255, 255, 255));
        LoanProceed.setText("Proceed");
        LoanProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanProceedActionPerformed(evt);
            }
        });
        LoanClient.add(LoanProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 349, -1, -1));

        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        LoanClient.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 349, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setText("Last Loan: ");
        LoanClient.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        LastLoanDate.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        LastLoanDate.setText("Date: 11/09/2001");
        LoanClient.add(LastLoanDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 428, 94, -1));

        LastLoan.setText("- 2000 BDT Loan");
        LoanClient.add(LastLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, -1));

        ClientFrames.addTab("tab3", LoanClient);

        ClientPanel.add(ClientFrames, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -30, -1, 750));

        ClientDashboard.setBackground(new java.awt.Color(51, 51, 51));
        ClientDashboard.setMaximumSize(new java.awt.Dimension(800, 500));
        ClientDashboard.setMinimumSize(new java.awt.Dimension(800, 500));
        ClientDashboard.setPreferredSize(new java.awt.Dimension(800, 500));
        ClientDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FakeBank");
        ClientDashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 18, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Balance:");
        ClientDashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 213, -1));

        ClientBalance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ClientBalance.setForeground(new java.awt.Color(255, 255, 255));
        ClientBalance.setText("0.00 BDT");
        ClientDashboard.add(ClientBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 76, 213, 22));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Deposit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ClientDashboard.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 213, 37));

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Withdraw");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ClientDashboard.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 203, 213, 37));

        jButton3.setBackground(new java.awt.Color(0, 204, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Loan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ClientDashboard.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 246, 213, 40));

        LogOut.setBackground(new java.awt.Color(66, 103, 178));
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("Log Out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        ClientDashboard.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 471, 213, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DashBoard");
        ClientDashboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 116, 213, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Your Card:");
        ClientDashboard.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 312, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        ClientDashboard.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 344, 213, -1));

        ClientPanel.add(ClientDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 720));

        MainPanel.add(ClientPanel, java.awt.BorderLayout.PAGE_END);

        AdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Requests.setBackground(new java.awt.Color(204, 204, 204));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setText("Requests Menu");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        jLabel38.setText("jLabel12");

        PendingRequests.setText("Pending Requests: 0");

        jLabel48.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Fakebank © 2023");

        RejectRequest.setBackground(new java.awt.Color(255, 0, 0));
        RejectRequest.setForeground(new java.awt.Color(255, 255, 255));
        RejectRequest.setText("Reject");
        RejectRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectRequestActionPerformed(evt);
            }
        });

        AllRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Balance", "Pending Loan", "Requested Loan"
            }
        ));
        jScrollPane2.setViewportView(AllRequestTable);

        AcceptRequest.setBackground(new java.awt.Color(0, 204, 51));
        AcceptRequest.setForeground(new java.awt.Color(255, 255, 255));
        AcceptRequest.setText("Accept");
        AcceptRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequestsLayout = new javax.swing.GroupLayout(Requests);
        Requests.setLayout(RequestsLayout);
        RequestsLayout.setHorizontalGroup(
            RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RequestsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AcceptRequest)
                        .addGap(18, 18, 18)
                        .addComponent(RejectRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RequestsLayout.createSequentialGroup()
                        .addGroup(RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RequestsLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PendingRequests)
                                    .addComponent(jLabel37))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(jLabel48))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        RequestsLayout.setVerticalGroup(
            RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PendingRequests)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RejectRequest)
                    .addComponent(AcceptRequest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addContainerGap())
        );

        AdminFrames.addTab("tab2", Requests);

        Accounts.setBackground(new java.awt.Color(204, 204, 204));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setText("Accounts Menu");

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.gif"))); // NOI18N
        jLabel59.setText("jLabel12");

        TotalProfiles.setText("Total Profiles: 0");

        RemoveProfile.setBackground(new java.awt.Color(255, 0, 0));
        RemoveProfile.setForeground(new java.awt.Color(255, 255, 255));
        RemoveProfile.setText("Remove");
        RemoveProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveProfileActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Fakebank © 2023");

        AllProfileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Balance", "Pending Loan", "Requested Loan"
            }
        ));
        jScrollPane3.setViewportView(AllProfileTable);

        javax.swing.GroupLayout AccountsLayout = new javax.swing.GroupLayout(Accounts);
        Accounts.setLayout(AccountsLayout);
        AccountsLayout.setHorizontalGroup(
            AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalProfiles)
                            .addComponent(jLabel49)
                            .addGroup(AccountsLayout.createSequentialGroup()
                                .addGap(0, 484, Short.MAX_VALUE)
                                .addComponent(jLabel61))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RemoveProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AccountsLayout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AccountsLayout.setVerticalGroup(
            AccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalProfiles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addContainerGap())
        );

        AdminFrames.addTab("tab2", Accounts);

        AdminPanel.add(AdminFrames, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -30, 600, 750));

        AdminSidePanel.setBackground(new java.awt.Color(255, 255, 255));
        AdminSidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AdminSidePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 67, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setText("Admin Panel");
        AdminSidePanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        AdminName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AdminName.setText("Ferdous Bin Hafiz ");
        AdminSidePanel.add(AdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 67, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel26.setText("Account Manager");
        AdminSidePanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 101, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel33.setText("Main Menu");
        AdminSidePanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 164, -1, -1));

        AllRequests.setBackground(new java.awt.Color(66, 103, 178));
        AllRequests.setForeground(new java.awt.Color(255, 255, 255));
        AllRequests.setText("Requests");
        AllRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllRequestsActionPerformed(evt);
            }
        });
        AdminSidePanel.add(AllRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 192, 219, 35));

        AllProfiles.setBackground(new java.awt.Color(66, 103, 178));
        AllProfiles.setForeground(new java.awt.Color(255, 255, 255));
        AllProfiles.setText("Accounts");
        AllProfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllProfilesActionPerformed(evt);
            }
        });
        AdminSidePanel.add(AllProfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 239, 219, 35));

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Log Out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        AdminSidePanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 219, 30));

        jLabel3.setText("Fake Bank");
        AdminSidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, -1));

        AdminPanel.add(AdminSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        MainPanel.add(AdminPanel, java.awt.BorderLayout.LINE_END);

        getContentPane().add(MainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void updateClientValues(){
        Client p = (Client)LoggedInProfile;
        ClientName1.setText(p.getUsername());
        ClientName2.setText(p.getUsername());
        ClientName3.setText(p.getUsername());
        ClientName4.setText(p.getUsername());
        
        ClientBalance.setText(p.getBalance() + " BDT");
        
        ClientBalance1.setText("Current Balance: "+ p.getBalance() + " BDT");
        ClientBalance2.setText("Current Balance: "+ p.getBalance() + " BDT");
        ClientBalance3.setText("Current Balance: "+ p.getBalance() + " BDT");
        
        ClientLoan1.setText("Pending Loan: " + p.getLoan() + " BDT");
        ClientLoan2.setText("Pending Loan: " + p.getLoan() + " BDT");
        ClientLoan3.setText("Pending Loan: " + p.getLoan() + " BDT");
        
        TransactionDate1.setText("");
        TransactionDate2.setText("");
        TransactionDate3.setText("");
        
        Transaction1.setText("");
        Transaction2.setText("");
        Transaction3.setText("");
        javax.swing.JLabel T[] = {Transaction1, Transaction2, Transaction3};
        javax.swing.JLabel D[] = {TransactionDate1, TransactionDate2, TransactionDate3};
        
        ArrayList<Transaction> Transactions = p.getTransactions();
        int i;
        for(i=0; i<Math.min(3, Transactions.size()); i++){
            Transaction v = Transactions.get(i);
            T[i].setText(v.getAmount() + " BDT - "+v.getType());
            D[i].setText("11/09/2001");
        }
        
        LastDeposit.setText("");
        LastDepositDate.setText("");
        for(Transaction v : Transactions){
            if("Deposit".equals(v.getType())){
                LastDeposit.setText(v.getAmount()+" BDT");
                LastDepositDate.setText("11/09/2001");
                break;
            }
        }
        
        LastWithdraw.setText("");
        LastWithdrawDate.setText("");
        for(Transaction v : Transactions){
            if("Withdraw".equals(v.getType())){
                LastWithdraw.setText(v.getAmount()+" BDT");
                LastWithdrawDate.setText("11/09/2001");
                break;
            }
        }
        
        LastLoan.setText("");
        LastLoanDate.setText("");
        for(Transaction v : Transactions){
            if("Loan".equals(v.getType())){
                LastLoan.setText(v.getAmount()+" BDT");
                LastLoanDate.setText("11/09/2001");
                break;
            }
        }
    }
    public void updateAdminValues(){
        AdminName.setText(LoggedInProfile.getUsername());
    }
    void clearClientFrames(){
        DepositAmount.setText("Enter Amount...");
        WithdrawAmount.setText("Enter Amount...");
        LoanAmount.setText("Enter Amount...");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearClientFrames();
        ClientFrames.setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         clearClientFrames();
        ClientFrames.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
       clearClientFrames();
       ClientFrames.setSelectedIndex(0);
       ClientPanel.setVisible(false);
       LoginPanel.setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         clearClientFrames();
        ClientFrames.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DepositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositAmountActionPerformed

    private void WithdrawAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WithdrawAmountActionPerformed

    private void LoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanAmountActionPerformed

    private void FirstNameSignUpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstNameSignUpFocusGained
        if (FirstNameSignUp.getText().equals("First name...")) {
            FirstNameSignUp.setText("");
            FirstNameSignUp.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_FirstNameSignUpFocusGained

    private void FirstNameSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstNameSignUpFocusLost
        if (FirstNameSignUp.getText().equals("")) {
            FirstNameSignUp.setText("First name...");
            FirstNameSignUp.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_FirstNameSignUpFocusLost

    private void FirstNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameSignUpActionPerformed

    private void LastNameSignUpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastNameSignUpFocusGained
        if (LastNameSignUp.getText().equals("Last name...")) {
            LastNameSignUp.setText("");
            LastNameSignUp.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_LastNameSignUpFocusGained

    private void LastNameSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastNameSignUpFocusLost
        if (LastNameSignUp.getText().equals("")) {
            LastNameSignUp.setText("Last name...");
            LastNameSignUp.setForeground(new Color(51,51,51));
        }           // TODO add your handling code here:
    }//GEN-LAST:event_LastNameSignUpFocusLost

    private void EmailSignUpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailSignUpFocusGained
        if (EmailSignUp.getText().equals("Email address...")) {
            EmailSignUp.setText("");
            EmailSignUp.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_EmailSignUpFocusGained

    private void EmailSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailSignUpFocusLost
        if (EmailSignUp.getText().equals("")) {
            EmailSignUp.setText("Email address...");
            EmailSignUp.setForeground(new Color(51,51,51));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_EmailSignUpFocusLost

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        if (FirstNameSignUp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Insert first name");
            return;
        }
        
        if (LastNameSignUp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Insert last name");
            return;
        }
        
        if (EmailSignUp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter email");
            return;
        }
        
        if (PasswordSignUp.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter password");
            return;
        }
        
        if (PasswordSignUp.getText().length()<8){
            JOptionPane.showMessageDialog(this, "Password must be at least 8 digit");
            return;
        }
        
        if (!MaleSignUp.isSelected() && !FemaleSignUp.isSelected() && !OtherSignUp.isSelected()){
            JOptionPane.showMessageDialog(this, "Select gender");
            return;
        }
        
        if (!AgreeTerms.isSelected()){
            JOptionPane.showMessageDialog(this, "You must agree to the terms and conditions");
            return;
        }
        
        for(Profile p:Profile.Profiles){
            if(p.getUsername().equals(EmailSignUp.getText())){
                JOptionPane.showMessageDialog(this, "This email is already in use");
                return;
            }
        }
        String username, email, password, gender;
        
        username = FirstNameSignUp.getText() + " " + LastNameSignUp.getText();
        email = EmailSignUp.getText();
        password = PasswordSignUp.getText();
        gender = "?";
        if(MaleSignUp.isSelected()){
            gender = "Male";
        }else if(FemaleSignUp.isSelected()){
            gender = "Female";
        }else if(OtherSignUp.isSelected()){
            gender = "Other";
        }
        
        Client p = new Client(username, email, password, gender, 0, 0, 0);
        LoggedInProfile = p;
        clearSignUpPanel();
        updateClientValues();
        SignUpPanel.setVisible(false);
        ClientPanel.setVisible(true);
    }//GEN-LAST:event_SignUpButtonActionPerformed

    public void clearSignUpPanel(){
        FirstNameSignUp.setText("First name...");
        LastNameSignUp.setText("Last name...");
        EmailSignUp.setText("Email address...");
        PasswordSignUp.setText("New password...");
        MaleSignUp.setSelected(false);
        FemaleSignUp.setSelected(false);
        OtherSignUp.setSelected(false);
        AgreeTerms.setSelected(false);
    }
    
    private void GoToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToLoginActionPerformed
        clearSignUpPanel();
        LoginPanel.setVisible(true);
        SignUpPanel.setVisible(false);
    }//GEN-LAST:event_GoToLoginActionPerformed

    private void AgreeTermsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreeTermsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgreeTermsActionPerformed

    private void PasswordSignUpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordSignUpFocusGained
        if (PasswordSignUp.getText().equals("New password...")) {
            PasswordSignUp.setText("");
            PasswordSignUp.setForeground(new Color(51,51,51));
        }     
    }//GEN-LAST:event_PasswordSignUpFocusGained

    private void PasswordSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordSignUpFocusLost
        if (PasswordSignUp.getText().equals("")) {
            PasswordSignUp.setText("New password...");
            PasswordSignUp.setForeground(new Color(51,51,51));
        }           
    }//GEN-LAST:event_PasswordSignUpFocusLost

    private void LastNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameSignUpActionPerformed

    private void EmailSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailSignUpActionPerformed

    private void EmailLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailLoginFocusGained
        if (EmailLogin.getText().equals("Email address...")) {
            EmailLogin.setText("");
            EmailLogin.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_EmailLoginFocusGained

    private void EmailLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailLoginFocusLost
        if (EmailLogin.getText().equals("")) {
            EmailLogin.setText("Email address...");
            EmailLogin.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_EmailLoginFocusLost

    private void EmailLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailLoginActionPerformed

    }//GEN-LAST:event_EmailLoginActionPerformed

    private void PasswordLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordLoginFocusGained
        if (PasswordLogin.getText().equals("Password...")) {
            PasswordLogin.setText("");
            PasswordLogin.setForeground(new Color(51,51,51));
        }
    }//GEN-LAST:event_PasswordLoginFocusGained

    private void PasswordLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordLoginFocusLost
        if (PasswordLogin.getText().equals("")) {
            PasswordLogin.setText("Password...");
            PasswordLogin.setForeground(new Color(51,51,51));
        }            
    }//GEN-LAST:event_PasswordLoginFocusLost

    private void PasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordLoginActionPerformed
    
    public void clearLoginPanel(){
        EmailLogin.setText("Email address...");
        PasswordLogin.setText("Password..."); 
    }
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if (EmailLogin.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Insert email");
            return;
        }
        
        if (PasswordLogin.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter password");
            return;
        }
        
        for(Profile p:Profile.Profiles){
            if(p.getEmail().equals(EmailLogin.getText())){
               if(p.getPassword().equals(PasswordLogin.getText())){
                   LoggedInProfile = p;
                   clearLoginPanel();
                   LoginPanel.setVisible(false);
                   if(p instanceof Client){
                       updateClientValues();
                       ClientPanel.setVisible(true);
                       return;
                   }else if(p instanceof Admin){
                       updateAdminValues();
                       AdminFrames.setSelectedIndex(0);
                       refreshRequests();
                       AdminPanel.setVisible(true);
                       return;
                   }
                  
               }else{
                    JOptionPane.showMessageDialog(this, "Password does not match");     
                    return;
               }                  
            }
        }
        JOptionPane.showMessageDialog(this, "Profile with given email does not exist");  
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void GoToSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToSignUpActionPerformed
        clearLoginPanel();
        LoginPanel.setVisible(false);
        SignUpPanel.setVisible(true);
    }//GEN-LAST:event_GoToSignUpActionPerformed

    private void MaleSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleSignUpActionPerformed

    private void PasswordSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordSignUpActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         clearClientFrames();
        ClientFrames.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         clearClientFrames();
        ClientFrames.setSelectedIndex(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         clearClientFrames();
        ClientFrames.setSelectedIndex(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void DepositAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DepositAmountFocusGained
        if(DepositAmount.getText().equals("Enter Amount...")){
            DepositAmount.setText("");
        }
    }//GEN-LAST:event_DepositAmountFocusGained

    private void DepositAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DepositAmountFocusLost
        if(DepositAmount.getText().equals("")){
            DepositAmount.setText("Enter Amount...");
        }
    }//GEN-LAST:event_DepositAmountFocusLost

    private void WithdrawAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WithdrawAmountFocusGained
        if(WithdrawAmount.getText().equals("Enter Amount...")){
            WithdrawAmount.setText("");
        }
    }//GEN-LAST:event_WithdrawAmountFocusGained

    private void WithdrawAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WithdrawAmountFocusLost
        if(WithdrawAmount.getText().equals("")){
            WithdrawAmount.setText("Enter Amount...");
        }
    }//GEN-LAST:event_WithdrawAmountFocusLost

    private void LoanAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanAmountFocusGained
        if(LoanAmount.getText().equals("Enter Amount...")){
            LoanAmount.setText("");
        }
    }//GEN-LAST:event_LoanAmountFocusGained

    private void LoanAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoanAmountFocusLost
         if(LoanAmount.getText().equals("")){
            LoanAmount.setText("Enter Amount...");
        }
    }//GEN-LAST:event_LoanAmountFocusLost

    private void DepositProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositProceedActionPerformed
        if(DepositAmount.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter Amount");
            return;
        }
        int Amount;
        try{
            Amount = Integer.parseInt(DepositAmount.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid Amount");
            return;
        } 
        if(Amount<=0){
            JOptionPane.showMessageDialog(this, "Invalid Amount");
            return;
        }
        ((Client)LoggedInProfile).deposit(Amount);
        updateClientValues();
        JOptionPane.showMessageDialog(this, "Deposit Complete");
    }//GEN-LAST:event_DepositProceedActionPerformed

    private void WithdrawProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawProceedActionPerformed
        if(WithdrawAmount.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter Amount");
            return;
        }
        int Amount;
        try{
            Amount = Integer.parseInt(WithdrawAmount.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid Amount");
            return;
        } 
        if(Amount<=0){JOptionPane.showMessageDialog(this, "Invalid Amount"); return;}
        if(Amount>((Client)LoggedInProfile).getBalance()){JOptionPane.showMessageDialog(this, "Insufficient Balance"); return;}
        ((Client)LoggedInProfile).withdraw(Amount);
        updateClientValues();
        JOptionPane.showMessageDialog(this, "Deposit Complete");
    }//GEN-LAST:event_WithdrawProceedActionPerformed

    private void LoanProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanProceedActionPerformed
        if(LoanAmount.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter Amount");
            return;
        }
        int Amount;
        try{
            Amount = Integer.parseInt(LoanAmount.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid Amount");
            return;
        } 
        if(Amount>0){
            if(Amount + ((Client)LoggedInProfile).getLoan()>5000){
            int result = JOptionPane.showConfirmDialog(this, "[Maximum Loan is 5000]\nWould you like to request for a larger loan?", "Loan Request", JOptionPane.YES_NO_OPTION);
            if(result == 0){
                ((Client)LoggedInProfile).setRequestedLoan(Amount);
                Admin.LoanRequests.add((Client)LoggedInProfile);
                JOptionPane.showMessageDialog(this, "Loan Requested");
            }
            return;
        }
            ((Client)LoggedInProfile).borrow(Amount);
            updateClientValues();
            JOptionPane.showMessageDialog(this, "Loan Accepted");
        }else if(Amount<0){
            if(((Client)LoggedInProfile).getLoan()< Amount*-1){
                JOptionPane.showMessageDialog(this, "Amount greater than pending loan");
                return;
            }
            ((Client)LoggedInProfile).repayLoan(Amount*-1);
            JOptionPane.showMessageDialog(this, "Loan paid");
        }else{
            JOptionPane.showMessageDialog(this, "Invalid Amount");
        }
        
    }//GEN-LAST:event_LoanProceedActionPerformed

    private void RejectRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectRequestActionPerformed
        int r[] = AllRequestTable.getSelectedRows();
        Admin admin = (Admin)LoggedInProfile;
        ArrayList<Client> list = admin.getLoanRequests();
        for(int i: r){
            admin.rejectLoan(list.get(i));
        }
        refreshRequests();
    }//GEN-LAST:event_RejectRequestActionPerformed

    private void RemoveProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveProfileActionPerformed
         int r[] = AllProfileTable.getSelectedRows();
         if(r.length>1){
             JOptionPane.showMessageDialog(this, "Multiple selection detected"); 
             return;
         }else if(r.length == 0){
             JOptionPane.showMessageDialog(this, "No selection detected"); 
             return;
         }
         
         Admin admin = (Admin)LoggedInProfile;
         Profile p = Profile.Profiles.get(r[0]);
         if(p instanceof Admin){
            JOptionPane.showMessageDialog(this, "Selected profile is an admin profile");  
            return;
         }
         int result = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
         if(result==0){
            admin.removeProfile((Client)p);
            refreshProfiles();
         } 
    }//GEN-LAST:event_RemoveProfileActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        AdminPanel.setVisible(false);
        LoginPanel.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    public void refreshRequests(){
        DefaultTableModel dtm = (DefaultTableModel)AllRequestTable.getModel();
        dtm.setRowCount(0);
        Object r[] = new Object[4];
        Admin a = (Admin)LoggedInProfile;
        
        for(Profile p: a.getLoanRequests()){
            r[0] = p.getUsername();
            if (p instanceof Client c){
                r[1] = c.getBalance();
                r[2] = c.getLoan();
                r[3] = c.getRequestedLoan(); 
            } 
            dtm.addRow(r);
        }
        PendingRequests.setText("Pending Requests: " + ((Admin)LoggedInProfile).getLoanRequests().size());
    }
    
    public void refreshProfiles(){
        DefaultTableModel dtm = (DefaultTableModel)AllProfileTable.getModel();
        dtm.setRowCount(0);
        Object r[] = new Object[4];
        for(Profile p: Profile.Profiles){
            r[0] = p.getUsername();
            if (p instanceof Client c){
                r[1] = c.getBalance();
                r[2] = c.getLoan();
                r[3] = c.getRequestedLoan(); 
            }else if(p instanceof Admin){
                r[1] = "[Admin]";
                r[2] = "";
                r[3] = "";
            }     
            dtm.addRow(r);
        }
        TotalProfiles.setText("Total Profiles: "+ Profile.Profiles.size());
    }
    
    private void AllRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllRequestsActionPerformed
        refreshRequests();
        AdminFrames.setSelectedIndex(0);
    }//GEN-LAST:event_AllRequestsActionPerformed

    private void AllProfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllProfilesActionPerformed
        refreshProfiles();
        AdminFrames.setSelectedIndex(1);
    }//GEN-LAST:event_AllProfilesActionPerformed

    private void AcceptRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptRequestActionPerformed
        int r[] = AllRequestTable.getSelectedRows();
        Admin admin = (Admin)LoggedInProfile;
        ArrayList<Client> list = admin.getLoanRequests();
        for(int i: r){
            admin.acceptLoan(list.get(i));
        }
        refreshRequests();
    }//GEN-LAST:event_AcceptRequestActionPerformed

    Profile LoggedInProfile = null;
    public void initializeUIStartUp(){
        LoginPanel.setVisible(true);
        SignUpPanel.setVisible(false);
        ClientPanel.setVisible(false);
        AdminPanel.setVisible(false);
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserInterface UI = new UserInterface();
                UI.setVisible(true);
                UI.initializeUIStartUp();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptRequest;
    private javax.swing.JPanel Accounts;
    private javax.swing.JTabbedPane AdminFrames;
    private javax.swing.JLabel AdminName;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel AdminSidePanel;
    private javax.swing.JCheckBox AgreeTerms;
    private javax.swing.JTable AllProfileTable;
    private javax.swing.JButton AllProfiles;
    private javax.swing.JTable AllRequestTable;
    private javax.swing.JButton AllRequests;
    private javax.swing.JLabel ClientBalance;
    private javax.swing.JLabel ClientBalance1;
    private javax.swing.JLabel ClientBalance2;
    private javax.swing.JLabel ClientBalance3;
    private javax.swing.JPanel ClientDashboard;
    private javax.swing.JTabbedPane ClientFrames;
    private javax.swing.JLabel ClientLoan1;
    private javax.swing.JLabel ClientLoan2;
    private javax.swing.JLabel ClientLoan3;
    private javax.swing.JLabel ClientName1;
    private javax.swing.JLabel ClientName2;
    private javax.swing.JLabel ClientName3;
    private javax.swing.JLabel ClientName4;
    private javax.swing.JPanel ClientPanel;
    private javax.swing.JPanel Deposit;
    private javax.swing.JTextField DepositAmount;
    private javax.swing.JButton DepositProceed;
    private javax.swing.JTextField EmailLogin;
    private javax.swing.JTextField EmailSignUp;
    private javax.swing.JRadioButton FemaleSignUp;
    private javax.swing.JTextField FirstNameSignUp;
    private javax.swing.JButton GoToLogin;
    private javax.swing.JButton GoToSignUp;
    private javax.swing.JLabel LastDeposit;
    private javax.swing.JLabel LastDepositDate;
    private javax.swing.JLabel LastLoan;
    private javax.swing.JLabel LastLoanDate;
    private javax.swing.JTextField LastNameSignUp;
    private javax.swing.JLabel LastWithdraw;
    private javax.swing.JLabel LastWithdrawDate;
    private javax.swing.JTextField LoanAmount;
    private javax.swing.JPanel LoanClient;
    private javax.swing.JButton LoanProceed;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JRadioButton MaleSignUp;
    private javax.swing.JRadioButton OtherSignUp;
    private javax.swing.JTextField PasswordLogin;
    private javax.swing.JTextField PasswordSignUp;
    private javax.swing.JLabel PendingRequests;
    private javax.swing.JButton RejectRequest;
    private javax.swing.JButton RemoveProfile;
    private javax.swing.JPanel Requests;
    private javax.swing.JButton SignUpButton;
    private javax.swing.ButtonGroup SignUpGender;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JLabel TotalProfiles;
    private javax.swing.JLabel Transaction1;
    private javax.swing.JLabel Transaction2;
    private javax.swing.JLabel Transaction3;
    private javax.swing.JLabel TransactionDate1;
    private javax.swing.JLabel TransactionDate2;
    private javax.swing.JLabel TransactionDate3;
    private javax.swing.JPanel Transactions;
    private javax.swing.JPanel Withdraw;
    private javax.swing.JTextField WithdrawAmount;
    private javax.swing.JButton WithdrawProceed;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
