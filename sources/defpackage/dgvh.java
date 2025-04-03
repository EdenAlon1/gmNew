package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgvh extends IHttpUrlConnectionFactory.Stub {
    private static CronetEngine a = null;
    private static boolean b = false;
    private static boolean c = false;
    private final Context d;

    public dgvh(Context context) {
        this.d = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: all -> 0x0047, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0009, B:10:0x000b, B:13:0x000f, B:15:0x001e, B:17:0x0020, B:18:0x0030, B:23:0x0035, B:25:0x003e, B:26:0x0045), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final org.chromium.net.CronetEngine a(android.content.Context r4) {
        /*
            java.lang.Class<dgvh> r0 = defpackage.dgvh.class
            monitor-enter(r0)
            boolean r1 = defpackage.dgvh.b     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto Lb
            org.chromium.net.CronetEngine r4 = defpackage.dgvh.a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r4
        Lb:
            r1 = 1
            defpackage.dgvh.b = r1     // Catch: java.lang.Throwable -> L47
            r1 = 0
            java.util.List r2 = org.chromium.net.CronetProvider.getAllProviders(r4)     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            dgvg r3 = new dgvg     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            boolean r2 = defpackage.enjk.q(r2, r3)     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            if (r2 != 0) goto L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r1
        L20:
            org.chromium.net.CronetEngine$Builder r2 = new org.chromium.net.CronetEngine$Builder     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            r2.<init>(r4)     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            boolean r4 = defpackage.dgvh.c     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            r2.enableQuic(r4)     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            org.chromium.net.CronetEngine r4 = r2.build()     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            defpackage.dgvh.a = r4     // Catch: java.lang.IllegalStateException -> L32 java.lang.UnsatisfiedLinkError -> L34 java.lang.Throwable -> L47
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r4
        L32:
            r4 = move-exception
            goto L35
        L34:
            r4 = move-exception
        L35:
            java.lang.String r2 = "brella.CrntHttpUrlFctry"
            r3 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L45
            java.lang.String r2 = "brella.CrntHttpUrlFctry"
            java.lang.String r3 = "failed to load Cronet engine"
            android.util.Log.w(r2, r3, r4)     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return r1
        L47:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgvh.a(android.content.Context):org.chromium.net.CronetEngine");
    }

    @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
    public final boolean allowFallbackToDefault() {
        return true;
    }

    @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
    public final IObjectWrapper createUrlConnection(String str) {
        try {
            CronetEngine a2 = a(this.d);
            if (a2 != null) {
                return ObjectWrapper.wrap((HttpURLConnection) a2.openConnection(new URL(str)));
            }
            throw new RemoteException("failed to initialize CronetEngine");
        } catch (IOException e) {
            throw new RemoteException("unexpected IOException: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
    public final boolean initialize() {
        return a(this.d) != null;
    }

    @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
    public final void requestEnableQuic(boolean z) {
        synchronized (dgvh.class) {
            c = z;
        }
    }

    @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
    public final boolean supportAcceptEncodingHeader() {
        return false;
    }

    @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
    public final boolean supportSetConnectTimeoutMs() {
        return false;
    }
}
