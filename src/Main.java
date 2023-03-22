public class Main {
    public static void main(String[] args) {
        double  A1 = 1.5,
                B2 = 3.5,
                C3 = 6.7;
        double y1 = 0.0,
                y2 = 0.0,
                y3 = 4.0;
        double a = Math.sqrt((A1 - B2) * (A1 - B2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((A1 - C3) * (A1 - C3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((B2 - C3) * (B2 - C3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c || a + c <= b || a + c <= b)
            System.out.println("Треугольник не существует");
        else
        {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь: " + square);
        }
    }
}
