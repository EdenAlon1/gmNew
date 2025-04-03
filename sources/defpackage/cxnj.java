package defpackage;

import android.animation.Animator;
import android.animation.LayoutTransition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxnj implements Animator.AnimatorListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ cxnk c;

    public cxnj(cxnk cxnkVar, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = cxnkVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        cylx cylxVar = this.c.g;
        if (cylxVar != null) {
            cylxVar.aB(false);
        }
        cxnk cxnkVar = this.c;
        cxnkVar.A = cxnkVar.b.getHeight() == 0 ? 5 : 3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cylx cylxVar = this.c.g;
        if (cylxVar != null) {
            cylxVar.aB(false);
        }
        if (this.a == 0) {
            cxnk cxnkVar = this.c;
            cxnkVar.A = 5;
            cxnkVar.s.setVisibility(8);
        } else {
            cxnk cxnkVar2 = this.c;
            cxnkVar2.A = 3;
            cxnkVar2.b.setLayoutTransition(cxnkVar2.c);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        cylx cylxVar = this.c.g;
        if (cylxVar != null) {
            cylxVar.aB(true);
            cxnk cxnkVar = this.c;
            int i = this.a;
            int i2 = this.b;
            upx upxVar = ((vvn) cxnkVar.g).cx.aB;
            upxVar.k(upxVar.e.d + (i - i2));
        }
        if (this.a > 0) {
            this.c.s.setVisibility(0);
        }
        LayoutTransition layoutTransition = this.c.b.getLayoutTransition();
        if (layoutTransition != null) {
            Animator animator2 = layoutTransition.getAnimator(0);
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = layoutTransition.getAnimator(1);
            if (animator3 != null) {
                animator3.cancel();
            }
            this.c.b.setLayoutTransition(null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
