class Solution {
    public String[] findWords(String[] words) {
        
    int[] letterToRow = {
            2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3
        };
        
        List<String> validWords = new ArrayList<>();
        
        for (String word : words) {
            if (word.isEmpty()) continue;
            
            int targetRow = letterToRow[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean isValid = true;
            
            for (int i = 1; i < word.length(); i++) {
                if (letterToRow[Character.toLowerCase(word.charAt(i)) - 'a'] != targetRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                validWords.add(word);
            }
        }
        
        return validWords.toArray(new String[0]);
}
}