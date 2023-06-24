package homework_5.service;

public interface FileStorage<T>  extends Storage<T> {
    abstract void setFileName(String absolutePath);
}
