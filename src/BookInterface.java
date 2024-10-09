import javax.swing.*;

public class BookInterface extends LibraryMedia{

  protected JTextField bookTitle;
  protected JTextField authorName;
  protected JTextField yearField;

  public BookInterface(Library library) {
    super(library);
    createMainWindow();
  }

  @Override
  protected void setupInputPanels(JPanel centralPanel) {
    bookTitle = createInputPanel(centralPanel, "Título: ", 250);
    authorName = createInputPanel(centralPanel, "Autor: ", 250);
    yearField = createInputPanel(centralPanel, "Ano: ", 60);
  }

  @Override
  protected void setupBtnAction(JButton includeBtn, JButton fstMediaBtn, JButton sndMediaBtn, JButton listBtn) {
    includeBtn.addActionListener(e -> {
      String title = bookTitle.getText();
      String author = authorName.getText();
      String year = yearField.getText();
      
      Book book = new Book(title, author, year);

      library.addComponent(book);
      JOptionPane.showMessageDialog(frame, "Livro adicionado!");

      bookTitle.setText("");
      authorName.setText("");
      yearField.setText("");
    });

    fstMediaBtn.addActionListener(e -> new MagazineInterface(library));

    sndMediaBtn.addActionListener(e -> new VideoInterface(library));

    listBtn.addActionListener(e -> new LibraryComponentsInterface(library));
  }

  @Override
  protected String getWindowTitle() {
    return "Livros";
  }

  @Override
  protected String getFstMediaButton() {
    return "Revistas";
  }

  @Override
  protected String getSndMediaButton() {
    return "Vídeos";
  }

}
