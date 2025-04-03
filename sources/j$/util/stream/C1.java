package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes9.dex */
abstract class C1 extends CountedCompleter {
    protected final K0 a;
    protected final int b;

    C1(K0 k0) {
        this.a = k0;
        this.b = 0;
    }

    abstract void a();

    abstract C1 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C1 c1 = this;
        while (c1.a.q() != 0) {
            c1.setPendingCount(c1.a.q() - 1);
            int i = 0;
            int i2 = 0;
            while (i < c1.a.q() - 1) {
                C1 b = c1.b(i, c1.b + i2);
                i2 = (int) (i2 + b.a.count());
                b.fork();
                i++;
            }
            c1 = c1.b(i, c1.b + i2);
        }
        c1.a();
        c1.propagateCompletion();
    }

    C1(C1 c1, K0 k0, int i) {
        super(c1);
        this.a = k0;
        this.b = i;
    }
}
