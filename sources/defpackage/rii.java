package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rii implements rib, riw, rih {
    private static final boolean a = Log.isLoggable("GlideRequest", 2);
    private int A;
    private boolean B;
    private RuntimeException C;
    private int D;
    private final String b;
    private final rkr c;
    private final Object d;
    private final rif e;
    private final rid f;
    private final Context g;
    private final qpz h;
    private final Object i;
    private final Class j;
    private final rhx k;
    private final int l;
    private final int m;
    private final qqe n;
    private final rix o;
    private final List p;
    private final rji q;
    private final Executor r;
    private qwv s;
    private qwd t;
    private long u;
    private volatile qwe v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private int z;

    public rii(Context context, qpz qpzVar, Object obj, Object obj2, Class cls, rhx rhxVar, int i, int i2, qqe qqeVar, rix rixVar, rif rifVar, List list, rid ridVar, qwe qweVar, rji rjiVar, Executor executor) {
        this.b = a ? String.valueOf(super.hashCode()) : null;
        this.c = new rkq();
        this.d = obj;
        this.g = context;
        this.h = qpzVar;
        this.i = obj2;
        this.j = cls;
        this.k = rhxVar;
        this.l = i;
        this.m = i2;
        this.n = qqeVar;
        this.o = rixVar;
        this.e = rifVar;
        this.p = list;
        this.f = ridVar;
        this.v = qweVar;
        this.q = rjiVar;
        this.r = executor;
        this.D = 1;
        if (this.C == null && qpzVar.g.a(qpx.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable;
        }
        rhx rhxVar = this.k;
        Drawable drawable2 = rhxVar.o;
        this.y = drawable2;
        if (drawable2 != null) {
            return drawable2;
        }
        int i = rhxVar.p;
        return null;
    }

    private final Drawable o() {
        int i;
        if (this.x == null) {
            rhx rhxVar = this.k;
            Drawable drawable = rhxVar.g;
            this.x = drawable;
            if (drawable == null && (i = rhxVar.h) > 0) {
                this.x = p(i);
            }
        }
        return this.x;
    }

    private final Drawable p(int i) {
        Resources.Theme theme = this.k.t;
        if (theme == null) {
            theme = this.g.getTheme();
        }
        Context context = this.g;
        return rfd.a(context, context, i, theme);
    }

    private final void q() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final void r(String str) {
        Log.v("GlideRequest", str + " this: " + this.b);
    }

    private final void s(qwp qwpVar, int i) {
        boolean z;
        int i2;
        this.c.a();
        synchronized (this.d) {
            if (this.h.h <= i) {
                Log.w("Glide", "Load failed for [" + String.valueOf(this.i) + "] with dimensions [" + this.z + "x" + this.A + "]", qwpVar);
                List a2 = qwpVar.a();
                int size = a2.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    Log.i("Glide", a.x(size, i4, "Root cause (", " of ", ")"), (Throwable) a2.get(i3));
                    i3 = i4;
                }
            }
            this.t = null;
            this.D = 5;
            rid ridVar = this.f;
            if (ridVar != null) {
                ridVar.d(this);
            }
            boolean z2 = true;
            this.B = true;
            try {
                List list = this.p;
                if (list != null) {
                    Iterator it = list.iterator();
                    z = false;
                    while (it.hasNext()) {
                        z |= ((rif) it.next()).a(qwpVar, this.i, this.o, u());
                    }
                } else {
                    z = false;
                }
                rif rifVar = this.e;
                if (rifVar == null || !rifVar.a(qwpVar, this.i, this.o, u())) {
                    z2 = false;
                }
                if (!(z | z2) && t()) {
                    Drawable i5 = this.i == null ? i() : null;
                    if (i5 == null) {
                        if (this.w == null) {
                            rhx rhxVar = this.k;
                            Drawable drawable = rhxVar.e;
                            this.w = drawable;
                            if (drawable == null && (i2 = rhxVar.f) > 0) {
                                this.w = p(i2);
                            }
                        }
                        i5 = this.w;
                    }
                    if (i5 == null) {
                        i5 = o();
                    }
                    this.o.a(i5);
                }
            } finally {
                this.B = false;
            }
        }
    }

    private final boolean t() {
        rid ridVar = this.f;
        return ridVar == null || ridVar.h(this);
    }

    private final boolean u() {
        rid ridVar = this.f;
        return ridVar == null || !ridVar.a().j();
    }

    @Override // defpackage.rih
    public final Object a() {
        this.c.a();
        return this.d;
    }

    @Override // defpackage.rib
    public final void b() {
        synchronized (this.d) {
            q();
            this.c.a();
            int i = rka.a;
            this.u = SystemClock.elapsedRealtimeNanos();
            if (this.i == null) {
                if (rkh.p(this.l, this.m)) {
                    this.z = this.l;
                    this.A = this.m;
                }
                s(new qwp("Received null model"), i() == null ? 5 : 3);
                return;
            }
            int i2 = this.D;
            if (i2 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i2 == 4) {
                e(this.s, qsy.MEMORY_CACHE);
                return;
            }
            List<rif> list = this.p;
            if (list != null) {
                for (rif rifVar : list) {
                    if (rifVar instanceof rhz) {
                        throw null;
                    }
                }
            }
            this.D = 3;
            if (rkh.p(this.l, this.m)) {
                g(this.l, this.m);
            } else {
                this.o.e(this);
            }
            int i3 = this.D;
            if ((i3 == 2 || i3 == 3) && t()) {
                this.o.g(o());
            }
            if (a) {
                r("finished run method in " + rka.a(this.u));
            }
        }
    }

    @Override // defpackage.rib
    public final void c() {
        synchronized (this.d) {
            q();
            this.c.a();
            if (this.D == 6) {
                return;
            }
            q();
            this.c.a();
            this.o.h(this);
            qwd qwdVar = this.t;
            qwv qwvVar = null;
            if (qwdVar != null) {
                synchronized (qwdVar.c) {
                    qwdVar.a.g(qwdVar.b);
                }
                this.t = null;
            }
            qwv qwvVar2 = this.s;
            if (qwvVar2 != null) {
                this.s = null;
                qwvVar = qwvVar2;
            }
            rid ridVar = this.f;
            if (ridVar == null || ridVar.g(this)) {
                this.o.f(o());
            }
            this.D = 6;
            if (qwvVar != null) {
                ((qwn) qwvVar).f();
            }
        }
    }

    @Override // defpackage.rih
    public final void d(qwp qwpVar) {
        s(qwpVar, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x017d, code lost:
    
        ((defpackage.qwn) r14).f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0182, code lost:
    
        return;
     */
    @Override // defpackage.rih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.qwv r14, defpackage.qsy r15) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rii.e(qwv, qsy):void");
    }

    @Override // defpackage.rib
    public final void f() {
        synchronized (this.d) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0114 A[Catch: all -> 0x01ea, TryCatch #1 {, blocks: (B:26:0x0114, B:28:0x0120, B:30:0x0127, B:31:0x012c, B:32:0x01bc, B:41:0x0133, B:43:0x01b0, B:44:0x01b7, B:45:0x01be, B:48:0x00b9, B:50:0x00c1, B:52:0x00c6, B:54:0x00ca, B:57:0x00db, B:61:0x00ff, B:63:0x0109, B:65:0x010d, B:66:0x00e9, B:68:0x00ef, B:69:0x00f4), top: B:47:0x00b9, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be A[Catch: all -> 0x01ea, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {, blocks: (B:26:0x0114, B:28:0x0120, B:30:0x0127, B:31:0x012c, B:32:0x01bc, B:41:0x0133, B:43:0x01b0, B:44:0x01b7, B:45:0x01be, B:48:0x00b9, B:50:0x00c1, B:52:0x00c6, B:54:0x00ca, B:57:0x00db, B:61:0x00ff, B:63:0x0109, B:65:0x010d, B:66:0x00e9, B:68:0x00ef, B:69:0x00f4), top: B:47:0x00b9, outer: #0 }] */
    @Override // defpackage.riw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rii.g(int, int):void");
    }

    @Override // defpackage.rib
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.D == 4;
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.D == 6;
        }
        return z;
    }

    @Override // defpackage.rib
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.D == 4;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r13 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r7.equals(r14) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r8.equals(r15) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r9 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r10 != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        if ((r6 instanceof defpackage.raj ? ((defpackage.raj) r6).a() : r6.equals(r13)) == false) goto L39;
     */
    @Override // defpackage.rib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(defpackage.rib r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof defpackage.rii
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            int r4 = r1.l     // Catch: java.lang.Throwable -> L76
            int r5 = r1.m     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r1.i     // Catch: java.lang.Throwable -> L76
            java.lang.Class r7 = r1.j     // Catch: java.lang.Throwable -> L76
            rhx r8 = r1.k     // Catch: java.lang.Throwable -> L76
            qqe r9 = r1.n     // Catch: java.lang.Throwable -> L76
            java.util.List r10 = r1.p     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L22
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L76
            goto L23
        L22:
            r10 = r3
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            rii r0 = (defpackage.rii) r0
            java.lang.Object r11 = r0.d
            monitor-enter(r11)
            int r2 = r0.l     // Catch: java.lang.Throwable -> L73
            int r12 = r0.m     // Catch: java.lang.Throwable -> L73
            java.lang.Object r13 = r0.i     // Catch: java.lang.Throwable -> L73
            java.lang.Class r14 = r0.j     // Catch: java.lang.Throwable -> L73
            rhx r15 = r0.k     // Catch: java.lang.Throwable -> L73
            r16 = r3
            qqe r3 = r0.n     // Catch: java.lang.Throwable -> L73
            java.util.List r0 = r0.p     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L73
            goto L42
        L40:
            r0 = r16
        L42:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L73
            if (r4 != r2) goto L72
            if (r5 != r12) goto L72
            char[] r2 = defpackage.rkh.a
            if (r6 != 0) goto L4e
            if (r13 != 0) goto L72
            goto L60
        L4e:
            boolean r2 = r6 instanceof defpackage.raj
            if (r2 == 0) goto L59
            raj r6 = (defpackage.raj) r6
            boolean r2 = r6.a()
            goto L5d
        L59:
            boolean r2 = r6.equals(r13)
        L5d:
            if (r2 != 0) goto L60
            goto L72
        L60:
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L72
            boolean r2 = r8.equals(r15)
            if (r2 == 0) goto L72
            if (r9 != r3) goto L72
            if (r10 != r0) goto L72
            r0 = 1
            return r0
        L72:
            return r16
        L73:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L73
            throw r0
        L76:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rii.m(rib):boolean");
    }

    @Override // defpackage.rib
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            int i = this.D;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.d) {
            obj = this.i;
            cls = this.j;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}
