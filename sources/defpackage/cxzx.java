package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzx extends ddwq {
    final /* synthetic */ cxyp a;
    final /* synthetic */ cyag b;

    public cxzx(cyag cyagVar, cxyp cxypVar) {
        this.a = cxypVar;
        this.b = cyagVar;
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        cxyp cxypVar;
        cyag cyagVar = this.b;
        int i = cyagVar.r - 1;
        cyagVar.r = i;
        if (i != 0 || (cxypVar = this.a) == null) {
            return;
        }
        cxypVar.a(cyagVar);
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.r++;
        cxyp cxypVar = this.a;
        if (cxypVar != null) {
            cxypVar.b();
        }
    }
}
