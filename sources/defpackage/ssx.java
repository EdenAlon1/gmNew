package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssx implements sso, ssh {
    public final fgcm a;
    public boolean b;
    private final ffsk c;
    private fgdj d;
    private final ssm e;

    public ssx(ssm ssmVar, ffsk ffskVar) {
        ssmVar.getClass();
        ffskVar.getClass();
        this.e = ssmVar;
        this.c = ffskVar;
        this.a = fgdm.a(true);
        this.b = true;
    }

    @Override // defpackage.srb
    public final /* bridge */ /* synthetic */ ffxx a(srz srzVar, ffxx ffxxVar) {
        ssg ssgVar = (ssg) srzVar;
        if (this.d == null) {
            ssw sswVar = new ssw(null, this);
            int i = fgau.a;
            fgen fgenVar = new fgen(sswVar, ffxxVar);
            ffsk ffskVar = this.c;
            int i2 = fgcz.a;
            this.d = fgbn.b(fgenVar, ffskVar, fgcy.a, false);
        }
        fgdj fgdjVar = this.d;
        fgdjVar.getClass();
        return new ssu(fgdjVar, this, ssgVar);
    }

    public final void b(ssg ssgVar) {
        this.e.a(ssgVar.a, ssn.b);
        ssgVar.k.invoke();
    }
}
