package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bace extends basz {
    public final MessageIdType a;
    public final ConversationIdType b;
    public final ParticipantsTable.BindData c;
    public final cpxu d;
    public final boolean e;
    public final long f;
    public final int g;
    public final baow h;

    public bace(MessageIdType messageIdType, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, cpxu cpxuVar, boolean z, long j, int i, baow baowVar) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = conversationIdType;
        this.c = bindData;
        this.d = cpxuVar;
        this.e = z;
        this.f = j;
        this.g = i;
        this.h = baowVar;
    }

    @Override // defpackage.basz
    public final int a() {
        return this.g;
    }

    @Override // defpackage.basz
    public final long b() {
        return this.f;
    }

    @Override // defpackage.basz
    public final baow c() {
        return this.h;
    }

    @Override // defpackage.basz
    public final ConversationIdType d() {
        return this.b;
    }

    @Override // defpackage.basz
    public final MessageIdType e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof basz) {
            basz baszVar = (basz) obj;
            if (this.a.equals(baszVar.e()) && this.b.equals(baszVar.d()) && this.c.equals(baszVar.f()) && this.d.equals(baszVar.g()) && this.e == baszVar.h() && this.f == baszVar.b() && this.g == baszVar.a() && this.h.equals(baszVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.basz
    public final ParticipantsTable.BindData f() {
        return this.c;
    }

    @Override // defpackage.basz
    public final cpxu g() {
        return this.d;
    }

    @Override // defpackage.basz
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        long j = this.f;
        return ((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        baow baowVar = this.h;
        cpxu cpxuVar = this.d;
        ParticipantsTable.BindData bindData = this.c;
        ConversationIdType conversationIdType = this.b;
        return "LaunchNonCriticalActionsParams{messageId=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", sender=" + bindData.toString() + ", threadId=" + cpxuVar.toString() + ", newConversation=" + this.e + ", receivedTime=" + this.f + ", subId=" + this.g + ", rawSmsMessagingAddress=" + baowVar.toString() + "}";
    }
}
