package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddti implements fbba {
    public static ResultsFilterView a(View view) {
        if (!(view instanceof ResultsFilterView)) {
            throw new IllegalStateException(a.I(view, ddtf.class, "Attempt to inject a View wrapper of type "));
        }
        ResultsFilterView resultsFilterView = (ResultsFilterView) view;
        resultsFilterView.getClass();
        return resultsFilterView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
