package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes9.dex */
final class U extends CountedCompleter {
    private Spliterator a;
    private final InterfaceC0157u2 b;
    private final AbstractC0060b c;
    private long d;

    U(AbstractC0060b abstractC0060b, Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        super(null);
        this.b = interfaceC0157u2;
        this.c = abstractC0060b;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = AbstractC0075e.g(estimateSize);
            this.d = j;
        }
        boolean y = EnumC0124n3.SHORT_CIRCUIT.y(this.c.F());
        InterfaceC0157u2 interfaceC0157u2 = this.b;
        boolean z = false;
        U u = this;
        while (true) {
            if (y && interfaceC0157u2.m()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            U u2 = new U(u, trySplit);
            u.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                U u3 = u;
                u = u2;
                u2 = u3;
            }
            z = !z;
            u.fork();
            u = u2;
            estimateSize = spliterator.estimateSize();
        }
        u.c.p(spliterator, interfaceC0157u2);
        u.a = null;
        u.propagateCompletion();
    }

    U(U u, Spliterator spliterator) {
        super(u);
        this.a = spliterator;
        this.b = u.b;
        this.d = u.d;
        this.c = u.c;
    }
}
