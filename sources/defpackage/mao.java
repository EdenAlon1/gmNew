package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mao extends mdj {
    public static final long a;
    private static final int[] o = {2, 3, 6, 7, 8, 9, 11, 14};
    private static final int[] p = {1920, 1088};
    public mad b;
    public final SurfaceTexture c;
    public final Queue d;
    public int e;
    public int f;
    public boolean g;
    public lqf h;
    public lqf i;
    public boolean j;
    public CountDownLatch k;
    public volatile boolean l;
    public volatile RuntimeException m;
    private final lqg q;
    private final int r;
    private final Surface s;
    private final float[] t;
    private final ScheduledExecutorService u;
    private Future v;

    static {
        a = true != lvf.aa() ? 500L : 20000L;
    }

    public mao(lqg lqgVar, final mdt mdtVar, boolean z) {
        super(mdtVar);
        this.q = lqgVar;
        this.j = z;
        try {
            int a2 = ltz.a();
            this.r = a2;
            SurfaceTexture surfaceTexture = new SurfaceTexture(a2);
            this.c = surfaceTexture;
            this.t = new float[16];
            this.d = new ConcurrentLinkedQueue();
            this.u = lvf.R("ExtTexMgr:Timer");
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: mah
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    final mao maoVar = mao.this;
                    mdtVar.e(new mds() { // from class: mai
                        @Override // defpackage.mds
                        public final void a() {
                            int i = lyt.a;
                            mao maoVar2 = mao.this;
                            if (maoVar2.j) {
                                Queue queue = maoVar2.d;
                                lqf lqfVar = maoVar2.i;
                                lti.f(lqfVar);
                                queue.add(lqfVar);
                            }
                            if (!maoVar2.l) {
                                if (maoVar2.g) {
                                    maoVar2.q();
                                }
                                maoVar2.f++;
                                maoVar2.m();
                                return;
                            }
                            maoVar2.c.updateTexImage();
                            maoVar2.d.poll();
                            if (maoVar2.k == null || !maoVar2.d.isEmpty()) {
                                return;
                            }
                            maoVar2.k.countDown();
                        }
                    }, false);
                }
            });
            this.s = new Surface(surfaceTexture);
        } catch (lty e) {
            throw new lsf(e);
        }
    }

    private static float t(float f, int i) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 += i3) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (u(i4, f, i) < u(i2, f, i)) {
                i2 = i4;
            }
        }
        int[] iArr = p;
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = iArr[i5];
            if (i6 >= i && u(i6, f, i) < u(i2, f, i)) {
                i2 = i6;
            }
        }
        return u(i2, f, i) > 1.0E-9f ? f : i / i2;
    }

    private static float u(int i, float f, int i2) {
        float f2 = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f3 = ((i2 - i3) / i) - f;
            if (Math.abs(f3) < f2) {
                f2 = Math.abs(f3);
            }
        }
        return f2;
    }

    @Override // defpackage.mdj, defpackage.mbh
    public final void b(lqh lqhVar) {
        this.n.d(new mds() { // from class: mam
            @Override // defpackage.mds
            public final void a() {
                mao maoVar = mao.this;
                maoVar.h = null;
                if (!maoVar.g || !maoVar.d.isEmpty()) {
                    maoVar.m();
                    return;
                }
                maoVar.g = false;
                mad madVar = maoVar.b;
                lti.f(madVar);
                madVar.j();
                int i = lyt.a;
                maoVar.k();
            }
        });
    }

    @Override // defpackage.mdj, defpackage.mbh
    public final void c() {
        this.n.d(new mds() { // from class: man
            @Override // defpackage.mds
            public final void a() {
                mao maoVar = mao.this;
                maoVar.e++;
                maoVar.m();
            }
        });
    }

    @Override // defpackage.mdj
    public final int d() {
        return this.d.size();
    }

    @Override // defpackage.mdj
    protected final void e() {
        this.e = 0;
        this.h = null;
        this.d.clear();
        this.i = null;
        super.e();
    }

    @Override // defpackage.mdj
    public final void g() {
        this.c.release();
        this.s.release();
        this.u.shutdownNow();
    }

    @Override // defpackage.mdj
    public final void h(final mbj mbjVar) {
        lti.c(true);
        this.n.d(new mds() { // from class: mae
            /* JADX WARN: Type inference failed for: r1v1, types: [mad, mbj] */
            @Override // defpackage.mds
            public final void a() {
                mao maoVar = mao.this;
                maoVar.e = 0;
                maoVar.b = mbjVar;
            }
        });
    }

    @Override // defpackage.mdj
    public final void i() {
        this.n.d(new mds() { // from class: maf
            @Override // defpackage.mds
            public final void a() {
                mao maoVar = mao.this;
                if (maoVar.j) {
                    maoVar.l = true;
                }
                if (!maoVar.d.isEmpty() || maoVar.h != null) {
                    maoVar.g = true;
                    maoVar.q();
                    return;
                }
                mad madVar = maoVar.b;
                lti.f(madVar);
                madVar.j();
                int i = lyt.a;
                maoVar.k();
            }
        });
    }

    public final void k() {
        Future future = this.v;
        if (future != null) {
            future.cancel(false);
        }
        this.v = null;
    }

    @Override // defpackage.mdj
    public final void l() {
        this.l = true;
    }

    public final void m() {
        int i;
        if (this.e == 0 || this.f == 0 || this.h != null) {
            return;
        }
        this.c.updateTexImage();
        this.f--;
        lqf lqfVar = (lqf) this.d.element();
        this.h = lqfVar;
        this.e--;
        this.c.getTransformMatrix(this.t);
        long timestamp = (this.c.getTimestamp() / 1000) + lqfVar.b;
        float[] fArr = this.t;
        lqc lqcVar = lqfVar.a;
        int i2 = lqcVar.v;
        int i3 = lqcVar.w;
        int[] iArr = o;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= 8) {
                break;
            }
            if (Math.abs(fArr[iArr[i4]]) <= 1.0E-9f) {
                i = 0;
            }
            i5 |= i;
            i4++;
        }
        int i6 = (Math.abs(fArr[10] + (-1.0f)) > 1.0E-9f ? 1 : 0) | i5 | (Math.abs(fArr[15] + (-1.0f)) > 1.0E-9f ? 1 : 0);
        char c = '\f';
        char c2 = '\r';
        char c3 = 4;
        if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
            i = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i6 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
            c3 = 5;
        } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
            r9 = 65535;
            c = 65535;
            c2 = 65535;
            c3 = 65535;
        } else {
            c2 = '\f';
            c = '\r';
            r9 = 1;
            i = i6 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? (char) 1 : (char) 0);
        }
        if (i != 0) {
            int i7 = lyt.a;
        } else {
            float f = fArr[r9];
            float f2 = fArr[c];
            if (Math.abs(f) + 1.0E-9f < 1.0f) {
                float copySign = Math.copySign(t(Math.abs(f), i2), f);
                float f3 = ((f - copySign) * 0.5f) + f2;
                int i8 = lyt.a;
                fArr[r9] = copySign;
                fArr[c] = f3;
            }
            float f4 = fArr[c3];
            float f5 = fArr[c2];
            if (Math.abs(f4) + 1.0E-9f < 1.0f) {
                float copySign2 = Math.copySign(t(Math.abs(f4), i3), f4);
                float f6 = ((f4 - copySign2) * 0.5f) + f5;
                int i9 = lyt.a;
                fArr[c3] = copySign2;
                fArr[c2] = f6;
            }
        }
        mad madVar = this.b;
        lti.f(madVar);
        ((lzc) madVar).f.g("uTexTransformationMatrix", this.t);
        mad madVar2 = this.b;
        lti.f(madVar2);
        lqg lqgVar = this.q;
        int i10 = this.r;
        lqc lqcVar2 = lqfVar.a;
        madVar2.d(lqgVar, new lqh(i10, -1, lqcVar2.v, lqcVar2.w), timestamp);
        lti.g((lqf) this.d.remove());
        int i11 = lyt.a;
    }

    @Override // defpackage.mdj
    public final void n(lqf lqfVar) {
        this.i = lqfVar;
        if (!this.j) {
            this.d.add(lqfVar);
        }
        this.n.d(new mds() { // from class: mag
            @Override // defpackage.mds
            public final void a() {
                mao.this.l = false;
            }
        });
    }

    @Override // defpackage.mdj
    public final void o() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.k = countDownLatch;
        this.n.d(new mds() { // from class: mak
            @Override // defpackage.mds
            public final void a() {
                mao maoVar = mao.this;
                try {
                    maoVar.p();
                } catch (RuntimeException e) {
                    maoVar.m = e;
                    luj.d("ExtTexMgr", "Failed to remove texture frames", e);
                    CountDownLatch countDownLatch2 = maoVar.k;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                }
            }
        });
        try {
            if (!countDownLatch.await(a, TimeUnit.MILLISECONDS)) {
                luj.f("ExtTexMgr", "Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            luj.f("ExtTexMgr", "Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.k = null;
        if (this.m != null) {
            throw this.m;
        }
    }

    public final void p() {
        while (true) {
            int i = this.f;
            if (i <= 0) {
                break;
            }
            this.f = i - 1;
            this.c.updateTexImage();
            this.d.remove();
        }
        if (this.k == null || !this.d.isEmpty()) {
            return;
        }
        this.k.countDown();
    }

    public final void q() {
        k();
        this.v = this.u.schedule(new Runnable() { // from class: maj
            @Override // java.lang.Runnable
            public final void run() {
                final mao maoVar = mao.this;
                maoVar.n.d(new mds() { // from class: mal
                    @Override // defpackage.mds
                    public final void a() {
                        mao maoVar2 = mao.this;
                        if (maoVar2.f == maoVar2.d.size()) {
                            return;
                        }
                        luj.f("ExtTexMgr", lvf.G("Forcing EOS after missing %d frames for %d ms, with available frame count: %d", Integer.valueOf(maoVar2.d.size()), Long.valueOf(mao.a), Integer.valueOf(maoVar2.f)));
                        maoVar2.g = false;
                        maoVar2.h = null;
                        maoVar2.l = true;
                        maoVar2.p();
                        maoVar2.d.clear();
                        maoVar2.i();
                    }
                });
            }
        }, a, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.mdj
    public final void r(lqf lqfVar, boolean z) {
        this.j = z;
        if (z) {
            this.i = lqfVar;
            SurfaceTexture surfaceTexture = this.c;
            lqc lqcVar = lqfVar.a;
            surfaceTexture.setDefaultBufferSize(lqcVar.v, lqcVar.w);
        }
    }

    @Override // defpackage.mdj
    public final Surface v() {
        return this.s;
    }
}
