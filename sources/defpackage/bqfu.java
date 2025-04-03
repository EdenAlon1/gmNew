package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfu extends duak {
    public bqfu() {
        super("business_conversations_metadata");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqft b() {
        ah();
        return new bqft(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final boolean c(ConversationIdType conversationIdType) {
        String[] strArr = bqfx.a;
        bqfw bqfwVar = new bqfw();
        bqfwVar.b(conversationIdType);
        return aj(new bqfv(bqfwVar), "business_conversations_metadata-buildAndUpdateForConversationId");
    }

    public final void d(aven avenVar) {
        if (avenVar == null) {
            this.a.putNull("chatbot_directory_conversation_state");
        } else {
            this.a.put("chatbot_directory_conversation_state", Integer.valueOf(avenVar.a()));
        }
    }

    public final void e(avji avjiVar) {
        int intValue = bqfx.c().intValue();
        int intValue2 = bqfx.c().intValue();
        if (intValue2 < 59050) {
            dtub.w("conversation_toolstone_state", intValue2);
        }
        if (intValue >= 59050) {
            if (avjiVar == null) {
                this.a.putNull("conversation_toolstone_state");
            } else {
                this.a.put("conversation_toolstone_state", Integer.valueOf(avjiVar.a()));
            }
        }
    }

    public final void f(long j) {
        int intValue = bqfx.c().intValue();
        int intValue2 = bqfx.c().intValue();
        if (intValue2 < 59050) {
            dtub.w("conversation_toolstone_timestamp_ms", intValue2);
        }
        if (intValue >= 59050) {
            this.a.put("conversation_toolstone_timestamp_ms", Long.valueOf(j));
        }
    }
}
