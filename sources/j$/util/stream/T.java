package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes9.dex */
final class T extends CountedCompleter {
    private final AbstractC0060b a;
    private Spliterator b;
    private final long c;
    private final ConcurrentHashMap d;
    private final Q e;
    private final T f;
    private K0 g;

    protected T(AbstractC0060b abstractC0060b, Spliterator spliterator, Q q) {
        super(null);
        this.a = abstractC0060b;
        this.b = spliterator;
        this.c = AbstractC0075e.g(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC0075e.b() << 1));
        this.e = q;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int pendingCount;
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        T t = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            T t2 = new T(t, trySplit, t.f);
            T t3 = new T(t, spliterator, t2);
            t.addToPendingCount(1);
            t3.addToPendingCount(1);
            t.d.put(t2, t3);
            if (t.f != null) {
                t2.addToPendingCount(1);
                if (t.d.replace(t.f, t, t2)) {
                    t.addToPendingCount(-1);
                } else {
                    t2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                t = t2;
                t2 = t3;
            } else {
                t = t3;
            }
            z = !z;
            t2.fork();
        }
        pendingCount = t.getPendingCount();
        if (pendingCount > 0) {
            C0110l c0110l = new C0110l(28);
            AbstractC0060b abstractC0060b = t.a;
            C0 I = abstractC0060b.I(abstractC0060b.B(spliterator), c0110l);
            t.a.Q(spliterator, I);
            t.g = I.build();
            t.b = null;
        }
        t.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 k0 = this.g;
        if (k0 != null) {
            k0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.Q(spliterator, this.e);
                this.b = null;
            }
        }
        T t = (T) this.d.remove(this);
        if (t != null) {
            t.tryComplete();
        }
    }

    T(T t, Spliterator spliterator, T t2) {
        super(t);
        this.a = t.a;
        this.b = spliterator;
        this.c = t.c;
        this.d = t.d;
        this.e = t.e;
        this.f = t2;
    }
}
