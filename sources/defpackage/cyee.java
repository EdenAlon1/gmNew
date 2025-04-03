package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyee {
    public final boolean a;
    public final ResolvedRecipient b;

    public cyee(boolean z, ResolvedRecipient resolvedRecipient) {
        this.a = z;
        this.b = resolvedRecipient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyee)) {
            return false;
        }
        cyee cyeeVar = (cyee) obj;
        return this.a == cyeeVar.a && ffkj.e(this.b, cyeeVar.b);
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.b;
        return ((true != this.a ? 1237 : 1231) * 31) + (resolvedRecipient == null ? 0 : resolvedRecipient.hashCode());
    }

    public final String toString() {
        return "AddAreaCodeLoadedData(isBannerEligible=" + this.a + ", otherRecipient=" + this.b + ")";
    }
}
