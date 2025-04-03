package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mza extends mrk implements mzx {
    private static boolean A;
    private static boolean B;
    private static final int[] z = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private final Context C;
    private final boolean D;
    private final nao E;
    private final int F;
    private final boolean G;
    private final mzy H;
    private final mzw I;
    private myz J;
    private boolean K;
    private boolean L;
    private boolean M;
    private List N;
    private mzc O;
    private lux P;
    private boolean Q;
    private int R;
    private int S;
    private long T;
    private int U;
    private int V;
    private long W;
    private int X;
    private long Y;
    private lsl Z;
    private int aa;
    private int ab;
    private mzv ac;
    private long ad;
    private long ae;
    private boolean af;
    public final long j;
    public final PriorityQueue k;
    public nat l;
    public Surface v;
    public int w;
    public lsl x;
    public boolean y;

    public mza(myy myyVar) {
        super(2, myyVar.d, myyVar.c, 30.0f);
        Context applicationContext = myyVar.a.getApplicationContext();
        this.C = applicationContext;
        this.F = myyVar.g;
        this.l = null;
        this.E = new nao(myyVar.f, myyVar.i);
        this.D = this.l == null;
        this.H = new mzy(applicationContext, this, myyVar.e);
        this.I = new mzw();
        this.G = "NVIDIA".equals(Build.MANUFACTURER);
        this.P = lux.a;
        this.R = 1;
        this.S = 0;
        this.x = lsl.a;
        this.ab = 0;
        this.Z = null;
        this.aa = -1000;
        this.ad = -9223372036854775807L;
        this.ae = -9223372036854775807L;
        this.k = new PriorityQueue();
        long j = myyVar.h;
        this.j = j != -9223372036854775807L ? -j : -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006d, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int aC(defpackage.mrf r10, defpackage.lqc r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mza.aC(mrf, lqc):int");
    }

    protected static int aD(mrf mrfVar, lqc lqcVar) {
        if (lqcVar.p == -1) {
            return aC(mrfVar, lqcVar);
        }
        int size = lqcVar.r.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) lqcVar.r.get(i2)).length;
        }
        return lqcVar.p + i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c1, code lost:
    
        if (r1.equals("deb") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079e, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L514;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean aI(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mza.aI(java.lang.String):boolean");
    }

    protected static final boolean aK(mrf mrfVar) {
        return lvf.a >= 35 && mrfVar.h;
    }

    protected static final boolean aM(mrf mrfVar) {
        int i = lvf.a;
        if (aI(mrfVar.a)) {
            return false;
        }
        return !mrfVar.f || mzc.a();
    }

    private static int aN(int i, int i2) {
        return (i * 3) / (i2 + i2);
    }

    private final Surface aO(mrf mrfVar) {
        nat natVar = this.l;
        if (natVar != null) {
            mzn mznVar = (mzn) natVar;
            lti.c(mznVar.j());
            lsi lsiVar = mznVar.b;
            lti.g(lsiVar);
            return lsiVar.b();
        }
        Surface surface = this.v;
        if (surface != null) {
            return surface;
        }
        if (aK(mrfVar)) {
            return null;
        }
        lti.c(aM(mrfVar));
        mzc mzcVar = this.O;
        if (mzcVar != null) {
            if (mzcVar.b != mrfVar.f) {
                aT();
            }
        }
        if (this.O == null) {
            boolean z2 = mrfVar.f;
            boolean z3 = false;
            lti.c(!z2 || mzc.a());
            mzb mzbVar = new mzb();
            int i = z2 ? mzc.a : 0;
            mzbVar.start();
            mzbVar.b = new Handler(mzbVar.getLooper(), mzbVar);
            mzbVar.a = new ltu(mzbVar.b);
            synchronized (mzbVar) {
                mzbVar.b.obtainMessage(1, i, 0).sendToTarget();
                while (mzbVar.e == null && mzbVar.d == null && mzbVar.c == null) {
                    try {
                        mzbVar.wait();
                    } catch (InterruptedException unused) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = mzbVar.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = mzbVar.c;
            if (error != null) {
                throw error;
            }
            mzc mzcVar2 = mzbVar.e;
            lti.f(mzcVar2);
            this.O = mzcVar2;
        }
        return this.O;
    }

    private static List aP(Context context, mrm mrmVar, lqc lqcVar, boolean z2, boolean z3) {
        if (lqcVar.o == null) {
            int i = engw.d;
            return enou.a;
        }
        int i2 = lvf.a;
        if ("video/dolby-vision".equals(lqcVar.o) && !myx.a(context)) {
            List f = mrv.f(lqcVar, z2, z3);
            if (!f.isEmpty()) {
                return f;
            }
        }
        return mrv.g(lqcVar, z2, z3);
    }

    private final void aQ() {
        if (this.U > 0) {
            eN();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.T;
            final nao naoVar = this.E;
            final int i = this.U;
            Handler handler = naoVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: nag
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = lvf.a;
                        mlh mlhVar = (mlh) nao.this.b.a.j;
                        mlhVar.J(mlhVar.H(), 1018, new lud() { // from class: mjt
                            @Override // defpackage.lud
                            public final void a(Object obj) {
                            }
                        });
                    }
                });
            }
            this.U = 0;
            this.T = elapsedRealtime;
        }
    }

    private final void aR() {
        lsl lslVar = this.Z;
        if (lslVar != null) {
            this.E.c(lslVar);
        }
    }

    private final void aS(long j, long j2, lqc lqcVar) {
        mzv mzvVar = this.ac;
        if (mzvVar != null) {
            mzvVar.c(j, j2, lqcVar, ((mrk) this).o);
        }
    }

    private final void aT() {
        mzc mzcVar = this.O;
        if (mzcVar != null) {
            mzcVar.release();
            this.O = null;
        }
    }

    private final void aU(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.v == surface) {
            if (surface != null) {
                aR();
                Surface surface2 = this.v;
                if (surface2 == null || !this.Q) {
                    return;
                }
                this.E.b(surface2);
                return;
            }
            return;
        }
        this.v = surface;
        if (this.l == null) {
            this.H.k(surface);
        }
        this.Q = false;
        int i = this.c;
        mrc mrcVar = ((mrk) this).n;
        if (mrcVar != null && this.l == null) {
            mrf mrfVar = ((mrk) this).p;
            lti.f(mrfVar);
            boolean aV = aV(mrfVar);
            int i2 = lvf.a;
            if (!aV || this.K) {
                aq();
                ao();
            } else {
                Surface aO = aO(mrfVar);
                if (aO != null) {
                    mrcVar.k(aO);
                } else {
                    if (lvf.a < 35) {
                        throw new IllegalStateException();
                    }
                    mrcVar.g();
                }
            }
        }
        if (surface != null) {
            aR();
            if (i == 2) {
                nat natVar = this.l;
                if (natVar != null) {
                    natVar.b(true);
                    return;
                } else {
                    this.H.c(true);
                    return;
                }
            }
            return;
        }
        this.Z = null;
        nat natVar2 = this.l;
        if (natVar2 != null) {
            int i3 = lux.a.c;
            int i4 = lux.a.d;
            mzs mzsVar = ((mzn) natVar2).i;
            mzsVar.g(null, i3, i4);
            mzsVar.m = null;
        }
    }

    private final boolean aV(mrf mrfVar) {
        if (this.l != null) {
            return true;
        }
        Surface surface = this.v;
        return (surface != null && surface.isValid()) || aK(mrfVar) || aM(mrfVar);
    }

    @Override // defpackage.mea
    protected final void A() {
        aQ();
        final int i = this.X;
        if (i != 0) {
            final nao naoVar = this.E;
            final long j = this.W;
            Handler handler = naoVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: nai
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = lvf.a;
                        mlh mlhVar = (mlh) nao.this.b.a.j;
                        mlhVar.J(mlhVar.H(), 1021, new lud() { // from class: mka
                            @Override // defpackage.lud
                            public final void a(Object obj) {
                            }
                        });
                    }
                });
            }
            this.W = 0L;
            this.X = 0;
        }
        nat natVar = this.l;
        if (natVar != null) {
            ((myr) ((mzn) natVar).i.h).a.g();
        } else {
            this.H.g();
        }
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void B(lqc[] lqcVarArr, long j, long j2, mtl mtlVar) {
        super.B(lqcVarArr, j, j2, mtlVar);
        if (this.ad == -9223372036854775807L) {
            this.ad = j;
        }
        lru lruVar = this.h;
        if (lruVar.q()) {
            this.ae = -9223372036854775807L;
        } else {
            this.ae = lruVar.o(mtlVar.a, new lrs()).d;
        }
    }

    @Override // defpackage.mrk, defpackage.mea, defpackage.mig
    public final void I(float f, float f2) {
        super.I(f, f2);
        nat natVar = this.l;
        if (natVar != null) {
            natVar.e(f);
        } else {
            this.H.l(f);
        }
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.mrk, defpackage.mig
    public final void S(long j, long j2) {
        nat natVar = this.l;
        if (natVar != null) {
            try {
                nat natVar2 = ((mzn) natVar).i.h;
                try {
                    nad nadVar = ((myr) natVar2).b;
                    while (true) {
                        lul lulVar = nadVar.e;
                        if (lulVar.a == 0) {
                            break;
                        }
                        long a = lulVar.a();
                        Long l = (Long) nadVar.d.d(a);
                        if (l != null && l.longValue() != nadVar.j) {
                            nadVar.j = l.longValue();
                            nadVar.a.e();
                        }
                        int a2 = nadVar.a.a(a, j, j2, nadVar.j, false, nadVar.b);
                        if (a2 == 0 || a2 == 1) {
                            nadVar.g = a;
                            long b = nadVar.e.b();
                            lsl lslVar = (lsl) nadVar.c.d(b);
                            if (lslVar != null && !lslVar.equals(lsl.a) && !lslVar.equals(nadVar.i)) {
                                nadVar.i = lslVar;
                                final myq myqVar = nadVar.k;
                                final lsl lslVar2 = nadVar.i;
                                lqb lqbVar = new lqb();
                                lqbVar.t = lslVar2.b;
                                lqbVar.u = lslVar2.c;
                                lqbVar.c("video/raw");
                                myqVar.a = new lqc(lqbVar);
                                myqVar.b.h.execute(new Runnable() { // from class: myp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        myq.this.b.g.d(lslVar2);
                                    }
                                });
                            }
                            long j3 = a2 == 0 ? -1L : nadVar.b.b;
                            final myq myqVar2 = nadVar.k;
                            if (nadVar.a.n()) {
                                myr myrVar = myqVar2.b;
                                if (myrVar.d != null) {
                                    myrVar.h.execute(new Runnable() { // from class: myn
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            myq.this.b.g.b();
                                        }
                                    });
                                }
                            }
                            lqc lqcVar = myqVar2.a;
                            myqVar2.b.i.c(b, System.nanoTime(), lqcVar == null ? new lqc(new lqb()) : lqcVar, null);
                            ((nar) myqVar2.b.c.remove()).a(j3);
                        } else if (a2 == 2 || a2 == 3) {
                            nadVar.g = a;
                            nadVar.e.b();
                            final myq myqVar3 = nadVar.k;
                            myqVar3.b.h.execute(new Runnable() { // from class: myo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    myq.this.b.g.c();
                                }
                            });
                            ((nar) myqVar3.b.c.remove()).b();
                        } else if (a2 != 4) {
                            break;
                        } else {
                            nadVar.g = a;
                        }
                    }
                } catch (mel e) {
                    throw new nas(e, ((myr) natVar2).e);
                }
            } catch (nas e2) {
                throw h(e2, e2.a, 7001);
            }
        }
        super.S(j, j2);
    }

    @Override // defpackage.mrk, defpackage.mig
    public final boolean T() {
        if (!this.r) {
            return false;
        }
        nat natVar = this.l;
        if (natVar == null) {
            return true;
        }
        mzn mznVar = (mzn) natVar;
        if (mznVar.j()) {
            mzs mzsVar = mznVar.i;
            if (mzsVar.n == 0 && mzsVar.r) {
                nad nadVar = ((myr) mzsVar.h).b;
                long j = nadVar.h;
                return j != -9223372036854775807L && nadVar.g == j;
            }
        }
        return false;
    }

    @Override // defpackage.mrk, defpackage.mig
    public final boolean U() {
        boolean U = super.U();
        nat natVar = this.l;
        if (natVar != null) {
            boolean z2 = U && ((mzn) natVar).j();
            mzs mzsVar = ((mzn) natVar).i;
            return ((myr) mzsVar.h).a.m(z2 && mzsVar.n == 0);
        }
        if (!U) {
            r2 = false;
        } else if (((mrk) this).n == null || this.v == null) {
            return true;
        }
        return this.H.m(r2);
    }

    @Override // defpackage.mrk
    protected final int W(mrm mrmVar, lqc lqcVar) {
        boolean z2;
        int i = 0;
        if (!lre.l(lqcVar.o)) {
            return mih.a(0);
        }
        Context context = this.C;
        boolean z3 = lqcVar.s != null;
        List aP = aP(context, mrmVar, lqcVar, z3, false);
        if (z3 && aP.isEmpty()) {
            aP = aP(context, mrmVar, lqcVar, false, false);
        }
        if (aP.isEmpty()) {
            return mih.a(1);
        }
        if (!ay(lqcVar)) {
            return mih.a(2);
        }
        mrf mrfVar = (mrf) aP.get(0);
        boolean d = mrfVar.d(lqcVar);
        if (!d) {
            for (int i2 = 1; i2 < aP.size(); i2++) {
                mrf mrfVar2 = (mrf) aP.get(i2);
                if (mrfVar2.d(lqcVar)) {
                    z2 = false;
                    d = true;
                    mrfVar = mrfVar2;
                    break;
                }
            }
        }
        z2 = true;
        int i3 = true != d ? 3 : 4;
        int i4 = true != mrfVar.f(lqcVar) ? 8 : 16;
        int i5 = true != mrfVar.g ? 0 : 64;
        int i6 = true != z2 ? 0 : 128;
        int i7 = lvf.a;
        if ("video/dolby-vision".equals(lqcVar.o) && !myx.a(context)) {
            i6 = 256;
        }
        int i8 = i6;
        if (d) {
            List aP2 = aP(context, mrmVar, lqcVar, z3, true);
            if (!aP2.isEmpty()) {
                mrf mrfVar3 = (mrf) mrv.d(aP2, lqcVar).get(0);
                if (mrfVar3.d(lqcVar) && mrfVar3.f(lqcVar)) {
                    i = 32;
                }
            }
        }
        return mih.c(i3, i4, i, i5, i8, 0);
    }

    @Override // defpackage.mrk
    protected final mec X(mrf mrfVar, lqc lqcVar, lqc lqcVar2) {
        int i;
        int i2;
        mec b = mrfVar.b(lqcVar, lqcVar2);
        int i3 = b.e;
        myz myzVar = this.J;
        lti.f(myzVar);
        if (lqcVar2.v > myzVar.a || lqcVar2.w > myzVar.b) {
            i3 |= 256;
        }
        if (aD(mrfVar, lqcVar2) > myzVar.c) {
            i3 |= 64;
        }
        String str = mrfVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = b.d;
        }
        return new mec(str, lqcVar, lqcVar2, i2, i);
    }

    @Override // defpackage.mrk
    protected final mec Y(mgz mgzVar) {
        final mec Y = super.Y(mgzVar);
        final lqc lqcVar = mgzVar.b;
        lti.f(lqcVar);
        final nao naoVar = this.E;
        Handler handler = naoVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nal
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) nao.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1017, new lud() { // from class: mkj
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        return Y;
    }

    @Override // defpackage.mrk
    protected final mra Z(mrf mrfVar, lqc lqcVar, MediaCrypto mediaCrypto, float f) {
        Point point;
        int i;
        int i2;
        int i3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z2;
        int i4;
        int aC;
        lqc[] O = O();
        int length = O.length;
        int aD = aD(mrfVar, lqcVar);
        int i5 = lqcVar.v;
        int i6 = lqcVar.w;
        if (length != 1) {
            boolean z3 = false;
            for (int i7 = 0; i7 < length; i7++) {
                lqc lqcVar2 = O[i7];
                lpo lpoVar = lqcVar.C;
                if (lpoVar != null && lqcVar2.C == null) {
                    lqb lqbVar = new lqb(lqcVar2);
                    lqbVar.A = lpoVar;
                    lqcVar2 = new lqc(lqbVar);
                }
                if (mrfVar.b(lqcVar, lqcVar2).d != 0) {
                    int i8 = lqcVar2.v;
                    z3 |= i8 == -1 || lqcVar2.w == -1;
                    i5 = Math.max(i5, i8);
                    i6 = Math.max(i6, lqcVar2.w);
                    aD = Math.max(aD, aD(mrfVar, lqcVar2));
                }
            }
            if (z3) {
                luj.f("MediaCodecVideoRenderer", a.r(i6, i5, "Resolutions unknown. Codec max resolution: ", "x"));
                int i9 = lqcVar.w;
                int i10 = lqcVar.v;
                boolean z4 = i9 > i10;
                int i11 = z4 ? i9 : i10;
                if (true == z4) {
                    i9 = i10;
                }
                int[] iArr = z;
                int i12 = 0;
                while (i12 < 9) {
                    float f2 = i11;
                    float f3 = i9;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i12];
                    float f4 = i13;
                    if (i13 <= i11 || (i = (int) (f4 * (f3 / f2))) <= i9) {
                        break;
                    }
                    if (true != z4) {
                        i2 = i9;
                        i3 = i13;
                    } else {
                        i2 = i9;
                        i3 = i;
                    }
                    if (true != z4) {
                        i13 = i;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = mrfVar.d;
                    point = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : mrf.a(videoCapabilities, i3, i13);
                    float f5 = lqcVar.x;
                    if (point != null) {
                        z2 = z4;
                        if (mrfVar.g(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z2 = z4;
                    }
                    i12++;
                    iArr = iArr2;
                    i9 = i2;
                    z4 = z2;
                }
                point = null;
                if (point != null) {
                    i5 = Math.max(i5, point.x);
                    i6 = Math.max(i6, point.y);
                    lqb lqbVar2 = new lqb(lqcVar);
                    lqbVar2.t = i5;
                    lqbVar2.u = i6;
                    aD = Math.max(aD, aC(mrfVar, new lqc(lqbVar2)));
                    luj.f("MediaCodecVideoRenderer", a.r(i6, i5, "Codec max resolution adjusted to: ", "x"));
                }
            }
        } else if (aD != -1 && (aC = aC(mrfVar, lqcVar)) != -1) {
            aD = Math.min((int) (aD * 1.5f), aC);
        }
        String str = mrfVar.c;
        myz myzVar = new myz(i5, i6, aD);
        this.J = myzVar;
        boolean z5 = this.G;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", lqcVar.v);
        mediaFormat.setInteger("height", lqcVar.w);
        lum.f(mediaFormat, lqcVar.r);
        lum.g(mediaFormat, lqcVar.x);
        lum.d(mediaFormat, "rotation-degrees", lqcVar.y);
        lum.c(mediaFormat, lqcVar.C);
        if ("video/dolby-vision".equals(lqcVar.o)) {
            int i14 = mrv.a;
            Pair a = lto.a(lqcVar);
            if (a != null) {
                lum.d(mediaFormat, "profile", ((Integer) a.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", myzVar.a);
        mediaFormat.setInteger("max-height", myzVar.b);
        lum.d(mediaFormat, "max-input-size", myzVar.c);
        int i15 = lvf.a;
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            i4 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i4 = 0;
        }
        if (lvf.a >= 35) {
            mediaFormat.setInteger(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(i4, -this.aa));
        }
        Surface aO = aO(mrfVar);
        if (this.l != null && !lvf.Y(this.C)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new mra(mrfVar, mediaFormat, lqcVar, aO, mediaCrypto, null);
    }

    @Override // defpackage.mrk
    protected final void aA() {
        this.w++;
        int i = lvf.a;
    }

    @Override // defpackage.mrk
    protected final void aB() {
        int i = lvf.a;
    }

    protected final long aE() {
        return -this.ad;
    }

    public final void aF() {
        this.E.b(this.v);
        this.Q = true;
    }

    protected final void aG(int i, int i2) {
        meb mebVar = this.t;
        mebVar.h += i;
        int i3 = i + i2;
        mebVar.g += i3;
        this.U += i3;
        int i4 = this.V + i3;
        this.V = i4;
        mebVar.i = Math.max(i4, mebVar.i);
        int i5 = this.F;
        if (i5 <= 0 || this.U < i5) {
            return;
        }
        aQ();
    }

    protected final void aH(long j) {
        meb mebVar = this.t;
        mebVar.k += j;
        mebVar.l++;
        this.W += j;
        this.X++;
    }

    protected final void aJ(mrc mrcVar, int i, long j) {
        Trace.beginSection("releaseOutputBuffer");
        mrcVar.j(i, j);
        Trace.endSection();
        this.t.e++;
        this.V = 0;
        if (this.l == null) {
            lsl lslVar = this.x;
            if (!lslVar.equals(lsl.a) && !lslVar.equals(this.Z)) {
                this.Z = lslVar;
                this.E.c(lslVar);
            }
            if (!this.H.n() || this.v == null) {
                return;
            }
            aF();
        }
    }

    protected final void aL(mrc mrcVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        mrcVar.o(i);
        Trace.endSection();
        this.t.f++;
    }

    @Override // defpackage.mrk
    protected final List aa(mrm mrmVar, lqc lqcVar, boolean z2) {
        return mrv.d(aP(this.C, mrmVar, lqcVar, z2, false), lqcVar);
    }

    @Override // defpackage.mrk
    protected final void ab(lxz lxzVar) {
        if (this.L) {
            ByteBuffer byteBuffer = lxzVar.g;
            lti.f(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        mrc mrcVar = ((mrk) this).n;
                        lti.f(mrcVar);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mrcVar.l(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.mrk
    protected final void ac(final Exception exc) {
        luj.d("MediaCodecVideoRenderer", "Video codec error", exc);
        final nao naoVar = this.E;
        Handler handler = naoVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: naj
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) nao.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1030, new lud() { // from class: mjg
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.mrk
    protected final void ad(final String str) {
        final nao naoVar = this.E;
        Handler handler = naoVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nan
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) nao.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1019, new lud() { // from class: mjs
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.mrk
    protected final void ae(lqc lqcVar, MediaFormat mediaFormat) {
        mrc mrcVar = ((mrk) this).n;
        if (mrcVar != null) {
            mrcVar.m(this.R);
        }
        lti.f(mediaFormat);
        boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = lqcVar.z;
        int i = lqcVar.y;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.x = new lsl(integer, integer2, f);
        nat natVar = this.l;
        if (natVar == null || !this.af) {
            this.H.j(lqcVar.x);
        } else {
            lqb lqbVar = new lqb(lqcVar);
            lqbVar.t = integer;
            lqbVar.u = integer2;
            lqbVar.x = f;
            lqc lqcVar2 = new lqc(lqbVar);
            List list = this.N;
            if (list == null) {
                int i3 = engw.d;
                list = enou.a;
            }
            mzn mznVar = (mzn) natVar;
            lti.c(mznVar.j());
            mznVar.m(list);
            mznVar.d = 1;
            mznVar.c = lqcVar2;
            mzs mzsVar = mznVar.i;
            mzsVar.q = -9223372036854775807L;
            mzsVar.r = false;
            mznVar.l(lqcVar2);
        }
        this.af = false;
    }

    @Override // defpackage.mrk
    protected final void af() {
        nat natVar = this.l;
        if (natVar != null) {
            natVar.i();
            this.l.f(am(), aE());
        } else {
            this.H.e();
        }
        this.af = true;
    }

    @Override // defpackage.mrk
    protected final void ag() {
        nat natVar = this.l;
        if (natVar != null) {
            natVar.i();
        }
    }

    @Override // defpackage.mrk
    protected final boolean ah(long j, long j2, mrc mrcVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z2, boolean z3, lqc lqcVar) {
        long j4;
        lti.f(mrcVar);
        long al = j3 - al();
        int i4 = 0;
        while (true) {
            Long l = (Long) this.k.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            this.k.poll();
            i4++;
        }
        aG(i4, 0);
        nat natVar = this.l;
        if (natVar == null) {
            int a = this.H.a(j3, j, j2, am(), z3, this.I);
            if (a != 4) {
                if (z2 && !z3) {
                    aL(mrcVar, i);
                    return true;
                }
                if (this.v == null) {
                    long j5 = this.I.a;
                    if (j5 < 0 || (j5 < 30000 && a != 5)) {
                        aL(mrcVar, i);
                        aH(this.I.a);
                        return true;
                    }
                } else {
                    if (a == 0) {
                        eN();
                        long nanoTime = System.nanoTime();
                        aS(al, nanoTime, lqcVar);
                        aJ(mrcVar, i, nanoTime);
                        aH(this.I.a);
                        return true;
                    }
                    if (a == 1) {
                        lti.g(mrcVar);
                        mzw mzwVar = this.I;
                        long j6 = mzwVar.b;
                        long j7 = mzwVar.a;
                        if (j6 == this.Y) {
                            aL(mrcVar, i);
                            j4 = j6;
                        } else {
                            aS(al, j6, lqcVar);
                            j4 = j6;
                            aJ(mrcVar, i, j4);
                        }
                        aH(j7);
                        this.Y = j4;
                        return true;
                    }
                    if (a == 2) {
                        Trace.beginSection("dropVideoBuffer");
                        mrcVar.o(i);
                        Trace.endSection();
                        aG(0, 1);
                        aH(this.I.a);
                        return true;
                    }
                    if (a == 3) {
                        aL(mrcVar, i);
                        aH(this.I.a);
                        return true;
                    }
                    if (a != 5) {
                        throw new IllegalStateException(String.valueOf(a));
                    }
                }
            }
        } else {
            if (z2 && !z3) {
                aL(mrcVar, i);
                return true;
            }
            long aE = j3 + aE();
            myw mywVar = new myw(this, mrcVar, i);
            mzn mznVar = (mzn) natVar;
            lti.c(mznVar.j());
            mzs mzsVar = mznVar.i;
            int i5 = mzsVar.t;
            if (i5 != -1 && i5 == mzsVar.u) {
                lsi lsiVar = mznVar.b;
                lti.g(lsiVar);
                if (lsiVar.a() < mznVar.a) {
                    lsi lsiVar2 = mznVar.b;
                    lti.g(lsiVar2);
                    if (lsiVar2.g()) {
                        mznVar.f = aE - mznVar.e;
                        mywVar.a(aE * 1000);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.mrk
    protected final float aj(float f, lqc[] lqcVarArr) {
        float f2 = -1.0f;
        for (lqc lqcVar : lqcVarArr) {
            float f3 = lqcVar.x;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.mrk
    protected final void ak(String str, final long j, final long j2) {
        final String str2;
        final nao naoVar = this.E;
        Handler handler = naoVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new Runnable() { // from class: nae
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) nao.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1016, new lud() { // from class: mkx
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        } else {
            str2 = str;
        }
        this.K = aI(str2);
        mrf mrfVar = ((mrk) this).p;
        lti.f(mrfVar);
        boolean z2 = false;
        if (lvf.a >= 29 && "video/x-vnd.on2.vp9".equals(mrfVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] h = mrfVar.h();
            int length = h.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (h[i].profile == 16384) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        this.L = z2;
    }

    @Override // defpackage.mrk
    protected final mre an(Throwable th, mrf mrfVar) {
        return new myu(th, mrfVar, this.v);
    }

    @Override // defpackage.mrk
    protected final void ap(long j) {
        super.ap(j);
        this.w--;
    }

    @Override // defpackage.mrk
    protected final void ar() {
        super.ar();
        this.k.clear();
        this.y = false;
        this.w = 0;
    }

    @Override // defpackage.mrk
    protected final boolean av(lqc lqcVar) {
        nat natVar = this.l;
        if (natVar == null || natVar.j()) {
            return true;
        }
        try {
            lti.c(!((mzn) natVar).j());
            mzs mzsVar = ((mzn) natVar).i;
            lti.c(mzsVar.o == 0);
            lpo f = mzs.f(lqcVar.C);
            lpo lpoVar = (f.e != 7 || lvf.a >= 34) ? f : new lpo(f.c, f.d, 6, f.f, f.g, f.h);
            ltn ltnVar = mzsVar.i;
            Looper myLooper = Looper.myLooper();
            lti.g(myLooper);
            mzsVar.k = ltnVar.b(myLooper, null);
            try {
                lrp lrpVar = mzsVar.d;
                Context context = mzsVar.b;
                lpr lprVar = lpr.a;
                final lua luaVar = mzsVar.k;
                luaVar.getClass();
                mzsVar.v = lrpVar.a(context, lpoVar, lprVar, mzsVar, new Executor() { // from class: mzd
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        lua.this.b(runnable);
                    }
                }, mzsVar.g, mzsVar.f);
                Pair pair = mzsVar.m;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    lux luxVar = (lux) mzsVar.m.second;
                    mzsVar.g(surface, luxVar.c, luxVar.d);
                }
                mzsVar.o = 1;
                try {
                    mcm mcmVar = mzsVar.v;
                    lti.f(mcmVar);
                    mcmVar.j(0);
                    mzsVar.u++;
                    nat natVar2 = mzsVar.h;
                    mzi mziVar = new mzi(mzsVar);
                    final lua luaVar2 = mzsVar.k;
                    lti.f(luaVar2);
                    Executor executor = new Executor() { // from class: mzd
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            lua.this.b(runnable);
                        }
                    };
                    ((myr) natVar2).g = mziVar;
                    ((myr) natVar2).h = executor;
                    ((mzn) natVar).b = mzsVar.v.b(0);
                    return ((mzn) natVar).b != null;
                } catch (lsf e) {
                    throw new nas(e, lqcVar);
                }
            } catch (lsf e2) {
                throw new nas(e2, lqcVar);
            }
        } catch (nas e3) {
            throw h(e3, lqcVar, 7000);
        }
    }

    @Override // defpackage.mrk
    protected final boolean aw(lxz lxzVar) {
        if (!M() && !lxzVar.g() && this.ae != -9223372036854775807L) {
            if (this.ae - (lxzVar.f - al()) > 100000 && !lxzVar.j()) {
                boolean z2 = lxzVar.f < this.f;
                if ((z2 || this.y) && !lxzVar.d() && lxzVar.eQ(VCardConfig.FLAG_APPEND_TYPE_PARAM)) {
                    lxzVar.eO();
                    if (z2) {
                        this.t.d++;
                    } else if (this.y) {
                        this.k.add(Long.valueOf(lxzVar.f));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mrk
    protected final boolean ax(mrf mrfVar) {
        return aV(mrfVar);
    }

    @Override // defpackage.mea, defpackage.mig
    public final void q() {
        nat natVar = this.l;
        if (natVar != null) {
            ((myr) ((mzn) natVar).i.h).a.b();
        } else {
            this.H.b();
        }
    }

    @Override // defpackage.mrk, defpackage.mea, defpackage.mic
    public final void r(int i, Object obj) {
        if (i == 1) {
            aU(obj);
            return;
        }
        if (i == 7) {
            lti.f(obj);
            mzv mzvVar = (mzv) obj;
            this.ac = mzvVar;
            nat natVar = this.l;
            if (natVar != null) {
                natVar.h(mzvVar);
                return;
            }
            return;
        }
        if (i == 10) {
            lti.f(obj);
            int intValue = ((Integer) obj).intValue();
            if (this.ab != intValue) {
                this.ab = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            lti.f(obj);
            int intValue2 = ((Integer) obj).intValue();
            this.R = intValue2;
            mrc mrcVar = ((mrk) this).n;
            if (mrcVar != null) {
                mrcVar.m(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            lti.f(obj);
            int intValue3 = ((Integer) obj).intValue();
            this.S = intValue3;
            nat natVar2 = this.l;
            if (natVar2 != null) {
                natVar2.c(intValue3);
                return;
            } else {
                this.H.i(intValue3);
                return;
            }
        }
        if (i == 13) {
            lti.f(obj);
            List list = (List) obj;
            this.N = list;
            nat natVar3 = this.l;
            if (natVar3 != null) {
                natVar3.g(list);
                return;
            }
            return;
        }
        if (i == 14) {
            lti.f(obj);
            lux luxVar = (lux) obj;
            if (luxVar.c == 0 || luxVar.d == 0) {
                return;
            }
            this.P = luxVar;
            nat natVar4 = this.l;
            if (natVar4 != null) {
                Surface surface = this.v;
                lti.g(surface);
                natVar4.d(surface, luxVar);
                return;
            }
            return;
        }
        if (i != 16) {
            if (i != 17) {
                super.r(i, obj);
                return;
            }
            Surface surface2 = this.v;
            aU(null);
            lti.f(obj);
            ((mza) obj).r(1, surface2);
            return;
        }
        lti.f(obj);
        this.aa = ((Integer) obj).intValue();
        mrc mrcVar2 = ((mrk) this).n;
        if (mrcVar2 == null || lvf.a < 35) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.aa));
        mrcVar2.l(bundle);
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void u() {
        this.Z = null;
        this.ae = -9223372036854775807L;
        nat natVar = this.l;
        if (natVar != null) {
            ((myr) ((mzn) natVar).i.h).a.d();
        } else {
            this.H.d();
        }
        this.Q = false;
        try {
            super.u();
        } finally {
            this.E.a(this.t);
            this.E.c(lsl.a);
        }
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void v(boolean z2, boolean z3) {
        super.v(z2, z3);
        Q();
        lti.c(true);
        final nao naoVar = this.E;
        Handler handler = naoVar.a;
        final meb mebVar = this.t;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nak
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mlh mlhVar = (mlh) nao.this.b.a.j;
                    mlhVar.J(mlhVar.I(), 1015, new lud() { // from class: mkr
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        if (!this.M) {
            if (this.N != null && this.l == null) {
                mzh mzhVar = new mzh(this.C, this.H);
                mzhVar.g = eN();
                lti.c(!mzhVar.h);
                if (mzhVar.d == null) {
                    if (mzhVar.c == null) {
                        mzhVar.c = new mzq();
                    }
                    mzhVar.d = new mzr(mzhVar.c);
                }
                mzs mzsVar = new mzs(mzhVar);
                mzhVar.h = true;
                mzsVar.t = 1;
                lti.c(!lvf.T(mzsVar.e, 0));
                mzn mznVar = new mzn(mzsVar, mzsVar.b);
                mzsVar.j.add(mznVar);
                mzsVar.e.put(0, mznVar);
                this.l = mznVar;
            }
            this.M = true;
        }
        nat natVar = this.l;
        if (natVar == null) {
            this.H.b = eN();
            this.H.a = z3 ? 1 : 0;
            return;
        }
        myv myvVar = new myv(this);
        erpp erppVar = erpp.a;
        mzn mznVar2 = (mzn) natVar;
        mznVar2.g = myvVar;
        mznVar2.h = erppVar;
        mzv mzvVar = this.ac;
        if (mzvVar != null) {
            natVar.h(mzvVar);
        }
        if (this.v != null && !this.P.equals(lux.a)) {
            this.l.d(this.v, this.P);
        }
        this.l.c(this.S);
        this.l.e(((mrk) this).m);
        List list = this.N;
        if (list != null) {
            this.l.g(list);
        }
        ((myr) ((mzn) this.l).i.h).a.a = z3 ? 1 : 0;
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void w(long j, boolean z2) {
        nat natVar = this.l;
        if (natVar != null) {
            if (!z2) {
                natVar.a(true);
            }
            this.l.f(am(), aE());
            this.af = true;
        }
        super.w(j, z2);
        if (this.l == null) {
            this.H.h();
        }
        if (z2) {
            nat natVar2 = this.l;
            if (natVar2 != null) {
                natVar2.b(false);
            } else {
                this.H.c(false);
            }
        }
        this.V = 0;
    }

    @Override // defpackage.mea
    protected final void x() {
        nat natVar = this.l;
        if (natVar == null || !this.D) {
            return;
        }
        mzs mzsVar = ((mzn) natVar).i;
        if (mzsVar.o == 2) {
            return;
        }
        lua luaVar = mzsVar.k;
        if (luaVar != null) {
            luaVar.h();
        }
        mcm mcmVar = mzsVar.v;
        if (mcmVar != null) {
            mcmVar.g();
        }
        mzsVar.m = null;
        mzsVar.o = 2;
    }

    @Override // defpackage.mrk, defpackage.mea
    protected final void y() {
        try {
            super.y();
        } finally {
            this.M = false;
            this.ad = -9223372036854775807L;
            aT();
        }
    }

    @Override // defpackage.mea
    protected final void z() {
        this.U = 0;
        eN();
        this.T = SystemClock.elapsedRealtime();
        this.W = 0L;
        this.X = 0;
        nat natVar = this.l;
        if (natVar != null) {
            ((myr) ((mzn) natVar).i.h).a.f();
        } else {
            this.H.f();
        }
    }
}
