package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aplj extends aplk {
    private final ResolvedRecipient a;
    private final Instant b;

    public aplj(ResolvedRecipient resolvedRecipient, Instant instant) {
        this.a = resolvedRecipient;
        this.b = instant;
    }

    @Override // defpackage.alxc
    public final ResolvedRecipient a() {
        return this.a;
    }

    @Override // defpackage.alxc
    public final Instant b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aplk) {
            aplk aplkVar = (aplk) obj;
            if (this.a.equals(aplkVar.a()) && this.b.equals(aplkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Instant instant = this.b;
        return "BugleActiveComposer{recipient=" + this.a.toString() + ", expiry=" + instant.toString() + "}";
    }
}
