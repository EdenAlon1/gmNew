package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class l4 extends AbstractC0075e {
    private final AbstractC0060b h;
    private final IntFunction i;
    private final boolean j;
    private long k;
    private long l;

    l4(AbstractC0060b abstractC0060b, AbstractC0060b abstractC0060b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0060b2, spliterator);
        this.h = abstractC0060b;
        this.i = intFunction;
        this.j = EnumC0124n3.ORDERED.y(abstractC0060b2.F());
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final Object a() {
        boolean d = d();
        C0 I = this.a.I((!d && this.j && EnumC0124n3.SIZED.D(this.h.c)) ? this.h.B(this.b) : -1L, this.i);
        k4 i = ((j4) this.h).i(I, this.j && !d);
        this.a.Q(this.b, i);
        K0 build = I.build();
        this.k = build.count();
        this.l = i.e();
        return build;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final AbstractC0075e e(Spliterator spliterator) {
        return new l4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0075e abstractC0075e = this.d;
        if (abstractC0075e != null) {
            if (this.j) {
                l4 l4Var = (l4) abstractC0075e;
                long j = l4Var.l;
                this.l = j;
                if (j == l4Var.k) {
                    this.l = j + ((l4) this.e).l;
                }
            }
            l4 l4Var2 = (l4) abstractC0075e;
            long j2 = l4Var2.k;
            l4 l4Var3 = (l4) this.e;
            this.k = j2 + l4Var3.k;
            K0 F = l4Var2.k == 0 ? (K0) l4Var3.c() : l4Var3.k == 0 ? (K0) l4Var2.c() : AbstractC0175y0.F(this.h.D(), (K0) ((l4) this.d).c(), (K0) ((l4) this.e).c());
            if (d() && this.j) {
                F = F.g(this.l, F.count(), this.i);
            }
            f(F);
        }
        super.onCompletion(countedCompleter);
    }

    l4(l4 l4Var, Spliterator spliterator) {
        super(l4Var, spliterator);
        this.h = l4Var.h;
        this.i = l4Var.i;
        this.j = l4Var.j;
    }
}
