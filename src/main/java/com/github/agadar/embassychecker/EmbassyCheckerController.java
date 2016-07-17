package com.github.agadar.embassychecker;

import com.github.agadar.nsapi.NSAPI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * EmbassyCheckerController class for this program.
 * 
 * @author Agadar <https://github.com/Agadar/>
 */
public final class EmbassyCheckerController
{   
    /** The form to send updates to. */
    private final EmbassyCheckerForm Form;
    
    /** The user agent for this program. */
    private final static String UserAgent = "Agadar's Embassy Checker "
            + "(https://github.com/Agadar/NationStates-EmbassyChecker)";
    
    /**
     * Constructor, taking a form to communicate with. Also sets the User Agent.
     * 
     * @param form the form to communicate with
     */
    public EmbassyCheckerController(EmbassyCheckerForm form)
    {
        // Set User Agent.
        NSAPI.setUserAgent(UserAgent);
        
        // Set form.
        Form = form;
    }
    
    /**
     * Starts building a report. Called from the GUI.
     * 
     * @param mainRegionName
     * @param checkRmbActivity
     * @param maxDaysSinceLastRmbMsg
     * @param checkRegionFounded
     * @param minDaysSinceFounded
     * @param checkRegionTags
     * @param tagsToCheck 
     */
    public void startReporting(String mainRegionName, boolean checkRmbActivity, 
            int maxDaysSinceLastRmbMsg, boolean checkRegionFounded,
            int minDaysSinceFounded, boolean checkRegionTags,
            String[] tagsToCheck)
    {
        // Disable the GUI components, and clear the textarea.
        setComponentsEnabled(false);
        Form.TxtAreaReport.setText("");      
        EmbassyCheckQuery query;
        
        // Build a new query according to the supplied parameters.
        try
        {
            query = new EmbassyCheckQuery(mainRegionName);
            
            if (checkRmbActivity)
            {
                query = query.rmbActivity(maxDaysSinceLastRmbMsg);
            }
            if (checkRegionFounded)
            {
                query = query.minimumAge(minDaysSinceFounded);
            }
            if (checkRegionTags)
            {
                query = query.regionTags(tagsToCheck);
            }
        }
        catch (IllegalArgumentException ex)
        {
            // If an IllegalArgumentException is thrown, show it in a dialog and return.
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), 
                "An Error Occured", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Create a new thread, and execute the query within.
        final EmbassyCheckQuery fquery = query;       
        new Thread(() ->
        {
            try
            {
                // Execure query.
                String report = fquery.execute();
                
                // Print the report to the text area.
                SwingUtilities.invokeLater(() ->
                {
                    Form.TxtAreaReport.setText(report);
                });
            } 
            catch (IllegalArgumentException ex)
            {
                // If an IllegalArgumentException is thrown, show it in a dialog.
                SwingUtilities.invokeLater(() ->
                {
                    JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), 
                        "An Error Occured", JOptionPane.ERROR_MESSAGE);
                });               
            }
            finally
            {
                // Re-enable the GUI components.
                SwingUtilities.invokeLater(() ->
                {
                    setComponentsEnabled(true);
                }); 
            }
        }).start();
    }
    
    /**
     * Enables or disables all GUI components.
     * 
     * @param enabled 
     */
    public void setComponentsEnabled(boolean enabled)
    { 
        Form.TxtFieldRegionName.setEditable(enabled);
        Form.TxtAreaReport.setEditable(enabled);
        
        Form.ChkbxRegionAge.setEnabled(enabled);
        Form.ChkbxRmbActivity.setEnabled(enabled);
        Form.ChkbxTags.setEnabled(enabled);
        
        Form.BtnStart.setEnabled(enabled && (Form.ChkbxRegionAge.isSelected() 
            || Form.ChkbxRmbActivity.isSelected() || Form.ChkbxTags.isSelected()));
        
        Form.SpinnerRegionAge.setEnabled(enabled && Form.ChkbxRegionAge.isSelected());
        Form.SpinnerRmbActivity.setEnabled(enabled && Form.ChkbxRmbActivity.isSelected());
        
        Form.TxtFieldTags.setEditable(enabled && Form.ChkbxTags.isSelected());
    }
}