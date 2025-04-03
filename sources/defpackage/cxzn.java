package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzn extends ddwq {
    final /* synthetic */ cxyp a;
    final /* synthetic */ cxzp b;

    public cxzn(cxzp cxzpVar, cxyp cxypVar) {
        this.a = cxypVar;
        this.b = cxzpVar;
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        cxyp cxypVar;
        cxzp cxzpVar = this.b;
        int i = cxzpVar.j - 1;
        cxzpVar.j = i;
        if (i != 0 || (cxypVar = this.a) == null) {
            return;
        }
        cxypVar.a(cxzpVar);
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.j++;
    }
}
