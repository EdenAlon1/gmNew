package defpackage;

import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awbw {
    public static final String a(String str) {
        try {
            String host = new URL(str).getHost();
            host.getClass();
            return host;
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
