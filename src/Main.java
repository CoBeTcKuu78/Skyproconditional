public class Main {
    public static void main(String[] args) {
        /** // пример 1
         int age = 76;
         if (age >= 18 && age < 21) {
         System.out.println("Ты можешь водить машину, но не можешь пить алкоголь.");
         }
         if (age > 21) {
         System.out.println("Ты можешь водить машину и пить алкоголь.");
         }
         if (age < 7 || age >= 19) {
         System.out.println("Я думаю ты не ходишь в школу.");
         }
         if (age > 75) {
         System.out.println("Тебе можно пить алкоголь, но не стоит водить машину.");
         }
         if (age > 7 && age< 18){
         System.out.println("Ты ещё ходишь в школу.");
         }
         // пример 2
         boolean skyIsClear = true;
         if (skyIsClear) {
         System.out.println("Небо чистое");
         }
         // пример 3
         int age = 19;
         boolean CantGoToSchool = age > 7 && age > 18;
         if (age >= 18 && age < 21) {
         System.out.println("Ты можешь водить машину, но не можешь пить алкоголь.");
         }
         if (CantGoToSchool){
         System.out.println("Ты ещё ходишь в школу.");
         } */
        // пример 4
        int age = 21;
        if (age > 18) {
            System.out.println("Иди праздновать!");
            if (age < 21) {
                System.out.println("Выпей молока :)");
                } else {
                System.out.println("Можешь идти праздновать куда хочешь!");
            }
            } else if (age > 7) {
                    System.out.println("Иди в школу.");
                } else {
                    System.out.println("Иди в детский сад");
                }
            }
        }
