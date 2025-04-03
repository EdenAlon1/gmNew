package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyaa extends ddwq {
    final /* synthetic */ cxyp a;
    final /* synthetic */ cyag b;

    public cyaa(cyag cyagVar, cxyp cxypVar) {
        this.a = cxypVar;
        this.b = cyagVar;
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.b.k(this.a);
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.G();
    }
}
