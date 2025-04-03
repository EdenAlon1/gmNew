package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzgo implements bzgi {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/ditto/directrcs/CryptoKeyDataServiceImpl");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;
    private final ffbz e;

    public bzgo(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.d = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = ffca.a(new ffix() { // from class: bzgj
            @Override // defpackage.ffix
            public final Object invoke() {
                efbd.b();
                comy comyVar = (comy) bzgo.this.b.b();
                comu c = comv.c();
                c.d(comb.DITTO_RCS_CRYPTO_KEY_SETTINGS);
                c.f(bzgg.a);
                return comyVar.a(c.a());
            }
        });
    }

    @Override // defpackage.bzgi
    public final elfl a() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new bzgl(this, null));
        return c;
    }

    @Override // defpackage.bzgi
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new bzgn(this, null));
        return c;
    }

    public final comc c() {
        return (comc) this.e.a();
    }
}
