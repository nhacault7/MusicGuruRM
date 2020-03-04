/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import io.Dialogs;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import tools.Images;

/**
 *
 * @author n.hacault
 */
public class mainUIController {

    private JLabel sheetMusicLabel;
    private JButton restartPlayback;
    private JToggleButton togglePlayback;
    private JButton uploadSheet;
    private JButton clearSheet;
    private MainUI userInterface;
    
    private Dialogs dialog = new Dialogs();
    private File file = null;
    
    mainUIController(JLabel sheetMusicLabel, JButton restartPlayback, 
            JToggleButton togglePlayback, JButton uploadSheet, 
            JButton clearSheet, MainUI userInterface) {
        
        this.sheetMusicLabel = sheetMusicLabel;
        this.restartPlayback = restartPlayback;
        this.togglePlayback = togglePlayback;
        this.uploadSheet = uploadSheet;
        this.clearSheet = clearSheet;
        this.userInterface = userInterface;
        
        userInterface.setSize(974,820);
        userInterface.setResizable(false);
        userInterface.setLocationRelativeTo(null);
        userInterface.setVisible(true);
    }

    void selectSheet() {
        file = dialog.openFile(userInterface);
        if (file != null) {
            String path = file.getAbsolutePath();
            Icon icon = new ImageIcon(path);
            sheetMusicLabel.setIcon(icon);
            Images.resizeToContainer(sheetMusicLabel);
        }
    }
    
}
