package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hma extends hmq {
    public static final hma a = new hma();

    private hma() {
        super(1, 1);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        hen henVar = (hen) hmvVar.c(0);
        int a2 = hmvVar.a(0);
        hepVar.h();
        hepVar.i(a2, hjvVar.w(hjvVar.a(henVar)));
    }

    @Override // defpackage.hmq
    protected final hen b(hmv hmvVar) {
        return (hen) hmvVar.c(0);
    }
}
