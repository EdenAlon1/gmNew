package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwl {
    public final ConversationId a;
    public final List b;
    public final aqux c;
    public final String d;
    public final String e;
    public final aqvi f;
    public final eyja g;
    public final boolean h;

    public cjwl(ConversationId conversationId, List list, aqux aquxVar, String str, String str2, aqvi aqviVar, eyja eyjaVar, boolean z) {
        list.getClass();
        aquxVar.getClass();
        eyjaVar.getClass();
        this.a = conversationId;
        this.b = list;
        this.c = aquxVar;
        this.d = str;
        this.e = str2;
        this.f = aqviVar;
        this.g = eyjaVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjwl)) {
            return false;
        }
        cjwl cjwlVar = (cjwl) obj;
        return ffkj.e(this.a, cjwlVar.a) && ffkj.e(this.b, cjwlVar.b) && ffkj.e(this.c, cjwlVar.c) && ffkj.e(this.d, cjwlVar.d) && ffkj.e(this.e, cjwlVar.e) && ffkj.e(this.f, cjwlVar.f) && ffkj.e(this.g, cjwlVar.g) && this.h == cjwlVar.h;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        return "SelfProfileSharingData(conversationId=" + this.a + ", eligibleRecipients=" + this.b + ", selfIdentity=" + this.c + ", selfProfileAccessToken=" + this.d + ", personId=" + this.e + ", selfProfile=" + this.f + ", profileLastUpdatedTimestamp=" + this.g + ", shouldUseServerFanOut=" + this.h + ")";
    }
}
