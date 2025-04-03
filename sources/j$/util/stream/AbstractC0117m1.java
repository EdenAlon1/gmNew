package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0117m1 extends AbstractC0127o1 implements j$.util.d0 {
    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.d0) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque b = b();
        while (true) {
            J0 j0 = (J0) AbstractC0127o1.a(b);
            if (j0 == null) {
                this.a = null;
                return;
            }
            j0.d(obj);
        }
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        J0 j0;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.d0) this.d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.c == null && (j0 = (J0) AbstractC0127o1.a(this.e)) != null) {
                j$.util.d0 spliterator = j0.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return tryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
