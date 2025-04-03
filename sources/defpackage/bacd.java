package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacd extends basy {
    public final MessageIdType a;
    private final MessageCoreData b;
    private final ParticipantsTable.BindData c;
    private final ConversationIdType d;
    private final cpxu e;
    private final boolean f;
    private final long g;
    private final int h;
    private final baow i;

    public bacd(MessageCoreData messageCoreData, ParticipantsTable.BindData bindData, MessageIdType messageIdType, ConversationIdType conversationIdType, cpxu cpxuVar, boolean z, long j, int i, baow baowVar) {
        this.b = messageCoreData;
        this.c = bindData;
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.d = conversationIdType;
        this.e = cpxuVar;
        this.f = z;
        this.g = j;
        this.h = i;
        this.i = baowVar;
    }

    @Override // defpackage.basy
    public final int a() {
        return this.h;
    }

    @Override // defpackage.basy
    public final long b() {
        return this.g;
    }

    @Override // defpackage.basy
    public final baow c() {
        return this.i;
    }

    @Override // defpackage.basy
    public final MessageCoreData d() {
        return this.b;
    }

    @Override // defpackage.basy
    public final ConversationIdType e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof basy) {
            basy basyVar = (basy) obj;
            MessageCoreData messageCoreData = this.b;
            if (messageCoreData != null ? messageCoreData.equals(basyVar.d()) : basyVar.d() == null) {
                if (this.c.equals(basyVar.g()) && this.a.equals(basyVar.f()) && this.d.equals(basyVar.e()) && this.e.equals(basyVar.h()) && this.f == basyVar.i() && this.g == basyVar.b() && this.h == basyVar.a() && this.i.equals(basyVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.basy
    public final MessageIdType f() {
        return this.a;
    }

    @Override // defpackage.basy
    public final ParticipantsTable.BindData g() {
        return this.c;
    }

    @Override // defpackage.basy
    public final cpxu h() {
        return this.e;
    }

    public final int hashCode() {
        MessageCoreData messageCoreData = this.b;
        int hashCode = (((((((((messageCoreData == null ? 0 : messageCoreData.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        int i = true != this.f ? 1237 : 1231;
        long j = this.g;
        return (((((((hashCode * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.basy
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        baow baowVar = this.i;
        cpxu cpxuVar = this.e;
        ConversationIdType conversationIdType = this.d;
        MessageIdType messageIdType = this.a;
        ParticipantsTable.BindData bindData = this.c;
        return "LaunchCriticalActionsParams{message=" + String.valueOf(this.b) + ", sender=" + bindData.toString() + ", messageId=" + messageIdType.toString() + ", conversationId=" + conversationIdType.toString() + ", threadId=" + cpxuVar.toString() + ", newConversation=" + this.f + ", receivedTime=" + this.g + ", subId=" + this.h + ", rawSmsMessagingAddress=" + baowVar.toString() + "}";
    }
}
