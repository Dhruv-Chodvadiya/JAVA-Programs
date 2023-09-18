public class printString {
    public static void main(String[] args) {
        String name="Dhruv"; // ( Variable ) String Letral -> stored in string pool
        System.out.println(name);

        String name1=new String("Dhruv"); // ( String object with the String constructor ) Using  new keyword -> stored in heap memory
        System.out.println(name1);

        char a='a'; // Character Variable
        System.out.println(a);

//        Character a2 = new Character('a'); Character object with the Character constructor

        char a1='a';
        System.out.println(a1);

        System.out.println(a==a1); // true -> ( == ) check address / shallow comparison
        System.out.println(name==name1); // false

        System.out.println(name.equals(name1)); // true -> ( .equals(); ) check values / deep comparison

    }
}
