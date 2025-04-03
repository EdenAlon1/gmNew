package j$.util;

import com.android.vcard.VCardConfig;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class Spliterators {
    private static final Spliterator a = new q0();
    private static final Spliterator.OfInt b = new o0();
    private static final Spliterator.OfLong c = new p0();
    private static final V d = new n0();

    public static abstract class AbstractSpliterator<T> implements Spliterator<T> {
        private final int a;
        private long b;
        private int c;

        protected AbstractSpliterator(long j, int i) {
            this.b = j;
            this.a = (i & 64) != 0 ? i | 16384 : i;
        }

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return this.a;
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            return this.b;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ java.util.Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public final Spliterator trySplit() {
            k0 k0Var = new k0();
            long j = this.b;
            if (j <= 1 || !tryAdvance(k0Var)) {
                return null;
            }
            int i = this.c + 1024;
            if (i > j) {
                i = (int) j;
            }
            if (i > 33554432) {
                i = VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            }
            Object[] objArr = new Object[i];
            int i2 = 0;
            do {
                objArr[i2] = k0Var.a;
                i2++;
                if (i2 >= i) {
                    break;
                }
            } while (tryAdvance(k0Var));
            this.c = i2;
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - i2;
            }
            return new l0(objArr, 0, i2, this.a);
        }
    }

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static V b() {
        return d;
    }

    public static Spliterator.OfInt c() {
        return b;
    }

    public static Spliterator.OfLong d() {
        return c;
    }

    public static Spliterator e() {
        return a;
    }

    public static F f(V v) {
        v.getClass();
        return new j0(v);
    }

    public static J g(Spliterator.OfInt ofInt) {
        ofInt.getClass();
        return new h0(ofInt);
    }

    public static O h(Spliterator.OfLong ofLong) {
        ofLong.getClass();
        return new i0(ofLong);
    }

    public static V i(double[] dArr, int i, int i2) {
        dArr.getClass();
        a(dArr.length, i, i2);
        return new m0(dArr, i, i2, 1040);
    }

    public static <T> Iterator<T> iterator(Spliterator<? extends T> spliterator) {
        spliterator.getClass();
        return new g0(spliterator);
    }

    public static Spliterator j(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new l0(objArr, i, i2, i3);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i, int i2, int i3) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new r0(iArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> it, int i) {
        it.getClass();
        return new s0(it, i);
    }

    public static Spliterator.OfLong spliterator(long[] jArr, int i, int i2, int i3) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new t0(jArr, i, i2, i3);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new s0(collection, i);
    }
}
