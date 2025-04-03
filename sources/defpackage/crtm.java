package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crtm extends crwx {
    private final bseh a;
    private final engw b;
    private final ParticipantsTable.BindData c;
    private final MessageCoreData d;
    private final boolean e;
    private final long f;
    private final enhk g;

    public crtm(bseh bsehVar, engw engwVar, ParticipantsTable.BindData bindData, MessageCoreData messageCoreData, boolean z, long j, enhk enhkVar) {
        this.a = bsehVar;
        this.b = engwVar;
        this.c = bindData;
        this.d = messageCoreData;
        this.e = z;
        this.f = j;
        this.g = enhkVar;
    }

    @Override // defpackage.crwx
    public final long a() {
        return this.f;
    }

    @Override // defpackage.crwx
    public final MessageCoreData b() {
        return this.d;
    }

    @Override // defpackage.crwx
    public final bseh c() {
        return this.a;
    }

    @Override // defpackage.crwx
    public final ParticipantsTable.BindData d() {
        return this.c;
    }

    @Override // defpackage.crwx
    public final engw e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        MessageCoreData messageCoreData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crwx) {
            crwx crwxVar = (crwx) obj;
            if (this.a.equals(crwxVar.c()) && enkr.h(this.b, crwxVar.e()) && ((bindData = this.c) != null ? bindData.equals(crwxVar.d()) : crwxVar.d() == null) && ((messageCoreData = this.d) != null ? messageCoreData.equals(crwxVar.b()) : crwxVar.b() == null) && this.e == crwxVar.g() && this.f == crwxVar.a() && this.g.equals(crwxVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.crwx
    public final enhk f() {
        return this.g;
    }

    @Override // defpackage.crwx
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        ParticipantsTable.BindData bindData = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003;
        MessageCoreData messageCoreData = this.d;
        int hashCode3 = (((hashCode2 ^ (messageCoreData != null ? messageCoreData.hashCode() : 0)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        long j = this.f;
        return ((hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        enhk enhkVar = this.g;
        MessageCoreData messageCoreData = this.d;
        ParticipantsTable.BindData bindData = this.c;
        engw engwVar = this.b;
        return "CmsConversationData{conversation=" + this.a.toString() + ", participantsList=" + engwVar.toString() + ", selfParticipant=" + String.valueOf(bindData) + ", lastMessage=" + String.valueOf(messageCoreData) + ", hasUnreadMessages=" + this.e + ", latestIncomingReadMessageTimestampMs=" + this.f + ", additionalFields=" + enhkVar.toString() + "}";
    }
}
