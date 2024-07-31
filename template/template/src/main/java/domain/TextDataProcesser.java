package domain;

public class TextDataProcesser extends DataProcesser{
    @Override
    void readData() {
        System.out.println("Reading Data from text file.");
    }

    @Override
    void processData() {
        System.out.println("Processing text data");
    }

    @Override
    void writeData() {
        System.out.println("Writing data to text file");
    }
}
