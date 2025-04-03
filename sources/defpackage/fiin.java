package defpackage;

import android.os.Trace;
import internal.J.N;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiin implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public fiin(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new fiev("CronetUploadDataStream#initializeWithRequest");
        CronetUploadDataStream cronetUploadDataStream = this.a.f;
        try {
            synchronized (cronetUploadDataStream.h) {
                cronetUploadDataStream.j = 2;
            }
            try {
                cronetUploadDataStream.c.a();
                long length = cronetUploadDataStream.b.getLength();
                cronetUploadDataStream.d = length;
                cronetUploadDataStream.e = length;
            } catch (Throwable th) {
                cronetUploadDataStream.b(th);
            }
            synchronized (cronetUploadDataStream.h) {
                cronetUploadDataStream.j = 3;
            }
            Trace.endSection();
            synchronized (this.a.c) {
                CronetUrlRequest cronetUrlRequest = this.a;
                if (cronetUrlRequest.h()) {
                    return;
                }
                CronetUploadDataStream cronetUploadDataStream2 = cronetUrlRequest.f;
                long j = cronetUrlRequest.a;
                new fiev("CronetUploadDataStream#attachNativeAdapterToRequest");
                try {
                    synchronized (cronetUploadDataStream2.h) {
                        cronetUploadDataStream2.i = N.MA4X1aZa(cronetUploadDataStream2, j, cronetUploadDataStream2.d);
                    }
                    Trace.endSection();
                    this.a.g();
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
