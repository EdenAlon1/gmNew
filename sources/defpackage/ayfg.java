package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface ayfg {
    void A(Context context, ConversationId conversationId);

    void B(Context context, ConversationId conversationId, MessageIdType messageIdType);

    void C(Context context, ConversationId conversationId, bcyl bcylVar);

    void D(Context context, ConversationId conversationId, bdiz bdizVar, boolean z, Bundle bundle);

    void E(Context context, ConversationId conversationId, MessageIdType messageIdType, String str);

    void F(Context context, ConversationId conversationId, bdiz bdizVar, Bundle bundle, Optional optional, boolean z);

    @Deprecated
    void G(Context context, ConversationId conversationId, IncomingDraft incomingDraft, Bundle bundle, boolean z);

    int a(Intent intent, ConversationId conversationId);

    PendingIntent b(Context context);

    PendingIntent c(Context context, ephx ephxVar);

    Intent d(Context context);

    Intent e(Context context);

    void f(Context context, ConversationId conversationId, Optional optional, boolean z);

    void g(Context context);

    void h(Context context);

    void i(Context context);

    void j(Context context, Bundle bundle);

    Intent k(Context context, ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, String str, boolean z);

    Intent l(Context context, ConversationId conversationId, bcyl bcylVar, boolean z, boolean z2);

    Intent m(Context context, ConversationId conversationId);

    Intent n(Context context, ConversationId conversationId, MessageCoreData messageCoreData, boolean z, Bundle bundle);

    PendingIntent o(Context context, ConversationId conversationId, ephx ephxVar, boolean z);

    PendingIntent p(Context context, ConversationId conversationId, boolean z);

    PendingIntent q(Context context, ConversationId conversationId, MessageIdType messageIdType, String str);

    void r(Context context, ConversationId conversationId, MessageId messageId, Uri uri);

    void s(Context context, ConversationId conversationId, MessageId messageId, Uri uri);

    void t(Context context, ConversationId conversationId, MessageIdType messageIdType, Integer num, bdiz bdizVar, bcyl bcylVar, Bundle bundle, String str, boolean z);

    void u(Context context, ConversationId conversationId, Integer num, MessageCoreData messageCoreData, boolean z, Bundle bundle);

    void w(Context context, ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, String str, boolean z);

    void x(Context context, ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, Optional optional, boolean z, int i);

    boolean y(Activity activity, int i, ConversationId conversationId, ComposeRowState composeRowState, IncomingDraft incomingDraft, Integer num, MessageCoreData messageCoreData, bcyl bcylVar, boolean z);

    void z(Context context, ConversationId conversationId, Integer num, bdiz bdizVar, boolean z);
}
