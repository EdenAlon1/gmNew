package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cykv {
    public final ResolvedRecipient a;
    public final int b;

    public cykv(ResolvedRecipient resolvedRecipient, int i) {
        this.a = resolvedRecipient;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cykv)) {
            return false;
        }
        cykv cykvVar = (cykv) obj;
        return ffkj.e(this.a, cykvVar.a) && this.b == cykvVar.b;
    }

    public final int hashCode() {
        ResolvedRecipient resolvedRecipient = this.a;
        return ((resolvedRecipient == null ? 0 : resolvedRecipient.hashCode()) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnblockUnspamBanner2LoadedData(recipient=");
        sb.append(this.a);
        sb.append(", bannerType=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NOT_ELIGIBLE" : "DETECTED_RECIPIENT" : "REPORTED_CONVERSATION" : "REPORTED_RECIPIENT" : "BLOCKED_RECIPIENT"));
        sb.append(")");
        return sb.toString();
    }
}
