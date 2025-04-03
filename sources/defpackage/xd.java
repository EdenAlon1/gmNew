package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xd implements View.OnFocusChangeListener {
    final /* synthetic */ SearchView a;

    public xd(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
