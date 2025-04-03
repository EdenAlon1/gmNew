package defpackage;

import android.content.Context;
import android.net.Uri;
import io.grpc.Status;
import j$.nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aioy extends UrlRequest.Callback {
    private final ByteBuffer a = ByteBuffer.allocateDirect(32768);
    private final Uri b;
    private final kfb c;
    private final Context d;
    private FileOutputStream e;

    public aioy(Uri uri, kfb kfbVar, Context context) {
        this.b = uri;
        this.c = kfbVar;
        this.d = context;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        csjy.i("BugleNetwork", "Attachment onCanceled ".concat(String.valueOf(String.valueOf(this.b))));
        try {
            FileOutputStream fileOutputStream = this.e;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e) {
            csjy.h("BugleNetwork", e, "Error closing file output stream");
        }
        this.c.d();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        csjy.k("BugleNetwork", cronetException, "onFailed ".concat(String.valueOf(String.valueOf(this.b))));
        try {
            FileOutputStream fileOutputStream = this.e;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e) {
            csjy.h("BugleNetwork", e, "Error closing file output stream");
        }
        this.c.c(cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        csjy.l("BugleNetwork", "Attachment onReadCompleted ".concat(String.valueOf(String.valueOf(this.b))));
        byteBuffer.flip();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.e.getChannel()).write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        Uri uri = this.b;
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        csjy.i("BugleNetwork", "Attachment onResponseStarted " + String.valueOf(uri) + " " + httpStatusCode);
        if (httpStatusCode == 200) {
            this.e = new FileOutputStream(cbgi.i(this.b, this.d));
            urlRequest.read(this.a);
        } else {
            this.c.c(new fihr("Failed HTTP request", Status.fromCodeValue(httpStatusCode).asException()));
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        csjy.i("BugleNetwork", "Attachment onSucceeded ".concat(String.valueOf(String.valueOf(this.b))));
        try {
            this.e.close();
        } catch (IOException e) {
            csjy.h("BugleNetwork", e, "Error closing file output stream");
        }
        this.c.b(this.b);
    }
}
