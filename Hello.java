public class Hello{
    public static void main(String[] args){
        filter();
        System.out.println("hello world");
    }

    // stream例
    public static void stream(){
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().forEach(System.out::println);
    }
    // 特定の要素を抽出
    public static void filter(){
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().filter(s -> s.equals("a")).forEach(System.out::println);
    }
    // 要素変換
    public static void map(){
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}