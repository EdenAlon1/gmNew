package defpackage;

import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgi {
    public final String a;
    public final SpannableString b;
    public final SpannableString c;
    public final boolean d;

    public cmgi(String str, SpannableString spannableString, SpannableString spannableString2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = spannableString;
        this.c = spannableString2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmgi)) {
            return false;
        }
        cmgi cmgiVar = (cmgi) obj;
        return ffkj.e(this.a, cmgiVar.a) && ffkj.e(this.b, cmgiVar.b) && ffkj.e(this.c, cmgiVar.c) && this.d == cmgiVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "WelcomeMessageRequest(simId=" + this.a + ", title=" + ((Object) this.b) + ", message=" + ((Object) this.c) + ", settingsButtonEnabled=" + this.d + ")";
    }
}
