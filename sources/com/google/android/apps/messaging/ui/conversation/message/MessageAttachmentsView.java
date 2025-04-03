package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import defpackage.bcse;
import defpackage.cxqh;
import defpackage.czkw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageAttachmentsView extends czkw {
    public bcse a;
    public ConversationMessageView b;
    public MessageAttachmentContainer c;
    public ConversationMessageTransferView d;
    public cxqh e;

    public MessageAttachmentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void c(bcse bcseVar) {
        this.a = bcseVar;
        ConversationMessageView conversationMessageView = this.b;
        if (conversationMessageView != null) {
            ConversationMessageTransferView conversationMessageTransferView = this.d;
            conversationMessageTransferView.b = conversationMessageView;
            conversationMessageTransferView.a(bcseVar);
        }
    }

    public final void d() {
        int childCount = this.c.getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                i = 8;
                break;
            } else if (this.c.getChildAt(i2).getVisibility() == 0) {
                break;
            } else {
                i2++;
            }
        }
        setVisibility(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (MessageAttachmentContainer) findViewById(R.id.message_attachments_container);
        this.d = (ConversationMessageTransferView) findViewById(R.id.transfer_state);
    }
}
