package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dar implements hkx {
    public final daw a;
    public ffji b;
    public ffji c;
    final /* synthetic */ das d;

    public dar(das dasVar, daw dawVar, ffji ffjiVar, ffji ffjiVar2) {
        this.d = dasVar;
        this.a = dawVar;
        this.b = ffjiVar;
        this.c = ffjiVar2;
    }

    @Override // defpackage.hkx
    public final Object a() {
        b(this.d.a.d());
        return this.a.a();
    }

    public final void b(dau dauVar) {
        Object invoke = this.c.invoke(dauVar.b());
        if (!this.d.a.t()) {
            this.a.k(invoke, (cyq) this.b.invoke(dauVar));
        } else {
            this.a.j(this.c.invoke(dauVar.a()), invoke, (cyq) this.b.invoke(dauVar));
        }
    }
}
