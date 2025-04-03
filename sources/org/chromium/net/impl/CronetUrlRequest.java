package org.chromium.net.impl;

import android.os.Process;
import android.os.Trace;
import android.util.Log;
import defpackage.a;
import defpackage.fhpi;
import defpackage.fiev;
import defpackage.fihc;
import defpackage.fihr;
import defpackage.fiia;
import defpackage.fiic;
import defpackage.fiif;
import defpackage.fiig;
import defpackage.fiin;
import defpackage.fiio;
import defpackage.fiip;
import defpackage.fiiq;
import defpackage.fiir;
import defpackage.fiis;
import defpackage.fiit;
import defpackage.fiiu;
import defpackage.fiiv;
import defpackage.file;
import defpackage.filg;
import defpackage.filh;
import defpackage.fili;
import defpackage.filj;
import defpackage.film;
import defpackage.fils;
import defpackage.filu;
import internal.J.N;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetUrlRequest extends ExperimentalUrlRequest {
    private final byte[] A;
    private final ByteBuffer B;
    private final String C;
    private final long D;
    private final fiic E;
    private int F;
    private fiif G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private boolean L;
    private fiiv M;
    public long a;
    public boolean b;
    public final Object c = new Object();
    public final CronetUrlRequestContext d;
    public final filu e;
    public final CronetUploadDataStream f;
    public film g;
    public CronetException h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private final Executor l;
    private final List m;
    private final String n;
    private final int o;
    private final int p;
    private final String q;
    private final List r;
    private final Collection s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final int w;
    private final boolean x;
    private final int y;
    private final fils z;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r20 != 2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CronetUrlRequest(org.chromium.net.impl.CronetUrlRequestContext r6, java.lang.String r7, int r8, org.chromium.net.UrlRequest.Callback r9, java.util.concurrent.Executor r10, java.util.Collection r11, boolean r12, boolean r13, boolean r14, boolean r15, int r16, boolean r17, int r18, org.chromium.net.RequestFinishedInfo.Listener r19, int r20, long r21, java.lang.String r23, java.util.ArrayList r24, org.chromium.net.UploadDataProvider r25, java.util.concurrent.Executor r26, byte[] r27, java.nio.ByteBuffer r28, java.lang.String r29) {
        /*
            r5 = this;
            r0 = r19
            r1 = r20
            r2 = r25
            r5.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r5.c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.m = r3
            r29.getClass()
            r5.i = r14
            r5.d = r6
            fiic r6 = r6.f
            r5.E = r6
            r5.n = r7
            r3.add(r7)
            r6 = 2
            r7 = 1
            if (r8 == 0) goto L3c
            if (r8 == r7) goto L3a
            r3 = 3
            if (r8 == r6) goto L3d
            r4 = 4
            if (r8 == r3) goto L38
            if (r8 == r4) goto L36
            goto L38
        L36:
            r3 = 5
            goto L3d
        L38:
            r3 = r4
            goto L3d
        L3a:
            r3 = r6
            goto L3d
        L3c:
            r3 = r7
        L3d:
            r5.o = r3
            filu r8 = new filu
            r8.<init>(r9)
            r5.e = r8
            r5.l = r10
            r5.s = r11
            r5.t = r12
            r5.u = r13
            r5.v = r15
            r8 = r16
            r5.w = r8
            r8 = r17
            r5.x = r8
            r8 = r18
            r5.y = r8
            r8 = 0
            if (r0 == 0) goto L65
            fils r9 = new fils
            r9.<init>(r0)
            goto L66
        L65:
            r9 = r8
        L66:
            r5.z = r9
            r9 = r27
            r5.A = r9
            r9 = r28
            r5.B = r9
            r9 = r29
            r5.C = r9
            r9 = 0
            if (r1 == 0) goto L7e
            if (r1 == r7) goto L7c
            if (r1 == r6) goto L7f
            goto L7e
        L7c:
            r6 = r7
            goto L7f
        L7e:
            r6 = r9
        L7f:
            r5.p = r6
            r6 = r21
            r5.D = r6
            r6 = r23
            r5.q = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = r24
            r6.<init>(r7)
            java.util.List r6 = j$.util.DesugarCollections.unmodifiableList(r6)
            r5.r = r6
            if (r2 != 0) goto L99
            goto La0
        L99:
            org.chromium.net.impl.CronetUploadDataStream r8 = new org.chromium.net.impl.CronetUploadDataStream
            r6 = r26
            r8.<init>(r2, r6, r5)
        La0:
            r5.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.<init>(org.chromium.net.impl.CronetUrlRequestContext, java.lang.String, int, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor, java.util.Collection, boolean, boolean, boolean, boolean, int, boolean, int, org.chromium.net.RequestFinishedInfo$Listener, int, long, java.lang.String, java.util.ArrayList, org.chromium.net.UploadDataProvider, java.util.concurrent.Executor, byte[], java.nio.ByteBuffer, java.lang.String):void");
    }

    private final film j(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new film(new ArrayList(this.m), i, str, arrayList, z, str2, str3, j);
    }

    private final void k(CronetException cronetException) {
        synchronized (this.c) {
            if (h()) {
                return;
            }
            this.h = cronetException;
            b(1);
        }
    }

    private final void l(final Runnable runnable, final String str) {
        new fiev("CronetUrlRequest#postTaskToExecutor ".concat(str));
        try {
            try {
                this.l.execute(new Runnable() { // from class: fiil
                    @Override // java.lang.Runnable
                    public final void run() {
                        new fiev("CronetUrlRequest#postTaskToExecutor " + str + " running callback");
                        try {
                            runnable.run();
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
                });
            } catch (RejectedExecutionException e) {
                Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception posting task to executor", e);
                k(new fihr("Exception posting task to executor", e));
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

    private final void onCanceled() {
        l(new fiis(this), "onCanceled");
    }

    private final void onError(int i, int i2, int i3, int i4, String str, long j) {
        film filmVar = this.g;
        if (filmVar != null) {
            filmVar.a(j);
        }
        if (i == 10 || i3 != 0) {
            k(new filh("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2, i3, i4));
            return;
        }
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            default:
                Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), a.h(i, "Unknown error code: "));
                break;
        }
        k(new file("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2));
    }

    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        if (this.G != null) {
            throw new IllegalStateException("Metrics collection should only happen once.");
        }
        this.G = new fiif(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
        this.H = z2;
        this.I = z3;
    }

    private final void onNativeAdapterDestroyed() {
        new fiev("CronetUrlRequest#onNativeAdapterDestroyed");
        try {
            synchronized (this.c) {
                if (this.h == null) {
                    Trace.endSection();
                    return;
                }
                fiiu fiiuVar = new fiiu(this);
                new fiev("CronetUrlRequest#onNativeAdapterDestroyed scheduling callback");
                try {
                    try {
                        this.l.execute(fiiuVar);
                    } catch (RejectedExecutionException e) {
                        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception posting task to executor", e);
                    }
                    Trace.endSection();
                    Trace.endSection();
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.g.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            k(new fihr("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.M == null) {
            this.M = new fiiv(this);
        }
        fiiv fiivVar = this.M;
        fiivVar.a = byteBuffer;
        l(fiivVar, "onReadCompleted");
    }

    private final void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        List list = this.m;
        film j2 = j(i, str2, strArr, z, str3, str4, j);
        list.add(str);
        l(new fiip(this, j2, str), "onRedirectReceived");
    }

    private final void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.g = j(i, str, strArr, z, str2, str3, j);
        l(new fiiq(this), "onResponseStarted");
    }

    private final void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        l(new fiit(versionSafeCallbacks$UrlRequestStatusListener, i), "onStatus");
    }

    private final void onSucceeded(long j) {
        this.g.a(j);
        l(new fiir(this), "onSucceeded");
    }

    public final void a() {
        if (this.i) {
            return;
        }
        if (Thread.currentThread() == this.d.d) {
            throw new InlineExecutionProhibitedException();
        }
    }

    public final void b(int i) {
        this.F = i;
        if (this.a == 0) {
            return;
        }
        this.d.d();
        N.M4znfYdB(this.a, this, i == 2);
        this.a = 0L;
    }

    public final void c() {
        Map<String, List<String>> map;
        String str;
        boolean z;
        int i;
        long j;
        long max;
        long max2;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        long j3;
        long j4;
        fili filiVar = new fili(new Runnable() { // from class: fiim
            @Override // java.lang.Runnable
            public final void run() {
                CronetUrlRequest.this.d.e();
            }
        });
        try {
            if (this.G != null) {
                try {
                    fiic fiicVar = this.E;
                    long j5 = this.d.e;
                    film filmVar = this.g;
                    if (filmVar != null) {
                        map = filmVar.getAllHeaders();
                        film filmVar2 = this.g;
                        str = filmVar2.c;
                        int i6 = filmVar2.a;
                        z = filmVar2.b;
                        i = i6;
                    } else {
                        map = Collections.EMPTY_MAP;
                        str = "";
                        z = false;
                        i = 0;
                    }
                    String str2 = str;
                    long longValue = this.G.b.longValue();
                    long j6 = 0;
                    if (z && longValue == 0) {
                        max = 0;
                        j = 0;
                    } else {
                        List<Map.Entry> list = this.r;
                        if (list == null) {
                            j = 0;
                        } else {
                            j = 0;
                            for (Map.Entry entry : list) {
                                if (((String) entry.getKey()) != null) {
                                    j += r16.length();
                                }
                                if (((String) entry.getValue()) != null) {
                                    j += ((String) entry.getValue()).length();
                                }
                            }
                        }
                        j6 = 0;
                        max = Math.max(0L, longValue - j);
                    }
                    long longValue2 = this.G.c.longValue();
                    if (z && longValue2 == j6) {
                        max2 = j6;
                    } else {
                        long a = fiig.a(map);
                        max2 = Math.max(j6, longValue2 - a);
                        j6 = a;
                    }
                    Duration ofSeconds = (this.G.getRequestStart() == null || this.G.getResponseStart() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.G.getResponseStart().getTime() - this.G.getRequestStart().getTime());
                    Duration ofSeconds2 = (this.G.getRequestStart() == null || this.G.getRequestEnd() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.G.getRequestEnd().getTime() - this.G.getRequestStart().getTime());
                    CronetException cronetException = this.h;
                    if (cronetException instanceof file) {
                        j2 = max;
                        j3 = j;
                        j4 = j6;
                        i3 = ((file) cronetException).b;
                        i4 = 0;
                        i5 = 0;
                        i2 = 2;
                    } else {
                        if (cronetException instanceof filh) {
                            filh filhVar = (filh) cronetException;
                            int cronetInternalErrorCode = filhVar.getCronetInternalErrorCode();
                            int i7 = filhVar.a;
                            i5 = filhVar.b;
                            i3 = cronetInternalErrorCode;
                            i4 = i7;
                            i2 = 2;
                        } else {
                            i2 = cronetException != null ? 3 : 1;
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                        }
                        j2 = max;
                        j3 = j;
                        j4 = j6;
                    }
                    boolean z2 = this.H;
                    boolean z3 = this.I;
                    Duration duration = ofSeconds;
                    int b = fiig.b(this.F);
                    int i8 = this.K;
                    int i9 = this.J;
                    CronetUploadDataStream cronetUploadDataStream = this.f;
                    fiicVar.e(j5, new fiia(j3, j2, j4, max2, i, duration, ofSeconds2, str2, z2, z3, b, i8, i9, cronetUploadDataStream == null ? 0 : cronetUploadDataStream.f.get(), false, this.L, Process.myUid(), i3, i4, i5, i2, this.G.a));
                } catch (RuntimeException e) {
                    Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Error while trying to log CronetTrafficInfo: ", e);
                }
                this.d.g(new filj(this.n, this.s, this.G, this.F, this.g, this.h), filiVar, this.z);
            }
        } finally {
            filiVar.a();
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        new fiev("CronetUrlRequest#cancel");
        try {
            synchronized (this.c) {
                if (!h() && this.j) {
                    b(2);
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

    public final void d(String str, Exception exc) {
        this.L = true;
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), a.a(str, "Exception in ", " method"), exc);
    }

    public final void e(Exception exc) {
        this.K++;
        fihc fihcVar = new fihc("Exception received from UrlRequest.Callback", exc);
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception in CalledByNative method", exc);
        k(fihcVar);
    }

    final void f(Throwable th) {
        fihc fihcVar = new fihc("Exception received from UploadDataProvider", th);
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception in upload method", th);
        k(fihcVar);
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        new fiev("CronetUrlRequest#followRedirect");
        try {
            synchronized (this.c) {
                if (!this.b) {
                    throw new IllegalStateException("No redirect to follow.");
                }
                this.b = false;
                if (!h()) {
                    N.Mhp54Oqs(this.a, this);
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

    public final void g() {
        N.MabZ5m6r(this.a, this);
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        synchronized (this.c) {
            long j = this.a;
            if (j != 0) {
                N.MgIIMpT9(j, this, versionSafeCallbacks$UrlRequestStatusListener);
            } else {
                l(new fiio(versionSafeCallbacks$UrlRequestStatusListener), "getStatus");
            }
        }
    }

    public final boolean h() {
        return this.j && this.a == 0;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean h;
        synchronized (this.c) {
            h = h();
        }
        return h;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        Throwable th;
        new fiev("CronetUrlRequest#read");
        try {
            filg.b(byteBuffer);
            filg.a(byteBuffer);
            try {
                synchronized (this.c) {
                    try {
                        if (!this.k) {
                            throw new IllegalStateException("Unexpected read attempt.");
                        }
                        this.k = false;
                        if (h()) {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    try {
                                        Trace.endSection();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            }
                        } else {
                            if (!N.MfCxA8r3(this.a, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                                this.k = true;
                                throw new IllegalArgumentException("Unable to call native read");
                            }
                            this.J++;
                        }
                        Trace.endSection();
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        new fiev("CronetUrlRequest#start");
        try {
            synchronized (this.c) {
                synchronized (this.c) {
                    if (this.j || h()) {
                        throw new IllegalStateException("Request is already started.");
                    }
                }
                try {
                    long c = this.d.c();
                    String str = this.n;
                    int i = this.o;
                    boolean z = this.t;
                    boolean z2 = this.u;
                    boolean z3 = this.v;
                    int i2 = this.w;
                    boolean z4 = this.x;
                    int i3 = this.y;
                    int i4 = this.p;
                    byte[] bArr = this.A;
                    ByteBuffer byteBuffer = this.B;
                    boolean z5 = false;
                    int position = byteBuffer != null ? byteBuffer.position() : 0;
                    ByteBuffer byteBuffer2 = this.B;
                    this.a = N.MuOIsMvf(this, c, str, i, z, z2, z3, i2, z4, i3, i4, bArr, byteBuffer, position, byteBuffer2 != null ? byteBuffer2.limit() : 0, this.C, this.D);
                    this.d.f();
                    if (!N.M51RPBJe(this.a, this, this.q)) {
                        throw new IllegalArgumentException("Invalid http method " + this.q);
                    }
                    for (Map.Entry entry : this.r) {
                        if (((String) entry.getKey()).equalsIgnoreCase(fhpi.a) && !((String) entry.getValue()).isEmpty()) {
                            z5 = true;
                        }
                        if (!N.MvHusd1J(this.a, this, (String) entry.getKey(), (String) entry.getValue())) {
                            throw new IllegalArgumentException("Invalid header with headername: " + ((String) entry.getKey()));
                        }
                    }
                    CronetUploadDataStream cronetUploadDataStream = this.f;
                    if (cronetUploadDataStream == null) {
                        this.j = true;
                        g();
                    } else {
                        if (!z5) {
                            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                        }
                        this.j = true;
                        cronetUploadDataStream.c(new fiin(this), "CronetUrlRequest#start");
                    }
                    Trace.endSection();
                } catch (RuntimeException e) {
                    b(1);
                    this.d.e();
                    throw e;
                }
            }
        } finally {
        }
    }
}
