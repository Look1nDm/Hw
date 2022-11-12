import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Дан массив строк, необходимо удалить из него все дубли,
// оставшиеся строки объединить в одну в порядке следования в массиве.
public class Main {
    public static void main(String[] args) {
        String[] mass = {"Первый", "Второй", "Третий", "Четвертый", "Пятый", "Шестой", "Второй", "Четвертый"};
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (String s : mass) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        for (String s : list){
            stringBuilder.append(s);
        }
        System.out.println(stringBuilder);

        StringBuilder stringBuilder2 = new StringBuilder();
        Set<String> setList = new LinkedHashSet<>(Arrays.asList(mass));

        for (String s : setList) {
            stringBuilder2.append(s);
        }
        System.out.println(stringBuilder2);
    }
}