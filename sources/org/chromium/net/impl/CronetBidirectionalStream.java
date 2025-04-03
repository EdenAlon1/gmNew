package org.chromium.net.impl;

import android.os.Process;
import android.os.Trace;
import android.util.Log;
import defpackage.a;
import defpackage.fiev;
import defpackage.fihb;
import defpackage.fihc;
import defpackage.fihf;
import defpackage.fihg;
import defpackage.fihh;
import defpackage.fihi;
import defpackage.fihj;
import defpackage.fihk;
import defpackage.fihr;
import defpackage.fiic;
import defpackage.fiif;
import defpackage.filg;
import defpackage.filh;
import defpackage.fili;
import defpackage.filj;
import defpackage.fill;
import defpackage.film;
import defpackage.filo;
import internal.J.N;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    private final boolean A;
    private final int B;
    private final long C;
    private LinkedList D;
    private LinkedList E;
    private boolean F;
    private long G;
    private fihk H;
    public final CronetUrlRequestContext a;
    public final filo b;
    public final String c;
    public final String[] d;
    public final fiic e;
    public fili f;
    public CronetException g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean m;
    public fiif n;
    public boolean o;
    public boolean p;
    public film s;
    private final Executor t;
    private final String u;
    private final int v;
    private final boolean w;
    private final Collection x;
    private final boolean y;
    private final int z;
    public final Object l = new Object();
    public int q = 0;
    public int r = 0;

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List list, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        int i4 = 0;
        this.a = cronetUrlRequestContext;
        this.u = str;
        int i5 = 1;
        if (i != 0) {
            if (i != 1) {
                i5 = 3;
                if (i != 2) {
                    if (i == 3) {
                        i5 = 4;
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Invalid stream priority.");
                        }
                        i5 = 5;
                    }
                }
            } else {
                i5 = 2;
            }
        }
        this.v = i5;
        this.b = new filo(callback);
        this.t = executor;
        this.c = str2;
        int size = list.size();
        String[] strArr = new String[size + size];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i6 = i4 + 1;
            strArr[i4] = (String) entry.getKey();
            i4 += 2;
            strArr[i6] = (String) entry.getValue();
        }
        this.d = strArr;
        this.w = z;
        this.D = new LinkedList();
        this.E = new LinkedList();
        this.x = collection;
        this.y = z2;
        this.z = i2;
        this.A = z3;
        this.B = i3;
        this.C = j;
        this.e = cronetUrlRequestContext.f;
    }

    public static boolean f(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private static ArrayList h(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length >> 1);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private final void i(boolean z) {
        new fiev("CronetBidirectionalStream#destroyNativeStreamLocked");
        try {
            String str = CronetUrlRequestContext.a;
            Log.i("cn_".concat(String.valueOf(str)), a.G(this, "destroyNativeStreamLocked "));
            long j = this.G;
            if (j != 0) {
                N.MS2l1kNx(j, this, z);
                if (this.q != 0) {
                    this.a.d();
                }
                this.G = 0L;
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

    private final void j(CronetException cronetException) {
        k(new fihj(this, cronetException), "failWithException");
    }

    private final void k(final Runnable runnable, final String str) {
        new fiev("CronetBidirectionalStream#postTaskToExecutor ".concat(str));
        try {
            try {
                this.t.execute(new Runnable() { // from class: fihd
                    @Override // java.lang.Runnable
                    public final void run() {
                        new fiev("CronetBidirectionalStream#postTaskToExecutor " + str + " running callback");
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
                synchronized (this.l) {
                    this.r = 6;
                    this.q = 6;
                    i(false);
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

    private final void l() {
        boolean z;
        CronetBidirectionalStream cronetBidirectionalStream;
        int size = this.E.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.E.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.r = 9;
        this.m = true;
        long j = this.G;
        if (this.F && this.D.isEmpty()) {
            cronetBidirectionalStream = this;
            z = true;
        } else {
            z = false;
            cronetBidirectionalStream = this;
        }
        if (N.MwJCBTMQ(j, cronetBidirectionalStream, byteBufferArr, iArr, iArr2, z)) {
            return;
        }
        cronetBidirectionalStream.r = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    private final void onCanceled() {
        k(new fihi(this), "onCanceled");
    }

    private final void onError(int i, int i2, int i3, int i4, String str, long j) {
        film filmVar = this.s;
        if (filmVar != null) {
            filmVar.a(j);
        }
        if (i == 10 || i3 != 0) {
            j(new filh("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2, i3, i4));
        } else {
            j(new fihb("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2));
        }
    }

    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        try {
            if (this.n != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            this.n = new fiif(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
            this.o = z2;
            this.p = z3;
            this.a.g(new filj(this.u, this.x, this.n, a(), this.s, this.g), this.f, null);
        } finally {
            this.f.a();
        }
    }

    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.s.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            j(new fihr("ByteBuffer modified externally during read", null));
            return;
        }
        if (i < 0 || (i4 = i2 + i) > i3) {
            j(new fihr("Invalid number of bytes read", null));
            return;
        }
        fihk fihkVar = this.H;
        fihkVar.a = byteBuffer;
        fihkVar.b = i == 0;
        k(fihkVar, "onReadCompleted");
    }

    private final void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.s = new film(Arrays.asList(this.u), i, "", h(strArr), false, str, null, j);
            k(new fihg(this), "onResponseHeadersReceived");
        } catch (Exception unused) {
            j(new fihr("Cannot prepare ResponseInfo", null));
        }
    }

    private final void onResponseTrailersReceived(String[] strArr) {
        k(new fihh(this, new fill(h(strArr))), "onResponseTrailersReceived");
    }

    private final void onStreamReady(boolean z) {
        k(new fihf(this, z), "onStreamReady");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        j(new defpackage.fihr("ByteBuffer modified externally during write", null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            monitor-enter(r0)
            boolean r1 = r6.g()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return
        Lb:
            r1 = 8
            r6.r = r1     // Catch: java.lang.Throwable -> L5f
            java.util.LinkedList r1 = r6.E     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L1a
            r6.l()     // Catch: java.lang.Throwable -> L5f
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            r0 = 0
            r1 = r0
        L1d:
            int r2 = r7.length
            if (r1 >= r2) goto L5e
            r3 = r7[r1]
            int r4 = r3.position()
            r5 = r8[r1]
            if (r4 != r5) goto L53
            int r4 = r3.limit()
            r5 = r9[r1]
            if (r4 == r5) goto L33
            goto L53
        L33:
            int r4 = r3.limit()
            java.nio.Buffer r4 = r3.position(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            fihl r4 = new fihl
            if (r10 == 0) goto L47
            int r2 = r2 + (-1)
            if (r1 != r2) goto L47
            r2 = 1
            goto L48
        L47:
            r2 = r0
        L48:
            r4.<init>(r6, r3, r2)
            java.lang.String r2 = "onWritevCompleted"
            r6.k(r4, r2)
            int r1 = r1 + 1
            goto L1d
        L53:
            fihr r7 = new fihr
            java.lang.String r8 = "ByteBuffer modified externally during write"
            r9 = 0
            r7.<init>(r8, r9)
            r6.j(r7)
        L5e:
            return
        L5f:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    public final int a() {
        int i = this.q;
        int i2 = this.r;
        if (i != i2) {
            throw new IllegalStateException(a.x(i2, i, "Cronet bidirectional stream read state is ", " which is different from write state ", "!"));
        }
        if (i == 5) {
            return 2;
        }
        if (i == 6) {
            return 1;
        }
        if (i == 7) {
            return 0;
        }
        throw new IllegalStateException(a.f(i, "Cronet bidirectional stream read state is ", " which is not a valid finished state!"));
    }

    public final void b(CronetException cronetException) {
        this.g = cronetException;
        synchronized (this.l) {
            if (g()) {
                return;
            }
            this.r = 6;
            this.q = 6;
            i(false);
            try {
                this.b.onFailed(this, this.s, cronetException);
            } catch (Exception e) {
                d("onFailed", e);
            }
            this.f.a();
        }
    }

    public final void c() {
        new fiev("CronetBidirectionalStream#maybeOnSucceededOnExecutor");
        try {
            synchronized (this.l) {
                if (!g()) {
                    if (this.r == 10 && this.q == 4) {
                        this.r = 7;
                        this.q = 7;
                        i(false);
                        try {
                            this.b.onSucceeded(this, this.s);
                        } catch (Exception e) {
                            d("onSucceeded", e);
                        }
                        this.f.a();
                    }
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

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        new fiev("CronetBidirectionalStream#cancel");
        try {
            synchronized (this.l) {
                if (!g() && this.q != 0) {
                    this.r = 5;
                    this.q = 5;
                    i(true);
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
        this.k = true;
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), a.a(str, "Exception in ", " method"), exc);
    }

    public final void e(Exception exc) {
        this.h++;
        fihc fihcVar = new fihc("CalledByNative method has thrown an exception", exc);
        Log.e("cn_".concat(String.valueOf(CronetUrlRequestContext.a)), "Exception in CalledByNative method", exc);
        b(fihcVar);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        int i;
        new fiev("CronetBidirectionalStream#flush");
        try {
            synchronized (this.l) {
                if (!g() && ((i = this.r) == 8 || i == 9)) {
                    if (!this.D.isEmpty() || !this.E.isEmpty()) {
                        if (!this.D.isEmpty()) {
                            this.E.addAll(this.D);
                            this.D.clear();
                        }
                        if (this.r != 9) {
                            l();
                            this.j++;
                        }
                    } else if (!this.m) {
                        this.m = true;
                        N.MGLIR7Sc(this.G, this);
                        if (!f(this.c)) {
                            this.r = 10;
                        }
                    }
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

    public final boolean g() {
        return this.q != 0 && this.G == 0;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean g;
        synchronized (this.l) {
            g = g();
        }
        return g;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        Throwable th;
        new fiev("CronetBidirectionalStream#read");
        try {
            try {
                synchronized (this.l) {
                    try {
                        filg.b(byteBuffer);
                        filg.a(byteBuffer);
                        if (this.q != 2) {
                            throw new IllegalStateException("Unexpected read attempt.");
                        }
                        try {
                            if (!g()) {
                                if (this.H == null) {
                                    this.H = new fihk(this);
                                }
                                this.q = 3;
                                if (!N.Md_rPmgC(this.G, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                                    this.q = 2;
                                    throw new IllegalArgumentException("Unable to call native read");
                                }
                                this.i++;
                            }
                            Trace.endSection();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                throw th;
            } catch (Throwable th5) {
                th = th5;
                Throwable th6 = th;
                try {
                    Trace.endSection();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        long MqTDYvZd;
        final CronetBidirectionalStream cronetBidirectionalStream = this;
        new fiev("CronetBidirectionalStream#start");
        try {
            synchronized (cronetBidirectionalStream.l) {
                try {
                    if (cronetBidirectionalStream.q != 0) {
                        throw new IllegalStateException("Stream is already started.");
                    }
                    try {
                        MqTDYvZd = N.MqTDYvZd(cronetBidirectionalStream, cronetBidirectionalStream.a.c(), !cronetBidirectionalStream.w, cronetBidirectionalStream.y, cronetBidirectionalStream.z, cronetBidirectionalStream.A, cronetBidirectionalStream.B, cronetBidirectionalStream.C);
                        cronetBidirectionalStream.G = MqTDYvZd;
                    } catch (RuntimeException e) {
                        e = e;
                    }
                    try {
                        int McDUim_I = N.McDUim_I(MqTDYvZd, cronetBidirectionalStream, cronetBidirectionalStream.u, cronetBidirectionalStream.v, cronetBidirectionalStream.c, cronetBidirectionalStream.d, !f(r5));
                        if (McDUim_I == -1) {
                            throw new IllegalArgumentException("Invalid http method " + cronetBidirectionalStream.c);
                        }
                        if (McDUim_I > 0) {
                            throw new IllegalArgumentException("Invalid header with headername: " + cronetBidirectionalStream.d[McDUim_I - 1]);
                        }
                        cronetBidirectionalStream.a.f();
                        fili filiVar = new fili(new Runnable() { // from class: fihe
                            @Override // java.lang.Runnable
                            public final void run() {
                                Map<String, List<String>> map;
                                String str;
                                boolean z;
                                int i;
                                long j;
                                boolean z2;
                                long j2;
                                long a;
                                int i2;
                                int i3;
                                int i4;
                                int i5;
                                CronetBidirectionalStream cronetBidirectionalStream2 = CronetBidirectionalStream.this;
                                int a2 = cronetBidirectionalStream2.a();
                                boolean z3 = cronetBidirectionalStream2.o;
                                boolean z4 = cronetBidirectionalStream2.p;
                                film filmVar = cronetBidirectionalStream2.s;
                                if (filmVar != null) {
                                    map = filmVar.getAllHeaders();
                                    film filmVar2 = cronetBidirectionalStream2.s;
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
                                long longValue = cronetBidirectionalStream2.n.b.longValue();
                                long j3 = 0;
                                if (z && longValue == 0) {
                                    z2 = z;
                                    j2 = 0;
                                    j = 0;
                                } else {
                                    j = 0;
                                    for (String str3 : cronetBidirectionalStream2.d) {
                                        if (str3 != null) {
                                            j += r6.length();
                                        }
                                    }
                                    j3 = 0;
                                    long max = Math.max(0L, longValue - j);
                                    z2 = z;
                                    j2 = max;
                                }
                                long longValue2 = cronetBidirectionalStream2.n.c.longValue();
                                if (z2 && longValue2 == j3) {
                                    a = j3;
                                } else {
                                    a = fiig.a(map);
                                    j3 = Math.max(j3, longValue2 - a);
                                }
                                Duration ofSeconds = (cronetBidirectionalStream2.n.getRequestStart() == null || cronetBidirectionalStream2.n.getResponseStart() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(cronetBidirectionalStream2.n.getResponseStart().getTime() - cronetBidirectionalStream2.n.getRequestStart().getTime());
                                Duration ofSeconds2 = (cronetBidirectionalStream2.n.getRequestStart() == null || cronetBidirectionalStream2.n.getRequestEnd() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(cronetBidirectionalStream2.n.getRequestEnd().getTime() - cronetBidirectionalStream2.n.getRequestStart().getTime());
                                CronetException cronetException = cronetBidirectionalStream2.g;
                                if (cronetException instanceof file) {
                                    i3 = ((file) cronetException).b;
                                    i2 = 2;
                                } else {
                                    if (cronetException instanceof filh) {
                                        filh filhVar = (filh) cronetException;
                                        int cronetInternalErrorCode = filhVar.getCronetInternalErrorCode();
                                        i4 = filhVar.a;
                                        i5 = filhVar.b;
                                        i3 = cronetInternalErrorCode;
                                        i2 = 2;
                                        cronetBidirectionalStream2.e.e(cronetBidirectionalStream2.a.e, new fiia(j, j2, a, j3, i, ofSeconds, ofSeconds2, str2, z3, z4, fiig.b(a2), cronetBidirectionalStream2.h, cronetBidirectionalStream2.i, cronetBidirectionalStream2.j, true, cronetBidirectionalStream2.k, Process.myUid(), i3, i4, i5, i2, cronetBidirectionalStream2.n.a));
                                        cronetBidirectionalStream2.a.e();
                                    }
                                    i2 = cronetException != null ? 3 : 1;
                                    i3 = 0;
                                }
                                i4 = 0;
                                i5 = 0;
                                cronetBidirectionalStream2.e.e(cronetBidirectionalStream2.a.e, new fiia(j, j2, a, j3, i, ofSeconds, ofSeconds2, str2, z3, z4, fiig.b(a2), cronetBidirectionalStream2.h, cronetBidirectionalStream2.i, cronetBidirectionalStream2.j, true, cronetBidirectionalStream2.k, Process.myUid(), i3, i4, i5, i2, cronetBidirectionalStream2.n.a));
                                cronetBidirectionalStream2.a.e();
                            }
                        });
                        cronetBidirectionalStream.f = filiVar;
                        filiVar.b();
                        cronetBidirectionalStream.r = 1;
                        cronetBidirectionalStream.q = 1;
                        Trace.endSection();
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        cronetBidirectionalStream = cronetBidirectionalStream;
                        cronetBidirectionalStream.i(false);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            throw th;
        } finally {
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        new fiev("CronetBidirectionalStream#write");
        try {
            synchronized (this.l) {
                filg.a(byteBuffer);
                if (!byteBuffer.hasRemaining() && !z) {
                    throw new IllegalArgumentException("Empty buffer before end of stream.");
                }
                if (this.F) {
                    throw new IllegalArgumentException("Write after writing end of stream.");
                }
                if (!g()) {
                    this.D.add(byteBuffer);
                    if (z) {
                        this.F = true;
                    }
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
}
