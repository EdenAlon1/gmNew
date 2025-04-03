package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlx extends hmq {
    public static final hlx a = new hlx();

    private hlx() {
        super(0, 3, 1);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        hmt hmtVar;
        hjr hjrVar = (hjr) hmvVar.c(1);
        hen henVar = (hen) hmvVar.c(0);
        hlg hlgVar = (hlg) hmvVar.c(2);
        hjv d = hjrVar.d();
        if (hmrVar != null) {
            try {
                hmtVar = new hmt(hmrVar, hjvVar);
            } catch (Throwable th) {
                d.A(false);
                throw th;
            }
        } else {
            hmtVar = null;
        }
        if (!hlgVar.b.d()) {
            hfp.j("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        hlgVar.a.b(hepVar, d, hjjVar, hmtVar);
        d.A(true);
        hjvVar.z();
        hjvVar.Z(hjrVar, hjrVar.a(henVar));
        hjvVar.B();
    }
}
