package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mac implements lsi {
    public static final /* synthetic */ int l = 0;
    public final lqg a;
    public final boolean b;
    public final EGLDisplay c;
    public final mbo d;
    public final mdt e;
    public final lsh f;
    public final boolean g;
    public final max h;
    public final ltq j;
    public volatile boolean k;
    private final Context m;
    private final Executor n;
    private mab o;
    private mab p;
    private boolean q;
    private final lpo t;
    private final lpr u;
    private volatile lqf v;
    private final List r = new ArrayList();
    private final Object s = new Object();
    public final List i = new ArrayList();

    static {
        lqx.b("media3.effect");
    }

    public mac(Context context, lqg lqgVar, boolean z, EGLDisplay eGLDisplay, mbo mboVar, mdt mdtVar, lsh lshVar, Executor executor, max maxVar, boolean z2, lpo lpoVar, lpr lprVar) {
        this.m = context;
        this.a = lqgVar;
        this.b = z;
        this.c = eGLDisplay;
        this.d = mboVar;
        this.e = mdtVar;
        this.f = lshVar;
        this.n = executor;
        this.g = z2;
        this.t = lpoVar;
        this.u = lprVar;
        this.h = maxVar;
        ltq ltqVar = new ltq();
        this.j = ltqVar;
        ltqVar.d();
        lzp lzpVar = new lzp(this, executor, lshVar);
        maxVar.f.g();
        maxVar.u = lzpVar;
    }

    public static Pair i(lqg lqgVar, EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext a = lqgVar.a(eGLDisplay, i, iArr);
        return Pair.create(a, lqgVar.c(a, eGLDisplay));
    }

    @Override // defpackage.lsi
    public final int a() {
        mbo mboVar = this.d;
        if (mboVar.c()) {
            return mboVar.a().d();
        }
        return 0;
    }

    @Override // defpackage.lsi
    public final Surface b() {
        mbo mboVar = this.d;
        lti.c(lvf.T(mboVar.g, 1));
        return ((mbn) mboVar.g.get(1)).a.v();
    }

    @Override // defpackage.lsi
    public final void c(int i, lqc lqcVar, List list, long j) {
        lqc lqcVar2;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = lyt.a;
        float f = lqcVar.z;
        if (f > 1.0f) {
            lqb lqbVar = new lqb(lqcVar);
            lqbVar.t = (int) (lqcVar.v * f);
            lqbVar.x = 1.0f;
            lqcVar2 = new lqc(lqbVar);
        } else if (f < 1.0f) {
            lqb lqbVar2 = new lqb(lqcVar);
            lqbVar2.u = (int) (lqcVar.w / f);
            lqbVar2.x = 1.0f;
            lqcVar2 = new lqc(lqbVar2);
        } else {
            lqcVar2 = lqcVar;
        }
        this.v = new lqf(lqcVar2, j);
        try {
            this.j.a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.n.execute(new Runnable() { // from class: lzn
                @Override // java.lang.Runnable
                public final void run() {
                    mac.this.f.b(lsf.a(e));
                }
            });
        }
        synchronized (this.s) {
            final mab mabVar = new mab(i, lqcVar, list, j);
            if (this.q) {
                this.p = mabVar;
                this.j.e();
                this.d.b();
            } else {
                this.q = true;
                this.j.e();
                this.e.d(new mds() { // from class: lzq
                    @Override // defpackage.mds
                    public final void a() {
                        mac.this.j(mabVar, true);
                    }
                });
            }
        }
    }

    @Override // defpackage.lsi
    public final void d() {
        try {
            this.e.c(new mds() { // from class: lzx
                @Override // defpackage.mds
                public final void a() {
                    mac macVar = mac.this;
                    try {
                        try {
                            mbo mboVar = macVar.d;
                            for (int i = 0; i < mboVar.g.size(); i++) {
                                SparseArray sparseArray = mboVar.g;
                                mbn mbnVar = (mbn) sparseArray.get(sparseArray.keyAt(i));
                                if (!mbnVar.e) {
                                    mbnVar.e = true;
                                    mbnVar.a.g();
                                    mad madVar = mbnVar.b;
                                    if (madVar != null) {
                                        madVar.e();
                                    }
                                }
                            }
                            for (int i2 = 0; i2 < macVar.i.size(); i2++) {
                                ((mbj) macVar.i.get(i2)).e();
                            }
                            macVar.h.e();
                        } catch (Throwable th) {
                            if (macVar.b) {
                                try {
                                    macVar.a.e(macVar.c);
                                } catch (lty e) {
                                    luj.d("DefaultFrameProcessor", "Error releasing GL objects", e);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        luj.d("DefaultFrameProcessor", "Error releasing shader program", e2);
                    }
                    if (macVar.b) {
                        try {
                            macVar.a.e(macVar.c);
                        } catch (lty e3) {
                            luj.d("DefaultFrameProcessor", "Error releasing GL objects", e3);
                        }
                    }
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.lsi
    public final void e(final lrq lrqVar) {
        final max maxVar = this.h;
        try {
            maxVar.f.b(new mds() { // from class: mar
                /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
                
                    if (r2.a.equals(r1.a) == false) goto L12;
                 */
                @Override // defpackage.mds
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a() {
                    /*
                        r7 = this;
                        max r0 = defpackage.max.this
                        mbk r1 = r0.m
                        if (r1 == 0) goto L7
                        goto L6d
                    L7:
                        lrq r1 = r2
                        lrq r2 = r0.s
                        int r3 = defpackage.lvf.a
                        boolean r2 = j$.util.Objects.equals(r2, r1)
                        if (r2 != 0) goto L6d
                        lrq r2 = r0.s
                        r3 = 1
                        if (r2 == 0) goto L4f
                        if (r1 == 0) goto L24
                        android.view.Surface r4 = r1.a
                        android.view.Surface r2 = r2.a
                        boolean r2 = r2.equals(r4)
                        if (r2 != 0) goto L4f
                    L24:
                        android.opengl.EGLSurface r2 = r0.t
                        if (r2 == 0) goto L4f
                        r2 = 0
                        android.opengl.EGLDisplay r4 = r0.c     // Catch: java.lang.Throwable -> L3c defpackage.lty -> L3e
                        android.opengl.EGLContext r5 = r0.d     // Catch: java.lang.Throwable -> L3c defpackage.lty -> L3e
                        android.opengl.EGLSurface r6 = r0.e     // Catch: java.lang.Throwable -> L3c defpackage.lty -> L3e
                        defpackage.ltz.t(r4, r5, r6, r3, r3)     // Catch: java.lang.Throwable -> L3c defpackage.lty -> L3e
                        android.opengl.EGLDisplay r4 = r0.c     // Catch: java.lang.Throwable -> L3c defpackage.lty -> L3e
                        android.opengl.EGLSurface r5 = r0.t     // Catch: java.lang.Throwable -> L3c defpackage.lty -> L3e
                        defpackage.ltz.s(r4, r5)     // Catch: java.lang.Throwable -> L3c defpackage.lty -> L3e
                        r0.t = r2
                        goto L4f
                    L3c:
                        r1 = move-exception
                        goto L4c
                    L3e:
                        r4 = move-exception
                        java.util.concurrent.Executor r5 = r0.g     // Catch: java.lang.Throwable -> L3c
                        mau r6 = new mau     // Catch: java.lang.Throwable -> L3c
                        r6.<init>()     // Catch: java.lang.Throwable -> L3c
                        r5.execute(r6)     // Catch: java.lang.Throwable -> L3c
                        r0.t = r2
                        goto L4f
                    L4c:
                        r0.t = r2
                        throw r1
                    L4f:
                        lrq r2 = r0.s
                        if (r2 == 0) goto L69
                        if (r1 == 0) goto L69
                        int r4 = r1.b
                        int r5 = r2.b
                        if (r5 != r4) goto L69
                        int r4 = r2.c
                        int r5 = r1.c
                        if (r4 != r5) goto L69
                        int r2 = r2.d
                        int r4 = r1.d
                        if (r2 == r4) goto L68
                        goto L69
                    L68:
                        r3 = 0
                    L69:
                        r0.r = r3
                        r0.s = r1
                    L6d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mar.a():void");
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            maxVar.g.execute(new Runnable() { // from class: mas
                @Override // java.lang.Runnable
                public final void run() {
                    max.this.h.b(lsf.a(e));
                }
            });
        }
    }

    @Override // defpackage.lsi
    public final void f() {
        int i = lyt.a;
        lti.c(!this.k);
        this.k = true;
        this.d.b();
    }

    @Override // defpackage.lsi
    public final boolean g() {
        lti.c(!this.k);
        lti.h(this.v, "registerInputStream must be called before registering input frames");
        if (!this.j.c()) {
            return false;
        }
        this.d.a().n(this.v);
        return true;
    }

    @Override // defpackage.lsi
    public final boolean h(Bitmap bitmap, ltr ltrVar) {
        boolean hasGainmap;
        lti.c(!this.k);
        boolean z = false;
        if (!this.j.c()) {
            return false;
        }
        if (lpo.i(this.t)) {
            if (lvf.a >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    z = true;
                }
            }
            lti.b(z, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        lqf lqfVar = this.v;
        lti.f(lqfVar);
        this.d.a().j(bitmap, lqfVar, ltrVar);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x03cb, code lost:
    
        if (r19.b.x != r2.b.x) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0360  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final defpackage.mab r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mac.j(mab, boolean):void");
    }

    public final void k() {
        synchronized (this.s) {
            final mab mabVar = this.p;
            if (mabVar != null) {
                this.e.d(new mds() { // from class: lzw
                    @Override // defpackage.mds
                    public final void a() {
                        mac.this.j(mabVar, false);
                    }
                });
                this.p = null;
            }
        }
    }
}
