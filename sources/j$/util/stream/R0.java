package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes9.dex */
class R0 extends AbstractC0075e {
    protected final AbstractC0060b h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    R0(AbstractC0060b abstractC0060b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0060b, spliterator);
        this.h = abstractC0060b;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final Object a() {
        C0 c0 = (C0) this.i.apply(this.h.B(this.b));
        this.h.Q(this.b, c0);
        return c0.build();
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final AbstractC0075e e(Spliterator spliterator) {
        return new R0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0075e abstractC0075e = this.d;
        if (abstractC0075e != null) {
            f((K0) this.j.apply((K0) ((R0) abstractC0075e).c(), (K0) ((R0) this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    R0(R0 r0, Spliterator spliterator) {
        super(r0, spliterator);
        this.h = r0.h;
        this.i = r0.i;
        this.j = r0.j;
    }
}
