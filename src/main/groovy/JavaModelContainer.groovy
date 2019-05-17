
class JavaModelContainer {

  JavaModel model

  JavaModelContainer(int bar) {
    model = JavaModel.builder().bar(bar).build()
  }
}
