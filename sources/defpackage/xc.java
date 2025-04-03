package defpackage;

import android.support.v7.widget.SearchView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xc implements Runnable {
    final /* synthetic */ SearchView a;

    public xc(SearchView searchView) {
        this.a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kzl kzlVar = this.a.mSuggestionsAdapter;
        if (kzlVar instanceof yl) {
            kzlVar.e(null);
        }
    }
}
