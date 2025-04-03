package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sql {
    public final ffhd a;
    private final ffbz b;

    public sql(final ffbr ffbrVar, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffhdVar.getClass();
        this.a = ffhdVar;
        this.b = ffca.a(new ffix() { // from class: sqh
            @Override // defpackage.ffix
            public final Object invoke() {
                comu c = comv.c();
                c.d(comb.D2D_SOURCE_SESSION_DATA);
                c.f(sra.a);
                return ((comy) ffbr.this.b()).a(c.a());
            }
        });
    }

    public final comc a() {
        return (comc) this.b.a();
    }
}
