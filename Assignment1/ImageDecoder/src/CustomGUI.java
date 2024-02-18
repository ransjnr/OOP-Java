import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CustomGUI extends JFrame {

    private JLabel imageLabel;
    private JMenuBar menuBar;
    private JMenu fileMenu; 
    private JMenuItem saveMenuItem;
    private JButton zoomInButton;
    private JButton zoomOutButton; 
    private JLabel statusBar;
    
    public CustomGUI(String title, BufferedImage image) {

        super(title);

        // Menu Bar
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Buttons
        zoomInButton = new JButton("Zoom In");
        zoomOutButton = new JButton("Zoom Out");

        // Status Bar 
        statusBar = new JLabel(" 100%");

        // Image
        imageLabel = new JLabel(new ImageIcon(image));

        // Layout
        setLayout(new BorderLayout());        
        add(imageLabel, BorderLayout.CENTER);
        add(zoomInButton, BorderLayout.WEST);
        add(zoomOutButton, BorderLayout.EAST);
        add(statusBar, BorderLayout.SOUTH);

        // Listeners
        ButtonListener listener = new ButtonListener();
        zoomInButton.addActionListener(listener);  
        zoomOutButton.addActionListener(listener);
        
        imageLabel.addMouseListener(new MouseListener());
        
        setSize(500, 500);
        setVisible(true);

    }

 private class ButtonListener implements ActionListener {
    
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == zoomInButton) {
                // zoom in
                statusBar.setText("Zoom In Clicked");
            } else if (e.getSource() == zoomOutButton) {
                // zoom out
                statusBar.setText("Zoom Out Clicked");
            }
        }
    }

    private class MouseListener extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                // Double-clicked 
                statusBar.setText("Double-click detected");
            } else {
                // Single-clicked
                statusBar.setText("Single-click detected");
            }
        }
    }

        private void saveImage() {
            // Implement your save functionality here
            try {
                ImageIcon icon = (ImageIcon) imageLabel.getIcon();
                Image image = icon.getImage();
                
                BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                
                Graphics g = bufferedImage.createGraphics();
                g.drawImage(image, 0, 0, null);
                g.dispose();
                
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save Image");
                
                int userSelection = fileChooser.showSaveDialog(CustomGUI.this);
                
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    ImageIO.write(bufferedImage, "png", fileToSave);
                    statusBar.setText("Image saved as " + fileToSave.getAbsolutePath());
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                statusBar.setText("Error saving image");
            }
        }

}