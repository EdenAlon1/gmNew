package org.chromium.base;

import defpackage.fidz;
import defpackage.fiea;
import defpackage.fieq;
import defpackage.fies;
import internal.J.N;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class TraceEvent implements AutoCloseable {
    public static volatile boolean a;
    public static volatile boolean b;
    public static boolean c;
    private final String d;

    private TraceEvent(String str) {
        this.d = str;
        b(str, null);
    }

    public static TraceEvent a(String str) {
        EarlyTraceEvent.a();
        if (a) {
            return new TraceEvent(str);
        }
        return null;
    }

    public static void b(String str, String str2) {
        EarlyTraceEvent.a();
        if (a) {
            N.M9XfPu17(str, str2);
        }
    }

    public static void c(long j) {
        EarlyTraceEvent.a();
        if (a) {
            N.Mw73xTww(null, j);
        }
    }

    public static void d() {
        c(0L);
    }

    public static void dumpViewHierarchy(long j, Object obj) {
        ApplicationStatus.b();
    }

    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.b) {
                EarlyTraceEvent.a();
            }
        }
        if (a != z) {
            a = z;
            ThreadUtils.b().setMessageLogging(z ? fieq.a : null);
        }
        if (a) {
            synchronized (EarlyTraceEvent.b) {
                if (!EarlyTraceEvent.c.isEmpty()) {
                    for (fiea fieaVar : EarlyTraceEvent.c) {
                        long j = fieaVar.a;
                        long j2 = fieaVar.b;
                        N.MvcVeOsg(0L, 0L);
                    }
                    EarlyTraceEvent.c.clear();
                }
                if (!EarlyTraceEvent.d.isEmpty()) {
                    for (fidz fidzVar : EarlyTraceEvent.d) {
                        long j3 = fidzVar.a;
                        long j4 = fidzVar.b;
                        int i = fidzVar.c;
                        N.MbWHcONC(0L, 0L, 0);
                    }
                    EarlyTraceEvent.d.clear();
                }
            }
        }
        if (b) {
            fies.a();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z) {
        c = z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d();
    }
}
