package j$.util;

import defpackage.aaaf;
import j$.util.stream.Stream;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        predicate.getClass();
        return (isPresent() && !predicate.test((Object) this.a)) ? empty() : this;
    }

    public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> function) {
        function.getClass();
        if (!isPresent()) {
            return empty();
        }
        Optional<? extends U> apply = function.apply((Object) this.a);
        apply.getClass();
        return apply;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        aaaf aaafVar = (Object) this.a;
        if (aaafVar != null) {
            consumer.accept(aaafVar);
        }
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable runnable) {
        aaaf aaafVar = (Object) this.a;
        if (aaafVar != null) {
            consumer.accept(aaafVar);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        function.getClass();
        return !isPresent() ? empty() : ofNullable(function.apply((Object) this.a));
    }

    public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
        supplier.getClass();
        if (isPresent()) {
            return this;
        }
        Optional<? extends T> optional = supplier.get();
        optional.getClass();
        return optional;
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t = (T) this.a;
        return t != null ? t : supplier.get();
    }

    public T orElseThrow() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public Stream<T> stream() {
        return !isPresent() ? Stream.CC.empty() : Stream.CC.of(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }

    private Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }
}
