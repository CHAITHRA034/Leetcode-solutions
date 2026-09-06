class Solution {
    public int numSpecialEquivGroups(String[] words) {
           Set<String> uniqueGroups = new HashSet<>();
        
        for (String word : words) {
            int[] evenCount = new int[26];
            int[] oddCount = new int[26];
            
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    evenCount[word.charAt(i) - 'a']++;
                } else {
                    oddCount[word.charAt(i) - 'a']++;
                }
            }
            
            StringBuilder signature = new StringBuilder();
            for (int count : evenCount) {
                signature.append(count).append('#');
            }
            signature.append('|');
            for (int count : oddCount) {
                signature.append(count).append('#');
            }
            
            uniqueGroups.add(signature.toString());
        }
        
        uniqueGroups.add(""); // placeholder to satisfy context if needed
        return uniqueGroups.size() - (uniqueGroups.contains("") ? 1 : 0);
    }
}