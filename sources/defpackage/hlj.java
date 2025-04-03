package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlj extends hmq {
    public static final hlj a = new hlj();

    private hlj() {
        super(0, 2, 1);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        hpz hpzVar = (hpz) hmvVar.c(1);
        int i = hpzVar != null ? hpzVar.a : 0;
        hle hleVar = (hle) hmvVar.c(0);
        if (i > 0) {
            hepVar = new hht(hepVar, i);
        }
        hleVar.b(hepVar, hjvVar, hjjVar, hmrVar != null ? new hmt(hmrVar, hjvVar) : null);
    }
}
