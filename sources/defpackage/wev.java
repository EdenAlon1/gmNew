package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wev implements wey {
    public final SelfIdentityId a;
    public final int b;

    public wev(SelfIdentityId selfIdentityId, int i) {
        this.a = selfIdentityId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wev)) {
            return false;
        }
        wev wevVar = (wev) obj;
        return ffkj.e(this.a, wevVar.a) && this.b == wevVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "AutomaticallySwitch(selfParticipantId=" + this.a + ", subscriptionId=" + this.b + ")";
    }
}
