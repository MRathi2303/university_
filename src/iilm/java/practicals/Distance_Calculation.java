package iilm.java.practicals;

public class Distance_Calculation {
    static class Distance {
        private final int feet1;
        private final int feet2;
        private final int inch1;
        private final int inch2;

        public Distance(int feet1, int feet2, int inch1, int inch2) {
            this.feet1 = feet1;
            this.feet2 = feet2;
            this.inch1 = inch1;
            this.inch2 = inch2;
        }

        public void showDistance() {
            System.out.printf("Distance 1: %d'%d\n", feet1, inch1);
            System.out.printf("Distance 2: %d'%d\n", feet2, inch2);
        }

        public void sumDistance() {
            int totalInches = inch1 + inch2 + (feet1 + feet2) * 12;
            System.out.printf("%d'%d\n", totalInches / 12, totalInches % 12);
        }
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(5, 5, 2, 5);
        d1.showDistance();
        d1.sumDistance();
    }
}
