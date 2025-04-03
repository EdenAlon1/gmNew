package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.conversation.settings.InfoAndOptionsActivity;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzx {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public vzx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Deprecated
    public static final void e(Context context, ConversationIdType conversationIdType, String str) {
        Intent intent = new Intent(context, (Class<?>) InfoAndOptionsActivity.class);
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        intent.putExtra("is_rcs_conversation", true);
        intent.putExtra("is_group_conversation", false);
        intent.putExtra("rbm_bot_id", str);
        context.startActivity(intent);
    }

    public final Intent a(Context context, boolean z, int i, boolean z2, String str, int i2, ayhd ayhdVar) {
        Intent intent = new Intent(context, (Class<?>) ConversationDetailsActivity.class);
        intent.putExtra("is_rcs_conversation", z);
        intent.putExtra("is_group_conversation", true);
        intent.putExtra("conversation_state", i);
        intent.putExtra("global_rcs_group_name", str);
        intent.putExtra("conversation_error_state", ayhdVar.a());
        intent.putExtra("is_e2ee_rcs_conversation", z2);
        intent.putExtra("conversation_settings_launch_source", i2);
        if (((askw) this.d.b()).a()) {
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        return intent;
    }

    public final Intent b(Context context, boolean z, int i, boolean z2, boolean z3, int i2, int i3) {
        Intent intent = new Intent(context, (Class<?>) ConversationDetailsActivity.class);
        intent.putExtra("is_rcs_conversation", z);
        intent.putExtra("is_group_conversation", false);
        intent.putExtra("conversation_state", i);
        if (((askw) this.d.b()).a()) {
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        if (((bzqa) this.c.b()).r()) {
            intent.putExtra("is_e2ee_rcs_conversation", z2);
            intent.putExtra("has_been_e2ee", z3);
            intent.putExtra("conversation_send_mode", i3);
            intent.putExtra("conversation_settings_launch_source", i2);
        }
        return intent;
    }

    @Deprecated
    public final void c(Context context, ConversationIdType conversationIdType, boolean z, int i, boolean z2, String str, int i2, ayhd ayhdVar) {
        Intent a = a(context, z, i, z2, str, i2, ayhdVar);
        a.putExtra("conversation_id", conversationIdType.a());
        a.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        eldl.p(context, a);
        ((akzt) this.a.b()).e("Bugle.UI.PeopleAndOptions", i2);
    }

    @Deprecated
    public final void d(Context context, ConversationIdType conversationIdType, boolean z, int i, boolean z2, boolean z3, int i2, int i3) {
        Intent b = b(context, z, i, z2, z3, i2, i3);
        b.putExtra("conversation_id", conversationIdType.a());
        b.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        eldl.p(context, b);
    }
}
