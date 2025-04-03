package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwgr {
    public final fgcm a;
    public final cwgs b;

    public cwgr() {
        fgcm a = fgdm.a("");
        this.a = a;
        this.b = new cwgs(a, new ffix() { // from class: cwgq
            @Override // defpackage.ffix
            public final Object invoke() {
                cwgr.this.a.f("");
                return ffcu.a;
            }
        });
    }

    public final void a(String str) {
        this.a.f(str);
    }
}
