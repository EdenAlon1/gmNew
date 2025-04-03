package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kiv extends kjc {
    final kjg a;
    kis[] aB;
    public int aC;
    public boolean aD;
    public boolean aE;
    public WeakReference aF;
    public WeakReference aG;
    public WeakReference aH;
    public WeakReference aI;
    final HashSet aJ;
    public final kje aK;
    public final kjj b;
    public int c;
    public kjf d;
    public boolean e;
    public final kgz f;
    int g;
    int h;
    public int i;
    public int j;
    kis[] k;

    public kiv() {
        this.a = new kjg(this);
        this.b = new kjj(this);
        this.d = null;
        this.e = false;
        this.f = new kgz();
        this.i = 0;
        this.j = 0;
        this.k = new kis[4];
        this.aB = new kis[4];
        this.aC = 257;
        this.aD = false;
        this.aE = false;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = null;
        this.aJ = new HashSet();
        this.aK = new kje();
    }

    public static void al(kiu kiuVar, kjf kjfVar, kje kjeVar) {
        int i;
        int i2;
        if (kjfVar == null) {
            return;
        }
        if (kiuVar.ar == 8 || (kiuVar instanceof kiy) || (kiuVar instanceof kiq)) {
            kjeVar.c = 0;
            kjeVar.d = 0;
            return;
        }
        kjeVar.i = kiuVar.X();
        kjeVar.j = kiuVar.Y();
        kjeVar.a = kiuVar.j();
        kjeVar.b = kiuVar.h();
        kjeVar.g = false;
        kjeVar.h = 0;
        boolean z = kjeVar.i == 3;
        boolean z2 = kjeVar.j == 3;
        boolean z3 = z && kiuVar.ah > 0.0f;
        boolean z4 = z2 && kiuVar.ah > 0.0f;
        if (z && kiuVar.Q(0) && kiuVar.C == 0 && !z3) {
            kjeVar.i = 2;
            if (z2 && kiuVar.D == 0) {
                kjeVar.i = 1;
            }
            z = false;
        }
        if (z2 && kiuVar.Q(1) && kiuVar.D == 0 && !z4) {
            kjeVar.j = 2;
            if (z && kiuVar.C == 0) {
                kjeVar.j = 1;
            }
            z2 = false;
        }
        if (kiuVar.e()) {
            kjeVar.i = 1;
            z = false;
        }
        if (kiuVar.f()) {
            kjeVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (kiuVar.E[0] == 4) {
                kjeVar.i = 1;
            } else if (!z2) {
                if (kjeVar.j == 1) {
                    i2 = kjeVar.b;
                } else {
                    kjeVar.i = 2;
                    kjfVar.b(kiuVar, kjeVar);
                    i2 = kjeVar.d;
                }
                kjeVar.i = 1;
                kjeVar.a = (int) (kiuVar.ah * i2);
            }
        }
        if (z4) {
            if (kiuVar.E[1] == 4) {
                kjeVar.j = 1;
            } else if (!z) {
                if (kjeVar.i == 1) {
                    i = kjeVar.a;
                } else {
                    kjeVar.j = 2;
                    kjfVar.b(kiuVar, kjeVar);
                    i = kjeVar.c;
                }
                kjeVar.j = 1;
                float f = i;
                if (kiuVar.ai == -1) {
                    kjeVar.b = (int) (f / kiuVar.ah);
                } else {
                    kjeVar.b = (int) (kiuVar.ah * f);
                }
            }
        }
        kjfVar.b(kiuVar, kjeVar);
        kiuVar.N(kjeVar.c);
        kiuVar.C(kjeVar.d);
        kiuVar.P = kjeVar.f;
        kiuVar.y(kjeVar.e);
        kjeVar.h = 0;
        boolean z5 = kjeVar.g;
    }

    private final void ap(kit kitVar, khe kheVar) {
        kgz kgzVar = this.f;
        kgzVar.g(kheVar, kgzVar.b(kitVar), 0, 5);
    }

    private final void aq(kit kitVar, khe kheVar) {
        kgz kgzVar = this.f;
        kgzVar.g(kgzVar.b(kitVar), kheVar, 0, 5);
    }

    private final void ar() {
        this.i = 0;
        this.j = 0;
    }

    @Override // defpackage.kiu
    public final void O(boolean z, boolean z2) {
        super.O(z, z2);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((kiu) this.aL.get(i)).O(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x095e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x096d A[LOOP:14: B:250:0x096b->B:251:0x096d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x05a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x05c8  */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // defpackage.kjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ae() {
        /*
            Method dump skipped, instructions count: 2649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiv.ae():void");
    }

    public final void af(kjf kjfVar) {
        this.d = kjfVar;
        this.b.f = kjfVar;
    }

    public final void ag(int i) {
        this.aC = i;
        kgz.a = aj(512);
    }

    public final void ah() {
        this.a.a(this);
    }

    public final boolean ai(boolean z, int i) {
        boolean z2;
        boolean z3;
        kjj kjjVar = this.b;
        boolean z4 = false;
        int W = kjjVar.a.W(0);
        int W2 = kjjVar.a.W(1);
        int k = kjjVar.a.k();
        int l = kjjVar.a.l();
        if (z) {
            if (W != 2) {
                if (W2 == 2) {
                    W2 = 2;
                }
            }
            ArrayList arrayList = kjjVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = true;
                    break;
                }
                kjv kjvVar = (kjv) arrayList.get(i2);
                if (kjvVar.g == i && !kjvVar.e()) {
                    z3 = false;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                if (z3 && W == 2) {
                    kjjVar.a.ab(1);
                    kiv kivVar = kjjVar.a;
                    kivVar.N(kjjVar.a(kivVar, 0));
                    kiv kivVar2 = kjjVar.a;
                    kivVar2.o.f.c(kivVar2.j());
                }
            } else if (z3 && W2 == 2) {
                kjjVar.a.ac(1);
                kiv kivVar3 = kjjVar.a;
                kivVar3.C(kjjVar.a(kivVar3, 1));
                kiv kivVar4 = kjjVar.a;
                kivVar4.p.f.c(kivVar4.h());
            }
        }
        if (i == 0) {
            kiv kivVar5 = kjjVar.a;
            int i3 = kivVar5.aA[0];
            if (i3 == 1 || i3 == 4) {
                int j = kivVar5.j() + k;
                kivVar5.o.j.c(j);
                kjjVar.a.o.f.c(j - k);
                z2 = true;
            }
            z2 = false;
        } else {
            kiv kivVar6 = kjjVar.a;
            int i4 = kivVar6.aA[1];
            if (i4 == 1 || i4 == 4) {
                int h = kivVar6.h() + l;
                kivVar6.p.j.c(h);
                kjjVar.a.p.f.c(h - l);
                z2 = true;
            }
            z2 = false;
        }
        kjjVar.c();
        ArrayList arrayList2 = kjjVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            kjv kjvVar2 = (kjv) arrayList2.get(i5);
            if (kjvVar2.g == i && (kjvVar2.d != kjjVar.a || kjvVar2.h)) {
                kjvVar2.c();
            }
        }
        ArrayList arrayList3 = kjjVar.e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z4 = true;
                break;
            }
            kjv kjvVar3 = (kjv) arrayList3.get(i6);
            if (kjvVar3.g == i && ((z2 || kjvVar3.d != kjjVar.a) && (!kjvVar3.i.i || !kjvVar3.j.i || (!(kjvVar3 instanceof kjh) && !kjvVar3.f.i)))) {
                break;
            }
            i6++;
        }
        kjjVar.a.ab(W);
        kjjVar.a.ac(W2);
        return z4;
    }

    public final boolean aj(int i) {
        return (this.aC & i) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x03d1, code lost:
    
        if (r11 != 3) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ak(int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kiv.ak(int, int, int, int, int, int, int):void");
    }

    final void b(kiu kiuVar, int i) {
        if (i == 0) {
            int i2 = this.i + 1;
            kis[] kisVarArr = this.aB;
            int length = kisVarArr.length;
            if (i2 >= length) {
                this.aB = (kis[]) Arrays.copyOf(kisVarArr, length + length);
            }
            kis[] kisVarArr2 = this.aB;
            int i3 = this.i;
            kisVarArr2[i3] = new kis(kiuVar, 0, this.e);
            this.i = i3 + 1;
            return;
        }
        int i4 = this.j + 1;
        kis[] kisVarArr3 = this.k;
        int length2 = kisVarArr3.length;
        if (i4 >= length2) {
            this.k = (kis[]) Arrays.copyOf(kisVarArr3, length2 + length2);
        }
        kis[] kisVarArr4 = this.k;
        int i5 = this.j;
        kisVarArr4[i5] = new kis(kiuVar, 1, this.e);
        this.j = i5 + 1;
    }

    public final void c() {
        this.b.b = true;
    }

    @Override // defpackage.kjc, defpackage.kiu
    public final void u() {
        this.f.k();
        this.g = 0;
        this.h = 0;
        super.u();
    }

    public kiv(byte[] bArr) {
        super(null);
        this.a = new kjg(this);
        this.b = new kjj(this);
        this.d = null;
        this.e = false;
        this.f = new kgz();
        this.i = 0;
        this.j = 0;
        this.k = new kis[4];
        this.aB = new kis[4];
        this.aC = 257;
        this.aD = false;
        this.aE = false;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aI = null;
        this.aJ = new HashSet();
        this.aK = new kje();
    }
}
