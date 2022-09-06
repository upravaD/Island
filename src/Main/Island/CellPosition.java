package Main.Island;

import java.util.List;

//Класс позиции обьекта
public class CellPosition {

    /**
     * Алгоритм changeCell(Object obj, int index):
     * метод добавляет обьект obj в определенный список ячейки по индексу index.
     */

    public static void changeCell(Object obj, int index) { //Параметры: обьект списка ячейки массива island и индекс списка

        switch (index) { // добавление обьекта в список ячейки
            case 0  -> Island.cell0000.add(obj);
            case 1  -> Island.cell0001.add(obj);
            case 2  -> Island.cell0002.add(obj);

            case 3  -> Island.cell0100.add(obj);
            case 4  -> Island.cell0101.add(obj);
            case 5  -> Island.cell0102.add(obj);

            case 6  -> Island.cell0200.add(obj);
            case 7  -> Island.cell0201.add(obj);
            case 8  -> Island.cell0202.add(obj);

            case 9  -> Island.cell0003.add(obj);
            case 10 -> Island.cell0004.add(obj);
            case 11 -> Island.cell0005.add(obj);
            case 12 -> Island.cell0103.add(obj);
            case 13 -> Island.cell0104.add(obj);
            case 14 -> Island.cell0105.add(obj);
            case 15 -> Island.cell0203.add(obj);
            case 16 -> Island.cell0204.add(obj);
            case 17 -> Island.cell0205.add(obj);

            case 18 -> Island.cell0300.add(obj);
            case 19 -> Island.cell0301.add(obj);
            case 20 -> Island.cell0302.add(obj);
            case 21 -> Island.cell0400.add(obj);
            case 22 -> Island.cell0401.add(obj);
            case 23 -> Island.cell0402.add(obj);
            case 24 -> Island.cell0500.add(obj);
            case 25 -> Island.cell0501.add(obj);
            case 26 -> Island.cell0502.add(obj);

            case 27 -> Island.cell0303.add(obj);
            case 28 -> Island.cell0304.add(obj);
            case 29 -> Island.cell0305.add(obj);
            case 30 -> Island.cell0403.add(obj);
            case 31 -> Island.cell0404.add(obj);
            case 32 -> Island.cell0405.add(obj);
            case 33 -> Island.cell0503.add(obj);
            case 34 -> Island.cell0504.add(obj);
            case 35 -> Island.cell0505.add(obj);

            case 36 -> Island.cell0006.add(obj);
            case 37 -> Island.cell0007.add(obj);
            case 38 -> Island.cell0008.add(obj);
            case 39 -> Island.cell0106.add(obj);
            case 40 -> Island.cell0107.add(obj);
            case 41 -> Island.cell0108.add(obj);
            case 42 -> Island.cell0206.add(obj);
            case 43 -> Island.cell0207.add(obj);
            case 44 -> Island.cell0208.add(obj);

            case 45 -> Island.cell0306.add(obj);
            case 46 -> Island.cell0307.add(obj);
            case 47 -> Island.cell0308.add(obj);
            case 48 -> Island.cell0406.add(obj);
            case 49 -> Island.cell0407.add(obj);
            case 50 -> Island.cell0408.add(obj);
            case 51 -> Island.cell0506.add(obj);
            case 52 -> Island.cell0507.add(obj);
            case 53 -> Island.cell0508.add(obj);

            case 54 -> Island.cell0600.add(obj);
            case 55 -> Island.cell0601.add(obj);
            case 56 -> Island.cell0602.add(obj);
            case 57 -> Island.cell0603.add(obj);
            case 58 -> Island.cell0604.add(obj);
            case 59 -> Island.cell0605.add(obj);
            case 60 -> Island.cell0606.add(obj);
            case 61 -> Island.cell0607.add(obj);
            case 62 -> Island.cell0608.add(obj);

            case 63 -> Island.cell0700.add(obj);
            case 64 -> Island.cell0701.add(obj);
            case 65 -> Island.cell0702.add(obj);
            case 66 -> Island.cell0703.add(obj);
            case 67 -> Island.cell0704.add(obj);
            case 68 -> Island.cell0705.add(obj);
            case 69 -> Island.cell0706.add(obj);
            case 70 -> Island.cell0707.add(obj);
            case 71 -> Island.cell0708.add(obj);

            case 72 -> Island.cell0800.add(obj);
            case 73 -> Island.cell0801.add(obj);
            case 74 -> Island.cell0802.add(obj);
            case 75 -> Island.cell0803.add(obj);
            case 76 -> Island.cell0804.add(obj);
            case 77 -> Island.cell0805.add(obj);
            case 78 -> Island.cell0806.add(obj);
            case 79 -> Island.cell0807.add(obj);
            case 80 -> Island.cell0808.add(obj);
        }
    }

