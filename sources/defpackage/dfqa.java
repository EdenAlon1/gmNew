package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dfqa {
    public static final dfqa a = new dfqa(true, null, null);
    public final boolean b;
    final String c;
    final Throwable d;

    public dfqa(boolean z, String str, Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    public String a() {
        return this.c;
    }

    public final void b() {
        if (this.b || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.d != null) {
            Log.d("GoogleCertificatesRslt", a(), this.d);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    public final void c() {
        if (this.b) {
            return;
        }
        String str = "GoogleCertificatesRslt: " + a() + " (go/gsrlt)";
        Throwable th = this.d;
        if (th == null) {
            throw new SecurityException(str);
        }
        throw new SecurityException(str, th);
    }
}
