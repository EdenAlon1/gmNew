package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
final class j0 implements F, DoubleConsumer, A {
    boolean a = false;
    double b;
    final /* synthetic */ V c;

    j0(V v) {
        this.c = v;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // j$.util.P
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((DoubleConsumer) this);
        }
        return this.a;
    }

    @Override // j$.util.F
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (!u0.a) {
            return Double.valueOf(nextDouble());
        }
        u0.a(j0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.F, java.util.Iterator, j$.util.A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (!u0.a) {
            forEachRemaining((DoubleConsumer) new C(consumer));
        } else {
            u0.a(j0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
    }
}
