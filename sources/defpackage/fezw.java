package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezw {
    public static final Logger a = Logger.getLogger(fezt.class.getName());
    public static final fhmx b;

    static {
        fhmx fhmxVar = fhmx.a;
        b = fhmw.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static int b(fhmv fhmvVar) {
        return (fhmvVar.d() & 255) | ((fhmvVar.d() & 255) << 16) | ((fhmvVar.d() & 255) << 8);
    }

    public static IOException c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public static IllegalArgumentException d(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }
}
