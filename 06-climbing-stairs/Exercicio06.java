public class Exercicio06 {

    public  int formasDeSubirEscada(int n){
        int[] fb = new int[n + 1];
        fb[0] = 1;
        fb[1] = 1;


        for (int i = 2; i <= n; i++) {
            fb[i] = fb[i-1] + fb[i-2];
        }
        return fb[n];
    }
}
