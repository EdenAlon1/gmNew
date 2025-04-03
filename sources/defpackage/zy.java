package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zy extends aaf {
    final /* synthetic */ int a;
    final /* synthetic */ wr b;
    final /* synthetic */ aai c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(aai aaiVar, wr wrVar, int i, float f, float f2, float f3, float f4, int i2, wr wrVar2) {
        super(wrVar, i, f, f2, f3, f4);
        this.c = aaiVar;
        this.a = i2;
        this.b = wrVar2;
    }

    @Override // defpackage.aaf, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        if (this.a <= 0) {
            aai aaiVar = this.c;
            aaiVar.j.n(this.b);
        } else {
            this.c.a.add(this.b.a);
            this.k = true;
            int i = this.a;
            if (i > 0) {
                aai aaiVar2 = this.c;
                aaiVar2.m.post(new zz(aaiVar2, this, i));
            }
        }
        aai aaiVar3 = this.c;
        wr wrVar = this.b;
        View view = aaiVar3.p;
        View view2 = wrVar.a;
        if (view == view2) {
            aaiVar3.l(view2);
        }
    }
}
