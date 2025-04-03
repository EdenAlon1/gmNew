package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adig implements adif {
    public static final cskc a = cskc.g("BugleGaia", "OneGoogleUxProviderImpl");
    private final ejht b;

    public adig(ejht ejhtVar) {
        this.b = ejhtVar;
    }

    @Override // defpackage.adif
    public final void a() {
        ekzz f = eleg.f("OneGoogleUxProviderImpl#addOgBottomDialogToScreen");
        try {
            ejht ejhtVar = this.b;
            ejhn ejhnVar = (ejhn) ejhtVar.b.h(ejht.a);
            if (ejhnVar == null) {
                ejhnVar = new ejhn();
                fbae.e(ejhnVar);
                cg cgVar = new cg(ejhtVar.b);
                cgVar.u(ejhnVar, ejht.a);
                cgVar.c();
            }
            ejhs H = ejhnVar.H();
            efbd.c();
            ebpy ebpyVar = H.u;
            ebpyVar.getClass();
            ebpx b = ebpy.b(ebpyVar.b);
            if (b == null) {
                b = new ebpx();
                ebpyVar.a(b);
            }
            eg egVar = ebpyVar.c;
            if ((egVar == null || !egVar.isFinishing()) && !b.aF() && !ebpyVar.b.ai()) {
                b.t(ebpyVar.b, ebpy.a);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
