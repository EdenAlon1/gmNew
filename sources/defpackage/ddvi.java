package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvi implements fbba {
    public static ZeroStateSearchMultipleResultsView a(View view) {
        if (!(view instanceof ZeroStateSearchMultipleResultsView)) {
            throw new IllegalStateException(a.I(view, ddve.class, "Attempt to inject a View wrapper of type "));
        }
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView = (ZeroStateSearchMultipleResultsView) view;
        zeroStateSearchMultipleResultsView.getClass();
        return zeroStateSearchMultipleResultsView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
