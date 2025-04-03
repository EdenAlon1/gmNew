package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwo implements cvwh {
    public final ffsk a;
    public final cwde b;
    public final cwis c;
    public final cwiw d;
    private final fgcm e;

    public cvwo(ffsk ffskVar, cwde cwdeVar, cwis cwisVar, cwiw cwiwVar) {
        ffskVar.getClass();
        cwdeVar.getClass();
        cwisVar.getClass();
        cwiwVar.getClass();
        this.a = ffskVar;
        this.b = cwdeVar;
        this.c = cwisVar;
        this.d = cwiwVar;
        this.e = fgdm.a(null);
    }

    @Override // defpackage.cvwh
    public final cvwp a() {
        cvwk cvwkVar = new cvwk(this.e, this);
        int i = fgcz.a;
        fgcz a = fgcy.a(0L, 3);
        int i2 = engw.d;
        return new cvwp(fgbn.b(cvwkVar, this.a, a, enou.a), new cvwl(this));
    }

    @Override // defpackage.cvwh
    public final void b(amar amarVar) {
        if (((enou) amarVar.b()).c <= 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.e.f(amarVar);
    }

    public final void c() {
        this.e.f(null);
    }
}
