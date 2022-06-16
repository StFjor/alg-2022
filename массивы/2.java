открытый класс ckala {
    импорт java.util.Scanner;

      скалолаз общественного класса {

        public static void main(Строка[] аргументов) {
             максимальная высота int;
            внутренняя высота;
            внутренняя длина маршрута;

            Сканер в = новый сканер(System.in);

            System.out.print("Введите максимальную высоту на которую может залезть скалолаз: ");
            maxHeight = in.nextInt();
            System.out.print("Введите максимальный перепад высоты: ");
            dropHeight = in.nextInt();
            System.out.print("Введите длину маршрута: ");
            lenghtOfRoute = in.nextInt();


            int[] rocks = новый int[Длинный маршрут];

            for (int i = 0; i < lenghtOfRoute; i++){
                камни[i] = (int) (Math.random() * (maxHeight + 1));
            }

            for (int i = 0; i <= (lenghtOfRoute - 1); i++)
                System.out.println(камни[i]);


            for (int i = 0; i < lenghtOfRoute; i++){
                если (i == (lenghtOfRoute - 1)){
                    перерыв;
                }
                если (камни[i] > камни[i+1]){
                    если ((камни[i]-камни[i+1]) > dropHeight){
                        int n = камни[i] - высота падения;
                        камни[i+1] = n;
                    }
                }
            }

            для (int j = lengthtofroute; j != 0; j--) {
                для (int i = 0; i < lenghtOfRoute; i++) {
                    если (i == (lenghtOfRoute - 1)) {
                        перерыв;
                    }
                    если (камни[i] <камни[i + 1]) {
                        если ((камни[i + 1] - камни[i]) > dropHeight) {
                            int n = камни[i + 1] - высота падения;
                            камни[i] = n;
                        }
                    }
                }
            }


            //Визуализация гор
            Строка[] rocksPic = новая строка[lenghtOfRoute];

            System.out.println("---Начало гор---");

            для (int i = 0; i < lenghtOfRoute; i++)
                rocksPic[i] = "*".повтор(rocks[i]);

            для (int i = 0; i < lenghtOfRoute; i++)
                System.out.println(rocksPic[i]);

            System.out.println("---Конец гор---");

        }

    }
}