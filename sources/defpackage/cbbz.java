package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbbz extends cbbh {
    private static volatile qoo h;
    private final crmr j;
    public static final cskc g = cskc.g("Bugle", "NetworkUriImageRequest");
    private static final int i = (int) TimeUnit.SECONDS.toMillis(10);

    /* compiled from: PG */
    public interface a {
        crmr iz();
    }

    public cbbz(Context context, cbce cbceVar) {
        super(context, cbceVar);
        this.e = 0;
        this.j = ((a) ekhw.a(context, a.class)).iz();
    }

    @Override // defpackage.cbbh
    protected final InputStream i() {
        csix.h();
        String uri = ((cbce) this.b).a().toString();
        try {
            return new URL(uri).openStream();
        } catch (Exception e) {
            csjb b = g.b();
            b.I("Exception trying to get inputStream for image.");
            b.A("url", uri);
            b.s(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cbbh
    public final Bitmap l() {
        CountDownLatch countDownLatch;
        IOException e;
        HttpURLConnection httpURLConnection;
        MalformedURLException e2;
        OutOfMemoryError e3;
        csix.h();
        final cbby cbbyVar = new cbby();
        String uri = ((cbce) this.b).a().toString();
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        Context context = this.a;
        if (h == null) {
            synchronized (cbbz.class) {
                if (h == null) {
                    h = qpp.a(context);
                }
            }
        }
        HttpURLConnection httpURLConnection2 = null;
        r8 = null;
        r8 = null;
        Bitmap bitmap = null;
        h.a(new qpk(uri, new qoq() { // from class: cbbw
            @Override // defpackage.qoq
            public final void a(Object obj) {
                cskc cskcVar = cbbz.g;
                csix.l(obj);
                cbby cbbyVar2 = cbby.this;
                csix.i(cbbyVar2.a);
                cbbyVar2.a = (Bitmap) obj;
                countDownLatch2.countDown();
            }
        }, null, new qop() { // from class: cbbx
            @Override // defpackage.qop
            public final void a(qou qouVar) {
                cbbz.g.s("Error loading image from volley!", qouVar);
                countDownLatch2.countDown();
            }
        }));
        try {
            countDownLatch2.await(i, TimeUnit.MILLISECONDS);
            countDownLatch = countDownLatch2;
        } catch (InterruptedException unused) {
            Thread currentThread = Thread.currentThread();
            currentThread.interrupt();
            countDownLatch = currentThread;
        }
        Bitmap bitmap2 = cbbyVar.a;
        try {
            if (bitmap2 != null) {
                return bitmap2;
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                try {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() == 200) {
                        bitmap2 = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    }
                    bitmap = bitmap2;
                    if (httpURLConnection == null) {
                        return bitmap;
                    }
                } catch (IOException e4) {
                    e = e4;
                    csjb e5 = g.e();
                    e5.I("IOException trying to get inputStream for image.");
                    e5.A("url", uri);
                    e5.s(e);
                    if (httpURLConnection == null) {
                        return bitmap2;
                    }
                    httpURLConnection.disconnect();
                    return bitmap;
                } catch (OutOfMemoryError e6) {
                    e3 = e6;
                    csjb e7 = g.e();
                    e7.I("OutOfMemoryError for image.");
                    e7.A("url", uri);
                    e7.s(e3);
                    this.j.a(15, 1);
                    if (httpURLConnection == null) {
                        return bitmap2;
                    }
                    httpURLConnection.disconnect();
                    return bitmap;
                } catch (MalformedURLException e8) {
                    e2 = e8;
                    csjb e9 = g.e();
                    e9.I("MalformedUrl for image.");
                    e9.A("url", uri);
                    e9.s(e2);
                    if (httpURLConnection == null) {
                        return bitmap2;
                    }
                    httpURLConnection.disconnect();
                    return bitmap;
                }
            } catch (OutOfMemoryError e10) {
                e3 = e10;
                httpURLConnection = null;
            } catch (MalformedURLException e11) {
                e2 = e11;
                httpURLConnection = null;
            } catch (IOException e12) {
                e = e12;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
            httpURLConnection.disconnect();
            return bitmap;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = countDownLatch;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.net.HttpURLConnection] */
    @Override // defpackage.cbbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean o() {
        /*
            r8 = this;
            java.lang.String r0 = "url"
            defpackage.csix.h()
            cbbi r1 = r8.b
            cbce r1 = (defpackage.cbce) r1
            android.net.Uri r1 = r1.a()
            r2 = 8963(0x2303, float:1.256E-41)
            r3 = 0
            r4 = 0
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            r2.connect()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            int r4 = r2.getResponseCode()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L6a
            java.lang.String r4 = "image/gif"
            java.lang.String r5 = r2.getContentType()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            boolean r3 = r4.equalsIgnoreCase(r5)     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            goto L6a
        L39:
            r4 = move-exception
            goto L43
        L3b:
            r4 = move-exception
            goto L59
        L3d:
            r0 = move-exception
            goto L75
        L3f:
            r2 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L43:
            cskc r5 = defpackage.cbbz.g     // Catch: java.lang.Throwable -> L73
            csjb r5 = r5.b()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "IOException trying to get inputStream for image."
            r5.I(r6)     // Catch: java.lang.Throwable -> L73
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> L73
            r5.s(r4)     // Catch: java.lang.Throwable -> L73
            goto L6a
        L55:
            r2 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L59:
            cskc r5 = defpackage.cbbz.g     // Catch: java.lang.Throwable -> L73
            csjb r5 = r5.b()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "MalformedUrl for image."
            r5.I(r6)     // Catch: java.lang.Throwable -> L73
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> L73
            r5.s(r4)     // Catch: java.lang.Throwable -> L73
        L6a:
            if (r2 == 0) goto L6f
            r2.disconnect()
        L6f:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L73:
            r0 = move-exception
            r4 = r2
        L75:
            if (r4 == 0) goto L7a
            r4.disconnect()
        L7a:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbbz.o():boolean");
    }
}
