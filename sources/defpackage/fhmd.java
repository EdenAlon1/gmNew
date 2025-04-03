package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhmd extends HttpURLConnection implements fhff {
    fhgs a;
    final fhmc b;
    final fhgf c;
    fhgh d;
    boolean e;
    fhfe f;
    long g;
    public final Object h;
    fhhb i;
    boolean j;
    Proxy k;
    fhge l;
    private fhhb m;
    private Throwable n;

    public fhmd(URL url, fhgs fhgsVar) {
        super(url);
        this.b = new fhmc(this);
        this.c = new fhgf();
        this.g = -1L;
        this.h = new Object();
        this.j = true;
        this.a = fhgsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r10 = new defpackage.fhmt();
        r10.T(r4, 0, r5);
        r10.U(63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r5 = r5 + java.lang.Character.charCount(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r5 >= r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r7 = r4.codePointAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r7 <= 31) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r7 >= 127) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        r10.U(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        r12 = 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        r4 = r10.m();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.fhfe e() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhmd.e():fhfe");
    }

    private final fhhb f(boolean z) {
        fhhb fhhbVar;
        synchronized (this.h) {
            fhhb fhhbVar2 = this.m;
            if (fhhbVar2 != null) {
                return fhhbVar2;
            }
            Throwable th = this.n;
            if (th != null) {
                if (!z || (fhhbVar = this.i) == null) {
                    throw fhmk.a(th);
                }
                return fhhbVar;
            }
            fhfe e = e();
            this.b.b();
            fhmg fhmgVar = (fhmg) ((fhid) e).b.d;
            if (fhmgVar != null) {
                fhmgVar.e.close();
            }
            if (this.e) {
                synchronized (this.h) {
                    while (this.m == null && this.n == null) {
                        try {
                            try {
                                this.h.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        } finally {
                        }
                    }
                }
            } else {
                this.e = true;
                try {
                    b(e.a());
                } catch (IOException e2) {
                    a(e2);
                }
            }
            synchronized (this.h) {
                Throwable th2 = this.n;
                if (th2 != null) {
                    throw fhmk.a(th2);
                }
                fhhb fhhbVar3 = this.m;
                if (fhhbVar3 != null) {
                    return fhhbVar3;
                }
                throw new AssertionError();
            }
        }
    }

    @Override // defpackage.fhff
    public final void a(IOException iOException) {
        synchronized (this.h) {
            boolean z = iOException instanceof fhmj;
            Throwable th = iOException;
            if (z) {
                th = iOException.getCause();
            }
            this.n = th;
            this.h.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 == null) {
            return;
        }
        this.c.e(str, str2);
    }

    @Override // defpackage.fhff
    public final void b(fhhb fhhbVar) {
        synchronized (this.h) {
            this.m = fhhbVar;
            this.l = fhhbVar.e;
            this.url = fhhbVar.a.a.g();
            this.h.notifyAll();
        }
    }

    final fhgh c() {
        String str;
        if (this.d == null) {
            fhhb f = f(true);
            fhgh fhghVar = f.f;
            fhgt fhgtVar = f.b;
            fhgf e = fhghVar.e();
            e.e("ObsoleteUrlFactory-Selected-Protocol", fhgtVar.g);
            fhhb fhhbVar = f.h;
            int i = fhmk.e;
            if (fhhbVar == null) {
                if (f.i == null) {
                    str = "NONE";
                } else {
                    str = "CACHE " + f.d;
                }
            } else if (f.i == null) {
                str = "NETWORK " + f.d;
            } else {
                str = "CONDITIONAL_CACHE " + f.h.d;
            }
            e.e("ObsoleteUrlFactory-Response-Source", str);
            this.d = e.b();
        }
        return this.d;
    }

    @Override // java.net.URLConnection
    public final void connect() {
        if (this.e) {
            return;
        }
        fhfe e = e();
        this.e = true;
        e.c(this);
        synchronized (this.h) {
            while (this.j && this.m == null && this.n == null) {
                try {
                    this.h.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            Throwable th = this.n;
            if (th != null) {
                throw fhmk.a(th);
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.f == null) {
            return;
        }
        this.b.b();
        this.f.b();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if ("chunked".equalsIgnoreCase(defpackage.fhhb.b(r0, "Transfer-Encoding")) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: IOException -> 0x0059, TRY_ENTER, TryCatch #0 {IOException -> 0x0059, blocks: (B:3:0x0002, B:8:0x0015, B:12:0x0028, B:18:0x003e, B:20:0x004c, B:22:0x0052, B:26:0x0036), top: B:2:0x0002 }] */
    @Override // java.net.HttpURLConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream getErrorStream() {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            fhhb r0 = r7.f(r0)     // Catch: java.io.IOException -> L59
            int r2 = defpackage.fhmk.e     // Catch: java.io.IOException -> L59
            fhgv r2 = r0.a     // Catch: java.io.IOException -> L59
            java.lang.String r2 = r2.b     // Catch: java.io.IOException -> L59
            java.lang.String r3 = "HEAD"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L59
            if (r2 == 0) goto L15
            goto L59
        L15:
            int r2 = r0.d     // Catch: java.io.IOException -> L59
            r3 = 100
            if (r2 < r3) goto L1f
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto L28
        L1f:
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 == r3) goto L28
            r3 = 304(0x130, float:4.26E-43)
            if (r2 == r3) goto L28
            goto L4c
        L28:
            fhgh r2 = r0.f     // Catch: java.io.IOException -> L59
            java.lang.String r3 = "Content-Length"
            java.lang.String r2 = r2.b(r3)     // Catch: java.io.IOException -> L59
            r3 = -1
            if (r2 != 0) goto L36
        L34:
            r5 = r3
            goto L3a
        L36:
            long r5 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L34 java.io.IOException -> L59
        L3a:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L4c
            java.lang.String r2 = "chunked"
            java.lang.String r3 = "Transfer-Encoding"
            java.lang.String r3 = defpackage.fhhb.b(r0, r3)     // Catch: java.io.IOException -> L59
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> L59
            if (r2 == 0) goto L59
        L4c:
            int r2 = r0.d     // Catch: java.io.IOException -> L59
            r3 = 400(0x190, float:5.6E-43)
            if (r2 < r3) goto L59
            fhhe r0 = r0.g     // Catch: java.io.IOException -> L59
            java.io.InputStream r0 = r0.d()     // Catch: java.io.IOException -> L59
            return r0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhmd.getErrorStream():java.io.InputStream");
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        try {
            fhgh c = c();
            if (i >= 0 && i < c.a()) {
                return c.d(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        try {
            fhgh c = c();
            if (i >= 0 && i < c.a()) {
                return c.c(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            return fhmk.e(c(), fhmk.b(f(true)));
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        if (!this.doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        fhhb f = f(false);
        if (f.d < 400) {
            return f.g.d();
        }
        throw new FileNotFoundException(this.url.toString());
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.i;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        fhmg fhmgVar = (fhmg) ((fhid) e()).b.d;
        if (fhmgVar == null) {
            throw new ProtocolException("method does not support a request body: ".concat(String.valueOf(this.method)));
        }
        if (fhmgVar instanceof fhmh) {
            connect();
            this.b.b();
        }
        if (fhmgVar.f) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return fhmgVar.e;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        int a;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            a = url.getPort();
        } else {
            String protocol = url.getProtocol();
            char[] cArr = fhgk.a;
            a = fhgj.a(protocol);
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.a.l.address();
            host = inetSocketAddress.getHostName();
            a = inetSocketAddress.getPort();
        }
        return new SocketPermission(a.g(a, host, ":"), "connect, resolve");
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.x;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return fhmk.e(this.c.b(), null);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.c.a(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return f(true).d;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return f(true).c;
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        fhgr fhgrVar = new fhgr(this.a);
        fhgrVar.a(i, TimeUnit.MILLISECONDS);
        this.a = new fhgs(fhgrVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        if (this.ifModifiedSince == 0) {
            this.c.f("If-Modified-Since");
            return;
        }
        this.c.d("If-Modified-Since", ((DateFormat) fhmk.c.get()).format(new Date(this.ifModifiedSince)));
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        fhgr fhgrVar = new fhgr(this.a);
        fhgrVar.g = z;
        this.a = new fhgs(fhgrVar);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        fhgr fhgrVar = new fhgr(this.a);
        fhgrVar.b(i, TimeUnit.MILLISECONDS);
        this.a = new fhgs(fhgrVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        if (fhmk.a.contains(str)) {
            this.method = str;
            return;
        }
        throw new ProtocolException("Expected one of " + String.valueOf(fhmk.a) + " but was " + str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 == null) {
            return;
        }
        this.c.d(str, str2);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        if (this.k != null) {
            return true;
        }
        Proxy proxy = this.a.l;
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Already connected");
        }
        if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (j < 0) {
            throw new IllegalArgumentException("contentLength < 0");
        }
        this.g = j;
        ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j, 2147483647L);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            if (str == null) {
                return fhmk.b(f(true));
            }
            return c().b(str);
        } catch (IOException unused) {
            return null;
        }
    }
}
