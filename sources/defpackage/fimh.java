package defpackage;

import android.os.Trace;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fimh extends UrlRequest.Callback {
    final /* synthetic */ fimi a;

    public fimh(fimi fimiVar) {
        this.a = fimiVar;
    }

    private final void a(IOException iOException) {
        fimi fimiVar = this.a;
        fimiVar.f = iOException;
        fimk fimkVar = fimiVar.c;
        if (fimkVar != null) {
            fimkVar.c = iOException;
            fimkVar.a = true;
            fimkVar.b = null;
        }
        fiml fimlVar = fimiVar.d;
        if (fimlVar != null) {
            fimlVar.d = iOException;
            fimlVar.f = true;
        }
        fimiVar.o = true;
        this.a.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new fiev("CronetHttpURLConnection.CronetUrlRequestCallback#onCanceled");
        try {
            this.a.e = urlResponseInfo;
            a(new IOException("disconnect() called"));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        new fiev("CronetHttpURLConnection.CronetUrlRequestCallback#onFailed");
        try {
            if (cronetException == null) {
                throw new IllegalStateException("Exception cannot be null in onFailed.");
            }
            this.a.e = urlResponseInfo;
            a(cronetException);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        new fiev("CronetHttpURLConnection.CronetUrlRequestCallback#onReadCompleted");
        try {
            fimi fimiVar = this.a;
            fimiVar.e = urlResponseInfo;
            fimiVar.a.c();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        URL url;
        boolean equals;
        boolean z;
        boolean z2;
        new fiev("CronetHttpURLConnection.CronetUrlRequestCallback#onRedirectReceived");
        try {
            this.a.g = true;
            try {
                URL url2 = new URL(str);
                String protocol = url2.getProtocol();
                url = this.a.url;
                equals = protocol.equals(url.getProtocol());
                z = this.a.instanceFollowRedirects;
                if (z) {
                    this.a.url = url2;
                }
                z2 = this.a.instanceFollowRedirects;
            } catch (MalformedURLException unused) {
            }
            if (z2 && equals) {
                this.a.b.followRedirect();
                Trace.endSection();
            }
            fimi fimiVar = this.a;
            fimiVar.e = urlResponseInfo;
            fimiVar.b.cancel();
            a(null);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new fiev("CronetHttpURLConnection.CronetUrlRequestCallback#onResponseStarted");
        try {
            fimi fimiVar = this.a;
            fimiVar.e = urlResponseInfo;
            fimiVar.o = true;
            this.a.a.c();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new fiev("CronetHttpURLConnection.CronetUrlRequestCallback#onSucceeded");
        try {
            this.a.e = urlResponseInfo;
            a(null);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
