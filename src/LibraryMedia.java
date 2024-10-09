import java.awt.*;
import javax.swing.*;

public abstract class LibraryMedia {

  protected final Library library;
  protected JFrame frame;

  public LibraryMedia(Library library) {
    this.library = library;
  }

  protected JFrame createMainWindow() {
    frame = new JFrame("Controle de Material Bibliotecário");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,220);

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    frame.getContentPane().add(mainPanel);

    JLabel windowTitle = new JLabel(getWindowTitle());
    windowTitle.setHorizontalAlignment(JLabel.CENTER);
    mainPanel.add(windowTitle,BorderLayout.NORTH);
    
    createCentralPanel(mainPanel);

    return frame;
  }

  protected void createCentralPanel(JPanel mainPanel) {

    JPanel centralPanel = new JPanel();
    setupInputPanels(centralPanel);
    mainPanel.add(centralPanel,BorderLayout.CENTER);

    JPanel btnsPanel = new JPanel();
    btnsPanel.setLayout(new FlowLayout());

    JButton includeBtn = new JButton("Incluir");
    JButton fstMediaBtn = new JButton(getFstMediaButton());
    JButton sndMediaBtn = new JButton(getSndMediaButton());
    JButton listBtn = new JButton("Listagem");

    btnsPanel.add(includeBtn);
    btnsPanel.add(fstMediaBtn);
    btnsPanel.add(sndMediaBtn);
    btnsPanel.add(listBtn);

    mainPanel.add(btnsPanel, BorderLayout.SOUTH);

    setupBtnAction(includeBtn, fstMediaBtn, sndMediaBtn, listBtn);

    frame.setVisible(true);
  }

  protected JTextField createInputPanel(JPanel parentPanel, String labelValue, int fieldWidth) {
    JPanel inputPanel = new JPanel();
    inputPanel.setLayout(new FlowLayout()); 
    
    JLabel label = new JLabel(labelValue);
    JTextField textField = new JTextField();
    textField.setText("");
    textField.setOpaque(true);
    textField.setPreferredSize(new Dimension(fieldWidth, 25));    
    
    inputPanel.add(label);
    inputPanel.add(textField);

    parentPanel.add(inputPanel);

    return textField;

  }
  
  protected abstract void setupInputPanels(JPanel centralPanel);
  protected abstract void setupBtnAction(JButton includeBtn, JButton fstMediaBtn, JButton sndMediaBtn, JButton listBtn);
  protected abstract String getWindowTitle();
  protected abstract String getFstMediaButton();
  protected abstract String getSndMediaButton();

}
