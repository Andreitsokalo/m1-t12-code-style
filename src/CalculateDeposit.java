import java.util.Scanner;

public class CalculateDeposit {

double calculateComplexPercent(double a, double y, int d ) {
       double pay = a * Math.pow((1 + y / 12), 12 * d);
          return calculation(pay, 2);
  }

  double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
         return calculation(amount + amount * yearRate * depositPeriod, 2);
    }

    double calculation(double value, int place) {
        double ScaLe = Math.pow(10, place);
        return Math.round(value * ScaLe) / ScaLe;
}

    void getSum() {
        int period;
        int action;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");

        int amount = sc.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = sc.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = sc.nextInt();

        double out = 0;

        if (action == 1) {
            out = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            out = calculateComplexPercent(amount, 0.06, period); }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }

public static void main(String[] args) {
        new CalculateDeposit().getSum();
}




}
