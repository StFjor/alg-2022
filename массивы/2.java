�������� ����� ckala {
    ������ java.util.Scanner;

      �������� ������������� ������ {

        public static void main(������[] ����������) {
             ������������ ������ int;
            ���������� ������;
            ���������� ����� ��������;

            ������ � = ����� ������(System.in);

            System.out.print("������� ������������ ������ �� ������� ����� ������� ��������: ");
            maxHeight = in.nextInt();
            System.out.print("������� ������������ ������� ������: ");
            dropHeight = in.nextInt();
            System.out.print("������� ����� ��������: ");
            lenghtOfRoute = in.nextInt();


            int[] rocks = ����� int[������� �������];

            for (int i = 0; i < lenghtOfRoute; i++){
                �����[i] = (int) (Math.random() * (maxHeight + 1));
            }

            for (int i = 0; i <= (lenghtOfRoute - 1); i++)
                System.out.println(�����[i]);


            for (int i = 0; i < lenghtOfRoute; i++){
                ���� (i == (lenghtOfRoute - 1)){
                    �������;
                }
                ���� (�����[i] > �����[i+1]){
                    ���� ((�����[i]-�����[i+1]) > dropHeight){
                        int n = �����[i] - ������ �������;
                        �����[i+1] = n;
                    }
                }
            }

            ��� (int j = lengthtofroute; j != 0; j--) {
                ��� (int i = 0; i < lenghtOfRoute; i++) {
                    ���� (i == (lenghtOfRoute - 1)) {
                        �������;
                    }
                    ���� (�����[i] <�����[i + 1]) {
                        ���� ((�����[i + 1] - �����[i]) > dropHeight) {
                            int n = �����[i + 1] - ������ �������;
                            �����[i] = n;
                        }
                    }
                }
            }


            //������������ ���
            ������[] rocksPic = ����� ������[lenghtOfRoute];

            System.out.println("---������ ���---");

            ��� (int i = 0; i < lenghtOfRoute; i++)
                rocksPic[i] = "*".������(rocks[i]);

            ��� (int i = 0; i < lenghtOfRoute; i++)
                System.out.println(rocksPic[i]);

            System.out.println("---����� ���---");

        }

    }
}