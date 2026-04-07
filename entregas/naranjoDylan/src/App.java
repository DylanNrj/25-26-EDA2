
public class App {

    public static void main(String[] args) {
        ejecutar(new String[]{"SEND", "MORE"}, "MONEY");
        ejecutar(new String[]{"FORTY", "TEN", "TEN"}, "SIXTY");
        ejecutar(new String[]{"ODD", "ODD"}, "EVEN");
    }

    private static void ejecutar(String[] sumandos, String resultado) {

        System.out.println("=================================");
        for (String s : sumandos) {
            System.out.println("  " + s);
        }
        System.out.println("--------");
        System.out.println("  " + resultado);

        Criptaritmo c = new Criptaritmo(sumandos, resultado);
        SolverCriptaritmo solver = new SolverCriptaritmo(c);
        ResultadoCriptaritmo res = solver.resolver();

        if (!res.tieneSolucion()) {
            System.out.println("No hay solución");
            return;
        }

        System.out.println("\nAsignación:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int v = res.getValor(ch);
            if (v != -1) {
                System.out.println(ch + " = " + v);
            }
        }
    }
}
