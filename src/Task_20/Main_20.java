/**
 * Дана строка, sсодержащая только символы '(', ')', '{', '}', '['и ']',
 * определите, является ли входная строка допустимой.
 * Входная строка действительна, если:
 * Открытые скобки должны быть закрыты скобками того же типа.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающейся скобке соответствует открывающаяся скобка того же типа.

 * Пример 1:
 * Ввод: s = "()"

 * Вывод: истина

 * Пример 2:

 * Ввод: s = "()[]{}"

 * Вывод: истина

 * Пример 3:

 * Ввод: s = "(]"

 * Вывод: ложь

 * Пример 4:

 * Ввод: s = "([])"

 * Вывод: истина
 *
 */

package Task_20;

import java.util.Scanner;

public class Main_20 {
    public static void main(String[] args) {
        System.out.println("Введите строку, string содержащую только символы '(', ')', '{', '}', '['и ']'");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(Solution_20.isValid(string));
    }
}
