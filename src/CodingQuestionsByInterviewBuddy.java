import java.util.*;
import java.util.stream.Collectors;

public class CodingQuestionsByInterviewBuddy {
    public static void main(String[] args) {
        stream_secondHighestNumber(Arrays.asList(4,2,4,5,1,44,66,78,88));
        stream_secondHighestNumber(Arrays.asList(4));
        //twoSumCheck();
        //stringToPremitives();
        //System.out.println(subPatternCount_noOveralp("111","11"));
        //System.out.println(subPatternCount_withOveralp("111","11"));
        //System.out.println(subPatternCount_withOveralp("111",null));
        //System.out.println(checkPalindrom("madam"));
        //System.out.println(checkPalindrom("computer"));
        //removeWhiteSpaces("hi Raj Momula            Reddy");
        //printCharCount("hi Raj Momula Reddy");
    }

    private static void stream_secondHighestNumber(List<Integer> asList) {
        System.out.println(
        asList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow()
        );
    }

    private static void twoSumCheck() {
        int[] result = twoSum(new int[]{7, 4, 2, 6}, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static int[] twoSum(int[] intsAr, int target) {
        //Time Complexity (O(n)), max loop all the n element only once loop
        //Space Complexity (O(n)), max put all the n elements
        Map<Integer, Integer> elem =  new HashMap();
        for(int i=0; i<intsAr.length; i++) {
            int required = target - intsAr[i];
            if(elem.containsKey(required)){
                return new int[]{elem.get(required),i};
            }
            elem.put(intsAr[i],i);
        }
        return new int[]{-1,-1};
    }

    private static void stringToPremitives() {
        String intStr = "123";
        String longStr = "123123412341";
        String floatStr = "123.123";
        String doubltStr = "123.123123";

        int toInt = Integer.parseInt(intStr);
        long toLong = Long.parseLong(longStr);
        float toFloat = Float.parseFloat(floatStr);
        double toDouble = Double.parseDouble(doubltStr);
        System.out.println(toInt);
        System.out.println(toLong);
        System.out.println(toFloat);
        System.out.println(toDouble);

        //approach 2
        System.out.println("approach2 -------------");
        int toInt2 = Integer.valueOf(intStr);
        long toLong2 = Long.valueOf(longStr);
        float toFloat2 = Float.valueOf(floatStr);
        double toDouble2 = Double.valueOf(doubltStr);
        System.out.println(toInt2);
        System.out.println(toLong2);
        System.out.println(toFloat2);
        System.out.println(toDouble2);
    }

    private static int subPatternCount_noOveralp(String text, String pattern) {
        if (null == text || null == pattern || pattern.isEmpty()) {
            return 0;
        }
        int count =0;
        int index = 0;
        while (true) {
            int foundAt = text.indexOf(pattern, index);;
            if(foundAt == -1){
                break;
            }
            count ++;
            index = foundAt + pattern.length();
        }

        return count;
    }

    private static int subPatternCount_withOveralp(String text, String pattern) {
        if (null == text || null == pattern || pattern.isEmpty()) {
            return 0;
        }
        int count =0;
        for(int i=0; i<=text.length()-pattern.length(); i++){
            if(text.startsWith(pattern,i)){
                count ++;
            }
        }
        return count;
    }

    private static boolean checkPalindrom(String inputString) { //space complexity O(1) and time complexity O(n)
        if(null == inputString) {
            return false;
        }
        int lIndex = 0;
        int rIndex = inputString.length()-1;
        while(lIndex < rIndex) {
            if (inputString.charAt(lIndex) != inputString.charAt(rIndex)) {
                return false;
            }
            lIndex ++;
            rIndex --;
        }
        return true;
    }

    private static void removeWhiteSpaces(String inputString) {
        System.out.println(
                Arrays.stream(inputString.split(" "))
                        .collect(Collectors.joining())
        );

        System.out.println(
                inputString.replaceAll("\\s","")// works for all tabs and double spaces.
        );
    }
    private static void printCharCount(String inputString) {
        inputString.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .forEach((c,l)->System.out.println(c+" length is "+l));
    }

}
