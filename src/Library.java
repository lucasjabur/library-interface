
import java.util.ArrayList;
import java.util.List;

public class Library {

  private final List<Object> libraryComponents;

  public Library() {
    libraryComponents = new ArrayList<>();
  }

  protected void addComponent(Object component) {
    libraryComponents.add(component);
  }

  protected List<Object> getComponents() {
    return libraryComponents;
  }
}
