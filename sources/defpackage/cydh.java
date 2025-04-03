package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydh implements sry {
    public final ffhd a;
    public final ffsk b;
    private final ffbz c;

    public cydh(ffhd ffhdVar, ffsk ffskVar) {
        ffhdVar.getClass();
        ffskVar.getClass();
        this.a = ffhdVar;
        this.b = ffskVar;
        this.c = ffca.a(new ffix() { // from class: cyde
            @Override // defpackage.ffix
            public final Object invoke() {
                fgcm a = fgdm.a(null);
                cydh cydhVar = cydh.this;
                return ejso.a(a, cydhVar.b, new cydf(cydhVar));
            }
        });
    }

    @Override // defpackage.sry
    public final fgdj a() {
        return (fgdj) this.c.a();
    }

    @Override // defpackage.sry
    public final boolean b() {
        return true;
    }
}
