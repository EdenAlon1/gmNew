package org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.Trace;
import android.util.Log;
import defpackage.a;
import defpackage.fieh;
import defpackage.fiei;
import defpackage.fiev;
import defpackage.figy;
import defpackage.fiha;
import defpackage.fihm;
import defpackage.fiho;
import defpackage.fihp;
import defpackage.fihq;
import defpackage.fihw;
import defpackage.fiib;
import defpackage.fiic;
import defpackage.fiid;
import defpackage.fiix;
import defpackage.fiiy;
import defpackage.fiiz;
import defpackage.fija;
import defpackage.fijb;
import defpackage.fili;
import defpackage.filk;
import defpackage.filq;
import defpackage.filr;
import defpackage.fils;
import defpackage.fimi;
import defpackage.fimm;
import internal.J.N;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestContextConfigOptions;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class CronetUrlRequestContext extends fihm {
    public static final String a = "CronetUrlRequestContext";
    public static final /* synthetic */ int g = 0;
    private static final HashSet h = new HashSet();
    public final Object b;
    public long c;
    public Thread d;
    public final long e;
    public final fiic f;
    private final ConditionVariable i;
    private final AtomicInteger j;
    private final AtomicInteger k;
    private final boolean l;
    private final Object m;
    private final Object n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final fiei s;
    private final fiei t;
    private final Map u;
    private final ConditionVariable v;
    private final String w;
    private boolean x;
    private boolean y;
    private long z;

    public CronetUrlRequestContext(fihq fihqVar, long j) {
        Object obj = new Object();
        this.b = obj;
        this.i = new ConditionVariable(false);
        this.j = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.m = new Object();
        this.n = new Object();
        this.o = 0;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = new fiei();
        this.t = new fiei();
        this.u = new HashMap();
        this.v = new ConditionVariable();
        this.z = -1L;
        new fiev("CronetUrlRequestContext#CronetUrlRequestContext");
        try {
            this.l = fihqVar.p;
            boolean c = CronetLibraryLoader.c(fihqVar.c, fihqVar, false);
            if (fihqVar.a() == 1) {
                String str = fihqVar.i;
                this.w = str;
                HashSet hashSet = h;
                synchronized (hashSet) {
                    if (!hashSet.add(str)) {
                        throw new IllegalStateException("Disk cache storage path already in use");
                    }
                }
            } else {
                this.w = null;
            }
            synchronized (obj) {
                new fiev("CronetUrlRequestContext#CronetUrlRequestContext creating adapter");
                try {
                    figy figyVar = (figy) CronetLibraryLoader.a().a().get("Cronet_override_network_thread_priority");
                    RequestContextConfigOptions.Builder newBuilder = RequestContextConfigOptions.newBuilder();
                    newBuilder.setQuicEnabled(fihqVar.j);
                    newBuilder.setHttp2Enabled(fihqVar.k);
                    newBuilder.setBrotliEnabled(fihqVar.l);
                    newBuilder.setDisableCache(!fihqVar.m.f);
                    newBuilder.setHttpCacheMode(fihqVar.a());
                    newBuilder.setHttpCacheMaxSize(fihqVar.n);
                    newBuilder.setMockCertVerifier(0L);
                    newBuilder.setEnableNetworkQualityEstimator(fihqVar.p);
                    newBuilder.setBypassPublicKeyPinningForLocalTrustAnchors(fihqVar.g);
                    newBuilder.setNetworkThreadPriority(figyVar != null ? (int) figyVar.b() : fihqVar.b(10));
                    String str2 = fihqVar.h;
                    if (str2 != null) {
                        newBuilder.setUserAgent(str2);
                    }
                    String str3 = fihqVar.i;
                    if (str3 != null) {
                        newBuilder.setStoragePath(str3);
                    }
                    fihqVar.c();
                    newBuilder.setQuicDefaultUserAgentId(fihqVar.c());
                    String str4 = fihqVar.o;
                    if (str4 != null) {
                        newBuilder.setExperimentalOptions(str4);
                    }
                    long MB3ntV7V = N.MB3ntV7V(newBuilder.build().toByteArray());
                    if (MB3ntV7V == 0) {
                        throw new IllegalArgumentException("Experimental options parsing failed.");
                    }
                    for (fihp fihpVar : fihqVar.d) {
                        N.MyRIv1Ij(MB3ntV7V, fihpVar.a, fihpVar.b, fihpVar.c);
                    }
                    for (fiho fihoVar : fihqVar.e) {
                        N.Muq3ic6p(MB3ntV7V, fihoVar.a, fihoVar.b, fihoVar.c, fihoVar.d.getTime());
                    }
                    this.c = N.M135Cu0D(MB3ntV7V);
                    Trace.endSection();
                    if (this.c == 0) {
                        throw new NullPointerException("Context Adapter creation failed.");
                    }
                } finally {
                }
            }
            fiic a2 = fiid.a(fihqVar.c, fihqVar.f);
            this.f = a2;
            long a3 = a2.a();
            this.e = a3;
            fihw d = fihqVar.d();
            try {
                a2.c(a3, d, new fiib("Cronet/".concat(ImplVersion.getCronetVersionWithLastChange()).split("/")[1].split("@")[0]), fihqVar.f);
            } catch (RuntimeException e) {
                Log.i("cn_".concat(String.valueOf(a)), "Error while trying to log CronetEngine creation: ", e);
            }
            fijb fijbVar = c ? new fijb(this.f, d.i, j) : null;
            CronetLibraryLoader.b(new fiix(this, fijbVar));
            if (fijbVar != null) {
                int a4 = fijbVar.a();
                synchronized (fijbVar.a) {
                    fijbVar.a.b = a4;
                    fijbVar.b();
                }
            }
            Trace.endSection();
        } finally {
        }
    }

    private final void h() {
        if (!k()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private static void i(Executor executor, Runnable runnable, String str) {
        j(executor, runnable, null, str);
    }

    private final void initNetworkThread() {
        this.d = Thread.currentThread();
        this.i.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    private static void j(Executor executor, final Runnable runnable, final fili filiVar, final String str) {
        new fiev("CronetUrlRequestContext#postObservationTaskToExecutor ".concat(str));
        if (filiVar != null) {
            try {
                filiVar.b();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        try {
            executor.execute(new Runnable() { // from class: fiiw
                /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
                
                    if (r1 == null) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
                
                    android.os.Trace.endSection();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
                
                    return;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r5 = this;
                        int r0 = org.chromium.net.impl.CronetUrlRequestContext.g
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r1 = "CronetUrlRequestContext#postObservationTaskToExecutor "
                        r0.<init>(r1)
                        java.lang.String r1 = r1
                        r0.append(r1)
                        java.lang.String r1 = " running callback"
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        fiev r1 = new fiev
                        r1.<init>(r0)
                        java.lang.Runnable r0 = r2
                        fili r1 = r3
                        r0.run()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                        if (r1 == 0) goto L42
                    L25:
                        r1.a()     // Catch: java.lang.Throwable -> L29
                        goto L42
                    L29:
                        r0 = move-exception
                        goto L4c
                    L2b:
                        r0 = move-exception
                        goto L46
                    L2d:
                        r0 = move-exception
                        java.lang.String r2 = org.chromium.net.impl.CronetUrlRequestContext.a     // Catch: java.lang.Throwable -> L2b
                        java.lang.String r3 = "Exception thrown from observation task"
                        java.lang.String r4 = "cn_"
                        java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2b
                        java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.Throwable -> L2b
                        android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L2b
                        if (r1 == 0) goto L42
                        goto L25
                    L42:
                        android.os.Trace.endSection()
                        return
                    L46:
                        if (r1 == 0) goto L4b
                        r1.a()     // Catch: java.lang.Throwable -> L29
                    L4b:
                        throw r0     // Catch: java.lang.Throwable -> L29
                    L4c:
                        android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L50
                        goto L54
                    L50:
                        r1 = move-exception
                        r0.addSuppressed(r1)
                    L54:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.fiiw.run():void");
                }
            });
        } catch (RejectedExecutionException e) {
            if (filiVar != null) {
                filiVar.a();
            }
            Log.e("cn_".concat(String.valueOf(a)), "Exception posting task to executor", e);
        }
        Trace.endSection();
    }

    private final boolean k() {
        return this.c != 0;
    }

    private final void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.m) {
            this.o = i;
        }
    }

    private final void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.m) {
            this.p = i;
            this.q = i2;
            this.r = i3;
        }
    }

    private final void onRttObservation(int i, long j, int i2) {
        synchronized (this.m) {
            fieh fiehVar = new fieh(this.s);
            while (fiehVar.hasNext()) {
                filq filqVar = (filq) fiehVar.next();
                int i3 = i;
                long j2 = j;
                int i4 = i2;
                i(filqVar.getExecutor(), new fiiy(filqVar, i3, j2, i4), "onRttObservation");
                i = i3;
                j = j2;
                i2 = i4;
            }
        }
    }

    private final void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.m) {
            fieh fiehVar = new fieh(this.t);
            while (fiehVar.hasNext()) {
                filr filrVar = (filr) fiehVar.next();
                int i3 = i;
                long j2 = j;
                int i4 = i2;
                i(filrVar.getExecutor(), new fiiz(filrVar, i3, j2, i4), "onThroughputObservation");
                i = i3;
                j = j2;
                i2 = i4;
            }
        }
    }

    @Override // defpackage.fihm
    protected final ExperimentalBidirectionalStream a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        long j2 = j == -1 ? this.z : j;
        synchronized (this.b) {
            try {
                try {
                    h();
                    return new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z, collection, z2, i2, z3, i3, j2);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.n) {
            this.u.put(listener, new fils(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            if (this.s.b()) {
                synchronized (this.b) {
                    h();
                    N.MpnFLFF2(this.c, this, true);
                }
            }
            this.s.d(new filq(networkQualityRttListener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            if (this.t.b()) {
                synchronized (this.b) {
                    h();
                    N.MnPUhNKP(this.c, this, true);
                }
            }
            this.t.d(new filr(networkQualityThroughputListener));
        }
    }

    @Override // defpackage.fihm
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) {
        long j2 = j == -1 ? this.z : j;
        synchronized (this.b) {
            try {
                try {
                    h();
                    return new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3, z4, i2, z5, i3, listener, i4, j2, str2, arrayList, uploadDataProvider, executor2, bArr, byteBuffer, str3);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.z = j;
    }

    public final long c() {
        long j;
        synchronized (this.b) {
            h();
            j = this.c;
        }
        return j;
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.b) {
            h();
            N.M6sIJDgy_ForTesting(this.c, this, z, z2, z3);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new fimm(this);
    }

    final void d() {
        this.j.decrementAndGet();
    }

    public final void e() {
        this.k.decrementAndGet();
    }

    final void f() {
        this.k.incrementAndGet();
        this.j.incrementAndGet();
    }

    final void g(RequestFinishedInfo requestFinishedInfo, fili filiVar, fils filsVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.n) {
            arrayList.addAll(this.u.values());
        }
        if (filsVar != null) {
            arrayList.add(filsVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fils filsVar2 = (fils) arrayList.get(i);
            j(filsVar2.getExecutor(), new fija(filsVar2, requestFinishedInfo), filiVar, "reportRequestFinished");
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.k.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            i = this.r;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            int i2 = this.o;
            if (i2 != 0) {
                i = 1;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        i = 3;
                        if (i2 != 3) {
                            i = 4;
                            if (i2 != 4) {
                                i = 5;
                                if (i2 != 5) {
                                    throw new RuntimeException(a.h(i2, "Internal Error: Illegal EffectiveConnectionType value "));
                                }
                            }
                        }
                    }
                }
            } else {
                i = 0;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return (byte[]) N.M7CZ_Klr();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            i = this.p;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        int i;
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            i = this.q;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "Cronet/".concat(ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // defpackage.fihm, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new fiha(str, callback, executor, this);
    }

    @Override // defpackage.fihm, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new filk(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.n) {
            this.u.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            if (this.s.c(new filq(networkQualityRttListener)) && this.s.b()) {
                synchronized (this.b) {
                    h();
                    N.MpnFLFF2(this.c, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.l) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.m) {
            if (this.t.c(new filr(networkQualityThroughputListener)) && this.t.b()) {
                synchronized (this.b) {
                    h();
                    N.MnPUhNKP(this.c, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        new fiev("CronetUrlRequestContext#shutdown");
        try {
            if (this.w != null) {
                HashSet hashSet = h;
                synchronized (hashSet) {
                    hashSet.remove(this.w);
                }
            }
            synchronized (this.b) {
                h();
                if (this.j.get() != 0) {
                    throw new IllegalStateException("Cannot shutdown with running requests.");
                }
                if (Thread.currentThread() == this.d) {
                    throw new IllegalThreadStateException("Cannot shutdown from network thread.");
                }
            }
            this.i.block();
            stopNetLog();
            synchronized (this.b) {
                if (k()) {
                    N.MeBvNXm5(this.c, this);
                    this.c = 0L;
                }
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

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
        Throwable th;
        synchronized (this.b) {
            try {
                try {
                    h();
                    if (!this.x) {
                        N.MTULt02u(this.c, this, str, z, i);
                        this.x = true;
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        synchronized (this.b) {
            h();
            if (this.x) {
                return;
            }
            if (!N.MgwJQAH1(this.c, this, str, z)) {
                throw new RuntimeException("Unable to start NetLog");
            }
            this.x = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
        synchronized (this.b) {
            h();
            if (this.x && !this.y) {
                N.MKFm_qQ7(this.c, this);
                this.y = true;
                this.v.block();
                this.v.close();
                synchronized (this.b) {
                    this.y = false;
                    this.x = false;
                }
            }
        }
    }

    public final void stopNetLogCompleted() {
        this.v.open();
    }

    @Override // defpackage.fihm, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new fiha(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new fimi(url, this);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }
}
