public class Main {
    public static void main(String[] args){
        String[] testString= new String[]{"Кольт", "Амбер", "Биба", "Абоба", "Бебра"};
        int[] testValue=new int[]{228,1488,1337,34,777};
        hashtab a=new hashtab(10);
        a.put(1,testString[0]);
        a.put(2,testString[2]);
        a.put(3,testString[1]);
        a.put(4,testString[3]);
        a.put(5,testString[4]);
        a.put(6,testValue[0]);
        a.put(6,testValue[2]);
        a.put(90,testValue[1]);
        a.remove(2);
        System.out.println("Индекс выбранного элемента: "+a.getIndexForKey(5)+"\nХешированная таблица\n");
        a.printTable();
    }
}