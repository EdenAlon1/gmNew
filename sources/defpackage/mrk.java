package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mrk extends mea {
    private final ArrayDeque A;
    private final mnz B;
    private lqc C;
    private lqc D;
    private mpa E;
    private mpa F;
    private MediaCrypto G;
    private float H;
    private lqc I;
    private boolean J;
    private float K;
    private ArrayDeque L;
    private mri M;
    private boolean N;
    private boolean O;
    private long P;
    private long Q;
    private int R;
    private int S;
    private ByteBuffer T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int aa;
    private int ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private long af;
    private long ag;
    private boolean ah;
    private boolean ai;
    private mrj aj;
    private long ak;
    private boolean al;
    private final mrb j;
    private final mrm k;
    private final float l;
    public float m;
    public mrc n;
    public MediaFormat o;
    public mrf p;
    public boolean q;
    public boolean r;
    public mel s;
    public meb t;
    public mgr u;
    private final lxz v;
    private final lxz w;
    private final lxz x;
    private final mqw y;
    private final MediaCodec.BufferInfo z;

    public mrk(int i, mrb mrbVar, mrm mrmVar, float f) {
        super(i);
        this.j = mrbVar;
        lti.f(mrmVar);
        this.k = mrmVar;
        this.l = f;
        this.v = new lxz(0);
        this.w = new lxz(0);
        this.x = new lxz(2);
        mqw mqwVar = new mqw();
        this.y = mqwVar;
        this.z = new MediaCodec.BufferInfo();
        this.m = 1.0f;
        this.H = 1.0f;
        this.A = new ArrayDeque();
        this.aj = mrj.a;
        mqwVar.h(0);
        mqwVar.d.order(ByteOrder.nativeOrder());
        this.B = new mnz();
        this.K = -1.0f;
        this.Z = 0;
        this.R = -1;
        this.S = -1;
        this.Q = -9223372036854775807L;
        this.af = -9223372036854775807L;
        this.ag = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.aa = 0;
        this.ab = 0;
        this.t = new meb();
    }

    private final void aC() {
        this.X = false;
        this.y.eO();
        this.x.eO();
        this.W = false;
        this.q = false;
        this.B.a();
    }

    private final void aD() {
        if (!this.ac) {
            aG();
        } else {
            this.aa = 1;
            this.ab = 3;
        }
    }

    private final void aE() {
        try {
            mrc mrcVar = this.n;
            lti.g(mrcVar);
            mrcVar.h();
        } finally {
            ar();
        }
    }

    private final void aF() {
        int i = this.ab;
        if (i == 1) {
            aE();
            return;
        }
        if (i == 2) {
            aE();
            aM();
        } else if (i == 3) {
            aG();
        } else {
            this.r = true;
            ag();
        }
    }

    private final void aG() {
        aq();
        ao();
    }

    private final void aH() {
        this.R = -1;
        this.w.d = null;
    }

    private final void aI() {
        this.S = -1;
        this.T = null;
    }

    private final void aJ(mpa mpaVar) {
        moy.a(this.E, mpaVar);
        this.E = mpaVar;
    }

    private final void aK(mrj mrjVar) {
        this.aj = mrjVar;
        if (mrjVar.d != -9223372036854775807L) {
            this.al = true;
        }
    }

    private final void aL(mpa mpaVar) {
        moy.a(this.F, mpaVar);
        this.F = mpaVar;
    }

    private final void aM() {
        mpa mpaVar = this.F;
        lti.f(mpaVar);
        lxt b = mpaVar.b();
        if (b instanceof mpt) {
            try {
                MediaCrypto mediaCrypto = this.G;
                lti.f(mediaCrypto);
                mediaCrypto.setMediaDrmSession(((mpt) b).c);
            } catch (MediaCryptoException e) {
                throw h(e, this.C, 6006);
            }
        }
        aJ(this.F);
        this.aa = 0;
        this.ab = 0;
    }

    private final boolean aN() {
        return this.S >= 0;
    }

    private final boolean aO() {
        lti.c(this.G == null);
        mpa mpaVar = this.E;
        lxt b = mpaVar.b();
        if (mpt.a && (b instanceof mpt)) {
            int a = mpaVar.a();
            if (a == 1) {
                moz c = mpaVar.c();
                lti.f(c);
                throw h(c, this.C, c.a);
            }
            if (a != 4) {
                return false;
            }
        }
        if (b == null) {
            return mpaVar.c() != null;
        }
        try {
            this.G = new MediaCrypto(((mpt) b).b, ((mpt) b).c);
            return true;
        } catch (MediaCryptoException e) {
            throw h(e, this.C, 6006);
        }
    }

    private final boolean aP(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        lqc lqcVar = this.D;
        return (lqcVar != null && Objects.equals(lqcVar.o, "audio/opus") && ndj.d(j, j2)) ? false : true;
    }

    private final boolean aQ(int i) {
        lxz lxzVar = this.v;
        mgz j = j();
        lxzVar.eO();
        int c = c(j, this.v, i | 4);
        if (c == -5) {
            Y(j);
            return true;
        }
        if (c != -4 || !this.v.eR()) {
            return false;
        }
        this.ah = true;
        aF();
        return false;
    }

    private final boolean aR(lqc lqcVar) {
        int i = lvf.a;
        if (this.n != null && this.ab != 3 && this.c != 0) {
            float f = this.H;
            lti.f(lqcVar);
            float aj = aj(f, O());
            float f2 = this.K;
            if (f2 != aj) {
                if (aj == -1.0f) {
                    aD();
                    return false;
                }
                if (f2 != -1.0f || aj > this.l) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", aj);
                    mrc mrcVar = this.n;
                    lti.f(mrcVar);
                    mrcVar.l(bundle);
                    this.K = aj;
                }
            }
        }
        return true;
    }

    private final void aS() {
        if (!this.ac) {
            aM();
        } else {
            this.aa = 1;
            this.ab = 2;
        }
    }

    protected static boolean ay(lqc lqcVar) {
        int i = lqcVar.M;
        return i == 0 || i == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // defpackage.mea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void B(defpackage.lqc[] r13, long r14, long r16, defpackage.mtl r18) {
        /*
            r12 = this;
            mrj r13 = r12.aj
            long r0 = r13.d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            mrj r4 = new mrj
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.aK(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.A
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.af
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.ak
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            mrj r5 = new mrj
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.aK(r5)
            mrj r13 = r12.aj
            long r13 = r13.d
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.af()
        L51:
            return
        L52:
            java.util.ArrayDeque r13 = r12.A
            mrj r5 = new mrj
            long r6 = r12.af
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrk.B(lqc[], long, long, mtl):void");
    }

    @Override // defpackage.mea, defpackage.mig
    public void I(float f, float f2) {
        this.m = f;
        this.H = f2;
        aR(this.I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0330, code lost:
    
        r25.W = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0073, code lost:
    
        r25.r = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0077, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0078, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x04e8, code lost:
    
        if (r25.O != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x04ea, code lost:
    
        r25.ad = true;
        r2.n(r25.R, 0, 0, 4);
        aH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x04f8, code lost:
    
        r25.aa = 2;
        r11 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06d5  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r25v0, types: [mea, mrk] */
    /* JADX WARN: Type inference failed for: r3v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [byte[]] */
    @Override // defpackage.mig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(long r26, long r28) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrk.S(long, long):void");
    }

    @Override // defpackage.mig
    public boolean T() {
        throw null;
    }

    @Override // defpackage.mig
    public boolean U() {
        boolean d;
        if (this.C == null) {
            return false;
        }
        if (M()) {
            d = this.g;
        } else {
            mvc mvcVar = this.d;
            lti.f(mvcVar);
            d = mvcVar.d();
        }
        if (d || aN()) {
            return true;
        }
        if (this.Q == -9223372036854775807L) {
            return false;
        }
        eN();
        return SystemClock.elapsedRealtime() < this.Q;
    }

    @Override // defpackage.mij
    public final int V(lqc lqcVar) {
        try {
            return W(this.k, lqcVar);
        } catch (mrs e) {
            throw h(e, lqcVar, 4002);
        }
    }

    protected abstract int W(mrm mrmVar, lqc lqcVar);

    protected mec X(mrf mrfVar, lqc lqcVar, lqc lqcVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r3.o(r2) != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected defpackage.mec Y(defpackage.mgz r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrk.Y(mgz):mec");
    }

    protected abstract mra Z(mrf mrfVar, lqc lqcVar, MediaCrypto mediaCrypto, float f);

    protected abstract List aa(mrm mrmVar, lqc lqcVar, boolean z);

    protected void ab(lxz lxzVar) {
        throw null;
    }

    protected void ac(Exception exc) {
        throw null;
    }

    protected void ad(String str) {
        throw null;
    }

    protected void ae(lqc lqcVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void ag() {
        throw null;
    }

    protected abstract boolean ah(long j, long j2, mrc mrcVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, lqc lqcVar);

    protected boolean ai(lqc lqcVar) {
        return false;
    }

    protected float aj(float f, lqc[] lqcVarArr) {
        throw null;
    }

    protected void ak(String str, long j, long j2) {
        throw null;
    }

    protected final long al() {
        return this.aj.d;
    }

    protected final long am() {
        return this.aj.c;
    }

    protected mre an(Throwable th, mrf mrfVar) {
        return new mre(th, mrfVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(31:96|(3:190|191|(2:193|(1:195)))|98|99|100|102|103|(1:170)(1:109)|110|111|112|113|114|(2:162|163)|116|117|(1:161)(1:121)|122|(1:160)(1:136)|137|(1:139)|140|141|142|143|144|145|146|147|148|86)|(3:265|266|(45:271|218|219|220|221|222|223|224|225|226|227|(1:229)(1:251)|230|231|232|233|(1:235)|236|(1:240)|241|111|112|113|114|(0)|116|117|(1:119)|161|122|(6:124|126|128|130|132|134)|154|160|137|(0)|140|141|142|143|144|145|146|147|148|86))|232|233|(0)|236|(2:238|240)|241|111|112|113|114|(0)|116|117|(0)|161|122|(0)|154|160|137|(0)|140|141|142|143|144|145|146|147|148|86) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:(31:96|(3:190|191|(2:193|(1:195)))|98|99|100|102|103|(1:170)(1:109)|110|111|112|113|114|(2:162|163)|116|117|(1:161)(1:121)|122|(1:160)(1:136)|137|(1:139)|140|141|142|143|144|145|146|147|148|86)|(3:265|266|(45:271|218|219|220|221|222|223|224|225|226|227|(1:229)(1:251)|230|231|232|233|(1:235)|236|(1:240)|241|111|112|113|114|(0)|116|117|(1:119)|161|122|(6:124|126|128|130|132|134)|154|160|137|(0)|140|141|142|143|144|145|146|147|148|86))|226|227|(0)(0)|230|231|232|233|(0)|236|(2:238|240)|241|111|112|113|114|(0)|116|117|(0)|161|122|(0)|154|160|137|(0)|140|141|142|143|144|145|146|147|148|86) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0468, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x042d, code lost:
    
        r9 = r3;
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0432, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0433, code lost:
    
        r9 = r3;
        r8 = r18;
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x04c8, code lost:
    
        r18 = ((android.media.MediaCodec.CodecException) r14).getDiagnosticInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x04e4, code lost:
    
        r30.M = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x050a, code lost:
    
        r14 = r2;
        r15 = r3;
        r2 = r8;
        r12 = r16;
        r11 = r19;
        r9 = r20;
        r13 = r25;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x051b, code lost:
    
        throw r30.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x04e7, code lost:
    
        r30.M = new defpackage.mri(r0.getMessage(), r0.getCause(), r0.a, r0.b, r0.c, r0.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04d2, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038e A[Catch: Exception -> 0x0379, TRY_ENTER, TRY_LEAVE, TryCatch #28 {Exception -> 0x0379, blocks: (B:163:0x0363, B:119:0x038e, B:124:0x03a2, B:126:0x03aa, B:128:0x03b2, B:130:0x03ba, B:132:0x03c2, B:134:0x03ca, B:139:0x03fb, B:156:0x03df, B:158:0x03e9), top: B:162:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a2 A[Catch: Exception -> 0x0379, TRY_ENTER, TryCatch #28 {Exception -> 0x0379, blocks: (B:163:0x0363, B:119:0x038e, B:124:0x03a2, B:126:0x03aa, B:128:0x03b2, B:130:0x03ba, B:132:0x03c2, B:134:0x03ca, B:139:0x03fb, B:156:0x03df, B:158:0x03e9), top: B:162:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fb A[Catch: Exception -> 0x0379, TRY_ENTER, TRY_LEAVE, TryCatch #28 {Exception -> 0x0379, blocks: (B:163:0x0363, B:119:0x038e, B:124:0x03a2, B:126:0x03aa, B:128:0x03b2, B:130:0x03ba, B:132:0x03c2, B:134:0x03ca, B:139:0x03fb, B:156:0x03df, B:158:0x03e9), top: B:162:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0363 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x025d A[Catch: Exception -> 0x029f, all -> 0x0443, TryCatch #13 {Exception -> 0x029f, blocks: (B:233:0x023b, B:235:0x025d, B:236:0x0280, B:238:0x0291, B:240:0x0295, B:241:0x029a), top: B:232:0x023b }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02e7 A[Catch: all -> 0x0443, TryCatch #19 {all -> 0x0443, blocks: (B:100:0x0309, B:103:0x031b, B:105:0x0322, B:107:0x0328, B:110:0x0333, B:111:0x034d, B:233:0x023b, B:235:0x025d, B:236:0x0280, B:238:0x0291, B:240:0x0295, B:241:0x029a, B:246:0x02e3, B:247:0x02ea, B:250:0x02e7), top: B:99:0x0309 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[Catch: mri -> 0x053f, TryCatch #23 {mri -> 0x053f, blocks: (B:34:0x005c, B:36:0x0061, B:38:0x0068, B:40:0x0071, B:43:0x0081, B:315:0x008e, B:318:0x00a1, B:320:0x00ad, B:321:0x00cf, B:323:0x00dc, B:324:0x00e7, B:46:0x00f4, B:49:0x00fc, B:50:0x0101, B:52:0x0105, B:54:0x0117, B:327:0x00eb, B:328:0x00f3), top: B:33:0x005c, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c8 A[Catch: mri -> 0x053d, TryCatch #20 {mri -> 0x053d, blocks: (B:76:0x0490, B:78:0x04c8, B:79:0x04d4, B:81:0x04e4, B:82:0x0504, B:88:0x0519, B:89:0x051b, B:90:0x04e7, B:307:0x051c, B:309:0x0533, B:310:0x053c), top: B:47:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04e4 A[Catch: mri -> 0x053d, TryCatch #20 {mri -> 0x053d, blocks: (B:76:0x0490, B:78:0x04c8, B:79:0x04d4, B:81:0x04e4, B:82:0x0504, B:88:0x0519, B:89:0x051b, B:90:0x04e7, B:307:0x051c, B:309:0x0533, B:310:0x053c), top: B:47:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04e7 A[Catch: mri -> 0x053d, TryCatch #20 {mri -> 0x053d, blocks: (B:76:0x0490, B:78:0x04c8, B:79:0x04d4, B:81:0x04e4, B:82:0x0504, B:88:0x0519, B:89:0x051b, B:90:0x04e7, B:307:0x051c, B:309:0x0533, B:310:0x053c), top: B:47:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void ao() {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrk.ao():void");
    }

    protected void ap(long j) {
        this.ak = j;
        while (!this.A.isEmpty() && j >= ((mrj) this.A.peek()).b) {
            mrj mrjVar = (mrj) this.A.poll();
            lti.f(mrjVar);
            aK(mrjVar);
            af();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void aq() {
        try {
            mrc mrcVar = this.n;
            if (mrcVar != null) {
                mrcVar.i();
                this.t.b++;
                mrf mrfVar = this.p;
                lti.f(mrfVar);
                ad(mrfVar.a);
            }
            this.n = null;
            MediaCrypto mediaCrypto = this.G;
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
        } catch (Throwable th) {
            this.n = null;
            MediaCrypto mediaCrypto2 = this.G;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.G = null;
            aJ(null);
            as();
        }
    }

    protected void ar() {
        aH();
        aI();
        this.Q = -9223372036854775807L;
        this.ad = false;
        this.P = -9223372036854775807L;
        this.ac = false;
        this.U = false;
        this.V = false;
        this.af = -9223372036854775807L;
        this.ag = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        this.aa = 0;
        this.ab = 0;
        this.Z = this.Y ? 1 : 0;
    }

    protected final void as() {
        ar();
        this.s = null;
        this.L = null;
        this.p = null;
        this.I = null;
        this.o = null;
        this.J = false;
        this.ae = false;
        this.K = -1.0f;
        this.N = false;
        this.O = false;
        this.Y = false;
        this.Z = 0;
    }

    protected final boolean at() {
        if (this.n == null) {
            return false;
        }
        int i = this.ab;
        if (i == 3 || (this.N && !this.ae)) {
            aq();
            return true;
        }
        if (i == 2) {
            int i2 = lvf.a;
            lti.c(true);
            try {
                aM();
            } catch (mel e) {
                luj.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                aq();
                return true;
            }
        }
        aE();
        return false;
    }

    protected final boolean au(lqc lqcVar) {
        return this.F == null && ai(lqcVar);
    }

    protected boolean av(lqc lqcVar) {
        return true;
    }

    protected boolean aw(lxz lxzVar) {
        return false;
    }

    protected boolean ax(mrf mrfVar) {
        return true;
    }

    public final void az() {
        if (at()) {
            ao();
        }
    }

    @Override // defpackage.mea, defpackage.mij
    public final int e() {
        return 8;
    }

    @Override // defpackage.mea, defpackage.mic
    public void r(int i, Object obj) {
        if (i == 11) {
            mgr mgrVar = (mgr) obj;
            lti.f(mgrVar);
            this.u = mgrVar;
        }
    }

    @Override // defpackage.mea
    protected void u() {
        this.C = null;
        aK(mrj.a);
        this.A.clear();
        at();
    }

    @Override // defpackage.mea
    protected void v(boolean z, boolean z2) {
        this.t = new meb();
    }

    @Override // defpackage.mea
    protected void w(long j, boolean z) {
        this.ah = false;
        this.r = false;
        if (this.q) {
            this.y.eO();
            this.x.eO();
            this.W = false;
            this.B.a();
        } else {
            az();
        }
        lvb lvbVar = this.aj.e;
        if (lvbVar.a() > 0) {
            this.ai = true;
        }
        lvbVar.f();
        this.A.clear();
    }

    @Override // defpackage.mea
    protected void y() {
        try {
            aC();
            aq();
        } finally {
            aL(null);
        }
    }

    protected void aA() {
    }

    protected void aB() {
    }

    protected void af() {
    }
}
