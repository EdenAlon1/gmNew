package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xbz {
    public final dmzz a;
    public final String b;
    public final erca c;
    public final ffji d;
    private final int e;

    public xbz(dmzz dmzzVar, erca ercaVar, ffji ffjiVar) {
        dmzzVar.getClass();
        ercaVar.getClass();
        this.e = R.string.whatsapp_video_call;
        this.a = dmzzVar;
        this.b = "com.whatsapp";
        this.c = ercaVar;
        this.d = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbz)) {
            return false;
        }
        xbz xbzVar = (xbz) obj;
        int i = xbzVar.e;
        return this.a == xbzVar.a && ffkj.e(this.b, xbzVar.b) && this.c == xbzVar.c && ffkj.e(this.d, xbzVar.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 1670248072) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ThirdPartyVideoCallingService(displayNameResId=2132088952, iconUiData=" + this.a + ", packageName=" + this.b + ", serviceType=" + this.c + ", logDuration=" + this.d + ")";
    }
}
