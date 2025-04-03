package defpackage;

import android.net.ProxyInfo;
import android.net.Uri;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figb {
    public static final figb a = new figb("", 0, "", new String[0]);
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;

    public figb(String str, int i, String str2, String[] strArr) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = strArr;
    }

    public static figb a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        if (host == null) {
            host = "";
        }
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        return new figb(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
    }

    public final String toString() {
        return String.format(Locale.US, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", (this.b.equals("localhost") || this.b.isEmpty()) ? this.b : "<redacted>", Integer.valueOf(this.c), this.d == null ? "null" : "\"<redacted>\"");
    }
}
