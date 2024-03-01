public class SevenCardPoker {
    public static int getValue(Card[] h7) {
        Card[] h5 = new Card[5];
        for (int mask = 0; mask < (1 << 7); i++) {
            if (Integer.bitCount(mask) == 5) {
                h5 = getFive(mask, h7);
            }
        }
    }
    private static Card[] getFive(int mask, Card[] h7){
        Card[] h5 = new Card[5];
        int index = 0;
        for (int i = 0; i < 7; i++){
            if ((mask & (1<<i)) == 1){
                h5[index++] = h7[i];
            }
        }
        return h5;
    }
}


