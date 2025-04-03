package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfkw {
    public final ffbr a;
    private final ffbz b;

    public cfkw(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffca.a(new ffix() { // from class: cfkv
            @Override // defpackage.ffix
            public final Object invoke() {
                efbd.b();
                comy comyVar = (comy) cfkw.this.a.b();
                comu c = comv.c();
                c.d(comb.HEAVY_OPERATION_SEQUENCER_STATE);
                c.f(cflb.a);
                return comyVar.a(c.a());
            }
        });
    }

    public final comc a() {
        return (comc) this.b.a();
    }
}
