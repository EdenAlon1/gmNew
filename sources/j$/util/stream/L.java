package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes9.dex */
final class L extends AbstractC0065c {
    private final F j;
    private final boolean k;

    L(F f, boolean z, AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(abstractC0060b, spliterator);
        this.k = z;
        this.j = f;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final Object a() {
        CountedCompleter completer;
        AbstractC0060b abstractC0060b = this.a;
        Y3 y3 = (Y3) this.j.d.get();
        abstractC0060b.Q(this.b, y3);
        Object obj = y3.get();
        if (this.k) {
            if (obj != null) {
                AbstractC0075e abstractC0075e = this;
                while (abstractC0075e != null) {
                    completer = abstractC0075e.getCompleter();
                    AbstractC0075e abstractC0075e2 = (AbstractC0075e) completer;
                    if (abstractC0075e2 != null && abstractC0075e2.d != abstractC0075e) {
                        i();
                        return obj;
                    }
                    abstractC0075e = abstractC0075e2;
                }
                j$.util.concurrent.m.a(this.h, null, obj);
                return obj;
            }
        } else if (obj != null) {
            j$.util.concurrent.m.a(this.h, null, obj);
            return null;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0075e
    protected final AbstractC0075e e(Spliterator spliterator) {
        return new L(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0065c
    protected final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC0075e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        CountedCompleter completer;
        if (this.k) {
            L l = (L) this.d;
            L l2 = null;
            while (true) {
                if (l != l2) {
                    Object c = l.c();
                    if (c != null && this.j.c.test(c)) {
                        f(c);
                        AbstractC0075e abstractC0075e = this;
                        while (true) {
                            if (abstractC0075e == null) {
                                j$.util.concurrent.m.a(this.h, null, c);
                                break;
                            }
                            completer = abstractC0075e.getCompleter();
                            AbstractC0075e abstractC0075e2 = (AbstractC0075e) completer;
                            if (abstractC0075e2 != null && abstractC0075e2.d != abstractC0075e) {
                                i();
                                break;
                            }
                            abstractC0075e = abstractC0075e2;
                        }
                    } else {
                        l2 = l;
                        l = (L) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    L(L l, Spliterator spliterator) {
        super(l, spliterator);
        this.k = l.k;
        this.j = l.j;
    }
}
