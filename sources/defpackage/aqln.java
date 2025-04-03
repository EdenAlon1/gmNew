package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqln {
    public final Set a;
    public final AtomicBoolean b;

    public aqln() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqln)) {
            return false;
        }
        aqln aqlnVar = (aqln) obj;
        return ffkj.e(this.a, aqlnVar.a) && ffkj.e(this.b, aqlnVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "QueryListenerState(impactedConversations=" + this.a + ", withSelfParticipants=" + this.b + ")";
    }

    public /* synthetic */ aqln(byte[] bArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = linkedHashSet;
        this.b = atomicBoolean;
    }
}
