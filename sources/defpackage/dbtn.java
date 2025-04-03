package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtn implements dbtj {
    public static final cskc a = cskc.g("BugleGDitto", "DevicePairingEntryPoint");
    public final ea b;
    public final eisx c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final ejlq h;
    private final ffbr i;
    private final ejlr j = new dbtk(this);
    private final ejlr k = new dbtl(this);
    private final ejlr l = new dbtm();

    public dbtn(ea eaVar, eisx eisxVar, ejlq ejlqVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = eaVar;
        this.c = eisxVar;
        this.h = ejlqVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.i = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
    }

    @Override // defpackage.dbtj
    public final void a() {
        this.h.g(new ejlp(((bzib) this.i.b()).c()), this.j);
    }

    @Override // defpackage.dbtj
    public final void b() {
        this.h.g(new ejlp(((bzib) this.i.b()).d()), this.k);
    }

    @Override // defpackage.dbtj
    public final void c() {
        this.h.k(this.j);
        this.h.k(this.k);
        this.h.k(this.l);
    }

    @Override // defpackage.dbtj
    public final void d() {
        ((enrr) a.i().h("com/google/android/apps/messaging/ui/gaia/DevicePairingEntryPointImpl", "launchGaiaPairing", 113, "DevicePairingEntryPointImpl.java")).q("Launching GaiaPairing page.");
        ((dbtr) this.d.b()).a(this.b.fe(), true);
    }
}
