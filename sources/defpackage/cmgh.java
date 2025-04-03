package defpackage;

import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgh {
    public final int a;
    public final int b;
    public final String c;
    public final SpannableString d;
    public final SpannableString e;

    public cmgh(int i, int i2, String str, SpannableString spannableString, SpannableString spannableString2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = spannableString;
        this.e = spannableString2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmgh)) {
            return false;
        }
        cmgh cmghVar = (cmgh) obj;
        return this.a == cmghVar.a && this.b == cmghVar.b && ffkj.e(this.c, cmghVar.c) && ffkj.e(this.d, cmghVar.d) && ffkj.e(this.e, cmghVar.e);
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TermsAndConditionsData(activeSubscriptionCount=" + this.a + ", simSlot=" + this.b + ", carrierName=" + this.c + ", title=" + ((Object) this.d) + ", message=" + ((Object) this.e) + ")";
    }
}
