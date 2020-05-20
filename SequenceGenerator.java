public class SequenceGenerator {
    public String [] getSequence () {
        return getSequence(6);
    }
    public String [] getSequence (int numberOfSeqMembers) {
        return getSequence("1",numberOfSeqMembers);
    }
    public String [] getSequence (String firstString, int numberOfSeqMembers) {
        String [] sequence = new String[numberOfSeqMembers];
        sequence [0] = firstString;

        for (int i = 0; i < numberOfSeqMembers - 1; i ++) {
            int numberOfSameChar = 0;
            String newStr = "";

            for (int j = 1; j < sequence[i].length(); j ++){
                numberOfSameChar++;

                if (sequence [i].charAt(j - 1) != sequence [i].charAt(j)) {
                    newStr += numberOfSameChar + "" + sequence [i].charAt(j - 1);
                    numberOfSameChar = 0;
                }
            }

            sequence [i + 1] = newStr + (numberOfSameChar + 1) + "" + sequence [i].charAt(sequence[i].length() - 1);
        }

        return sequence;
    }

}
