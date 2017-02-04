package com.github.agadar.embassychecker;

import com.github.agadar.nationstates.enumerator.RegionTag;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * EmbassyCheckController form for this application.
 *
 * @author Agadar <https://github.com/Agadar/>
 */
public class EmbassyCheckForm extends javax.swing.JFrame {

    /**
     * The controller this form uses.
     */
    private final EmbassyCheckController controller;

    /**
     * Link to the software author's nation.
     */
    private final static String authorNationLink = "http://www.nationstates.net/nation=agadar";

    /**
     * Link to this software's repository.
     */
    private final static String repositoryLink = "https://github.com/Agadar/"
            + "NationStates-EmbassyChecker";

    /**
     * Creates new form EmbassyCheckerForm
     */
    public EmbassyCheckForm() {
        initComponents();
        controller = new EmbassyCheckController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnStart = new javax.swing.JButton();
        PanelCheckRmbActivity = new javax.swing.JPanel();
        ChkbxRmbActivity = new javax.swing.JCheckBox();
        SpinnerRmbActivity = new javax.swing.JSpinner();
        LblRmbActivity = new javax.swing.JLabel();
        PanelRegionAge = new javax.swing.JPanel();
        ChkbxRegionAge = new javax.swing.JCheckBox();
        SpinnerRegionAge = new javax.swing.JSpinner();
        LblRegionAge = new javax.swing.JLabel();
        PanelRegion = new javax.swing.JPanel();
        TxtFieldRegionName = new javax.swing.JTextField();
        PanelTags = new javax.swing.JPanel();
        ChkbxTags = new javax.swing.JCheckBox();
        LblTags = new javax.swing.JLabel();
        TxtFieldTags = new javax.swing.JTextField();
        PanelReport = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaReport = new javax.swing.JTextArea();
        PanelProgress = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        LabelNationLink = new javax.swing.JLabel();
        LabelGitHub = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agadar's NationStates Embassy Checker 1.1.0");
        setResizable(false);

        BtnStart.setText("Build report");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        PanelCheckRmbActivity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log regions with inactive messageboards", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        ChkbxRmbActivity.setSelected(true);
        ChkbxRmbActivity.setText("Enabled");
        ChkbxRmbActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkbxRmbActivityActionPerformed(evt);
            }
        });

        SpinnerRmbActivity.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(30), Integer.valueOf(1), null, Integer.valueOf(1)));

        LblRmbActivity.setText("Maximum days of no RMB posts:");

        javax.swing.GroupLayout PanelCheckRmbActivityLayout = new javax.swing.GroupLayout(PanelCheckRmbActivity);
        PanelCheckRmbActivity.setLayout(PanelCheckRmbActivityLayout);
        PanelCheckRmbActivityLayout.setHorizontalGroup(
            PanelCheckRmbActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCheckRmbActivityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCheckRmbActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCheckRmbActivityLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LblRmbActivity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerRmbActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChkbxRmbActivity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCheckRmbActivityLayout.setVerticalGroup(
            PanelCheckRmbActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCheckRmbActivityLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ChkbxRmbActivity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCheckRmbActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRmbActivity)
                    .addComponent(SpinnerRmbActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelRegionAge.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log regions younger than specified days", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        ChkbxRegionAge.setSelected(true);
        ChkbxRegionAge.setText("Enabled");
        ChkbxRegionAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkbxRegionAgeActionPerformed(evt);
            }
        });

        SpinnerRegionAge.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(90), Integer.valueOf(1), null, Integer.valueOf(1)));

        LblRegionAge.setText("Minimum age of region in days:");

        javax.swing.GroupLayout PanelRegionAgeLayout = new javax.swing.GroupLayout(PanelRegionAge);
        PanelRegionAge.setLayout(PanelRegionAgeLayout);
        PanelRegionAgeLayout.setHorizontalGroup(
            PanelRegionAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegionAgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegionAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegionAgeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LblRegionAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SpinnerRegionAge, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRegionAgeLayout.createSequentialGroup()
                        .addComponent(ChkbxRegionAge)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelRegionAgeLayout.setVerticalGroup(
            PanelRegionAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegionAgeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ChkbxRegionAge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegionAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRegionAge)
                    .addComponent(SpinnerRegionAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelRegion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Region whose embassy regions to report on", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        TxtFieldRegionName.setText("The Western Isles");

        javax.swing.GroupLayout PanelRegionLayout = new javax.swing.GroupLayout(PanelRegion);
        PanelRegion.setLayout(PanelRegionLayout);
        PanelRegionLayout.setHorizontalGroup(
            PanelRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtFieldRegionName)
                .addContainerGap())
        );
        PanelRegionLayout.setVerticalGroup(
            PanelRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtFieldRegionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTags.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log regions with specified tags", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        ChkbxTags.setSelected(true);
        ChkbxTags.setText("Enabled");
        ChkbxTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkbxTagsActionPerformed(evt);
            }
        });

        LblTags.setText("Tags:");

        TxtFieldTags.setText("Raider, Mercenary");

        javax.swing.GroupLayout PanelTagsLayout = new javax.swing.GroupLayout(PanelTags);
        PanelTags.setLayout(PanelTagsLayout);
        PanelTagsLayout.setHorizontalGroup(
            PanelTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTagsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTagsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LblTags)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtFieldTags))
                    .addGroup(PanelTagsLayout.createSequentialGroup()
                        .addComponent(ChkbxTags)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTagsLayout.setVerticalGroup(
            PanelTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTagsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ChkbxTags)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTags)
                    .addComponent(TxtFieldTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelReport.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report (copypaste to notepad for easier reading)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        TxtAreaReport.setColumns(20);
        TxtAreaReport.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        TxtAreaReport.setRows(5);
        jScrollPane1.setViewportView(TxtAreaReport);

        javax.swing.GroupLayout PanelReportLayout = new javax.swing.GroupLayout(PanelReport);
        PanelReport.setLayout(PanelReportLayout);
        PanelReportLayout.setHorizontalGroup(
            PanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelReportLayout.setVerticalGroup(
            PanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        PanelProgress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Progress", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        ProgressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProgressBar.setStringPainted(true);

        javax.swing.GroupLayout PanelProgressLayout = new javax.swing.GroupLayout(PanelProgress);
        PanelProgress.setLayout(PanelProgressLayout);
        PanelProgressLayout.setHorizontalGroup(
            PanelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProgressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelProgressLayout.setVerticalGroup(
            PanelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProgressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelNationLink.setText("<html>Created and maintained by <a href='/'>Agadar</a>.</html>");
        LabelNationLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelNationLinkMouseClicked(evt);
            }
        });

        LabelGitHub.setText("<html>Source code and downloads can be found at the <a href='/'>GitHub repository</a>.</html>");
        LabelGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelGitHubMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelTags, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelCheckRmbActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelRegionAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LabelNationLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelCheckRmbActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelRegionAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnStart)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNationLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Called when the checkbox for RMB activity is clicked. Toggles the
     * corresponding spinner.
     *
     * @param evt
     */
    private void ChkbxRmbActivityActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ChkbxRmbActivityActionPerformed
    {//GEN-HEADEREND:event_ChkbxRmbActivityActionPerformed
        SpinnerRmbActivity.setEnabled(ChkbxRmbActivity.isSelected());
        MaybeDisableBtnStart();
    }//GEN-LAST:event_ChkbxRmbActivityActionPerformed

    /**
     * Called when the checkbox for region age is clicked. Toggles the
     * corresponding spinner.
     *
     * @param evt
     */
    private void ChkbxRegionAgeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ChkbxRegionAgeActionPerformed
    {//GEN-HEADEREND:event_ChkbxRegionAgeActionPerformed
        SpinnerRegionAge.setEnabled(ChkbxRegionAge.isSelected());
        MaybeDisableBtnStart();
    }//GEN-LAST:event_ChkbxRegionAgeActionPerformed

    /**
     * Called when the checkbox for tags is clicked. Toggles the corresponding
     * textfield.
     *
     * @param evt
     */
    private void ChkbxTagsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ChkbxTagsActionPerformed
    {//GEN-HEADEREND:event_ChkbxTagsActionPerformed
        TxtFieldTags.setEditable(ChkbxTags.isSelected());
        MaybeDisableBtnStart();
    }//GEN-LAST:event_ChkbxTagsActionPerformed

    /**
     * Called when start button is clicked.
     *
     * @param evt
     */
    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnStartActionPerformed
    {//GEN-HEADEREND:event_BtnStartActionPerformed
        // Retrieve values from GUI
        final String mainRegionName = TxtFieldRegionName.getText();
        final boolean checkRmbActivity = ChkbxRmbActivity.isSelected();
        final int maxDaysSinceLastRmbMsg = (int) SpinnerRmbActivity.getValue();
        final boolean checkRegionFounded = ChkbxRegionAge.isSelected();
        final int minDaysSinceFounded = (int) SpinnerRegionAge.getValue();
        final boolean checkRegionTags = ChkbxTags.isSelected();
        final List<RegionTag> tags = new ArrayList<>();

        // Parse string tags to enum tags.
        for (String split1 : TxtFieldTags.getText().trim().split(",")) {
            try {
                tags.add(RegionTag.fromString(split1.trim()));
            } catch (IllegalArgumentException ex) {
                // Ignore invalid input.
            }
        }

        // Call the controller
        controller.startReporting(mainRegionName, checkRmbActivity,
                maxDaysSinceLastRmbMsg, checkRegionFounded,
                minDaysSinceFounded, checkRegionTags, tags.toArray(new RegionTag[tags.size()]));
    }//GEN-LAST:event_BtnStartActionPerformed

    /**
     * The credits link for the user. Opens the link.
     *
     * @param evt
     */
    private void LabelNationLinkMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_LabelNationLinkMouseClicked
    {//GEN-HEADEREND:event_LabelNationLinkMouseClicked
        tryOpenLink(authorNationLink);
    }//GEN-LAST:event_LabelNationLinkMouseClicked

    /**
     * The credits link for the repository. Opens the link.
     *
     * @param evt
     */
    private void LabelGitHubMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_LabelGitHubMouseClicked
    {//GEN-HEADEREND:event_LabelGitHubMouseClicked
        tryOpenLink(repositoryLink);
    }//GEN-LAST:event_LabelGitHubMouseClicked

    /**
     * Tries opening the given url in the desktop's default browser.
     *
     * @param url the url to browse to
     */
    private void tryOpenLink(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(EmbassyCheckForm.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Disables the start button if all three checkboxes are unchecked.
     */
    private void MaybeDisableBtnStart() {
        BtnStart.setEnabled(ChkbxRmbActivity.isSelected() || ChkbxTags.isSelected()
                || ChkbxRegionAge.isSelected());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // Just use the windows look and feel, because that's what we see in
            // the designer. This way, what we see is what we get.
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                new EmbassyCheckForm().setVisible(true);
            });
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException |
                UnsupportedLookAndFeelException ex) {
            Logger.getLogger(EmbassyCheckForm.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton BtnStart;
    protected javax.swing.JCheckBox ChkbxRegionAge;
    protected javax.swing.JCheckBox ChkbxRmbActivity;
    protected javax.swing.JCheckBox ChkbxTags;
    private javax.swing.JLabel LabelGitHub;
    private javax.swing.JLabel LabelNationLink;
    private javax.swing.JLabel LblRegionAge;
    private javax.swing.JLabel LblRmbActivity;
    private javax.swing.JLabel LblTags;
    private javax.swing.JPanel PanelCheckRmbActivity;
    protected javax.swing.JPanel PanelProgress;
    private javax.swing.JPanel PanelRegion;
    private javax.swing.JPanel PanelRegionAge;
    private javax.swing.JPanel PanelReport;
    private javax.swing.JPanel PanelTags;
    protected javax.swing.JProgressBar ProgressBar;
    protected javax.swing.JSpinner SpinnerRegionAge;
    protected javax.swing.JSpinner SpinnerRmbActivity;
    protected javax.swing.JTextArea TxtAreaReport;
    protected javax.swing.JTextField TxtFieldRegionName;
    protected javax.swing.JTextField TxtFieldTags;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
