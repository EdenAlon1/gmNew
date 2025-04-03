package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgw extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ehhg b;
    private boolean c;

    public ehgw(ehhg ehhgVar, boolean z) {
        this.a = z;
        this.b = ehhgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ehhg ehhgVar = this.b;
        ehhgVar.A = 0;
        ehhgVar.v = null;
        if (this.c) {
            return;
        }
        FloatingActionButton floatingActionButton = ehhgVar.B;
        boolean z = this.a;
        floatingActionButton.g(true != z ? 4 : 8, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.B.g(0, this.a);
        ehhg ehhgVar = this.b;
        ehhgVar.A = 1;
        ehhgVar.v = animator;
        this.c = false;
    }
}
