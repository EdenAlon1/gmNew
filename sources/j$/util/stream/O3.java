package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class O3 extends Q3 implements Spliterator, Consumer {
    Object f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Q3
    protected final Spliterator b(Spliterator spliterator) {
        return new O3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C0158u3 c0158u3 = null;
        while (true) {
            P3 c = c();
            if (c == P3.NO_MORE) {
                return;
            }
            P3 p3 = P3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c != p3) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (c0158u3 == null) {
                c0158u3 = new C0158u3(i);
            } else {
                c0158u3.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(c0158u3)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long a = a(j);
            for (int i2 = 0; i2 < a; i2++) {
                consumer.accept(c0158u3.b[i2]);
            }
        }
    }

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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        while (c() != P3.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }
}
