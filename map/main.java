����� ru.tasks.map;

������������ javax.swing.*;
������ java.io.*;
������������ java.util.Arrays;
������������ java.util.HashMap;

  ������� ��������� ����� {

        ������������� ����������� ������� main(������[] ����������) {
            JFileChooser FileChooser = ����� JFileChooser();
            int fileIsOpen = FileChooser.ShowDialog(null, "�������");
            ���� (fileIsOpen == JFileChooser.APPROVE_OPTION) {
                System.out.println("��������� ����: " + fileChooser.getSelectedFile());
                System.out.println("���������...");
                try {
                    File openedFile = fileChooser.getSelectedFile();
                    Reader reader = new FileReader(openedFile);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    HashMap<String, Long> hashMap = new HashMap<>();
                    LogParser logParser;
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        logParser = new LogParser(line);
                        if (!hashMap.containsKey(logParser.getClientIP())) {
                            hashMap.put(logParser.getClientIP(), logParser.getBytes());
                        } else {
                            hashMap.replace(logParser.getClientIP(),
                                    hashMap.get(logParser.getClientIP()) + logParser.getBytes());
                        }
                    }
                    bufferedReader.close();
                    HashMap<Long, String> topIP = new HashMap<>();
                    String[] keys = hashMap.keySet().toArray(new String[1]);
                    for (int i = 1; i < hashMap.size(); i++) {
                        topIP.put(hashMap.get(keys[i]), keys[i]);
                    }
                    Long[] topIPKeys = topIP.keySet().toArray(new Long[1]);
                    Arrays.sort(topIPKeys);
                    System.out.println("��� 10 �� �������:");
                    for (int i = topIPKeys.length - 1; i >= topIPKeys.length - 15; i--) {
                        System.out.println("IP: " + topIP.get(topIPKeys[i]));
                        System.out.println("������ (����): " + topIPKeys[i]);
                        System.out.println();
                    }
                    System.out.println("�������� ���� ��� ���������� �����:");
                    fileIsOpen = FileChooser.ShowDialog(null, "���������");
                    ���� (fileIsOpen == JFileChooser.APPROVE_OPTION) {
                        System.out.println("��������� ����: " + fileChooser.getSelectedFile());
                        ����������� ����  = FileChooser.getSelectedFile();
                        �������� �������� = ����� �������� ��������(����������� ����);
                        BufferedWriter BufferedWriter = ����� BufferedWriter(��������);
                        ��� (int i = topIPKeys.length - 1; i >= topIPKeys.length - 15; �--) {
                            BufferedWriter.write("IP: " + topIP.get(topIPKeys[i]) + "\n");
                            bufferedWriter.write("������ (����): " + topIPKeys[i] + "\n");
                            BufferedWriter.����� ������();
                        }
                        BufferedWriter.close();
 } ��� {
                        System.out.println("���� �� ������");
                    }
 } catch (���������� IOException e) {
                    e.printStackTrace();
                }
 } ��� {
                System.out.println("���� �� ������");
            }
        }
    }
}