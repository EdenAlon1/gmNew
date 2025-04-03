package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
interface K0 {
    K0 a(int i);

    long count();

    void forEach(Consumer consumer);

    K0 g(long j, long j2, IntFunction intFunction);

    void h(Object[] objArr, int i);

    Object[] n(IntFunction intFunction);

    int q();

    Spliterator spliterator();
}
