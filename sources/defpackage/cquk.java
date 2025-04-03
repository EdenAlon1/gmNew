package defpackage;

import j$.nio.channels.DesugarChannels;
import j$.util.Optional;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
final class cquk extends UrlRequest.Callback {
    static final enip a = enip.s(403, 404, 410);
    private static final entd b = entd.c("BugleFileTransfer");
    private final kfb c;
    private final FileOutputStream d;
    private final int e;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicLong g;
    private final Optional h;
    private final String i;

    public cquk(String str, FileOutputStream fileOutputStream, int i, kfb kfbVar, Optional optional) {
        AtomicLong atomicLong = new AtomicLong();
        this.g = atomicLong;
        this.i = str;
        this.d = fileOutputStream;
        atomicLong.set(0L);
        this.e = i;
        this.c = kfbVar;
        this.h = optional;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ensz enszVar = (ensz) b.h();
        enszVar.Y(cqpo.a, this.i);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onCanceled", 153, "DownloadCallback.java")).q("Download from server canceled.");
        this.c.d();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        ensz enszVar = (ensz) b.j();
        enszVar.Y(cqpo.a, this.i);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onFailed", 133, "DownloadCallback.java")).q("Download from server failed.");
        if (urlResponseInfo == null) {
            this.c.c(new cquo(true, "Empty server response during file download.", cqpn.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY, (Throwable) cronetException));
            return;
        }
        kfb kfbVar = this.c;
        urlResponseInfo.getHttpStatusCode();
        kfbVar.c(new cquo(true, "Cronet failure during file download.", cqpn.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED, (Throwable) cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        long remaining = byteBuffer.remaining();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.d.getChannel()).write(byteBuffer);
        long addAndGet = this.g.addAndGet(remaining);
        if (!this.h.isEmpty() && addAndGet >= cqqm.b()) {
            cqou cqouVar = new cqou();
            cqouVar.b(addAndGet);
            cqouVar.c(2147483647L);
            axnw.h(((cqqb) this.h.get()).b(this.i, cqouVar.d()));
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.f.incrementAndGet() > this.e) {
            urlRequest.cancel();
            return;
        }
        entd entdVar = b;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onRedirectReceived", 79, "DownloadCallback.java")).t("onRedirectReceived: Redirecting to: %s", str);
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(cqpo.a, this.i);
        enszVar.Y(cqpo.c, Integer.valueOf(this.f.intValue()));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onRedirectReceived", 84, "DownloadCallback.java")).o();
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        ensz enszVar = (ensz) b.h();
        enszVar.Y(cqpo.a, this.i);
        enszVar.Y(cqpo.d, Integer.valueOf(httpStatusCode));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onResponseStarted", 99, "DownloadCallback.java")).q("onResponseStarted: Starting to read the response.");
        if (httpStatusCode == 200 || httpStatusCode == 206) {
            urlRequest.read(ByteBuffer.allocateDirect(32768));
        } else {
            this.c.c(new cquo(!a.contains(r2), a.h(httpStatusCode, "Http failure during file download: "), (byte[]) null));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ensz enszVar = (ensz) b.h();
        enszVar.Y(cqpo.a, this.i);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onSucceeded", 127, "DownloadCallback.java")).q("Download from server succeeded.");
        this.c.b(urlResponseInfo);
    }
}
