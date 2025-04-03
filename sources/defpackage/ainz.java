package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainz implements aihs {
    public final ResolvedRecipient a;
    public final aqux b;

    public ainz(ResolvedRecipient resolvedRecipient, aqux aquxVar) {
        this.a = resolvedRecipient;
        this.b = aquxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ainz)) {
            return false;
        }
        ainz ainzVar = (ainz) obj;
        return ffkj.e(this.a, ainzVar.a) && ffkj.e(this.b, ainzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return cskt.b(super.toString()).toString();
    }
}
