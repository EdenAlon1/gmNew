package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlv extends hmq {
    public static final hlv a = new hlv();

    private hlv() {
        super(1, 2);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        Object invoke = ((ffix) hmvVar.c(0)).invoke();
        hen henVar = (hen) hmvVar.c(1);
        int a2 = hmvVar.a(0);
        hjvVar.R(hjvVar.a(henVar), invoke);
        hepVar.j(a2, invoke);
        hepVar.d(invoke);
    }

    @Override // defpackage.hmq
    protected final hen b(hmv hmvVar) {
        return (hen) hmvVar.c(1);
    }
}
