package com.scotiabankcolpatria.hiring;

public class CreditRiskAssessment {

    public double standardDeviation(int[] paymentDelays) {

        class calculateSD2 {
            double sum = 0.0;
            double standardDeviation = 0.0;
            double mean = 0.0;
            double res = 0.0;
            double sq = 0.0;

            double SD()
            {
                int[] arr = paymentDelays;
                int n = arr.length;

                System.out.println("Elements are:");
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }

                for (int i = 0; i < n; i++) {
                    sum = sum + arr[i];
                }

                mean = sum / (n);

                for (int i = 0; i < n; i++) {

                    standardDeviation
                            = standardDeviation + Math.pow((arr[i] - mean), 2);

                }

                sq = standardDeviation / n;
                res = Math.sqrt(sq);
                return res;
            }
        }


        calculateSD2 calsd = new calculateSD2();
        double res = calsd.SD();
        System.out.format("Standard Deviation = %.6f", res);


        return res;
    }

    public int paymentDelayMaxPeakIndex(int[] paymentDelays) {
        int[] numeros = paymentDelays;
        // Asumir que el mayor es el primero
        int indiceDelMayor = 0;
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > numeros[indiceDelMayor]) {
                indiceDelMayor = x;
            }
        }
        // Ahora podemos obtener el mayor usando la posición
        int mayor = numeros[indiceDelMayor];
        System.out.println("El mayor es: " + mayor + " y se encuentra en el índice " + indiceDelMayor);

        return indiceDelMayor;
    }

    public double[] latePaymentProbabilityByPeriod(int[][] paymentDelays) {
        int[] numeros = new int[]{3,3,0,4};
        double media = 0.0;
        // Asumir que el mayor es el primero

        for (int i=0; i < numeros.length; i++) {
            media = media + numeros[i];
        }
        // Ahora podemos obtener el mayor usando la posición
        media = media / numeros.length;
        System.out.println("La probabilidad es: " + media);
        return null;
    }
}
