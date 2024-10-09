import java.awt.BorderLayout;
import javax.swing.*;

public class LibraryComponentsInterface {

  private final Library library;

  public LibraryComponentsInterface(Library library) {
    this.library = library;
    createMainWindow();
  }

  private void createMainWindow() {
    JFrame frame = new JFrame("Listagem");
    frame.setSize(400, 220);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel listPanel = new JPanel();

    JTextArea textArea = new JTextArea();
    textArea.setEditable(false);

    for (Object component : library.getComponents()) {
      textArea.append(component.toString() + "\n");
    }

    JScrollPane scrollPane = new JScrollPane(textArea);
    listPanel.add(scrollPane, BorderLayout.CENTER);
    
    frame.add(listPanel);
    frame.setVisible(true);
  }
}
