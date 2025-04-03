package defpackage;

import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fimi extends HttpURLConnection {
    private static final String h = "fimi";
    public final fimn a;
    public UrlRequest b;
    public fimk c;
    public fiml d;
    public UrlResponseInfo e;
    public IOException f;
    public boolean g;
    private final CronetEngine i;
    private final List j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private List p;
    private Map q;

    public fimi(URL url, CronetEngine cronetEngine) {
        super(url);
        new fiev("CronetHttpURLConnection#CronetHttpURLConnection");
        try {
            this.i = cronetEngine;
            this.a = new fimn();
            this.c = new fimk(this);
            this.j = new ArrayList();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final int g(String str) {
        for (int i = 0; i < this.j.size(); i++) {
            if (((String) ((Pair) this.j.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    private final List h() {
        List list = this.p;
        if (list != null) {
            return list;
        }
        this.p = new ArrayList();
        for (Map.Entry<String, String> entry : this.e.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.p.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(this.p);
        this.p = unmodifiableList;
        return unmodifiableList;
    }

    private final Map.Entry i(int i) {
        try {
            k();
            List h2 = h();
            if (i >= h2.size()) {
                return null;
            }
            return (Map.Entry) h2.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    private final Map j() {
        Map map = this.q;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : h()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(treeMap);
        this.q = unmodifiableMap;
        return unmodifiableMap;
    }

    private final void k() {
        new fiev("CronetHttpURLConnection#getResponse");
        try {
            fiml fimlVar = this.d;
            if (fimlVar != null) {
                fimlVar.b();
                this.d.close();
            }
            if (!this.o) {
                m();
                this.a.a();
            }
            if (!this.o) {
                throw new IllegalStateException("No response.");
            }
            IOException iOException = this.f;
            if (iOException != null) {
                throw iOException;
            }
            if (this.e == null) {
                throw new NullPointerException("Response info is null when there is no exception.");
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void l(String str, String str2, boolean z) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int g = g(str);
        if (g >= 0) {
            if (!z) {
                throw new UnsupportedOperationException(a.a(str, "Cannot add multiple headers of the same key, ", ". crbug.com/432719."));
            }
            this.j.remove(g);
        }
        this.j.add(Pair.create(str, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        if (r6.m != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
    
        if (r6.k != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fimi.m():void");
    }

    private final boolean n() {
        return this.chunkLength > 0;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        l(str, str2, false);
    }

    public final void b(int i) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
        }
        this.k = true;
        this.l = i;
    }

    @Override // java.net.URLConnection
    public final void connect() {
        getOutputStream();
        m();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.connected) {
            this.b.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            k();
            if (this.e.getHttpStatusCode() >= 400) {
                return this.c;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry i2 = i(i);
        if (i2 == null) {
            return null;
        }
        return (String) i2.getValue();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry i2 = i(i);
        if (i2 == null) {
            return null;
        }
        return (String) i2.getKey();
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            k();
            return j();
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        k();
        if (!this.instanceFollowRedirects && this.g) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.e.getHttpStatusCode() < 400) {
            return this.c;
        }
        throw new FileNotFoundException(this.url.toString());
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        if (this.d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (n()) {
                this.d = new fime(this.chunkLength, this.a);
                m();
            } else {
                long j = this.fixedContentLength;
                if (this.fixedContentLengthLong != -1) {
                    j = this.fixedContentLengthLong;
                }
                if (j != -1) {
                    this.d = new fimg(j, this.a);
                    m();
                } else {
                    String str = h;
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Outputstream is being buffered in memory.");
                    }
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.d = new fimc(this);
                    } else {
                        this.d = new fimc(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.d;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair pair : this.j) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, DesugarCollections.unmodifiableList(arrayList));
        }
        return DesugarCollections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int g = g(str);
        if (g >= 0) {
            return (String) ((Pair) this.j.get(g)).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        k();
        return this.e.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        k();
        return this.e.getHttpStatusText();
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        Log.d(h, "setConnectTimeout is not supported by CronetHttpURLConnection");
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        l(str, str2, true);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            k();
            Map j = j();
            if (!j.containsKey(str)) {
                return null;
            }
            return (String) ((List) j.get(str)).get(r3.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }
}
