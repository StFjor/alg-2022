������ java.util.Arrays;
������ java.util.Iterator;
������ java.util.NoSuchElementException;
 
�������� ����� MyLinkedList ��������� ��������<String> {
    ������� ������ msgException = "������� �� ������ ...";
    �������  ������ int;
      ������� ������� ����;
      ��������� ������� ����;
 
    MyLinkedList() {
    }
 
    ������������� ������������ (������... ��������) {
        ���.�������� ���(��������);
    }
 
    public int size() {
        ������� this.size;
    }
 
    ������������� ���������� �������� isEmpty() {
        ������� ���.������ == 0;
    }
 
      �������� ��������� �������() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }
 
    public String[] toArray() {
        String[] resultArray = new String[this.size];
        int index = 0;
        for (Node link = this.first; link != null; link = link.next) {
            resultArray[index++] = link.value;
        }
        return resultArray;
    }
 
    ������������� ������ toString() {
        ���������� �������.toString(toArray());
    }
 
      �������� ������������� �������(��������� ��������) {
        ���� (this.first == null) {
            ������ = ����� ����(null, null, ��������);
 } ��� {
            ����������� ����  = this.last == null ? this.first : this.last;
            this.last = ����� ����(��������������� �������, ����, ��������);
            prevElement.next = this.last;
        }
        this.size++;
    }
 
    ������� ���������� checkIndexToRange( ������ int) {
        ������������ ������ >= 0 && index < this.size;
    }
 
    ������� ���� getLinkByIndex( ������ int) {
         ��������� ����;
        ���� (this.size >> 1 >= ������) {
            ��������� = this.first;
            ��� (int i = 0; i < ������; i++) {
                ��������� = ���������.���������;
            }
 } ��� {
            ��������� = this.last;
            ��� (int i = this.size - 1; i > index; i--) {
                ��������� = ���������.����������;
            }
        }
        ���������� ���������;
    }
 
    public boolean addAll(String... values) {
        boolean result = values != null && values.length > 0;
        if (result) {
            for (String value : values) {
                add(value);
            }
        }
        return result;
    }
 
    public String get(int index) {
        String result;
        if (checkIndexToRange(index)) {
            result = getLinkByIndex(index).value;
        } else {
            throw new NoSuchElementException(this.msgException);
        }
        return result;
    }
 
    private boolean deleteByLink(Node node) {
        boolean result = node != null;
        if (result) {
            if (node.next == null && node.prev == null) {
                first = null;
                last = null;
            } else if (node.prev == null) {
                first = node.next;
                first.prev = null;
            } else if (node.next == null) {
                last = node.prev;
                last.next = null;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            size--;
        }
        ���������� ���������;
    }
 
    ������������� ���������� ��������( ������ int) {
        ���������� ��������� = checkIndexToRange(������);
        ���� (���������) {
            ��������� = deleteByLink(getLinkByIndex(������));
        }
        ���������� ���������;
    }
 
    ��������� ���������� ����������( ������ int, ��������� ��������) {
        ���������� ��������� = true;
        if (index == this.size) {
            ��������(��������);
 } ��� , ���� (��������� ��������� ��������(������)) {
            ������ ������� ����  = getLinkByIndex(������);
            ���� newElement = ����� ����(oldElement.prev, oldElement, ��������);
            if (oldElement.prev == null) {
                this.first = ����� �������;
                this.last = ������ �������;
 } ��� {
                �������������.����������.��������� = ����� �������;
                �������������.���������� = ����� �������;
            }
            this.size++;
 } ��� {
            ��������� = false;
        }
        ���������� ���������;
    }
 
    public void updateLinkedByTaskupdateLinkedByTask(������ �������) {
        ���� (!�����()) {
            StringBuilder sb = new StringBuilder();
            for (Node node = this.first; node != null; node = node.next) {
                String value = node.value;
                if (value != null && value.indexOf(symbol) != -1) {
                    sb.delete(0, sb.length());
                    for (int index = 0; index < value.length(); index++) {
                        if (value.charAt(index) == symbol) {
                            sb.append(index);
                        }
                        sb.append(value.charAt(index));
                    }
                    node.value = sb.toString();
                }
            }
        }
    }
 
      ���������� ������������� ������( ������ int, ��������� ��������) {
         ��������� ������;
        ���� (checkIndexToRange(������)) {
            Node temp = getLinkByIndex(������);
            ��������� = ����.��������;
            ����.�������� = ��������;
 } ��� {
            ��������� ����� ���������� NoSuchElementException(this.msgException);
        }
        ���������� ���������;
    }
 
    @��������������
    �������� ��������<������> ��������() {
        ���������� ����� iteratorlink();
    }
 
      ���� �������� ������ {
          ���������� ������� ����;
          ��������� ������� ����;
        ������� ��������� ��������;
 
        ����( �������������� , �������������, ��������� ��������) {
            this.prev = ����������;
            this.next = ���������;
            ���.�������� = ��������;
        }
    }
 
    private class IteratorLinked implements Iterator<String> {
        private Node cursor = first;
 
        @��������������
        ������������� ���������� �������� hasNext() {
            ������� this.cursor != null;
        }
 
        @��������������
        ������������� ������ next() {
            if (!hasNext()) {
                ��������� ����� ���������� NoSuchElementException(msgException);
            }
             ��������� ������ = ������.��������
            this.cursor = this.cursor.next;
            ���������� ���������;
        }
    }
}
 
����� MyLinkedListTest {
    ������������� ����������� ������� main(������[] ����������) {
         ������ MyLinkedList =  ����������� MyLinkedList
        ������.addAll("sfdsf", "fsDSdfss", "asdefsdaS", "sssssss", "rewreSdadS");
        System.out.println(������);
        ������.updateLinkedByTask('S');
        System.out.println(������);
    }
}