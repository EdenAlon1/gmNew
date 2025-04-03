package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface aeac {
    Optional a();

    void b();

    void c();

    void e(ConversationId conversationId, bcyl bcylVar, boolean z);

    @Deprecated
    void f(ConversationId conversationId, MessageIdType messageIdType, bcyl bcylVar, boolean z);

    void g();

    void h(ActionMode.Callback callback, View view, String str);

    void i();
}
