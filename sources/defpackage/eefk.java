package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefk {
    private final eece a;

    public eefk(eece eeceVar) {
        this.a = eeceVar;
    }

    public final HttpURLConnection a(String str, String str2) {
        dkty.c("Creating a HTTP connection for file transfer to %s, connect timeout %dms, read timeout %dms, method %s", str2, 15000, 10000, "GET");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("User-Agent", str);
        SSLSocketFactory d = this.a.d();
        if (!(httpURLConnection instanceof HttpsURLConnection)) {
            dkty.o("Content server connection is not HTTPS, nothing to be done.", new Object[0]);
            return httpURLConnection;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        URL url = httpURLConnection.getURL();
        if (url == null) {
            dkty.q("URL is null. Cannot set security for content server connection.", new Object[0]);
            return httpURLConnection;
        }
        dkty.o("Creating a content server connection for host: %s", url.getHost());
        try {
            httpsURLConnection.setSSLSocketFactory(d);
            return httpURLConnection;
        } catch (IllegalArgumentException e) {
            dkty.i(e, "Unable to set security for content server connection", new Object[0]);
            return httpURLConnection;
        }
    }
}
