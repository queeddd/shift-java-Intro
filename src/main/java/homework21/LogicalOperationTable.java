public class LogicalOperationTable {
    public static void main(String[] args) {


        System.out.println("P\tQ\tP AND Q\tP OR Q\tP XOR Q\tNOT P");

        System.out.println("false\tfalse\t" + (false && false) + "\t" + (false || false) + "\t" + (false ^ false) + "\t" + (!false));

        System.out.println("true\tfalse\t" + (true && false) + "\t" + (true || false) + "\t" + (true ^ false) + "\t" + (!true));

        System.out.println("false\ttrue\t" + (false && true) + "\t" + (false || true) + "\t" + (false ^ true) + "\t" + (!false));

        System.out.println("true\ttrue\t" + (true && true) + "\t" + (true || true) + "\t" + (true ^ true) + "\t" + (!true));
    }
}
