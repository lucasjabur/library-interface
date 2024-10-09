import javax.swing.*;

public class MagazineInterface extends LibraryMedia{

  protected JTextField magazineTitle;
  protected JTextField orgName;
  protected JTextField volField;
  protected JTextField numberField;
  protected JTextField yearField;

  public MagazineInterface(Library library) {
    super(library);
    createMainWindow();
  }

  @Override
  protected void setupInputPanels(JPanel centralPanel) {
    magazineTitle = createInputPanel(centralPanel, "Título: ", 250);
    orgName = createInputPanel(centralPanel, "Org.: ", 250);
    volField = createInputPanel(centralPanel, "Vol.: ", 60);
    numberField = createInputPanel(centralPanel, "Nro.: ", 60);
    yearField = createInputPanel(centralPanel, "Ano: ", 60);
  }

  @Override
  protected void setupBtnAction(JButton includeBtn, JButton fstMediaBtn, JButton sndMediaBtn, JButton listBtn) {
    includeBtn.addActionListener(e -> {
      String title = magazineTitle.getText();
      String org = orgName.getText();
      String vol = volField.getText();
      String number = numberField.getText();
      String year = yearField.getText();
      
      Magazine magazine = new Magazine(title, org, vol, number, year);

      library.addComponent(magazine);
      JOptionPane.showMessageDialog(frame, "Revista adicionada!");

      magazineTitle.setText("");
      orgName.setText("");
      volField.setText("");
      numberField.setText("");
      yearField.setText("");
    });

    fstMediaBtn.addActionListener(e -> new BookInterface(library));

    sndMediaBtn.addActionListener(e -> new VideoInterface(library));

    listBtn.addActionListener(e -> new LibraryComponentsInterface(library));
  }

  @Override
  protected String getWindowTitle() {
    return "Revistas";
  }

  @Override
  protected String getFstMediaButton() {
    return "Livros";
  }

  @Override
  protected String getSndMediaButton() {
    return "Vídeos";
  }

}
