package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyiu {
    public final ResolvedRecipient a;
    public final boolean b;
    public final boolean c;

    public cyiu(ResolvedRecipient resolvedRecipient, boolean z, boolean z2) {
        this.a = resolvedRecipient;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyiu)) {
            return false;
        }
        cyiu cyiuVar = (cyiu) obj;
        return ffkj.e(this.a, cyiuVar.a) && this.b == cyiuVar.b && this.c == cyiuVar.c;
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.a;
        return ((((resolvedRecipient == null ? 0 : resolvedRecipient.hashCode()) * 31) + cyit.a(this.b)) * 31) + cyit.a(this.c);
    }

    public final String toString() {
        return "SpamBanner2LoadedData(targetRecipient=" + this.a + ", isGroup=" + this.b + ", isBannerEligible=" + this.c + ")";
    }
}
