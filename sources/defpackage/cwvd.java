package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvd {
    public final String a;
    public final String b;
    public final Intent c;
    private final String d;

    public cwvd(String str, String str2, String str3, Intent intent) {
        this.d = str;
        this.a = str2;
        this.b = str3;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwvd)) {
            return false;
        }
        cwvd cwvdVar = (cwvd) obj;
        return ffkj.e(this.d, cwvdVar.d) && ffkj.e(this.a, cwvdVar.a) && ffkj.e(this.b, cwvdVar.b) && ffkj.e(this.c, cwvdVar.c);
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ChatIdentitySettingsUiData(id=" + this.d + ", simName=" + this.a + ", phoneNumber=" + this.b + ", simSettingsIntent=" + this.c + ")";
    }
}
