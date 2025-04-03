package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndh extends cndi {
    public final ConversationIdType a;
    public final int b;
    public final SelfIdentityId c;
    public final cmtd d;
    public final cmqj e;

    public cndh(ConversationIdType conversationIdType, int i, SelfIdentityId selfIdentityId, cmtd cmtdVar, cmqj cmqjVar) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
        this.b = i;
        this.c = selfIdentityId;
        this.d = cmtdVar;
        this.e = cmqjVar;
    }

    @Override // defpackage.cndi
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cndi
    public final SelfIdentityId b() {
        return this.c;
    }

    @Override // defpackage.cndi
    public final ConversationIdType c() {
        return this.a;
    }

    @Override // defpackage.cndi
    public final cmqj d() {
        return this.e;
    }

    @Override // defpackage.cndi
    public final cmtd e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        SelfIdentityId selfIdentityId;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cndi) {
            cndi cndiVar = (cndi) obj;
            if (this.a.equals(cndiVar.c()) && this.b == cndiVar.a() && ((selfIdentityId = this.c) != null ? selfIdentityId.equals(cndiVar.b()) : cndiVar.b() == null) && this.d.equals(cndiVar.e()) && this.e.equals(cndiVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        SelfIdentityId selfIdentityId = this.c;
        return (((((((hashCode * 1000003) ^ this.b) * 1000003) ^ (selfIdentityId == null ? 0 : selfIdentityId.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        cmqj cmqjVar = this.e;
        cmtd cmtdVar = this.d;
        SelfIdentityId selfIdentityId = this.c;
        return "ReactionSendData{conversationId=" + this.a.toString() + ", subId=" + this.b + ", selfId=" + String.valueOf(selfIdentityId) + ", reactedMessageData=" + cmtdVar.toString() + ", reactionSendLoggingInfo=" + cmqjVar.toString() + "}";
    }
}
