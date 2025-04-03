package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cq extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ hi d;
    final /* synthetic */ cr e;

    public cq(ViewGroup viewGroup, View view, boolean z, hi hiVar, cr crVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = hiVar;
        this.e = crVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.endViewTransition(this.b);
        if (this.c) {
            hi hiVar = this.d;
            View view = this.b;
            int i = hiVar.h;
            view.getClass();
            hh.b(i, view, this.a);
        }
        cr crVar = this.e;
        crVar.a.a.f(crVar);
        if (fr.af(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
        }
    }
}
