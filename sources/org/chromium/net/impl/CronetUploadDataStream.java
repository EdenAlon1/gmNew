package org.chromium.net.impl;

import android.os.Trace;
import android.util.Log;
import defpackage.a;
import defpackage.fiev;
import defpackage.fiii;
import defpackage.fiij;
import defpackage.fiik;
import defpackage.filt;
import internal.J.N;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetUploadDataStream extends UploadDataSink {
    public static final String a = "CronetUploadDataStream";
    public final filt b;
    public final CronetUrlRequest c;
    public long d;
    public long e;
    public ByteBuffer g;
    public long i;
    private final Executor k;
    private long l;
    private boolean n;
    public final AtomicInteger f = new AtomicInteger();
    private final Runnable m = new fiii(this);
    public final Object h = new Object();
    public int j = 3;

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.k = executor;
        this.b = new filt(uploadDataProvider);
        this.c = cronetUrlRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        int i2 = this.j;
        if (i2 != i) {
            throw new IllegalStateException(a.r(i2, i, "Expected ", ", but was "));
        }
    }

    private final void f() {
        synchronized (this.h) {
            if (this.j == 0) {
                this.n = true;
                return;
            }
            long j = this.i;
            if (j == 0) {
                return;
            }
            N.MMW1G0N1(j);
            this.i = 0L;
            c(new fiik(this), "destroyAdapter");
        }
    }

    private final void g() {
        synchronized (this.h) {
            if (this.j == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.n) {
                f();
            }
        }
    }

    public final void a() {
        this.c.a();
    }

    public final void b(Throwable th) {
        int i;
        synchronized (this.h) {
            i = this.j;
            if (i == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th);
            }
            this.j = 3;
            this.g = null;
            g();
        }
        if (i == 2) {
            try {
                this.b.close();
            } catch (Exception e) {
                Log.e("cn_".concat(String.valueOf(a)), "Failure closing data provider", e);
            }
        }
        this.c.f(th);
    }

    final void c(final Runnable runnable, final String str) {
        new fiev("CronetUploadDataStream#postTaskToExecutor ".concat(str));
        try {
            this.k.execute(new Runnable() { // from class: fiih
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = CronetUploadDataStream.a;
                    new fiev("CronetUploadDataStream#postTaskToExecutor " + str + " running callback");
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
        } catch (Throwable th) {
            try {
                this.c.f(th);
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        Trace.endSection();
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        new fiev("CronetUploadDataStream#onReadError");
        try {
            synchronized (this.h) {
                e(0);
                b(exc);
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

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        new fiev("CronetUploadDataStream#onReadSucceeded");
        try {
            synchronized (this.h) {
                e(0);
                if (this.l != this.g.limit()) {
                    throw new IllegalStateException("ByteBuffer limit changed");
                }
                if (z && this.d >= 0) {
                    throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                }
                int position = this.g.position();
                if (position == 0) {
                    if (z) {
                        position = 0;
                    } else {
                        b(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                    }
                }
                long j = this.e - position;
                this.e = j;
                if (j < 0) {
                    long j2 = this.d;
                    if (j2 >= 0) {
                        throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(j2 - j), Long.valueOf(this.d)));
                    }
                }
                this.g = null;
                this.j = 3;
                g();
                long j3 = this.i;
                if (j3 != 0) {
                    N.MpWH3VIr(j3, this, position, z);
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

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        new fiev("CronetUploadDataStream#onRewindError");
        try {
            synchronized (this.h) {
                e(1);
                b(exc);
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

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        new fiev("CronetUploadDataStream#onRewindSucceeded");
        try {
            synchronized (this.h) {
                e(1);
                this.j = 3;
                this.e = this.d;
                long j = this.i;
                if (j != 0) {
                    N.MFpRjSMv(j, this);
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

    final void onUploadDataStreamDestroyed() {
        f();
    }

    final void readData(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        this.l = byteBuffer.limit();
        c(this.m, "readData");
    }

    final void rewind() {
        c(new fiij(this), "rewind");
    }
}
