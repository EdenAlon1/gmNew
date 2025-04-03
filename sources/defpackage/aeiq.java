package defpackage;

import android.view.View;
import com.google.android.apps.messaging.home.list.ConversationListItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeiq implements fbba {
    public static ConversationListItemView a(View view) {
        if (!(view instanceof ConversationListItemView)) {
            throw new IllegalStateException(a.I(view, aein.class, "Attempt to inject a View wrapper of type "));
        }
        ConversationListItemView conversationListItemView = (ConversationListItemView) view;
        conversationListItemView.getClass();
        return conversationListItemView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
