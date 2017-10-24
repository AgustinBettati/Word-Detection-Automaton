package dictionary;

import java.io.*;

/**
 * @author Gonzalo de Achaval
 */
public class DictionaryUtil {

    private RWayTrieMap trieMap;

    public DictionaryUtil() throws IOException {
        this.trieMap = buildTrie();
    }

    private RWayTrieMap buildTrie() throws IOException {
        RWayTrieMap trieMap = new RWayTrieMap();
        InputStream input = getClass().getResourceAsStream("/dictionary/dictionary.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(input, "UTF-8"));
        String word;

        while((word = bf.readLine()) != null){
            trieMap.put(word);
        }
        return trieMap;
    }

    public boolean checkIfWordExists(String word) {
        return trieMap.containsKey(word);
    }
}
