package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dweb extends dwec {
    private final Choreographer a = Choreographer.getInstance();

    @Override // defpackage.dwec
    public final void a(dwea dweaVar) {
        this.a.postFrameCallback(dweaVar.b());
    }

    @Override // defpackage.dwec
    public final void b(dwea dweaVar) {
        this.a.removeFrameCallback(dweaVar.b());
    }
}
