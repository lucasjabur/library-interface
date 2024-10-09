import javax.swing.*;

public class VideoInterface extends LibraryMedia{

  protected JTextField videoTitle;
  protected JTextField authorName;
  protected JTextField durationField;

  public VideoInterface(Library library) {
    super(library);
    createMainWindow();
  }

  @Override
  protected void setupInputPanels(JPanel centralPanel) {
    videoTitle = createInputPanel(centralPanel, "Título: ", 250);
    authorName = createInputPanel(centralPanel, "Autor: ", 250);
    durationField = createInputPanel(centralPanel, "Duração: ", 60);
  }

  @Override
  protected void setupBtnAction(JButton includeBtn, JButton fstMediaBtn, JButton sndMediaBtn, JButton listBtn) {
    includeBtn.addActionListener(e -> {
      String title = videoTitle.getText();
      String author = authorName.getText();
      String duration = durationField.getText();
      
      Video video = new Video(title, author, duration);

      library.addComponent(video);
      JOptionPane.showMessageDialog(frame, "Vídeo adicionado!");

      videoTitle.setText("");
      authorName.setText("");
      durationField.setText("");
    });

    fstMediaBtn.addActionListener(e -> new BookInterface(library));

    sndMediaBtn.addActionListener(e -> new MagazineInterface(library));

    listBtn.addActionListener(e -> new LibraryComponentsInterface(library));
  }

  @Override
  protected String getWindowTitle() {
    return "Vídeos";
  }

  @Override
  protected String getFstMediaButton() {
    return "Livros";
  }

  @Override
  protected String getSndMediaButton() {
    return "Revistas";
  }

}

