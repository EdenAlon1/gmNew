package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diry extends diud {
    static final diyy a = diyv.b("enable_get_upload_info_retry");
    private static final Uri k = Uri.EMPTY;
    public HttpRequestBase b;
    private final FileTransferInfo l;
    private final String m;
    private final boolean n;
    private final djqt o;
    private final disr p;
    private final String q;
    private final String r;
    private final ffbr s;

    public diry(Context context, dips dipsVar, djqt djqtVar, ffbr ffbrVar, long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar, boolean z, dijy dijyVar, disr disrVar, String str3) {
        super(context, j, str, instantMessageConfiguration, diucVar, dipsVar, dijyVar, ffbrVar);
        this.l = fileTransferInfo;
        this.m = str2;
        this.n = z;
        this.o = djqtVar;
        this.s = ffbrVar;
        this.p = disrVar;
        this.q = str3;
        this.r = instantMessageConfiguration.mFtHttpContentServerUri;
    }

    private final HttpResponse j(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase, HttpContext httpContext) {
        try {
            return (HttpResponse) (httpContext == null ? this.p.b(defaultHttpClient, httpRequestBase) : this.p.a(defaultHttpClient, httpContext, httpRequestBase)).get(((Integer) djae.c().a.b.a()).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException("Couldn't obtain HttpReponse from future.", e);
        }
    }

    private final HttpPost k() {
        HttpPost httpPost = new HttpPost(this.d.mFtHttpContentServerUri);
        httpPost.setHeader("User-Agent", this.q);
        return httpPost;
    }

    private final void l(Exception exc) {
        int i;
        if (this.j) {
            dkty.o("HTTP file transfer canceled", new Object[0]);
            i = 5;
        } else {
            dkty.i(exc, "Unable to perform HTTP file transfer", new Object[0]);
            b(diqh.e);
            if (!this.j && this.i <= 1) {
                this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR);
                i = 8;
            } else {
                this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_MAX_RETRIES_REACHED);
                i = 11;
            }
        }
        d(20013, i);
    }

    private final void m(HttpResponse httpResponse, Set set) {
        dkty.c("Received %s, expecting %s", httpResponse.getStatusLine(), set);
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (set.contains(Integer.valueOf(statusCode))) {
            return;
        }
        this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE);
        try {
            throw new diue(statusCode, ditn.c(httpResponse));
        } catch (IllegalArgumentException e) {
            this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
            throw new IOException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] n(org.apache.http.impl.client.DefaultHttpClient r12, org.apache.http.protocol.HttpContext r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diry.n(org.apache.http.impl.client.DefaultHttpClient, org.apache.http.protocol.HttpContext):byte[]");
    }

    private static final void o(HttpEntity httpEntity) {
        if (httpEntity == null) {
            return;
        }
        httpEntity.consumeContent();
    }

    private static final void p(byte[] bArr) {
        dkty.o("Response:\n%s", new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // defpackage.diud
    public final void a() {
        super.a();
        synchronized (this) {
            notifyAll();
        }
        HttpRequestBase httpRequestBase = this.b;
        if (httpRequestBase == null || httpRequestBase.isAborted()) {
            return;
        }
        new dirx(this).start();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:16|(2:18|(1:20))|21|(1:23)(2:65|(5:67|11|12|13|14))|24|25|26|27|28|29|30|(4:32|33|34|(4:36|12|13|14))(1:43)|37|(4:39|12|13|14)(2:40|41)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0295, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0296, code lost:
    
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02dc, code lost:
    
        r4 = new java.lang.Object[1];
        r4[r25] = r0;
        defpackage.dkty.k("GenericFileTransferException thrown %s", r4);
        r27.h.a(r0.a());
        l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0299, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x029a, code lost:
    
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02f5, code lost:
    
        r4 = new java.lang.Object[1];
        r4[r25] = r0.getMessage();
        defpackage.dkty.g("HttpResponseException occurred while uploading, %s", r4);
        r2 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0308, code lost:
    
        if (r2 != 401) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x030c, code lost:
    
        if (r2 != 403) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0310, code lost:
    
        if (r2 != 422) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0312, code lost:
    
        r2 = defpackage.diqh.c();
        r2.c(3);
        r2.b(r0);
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x032f, code lost:
    
        b(r0);
        r2 = (defpackage.diwz) r27.s.b();
        r27.h.a(defpackage.eyyl.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR);
        i(h(r0), ((defpackage.diqd) r0).b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0325, code lost:
    
        if (defpackage.djae.o() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0327, code lost:
    
        r0 = defpackage.diqh.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x032a, code lost:
    
        r0 = defpackage.diqh.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x032d, code lost:
    
        r0 = defpackage.diqh.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029e, code lost:
    
        r27.h.e(r27.r);
        defpackage.dkty.q("Unable to parse file resume info: %s", r0.getMessage());
        r0 = n(r3, r2);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diry.run():void");
    }

    @Override // defpackage.diud
    public final String toString() {
        return "Upload: " + super.toString() + ", TID " + this.m + ", isExplicitResume " + this.n;
    }
}
