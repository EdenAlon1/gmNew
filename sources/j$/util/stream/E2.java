package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class E2 extends AbstractC0065c {
    private final AbstractC0060b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    E2(AbstractC0060b abstractC0060b, AbstractC0060b abstractC0060b2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC0060b2, spliterator);
        this.j = abstractC0060b;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    private long k(long j) {
        if (this.o) {
            return this.n;
        }
        E2 e2 = (E2) this.d;
        E2 e22 = (E2) this.e;
        if (e2 == null || e22 == null) {
            return this.n;
        }
        long k = e2.k(j);
        return k >= j ? k : k + e22.k(j);
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final Object a() {
        if (d()) {
            C0 I = this.j.I(EnumC0124n3.SIZED.D(this.j.c) ? this.j.B(this.b) : -1L, this.k);
            InterfaceC0157u2 M = this.j.M(this.a.F(), I);
            AbstractC0060b abstractC0060b = this.a;
            abstractC0060b.s(this.b, abstractC0060b.R(M));
            return I.build();
        }
        C0 I2 = this.j.I(-1L, this.k);
        if (this.l == 0) {
            InterfaceC0157u2 M2 = this.j.M(this.a.F(), I2);
            AbstractC0060b abstractC0060b2 = this.a;
            abstractC0060b2.s(this.b, abstractC0060b2.R(M2));
        } else {
            this.a.Q(this.b, I2);
        }
        K0 build = I2.build();
        this.n = build.count();
        this.o = true;
        this.b = null;
        return build;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final AbstractC0075e e(Spliterator spliterator) {
        return new E2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0065c
    protected final void h() {
        this.i = true;
        if (this.o) {
            f(AbstractC0175y0.H(this.j.D()));
        }
    }

    @Override // j$.util.stream.AbstractC0065c
    protected final Object j() {
        return AbstractC0175y0.H(this.j.D());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r2 >= r0) goto L51;
     */
    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.E2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    E2(E2 e2, Spliterator spliterator) {
        super(e2, spliterator);
        this.j = e2.j;
        this.k = e2.k;
        this.l = e2.l;
        this.m = e2.m;
    }
}
