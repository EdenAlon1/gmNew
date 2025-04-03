package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akns implements adgg {
    public static final cfup a = cfvl.i(cfvl.b, "enable_samsung_mms_controller", true);
    private final akmj b;
    private final aurq c;

    public akns(akmj akmjVar, aurq aurqVar) {
        this.b = akmjVar;
        this.c = aurqVar;
    }

    @Override // defpackage.adgg
    public final elfl a() {
        return ((ersq) ((auri) this.c).a.b()).a("bugle.read_samsung_bit_in_samsung_mms_controller") ? this.b.a() ? a.b() : elfo.e(false) : a.b();
    }
}
