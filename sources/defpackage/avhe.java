package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avhe extends UrlRequest.Callback {
    final /* synthetic */ avhf a;
    private final kfb c;
    private final enru b = enru.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback");
    private eyee d = eyee.b;

    public avhe(avhf avhfVar, kfb kfbVar) {
        this.a = avhfVar;
        this.c = kfbVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            ensk j = this.b.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onCanceled", 450, "RbmBusinessInfoJsonRetriever.java")).q("Business Info JSON HTTP retrieval cancelled without response code");
            this.c.c(new avhg("Business Info JSON HTTP retrieval was cancelled", 8));
            return;
        }
        ensk h = this.b.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onCanceled", 442, "RbmBusinessInfoJsonRetriever.java")).r("Response was cancelled, but contains status code, response code: %d", urlResponseInfo.getHttpStatusCode());
        this.c.b(new avhd(urlResponseInfo.getHttpStatusCode()));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        ensk j = this.b.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) j).g(cronetException)).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onFailed", (char) 428, "RbmBusinessInfoJsonRetriever.java")).q("Business Info JSON HTTP retrieval failed");
        this.c.c(new avhg(cronetException.getMessage() != null ? cronetException.getMessage() : "Cronet exception has null message", 7, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.d = this.d.u(eyee.w(byteBuffer));
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        ensk h = this.b.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onRedirectReceived", 346, "RbmBusinessInfoJsonRetriever.java")).q("onRedirectReceived method called.");
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode == 200 || httpStatusCode == 304) {
            ensk h = this.b.h();
            h.Y(ente.a, "Bugle");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onResponseStarted", 358, "RbmBusinessInfoJsonRetriever.java")).r("Response started. status: %d", httpStatusCode);
            urlRequest.read(ByteBuffer.allocateDirect(8192));
            return;
        }
        ensk h2 = this.b.h();
        h2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onResponseStarted", 363, "RbmBusinessInfoJsonRetriever.java")).r("Response started, and response code was not 200 OK or 304. response code: %d", httpStatusCode);
        this.c.b(new avhd(httpStatusCode));
        urlRequest.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0162  */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSucceeded(org.chromium.net.UrlRequest r19, org.chromium.net.UrlResponseInfo r20) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avhe.onSucceeded(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
    }
}
