package defpackage;

import android.os.Trace;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyf {
    public static boolean a;
    static final eexi b;
    public static final WeakHashMap c;
    public static final ThreadLocal d;
    public static final Deque e;
    public static final Deque f;
    public static final Object g;
    public static final Runnable h;
    public static int i;
    public static int j;
    public static elat k;
    private static final enip l;
    private static enip m;
    private static final AtomicReference n;

    /* compiled from: PG */
    final class a {
        public static boolean a() {
            boolean isEnabled;
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }
    }

    static {
        enip u = enip.u("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        l = u;
        m = u;
        a = true;
        n = new AtomicReference(enpd.a);
        b = new eexi("tiktok_systrace");
        c = new WeakHashMap();
        new ekyi();
        d = new ekye();
        e = new ArrayDeque();
        f = new ArrayDeque();
        g = new Object();
        h = new Runnable() { // from class: ekxw
            @Override // java.lang.Runnable
            public final void run() {
                Object remove = ekyf.e.remove();
                if (remove == ekyf.g) {
                    ekyf.f.pop();
                } else {
                    ekyf.f.push((elat) remove);
                }
            }
        };
        j = 0;
    }

    static void A() {
        elat d2;
        i++;
        if (j == 0) {
            elao b2 = b();
            if (b2.c != null || (d2 = d()) == null) {
                return;
            }
            h(b2, d2);
            j = i;
        }
    }

    public static ekzm a(ekzm ekzmVar) {
        if (ekzmVar == null || (ekzmVar instanceof elat)) {
            return g((elat) ekzmVar);
        }
        throw new IllegalStateException("RootTrace object can't be casted to Trace, this might be caused by duplicate trace error");
    }

    public static elao b() {
        return (elao) d.get();
    }

    public static elat c() {
        return b().c;
    }

    static elat d() {
        return (elat) f.peek();
    }

    public static elat e() {
        elao b2 = b();
        elat elatVar = b2.c;
        return elatVar != null ? elatVar : ekyw.k(b2);
    }

    public static elat f() {
        elat elatVar = k;
        if (elatVar == null) {
            return null;
        }
        k = null;
        return elatVar;
    }

    public static elat g(elat elatVar) {
        return h(b(), elatVar);
    }

    public static elat h(elao elaoVar, elat elatVar) {
        return elaoVar.e != null ? x(elaoVar, elatVar, 2) : x(elaoVar, elatVar, 4);
    }

    public static elat i(elao elaoVar, elat elatVar) {
        elat elatVar2 = elaoVar.d;
        elaoVar.d = elatVar;
        return elatVar2;
    }

    public static elav j() {
        A();
        return new elav() { // from class: ekyb
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                ekyf.q();
            }
        };
    }

    public static elav k() {
        elao b2 = b();
        if (!b2.a) {
            return new elav() { // from class: ekyc
                @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    boolean z = ekyf.a;
                }
            };
        }
        elav elavVar = b2.c;
        if (elavVar == null) {
            elavVar = ekyw.k(b2);
        }
        e.add(elavVar);
        efbd.e(h);
        return new elav() { // from class: ekyd
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                ekyf.e.add(ekyf.g);
                efbd.e(ekyf.h);
            }
        };
    }

    static enip l() {
        return (enip) n.get();
    }

    public static Closeable m(elat elatVar) {
        elat elatVar2;
        final eleb elebVar = b().e;
        if (elebVar == null) {
            if (elatVar == ekzt.a) {
                return new Closeable() { // from class: ekxz
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        boolean z = ekyf.a;
                    }
                };
            }
            final elat g2 = g(elatVar);
            return new Closeable() { // from class: ekya
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    ekyf.g(elat.this);
                }
            };
        }
        emxf.r(!elebVar.b || elatVar == ekzt.a || (elatVar2 = elebVar.a) == null || (elatVar2 instanceof ekxr) || (elatVar2 instanceof ekza) || (elatVar2 instanceof ekzt) || (elatVar2 instanceof ekzj) || elatVar2 == elatVar, "The trace manually propagated should be the same as the one was propagated with automatic trace propagation. Existing trace: %s, new trace: %s", elebVar.a, elatVar);
        final int i2 = elebVar.c;
        if (elatVar == ekzt.a) {
            elebVar.c = 3;
            g(null);
            return new Closeable() { // from class: eldy
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eleb.this.c = i2;
                }
            };
        }
        elebVar.c = 1;
        final elat g3 = g(elatVar);
        return new Closeable() { // from class: eldz
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eleb elebVar2 = eleb.this;
                elao b2 = ekyf.b();
                if (elebVar2.c == 2) {
                    b2.d = elebVar2.a;
                }
                int i3 = i2;
                ekyf.h(b2, g3);
                elebVar2.c = i3;
            }
        };
    }

    static String n(String str) {
        return str.length() > 127 ? str.substring(0, 127) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        r15 = r1.c.d;
        r4 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ae, code lost:
    
        if (r15.containsKey(r4) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r1.c.d.put(r4, new defpackage.elai(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        if (r14 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        r14.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cb, code lost:
    
        if (r14 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cd, code lost:
    
        r14.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d1, code lost:
    
        r1.d = r7;
        r1.e += r11;
        r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        if (r1.c(r11, r12, r13, (r13 + r12) - r11) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String o(defpackage.elat r19) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekyf.o(elat):java.lang.String");
    }

    static void p(elat elatVar) {
        elao b2 = b();
        elat elatVar2 = b2.c;
        if (elatVar2 == null) {
            throw new ekyg("Tried to end [" + elatVar.c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (elatVar == elatVar2) {
            h(b2, elatVar2.a());
            return;
        }
        throw new ekyh("Tried to end span " + elatVar.c() + ", but that span is not the current span. The current span is " + elatVar2.c() + ".");
    }

    public static void q() {
        int i2 = i;
        int i3 = i2 - 1;
        i = i3;
        if (i3 < 0) {
            throw new IllegalStateException("More calls to pause than to resume");
        }
        if (j == i2) {
            emxf.m(!f.isEmpty(), "current async trace should not be null");
            g(null);
            j = 0;
        }
    }

    public static void r() {
        k = c();
        efbd.e(new Runnable() { // from class: ekxx
            @Override // java.lang.Runnable
            public final void run() {
                ekyf.k = null;
            }
        });
    }

    static void s() {
        elat d2;
        i++;
        if (j == 0) {
            elao b2 = b();
            if (b2.c != null || (d2 = d()) == null) {
                return;
            }
            h(b2, d2);
            j = i;
        }
    }

    static void t(enip enipVar) {
        enin eninVar = new enin();
        eninVar.j(enipVar);
        eninVar.j(l);
        m = eninVar.g();
    }

    static boolean u(Throwable th) {
        if (m.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            enqu listIterator = m.listIterator();
            while (listIterator.hasNext()) {
                if (stackTraceElement.toString().startsWith((String) listIterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean v() {
        elat c2 = c();
        return (c2 == null || c2 == ekzt.a) ? false : true;
    }

    public static boolean w() {
        elat d2 = d();
        if (d2 == null) {
            return false;
        }
        if ((d2 instanceof ekxr) && !((ekxr) d2).h()) {
            return false;
        }
        s();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        if (r9.q() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ab, code lost:
    
        if (r0.q() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ad, code lost:
    
        r3 = (int) android.os.SystemClock.currentThreadTimeMillis();
        r4 = r3 - r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        if (r4 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b8, code lost:
    
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        if (r0.q() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        r0.n(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c3, code lost:
    
        r8.f = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.elat x(defpackage.elao r8, defpackage.elat r9, int r10) {
        /*
            elat r0 = r8.c
            r1 = 2
            if (r0 != r9) goto Lc
            if (r10 == r1) goto L9a
            r2 = 4
            if (r10 == r2) goto L9a
            if (r0 == 0) goto L9a
        Lc:
            if (r0 != 0) goto L21
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L19
            boolean r2 = ekyf.a.a()
            goto L1f
        L19:
            eexi r2 = defpackage.ekyf.b
            boolean r2 = defpackage.eexk.b(r2)
        L1f:
            r8.b = r2
        L21:
            eleb r2 = r8.e
            boolean r3 = r8.b
            r4 = 0
            if (r3 == 0) goto L98
            if (r2 == 0) goto L67
            int r3 = r10 + (-1)
            if (r3 == 0) goto L36
            if (r3 == r1) goto L33
            r5 = r9
            r3 = r0
            goto L38
        L33:
            r3 = r0
            r5 = r4
            goto L38
        L36:
            r5 = r9
            r3 = r4
        L38:
            if (r3 == 0) goto L61
            if (r5 == 0) goto L5e
            boolean r6 = defpackage.eleb.e()
            elat r7 = r3.a()
            if (r7 != r5) goto L4c
            if (r6 != 0) goto L4c
            defpackage.eleb.b()
            goto L98
        L4c:
            elat r6 = r5.a()
            if (r3 != r6) goto L5e
            eleb r6 = r5.b()
            if (r6 == r2) goto L59
            goto L5e
        L59:
            r3 = 0
            defpackage.eleb.a(r5, r3)
            goto L98
        L5e:
            r2.d(r3)
        L61:
            if (r5 == 0) goto L98
            r2.c(r5)
            goto L98
        L67:
            if (r0 == 0) goto L92
            if (r9 == 0) goto L8d
            elat r3 = r0.a()
            if (r3 != r9) goto L7b
            boolean r3 = defpackage.elap.d(r0)
            if (r3 != 0) goto L7b
            android.os.Trace.endSection()
            goto L98
        L7b:
            elat r3 = r9.a()
            if (r0 != r3) goto L8b
            boolean r3 = defpackage.elap.d(r9)
            if (r3 != 0) goto L8b
            defpackage.elap.a(r9)
            goto L98
        L8b:
            r3 = r9
            goto L8e
        L8d:
            r3 = r4
        L8e:
            defpackage.elap.c(r0)
            goto L93
        L92:
            r3 = r9
        L93:
            if (r3 == 0) goto L98
            defpackage.elap.b(r3)
        L98:
            if (r0 != r9) goto L9b
        L9a:
            return r9
        L9b:
            if (r9 == 0) goto La4
            boolean r3 = r9.q()
            if (r3 == 0) goto La5
            goto Lad
        La4:
            r9 = r4
        La5:
            if (r0 == 0) goto Lc5
            boolean r3 = r0.q()
            if (r3 == 0) goto Lc5
        Lad:
            long r3 = android.os.SystemClock.currentThreadTimeMillis()
            int r3 = (int) r3
            int r4 = r8.f
            int r4 = r3 - r4
            if (r4 <= 0) goto Lc3
            if (r0 == 0) goto Lc3
            boolean r5 = r0.q()
            if (r5 == 0) goto Lc3
            r0.n(r4)
        Lc3:
            r8.f = r3
        Lc5:
            r8.c = r9
            if (r10 != r1) goto Lce
            r2.getClass()
            r2.a = r9
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekyf.x(elao, elat, int):elat");
    }

    static void y() {
        z(true);
    }

    static void z(boolean z) {
        if (elau.a()) {
            elat c2 = c();
            IllegalStateException illegalStateException = (c2 == null || (c2 instanceof ekzt)) ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.") : c2 instanceof ekxr ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((ekxr) c2).g()) : null;
            if (illegalStateException != null) {
                if (c2 instanceof ekxr ? ((ekxr) c2).h() : u(illegalStateException)) {
                    return;
                }
                if (!z) {
                    throw illegalStateException;
                }
                Log.e("Tracer", "Missing trace", illegalStateException);
            }
        }
    }
}
