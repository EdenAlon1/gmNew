package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qum implements qud {
    private final qzz a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public qum(qzz qzzVar, int i) {
        this.a = qzzVar;
        this.b = i;
    }

    private static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    private final InputStream f(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new qtb("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new qtb("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.b);
            httpURLConnection.setReadTimeout(this.b);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int c = c(this.c);
                int i2 = c / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new rjt(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new qtb("Failed to obtain InputStream", c(httpURLConnection2), e);
                    }
                }
                if (i2 != 3) {
                    if (c == -1) {
                        throw new qtb("Http request failed", -1);
                    }
                    try {
                        throw new qtb(this.c.getResponseMessage(), c);
                    } catch (IOException e2) {
                        throw new qtb("Failed to get a response message", c, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new qtb("Received empty or null redirect url", c);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    e();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new qtb("Bad redirect url: ".concat(String.valueOf(headerField)), c, e3);
                }
            } catch (IOException e4) {
                throw new qtb("Failed to connect or obtain data", c(this.c), e4);
            }
        } catch (IOException e5) {
            throw new qtb("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.qud
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.qud
    public final void d() {
        this.e = true;
    }

    @Override // defpackage.qud
    public final void e() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.REMOTE;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        int i = rka.a;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                qzz qzzVar = this.a;
                if (qzzVar.f == null) {
                    if (TextUtils.isEmpty(qzzVar.e)) {
                        String str = qzzVar.d;
                        if (TextUtils.isEmpty(str)) {
                            URL url = qzzVar.c;
                            rkf.f(url);
                            str = url.toString();
                        }
                        qzzVar.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    qzzVar.f = new URL(qzzVar.e);
                }
                qucVar.c(f(qzzVar.f, 0, null, this.a.b.a()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                qucVar.f(e);
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + rka.a(elapsedRealtimeNanos));
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + rka.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
