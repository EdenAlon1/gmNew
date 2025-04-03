package defpackage;

import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xh implements TextView.OnEditorActionListener {
    final /* synthetic */ SearchView a;

    public xh(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.onSubmitQuery();
        return true;
    }
}
