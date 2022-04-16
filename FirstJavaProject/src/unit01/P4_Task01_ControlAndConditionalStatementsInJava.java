package unit01;

public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
        statements obj = new statements();
        obj.decisionMakingStatement();
        obj.loopStatement();
        obj.jumpStatement();

    }

}

class statements {
    void decisionMakingStatement() {
        System.out.println("Using Decision making");
        int x = 10;
        int y = 12;
        if (x + y < 10) {
            System.out.println("x+y less than  10");
        } else {
            System.out.println("x+y  greater than  10");
        }
        System.out.println("Using switch Case ");
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number is 1");
                break;
            default:
                System.out.println(num);
        }

    }

    void loopStatement() {
        // initialize,condition,updation
        // for loop

        System.out.println();
        System.out.println();
        System.out.println("Using Loop statements");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.print("Sum is: " + sum + " ");
        System.out.println();
        // while loop
        int i = 0;
        System.out.println("First 10 even number using while loop ");
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
        // do-while loop
        i = 0;
        System.out.println("First 10 even number using do-while loop ");
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 10);

    }

    void jumpStatement() {

        // break
        System.out.println();
        System.out.println();
        System.out.println("Using Jump statements");
        System.out.println("Printing numbers from 0, but break when 6 encounters ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 6)
                break;

        }
        System.out.println();
        System.out.println("Printing numbers from 0, but continue when 6 encounters till 10 ");
        /// continue
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 6)
                continue;

        }
    }
}