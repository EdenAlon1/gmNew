package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class favx implements fawj {
    public final HttpURLConnection a;
    public final favp b;
    public final byte[] c;
    public long d;
    public fawn e;
    public int f = -1;
    public int g = 0;
    private final Executor h;
    private int i;

    public favx(HttpURLConnection httpURLConnection, String str, favs favsVar, favp favpVar, Executor executor) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.b = favpVar;
            if (favpVar != null) {
                httpURLConnection.setDoOutput(true);
                if (favpVar.e() >= 0) {
                    long e = favpVar.e() - favpVar.d();
                    if (e < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) e);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(e);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : favsVar.c()) {
                Iterator it = favsVar.b(str2).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
            this.i = 1;
            this.c = new byte[65536];
            this.h = executor;
        } catch (ProtocolException e2) {
            throw new IllegalArgumentException("Invalid http method.", e2);
        }
    }

    @Override // defpackage.fawj
    public final long a() {
        return this.d;
    }

    @Override // defpackage.fawj
    public final ListenableFuture b() {
        errj errjVar = new errj(new Callable() { // from class: favw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                favt c;
                favx favxVar = favx.this;
                try {
                    synchronized (favxVar) {
                    }
                    favxVar.g();
                    try {
                        OutputStream outputStream = favxVar.a.getOutputStream();
                        favxVar.a.connect();
                        if (favxVar.b == null) {
                            c = favxVar.c();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            loop0: while (true) {
                                int i = 0;
                                while (favxVar.h()) {
                                    favxVar.g();
                                    int i2 = 0;
                                    while (i2 < 65536 && favxVar.h()) {
                                        try {
                                            int a = favxVar.b.a(favxVar.c, i2, 65536 - i2);
                                            favxVar.d += a;
                                            i2 += a;
                                            try {
                                                outputStream.write(favxVar.c, i2 - a, a);
                                            } catch (IOException unused) {
                                                c = favxVar.c();
                                            }
                                        } catch (IOException e) {
                                            throw new fawl(fawk.REQUEST_BODY_READ_ERROR, e);
                                        }
                                    }
                                    i += i2;
                                    if (i >= favxVar.f) {
                                        boolean z = true;
                                        if (favxVar.g > 0) {
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            if (currentTimeMillis2 - currentTimeMillis >= favxVar.g) {
                                                currentTimeMillis = currentTimeMillis2;
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            synchronized (favxVar) {
                                                fawn fawnVar = favxVar.e;
                                                if (fawnVar != null) {
                                                    fawnVar.b(favxVar);
                                                }
                                            }
                                        }
                                    }
                                }
                                break loop0;
                            }
                            c = favxVar.c();
                        }
                    } catch (FileNotFoundException e2) {
                        throw new fawl(fawk.BAD_URL, e2);
                    } catch (IOException e3) {
                        try {
                            c = favxVar.c();
                        } catch (fawl unused2) {
                            throw new fawl(fawk.CONNECTION_ERROR, e3);
                        }
                    }
                    synchronized (favxVar) {
                    }
                    return new fawm(c);
                } catch (fawl e4) {
                    synchronized (favxVar) {
                        return new fawm(e4);
                    }
                }
            }
        });
        Executor executor = this.h;
        if (executor != null) {
            executor.execute(errjVar);
            return errjVar;
        }
        ersf ersfVar = new ersf();
        ersfVar.d("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ersf.b(ersfVar));
        newSingleThreadExecutor.execute(errjVar);
        newSingleThreadExecutor.shutdown();
        return errjVar;
    }

    public final favt c() {
        InputStream errorStream;
        favs favsVar;
        g();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException unused) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                favsVar = new favs();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        Iterator<String> it = headerFields.get(str).iterator();
                        while (it.hasNext()) {
                            favsVar.d(str, it.next());
                        }
                    }
                }
            } else {
                favsVar = null;
            }
            return new favt(responseCode, favsVar, errorStream);
        } catch (IOException e) {
            throw new fawl(fawk.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    @Override // defpackage.fawj
    public final String d() {
        return null;
    }

    @Override // defpackage.fawj
    public final synchronized void e(fawn fawnVar, int i, int i2) {
        this.e = fawnVar;
        if (i > 0) {
            this.f = i;
        }
        if (i2 >= 0) {
            this.g = i2;
        }
    }

    @Override // defpackage.fawj
    public final void f() {
        synchronized (this) {
            this.i = 3;
            notifyAll();
        }
    }

    public final synchronized void g() {
        int i;
        while (true) {
            i = this.i;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new fawl(fawk.CANCELED, "");
        }
        emyw.a(i == 1);
    }

    public final boolean h() {
        try {
            return this.b.i();
        } catch (IOException e) {
            throw new fawl(fawk.REQUEST_BODY_READ_ERROR, e);
        }
    }
}
