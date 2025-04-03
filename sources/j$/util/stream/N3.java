package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
abstract class N3 extends Q3 implements j$.util.d0 {
    protected abstract void d(Object obj);

    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        obj.getClass();
        AbstractC0153t3 abstractC0153t3 = null;
        while (true) {
            P3 c = c();
            if (c == P3.NO_MORE) {
                return;
            }
            P3 p3 = P3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c != p3) {
                ((j$.util.d0) spliterator).forEachRemaining(obj);
                return;
            }
            int i = this.c;
            if (abstractC0153t3 == null) {
                abstractC0153t3 = g(i);
            } else {
                abstractC0153t3.b = 0;
            }
            long j = 0;
            while (((j$.util.d0) spliterator).tryAdvance(abstractC0153t3)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                abstractC0153t3.a(obj, a(j));
            }
        }
    }

    protected abstract AbstractC0153t3 g(int i);

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        while (c() != P3.NO_MORE && ((j$.util.d0) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                d(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
