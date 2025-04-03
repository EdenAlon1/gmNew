package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwv {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final int g;

    static {
        lqx.b("media3.datasource");
    }

    public lwv(Uri uri, int i, byte[] bArr, Map map, long j, int i2) {
        boolean z = j >= 0;
        lti.a(z);
        lti.a(z);
        lti.a(true);
        lti.f(uri);
        this.a = uri;
        this.b = i;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = -1L;
        this.g = i2;
    }

    public static String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        throw new IllegalStateException();
    }

    public final boolean b(int i) {
        return (this.g & i) == i;
    }

    public final String toString() {
        Uri uri = this.a;
        return "DataSpec[" + a(this.b) + " " + uri.toString() + ", " + this.e + ", -1, null, " + this.g + "]";
    }
}
