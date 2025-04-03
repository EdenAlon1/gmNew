package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqbi {
    public final Set a;

    public aqbi() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqbi) && ffkj.e(this.a, ((aqbi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedMessages=" + this.a + ")";
    }

    public /* synthetic */ aqbi(byte[] bArr) {
        this.a = new LinkedHashSet();
    }
}
