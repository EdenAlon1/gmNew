package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctyo extends UrlRequest.Callback {
    private static final cskc a = cskc.g("Bugle", "UrlFetcher.UrlRequestCallback");
    private static final enip b = enip.s(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), Integer.valueOf(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED), 204);
    private final SettableFuture c;
    private eyee d = eyee.b;

    public ctyo(SettableFuture settableFuture) {
        this.c = settableFuture;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.cancel(true);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        a.r("onFailed method called. CronetException message: ".concat(String.valueOf(cronetException.getMessage())));
        this.c.setException(cronetException);
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
        a.p("onRedirectReceived method called.");
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (b.contains(Integer.valueOf(urlResponseInfo.getHttpStatusCode()))) {
            urlRequest.read(ByteBuffer.allocateDirect(8192));
        } else {
            urlRequest.cancel();
            this.c.setException(Status.m.asException());
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.set(this.d.E());
    }
}
