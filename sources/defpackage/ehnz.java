package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehnz extends AnimatorListenerAdapter {
    final /* synthetic */ ehoc a;

    public ehnz(ehoc ehocVar) {
        this.a = ehocVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SearchView searchView = this.a.a;
        if (!searchView.m()) {
            searchView.g();
        }
        this.a.a.n(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.setVisibility(0);
        this.a.a.n(3);
    }
}
