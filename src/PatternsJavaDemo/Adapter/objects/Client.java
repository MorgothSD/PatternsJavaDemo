package PatternsJavaDemo.Adapter.objects;

import PatternsJavaDemo.Adapter.adapter.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

public class Client  {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("txt1");
        list.add("txt2");
        list.add("txt3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.print(list);
    }
}
