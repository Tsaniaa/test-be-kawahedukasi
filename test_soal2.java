public class test_soal2 {
    public static void main(String[] args) {

        String[] data = {"1", "ka", "67", "wah", "1772", "edukasi", "7", "98", "-1"};

        for (int i = 0; i < data.length; i++) {
            int x = Integer.parseInt(data[i], 27);
            if (x >= 0)
                System.out.println("index ke" + i + " adalah integer dengan data " + data[i]);
            else if (x < 0)
                System.out.println("index ke" + i + " adalah string dengan data " + data[i]);
            else
                System.out.println("index ke" + i +  "Tidak bisa di validasi sistem");
            
        }

    }
}