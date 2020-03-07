package com.company.Lec12;

public class LexoPermute {
    public static void main(String[] args) {
        String str = "aab";
        int[] f = new int[26];
        freq(str, f);
        lexoPermute("",f,str.length());
    }

    public static void freq(String str, int[] f){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            f[ch - 'a']++;
        }
    }

    public static void lexoPermute(String proc, int[] f, int length){
        if (length == 0){
            System.out.print(proc + " ");
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (f[i] > 0){
                f[i]--;
                lexoPermute(proc+(char)(i+'a'), f, length-1);
                f[i]++;
            }
        }
    }
}
