class Solution {
    public int mostWordsFound(String[] sentences) {
        int MaxWord=0;
        for(String sentence:sentences){
            int WordCount=sentence.split(" ").length;
            MaxWord=Math.max(MaxWord,WordCount);
        }
        return MaxWord;
    }
}