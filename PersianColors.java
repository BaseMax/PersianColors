import java.util.HashMap;
import java.util.Map;

class PersianColors {

    public static HashMap<String, String> colors = new HashMap<String, String>() {
        {
            put("red", "#c81d11");
            put("plum", "#701c1c");
            put("pink", "#f77fbe");
            put("rose", "#fe28a2");
            put("green", "#00a693");
            put("orange", "#d99058");
            put("indigo", "#32127a");
            put("blue", "#1c39bb");
            put("mediumBlue", "#0067a5");
        }
    };

    /**
     * Iterating through hashmap example.
     */
    private void iterateExample() {
        for (Map.Entry<String, String> m : colors.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    /**
     * Getting a color example.
     */
    private void getColorExample() {
        System.out.println(colors.get("red"));
    }
}