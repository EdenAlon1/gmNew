package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cycx {
    public final ResolvedRecipient a;
    public final boolean b;
    public final boolean c;

    public cycx(ResolvedRecipient resolvedRecipient, boolean z, boolean z2) {
        this.a = resolvedRecipient;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cycx)) {
            return false;
        }
        cycx cycxVar = (cycx) obj;
        return ffkj.e(this.a, cycxVar.a) && this.b == cycxVar.b && this.c == cycxVar.c;
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.a;
        return ((((resolvedRecipient == null ? 0 : resolvedRecipient.hashCode()) * 31) + cycw.a(this.b)) * 31) + cycw.a(this.c);
    }

    public final String toString() {
        return "AddContactBanner2LoadedData(recipient=" + this.a + ", isBannerEligible=" + this.b + ", isAddContactEligible=" + this.c + ")";
    }
}
