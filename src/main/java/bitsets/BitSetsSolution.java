package bitsets;

//Given 2 BitSets, with a size of n where all bits in both BitSets are initialized to 0, perform a series of operations.
// After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
//Operations are given as a string array.

import java.util.BitSet;

public class BitSetsSolution {

    public String getSetBits(int bitSize, String[] operations) {
        BitSet[] bitSets = initBitSets(bitSize);
        StringBuilder sb = new StringBuilder();

        for (String operation : operations) {
            performOperations(bitSets, operation, sb);
        }
        return sb.toString();
    }

    private BitSet[] initBitSets(int size) {
        BitSet[] bitSets = new BitSet[3];
        bitSets[1] = new BitSet(size);
        bitSets[2] = new BitSet(size);
        return bitSets;
    }

    private void performOperations(BitSet[] bitSets, String operation, StringBuilder sb) {
        String[] input = operation.split(" ");
        String op = input[0];
        int num1 = Integer.parseInt(input[1]);
        int num2 = Integer.parseInt(input[2]);
        switch(op) {
            case "AND":
                bitSets[num1].and(bitSets[num2]);
                break;
            case "OR":
                bitSets[num1].or(bitSets[num2]);
                break;
            case "XOR":
                bitSets[num1].xor(bitSets[num2]);
                break;
            case "FLIP":
                bitSets[num1].flip(num2);
                break;
            case "SET":
                bitSets[num1].set(num2);
                break;
            default:
                throw new IllegalStateException("Unknown operation.");
        }
        sb.append(String.format("%d %d\n", bitSets[1].cardinality(), bitSets[2].cardinality()));
    }
}
