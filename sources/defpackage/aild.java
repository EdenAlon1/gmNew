package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aild implements aigt {
    private final Context a;

    public aild(Context context, vzx vzxVar) {
        vzxVar.getClass();
        this.a = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        ailc ailcVar = (ailc) aihsVar;
        Activity a = ddxb.a(this.a);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ConversationId conversationId = ailcVar.a;
        String str = ailcVar.b;
        Intent intent = new Intent(a, (Class<?>) InfoAndOptionsActivity.class);
        intent.putExtra("conversation_id", conversationId.b());
        intent.putExtra("mapi_conversation_id", conversationId);
        intent.putExtra("mapi_conversation_kind", conversationId.a().a());
        intent.putExtra("is_rcs_conversation", true);
        intent.putExtra("is_group_conversation", false);
        intent.putExtra("rbm_bot_id", str);
        eldl.p(a, intent);
        return ffcu.a;
    }
}
