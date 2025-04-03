package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzm extends ddwq {
    final /* synthetic */ cxyp a;
    final /* synthetic */ cxzp b;

    public cxzm(cxzp cxzpVar, cxyp cxypVar) {
        this.a = cxypVar;
        this.b = cxzpVar;
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        cxzp cxzpVar = this.b;
        int i = cxzpVar.j - 1;
        cxzpVar.j = i;
        if (i == 0) {
            this.a.a(cxzpVar);
        }
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.j++;
    }
}
