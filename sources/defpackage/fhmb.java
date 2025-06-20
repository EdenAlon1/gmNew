package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhmb extends HttpsURLConnection {
    private final HttpURLConnection a;

    public fhmb(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.a = httpURLConnection;
    }

    protected abstract fhge a();

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.connected = true;
        this.a.connect();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.a.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        fhge a = a();
        if (a != null) {
            return a.b.t;
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.a.getContent();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return this.a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        long contentLengthLong;
        contentLengthLong = this.a.getContentLengthLong();
        return contentLengthLong;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.a.getErrorStream();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        return this.a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        return this.a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        return this.a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        return this.a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        long headerFieldLong;
        headerFieldLong = this.a.getHeaderFieldLong(str, j);
        return headerFieldLong;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        return this.a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.a.getInputStream();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        fhge a = a();
        if (a == null) {
            return null;
        }
        List list = a.c;
        if (list.isEmpty()) {
            return null;
        }
        return (Certificate[]) list.toArray(new Certificate[list.size()]);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        fhge a = a();
        if (a != null) {
            Object M = ffdx.M(a.c);
            X509Certificate x509Certificate = M instanceof X509Certificate ? (X509Certificate) M : null;
            if (x509Certificate != null) {
                return x509Certificate.getSubjectX500Principal();
            }
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.a.getOutputStream();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        fhge a = a();
        if (a != null) {
            Object M = ffdx.M(a.a());
            X509Certificate x509Certificate = M instanceof X509Certificate ? (X509Certificate) M : null;
            if (x509Certificate != null) {
                return x509Certificate.getSubjectX500Principal();
            }
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.a.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.a.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.a.getResponseMessage();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        fhge a = a();
        if (a == null) {
            return null;
        }
        List a2 = a.a();
        if (a2.isEmpty()) {
            return null;
        }
        return (Certificate[]) a2.toArray(new Certificate[a2.size()]);
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.a.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.a.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        return this.a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.a.setFixedLengthStreamingMode(j);
    }
}
