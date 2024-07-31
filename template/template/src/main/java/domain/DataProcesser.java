package domain;

public abstract class DataProcesser {

    public final void process(){
        readData();
        processData();
        writeData();
    }

    abstract void readData();
    abstract void processData();
    abstract void writeData();
}
