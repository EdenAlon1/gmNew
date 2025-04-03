package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class femt extends fecc {
    public final fecc a;

    public femt(fecc feccVar) {
        this.a = feccVar;
    }

    @Override // defpackage.fecc
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.fecc
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.fecc
    public void c() {
        throw null;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", this.a);
        return b.toString();
    }
}
