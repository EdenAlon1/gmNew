package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvu implements fbba {
    public static SearchConversationResultItemView a(View view) {
        if (!(view instanceof SearchConversationResultItemView)) {
            throw new IllegalStateException(a.I(view, ddvr.class, "Attempt to inject a View wrapper of type "));
        }
        SearchConversationResultItemView searchConversationResultItemView = (SearchConversationResultItemView) view;
        searchConversationResultItemView.getClass();
        return searchConversationResultItemView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
