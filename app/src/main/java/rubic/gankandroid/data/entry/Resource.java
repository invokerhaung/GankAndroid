package rubic.gankandroid.data.entry;

/**
 * Created by invokerhuang on 2017/9/19.
 */

public class Resource<T> {
    private T data;

    public Resource(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Resource() {
    }
}
