package src.main.java.com.lawless.searchengine;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.nodes.Node;

public class termCounter {

    private Map<String, Integer> map;
    private String url;

    public TermCounter(String url) {
        this.url = url;
        map = new HashMap<>();
    }

    public getUrl() {
        return url;
    }

    private void processTree(Node root) {
        for (Node node : new WikiNodeIterable(root)) {
            if (node instanceof TextNode) {
                processText((TextNode) node.text());
            }
        }
    }

    private void process(String text) {
        String[] tokens = text.replace("\\pP", "").toLowerCase().split("\\s+");
        for (int i = 0; i < tokens.length; i++) {
            String term = tokens[i];
            incrementTermCount(term);
        }
    }

    private void incrementTermCount(String term) {
        Integer count = map.get(term);
        int cnt = count == null ? 0 : count;

        map.put(term, cnt);
    }
}
