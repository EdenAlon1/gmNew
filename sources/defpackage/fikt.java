package defpackage;

import android.os.Process;
import android.os.Trace;
import android.util.Log;
import j$.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fikt {
    final filu a;
    final Executor b;
    final Executor c;
    final /* synthetic */ fikx d;

    public fikt(fikx fikxVar, UrlRequest.Callback callback, Executor executor) {
        this.d = fikxVar;
        this.a = new filu(callback);
        if (fikxVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new fila(executor);
            this.c = executor;
        }
    }

    final void a(final fiky fikyVar, String str) {
        try {
            final fikx fikxVar = this.d;
            b(new Runnable() { // from class: fikb
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        fikyVar.a();
                    } catch (Throwable th) {
                        final fikx fikxVar2 = fikx.this;
                        fikxVar2.d(new Runnable() { // from class: fikd
                            @Override // java.lang.Runnable
                            public final void run() {
                                fikx.this.x++;
                            }
                        }, "enterUserErrorState");
                        fikxVar2.b(new fihc("Exception received from UrlRequest.Callback", th));
                    }
                }
            }, str);
        } catch (RejectedExecutionException e) {
            this.d.b(new fihr("Exception posting task to executor", e));
        }
    }

    final void b(final Runnable runnable, final String str) {
        new fiev("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
        try {
            this.b.execute(new Runnable() { // from class: fikp
                @Override // java.lang.Runnable
                public final void run() {
                    new fiev("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
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

    public final void c() {
        this.d.d(new Runnable() { // from class: fikr
            @Override // java.lang.Runnable
            public final void run() {
                Map<String, List<String>> map;
                String str;
                boolean z;
                int i;
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                long j8;
                long j9;
                long j10;
                int i2;
                fikt fiktVar = fikt.this;
                try {
                    fikx fikxVar = fiktVar.d;
                    fiic fiicVar = fikxVar.u;
                    long j11 = fikxVar.t;
                    film filmVar = fikxVar.o;
                    if (filmVar != null) {
                        map = filmVar.getAllHeaders();
                        film filmVar2 = fiktVar.d.o;
                        str = filmVar2.c;
                        int i3 = filmVar2.a;
                        z = filmVar2.b;
                        i = i3;
                    } else {
                        map = Collections.EMPTY_MAP;
                        str = "";
                        z = false;
                        i = 0;
                    }
                    String str2 = str;
                    if (z) {
                        j2 = 0;
                        j = 0;
                        j3 = 0;
                    } else {
                        j = 0;
                        for (Map.Entry entry : fiktVar.d.e.entrySet()) {
                            if (((String) entry.getKey()) != null) {
                                j += r17.length();
                            }
                            if (((String) entry.getValue()) != null) {
                                j += r9.length();
                            }
                        }
                        j2 = 0;
                        j3 = -1;
                    }
                    if (z) {
                        j9 = j2;
                        j5 = j9;
                        j7 = j;
                        j8 = j5;
                    } else {
                        if (map == null) {
                            j4 = j2;
                            j5 = j4;
                        } else {
                            j4 = j2;
                            for (Map.Entry<String, List<String>> entry2 : map.entrySet()) {
                                if (entry2.getKey() != null) {
                                    j6 = j2;
                                    j4 += r22.length();
                                } else {
                                    j6 = j2;
                                }
                                if (entry2.getValue() != null) {
                                    Iterator<String> it = entry2.getValue().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != null) {
                                            j4 += r10.length();
                                        }
                                    }
                                }
                                j2 = j6;
                            }
                            j5 = j2;
                        }
                        if (map.containsKey("Content-Length")) {
                            try {
                                j10 = Long.parseLong(map.get("Content-Length").get(0));
                            } catch (NumberFormatException unused) {
                                j10 = j5;
                            }
                            long j12 = j4;
                            j9 = j10;
                            j7 = j;
                            j8 = j12;
                        } else {
                            j7 = j;
                            j8 = j4;
                            j9 = -1;
                        }
                    }
                    Duration ofSeconds = Duration.ofSeconds(j5);
                    Duration ofSeconds2 = Duration.ofSeconds(j5);
                    int i4 = fiktVar.d.g.get();
                    if (i4 == 6) {
                        i2 = 2;
                    } else if (i4 == 7) {
                        i2 = 1;
                    } else {
                        if (i4 != 8) {
                            throw new IllegalStateException(a.f(i4, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                        i2 = 3;
                    }
                    int i5 = i2;
                    fikx fikxVar2 = fiktVar.d;
                    int i6 = fikxVar2.x;
                    int i7 = fikxVar2.w;
                    fiku fikuVar = fikxVar2.r;
                    fiicVar.e(j11, new fiia(j7, j3, j8, j9, i, ofSeconds, ofSeconds2, str2, false, false, i5, i6, i7, fikuVar != null ? fikuVar.g : 0, false, fikxVar2.y, Process.myUid(), 0, 0, 0, 1, false));
                } catch (RuntimeException e) {
                    Log.i(fikx.a, "Error while trying to log CronetTrafficInfo: ", e);
                }
            }
        }, "maybeReportMetrics");
    }

    final void d() {
        a(new fiky() { // from class: fikn
            @Override // defpackage.fiky
            public final void a() {
                fikt fiktVar = fikt.this;
                if (fiktVar.d.g.compareAndSet(1, 4)) {
                    filu filuVar = fiktVar.a;
                    fikx fikxVar = fiktVar.d;
                    filuVar.onResponseStarted(fikxVar, fikxVar.o);
                }
            }
        }, "onResponseStarted");
    }
}
