import java.util.HashMap;

public class sentence {
    public static void main(String[] args) {
        String str = "there are so many beautiful flowers are there";
        String[] words = str.split(" ");

        HashMap<String, Integer> sentence = new HashMap<String, Integer>();

        for (String word : words) {
            if (sentence.containsKey(word)) {
                sentence.put(word, sentence.get(word) + 1);
            } else {
                sentence.put(word, 1);
            }
        }

        for (String word : sentence.keySet()) {
            System.out.println(word + " : " + sentence.get(word));
        }
    }
}


output:
    beautiful : 1
    flowers : 1
    are : 2
    there : 2
    so : 1
    many : 1
