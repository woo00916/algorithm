class MySolution {
    public String shiftingLetters(String S, int[] shifts) {
        //1.중복이 있으니까 뒤부터 하는 게 빠르겠다
        //2. shift[i]가 크니까 26으로 나눠서 하는 게 빠르겠다. 
        //3. S를 글자하나씩 봐야하니까 char배열로 바꿔야겠다
        
        char[] Sarr = S.toCharArray();
        
        shifts[shifts.length-1]=(shifts[shifts.length-1])%26;
        Sarr[shifts.length-1]=(char)(Sarr[shifts.length-1]+shifts[shifts.length-1]);
        if(Sarr[shifts.length-1]>122)
            Sarr[shifts.length-1]=(char)(Sarr[shifts.length-1]-26);
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]=(shifts[i]+shifts[i+1])%26;
            Sarr[i]=(char)(Sarr[i]+shifts[i]);
            if(Sarr[i]>122) Sarr[i]=(char)(Sarr[i]-26);
        }
        
        return String.valueOf(Sarr);
       // return Arrays.toString(shifts);
        
    }
}

//Sloution
class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        StringBuilder ans = new StringBuilder();
        int X = 0;
        for (int shift: shifts)
            X = (X + shift) % 26; // 변수 하나로 되네

        for (int i = 0; i < S.length(); ++i) {
            int index = S.charAt(i) - 'a';
            ans.append((char) ((index + X) % 26 + 97));
            X = Math.floorMod(X - shifts[i], 26);
        }

        return ans.toString();
    }
}
