package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;

/* loaded from: classes9.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(Spliterators.j(tArr, 0, tArr.length, 1040), false);
    }

    public static IntStream stream(int[] iArr) {
        return StreamSupport.a(Spliterators.spliterator(iArr, 0, iArr.length, 1040));
    }

    public static LongStream stream(long[] jArr) {
        return StreamSupport.b(Spliterators.spliterator(jArr, 0, jArr.length, 1040));
    }
}
