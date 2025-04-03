package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.auth.RFC2617Scheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class disw implements disp {
    public final dijy a;
    public final disr b;
    public final ffbr d;
    public DefaultHttpClient e;
    private final errl g;
    private HttpGet h;
    public final Set c = enpw.f(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));
    public String f = "";

    public disw(errl errlVar, ffbr ffbrVar, dijy dijyVar, disr disrVar) {
        this.g = errlVar;
        this.d = ffbrVar;
        this.a = dijyVar;
        this.b = disrVar;
    }

    @Override // defpackage.disp
    public final ListenableFuture a() {
        final HttpGet httpGet = this.h;
        httpGet.getClass();
        final DefaultHttpClient defaultHttpClient = this.e;
        if (defaultHttpClient == null) {
            throw new IllegalStateException("The HTTP client is null. Call init() method first");
        }
        this.a.d(this.f, 2, enoz.a);
        final long longValue = dkvj.a().longValue();
        return elfo.g(new Callable() { // from class: dist
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return defaultHttpClient.execute(httpGet);
            }
        }, this.g).i(new eroh() { // from class: disu
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                RFC2617Scheme a;
                HttpResponse httpResponse = (HttpResponse) obj;
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                disw diswVar = disw.this;
                diswVar.a.b(diswVar.f, statusCode, dkvj.a().longValue() - longValue);
                enin eninVar = new enin();
                eninVar.j(diswVar.c);
                eninVar.c(401);
                enip g = eninVar.g();
                dkty.c("[SR] Received %s, expecting %s", httpResponse.getStatusLine(), g);
                int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                if (!g.contains(Integer.valueOf(statusCode2))) {
                    diswVar.a.a(eyyl.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE);
                    try {
                        throw new diue(statusCode2, ditn.c(httpResponse));
                    } catch (IllegalArgumentException e) {
                        diswVar.a.a(eyyl.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
                        throw new IOException(e);
                    }
                }
                if (statusCode != 401) {
                    return elfo.e(httpResponse);
                }
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    entity.consumeContent();
                }
                if (httpResponse.getStatusLine().getStatusCode() != 401) {
                    dkty.o("[SR] HTTP client authentication not required!", new Object[0]);
                    diswVar.a.a = eyyh.AUTHENTICATION_TYPE_NONE;
                    a = null;
                } else {
                    if (!httpResponse.containsHeader("WWW-Authenticate")) {
                        throw new IOException(String.format("No %s header found in initial response!", "WWW-Authenticate"));
                    }
                    a = diuh.a(httpResponse.getFirstHeader("WWW-Authenticate"));
                    DefaultHttpClient defaultHttpClient2 = diswVar.e;
                    defaultHttpClient2.getClass();
                    diuh.c(defaultHttpClient2, a);
                }
                HttpGet httpGet2 = httpGet;
                DefaultHttpClient defaultHttpClient3 = defaultHttpClient;
                BasicHttpContext b = diuh.b(a);
                return b == null ? diswVar.b.b(defaultHttpClient3, httpGet2) : diswVar.b.a(defaultHttpClient3, b, httpGet2);
            }
        }, this.g).i(new eroh() { // from class: disv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional of;
                HttpResponse httpResponse = (HttpResponse) obj;
                HashMap hashMap = new HashMap();
                Header firstHeader = httpResponse.getFirstHeader("Accept-Ranges");
                if (firstHeader != null) {
                    hashMap.put("Accept-Ranges", firstHeader.getValue());
                }
                Header firstHeader2 = httpResponse.getFirstHeader("Retry-After");
                if (firstHeader2 != null) {
                    hashMap.put("Retry-After", firstHeader2.getValue());
                }
                disw diswVar = disw.this;
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                HttpEntity entity = httpResponse.getEntity();
                if (!diswVar.c.contains(Integer.valueOf(statusCode))) {
                    of = Optional.empty();
                } else if (entity == null) {
                    dkty.q("[SR] Did not receive a response body to download.", new Object[0]);
                    of = Optional.empty();
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    eoej.a(entity.getContent(), byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    entity.consumeContent();
                    of = Optional.of(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                }
                return erqt.i(diso.d(statusCode, of, hashMap));
            }
        }, this.g);
    }

    @Override // defpackage.disp
    public final void b(String str, String str2) {
        this.e = eefj.a(str2);
        HttpGet httpGet = new HttpGet(str2);
        this.h = httpGet;
        httpGet.setHeader("User-Agent", str);
        this.f = ditn.e(str2);
    }

    @Override // defpackage.disp
    public final void c(String str, String str2, long j) {
        b(str, str2);
        if (j > 0) {
            HttpGet httpGet = this.h;
            httpGet.getClass();
            httpGet.setHeader("Range", a.y(j, "bytes=", "-"));
            this.c.add(206);
        }
    }

    @Override // defpackage.disp, java.lang.AutoCloseable
    public final void close() {
        DefaultHttpClient defaultHttpClient = this.e;
        defaultHttpClient.getClass();
        defaultHttpClient.getConnectionManager().shutdown();
    }
}
