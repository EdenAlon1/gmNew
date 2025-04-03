package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class m4 extends AbstractC0065c {
    private final AbstractC0060b j;
    private final IntFunction k;
    private final boolean l;
    private long m;
    private boolean n;
    private volatile boolean o;

    m4(AbstractC0060b abstractC0060b, AbstractC0060b abstractC0060b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0060b2, spliterator);
        this.j = abstractC0060b;
        this.k = intFunction;
        this.l = EnumC0124n3.ORDERED.y(abstractC0060b2.F());
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final Object a() {
        C0 I = this.a.I(-1L, this.k);
        InterfaceC0157u2 M = this.j.M(this.a.F(), I);
        AbstractC0060b abstractC0060b = this.a;
        boolean s = abstractC0060b.s(this.b, abstractC0060b.R(M));
        this.n = s;
        if (s) {
            i();
        }
        K0 build = I.build();
        this.m = build.count();
        return build;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final AbstractC0075e e(Spliterator spliterator) {
        return new m4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0065c
    protected final void h() {
        this.i = true;
        if (this.l && this.o) {
            f(AbstractC0175y0.H(this.j.D()));
        }
    }

    @Override // j$.util.stream.AbstractC0065c
    protected final Object j() {
        return AbstractC0175y0.H(this.j.D());
    }

    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object F;
        AbstractC0075e abstractC0075e = this.d;
        if (abstractC0075e != null) {
            this.n = ((m4) abstractC0075e).n | ((m4) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                F = AbstractC0175y0.H(this.j.D());
            } else {
                if (this.l) {
                    m4 m4Var = (m4) this.d;
                    if (m4Var.n) {
                        this.m = m4Var.m;
                        F = (K0) m4Var.c();
                    }
                }
                m4 m4Var2 = (m4) this.d;
                long j = m4Var2.m;
                m4 m4Var3 = (m4) this.e;
                this.m = j + m4Var3.m;
                F = m4Var2.m == 0 ? (K0) m4Var3.c() : m4Var3.m == 0 ? (K0) m4Var2.c() : AbstractC0175y0.F(this.j.D(), (K0) ((m4) this.d).c(), (K0) ((m4) this.e).c());
            }
            f(F);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    m4(m4 m4Var, Spliterator spliterator) {
        super(m4Var, spliterator);
        this.j = m4Var.j;
        this.k = m4Var.k;
        this.l = m4Var.l;
    }
}
