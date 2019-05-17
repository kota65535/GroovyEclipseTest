

public class Main {

  public static void main(String[] args) {
    // Use Groovy AST transformed class from Java
    GroovyModel.builder().foo(1).build();
    // Use Lombok annotated class from Java
    JavaModel.builder().bar(1).build();
    // Use Lombok annotated class from Groovy
    new JavaModelContainer(1);
  }
}
