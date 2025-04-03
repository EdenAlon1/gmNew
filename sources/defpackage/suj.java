package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suj {
    public final boolean a;
    public final String b;
    public final String c;
    public final ResolvedRecipient d;

    public suj(boolean z, String str, String str2, ResolvedRecipient resolvedRecipient) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = resolvedRecipient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suj)) {
            return false;
        }
        suj sujVar = (suj) obj;
        return this.a == sujVar.a && ffkj.e(this.b, sujVar.b) && ffkj.e(this.c, sujVar.c) && ffkj.e(this.d, sujVar.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = ((true != this.a ? 1237 : 1231) * 31) + (str == null ? 0 : str.hashCode());
        String str2 = this.c;
        int hashCode2 = ((hashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResolvedRecipient resolvedRecipient = this.d;
        return hashCode2 + (resolvedRecipient != null ? resolvedRecipient.hashCode() : 0);
    }

    public final String toString() {
        return "SaveBirthdayBannerData(isBannerEligible=" + this.a + ", bannerTitle=" + this.b + ", bannerBodyText=" + this.c + ", recipient=" + this.d + ")";
    }
}
