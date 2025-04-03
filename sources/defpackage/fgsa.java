package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsa {
    public final ffbr a;
    public final ffhd b;
    public final ffbr c;
    private final dris d;

    public fgsa(ffbr ffbrVar, ffhd ffhdVar, dris drisVar, ffbr ffbrVar2) {
        ffhdVar.getClass();
        drisVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffhdVar;
        this.d = drisVar;
        this.c = ffbrVar2;
    }

    public final void a(ffsk ffskVar, ffix ffixVar) {
        boolean booleanValue = ((Boolean) ctjd.bg.e()).booleanValue();
        dris drisVar = this.d;
        if (booleanValue || ((Boolean) ctjd.bd.e()).booleanValue()) {
            fgrt fgrtVar = new fgrt(((woi) this.a.b()).a(), this, ffskVar);
            int i = fgcz.a;
            drisVar.d(fgbn.b(fgrtVar, ffskVar, fgcy.b, drhu.a));
        } else {
            drisVar.d(((woi) this.a.b()).a());
        }
        axol.k(ffskVar, null, new fgrz(this, ffixVar, drisVar, null), 3);
    }
}
