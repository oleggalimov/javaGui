import guiComponents.mainWindow;
import model.material;

import java.io.*;
import java.util.List;

/*
1.	Сведения о веществе: название (строка), удельный вес (вещественное число),
свойство проводимости (целое число: 0 – нет проводимости, 1 – полупроводник,
2 – проводник По сведениям о некотором количестве веществ получить список веществ ,
название которых состоит не менее, чем из двух слов, отсортированных по возрастанию удельных весов.
Если  нужных веществ   нет, выдать соответствующее сообщение.

Написать графический интерфейс для этой задачи

*/

/**
 * Created by oleg on 09.09.17.
 */
public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        guiComponents.mainWindow.BuildMainWindow();
    }
}
