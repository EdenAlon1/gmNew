package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddx extends isz implements ixl, ijb, ixn, ixv {
    public static final ddk a = new ddk();
    private long A;
    private boolean B;
    private final Object C;
    private dwn D;
    public boolean b;
    public ffix c;
    public ilx d;
    public dwp e;
    public dwk f;
    public final coc g;
    public dwn h;
    private dhf i;
    private String j;
    private jjj k;
    private final dgh l;
    private isw o;

    public ddx(dwn dwnVar, dhf dhfVar, boolean z, String str, jjj jjjVar, ffix ffixVar) {
        this.h = dwnVar;
        this.i = dhfVar;
        this.j = str;
        this.k = jjjVar;
        this.b = z;
        this.c = ffixVar;
        this.l = new dgh(this.h, 0, new ddo(this));
        int i = cnk.a;
        this.g = new coc((byte[]) null);
        this.A = 0L;
        this.D = this.h;
        this.B = A();
        this.C = a;
    }

    private final boolean A() {
        return this.D == null && this.i != null;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ long a() {
        return ixt.a;
    }

    public abstract Object b(ild ildVar, ffgu ffguVar);

    @Override // defpackage.hvh
    public final /* synthetic */ void dL() {
        ixk.a(this);
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        jjj jjjVar = this.k;
        if (jjjVar != null) {
            jkr.q(jkvVar, jjjVar.a);
        }
        jkr.h(jkvVar, this.j, new ddl(this));
        if (this.b) {
            this.l.dO(jkvVar);
        } else {
            jkr.c(jkvVar);
        }
        g(jkvVar);
    }

    @Override // defpackage.hvh
    public final void dT() {
        if (!this.B) {
            j();
        }
        if (this.b) {
            M(this.l);
        }
    }

    @Override // defpackage.ixl
    public final void dU() {
        dwk dwkVar;
        dwn dwnVar = this.h;
        if (dwnVar != null && (dwkVar = this.f) != null) {
            dwnVar.b(new dwl(dwkVar));
        }
        this.f = null;
        ilx ilxVar = this.d;
        if (ilxVar != null) {
            ilxVar.dU();
        }
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        long b = kag.b(j);
        this.A = (Float.floatToRawIntBits(kaa.b(b)) & 4294967295L) | (Float.floatToRawIntBits(kaa.a(b)) << 32);
        j();
        if (this.b && ikkVar == ikk.b) {
            int i = ikiVar.e;
            if (ikm.a(i, 4)) {
                ffqy.d(D(), null, null, new ddu(this, null), 3);
            } else if (ikm.a(i, 5)) {
                ffqy.d(D(), null, null, new ddv(this, null), 3);
            }
        }
        if (this.d == null) {
            ddw ddwVar = new ddw(this);
            iki ikiVar2 = ilv.a;
            imf imfVar = new imf(null, null, null, ddwVar);
            M(imfVar);
            this.d = imfVar;
        }
        ilx ilxVar = this.d;
        if (ilxVar != null) {
            ilxVar.dV(ikiVar, ikkVar, j);
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.ixv
    public final Object e() {
        return this.C;
    }

    @Override // defpackage.ixn
    public final boolean ea() {
        return true;
    }

    protected final Object f(dqt dqtVar, long j, ffgu ffguVar) {
        Object a2;
        dwn dwnVar = this.h;
        return (dwnVar == null || (a2 = ffsl.a(new ddq(dqtVar, j, dwnVar, this, null), ffguVar)) != ffhh.a) ? ffcu.a : a2;
    }

    public final void i() {
        int i;
        dwn dwnVar = this.h;
        if (dwnVar != null) {
            dwp dwpVar = this.e;
            if (dwpVar != null) {
                dwnVar.b(new dwo(dwpVar));
            }
            dwk dwkVar = this.f;
            if (dwkVar != null) {
                dwnVar.b(new dwl(dwkVar));
            }
            coc cocVar = this.g;
            Object[] objArr = cocVar.c;
            long[] jArr = cocVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                dwnVar.b(new dwo((dwp) objArr[(i2 << 3) + i4]));
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.e = null;
        this.f = null;
        this.g.e();
    }

    public final void j() {
        dhf dhfVar;
        if (this.o == null && (dhfVar = this.i) != null) {
            if (this.h == null) {
                this.h = new dwn();
            }
            this.l.k(this.h);
            dwn dwnVar = this.h;
            dwnVar.getClass();
            isw a2 = dhfVar.a(dwnVar);
            M(a2);
            this.o = a2;
        }
    }

    protected abstract boolean s(KeyEvent keyEvent);

    @Override // defpackage.hvh
    public final void t() {
        i();
        if (this.D == null) {
            this.h = null;
        }
        isw iswVar = this.o;
        if (iswVar != null) {
            L(iswVar);
        }
        this.o = null;
    }

    @Override // defpackage.ijb
    public final boolean u(KeyEvent keyEvent) {
        boolean z;
        j();
        long b = iiz.b(keyEvent);
        if (this.b && iiy.a(iiz.a(keyEvent), 2) && dfb.a(keyEvent)) {
            if (this.g.b(b)) {
                z = false;
            } else {
                dwp dwpVar = new dwp(this.A);
                this.g.f(b, dwpVar);
                if (this.h != null) {
                    ffqy.d(D(), null, null, new dds(this, dwpVar, null), 3);
                }
                z = true;
            }
            return s(keyEvent) || z;
        }
        if (!this.b || !iiy.a(iiz.a(keyEvent), 1) || !dfb.a(keyEvent)) {
            return false;
        }
        dwp dwpVar2 = (dwp) this.g.d(b);
        if (dwpVar2 != null) {
            if (this.h != null) {
                ffqy.d(D(), null, null, new ddt(this, dwpVar2, null), 3);
            }
            z(keyEvent);
        }
        return dwpVar2 != null;
    }

    @Override // defpackage.ijb
    public final boolean v(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r2.o == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r4 = r2.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r3 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        r2.l.k(r2.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        L(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r2.o = null;
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        if (r1 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.dwn r3, defpackage.dhf r4, boolean r5, java.lang.String r6, defpackage.jjj r7, defpackage.ffix r8) {
        /*
            r2 = this;
            dwn r0 = r2.D
            boolean r0 = defpackage.ffkj.e(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.i()
            r2.D = r3
            r2.h = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            dhf r0 = r2.i
            boolean r0 = defpackage.ffkj.e(r0, r4)
            if (r0 != 0) goto L1e
            r2.i = r4
            goto L1f
        L1e:
            r1 = r3
        L1f:
            boolean r3 = r2.b
            if (r3 == r5) goto L38
            if (r5 == 0) goto L2b
            dgh r3 = r2.l
            r2.M(r3)
            goto L33
        L2b:
            dgh r3 = r2.l
            r2.L(r3)
            r2.i()
        L33:
            defpackage.ixo.a(r2)
            r2.b = r5
        L38:
            java.lang.String r3 = r2.j
            boolean r3 = defpackage.ffkj.e(r3, r6)
            if (r3 != 0) goto L45
            r2.j = r6
            defpackage.ixo.a(r2)
        L45:
            jjj r3 = r2.k
            boolean r3 = defpackage.ffkj.e(r3, r7)
            if (r3 != 0) goto L52
            r2.k = r7
            defpackage.ixo.a(r2)
        L52:
            r2.c = r8
            boolean r3 = r2.B
            boolean r4 = r2.A()
            if (r3 == r4) goto L69
            boolean r3 = r2.A()
            r2.B = r3
            if (r3 != 0) goto L69
            isw r4 = r2.o
            if (r4 != 0) goto L69
            goto L6b
        L69:
            if (r1 == 0) goto L7c
        L6b:
            isw r4 = r2.o
            if (r4 != 0) goto L71
            if (r3 != 0) goto L7c
        L71:
            if (r4 == 0) goto L76
            r2.L(r4)
        L76:
            r3 = 0
            r2.o = r3
            r2.j()
        L7c:
            dgh r3 = r2.l
            dwn r4 = r2.h
            r3.k(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddx.x(dwn, dhf, boolean, java.lang.String, jjj, ffix):void");
    }

    protected abstract void z(KeyEvent keyEvent);

    protected void k() {
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }

    public void g(jkv jkvVar) {
    }
}
