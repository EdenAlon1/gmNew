package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kiu {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int[] E;
    public int F;
    public int G;
    public float H;
    public int I;
    public int J;
    public float K;
    int L;
    float M;
    public final int[] N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public final kit T;
    public final kit U;
    public final kit V;
    public final kit W;
    public final kit X;
    final kit Y;
    final kit Z;
    private boolean a;
    public final int[] aA;
    public final kit aa;
    public final kit[] ab;
    protected final ArrayList ac;
    public final boolean[] ad;
    public kiu ae;
    int af;
    public int ag;
    public float ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public float ao;
    public float ap;
    public Object aq;
    public int ar;
    public String as;
    public int at;
    public int au;
    public final float[] av;
    protected final kiu[] aw;
    protected final kiu[] ax;
    public int ay;
    public int az;
    public boolean l;
    public kjh m;
    public kjh n;
    public kjq o;
    public kjs p;
    public final boolean[] q;
    public boolean r;
    public int s;
    public int t;
    public final kif u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public kiu() {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new kif(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        kit kitVar = new kit(this, 2);
        this.T = kitVar;
        kit kitVar2 = new kit(this, 3);
        this.U = kitVar2;
        kit kitVar3 = new kit(this, 4);
        this.V = kitVar3;
        kit kitVar4 = new kit(this, 5);
        this.W = kitVar4;
        kit kitVar5 = new kit(this, 6);
        this.X = kitVar5;
        this.Y = new kit(this, 8);
        this.Z = new kit(this, 9);
        kit kitVar6 = new kit(this, 7);
        this.aa = kitVar6;
        this.ab = new kit[]{kitVar, kitVar3, kitVar2, kitVar4, kitVar5, kitVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.af = 0;
        this.ag = 0;
        this.ah = 0.0f;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new kiu[]{null, null};
        this.ax = new kiu[]{null, null};
        this.ay = -1;
        this.az = -1;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0464 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ae(defpackage.kgz r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.khe r34, defpackage.khe r35, int r36, boolean r37, defpackage.kit r38, defpackage.kit r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiu.ae(kgz, boolean, boolean, boolean, boolean, khe, khe, int, boolean, kit, kit, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private final void b() {
        this.ac.add(this.T);
        this.ac.add(this.U);
        this.ac.add(this.V);
        this.ac.add(this.W);
        this.ac.add(this.Y);
        this.ac.add(this.Z);
        this.ac.add(this.aa);
        this.ac.add(this.X);
    }

    private final boolean c(int i) {
        kit kitVar;
        kit kitVar2;
        kit[] kitVarArr = this.ab;
        int i2 = i + i;
        kit kitVar3 = kitVarArr[i2];
        kit kitVar4 = kitVar3.e;
        return (kitVar4 == null || kitVar4.e == kitVar3 || (kitVar2 = (kitVar = kitVarArr[i2 + 1]).e) == null || kitVar2.e != kitVar) ? false : true;
    }

    public final void A(int i, int i2) {
        if (this.a) {
            return;
        }
        this.T.f(i);
        this.V.f(i2);
        this.aj = i;
        this.af = i2 - i;
        this.a = true;
    }

    public final void B(int i, int i2) {
        if (this.w) {
            return;
        }
        this.U.f(i);
        this.W.f(i2);
        this.ak = i;
        this.ag = i2 - i;
        if (this.P) {
            this.X.f(i + this.al);
        }
        this.w = true;
    }

    public final void C(int i) {
        this.ag = i;
        int i2 = this.an;
        if (i < i2) {
            this.ag = i2;
        }
    }

    public final void D(int i, int i2, int i3, float f) {
        this.C = i;
        this.F = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.G = i3;
        this.H = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.C = 2;
    }

    public final void E(float f) {
        this.av[0] = f;
    }

    protected final void F(int i, boolean z) {
        this.ad[i] = z;
    }

    public final void G(int i, int i2) {
        this.R = i;
        this.S = i2;
        this.r = false;
    }

    public final void H(int i) {
        this.N[1] = i;
    }

    public final void I(int i) {
        this.N[0] = i;
    }

    public final void J(int i) {
        if (i < 0) {
            this.an = 0;
        } else {
            this.an = i;
        }
    }

    public final void K(int i) {
        if (i < 0) {
            this.am = 0;
        } else {
            this.am = i;
        }
    }

    public final void L(int i, int i2, int i3, float f) {
        this.D = i;
        this.I = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.J = i3;
        this.K = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.D = 2;
    }

    public final void M(float f) {
        this.av[1] = f;
    }

    public final void N(int i) {
        this.af = i;
        int i2 = this.am;
        if (i < i2) {
            this.af = i2;
        }
    }

    public void O(boolean z, boolean z2) {
        int i;
        int i2;
        kjq kjqVar = this.o;
        boolean z3 = z & kjqVar.h;
        kjs kjsVar = this.p;
        boolean z4 = z2 & kjsVar.h;
        int i3 = kjqVar.i.f;
        int i4 = kjsVar.i.f;
        int i5 = kjqVar.j.f;
        int i6 = kjsVar.j.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.aj = i3;
        }
        if (z4) {
            this.ak = i4;
        }
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.aA[0] == 1 && i8 < (i2 = this.af)) {
                i8 = i2;
            }
            this.af = i8;
            int i9 = this.am;
            if (i8 < i9) {
                this.af = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.aA[1] == 1 && i10 < (i = this.ag)) {
                i10 = i;
            }
            this.ag = i10;
            int i11 = this.an;
            if (i10 < i11) {
                this.ag = i11;
            }
        }
    }

    final boolean P() {
        return (this instanceof kjb) || (this instanceof kiy);
    }

    public final boolean Q(int i) {
        if (i == 0) {
            return (this.T.e != null ? 1 : 0) + (this.V.e != null ? 1 : 0) < 2;
        }
        return ((this.U.e != null ? 1 : 0) + (this.W.e != null ? 1 : 0)) + (this.X.e != null ? 1 : 0) < 2;
    }

    public final boolean R(int i, int i2) {
        kit kitVar;
        kit kitVar2;
        kit kitVar3;
        kit kitVar4;
        if (i == 0) {
            kit kitVar5 = this.T.e;
            return kitVar5 != null && kitVar5.c && (kitVar4 = (kitVar3 = this.V).e) != null && kitVar4.c && (kitVar4.a() - kitVar3.b()) - (this.T.e.a() + this.T.b()) >= i2;
        }
        kit kitVar6 = this.U.e;
        if (kitVar6 != null && kitVar6.c && (kitVar2 = (kitVar = this.W).e) != null && kitVar2.c && (kitVar2.a() - kitVar.b()) - (this.U.e.a() + this.U.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        kit kitVar = this.T;
        kit kitVar2 = kitVar.e;
        if (kitVar2 != null && kitVar2.e == kitVar) {
            return true;
        }
        kit kitVar3 = this.V;
        kit kitVar4 = kitVar3.e;
        return kitVar4 != null && kitVar4.e == kitVar3;
    }

    public final boolean T() {
        kit kitVar = this.U;
        kit kitVar2 = kitVar.e;
        if (kitVar2 != null && kitVar2.e == kitVar) {
            return true;
        }
        kit kitVar3 = this.W;
        kit kitVar4 = kitVar3.e;
        return kitVar4 != null && kitVar4.e == kitVar3;
    }

    public final boolean U() {
        return this.r && this.ar != 8;
    }

    public kit V(int i) {
        switch (i - 1) {
            case 1:
                return this.T;
            case 2:
                return this.U;
            case 3:
                return this.V;
            case 4:
                return this.W;
            case 5:
                return this.X;
            case 6:
                return this.aa;
            case 7:
                return this.Y;
            default:
                return this.Z;
        }
    }

    public final int W(int i) {
        return i == 0 ? X() : Y();
    }

    public final int X() {
        return this.aA[0];
    }

    public final int Y() {
        return this.aA[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0171, code lost:
    
        if (r11 == 4) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r11, defpackage.kiu r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiu.Z(int, kiu, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r13 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03fd, code lost:
    
        if (r4 == (-1)) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x02ef, code lost:
    
        if (r4 == 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r45.w != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0157, code lost:
    
        if (r45.w != false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x059b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027b  */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.kgz r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiu.a(kgz, boolean):void");
    }

    public final void aa(int i, kiu kiuVar, int i2, int i3, int i4) {
        V(i).n(kiuVar.V(i2), i3, i4, true);
    }

    public final void ab(int i) {
        this.aA[0] = i;
    }

    public final void ac(int i) {
        this.aA[1] = i;
    }

    public void ad(boolean z) {
        int i;
        kjs kjsVar;
        kjq kjqVar;
        int o = kgz.o(this.T);
        int o2 = kgz.o(this.U);
        int o3 = kgz.o(this.V);
        int o4 = kgz.o(this.W);
        if (z && (kjqVar = this.o) != null) {
            kjk kjkVar = kjqVar.i;
            if (kjkVar.i) {
                kjk kjkVar2 = kjqVar.j;
                if (kjkVar2.i) {
                    o = kjkVar.f;
                    o3 = kjkVar2.f;
                }
            }
        }
        if (z && (kjsVar = this.p) != null) {
            kjk kjkVar3 = kjsVar.i;
            if (kjkVar3.i) {
                kjk kjkVar4 = kjsVar.j;
                if (kjkVar4.i) {
                    o2 = kjkVar3.f;
                    o4 = kjkVar4.f;
                }
            }
        }
        if (o3 - o < 0 || o4 - o2 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        this.aj = o;
        this.ak = o2;
        if (this.ar == 8) {
            this.af = 0;
            this.ag = 0;
            return;
        }
        int i2 = o3 - o;
        int[] iArr = this.aA;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.af;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = o4 - o2;
        if (iArr[1] == 1 && i5 < (i = this.ag)) {
            i5 = i;
        }
        this.af = i2;
        this.ag = i5;
        int i6 = this.an;
        if (i5 < i6) {
            this.ag = i6;
        }
        int i7 = this.am;
        if (i2 < i7) {
            this.af = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.G;
        if (i8 > 0 && i3 == 3) {
            this.af = Math.min(i7, i8);
        }
        int i9 = this.J;
        if (i9 > 0 && this.aA[1] == 3) {
            this.ag = Math.min(this.ag, i9);
        }
        int i10 = this.af;
        if (i2 != i10) {
            this.s = i10;
        }
        int i11 = this.ag;
        if (i5 != i11) {
            this.t = i11;
        }
    }

    public boolean ay() {
        return this.ar != 8;
    }

    public boolean e() {
        if (this.a) {
            return true;
        }
        return this.T.c && this.V.c;
    }

    public boolean f() {
        if (this.w) {
            return true;
        }
        return this.U.c && this.W.c;
    }

    public final int g() {
        return l() + this.ag;
    }

    public final int h() {
        if (this.ar == 8) {
            return 0;
        }
        return this.ag;
    }

    public final int i() {
        return k() + this.af;
    }

    public final int j() {
        if (this.ar == 8) {
            return 0;
        }
        return this.af;
    }

    public final int k() {
        kiu kiuVar = this.ae;
        return (kiuVar == null || !(kiuVar instanceof kiv)) ? this.aj : ((kiv) kiuVar).g + this.aj;
    }

    public final int l() {
        kiu kiuVar = this.ae;
        return (kiuVar == null || !(kiuVar instanceof kiv)) ? this.ak : ((kiv) kiuVar).h + this.ak;
    }

    public final kiu m(int i) {
        kit kitVar;
        kit kitVar2;
        if (i == 0) {
            kit kitVar3 = this.V;
            kitVar2 = kitVar3.e;
            if (kitVar2 == null || kitVar2.e != kitVar3) {
                return null;
            }
        } else if (i != 1 || (kitVar2 = (kitVar = this.W).e) == null || kitVar2.e != kitVar) {
            return null;
        }
        return kitVar2.d;
    }

    public final kiu n(int i) {
        kit kitVar;
        kit kitVar2;
        if (i == 0) {
            kit kitVar3 = this.T;
            kitVar2 = kitVar3.e;
            if (kitVar2 == null || kitVar2.e != kitVar3) {
                return null;
            }
        } else if (i != 1 || (kitVar2 = (kitVar = this.U).e) == null || kitVar2.e != kitVar) {
            return null;
        }
        return kitVar2.d;
    }

    public final kjv o(int i) {
        if (i == 0) {
            return this.o;
        }
        if (i == 1) {
            return this.p;
        }
        return null;
    }

    public final void p(kiv kivVar, kgz kgzVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            kja.a(kivVar, kgzVar, this);
            hashSet.remove(this);
            a(kgzVar, kivVar.aj(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.T.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((kit) it.next()).d.p(kivVar, kgzVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.V.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((kit) it2.next()).d.p(kivVar, kgzVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.U.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((kit) it3.next()).d.p(kivVar, kgzVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.W.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((kit) it4.next()).d.p(kivVar, kgzVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.X.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((kit) it5.next()).d.p(kivVar, kgzVar, hashSet, 1, true);
            }
        }
    }

    public final void q(kit kitVar, kit kitVar2, int i) {
        if (kitVar.d == this) {
            Z(kitVar.i, kitVar2.d, kitVar2.i, i);
        }
    }

    public final void r(kiu kiuVar, float f, int i) {
        aa(7, kiuVar, 7, i, 0);
        this.O = f;
    }

    public final void s(kgz kgzVar) {
        kgzVar.b(this.T);
        kgzVar.b(this.U);
        kgzVar.b(this.V);
        kgzVar.b(this.W);
        if (this.al > 0) {
            kgzVar.b(this.X);
        }
    }

    public final void t() {
        if (this.o == null) {
            this.o = new kjq(this);
        }
        if (this.p == null) {
            this.p = new kjs(this);
        }
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.as != null) {
            str = "id: " + this.as + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.aj);
        sb.append(", ");
        sb.append(this.ak);
        sb.append(") - (");
        sb.append(this.af);
        sb.append(" x ");
        sb.append(this.ag);
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.T.e();
        this.U.e();
        this.V.e();
        this.W.e();
        this.X.e();
        this.Y.e();
        this.Z.e();
        this.aa.e();
        this.ae = null;
        this.O = Float.NaN;
        this.af = 0;
        this.ag = 0;
        this.ah = 0.0f;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        int[] iArr = this.aA;
        iArr[0] = 1;
        iArr[1] = 1;
        this.aq = null;
        this.ar = 0;
        this.at = 0;
        this.au = 0;
        float[] fArr = this.av;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.z = -1;
        this.A = -1;
        int[] iArr2 = this.N;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.C = 0;
        this.D = 0;
        this.H = 1.0f;
        this.K = 1.0f;
        this.G = Alert.DURATION_SHOW_INDEFINITELY;
        this.J = Alert.DURATION_SHOW_INDEFINITELY;
        this.F = 0;
        this.I = 0;
        this.L = -1;
        this.M = 1.0f;
        boolean[] zArr = this.q;
        zArr[0] = true;
        zArr[1] = true;
        this.Q = false;
        boolean[] zArr2 = this.ad;
        zArr2[0] = false;
        zArr2[1] = false;
        this.r = true;
        int[] iArr3 = this.E;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.s = -1;
        this.t = -1;
    }

    public final void v() {
        kiu kiuVar = this.ae;
        if (kiuVar != null && (kiuVar instanceof kiv)) {
        }
        int size = this.ac.size();
        for (int i = 0; i < size; i++) {
            ((kit) this.ac.get(i)).e();
        }
    }

    public final void w() {
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        int size = this.ac.size();
        for (int i = 0; i < size; i++) {
            kit kitVar = (kit) this.ac.get(i);
            kitVar.c = false;
            kitVar.b = 0;
        }
    }

    public void x(kgy kgyVar) {
        this.T.m();
        this.U.m();
        this.V.m();
        this.W.m();
        this.X.m();
        this.aa.m();
        this.Y.m();
        this.Z.m();
    }

    public final void y(int i) {
        this.al = i;
        this.P = i > 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0089 -> B:31:0x008a). Please report as a decompilation issue!!! */
    public final void z(String str) {
        int i;
        float f;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            this.ah = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        if (indexOf <= 0 || indexOf >= length - 1) {
            i = -1;
        } else {
            String substring = str.substring(0, indexOf);
            r4 = indexOf + 1;
            i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r4);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = i2;
        } else {
            String substring3 = str.substring(r4, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = i2;
        }
        i2 = (f > i2 ? 1 : (f == i2 ? 0 : -1));
        if (i2 > 0) {
            this.ah = f;
            this.ai = i;
        }
    }

    public kiu(int i, int i2) {
        this.l = false;
        this.o = null;
        this.p = null;
        this.q = new boolean[]{true, true};
        this.r = true;
        this.s = -1;
        this.t = -1;
        this.u = new kif(this);
        this.a = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = new int[2];
        this.F = 0;
        this.G = 0;
        this.H = 1.0f;
        this.I = 0;
        this.J = 0;
        this.K = 1.0f;
        this.L = -1;
        this.M = 1.0f;
        this.N = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.O = Float.NaN;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        kit kitVar = new kit(this, 2);
        this.T = kitVar;
        kit kitVar2 = new kit(this, 3);
        this.U = kitVar2;
        kit kitVar3 = new kit(this, 4);
        this.V = kitVar3;
        kit kitVar4 = new kit(this, 5);
        this.W = kitVar4;
        kit kitVar5 = new kit(this, 6);
        this.X = kitVar5;
        this.Y = new kit(this, 8);
        this.Z = new kit(this, 9);
        kit kitVar6 = new kit(this, 7);
        this.aa = kitVar6;
        this.ab = new kit[]{kitVar, kitVar3, kitVar2, kitVar4, kitVar5, kitVar6};
        this.ac = new ArrayList();
        this.ad = new boolean[2];
        this.aA = new int[]{1, 1};
        this.ae = null;
        this.ah = 0.0f;
        this.ai = -1;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.ar = 0;
        this.as = null;
        this.at = 0;
        this.au = 0;
        this.av = new float[]{-1.0f, -1.0f};
        this.aw = new kiu[]{null, null};
        this.ax = new kiu[]{null, null};
        this.ay = -1;
        this.az = -1;
        this.af = i;
        this.ag = i2;
        b();
    }
}
