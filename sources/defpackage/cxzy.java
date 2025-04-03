package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzy extends ddwq {
    final /* synthetic */ cxyp a;
    final /* synthetic */ cyag b;

    public cxzy(cyag cyagVar, cxyp cxypVar) {
        this.a = cxypVar;
        this.b = cyagVar;
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        r2.s--;
        this.b.u = true;
        cyag cyagVar = this.b;
        if (cyagVar.r == 0) {
            this.a.a(cyagVar);
        }
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.s++;
        this.a.b();
    }
}
