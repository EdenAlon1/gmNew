package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cghn {
    public final Map a;
    public final Set b;
    public final Set c;

    public cghn(Map map, Set set, Set set2) {
        this.a = map;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cghn)) {
            return false;
        }
        cghn cghnVar = (cghn) obj;
        return ffkj.e(this.a, cghnVar.a) && ffkj.e(this.b, cghnVar.b) && ffkj.e(this.c, cghnVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConversationParticipantsData(conversationsToParticipants=" + this.a + ", currentDisallowedConversations=" + this.b + ", participants=" + this.c + ")";
    }
}
