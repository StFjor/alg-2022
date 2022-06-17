импорт java.util.Arrays;
импорт java.util.Iterator;
импорт java.util.NoSuchElementException;
 
открытый класс MyLinkedList реализует итерацию<String> {
    частная строка msgException = "Элемент не найден ...";
    частный  размер int;
      сначала частный узел;
      последний частный узел;
 
    MyLinkedList() {
    }
 
    общедоступный списокссылок (строка... значения) {
        это.добавить все(значения);
    }
 
    public int size() {
        верните this.size;
    }
 
    общедоступное логическое значение isEmpty() {
        верните это.размер == 0;
    }
 
      очистить публичную пустоту() {
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
 
    общедоступная строка toString() {
        возвращает массивы.toString(toArray());
    }
 
      добавить общедоступную пустоту(строковое значение) {
        если (this.first == null) {
            первый = новый узел(null, null, значение);
 } еще {
            Превелемент узла  = this.last == null ? this.first : this.last;
            this.last = новый узел(предварительный элемент, нуль, значение);
            prevElement.next = this.last;
        }
        this.size++;
    }
 
    частный логический checkIndexToRange( индекс int) {
        возвращаемый индекс >= 0 && index < this.size;
    }
 
    частный узел getLinkByIndex( индекс int) {
         Результат узла;
        если (this.size >> 1 >= индекс) {
            результат = this.first;
            для (int i = 0; i < индекс; i++) {
                результат = результат.следующий;
            }
 } еще {
            результат = this.last;
            для (int i = this.size - 1; i > index; i--) {
                результат = результат.предыдущий;
            }
        }
        возвращает результат;
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
        возвращает результат;
    }
 
    общедоступное логическое удаление( индекс int) {
        логический результат = checkIndexToRange(индекс);
        если (результат) {
            результат = deleteByLink(getLinkByIndex(индекс));
        }
        возвращает результат;
    }
 
    публичное логическое добавление( индекс int, строковое значение) {
        логический результат = true;
        if (index == this.size) {
            добавить(значение);
 } еще , если (проверить индексный диапазон(индекс)) {
            Старый элемент узла  = getLinkByIndex(индекс);
            Узел newElement = новый узел(oldElement.prev, oldElement, значение);
            if (oldElement.prev == null) {
                this.first = новый элемент;
                this.last = старый элемент;
 } еще {
                Старыйэлемент.предыдущий.следующий = новый элемент;
                Старыйэлемент.предыдущий = новый элемент;
            }
            this.size++;
 } еще {
            результат = false;
        }
        возвращает результат;
    }
 
    public void updateLinkedByTaskupdateLinkedByTask(символ символа) {
        если (!пусто()) {
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
 
      обновление общедоступной строки( индекс int, строковое значение) {
         Результат строки;
        если (checkIndexToRange(индекс)) {
            Node temp = getLinkByIndex(индекс);
            результат = темп.значение;
            темп.значение = значение;
 } еще {
            выбросить новое исключение NoSuchElementException(this.msgException);
        }
        возвращает результат;
    }
 
    @Переопределить
    открытый итератор<Строка> итератор() {
        возвращает новый iteratorlink();
    }
 
      узел частного класса {
          предыдущий частный узел;
          следующий частный узел;
        частное строковое значение;
 
        Узел( предыдущийузел , следующийузел, строковое значение) {
            this.prev = предыдущий;
            this.next = следующий;
            это.значение = значение;
        }
    }
 
    private class IteratorLinked implements Iterator<String> {
        private Node cursor = first;
 
        @Переопределить
        общедоступное логическое значение hasNext() {
            верните this.cursor != null;
        }
 
        @Переопределить
        общедоступная строка next() {
            if (!hasNext()) {
                выбросить новое исключение NoSuchElementException(msgException);
            }
             Результат строки = курсор.значение
            this.cursor = this.cursor.next;
            возвращает результат;
        }
    }
}
 
класс MyLinkedListTest {
    общедоступная статическая пустота main(строка[] аргументов) {
         Список MyLinkedList =  новыйсписок MyLinkedList
        список.addAll("sfdsf", "fsDSdfss", "asdefsdaS", "sssssss", "rewreSdadS");
        System.out.println(список);
        список.updateLinkedByTask('S');
        System.out.println(список);
    }
}