package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqlk {
    public final Set a;

    public aqlk() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqlk) && ffkj.e(this.a, ((aqlk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedConversations=" + this.a + ")";
    }

    public /* synthetic */ aqlk(byte[] bArr) {
        this.a = new LinkedHashSet();
    }
}
