package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.homeview.CategoryGroupItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddoi implements fbba {
    public static CategoryGroupItemView a(View view) {
        if (!(view instanceof CategoryGroupItemView)) {
            throw new IllegalStateException(a.I(view, ddof.class, "Attempt to inject a View wrapper of type "));
        }
        CategoryGroupItemView categoryGroupItemView = (CategoryGroupItemView) view;
        categoryGroupItemView.getClass();
        return categoryGroupItemView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
