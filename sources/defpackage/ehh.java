package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehh implements dsg {
    public static final hrh a = hqn.a(egz.a, eha.a);
    public boolean b;
    public egm c;
    public final egt d;
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
    public final efe q;
    public final dwn r;
    private final dsg s;
    private int t;
    private boolean u;
    private final hho v;
    private final hho w;
    private final ehb x;

    public ehh() {
        this(0, 0, new efe(null));
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

    public final egf d() {
        return (egf) this.e.a();
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
            boolean r0 = r8 instanceof defpackage.ehe
            if (r0 == 0) goto L13
            r0 = r8
            ehe r0 = (defpackage.ehe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ehe r0 = new ehe
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
            ehh r2 = r0.e
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehh.e(dhy, ffjm, ffgu):java.lang.Object");
    }

    public final void f(egm egmVar, boolean z, boolean z2) {
        egn egnVar;
        int i;
        egn egnVar2;
        if (!z && this.b) {
            this.c = egmVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.f -= egmVar.d;
        this.e.b(egmVar);
        egp egpVar = egmVar.a;
        this.w.b(Boolean.valueOf(((egpVar == null || egpVar.a == 0) && egmVar.b == 0) ? false : true));
        this.v.b(Boolean.valueOf(egmVar.c));
        if (z2) {
            egt egtVar = this.d;
            int i2 = egmVar.b;
            if (i2 < 0.0f) {
                dwv.d("scrollOffset should be non-negative");
            }
            egtVar.d(i2);
        } else {
            egt egtVar2 = this.d;
            egp egpVar2 = egmVar.a;
            Object obj = null;
            if (egpVar2 != null && (egnVar2 = (egn) ffdo.H(egpVar2.b)) != null) {
                obj = egnVar2.b;
            }
            egtVar2.b = obj;
            if (egtVar2.a || egmVar.j > 0) {
                egtVar2.a = true;
                int i3 = egmVar.b;
                if (i3 < 0.0f) {
                    dwv.d("scrollOffset should be non-negative (" + i3 + ')');
                }
                egp egpVar3 = egmVar.a;
                egtVar2.e((egpVar3 == null || (egnVar = (egn) ffdo.H(egpVar3.b)) == null) ? 0 : egnVar.a, i3);
            }
            if (this.u) {
                efe efeVar = this.q;
                if (efeVar.a != -1 && !egmVar.i.isEmpty()) {
                    if (efeVar.c) {
                        egn egnVar3 = (egn) ffdx.P(egmVar.i);
                        i = (egmVar.k == dqs.a ? egnVar3.k : egnVar3.l) + 1;
                    } else {
                        egn egnVar4 = (egn) ffdx.K(egmVar.i);
                        i = (egmVar.k == dqs.a ? egnVar4.k : egnVar4.l) - 1;
                    }
                    if (efeVar.a != i) {
                        efeVar.a = -1;
                        hne hneVar = efeVar.b;
                        Object[] objArr = hneVar.a;
                        int i4 = hneVar.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ((ekg) objArr[i5]).a();
                        }
                        efeVar.b.g();
                    }
                }
            }
        }
        if (z) {
            this.p.b(egmVar.e, egmVar.g, egmVar.f);
        }
        this.t++;
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

    /* JADX WARN: Finally extract failed */
    public final void j(float f, egf egfVar) {
        int i;
        int i2;
        boolean z;
        ekg a2;
        if (this.u) {
            efe efeVar = this.q;
            ehb ehbVar = this.x;
            if (egfVar.i().isEmpty()) {
                return;
            }
            boolean z2 = f < 0.0f;
            if (z2) {
                egn egnVar = (egn) ffdx.P(egfVar.i());
                i2 = (egfVar.h() == dqs.a ? egnVar.k : egnVar.l) + 1;
                i = ((egn) ffdx.P(egfVar.i())).a + 1;
            } else {
                egn egnVar2 = (egn) ffdx.K(egfVar.i());
                int i3 = egfVar.h() == dqs.a ? egnVar2.k : egnVar2.l;
                i = ((egn) ffdx.K(egfVar.i())).a - 1;
                i2 = i3 - 1;
            }
            if (i < 0 || i >= egfVar.d()) {
                return;
            }
            if (i2 == efeVar.a || i2 < 0) {
                z = z2;
            } else {
                if (efeVar.c != z2) {
                    hne hneVar = efeVar.b;
                    Object[] objArr = hneVar.a;
                    int i4 = hneVar.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((ekg) objArr[i5]).a();
                    }
                }
                efeVar.c = z2;
                efeVar.a = i2;
                efeVar.b.g();
                hne hneVar2 = efeVar.b;
                ArrayList arrayList = new ArrayList();
                ehh ehhVar = ehbVar.a;
                hrw a3 = hrv.a();
                ffji k = a3 != null ? a3.k() : null;
                hrw b = hrv.b(a3);
                try {
                    egm egmVar = ehhVar.b ? ehhVar.c : (egm) ehhVar.e.a();
                    if (egmVar != null) {
                        List list = (List) egmVar.h.invoke(Integer.valueOf(i2));
                        int size = list.size();
                        int i6 = 0;
                        while (i6 < size) {
                            ffcf ffcfVar = (ffcf) list.get(i6);
                            ehh ehhVar2 = ehhVar;
                            boolean z3 = z2;
                            a2 = ehhVar.l.a(((Number) ffcfVar.a).intValue(), ((jzk) ffcfVar.b).a, null);
                            arrayList.add(a2);
                            i6++;
                            z2 = z3;
                            ehhVar = ehhVar2;
                        }
                    }
                    z = z2;
                    hrv.e(a3, b, k);
                    hneVar2.p(hneVar2.b, arrayList);
                } catch (Throwable th) {
                    hrv.e(a3, b, k);
                    throw th;
                }
            }
            if (!z) {
                if (egfVar.f() - dvf.a((egn) ffdx.K(egfVar.i()), egfVar.h()) < f) {
                    hne hneVar3 = efeVar.b;
                    Object[] objArr2 = hneVar3.a;
                    int i7 = hneVar3.b;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((ekg) objArr2[i8]).b();
                    }
                    return;
                }
                return;
            }
            egn egnVar3 = (egn) ffdx.P(egfVar.i());
            if (((dvf.a(egnVar3, egfVar.h()) + ((int) (egfVar.h() == dqs.a ? egnVar3.i & 4294967295L : egnVar3.i >> 32))) + egfVar.c()) - egfVar.e() < (-f)) {
                hne hneVar4 = efeVar.b;
                Object[] objArr3 = hneVar4.a;
                int i9 = hneVar4.b;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((ekg) objArr3[i10]).b();
                }
            }
        }
    }

    public ehh(int i, int i2) {
        this(i, i2, new efe(null));
    }

    public ehh(int i, int i2, efe efeVar) {
        this.q = efeVar;
        this.d = new egt(i, i2);
        this.e = new hic(ehl.a, hhs.a);
        this.r = new dwn();
        this.s = new dne(new ehg(this));
        this.u = true;
        this.h = new ehd(this);
        this.i = new ehr();
        this.j = new LazyLayoutItemAnimator();
        this.k = new eia();
        this.l = new ekh(new ehc(i));
        this.x = new ehb(this);
        this.m = new ekd();
        this.n = new hic(ffcu.a, hhs.a);
        this.o = new hic(ffcu.a, hhs.a);
        this.v = new hic(false, hla.a);
        this.w = new hic(false, hla.a);
        this.p = new ekl();
    }
}
