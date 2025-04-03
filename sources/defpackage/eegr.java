package defpackage;

import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eegr {
    IP4("IP4"),
    IP6("IP6");

    private final String d;

    eegr(String str) {
        this.d = str;
    }

    public static eegr a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("IpAddress must not be null");
        }
        if (!erlu.b(str)) {
            throw new eehb("Not an IP address: ".concat(String.valueOf(str)));
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName instanceof Inet6Address) {
                return IP6;
            }
            if (byName instanceof Inet4Address) {
                return IP4;
            }
            throw new eehb("Unsupported address type: ".concat(String.valueOf(String.valueOf(byName))));
        } catch (UnknownHostException unused) {
            throw new IllegalStateException("Expected valid IP address here!");
        }
    }

    public static eegr b(String str) {
        eegr eegrVar = IP6;
        return eegrVar.d.equals(str) ? eegrVar : IP4;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
