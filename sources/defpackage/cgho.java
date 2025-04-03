package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgho {
    public final Set a;
    public final Set b;

    public cgho(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgho)) {
            return false;
        }
        cgho cghoVar = (cgho) obj;
        return ffkj.e(this.a, cghoVar.a) && ffkj.e(this.b, cghoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationWithAllowlistStatusChanged(toDisallowedConversation=" + this.a + ", toAllowedConversation=" + this.b + ")";
    }
}
