package kata;

import java.util.List;

public class App {

    public static final List<Tuple> CONVERSION_TABLE = List.of(
            new Tuple(1000, "M"),
            new Tuple(900, "CM"),
            new Tuple(500, "D"),
            new Tuple(400, "CD"),
            new Tuple(100, "C"),
            new Tuple(90, "XC"),
            new Tuple(50, "L"),
            new Tuple(40, "XL"),
            new Tuple(10, "X"),
            new Tuple(9, "IX"),
            new Tuple(5, "V"),
            new Tuple(4, "IV"),
            new Tuple(1, "I")
    );

    static String convertArabicToRoman(int number) {
        if (number == 0) return "";
        var tuple = findFirstApplicableConversion(number);

        return tuple.roman() + convertArabicToRoman(number - tuple.arabic());
    }

    private static Tuple findFirstApplicableConversion(int number) {
        return CONVERSION_TABLE.stream()
                .filter(t -> t.arabic() <= number)
                .findFirst()
                .orElse(new Tuple(0, ""));
    }
}
