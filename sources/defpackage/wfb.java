package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfb extends wfg {
    private final View a;
    private final View b;
    private final ConversationId c;
    private final MessageIdType d;
    private final long e;

    public wfb(View view, View view2, ConversationId conversationId, MessageIdType messageIdType, long j) {
        if (view == null) {
            throw new NullPointerException("Null parent");
        }
        this.a = view;
        if (view2 == null) {
            throw new NullPointerException("Null target");
        }
        this.b = view2;
        this.c = conversationId;
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.d = messageIdType;
        this.e = j;
    }

    @Override // defpackage.wfg
    public final long a() {
        return this.e;
    }

    @Override // defpackage.wfg
    public final View b() {
        return this.a;
    }

    @Override // defpackage.wfg
    public final View c() {
        return this.b;
    }

    @Override // defpackage.wfg
    public final ConversationId d() {
        return this.c;
    }

    @Override // defpackage.wfg
    public final MessageIdType e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wfg) {
            wfg wfgVar = (wfg) obj;
            if (this.a.equals(wfgVar.b()) && this.b.equals(wfgVar.c()) && this.c.equals(wfgVar.d()) && this.d.equals(wfgVar.e()) && this.e == wfgVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        MessageIdType messageIdType = this.d;
        ConversationId conversationId = this.c;
        View view = this.b;
        return "StarBadgeClickEvent{parent=" + this.a.toString() + ", target=" + view.toString() + ", conversationId=" + conversationId.toString() + ", messageId=" + messageIdType.toString() + ", usageStatsLoggingId=" + this.e + "}";
    }
}
