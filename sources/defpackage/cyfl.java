package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfl {
    public final boolean a;
    public final ResolvedRecipient b;

    public cyfl(boolean z, ResolvedRecipient resolvedRecipient) {
        this.a = z;
        this.b = resolvedRecipient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyfl)) {
            return false;
        }
        cyfl cyflVar = (cyfl) obj;
        return this.a == cyflVar.a && ffkj.e(this.b, cyflVar.b);
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.b;
        return ((true != this.a ? 1237 : 1231) * 31) + (resolvedRecipient == null ? 0 : resolvedRecipient.hashCode());
    }

    public final String toString() {
        return "RoamingShortCodeLoadedData(isBannerEligible=" + this.a + ", otherRecipient=" + this.b + ")";
    }
}
