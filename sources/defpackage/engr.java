package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class engr extends engg {
    public engr() {
        super(4);
    }

    @Override // defpackage.engg, defpackage.engh
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final engw g() {
        this.c = true;
        return engw.i(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public engr(int i) {
        super(i);
    }
}
