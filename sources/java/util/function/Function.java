package java.util.function;

/* loaded from: classes9.dex */
public interface Function<T, R> {
    /* renamed from: andThen */
    <V> Function<T, V> mo448andThen(Function<? super R, ? extends V> function);

    R apply(T t);
}
