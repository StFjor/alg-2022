����� ru.tasks.map;

������������ java.util.regex.Matcher;
������ java.util.regex.Pattern;

���������� �������� ��������� ������ {
        ���� �����;
        ����������� �����������;
        ������ = Pattern.compile("\\ s\\ s\\ d{1,6} \\ s");
        ������������� = ������.�������������(������);
        � �� ����� ��� (matcher.find()) {
            ����������������� = Long.parseLong(����������.group().replace(" ", ""));
        }
        pattern = Pattern.compile("\\s\\d{6.2}\\s");
        matcher = pattern.matcher(line);
        while (matcher.find()) {
            bytes = Long.parseLong(matcher.group().replace(" ", ""));
        }
        pattern = Pattern.compile("^\\d{9}[.]\\d{4}\\s");
        matcher = pattern.matcher(line);
        while (matcher.find()) {
            time = (matcher.group().replace(" ", ""));
        }
        pattern = Pattern.compile("\\s\\d{2.3}[.]\\d{1,6}[.]\\d{1,5}[.]\\d{2.1}\\s");
        matcher = pattern.matcher(line);
        while (matcher.find()) {
            clientIP = matcher.group().replace(" ", "");
        }
        pattern = Pattern.compile("\\s\\D+[_]\\D+[/]\\d+\\s");
        matcher = pattern.matcher(line);
        while (matcher.find()) {
            resultCode = matcher.group().replace(" ", "");
        }
    }

    public void printInfo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("IP: " + clientIP);
        System.out.println("��������� �����: " + time);
        System.out.println("������������ ����������: " + duration);
        System.out.println("���: " + resultCode);
        System.out.println("������ (����): " + bytes);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public long getDuration() {
        return duration;
    }

    public long getBytes() {
        return bytes;
    }

    ������������� ������ getTime() {
         ����� ��������;
    }

    ������������� ������ getClientIP() {
        ������� �������;
    }

    ������������� ������ getResultCode() {
        ���������� ��� ����������;
    }

    ���� �������� ��������� ������� ( ����������) {
        ���.����������������� = �����������������;
    }

    ������������� ������ setBytes(������� �����) {
        this.����� = �����;
    }

     ����� ��������� ������������� �������( ����� ������) {
        ���.����� = �����;
    }

    public void setClientIP(������ ClientIP) {
        this.ClientIP = ClientIP;
    }

    public void setResultCode(��������� �������������� ���) {
        this.resultCode = ��� ����������;
    }
}
}