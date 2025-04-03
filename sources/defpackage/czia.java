package defpackage;

import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageMetadataView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czia {
    public ConversationMessageMetadataView a;

    public final void a(int i, int i2, int i3, int i4) {
        ConversationMessageMetadataView conversationMessageMetadataView = this.a;
        if (conversationMessageMetadataView == null) {
            ffkj.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        conversationMessageMetadataView.layout(i, i2, i3, i4);
    }

    public final void b(boolean z, boolean z2) {
        ConversationMessageMetadataView conversationMessageMetadataView = this.a;
        if (conversationMessageMetadataView == null) {
            ffkj.c("messageMetadataView");
            conversationMessageMetadataView = null;
        }
        conversationMessageMetadataView.d(z, z2);
    }
}
