package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eey implements dsg {
    public static final hrh a = hqn.a(eeo.a, eep.a);
    public boolean b;
    public eeh c;
    public final eem d;
    public final hho e;
    public float f;
    public iqn g;
    public final iqo h;
    public final ehr i;
    public final LazyLayoutItemAnimator j;
    public final eia k;
    public final ekh l;
    public final ekd m;
    public final hho n;
    public final hho o;
    public final ekl p;
    public final dwn q;
    public final edd r;
    private final dsg s;
    private int t;
    private boolean u;
    private final hho v;
    private final hho w;
    private final ees x;

    public eey() {
        this(0, 0, new edd(null));
    }

    public static /* synthetic */ Object n(eey eeyVar, int i, ffgu ffguVar) {
        Object e;
        e = eeyVar.e(dhy.a, new eew(eeyVar, i, null), ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }

    @Override // defpackage.dsg
    public final float a(float f) {
        return this.s.a(f);
    }

    public final int b() {
        return this.d.a();
    }

    public final int c() {
        return this.d.b();
    }

    public final eea d() {
        return (eea) this.e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8.e(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dhy r6, defpackage.ffjm r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.eev
            if (r0 == 0) goto L13
            r0 = r8
            eev r0 = (defpackage.eev) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eev r0 = new eev
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            dhy r6 = r0.f
            eey r2 = r0.e
            defpackage.ffci.b(r8)
            goto L50
        L3c:
            defpackage.ffci.b(r8)
            ehr r8 = r5.i
            r0.e = r5
            r0.f = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L65
            r2 = r5
        L50:
            dsg r8 = r2.s
            r2 = 0
            r0.e = r2
            r0.f = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L62
            goto L65
        L62:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eey.e(dhy, ffjm, ffgu):java.lang.Object");
    }

    public final jzn f() {
        return ((eeh) this.e.a()).g;
    }

    @Override // defpackage.dsg
    public final boolean g() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean h() {
        return ((Boolean) this.v.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean i() {
        return this.s.i();
    }

    public final Object j(int i, int i2, ffgu ffguVar) {
        Object e;
        e = e(dhy.a, new eeq(this, i, i2, null), ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }

    public final void k(eeh eehVar, boolean z, boolean z2) {
        if (!z && this.b) {
            this.c = eehVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        eei eeiVar = eehVar.a;
        this.w.b(Boolean.valueOf(((eeiVar == null || eeiVar.a == 0) && eehVar.b == 0) ? false : true));
        this.v.b(Boolean.valueOf(eehVar.c));
        this.f -= eehVar.d;
        this.e.b(eehVar);
        if (z2) {
            eem eemVar = this.d;
            int i = eehVar.b;
            if (i < 0.0f) {
                dwv.d("scrollOffset should be non-negative");
            }
            eemVar.d(i);
        } else {
            eem eemVar2 = this.d;
            eei eeiVar2 = eehVar.a;
            eemVar2.b = eeiVar2 != null ? eeiVar2.d : null;
            if (eemVar2.a || eehVar.k > 0) {
                eemVar2.a = true;
                int i2 = eehVar.b;
                if (i2 < 0.0f) {
                    dwv.d("scrollOffset should be non-negative");
                }
                eei eeiVar3 = eehVar.a;
                eemVar2.e(eeiVar3 != null ? eeiVar3.a : 0, i2);
            }
            if (this.u) {
                edd eddVar = this.r;
                if (eddVar.a != -1 && !eehVar.i.isEmpty()) {
                    if (eddVar.a != (eddVar.c ? ((eei) ffdx.P(eehVar.i)).a + 1 : ((eei) ffdx.K(eehVar.i)).a - 1)) {
                        eddVar.a = -1;
                        ekg ekgVar = eddVar.b;
                        if (ekgVar != null) {
                            ekgVar.a();
                        }
                        eddVar.b = null;
                    }
                }
            }
        }
        if (z) {
            this.p.b(eehVar.e, eehVar.g, eehVar.f);
        }
        this.t++;
    }

    public final void l(float f, eea eeaVar) {
        ekg ekgVar;
        ekg ekgVar2;
        ekg ekgVar3;
        if (this.u) {
            edd eddVar = this.r;
            ees eesVar = this.x;
            if (eeaVar.i().isEmpty()) {
                return;
            }
            boolean z = f < 0.0f;
            int i = z ? ((eei) ffdx.P(eeaVar.i())).a + 1 : ((eei) ffdx.K(eeaVar.i())).a - 1;
            if (i < 0 || i >= eeaVar.d()) {
                return;
            }
            if (i != eddVar.a) {
                if (eddVar.c != z && (ekgVar3 = eddVar.b) != null) {
                    ekgVar3.a();
                }
                eddVar.c = z;
                eddVar.a = i;
                eey eeyVar = eesVar.a;
                hrw a2 = hrv.a();
                ffji k = a2 != null ? a2.k() : null;
                hrw b = hrv.b(a2);
                try {
                    eeh eehVar = (eeh) eeyVar.e.a();
                    hrv.e(a2, b, k);
                    eddVar.b = eesVar.a.l.a(i, eehVar.h, new eer());
                } catch (Throwable th) {
                    hrv.e(a2, b, k);
                    throw th;
                }
            }
            if (!z) {
                if (eeaVar.f() - ((eei) ffdx.K(eeaVar.i())).g >= f || (ekgVar = eddVar.b) == null) {
                    return;
                }
                ekgVar.b();
                return;
            }
            eei eeiVar = (eei) ffdx.P(eeaVar.i());
            if (((eeiVar.g + eeiVar.h) + eeaVar.c()) - eeaVar.e() >= (-f) || (ekgVar2 = eddVar.b) == null) {
                return;
            }
            ekgVar2.b();
        }
    }

    public final void o(int i, int i2) {
        if (this.d.a() != i || this.d.b() != i2) {
            this.j.c();
        }
        eem eemVar = this.d;
        eemVar.e(i, i2);
        eemVar.b = null;
        iqn iqnVar = this.g;
        if (iqnVar != null) {
            iqnVar.h();
        }
    }

    public eey(int i, int i2) {
        this(i, i2, new edd(null));
    }

    public eey(int i, int i2, edd eddVar) {
        this.r = eddVar;
        this.d = new eem(i, i2);
        this.e = new hic(efb.a, hhs.a);
        this.q = new dwn();
        this.s = new dne(new eex(this));
        this.u = true;
        this.h = new eeu(this);
        this.i = new ehr();
        this.j = new LazyLayoutItemAnimator();
        this.k = new eia();
        this.l = new ekh(new eet(i));
        this.x = new ees(this);
        this.m = new ekd();
        this.n = new hic(ffcu.a, hhs.a);
        this.v = new hic(false, hla.a);
        this.w = new hic(false, hla.a);
        this.o = new hic(ffcu.a, hhs.a);
        this.p = new ekl();
    }
}
