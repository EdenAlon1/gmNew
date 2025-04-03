package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddun implements fbba {
    public static StarredMessagesResultItemView a(View view) {
        if (!(view instanceof StarredMessagesResultItemView)) {
            throw new IllegalStateException(a.I(view, dduk.class, "Attempt to inject a View wrapper of type "));
        }
        StarredMessagesResultItemView starredMessagesResultItemView = (StarredMessagesResultItemView) view;
        starredMessagesResultItemView.getClass();
        return starredMessagesResultItemView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
