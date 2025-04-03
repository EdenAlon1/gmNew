package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes9.dex */
public final class StreamSupport {
    public static IntStream a(Spliterator.OfInt ofInt) {
        return new C0071d0(ofInt, EnumC0124n3.v(ofInt), false);
    }

    public static LongStream b(Spliterator.OfLong ofLong) {
        return new C0116m0(ofLong, EnumC0124n3.v(ofLong), false);
    }

    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        spliterator.getClass();
        return new C0108k2(spliterator, EnumC0124n3.v(spliterator), z);
    }
}
