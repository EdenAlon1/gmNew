package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvq implements fbba {
    public static ZeroStateSearchResultsView a(View view) {
        if (!(view instanceof ZeroStateSearchResultsView)) {
            throw new IllegalStateException(a.I(view, ddvm.class, "Attempt to inject a View wrapper of type "));
        }
        ZeroStateSearchResultsView zeroStateSearchResultsView = (ZeroStateSearchResultsView) view;
        zeroStateSearchResultsView.getClass();
        return zeroStateSearchResultsView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
