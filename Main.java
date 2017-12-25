import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        for (int i = 0; i < n; i++) {
            String str = scn.nextLine();
            String[] data = str.split(" ");
            int img = data.length;
            int vals[] = new int[img];
            for (int j = 0; j < img; j++) {
                if (data[j].charAt(0) == 'C') {
                    vals[j] = 0;
                } else if (data[j].charAt(0) == 'D') {
                    vals[j] = 13;
                } else if (data[j].charAt(0) == 'H') {
                    vals[j] = 26;
                } else if (data[j].charAt(0) == 'S') {
                    vals[j] = 39;
                }
                vals[j] = vals[j] + Integer.parseInt(data[j].substring(1));
            }
            for (int j = 0; j < img; j++) {
                for (int k = j + 1; k < img; k++) {
                    if (vals[j] < vals[k]) {
                        int temp = vals[j];
                        vals[j] = vals[k];
                        vals[k] = temp;
                        String tmpStr = data[j];
                        data[j] = data[k];
                        data[k] = tmpStr;
                    }
                    System.out.println();
                }
            }
        }
    }
}
