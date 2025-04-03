package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnu implements mmw {
    public static final Object a = new Object();
    public static ScheduledExecutorService b;
    public static int c;
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public ByteBuffer F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public lpl L;
    public mmb M;
    public long N;
    public boolean O;
    public boolean P;
    public Looper Q;
    public long R;
    public long S;
    public Handler T;
    public final mnl U;
    public final mnb V;
    public mnx W;
    private final Context X;
    private final mnp Y;
    private long Z;
    private long aa;
    private ByteBuffer ab;
    private boolean ac;
    public final mna d;
    public final moc e;
    public final engw f;
    public final engw g;
    public final mmz h;
    public final ArrayDeque i;
    public mnt j;
    public final mnp k;
    public mlu l;
    public mnk m;
    public mnk n;
    public lso o;
    public AudioTrack p;
    public mlw q;
    public mma r;
    public mno s;
    public lpk t;
    public mnm u;
    public mnm v;
    public lri w;
    public boolean x;
    public long y;
    public long z;

    public mnu(mnj mnjVar) {
        Context context = mnjVar.a;
        this.X = context;
        this.t = lpk.a;
        this.q = context != null ? null : mnjVar.b;
        this.U = mnjVar.f;
        int i = lvf.a;
        mnb mnbVar = mnjVar.g;
        lti.f(mnbVar);
        this.V = mnbVar;
        this.h = new mmz(new mnq(this));
        mna mnaVar = new mna();
        this.d = mnaVar;
        moc mocVar = new moc();
        this.e = mocVar;
        this.f = engw.t(new lsx(), mnaVar, mocVar);
        this.g = engw.r(new mob());
        this.E = 1.0f;
        this.K = 0;
        this.L = new lpl();
        this.v = new mnm(lri.a, 0L, 0L);
        this.w = lri.a;
        this.x = false;
        this.i = new ArrayDeque();
        this.k = new mnp();
        this.Y = new mnp();
    }

    public static boolean s() {
        boolean z;
        synchronized (a) {
            z = c > 0;
        }
        return z;
    }

    public static boolean u(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (lvf.a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnu.v(java.nio.ByteBuffer):void");
    }

    private final void w() {
        lso lsoVar = this.n.i;
        this.o = lsoVar;
        lsoVar.c();
    }

    private final boolean x() {
        mnk mnkVar = this.n;
        if (mnkVar.c != 0) {
            return false;
        }
        int i = mnkVar.a.G;
        return true;
    }

    private static final AudioTrack y(mmr mmrVar, lpk lpkVar, int i, lqc lqcVar) {
        lqc lqcVar2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(lpkVar.a().a).setAudioFormat(lvf.B(mmrVar.b, mmrVar.c, mmrVar.a)).setTransferMode(1).setBufferSizeInBytes(mmrVar.e).setSessionId(i);
            if (lvf.a >= 29) {
                try {
                    sessionId.setOffloadedPlayback(mmrVar.d);
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    exc = e;
                    lqcVar2 = lqcVar;
                    throw new mmt(0, mmrVar.b, mmrVar.c, mmrVar.a, lqcVar2, mmrVar.d, exc);
                }
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new mmt(state, mmrVar.b, mmrVar.c, mmrVar.a, lqcVar, mmrVar.d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            lqcVar2 = lqcVar;
            exc = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z() {
        /*
            r9 = this;
            java.nio.ByteBuffer r0 = r9.ab
            if (r0 != 0) goto L6
            goto La6
        L6:
            mnp r0 = r9.Y
            boolean r0 = r0.c()
            if (r0 != 0) goto La6
            java.nio.ByteBuffer r0 = r9.ab
            int r0 = r0.remaining()
            android.media.AudioTrack r1 = r9.p
            java.nio.ByteBuffer r2 = r9.ab
            r3 = 1
            int r1 = r1.write(r2, r0, r3)
            long r4 = android.os.SystemClock.elapsedRealtime()
            r9.N = r4
            r4 = 0
            r2 = 0
            if (r1 >= 0) goto L67
            int r0 = defpackage.lvf.a
            r0 = -6
            if (r1 == r0) goto L34
            r0 = -32
            if (r1 != r0) goto L32
            goto L34
        L32:
            r3 = r2
            goto L48
        L34:
            long r6 = r9.i()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3d
            goto L48
        L3d:
            android.media.AudioTrack r0 = r9.p
            boolean r0 = u(r0)
            if (r0 == 0) goto L32
            r9.l()
        L48:
            mmv r0 = new mmv
            mnk r2 = r9.n
            lqc r2 = r2.a
            r0.<init>(r1, r2, r3)
            mnx r1 = r9.W
            if (r1 == 0) goto L58
            r1.a(r0)
        L58:
            boolean r1 = r0.b
            if (r1 != 0) goto L62
            mnp r1 = r9.Y
            r1.b(r0)
            return
        L62:
            mlw r1 = defpackage.mlw.a
            r9.q = r1
            throw r0
        L67:
            mnp r6 = r9.Y
            r6.a()
            android.media.AudioTrack r6 = r9.p
            boolean r6 = u(r6)
            if (r6 == 0) goto L7c
            long r6 = r9.aa
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L7c
            r9.P = r2
        L7c:
            mnk r4 = r9.n
            int r4 = r4.c
            if (r4 != 0) goto L88
            long r5 = r9.Z
            long r7 = (long) r1
            long r5 = r5 + r7
            r9.Z = r5
        L88:
            if (r1 != r0) goto La6
            if (r4 == 0) goto La3
            java.nio.ByteBuffer r0 = r9.ab
            java.nio.ByteBuffer r1 = r9.F
            if (r0 != r1) goto L93
            goto L94
        L93:
            r3 = r2
        L94:
            defpackage.lti.c(r3)
            long r0 = r9.aa
            int r2 = r9.A
            long r2 = (long) r2
            int r4 = r9.G
            long r4 = (long) r4
            long r2 = r2 * r4
            long r0 = r0 + r2
            r9.aa = r0
        La3:
            r0 = 0
            r9.ab = r0
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnu.z():void");
    }

    @Override // defpackage.mmw
    public final int a(lqc lqcVar) {
        m();
        if (!"audio/raw".equals(lqcVar.o)) {
            return this.q.a(lqcVar, this.t) != null ? 2 : 0;
        }
        if (lvf.X(lqcVar.G)) {
            return lqcVar.G != 2 ? 1 : 2;
        }
        luj.f("DefaultAudioSink", "Invalid PCM encoding: " + lqcVar.G);
        return 0;
    }

    @Override // defpackage.mmw
    public final void b() {
        if (t()) {
            this.y = 0L;
            this.z = 0L;
            this.Z = 0L;
            this.aa = 0L;
            this.P = false;
            this.A = 0;
            this.v = new mnm(this.w, 0L, 0L);
            this.D = 0L;
            this.u = null;
            this.i.clear();
            this.F = null;
            this.G = 0;
            this.ab = null;
            this.ac = false;
            this.H = false;
            this.I = false;
            this.e.g = 0L;
            w();
            AudioTrack audioTrack = this.h.a;
            lti.f(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.p.pause();
            }
            if (u(this.p)) {
                mnt mntVar = this.j;
                lti.f(mntVar);
                this.p.unregisterStreamEventCallback(mntVar.b);
                mntVar.a.removeCallbacksAndMessages(null);
            }
            final mmr b2 = this.n.b();
            mnk mnkVar = this.m;
            if (mnkVar != null) {
                this.n = mnkVar;
                this.m = null;
            }
            mmz mmzVar = this.h;
            mmzVar.c();
            mmzVar.a = null;
            mmzVar.c = null;
            int i = lvf.a;
            mno mnoVar = this.s;
            if (mnoVar != null) {
                AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = mnoVar.c;
                lti.f(audioRouting$OnRoutingChangedListener);
                mnoVar.a.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener);
                mnoVar.c = null;
                this.s = null;
            }
            final AudioTrack audioTrack2 = this.p;
            final mnx mnxVar = this.W;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (a) {
                if (b == null) {
                    b = lvf.R("ExoPlayer:AudioTrackReleaseThread");
                }
                c++;
                b.schedule(new Runnable() { // from class: mnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        final mnx mnxVar2 = mnxVar;
                        AudioTrack audioTrack3 = audioTrack2;
                        Handler handler2 = handler;
                        final mmr mmrVar = b2;
                        try {
                            audioTrack3.flush();
                            audioTrack3.release();
                            if (mnxVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                handler2.post(new Runnable() { // from class: mne
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final mmq mmqVar = mnx.this.a.j;
                                        Handler handler3 = mmqVar.a;
                                        if (handler3 != null) {
                                            final mmr mmrVar2 = mmrVar;
                                            handler3.post(new Runnable() { // from class: mmj
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i2 = lvf.a;
                                                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                                                    mlhVar.J(mlhVar.I(), 1032, new lud() { // from class: mkz
                                                        @Override // defpackage.lud
                                                        public final void a(Object obj) {
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            synchronized (mnu.a) {
                                int i2 = mnu.c - 1;
                                mnu.c = i2;
                                if (i2 == 0) {
                                    mnu.b.shutdown();
                                    mnu.b = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (mnxVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                handler2.post(new Runnable() { // from class: mne
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final mmq mmqVar = mnx.this.a.j;
                                        Handler handler3 = mmqVar.a;
                                        if (handler3 != null) {
                                            final mmr mmrVar2 = mmrVar;
                                            handler3.post(new Runnable() { // from class: mmj
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i22 = lvf.a;
                                                    mlh mlhVar = (mlh) mmq.this.b.a.j;
                                                    mlhVar.J(mlhVar.I(), 1032, new lud() { // from class: mkz
                                                        @Override // defpackage.lud
                                                        public final void a(Object obj) {
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            synchronized (mnu.a) {
                                int i3 = mnu.c - 1;
                                mnu.c = i3;
                                if (i3 == 0) {
                                    mnu.b.shutdown();
                                    mnu.b = null;
                                }
                                throw th;
                            }
                        }
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.p = null;
        }
        this.Y.a();
        this.k.a();
        this.R = 0L;
        this.S = 0L;
        Handler handler2 = this.T;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.mmw
    public final void c() {
        this.B = true;
    }

    @Override // defpackage.mmw
    public final void d() {
        this.J = true;
        if (t()) {
            mmz mmzVar = this.h;
            if (mmzVar.o != -9223372036854775807L) {
                ltn ltnVar = mmzVar.u;
                mmzVar.o = lvf.u(SystemClock.elapsedRealtime());
            }
            mmy mmyVar = mmzVar.c;
            lti.f(mmyVar);
            mmyVar.d();
            this.p.play();
        }
    }

    @Override // defpackage.mmw
    public final void e() {
        b();
        int i = 0;
        while (true) {
            engw engwVar = this.f;
            if (i >= ((enou) engwVar).c) {
                break;
            }
            ((lsr) engwVar.get(i)).g();
            i++;
        }
        engw engwVar2 = this.g;
        for (int i2 = 0; i2 < ((enou) engwVar2).c; i2++) {
            ((lsr) engwVar2.get(i2)).g();
        }
        lso lsoVar = this.o;
        if (lsoVar != null) {
            lsoVar.f();
        }
        this.J = false;
        this.O = false;
    }

    @Override // defpackage.mmw
    public final boolean f() {
        boolean isOffloadedPlayback;
        if (!t()) {
            return false;
        }
        if (lvf.a >= 29) {
            isOffloadedPlayback = this.p.isOffloadedPlayback();
            if (isOffloadedPlayback && this.I) {
                return false;
            }
        }
        return this.h.d(i());
    }

    @Override // defpackage.mmw
    public final boolean g(lqc lqcVar) {
        return a(lqcVar) != 0;
    }

    public final long h() {
        return this.n.c == 0 ? this.y / r0.b : this.z;
    }

    public final long i() {
        mnk mnkVar = this.n;
        if (mnkVar.c != 0) {
            return this.aa;
        }
        long j = this.Z;
        long j2 = mnkVar.d;
        int i = lvf.a;
        return ((j + j2) - 1) / j2;
    }

    public final AudioTrack j(mnk mnkVar) {
        try {
            return y(mnkVar.b(), this.t, this.K, mnkVar.a);
        } catch (mmt e) {
            mnx mnxVar = this.W;
            if (mnxVar != null) {
                mnxVar.a(e);
            }
            throw e;
        }
    }

    public final void k(long j) {
        lri lriVar;
        boolean z = false;
        if (x()) {
            mnl mnlVar = this.U;
            lriVar = this.w;
            float f = lriVar.b;
            lti.a(f > 0.0f);
            lsw lswVar = mnlVar.c;
            if (lswVar.b != f) {
                lswVar.b = f;
                lswVar.f = true;
            }
            float f2 = lriVar.c;
            lti.a(f2 > 0.0f);
            if (lswVar.c != f2) {
                lswVar.c = f2;
                lswVar.f = true;
            }
        } else {
            lriVar = lri.a;
        }
        lri lriVar2 = lriVar;
        this.w = lriVar2;
        if (x()) {
            mnl mnlVar2 = this.U;
            z = this.x;
            mnlVar2.b.e = z;
        }
        this.x = z;
        this.i.add(new mnm(lriVar2, Math.max(0L, j), this.n.a(i())));
        w();
        mnx mnxVar = this.W;
        if (mnxVar != null) {
            final boolean z2 = this.x;
            final mmq mmqVar = mnxVar.a.j;
            Handler handler = mmqVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mmn
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = lvf.a;
                        mgl mglVar = mmq.this.b.a;
                        boolean z3 = mglVar.w;
                        final boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        mglVar.w = z4;
                        mglVar.h.f(23, new lud() { // from class: mge
                            @Override // defpackage.lud
                            public final void a(Object obj) {
                                int i2 = mgi.b;
                                ((lrm) obj).x(z4);
                            }
                        });
                    }
                });
            }
        }
    }

    public final void l() {
        if (this.n.c == 1) {
            this.O = true;
        }
    }

    public final void m() {
        mlw mlwVar;
        if (this.r == null && this.X != null) {
            this.Q = Looper.myLooper();
            mma mmaVar = new mma(this.X, new mnf(this), this.t, this.M);
            this.r = mmaVar;
            if (mmaVar.i) {
                mlwVar = mmaVar.f;
                lti.f(mlwVar);
            } else {
                mmaVar.i = true;
                mly mlyVar = mmaVar.e;
                if (mlyVar != null) {
                    mlyVar.a.registerContentObserver(mlyVar.b, false, mlyVar);
                }
                int i = lvf.a;
                mlx mlxVar = mmaVar.c;
                if (mlxVar != null) {
                    Context context = mmaVar.a;
                    Handler handler = mmaVar.b;
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    lti.f(audioManager);
                    audioManager.registerAudioDeviceCallback(mlxVar, handler);
                }
                mmaVar.f = mlw.c(mmaVar.a, mmaVar.a.registerReceiver(mmaVar.d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, mmaVar.b), mmaVar.h, mmaVar.g);
                mlwVar = mmaVar.f;
            }
            this.q = mlwVar;
        }
        lti.f(this.q);
    }

    public final void n() {
        if (this.ac) {
            return;
        }
        this.ac = true;
        mmz mmzVar = this.h;
        long i = i();
        mmzVar.q = mmzVar.b();
        ltn ltnVar = mmzVar.u;
        mmzVar.o = lvf.u(SystemClock.elapsedRealtime());
        mmzVar.r = i;
        if (u(this.p)) {
            this.I = false;
        }
        this.p.stop();
    }

    public final void o(long j) {
        z();
        if (this.ab != null) {
            return;
        }
        if (!this.o.h()) {
            ByteBuffer byteBuffer = this.F;
            if (byteBuffer != null) {
                v(byteBuffer);
                z();
                return;
            }
            return;
        }
        while (!this.o.g()) {
            do {
                ByteBuffer b2 = this.o.b();
                if (b2.hasRemaining()) {
                    v(b2);
                    z();
                } else {
                    ByteBuffer byteBuffer2 = this.F;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.o.e(this.F);
                    }
                }
            } while (this.ab == null);
            return;
        }
    }

    public final void p(lri lriVar) {
        mnm mnmVar = new mnm(lriVar, -9223372036854775807L, -9223372036854775807L);
        if (t()) {
            this.u = mnmVar;
        } else {
            this.v = mnmVar;
        }
    }

    public final void q() {
        if (t()) {
            this.p.setVolume(this.E);
        }
    }

    public final boolean r() {
        if (!this.o.h()) {
            z();
            return this.ab == null;
        }
        this.o.d();
        o(Long.MIN_VALUE);
        if (!this.o.g()) {
            return false;
        }
        ByteBuffer byteBuffer = this.ab;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    public final boolean t() {
        return this.p != null;
    }
}
