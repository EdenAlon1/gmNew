package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xe implements View.OnLayoutChangeListener {
    final /* synthetic */ SearchView a;

    public xe(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.adjustDropDownSizeAndPosition();
    }
}
