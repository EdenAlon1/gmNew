package defpackage;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefq {
    public static final dktn a = new dktn("MsrpConnection");
    public eege d;
    public eegq e;
    public final eecp f;
    public final Context g;
    public final int h;
    private OutputStream i = null;
    public InputStream b = null;
    public final Object c = new Object();

    public eefq(Context context, eecp eecpVar, int i) {
        this.g = context;
        this.f = eecpVar;
        this.h = i;
    }

    public final OutputStream a() {
        OutputStream outputStream = this.i;
        if (outputStream != null) {
            return outputStream;
        }
        throw new IllegalStateException("expected outputStream to be non-null");
    }

    public final void b() {
        this.f.d();
        synchronized (this.c) {
            this.b = new BufferedInputStream(this.f.a(), 4096);
            this.i = this.f.b();
            this.c.notifyAll();
        }
    }

    final boolean c() {
        int i = this.h;
        return i == 1 || i == 3;
    }

    public final String toString() {
        int i = this.h;
        return "MsrpConnection of type ".concat(i != 1 ? i != 2 ? i != 3 ? "SECURE_SERVER_CONNECTION" : "SECURE_CLIENT_CONNECTION" : "INSECURE_SERVER_CONNECTION" : "INSECURE_CLIENT_CONNECTION");
    }
}
