package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsra implements dsqt {
    private final ffsk a;
    private final fgcm b;
    private final ffxx c;

    public dsra(ffsk ffskVar) {
        ffskVar.getClass();
        this.a = ffskVar;
        fgcm a = fgdm.a(null);
        this.b = a;
        this.c = new dsqz(a);
    }

    private final void d(dsqu dsquVar) {
        fgcm fgcmVar;
        Object c;
        dsqu dsquVar2;
        do {
            fgcmVar = this.b;
            c = fgcmVar.c();
            dsquVar2 = (dsqu) c;
        } while (!fgcmVar.g(c, dsquVar));
        if (dsquVar2 != null) {
            dsquVar2.b.t(null);
        }
    }

    @Override // defpackage.dsqt
    public final ffxx a() {
        return this.c;
    }

    @Override // defpackage.dsqt
    public final void b(dspp dsppVar) {
        ffvf ffvfVar = new ffvf((ffud) this.a.hT().get(ffud.c));
        d(new dsqu(new dspo(dsppVar.b(ffsl.b(this.a.hT().plus(ffvfVar)), new dsqv(this)), dsppVar.a(), new dsqw(dsppVar, this)), ffvfVar));
    }

    public final void c() {
        d(null);
    }
}
