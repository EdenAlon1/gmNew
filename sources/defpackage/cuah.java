package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuah {
    public static final cskc a = cskc.g("Bugle", "GoogleTosHelper");
    public final ffbr b;
    public final csjk c;
    private final ffbr d;

    public cuah(ffbr ffbrVar, csjk csjkVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = csjkVar;
        this.d = ffbrVar2;
    }

    @Deprecated
    public final boolean a() {
        eqwf d = ((ckge) this.c.a()).d();
        if (d != eqwf.CARRIER_SETUP_PENDING && d != eqwf.DISABLED_FROM_PREFERENCES && (!((aunc) this.d.b()).a() || !new djtc(d).b())) {
            csjb a2 = a.a();
            a2.I("Don't show Google ToS because rcs availability is not ready for provisioning");
            a2.A("RCS availability:", d.toString());
            a2.r();
            return false;
        }
        if (dimo.b()) {
            csjb a3 = a.a();
            a3.I("Show Google ToS");
            a3.r();
            return true;
        }
        csjb a4 = a.a();
        a4.I("Not showing Google ToS");
        a4.r();
        return false;
    }
}
