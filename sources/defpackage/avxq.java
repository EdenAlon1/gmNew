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
/* loaded from: classes6.dex */
public final class avxq extends UrlRequest.Callback {
    private static final entd a = entd.c("BugleFileTransfer");
    private final FileOutputStream b;
    private final int c;
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicLong e;
    private final int f;
    private final Optional g;
    private final String h;
    private final avvm i;

    public avxq(String str, int i, long j, FileOutputStream fileOutputStream, int i2, avvm avvmVar, Optional optional) {
        AtomicLong atomicLong = new AtomicLong();
        this.e = atomicLong;
        this.h = str;
        this.f = i;
        this.b = fileOutputStream;
        atomicLong.set(j);
        this.c = i2;
        this.i = avvmVar;
        this.g = optional;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cqpo.a, this.h);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onCanceled", 137, "DownloadCallback.java")).q("Download canceled.");
        avvc g = avvd.g();
        int httpStatusCode = urlResponseInfo != null ? urlResponseInfo.getHttpStatusCode() : 0;
        avvm avvmVar = this.i;
        g.e(httpStatusCode);
        g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_CANCELLATION);
        avvmVar.a(g.a());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        entd entdVar = a;
        ensz enszVar = (ensz) entdVar.j();
        enszVar.Y(cqpo.a, this.h);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onFailed", 116, "DownloadCallback.java")).q("Download failed.");
        if (urlResponseInfo != null) {
            avvm avvmVar = this.i;
            avvc g = avvd.g();
            g.e(urlResponseInfo.getHttpStatusCode());
            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            g.b(cronetException);
            avvmVar.a(g.a());
            return;
        }
        ensk o = entdVar.o();
        o.Y(cqpo.a, this.h);
        ((ensz) o.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onFailed", 118, "DownloadCallback.java")).q("Download response null.");
        avvm avvmVar2 = this.i;
        avvc g2 = avvd.g();
        g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
        g2.b(cronetException);
        avvmVar2.a(g2.a());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [cqqb, java.lang.Object] */
    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        long remaining = byteBuffer.remaining();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.b.getChannel()).write(byteBuffer);
        long addAndGet = this.e.addAndGet(remaining);
        if (!this.g.isEmpty() && addAndGet >= cqqm.b()) {
            cqou cqouVar = new cqou();
            cqouVar.b(addAndGet);
            cqouVar.c(this.f);
            axnw.h(this.g.get().b(this.h, cqouVar.d()));
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.d.incrementAndGet() > this.c) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(cqpo.a, this.h);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 76, "DownloadCallback.java")).q("MaxRedirects reached.");
            avvm avvmVar = this.i;
            avvc g = avvd.g();
            g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_MAX_REDIRECTS_REACHED);
            avvmVar.a(g.a());
            return;
        }
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 66, "DownloadCallback.java")).t("onRedirectReceived: Redirecting to: %s", str);
        ensz enszVar2 = (ensz) entdVar.h();
        enszVar2.Y(cqpo.a, this.h);
        enszVar2.Y(cqpo.c, Integer.valueOf(this.d.intValue()));
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 71, "DownloadCallback.java")).o();
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cqpo.a, this.h);
        enszVar.Y(cqpo.d, Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onResponseStarted", 89, "DownloadCallback.java")).q("onResponseStarted: Starting to read the response.");
        urlRequest.read(ByteBuffer.allocateDirect(32768));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cqpo.a, this.h);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onSucceeded", 110, "DownloadCallback.java")).q("HTTP request completed.");
        avur avurVar = new avur(urlResponseInfo, eyee.b);
        UrlResponseInfo urlResponseInfo2 = avurVar.a;
        avvm avvmVar = this.i;
        if (avvmVar.a.a.d.b(urlResponseInfo2)) {
            avvq avvqVar = avvmVar.a.a;
            avvqVar.a(avvqVar.f, avun.a);
        } else {
            avvn avvnVar = avvmVar.a;
            avum avumVar = new avum(avurVar);
            avvq avvqVar2 = avvnVar.a;
            avvqVar2.a(avvqVar2.h, avumVar);
        }
    }
}
