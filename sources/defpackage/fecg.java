package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fecg extends fdxo {
    @Override // defpackage.fdxo
    public void c(String str, Throwable th) {
        g().c(str, th);
    }

    @Override // defpackage.fdxo
    public void d() {
        g().d();
    }

    @Override // defpackage.fdxo
    public void e(int i) {
        g().e(i);
    }

    protected abstract fdxo g();

    @Override // defpackage.fdxo
    public final boolean k() {
        return g().k();
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", g());
        return b.toString();
    }
}
