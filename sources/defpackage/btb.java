package defpackage;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btb implements bul {
    public static final bro a;
    public static final brv ad;
    private static final Set ah = DesugarCollections.unmodifiableSet(EnumSet.of(bta.PENDING_RECORDING, bta.PENDING_PAUSED));
    private static final Set ai = DesugarCollections.unmodifiableSet(EnumSet.of(bta.CONFIGURING, bta.IDLING, bta.RESETTING, bta.STOPPING, bta.ERROR));
    private static final brd aj;
    private static final Executor ak;
    public static final but b;
    public static final Exception c;
    static final int d;
    static final long e;
    MediaMuxer A;
    final bfi B;
    bvu C;
    bxz D;
    bxz E;
    Uri F;
    long G;
    long H;
    long I;
    long J;
    long K;
    long L;
    long M;
    long N;
    int O;
    Throwable P;
    bxt Q;
    Throwable R;
    public boolean S;
    ScheduledFuture T;
    public boolean U;
    buj V;
    buj W;
    public double X;
    public bsz Y;
    public boolean Z;
    int aa;
    int ab;
    int ac;
    bzq ae;
    bzq af;
    final blw ag;
    private final bfi al;
    private bta am;
    private axr an;
    private long ao;
    private bvb ap;
    public final bfi f;
    public final Executor g;
    public final Executor h;
    public final Object i = new Object();
    public final boolean j;
    public final bfi k;
    public bta l;
    int m;
    public bsv n;
    public bsv o;
    public long p;
    bsv q;
    boolean r;
    public axr s;
    public bvc t;
    final List u;
    Integer v;
    Integer w;
    axt x;
    Surface y;
    Surface z;

    /* JADX WARN: Type inference failed for: r1v9, types: [brv] */
    static {
        List asList = Arrays.asList(brk.d, brk.c, brk.b);
        brk brkVar = brk.d;
        int i = bqy.d;
        bro a2 = bro.a(asList, new bqj(brkVar, 1));
        a = a2;
        bus e2 = but.e();
        e2.c(a2);
        e2.b(-1);
        but a3 = e2.a();
        b = a3;
        brc e3 = brd.e();
        e3.c();
        e3.d(a3);
        aj = e3.a();
        c = new RuntimeException("The video frame producer became inactive before any data was received.");
        ad = new Object() { // from class: brv
        };
        ak = new bjp(bjl.a());
        d = 3;
        e = 1000L;
    }

    public btb(brd brdVar) {
        this.j = bwq.a(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = new bfi(null);
        this.l = bta.CONFIGURING;
        this.am = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = 0L;
        this.q = null;
        this.r = false;
        this.an = null;
        this.s = null;
        this.t = null;
        this.u = new ArrayList();
        this.v = null;
        this.w = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.ae = null;
        this.E = null;
        this.af = null;
        this.ab = 1;
        this.F = Uri.EMPTY;
        this.G = 0L;
        this.H = 0L;
        this.I = 0L;
        this.J = Long.MAX_VALUE;
        this.K = Long.MAX_VALUE;
        this.L = Long.MAX_VALUE;
        this.M = Long.MAX_VALUE;
        this.N = 0L;
        this.O = 1;
        this.P = null;
        this.Q = null;
        this.ag = new blw(60, null);
        this.R = null;
        this.S = false;
        this.ac = 3;
        this.T = null;
        this.U = false;
        this.W = null;
        this.X = eobe.a;
        this.Y = null;
        this.ap = null;
        this.ao = Long.MAX_VALUE;
        this.Z = false;
        Executor a2 = bjl.a();
        this.g = a2;
        bjp bjpVar = new bjp(a2);
        this.h = bjpVar;
        bqm bqmVar = new bqm(brdVar);
        if (((bqv) ((bqn) brdVar).a).d == -1) {
            bqmVar.e(new ksp() { // from class: brw
                @Override // defpackage.ksp
                public final void accept(Object obj) {
                    ((bus) obj).b(((bqv) btb.b).d);
                }
            });
        }
        this.B = new bfi(bqmVar.a());
        int i = this.m;
        int L = L(this.l);
        int i2 = btf.d;
        this.al = new bfi(new bqt(i, L, null));
        this.f = new bfi(false);
        this.V = new buj(bjpVar, a2);
        avw.a("Recorder", "mRequiredFreeStorageBytes = ".concat(String.valueOf(cap.a(52428800L))));
    }

    public static boolean A(btd btdVar, bsv bsvVar) {
        return bsvVar != null && btdVar.b == ((bqr) bsvVar).c;
    }

    static final Object F(bgp bgpVar) {
        try {
            return bgpVar.b().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private final void H() {
        while (!this.ag.c()) {
            this.ag.a();
        }
    }

    private final void I() {
        final bvu bvuVar = this.C;
        if (bvuVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.C = null;
        avw.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(bvuVar.hashCode())));
        bkj.i(kfg.a(new kfd() { // from class: bvj
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final bvu bvuVar2 = bvu.this;
                bvuVar2.a.execute(new Runnable() { // from class: bvm
                    @Override // java.lang.Runnable
                    public final void run() {
                        bvu bvuVar3 = bvu.this;
                        kfb kfbVar2 = kfbVar;
                        try {
                            int i = bvuVar3.s;
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 == 0 || i2 == 1) {
                                bvuVar3.c(null);
                                bvuVar3.e.b.getAndSet(true);
                                bvy bvyVar = bvuVar3.d;
                                if (!((bwn) bvyVar).b.getAndSet(true)) {
                                    Executor executor = ((bwn) bvyVar).d;
                                    final bwn bwnVar = (bwn) bvyVar;
                                    executor.execute(new Runnable() { // from class: bwl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback;
                                            bwn bwnVar2 = bwn.this;
                                            bwnVar2.i.set(false);
                                            bwb bwbVar = (bwb) bwnVar2.g;
                                            if (!bwbVar.c.getAndSet(true)) {
                                                if (Build.VERSION.SDK_INT >= 29 && (audioManager$AudioRecordingCallback = bwbVar.i) != null) {
                                                    bwbVar.a.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
                                                }
                                                bwbVar.a.release();
                                            }
                                            synchronized (bwnVar2.e) {
                                                bwnVar2.f = null;
                                                bwnVar2.c.clear();
                                            }
                                        }
                                    });
                                }
                                bvuVar3.e();
                                bvuVar3.g(3);
                            }
                            kfbVar2.b(null);
                        } catch (Throwable th) {
                            kfbVar2.c(th);
                        }
                    }
                });
                return "AudioSource-release";
            }
        }), new bsf(bvuVar), bjb.a());
    }

    private final void J() {
        if (this.E != null) {
            avw.a("Recorder", "Releasing audio encoder.");
            this.E.b();
            this.E = null;
            this.af = null;
        }
        if (this.C != null) {
            I();
        }
        E(1);
        if (this.D != null) {
            avw.a("Recorder", "Releasing video encoder.");
            buj bujVar = this.W;
            if (bujVar != null) {
                ksw.c(bujVar.c == this.D);
                bxz bxzVar = this.D;
                Objects.toString(bxzVar);
                avw.a("Recorder", "Releasing video encoder: ".concat(String.valueOf(bxzVar)));
                this.W.b();
                this.W = null;
                this.D = null;
                this.ae = null;
                o(null);
            } else {
                g();
            }
        }
        synchronized (this.i) {
            switch (this.l.ordinal()) {
                case 1:
                case 2:
                    K(bta.CONFIGURING);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    p(bta.CONFIGURING);
                    break;
            }
        }
        this.U = false;
        axt axtVar = this.x;
        if (axtVar == null || axtVar.d()) {
            return;
        }
        B(this.x, this.aa, false);
    }

    private final void K(bta btaVar) {
        if (!ah.contains(this.l)) {
            bta btaVar2 = this.l;
            Objects.toString(btaVar2);
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is ".concat(String.valueOf(btaVar2)));
        }
        if (!ai.contains(btaVar)) {
            Objects.toString(btaVar);
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: ".concat(String.valueOf(btaVar)));
        }
        if (this.am != btaVar) {
            this.am = btaVar;
            bfi bfiVar = this.al;
            int i = this.m;
            int L = L(btaVar);
            axr axrVar = this.an;
            int i2 = btf.d;
            bfiVar.e(new bqt(i, L, axrVar));
        }
    }

    private static final int L(bta btaVar) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = (DeactivateEncoderSurfaceBeforeStopEncoderQuirk) bwq.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class);
        if (btaVar != bta.RECORDING) {
            return (btaVar == bta.STOPPING && deactivateEncoderSurfaceBeforeStopEncoderQuirk == null) ? 1 : 2;
        }
        return 1;
    }

    public static ScheduledFuture h(final Runnable runnable, final Executor executor, long j, TimeUnit timeUnit) {
        return bjm.a().schedule(new Runnable() { // from class: brp
            @Override // java.lang.Runnable
            public final void run() {
                bro broVar = btb.a;
                executor.execute(runnable);
            }
        }, j, timeUnit);
    }

    static void k(bxz bxzVar) {
        if (bxzVar instanceof bzy) {
            final bzy bzyVar = (bzy) bxzVar;
            bzyVar.h.execute(new Runnable() { // from class: byq
                @Override // java.lang.Runnable
                public final void run() {
                    bzy bzyVar2 = bzy.this;
                    bzyVar2.w = true;
                    if (bzyVar2.v) {
                        bzyVar2.e.stop();
                        bzyVar2.n();
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ati, bcq] */
    public final void B(axt axtVar, int i, boolean z) {
        if (axtVar.d()) {
            avw.f("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        axtVar.c(this.h, new axs() { // from class: brz
            @Override // defpackage.axs
            public final void a(axr axrVar) {
                btb.this.s = axrVar;
            }
        });
        Size size = axtVar.c;
        aua auaVar = axtVar.d;
        btc btcVar = new btc(axtVar.f.c(), cam.b);
        bqw a2 = btcVar.a(auaVar);
        brk a3 = a2 == null ? brk.h : a2.a(size);
        avw.a("Recorder", a.j(size, a3, "Using supported quality of ", " for surface size "));
        if (a3 != brk.h) {
            bvc c2 = btcVar.c(a3, auaVar);
            this.t = c2;
            if (c2 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        bsz bszVar = this.Y;
        if (bszVar != null) {
            bszVar.a();
        }
        bsz bszVar2 = new bsz(this, axtVar, i, this.Z, z ? d : 0);
        this.Y = bszVar2;
        bszVar2.b(bszVar2.a, bszVar2.g);
    }

    @Override // defpackage.bul
    public final void C(final int i) {
        this.h.execute(new Runnable() { // from class: brt
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledFuture scheduledFuture;
                bxz bxzVar;
                btb btbVar = btb.this;
                int i2 = btbVar.ac;
                int i3 = i;
                btbVar.ac = i3;
                if (i2 == i3) {
                    Objects.toString(buk.a(i3));
                    avw.a("Recorder", "Video source transitions to the same state: ".concat(buk.a(i3)));
                    return;
                }
                Objects.toString(buk.a(i3));
                avw.a("Recorder", "Video source has transitioned to state: ".concat(buk.a(i3)));
                if (i3 != 3) {
                    if (i3 != 2 || (scheduledFuture = btbVar.T) == null || !scheduledFuture.cancel(false) || (bxzVar = btbVar.D) == null) {
                        return;
                    }
                    btb.k(bxzVar);
                    return;
                }
                if (btbVar.z == null) {
                    bsz bszVar = btbVar.Y;
                    if (bszVar != null) {
                        bszVar.a();
                        btbVar.Y = null;
                    }
                    btbVar.G();
                    return;
                }
                btbVar.U = true;
                bsv bsvVar = btbVar.q;
                if (bsvVar != null) {
                    btbVar.l(bsvVar, 4, null);
                }
            }
        });
    }

    @Override // defpackage.bul
    public final void D(final axt axtVar, final int i, final boolean z) {
        synchronized (this.i) {
            avw.a("Recorder", "Surface is requested in state: " + this.l + ", Current surface: " + this.m);
            if (this.l == bta.ERROR) {
                p(bta.CONFIGURING);
            }
        }
        this.h.execute(new Runnable() { // from class: bsa
            @Override // java.lang.Runnable
            public final void run() {
                btb btbVar = btb.this;
                axt axtVar2 = btbVar.x;
                if (axtVar2 != null && !axtVar2.d()) {
                    btbVar.x.f();
                }
                boolean z2 = z;
                int i2 = i;
                axt axtVar3 = axtVar;
                btbVar.Z = z2;
                btbVar.x = axtVar3;
                btbVar.aa = i2;
                btbVar.B(axtVar3, i2, true);
            }
        });
    }

    final void E(int i) {
        avw.a("Recorder", "Transitioning audio state: " + ((Object) bsl.a(this.ab)) + " --> " + ((Object) bsl.a(i)));
        this.ab = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    final void G() {
        boolean z;
        boolean z2;
        synchronized (this.i) {
            z = true;
            z2 = false;
            switch (this.l.ordinal()) {
                case 0:
                case 3:
                case 8:
                    break;
                case 1:
                case 2:
                    K(bta.RESETTING);
                    break;
                case 4:
                case 5:
                    ksw.d(this.q != null, "In-progress recording shouldn't be null when in state " + this.l);
                    if (this.n != this.q) {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    p(bta.RESETTING);
                    z2 = true;
                    z = false;
                    break;
                case 6:
                    p(bta.RESETTING);
                    z = false;
                    break;
                case 7:
                default:
                    z = false;
                    break;
            }
        }
        if (z) {
            J();
        } else if (z2) {
            t(this.q, -1L, 4, null);
        }
    }

    @Override // defpackage.bul
    public final bfl a() {
        return this.B;
    }

    @Override // defpackage.bul
    public final bfl b() {
        return this.al;
    }

    @Override // defpackage.bul
    public final bfl c() {
        return this.f;
    }

    public final bsv d(bta btaVar) {
        boolean z;
        if (btaVar == bta.PENDING_PAUSED) {
            z = true;
        } else {
            if (btaVar != bta.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.n != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        bsv bsvVar = this.o;
        if (bsvVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.n = bsvVar;
        bsvVar.i.c(bjb.a(), new bsk(this));
        this.o = null;
        if (z) {
            p(bta.PAUSED);
            return bsvVar;
        }
        p(bta.RECORDING);
        return bsvVar;
    }

    final bte e() {
        int i;
        int i2;
        long j = this.I;
        long j2 = this.G;
        int i3 = this.ab;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 0) {
            i = 2;
            if (i4 != 2) {
                i2 = 3;
                if (i4 != 3) {
                    i = 4;
                    if (i4 != 4) {
                        if (i4 != 5) {
                            Objects.toString(bsl.a(i3));
                            throw new AssertionError("Invalid internal audio state: ".concat(bsl.a(i3)));
                        }
                        i2 = i;
                    }
                    Throwable th = this.R;
                    double d2 = this.X;
                    long j3 = this.H;
                    int i5 = bqf.a;
                    return bte.d(j, j2, new bqi(i2, d2, j3, th));
                }
                bsv bsvVar = this.q;
                if (bsvVar != null && bsvVar.k()) {
                    i2 = 5;
                    Throwable th2 = this.R;
                    double d22 = this.X;
                    long j32 = this.H;
                    int i52 = bqf.a;
                    return bte.d(j, j2, new bqi(i2, d22, j32, th2));
                }
                if (!this.S) {
                    i = 0;
                }
                i2 = i;
                Throwable th22 = this.R;
                double d222 = this.X;
                long j322 = this.H;
                int i522 = bqf.a;
                return bte.d(j, j2, new bqi(i2, d222, j322, th22));
            }
        }
        i = 1;
        i2 = i;
        Throwable th222 = this.R;
        double d2222 = this.X;
        long j3222 = this.H;
        int i5222 = bqf.a;
        return bte.d(j, j2, new bqi(i2, d2222, j3222, th222));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bul
    public final bth f(ati atiVar) {
        return new btc(atiVar, cam.b);
    }

    public final ListenableFuture g() {
        bxz bxzVar = this.D;
        Objects.toString(bxzVar);
        avw.a("Recorder", "Try to safely release video encoder: ".concat(String.valueOf(bxzVar)));
        buj bujVar = this.V;
        bujVar.a();
        return bkj.d(bujVar.h);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150 A[Catch: all -> 0x01ca, TryCatch #1 {, blocks: (B:22:0x00cd, B:24:0x00d1, B:25:0x00d5, B:33:0x00f6, B:34:0x00fe, B:37:0x0196, B:56:0x010b, B:58:0x010f, B:60:0x0115, B:63:0x011d, B:66:0x0129, B:67:0x0130, B:68:0x0148, B:70:0x014c, B:72:0x0150, B:73:0x0160, B:75:0x0164, B:77:0x016a, B:80:0x0172, B:82:0x017b, B:84:0x017f, B:92:0x01c1, B:93:0x01c2, B:94:0x01c9, B:27:0x00d6, B:28:0x00e5, B:30:0x00eb, B:32:0x00f5), top: B:21:0x00cd, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160 A[Catch: all -> 0x01ca, TryCatch #1 {, blocks: (B:22:0x00cd, B:24:0x00d1, B:25:0x00d5, B:33:0x00f6, B:34:0x00fe, B:37:0x0196, B:56:0x010b, B:58:0x010f, B:60:0x0115, B:63:0x011d, B:66:0x0129, B:67:0x0130, B:68:0x0148, B:70:0x014c, B:72:0x0150, B:73:0x0160, B:75:0x0164, B:77:0x016a, B:80:0x0172, B:82:0x017b, B:84:0x017f, B:92:0x01c1, B:93:0x01c2, B:94:0x01c9, B:27:0x00d6, B:28:0x00e5, B:30:0x00eb, B:32:0x00f5), top: B:21:0x00cd, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i(int r10, java.lang.Throwable r11) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btb.i(int, java.lang.Throwable):void");
    }

    public final void j(bsv bsvVar, int i, Throwable th) {
        bsvVar.h(Uri.EMPTY);
        Throwable th2 = this.R;
        int i2 = bqf.a;
        bte.d(0L, 0L, new bqi(1, eobe.a, 0L, th2));
        brh.b(Uri.EMPTY);
        bsvVar.i(bur.b(((bqr) bsvVar).a, i, th));
    }

    final void l(bsv bsvVar, int i, Throwable th) {
        boolean z;
        if (bsvVar != this.q) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.i) {
            z = false;
            switch (this.l.ordinal()) {
                case 0:
                case 3:
                case 8:
                    throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.l);
                case 4:
                case 5:
                    p(bta.STOPPING);
                    z = true;
                case 1:
                case 2:
                case 6:
                case 7:
                    if (bsvVar != this.n) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                    break;
            }
        }
        if (z) {
            t(bsvVar, -1L, i, th);
        }
    }

    public final void m() {
        if (ah.contains(this.l)) {
            p(this.am);
        } else {
            bta btaVar = this.l;
            Objects.toString(btaVar);
            throw new AssertionError("Cannot restore non-pending state when in state ".concat(String.valueOf(btaVar)));
        }
    }

    final void n(axr axrVar) {
        Objects.toString(axrVar);
        avw.a("Recorder", "Update stream transformation info: ".concat(String.valueOf(axrVar)));
        this.an = axrVar;
        synchronized (this.i) {
            bfi bfiVar = this.al;
            int i = this.m;
            int L = L(this.l);
            int i2 = btf.d;
            bfiVar.e(new bqt(i, L, axrVar));
        }
    }

    final void o(Surface surface) {
        int hashCode;
        if (this.y == surface) {
            return;
        }
        this.y = surface;
        synchronized (this.i) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            q(hashCode);
        }
    }

    public final void p(bta btaVar) {
        if (this.l == btaVar) {
            throw new AssertionError("Attempted to transition to state " + btaVar + ", but Recorder is already in state " + btaVar);
        }
        avw.a("Recorder", "Transitioning Recorder internal state: " + this.l + " --> " + btaVar);
        Set set = ah;
        int i = 0;
        if (set.contains(btaVar)) {
            if (!set.contains(this.l)) {
                if (!ai.contains(this.l)) {
                    bta btaVar2 = this.l;
                    Objects.toString(btaVar2);
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state ".concat(String.valueOf(btaVar2)));
                }
                bta btaVar3 = this.l;
                this.am = btaVar3;
                i = L(btaVar3);
            }
        } else if (this.am != null) {
            this.am = null;
        }
        this.l = btaVar;
        if (i == 0) {
            i = L(btaVar);
        }
        bfi bfiVar = this.al;
        int i2 = this.m;
        axr axrVar = this.an;
        int i3 = btf.d;
        bfiVar.e(new bqt(i2, i, axrVar));
    }

    public final void q(int i) {
        if (this.m == i) {
            return;
        }
        avw.a("Recorder", "Transitioning streamId: " + this.m + " --> " + i);
        this.m = i;
        bfi bfiVar = this.al;
        int L = L(this.l);
        axr axrVar = this.an;
        int i2 = btf.d;
        bfiVar.e(new bqt(i, L, axrVar));
    }

    final void r(bsv bsvVar) {
        String message;
        boolean I;
        int d2;
        ksp kspVar;
        if (this.A != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (y() && this.ag.c()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        bxt bxtVar = this.Q;
        if (bxtVar == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.Q = null;
            long a2 = bxtVar.a();
            ArrayList arrayList = new ArrayList();
            while (!this.ag.c()) {
                bxt bxtVar2 = (bxt) this.ag.a();
                if (bxtVar2.a() >= a2) {
                    arrayList.add(bxtVar2);
                }
            }
            bxtVar.b();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bxt) it.next()).b();
            }
            try {
                brd brdVar = (brd) F(this.B);
                if (brdVar.a() == -1) {
                    bvc bvcVar = this.t;
                    d2 = brd.d(((bqn) aj).c);
                    if (bvcVar != null) {
                        int b2 = bvcVar.b();
                        if (b2 == 1) {
                            d2 = 2;
                        } else if (b2 == 2) {
                            d2 = 0;
                        } else if (b2 == 9) {
                            d2 = 1;
                        }
                    }
                } else {
                    d2 = brd.d(brdVar.a());
                }
                kspVar = new ksp() { // from class: bsc
                    @Override // defpackage.ksp
                    public final void accept(Object obj) {
                        btb.this.F = (Uri) obj;
                    }
                };
            } catch (IOException e2) {
                int i = 5;
                if ((e2 instanceof FileNotFoundException) && (message = e2.getMessage()) != null) {
                    I = ffpc.I(message, "No space left on device", false);
                    if (I) {
                        i = 3;
                    }
                }
                l(bsvVar, i, e2);
            }
            if (!bsvVar.e.get()) {
                throw new AssertionError(a.i(bsvVar, "Recording ", " has not been initialized"));
            }
            bso bsoVar = (bso) bsvVar.f.getAndSet(null);
            if (bsoVar == null) {
                Objects.toString(bsvVar);
                throw new AssertionError("One-time media muxer creation has already occurred for recording ".concat(bsvVar.toString()));
            }
            try {
                brg brgVar = bsoVar.a;
                ParcelFileDescriptor parcelFileDescriptor = bsoVar.b;
                Uri uri = Uri.EMPTY;
                if (!(brgVar instanceof brb)) {
                    throw new AssertionError("Invalid output options type: ".concat(String.valueOf(brgVar.getClass().getSimpleName())));
                }
                MediaMuxer mediaMuxer = new MediaMuxer(parcelFileDescriptor.getFileDescriptor(), d2);
                kspVar.accept(uri);
                axr axrVar = this.s;
                if (axrVar != null) {
                    n(axrVar);
                    mediaMuxer.setOrientationHint(((asz) axrVar).b);
                }
                brg brgVar2 = ((bqr) bsvVar).a;
                MediaFormat mediaFormat = this.ae.a;
                int i2 = bzv.c;
                this.w = Integer.valueOf(mediaMuxer.addTrack(mediaFormat));
                if (y()) {
                    this.v = Integer.valueOf(mediaMuxer.addTrack(this.af.a));
                }
                try {
                    mediaMuxer.start();
                    this.A = mediaMuxer;
                    x(bxtVar, bsvVar);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        w((bxt) it2.next(), bsvVar);
                    }
                } catch (IllegalStateException e3) {
                    ksw.h(this.ap);
                    l(bsvVar, 1, e3);
                }
                bxtVar.close();
            } catch (RuntimeException e4) {
                e4.toString();
                throw new IOException("Failed to create MediaMuxer by ".concat(e4.toString()), e4);
            }
        } catch (Throwable th) {
            try {
                bxtVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198 A[Catch: cad -> 0x0293, bvv -> 0x0295, TryCatch #4 {bvv -> 0x0295, cad -> 0x0293, blocks: (B:57:0x00e6, B:60:0x00fe, B:62:0x0188, B:64:0x0198, B:65:0x019a, B:68:0x01a3, B:70:0x01a7, B:71:0x01ad, B:73:0x01b3, B:75:0x01ca, B:76:0x01d5, B:78:0x01e0, B:79:0x01e3, B:81:0x01ec, B:83:0x01f7, B:85:0x021b, B:86:0x022e, B:88:0x0246, B:90:0x0259, B:91:0x0260, B:92:0x0225, B:93:0x0261, B:94:0x0273, B:95:0x0274, B:96:0x0286, B:97:0x01d0, B:98:0x0287, B:99:0x0292, B:100:0x0118, B:102:0x011f, B:103:0x013a, B:106:0x0142, B:107:0x015c), top: B:56:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7 A[Catch: cad -> 0x0293, bvv -> 0x0295, TryCatch #4 {bvv -> 0x0295, cad -> 0x0293, blocks: (B:57:0x00e6, B:60:0x00fe, B:62:0x0188, B:64:0x0198, B:65:0x019a, B:68:0x01a3, B:70:0x01a7, B:71:0x01ad, B:73:0x01b3, B:75:0x01ca, B:76:0x01d5, B:78:0x01e0, B:79:0x01e3, B:81:0x01ec, B:83:0x01f7, B:85:0x021b, B:86:0x022e, B:88:0x0246, B:90:0x0259, B:91:0x0260, B:92:0x0225, B:93:0x0261, B:94:0x0273, B:95:0x0274, B:96:0x0286, B:97:0x01d0, B:98:0x0287, B:99:0x0292, B:100:0x0118, B:102:0x011f, B:103:0x013a, B:106:0x0142, B:107:0x015c), top: B:56:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3 A[Catch: cad -> 0x0293, bvv -> 0x0295, TryCatch #4 {bvv -> 0x0295, cad -> 0x0293, blocks: (B:57:0x00e6, B:60:0x00fe, B:62:0x0188, B:64:0x0198, B:65:0x019a, B:68:0x01a3, B:70:0x01a7, B:71:0x01ad, B:73:0x01b3, B:75:0x01ca, B:76:0x01d5, B:78:0x01e0, B:79:0x01e3, B:81:0x01ec, B:83:0x01f7, B:85:0x021b, B:86:0x022e, B:88:0x0246, B:90:0x0259, B:91:0x0260, B:92:0x0225, B:93:0x0261, B:94:0x0273, B:95:0x0274, B:96:0x0286, B:97:0x01d0, B:98:0x0287, B:99:0x0292, B:100:0x0118, B:102:0x011f, B:103:0x013a, B:106:0x0142, B:107:0x015c), top: B:56:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0287 A[Catch: cad -> 0x0293, bvv -> 0x0295, TryCatch #4 {bvv -> 0x0295, cad -> 0x0293, blocks: (B:57:0x00e6, B:60:0x00fe, B:62:0x0188, B:64:0x0198, B:65:0x019a, B:68:0x01a3, B:70:0x01a7, B:71:0x01ad, B:73:0x01b3, B:75:0x01ca, B:76:0x01d5, B:78:0x01e0, B:79:0x01e3, B:81:0x01ec, B:83:0x01f7, B:85:0x021b, B:86:0x022e, B:88:0x0246, B:90:0x0259, B:91:0x0260, B:92:0x0225, B:93:0x0261, B:94:0x0273, B:95:0x0274, B:96:0x0286, B:97:0x01d0, B:98:0x0287, B:99:0x0292, B:100:0x0118, B:102:0x011f, B:103:0x013a, B:106:0x0142, B:107:0x015c), top: B:56:0x00e6 }] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.bsv r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btb.s(bsv, boolean):void");
    }

    final void t(bsv bsvVar, long j, int i, Throwable th) {
        if (this.q != bsvVar || this.r) {
            return;
        }
        this.r = true;
        this.O = i;
        this.P = th;
        if (y()) {
            H();
            this.E.e(j);
        }
        bxt bxtVar = this.Q;
        if (bxtVar != null) {
            bxtVar.close();
            this.Q = null;
        }
        if (this.ac != 2) {
            final bxz bxzVar = this.D;
            this.T = h(new Runnable() { // from class: bsd
                @Override // java.lang.Runnable
                public final void run() {
                    bro broVar = btb.a;
                    avw.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                    if (bwq.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                        btb.k(bxz.this);
                    }
                }
            }, this.h, 1000L, TimeUnit.MILLISECONDS);
        } else {
            k(this.D);
        }
        this.D.e(j);
    }

    public final void u(final bsv bsvVar, boolean z) {
        if (!this.u.isEmpty()) {
            ListenableFuture a2 = bkj.a(this.u);
            if (!a2.isDone()) {
                a2.cancel(true);
            }
            this.u.clear();
        }
        this.u.add(kfg.a(new kfd() { // from class: brr
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                bsv bsvVar2 = bsvVar;
                btb btbVar = btb.this;
                btbVar.D.c(new bsg(btbVar, kfbVar, bsvVar2), btbVar.h);
                return "videoEncodingFuture";
            }
        }));
        if (y() && !z) {
            this.u.add(kfg.a(new kfd() { // from class: brs
                @Override // defpackage.kfd
                public final Object a(final kfb kfbVar) {
                    final btb btbVar = btb.this;
                    ksp kspVar = new ksp() { // from class: bru
                        @Override // defpackage.ksp
                        public final void accept(Object obj) {
                            btb btbVar2 = btb.this;
                            Throwable th = (Throwable) obj;
                            if (btbVar2.R == null) {
                                if (th instanceof bxs) {
                                    btbVar2.E(5);
                                } else {
                                    btbVar2.E(6);
                                }
                                kfb kfbVar2 = kfbVar;
                                btbVar2.R = th;
                                btbVar2.v(true);
                                kfbVar2.b(null);
                            }
                        }
                    };
                    final bvu bvuVar = btbVar.C;
                    final bsh bshVar = new bsh(btbVar, kspVar);
                    Executor executor = bvuVar.a;
                    final Executor executor2 = btbVar.h;
                    executor.execute(new Runnable() { // from class: bvn
                        @Override // java.lang.Runnable
                        public final void run() {
                            bvu bvuVar2 = bvu.this;
                            int i = bvuVar2.s;
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 != 0) {
                                if (i2 == 1 || i2 == 2) {
                                    throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                                }
                            } else {
                                bsh bshVar2 = bshVar;
                                bvuVar2.i = executor2;
                                bvuVar2.t = bshVar2;
                            }
                        }
                    });
                    btbVar.E.c(new bsi(btbVar, kfbVar, kspVar, bsvVar), btbVar.h);
                    return "audioEncodingFuture";
                }
            }));
        }
        bkj.i(bkj.a(this.u), new bsj(this), bjb.a());
    }

    public final void v(boolean z) {
        bsv bsvVar = this.q;
        if (bsvVar != null) {
            e();
            bsvVar.j(new buq(((bqr) bsvVar).a), z);
        }
    }

    final void w(bxt bxtVar, bsv bsvVar) {
        long b2 = this.G + bxtVar.b();
        long a2 = bxtVar.a();
        if (this.K == Long.MAX_VALUE) {
            this.K = a2;
            avw.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(a2), buz.a(this.K)));
        } else {
            long nanos = TimeUnit.MICROSECONDS.toNanos(a2 - Math.min(this.J, this.K));
            ksw.d(this.M != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + TimeUnit.MICROSECONDS.toNanos(a2 - this.M);
            long j = this.N;
            if (j != 0 && nanos2 > j) {
                avw.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.N)));
                l(bsvVar, 9, null);
                return;
            }
        }
        try {
            this.A.writeSampleData(this.v.intValue(), bxtVar.d(), bxtVar.c());
            this.G = b2;
            this.H += bxtVar.b();
            this.M = a2;
        } catch (IllegalStateException e2) {
            ksw.h(this.ap);
            l(bsvVar, 1, e2);
        }
    }

    final void x(bxt bxtVar, bsv bsvVar) {
        long j;
        long nanos;
        int i;
        if (this.w == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long b2 = this.G + bxtVar.b();
        long a2 = bxtVar.a();
        if (this.J == Long.MAX_VALUE) {
            this.J = a2;
            avw.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(a2), buz.a(this.J)));
            j = Long.MAX_VALUE;
            i = 1;
            nanos = 0;
        } else {
            j = Long.MAX_VALUE;
            nanos = TimeUnit.MICROSECONDS.toNanos(a2 - Math.min(this.J, this.K));
            ksw.d(this.L != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = TimeUnit.MICROSECONDS.toNanos(a2 - this.L) + nanos;
            i = 1;
            long j2 = this.N;
            if (j2 != 0 && nanos2 > j2) {
                avw.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.N)));
                l(bsvVar, 9, null);
                return;
            }
        }
        try {
            this.A.writeSampleData(this.w.intValue(), bxtVar.d(), ((bxv) bxtVar).a);
            this.G = b2;
            this.I = nanos;
            this.L = a2;
            v(bxtVar.e());
            if (b2 > this.ao) {
                ksw.h(this.ap);
                avw.a("Recorder", "availableBytes = ".concat(String.valueOf(cap.a(j))));
                this.ao = 9223372036802347007L;
            }
        } catch (IllegalStateException e2) {
            ksw.h(this.ap);
            l(bsvVar, i, e2);
        }
    }

    final boolean y() {
        return this.ab == 4;
    }

    public final boolean z() {
        return ((bqh) ((brd) F(this.B)).b()).g != 0;
    }
}
