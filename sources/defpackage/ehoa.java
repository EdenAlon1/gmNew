package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehoa extends AnimatorListenerAdapter {
    final /* synthetic */ ehoc a;

    public ehoa(ehoc ehocVar) {
        this.a = ehocVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.setVisibility(8);
        SearchView searchView = this.a.a;
        if (!searchView.m()) {
            searchView.d();
        }
        this.a.a.n(2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.n(1);
    }
}
