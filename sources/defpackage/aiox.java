package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import j$.nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiox extends UrlRequest.Callback {
    private static final enru a = enru.c("com/google/android/apps/messaging/net/cronet/AttachmentCallBack");
    private final ByteBuffer b = ByteBuffer.allocateDirect(32768);
    private final Uri c;
    private final SettableFuture d;
    private final Context e;
    private final asjf f;
    private FileOutputStream g;
    private final asjj h;

    public aiox(Uri uri, SettableFuture settableFuture, Context context, asjf asjfVar, asjj asjjVar) {
        this.c = uri;
        this.d = settableFuture;
        this.e = context;
        this.f = asjfVar;
        this.h = asjjVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ensk j = a.j();
        j.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onCanceled", 110, "AttachmentCallBack.java")).D("onCanceled %s with status code %s", this.c, urlResponseInfo == null ? "unknown" : Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
        if (!this.h.a()) {
            if (this.f.a() && urlResponseInfo != null && urlResponseInfo.getHttpStatusCode() == 401) {
                this.d.setException(new fedn(Status.j.withDescription("UrlRequest was cancelled with a 401 UNAUTHORIZED error.")));
                return;
            } else {
                this.d.setException(new CancellationException("UrlRequest was cancelled."));
                return;
            }
        }
        if (urlResponseInfo == null) {
            this.d.setException(new fedn(Status.c));
            return;
        }
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        int i = evbh.a;
        int i2 = 1;
        if (httpStatusCode != 200) {
            if (httpStatusCode == 409) {
                i2 = 11;
            } else if (httpStatusCode == 416) {
                i2 = 12;
            } else if (httpStatusCode == 429) {
                i2 = 9;
            } else if (httpStatusCode == 499) {
                i2 = 2;
            } else if (httpStatusCode == 501) {
                i2 = 13;
            } else if (httpStatusCode == 400) {
                i2 = 4;
            } else if (httpStatusCode == 401) {
                i2 = 17;
            } else if (httpStatusCode == 403) {
                i2 = 8;
            } else if (httpStatusCode == 404) {
                i2 = 6;
            } else if (httpStatusCode == 503) {
                i2 = 15;
            } else if (httpStatusCode == 504) {
                i2 = 5;
            } else if (httpStatusCode < 200 || httpStatusCode >= 300) {
                i2 = (httpStatusCode < 400 || httpStatusCode >= 500) ? (httpStatusCode < 500 || httpStatusCode >= 600) ? 3 : 14 : 10;
            }
        }
        this.d.setException(new fedn(Status.fromCodeValue(i2 - 1)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        CronetException cronetException2;
        ensk j = a.j();
        j.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) ((enrr) j).g(cronetException)).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onFailed", 97, "AttachmentCallBack.java")).t("onFailed %s", this.c);
        try {
            FileOutputStream fileOutputStream = this.g;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            cronetException2 = cronetException;
        } catch (IOException unused) {
            ensk i = a.i();
            i.Y(ente.a, "BugleNetwork");
            cronetException2 = cronetException;
            ((enrr) ((enrr) ((enrr) i).g(cronetException2)).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onFailed", 'g', "AttachmentCallBack.java")).q("Error closing file output stream");
        }
        this.d.setException(cronetException2);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ensk e = a.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onReadCompleted", 77, "AttachmentCallBack.java")).t("onReadCompleted %s", this.c);
        byteBuffer.flip();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.g.getChannel()).write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onResponseStarted", 63, "AttachmentCallBack.java")).B("onResponseStarted %s %s", this.c, httpStatusCode);
        if (httpStatusCode != 200) {
            urlRequest.cancel();
        } else {
            this.g = new FileOutputStream(cbgi.i(this.c, this.e));
            urlRequest.read(this.b);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onSucceeded", 86, "AttachmentCallBack.java")).t("onSucceeded %s", this.c);
        try {
            this.g.close();
        } catch (IOException e) {
            ensk i = a.i();
            i.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onSucceeded", 'Z', "AttachmentCallBack.java")).q("Error closing file output stream");
        }
        this.d.set(this.c);
    }
}
