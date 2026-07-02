package page;

public abstract class BasePage<T extends BasePage<T>> {

    public T navigate(T clazz) {
        return clazz;
    }
}
