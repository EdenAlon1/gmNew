package defpackage;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amet {
    private final ffbr a;

    public amet(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static final void b(ConversationId conversationId, BaseBundle baseBundle) {
        if (conversationId != InvalidConversationId.a) {
            baseBundle.putString("conversation_id", conversationId.b());
            baseBundle.putInt("mapi_conversation_kind", conversationId.a().a());
        }
    }

    public static final void c(ConversationId conversationId, Bundle bundle) {
        if (conversationId != InvalidConversationId.a) {
            b(conversationId, bundle);
            bundle.putParcelable("mapi_conversation_id", conversationId);
        }
    }

    public static final void d(ConversationId conversationId, Intent intent, boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            b(conversationId, bundle);
        } else {
            c(conversationId, bundle);
        }
        intent.putExtras(bundle);
    }

    public final ConversationId a(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        extras.getClass();
        ConversationId conversationId = (ConversationId) extras.getParcelable("mapi_conversation_id");
        if (conversationId != null) {
            return conversationId;
        }
        String string = extras.getString("conversation_id");
        if (string == null) {
            return null;
        }
        ConversationIdType b = bdgq.b(string);
        if (b.b()) {
            return null;
        }
        amwj amwjVar = (amwj) amwl.a.createBuilder();
        String a = b.a();
        amwjVar.copyOnWrite();
        amwl amwlVar = (amwl) amwjVar.instance;
        a.getClass();
        amwlVar.c = a;
        int i = extras.getInt("mapi_conversation_kind", amwk.UNKNOWN.a());
        amwjVar.copyOnWrite();
        ((amwl) amwjVar.instance).b = i;
        amwl amwlVar2 = (amwl) amwjVar.build();
        amwk b2 = amwk.b(amwlVar2.b);
        if (b2 == null) {
            b2 = amwk.UNRECOGNIZED;
        }
        return b2 != amwk.UNKNOWN ? ((alxl) this.a.b()).b(amwlVar2) : new BugleConversationId(b);
    }
}
