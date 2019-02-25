
public class Main {
    public static void main(String[] args) {
        JavaModel javaModel = new JavaModel();
        GroovyModel groovyModel = new GroovyModel();
        groovyModel.getName();
//        GroovyModelWithAST groovyModelWithAST = GroovyModelWithAST.builder()
//                .name("hoge")
//                .build();
        System.out.println(javaModel.getName());
//        System.out.println(groovyModelWithAST.getName());
    }
}
