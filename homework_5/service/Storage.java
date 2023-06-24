package homework_5.service;


public abstract interface Storage<T> {
    abstract T loadData();
    abstract void saveData(T exportData);
}
