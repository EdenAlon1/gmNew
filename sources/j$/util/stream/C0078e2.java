package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.e2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0078e2 extends AbstractC0075e {
    private final AbstractC0175y0 h;

    C0078e2(AbstractC0175y0 abstractC0175y0, AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(abstractC0060b, spliterator);
        this.h = abstractC0175y0;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final Object a() {
        AbstractC0060b abstractC0060b = this.a;
        X1 R = this.h.R();
        abstractC0060b.Q(this.b, R);
        return R;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final AbstractC0075e e(Spliterator spliterator) {
        return new C0078e2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0075e abstractC0075e = this.d;
        if (abstractC0075e != null) {
            X1 x1 = (X1) ((C0078e2) abstractC0075e).c();
            x1.f((X1) ((C0078e2) this.e).c());
            f(x1);
        }
        super.onCompletion(countedCompleter);
    }

    C0078e2(C0078e2 c0078e2, Spliterator spliterator) {
        super(c0078e2, spliterator);
        this.h = c0078e2.h;
    }
}
