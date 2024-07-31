package domain;

public class ExcelDataProcesser extends DataProcesser{
    @Override
    void readData() {
        System.out.println("Reading Excel Data");
    }

    @Override
    void processData() {
        System.out.println("Processing Excel Data");
    }

    @Override
    void writeData() {
        System.out.println("Writing excel Data");
    }
}
