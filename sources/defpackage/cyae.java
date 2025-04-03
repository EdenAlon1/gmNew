package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyae extends ddwq {
    final /* synthetic */ float a;
    final /* synthetic */ cyaf b;

    public cyae(cyaf cyafVar, float f) {
        this.a = f;
        this.b = cyafVar;
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        cyaf cyafVar = this.b;
        cyag cyagVar = cyafVar.i;
        cyagVar.s--;
        cyafVar.h = true;
        cyagVar.t = false;
        if (this.a != cyafVar.g) {
            cyagVar.u = true;
            this.b.i.l(false);
            cyag cyagVar2 = this.b.i;
            cxyp cxypVar = cyagVar2.y;
            if (cxypVar != null) {
                cxypVar.a(cyagVar2);
            }
        }
        ((ensz) ((ensz) cyag.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController$BannerCardView$1", "onTransitionEnd", 1436, "FullBannerUiController.java")).q("Banner swiped away");
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        cxyp cxypVar;
        cyaf cyafVar = this.b;
        cyag cyagVar = cyafVar.i;
        cyagVar.s++;
        if (this.a == cyafVar.g || (cxypVar = cyagVar.y) == null) {
            return;
        }
        cxypVar.b();
    }
}
