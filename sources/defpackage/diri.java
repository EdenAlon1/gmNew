package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diri implements disp {
    private final eefk a;
    private HttpURLConnection b;
    private final Set c = enpw.f(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));

    public diri(eefk eefkVar) {
        this.a = eefkVar;
    }

    @Override // defpackage.disp
    public final ListenableFuture a() {
        HashMap hashMap = new HashMap();
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            throw new IOException("HttpURLConnection is null. Call init() method first");
        }
        httpURLConnection.connect();
        String headerField = this.b.getHeaderField("Accept-Ranges");
        if (headerField != null) {
            hashMap.put("Accept-Ranges", headerField);
        }
        String headerField2 = this.b.getHeaderField("Retry-After");
        if (headerField2 != null) {
            hashMap.put("Retry-After", headerField2);
        }
        int responseCode = this.b.getResponseCode();
        return erqt.i(diso.d(responseCode, this.c.contains(Integer.valueOf(responseCode)) ? Optional.of(this.b.getInputStream()) : Optional.empty(), hashMap));
    }

    @Override // defpackage.disp
    public final void b(String str, String str2) {
        this.b = this.a.a(str, str2);
    }

    @Override // defpackage.disp
    public final void c(String str, String str2, long j) {
        this.c.add(206);
        HttpURLConnection a = this.a.a(str, str2);
        dkty.c("Preparing to resume, starting at offset:%d bytes", Long.valueOf(j));
        a.setRequestProperty("Range", a.y(j, "bytes=", "-"));
        a.setUseCaches(false);
        this.b = a;
    }

    @Override // defpackage.disp, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
