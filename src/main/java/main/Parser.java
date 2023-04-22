package main;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    private static final String HUNDRED = "hundred";
    private static final String THOUSAND = "thousand";
    private static final String MILLION = "million";
    private static final Map<String, Integer> units = new HashMap<>() {{
        put("zero", 0);
        put("one", 1);
        put("two", 2);
        put("three", 3);
        put("four", 4);
        put("five", 5);
        put("six", 6);
        put("seven", 7);
        put("eight", 8);
        put("nine", 9);
    }};
    private static final Map<String, Integer> teens = new HashMap<>() {{
        put("ten", 10);
        put("eleven", 11);
        put("twelve", 12);
        put("thirteen", 13);
        put("fourteen", 14);
        put("fifteen", 15);
        put("sixteen", 16);
        put("seventeen", 17);
        put("eighteen", 18);
        put("nineteen", 19);
    }};
    private static final Map<String, Integer> dozens = new HashMap<>() {{
        put("twenty", 20);
        put("thirty", 30);
        put("forty", 40);
        put("fifty", 50);
        put("sixty", 60);
        put("seventy", 70);
        put("eighty", 80);
        put("ninety", 90);
    }};

    public static int parseInt(String numStr) {
        int result = 0;
        numStr = numStr.replaceAll(" and ", " ");

        if (numStr.contains(MILLION)) {
            return 1000000;
        }

        if (numStr.contains(THOUSAND)) {
            result += parseThousands(numStr);
            numStr = cutOffThousandsPart(numStr);
        }

        if (numStr.contains(HUNDRED)) {
            result += parseHundreds(numStr);
            numStr = cutOffHundredsPart(numStr);
        }

        result += parseDozensWithUnits(numStr);

        return result;
    }

    private static String cutOffHundredsPart(String numStr) {
        return numStr.substring(numStr.indexOf(HUNDRED) + HUNDRED.length()).trim();
    }

    private static String cutOffThousandsPart(String numStr) {
        return numStr.substring(numStr.indexOf(THOUSAND) + THOUSAND.length()).trim();
    }

    private static int parseUnits(String numStr) {
        return units.get(numStr.trim());
    }

    private static int parseDozens(String numStr) {
        return dozens.get(numStr.trim());
    }

    private static int parseHundreds(String numStr) {
        String hundredStr = numStr.substring(0, numStr.indexOf(HUNDRED)).trim();
        if (hundredStr.trim().length() == 0) hundredStr = "one";
        return parseUnits(hundredStr.trim()) * 100;
    }

    private static int parseThousands(String numStr) {
        String thousandsString = numStr.substring(0, numStr.indexOf(THOUSAND));
        int thousandsCount = 0;
        if (thousandsString.contains(HUNDRED)) {
            thousandsCount = parseHundreds(thousandsString);
            thousandsString = cutOffHundredsPart(thousandsString);
        }

        thousandsCount += parseDozensWithUnits(thousandsString);
        return thousandsCount * 1000;
    }

    private static int parseDozensWithUnits(String string) {
        if (string.contains("-")) {
            String[] split = string.split("-");
            return parseDozens(split[0]) + parseUnits(split[1]);
        } else {
            string = string.trim();
            return units.get(string) != null ? units.get(string)
                    : teens.get(string) != null ? teens.get(string)
                    : dozens.get(string) != null ? dozens.get(string) : 0;
        }
    }
}