    /**
     * Алгоритм getCellList(int index):
     *  метод возвращает определенный список ячейки массива island по индексу index
     */

    public static List<Object> getCellList(int index) { //Параметры: индекс списка массива island

        //Возвращает определенный список ячейки массива island по индексу index
        switch (index) {

            case 0   -> {return Island.cell0000;}
            case 1   -> {return Island.cell0001;}
            case 2   -> {return Island.cell0002;}

            case 3   -> {return Island.cell0100;}
            case 4   -> {return Island.cell0101;}
            case 5   -> {return Island.cell0102;}

            case 6   -> {return Island.cell0200;}
            case 7   -> {return Island.cell0201;}
            case 8   -> {return Island.cell0202;}

            case 9   -> {return Island.cell0003;}
            case 10  -> {return Island.cell0004;}
            case 11  -> {return Island.cell0005;}
            case 12  -> {return Island.cell0103;}
            case 13  -> {return Island.cell0104;}
            case 14  -> {return Island.cell0105;}
            case 15  -> {return Island.cell0203;}
            case 16  -> {return Island.cell0204;}
            case 17  -> {return Island.cell0205;}

            case 18  -> {return Island.cell0300;}
            case 19  -> {return Island.cell0301;}
            case 20  -> {return Island.cell0302;}
            case 21  -> {return Island.cell0400;}
            case 22  -> {return Island.cell0401;}
            case 23  -> {return Island.cell0402;}
            case 24  -> {return Island.cell0500;}
            case 25  -> {return Island.cell0501;}
            case 26  -> {return Island.cell0502;}

            case 27  -> {return Island.cell0303;}
            case 28  -> {return Island.cell0304;}
            case 29  -> {return Island.cell0305;}
            case 30  -> {return Island.cell0403;}
            case 31  -> {return Island.cell0404;}
            case 32  -> {return Island.cell0405;}
            case 33  -> {return Island.cell0503;}
            case 34  -> {return Island.cell0504;}
            case 35  -> {return Island.cell0505;}

            case 36  -> {return Island.cell0006;}
            case 37  -> {return Island.cell0007;}
            case 38  -> {return Island.cell0008;}
            case 39  -> {return Island.cell0106;}
            case 40  -> {return Island.cell0107;}
            case 41  -> {return Island.cell0108;}
            case 42  -> {return Island.cell0206;}
            case 43  -> {return Island.cell0207;}
            case 44  -> {return Island.cell0208;}

            case 45  -> {return Island.cell0306;}
            case 46  -> {return Island.cell0307;}
            case 47  -> {return Island.cell0308;}
            case 48  -> {return Island.cell0406;}
            case 49  -> {return Island.cell0407;}
            case 50  -> {return Island.cell0408;}
            case 51  -> {return Island.cell0506;}
            case 52  -> {return Island.cell0507;}
            case 53  -> {return Island.cell0508;}

            case 54  -> {return Island.cell0600;}
            case 55  -> {return Island.cell0601;}
            case 56  -> {return Island.cell0602;}
            case 57  -> {return Island.cell0603;}
            case 58  -> {return Island.cell0604;}
            case 59  -> {return Island.cell0605;}
            case 60  -> {return Island.cell0606;}
            case 61  -> {return Island.cell0607;}
            case 62  -> {return Island.cell0608;}

            case 63  -> {return Island.cell0700;}
            case 64  -> {return Island.cell0701;}
            case 65  -> {return Island.cell0702;}
            case 66  -> {return Island.cell0703;}
            case 67  -> {return Island.cell0704;}
            case 68  -> {return Island.cell0705;}
            case 69  -> {return Island.cell0706;}
            case 70  -> {return Island.cell0707;}
            case 71  -> {return Island.cell0708;}

            case 72  -> {return Island.cell0800;}
            case 73  -> {return Island.cell0801;}
            case 74  -> {return Island.cell0802;}
            case 75  -> {return Island.cell0803;}
            case 76  -> {return Island.cell0804;}
            case 77  -> {return Island.cell0805;}
            case 78  -> {return Island.cell0806;}
            case 79  -> {return Island.cell0807;}
            case 80  -> {return Island.cell0808;}
        }
        return null; // дефолтное значение
    }
}
