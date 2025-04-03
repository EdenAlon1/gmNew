package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehnx extends AnimatorListenerAdapter {
    final /* synthetic */ ehoc a;

    public ehnx(ehoc ehocVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.setVisibility(0);
        SearchBar searchBar = this.a.g;
        ehnb ehnbVar = searchBar.D;
        View view = searchBar.E;
        if (view instanceof egyu) {
            ((egyu) view).a();
        }
        if (view != 0) {
            view.setAlpha(0.0f);
        }
    }
}
