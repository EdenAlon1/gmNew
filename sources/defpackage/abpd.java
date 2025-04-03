package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpd implements aboy {
    public final abpg a;
    private final ffsk b;
    private final ffbr c;
    private final aawr d;

    public abpd(ffsk ffskVar, abpg abpgVar, aawr aawrVar, @ashe ffbr ffbrVar) {
        ffskVar.getClass();
        abpgVar.getClass();
        aawrVar.getClass();
        ffbrVar.getClass();
        this.b = ffskVar;
        this.a = abpgVar;
        this.d = aawrVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.aboy
    public final ffxx a() {
        if (!((Boolean) this.c.b()).booleanValue()) {
            return new ffyg(null);
        }
        ffxx a = ffyy.a(new abpb(this.d.f));
        abpc abpcVar = new abpc(null, this);
        int i = fgau.a;
        fgen fgenVar = new fgen(abpcVar, a);
        ffsk ffskVar = this.b;
        int i2 = fgcz.a;
        return fgbn.b(fgenVar, ffskVar, fgcy.a(0L, 3), null);
    }
}
