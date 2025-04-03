package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isg extends hvh implements itu, itg, ixn, ixl, irt, irw, ixi, its, iti, hyk, hzg, hzl, iwy, hxi {
    public hvg a;
    public boolean b;
    public final HashSet c;
    public ioc d;
    private irl e;

    public isg(hvg hvgVar) {
        this.q = iwk.a(hvgVar);
        this.a = hvgVar;
        this.b = true;
        this.c = new HashSet();
    }

    @Override // defpackage.iwy
    public final boolean A() {
        return this.z;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ long a() {
        return ixt.a;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        return ((ion) hvgVar).i(ipqVar, iplVar, j);
    }

    @Override // defpackage.hxi
    public final long c() {
        return kag.d(isx.e(this, 128).c);
    }

    @Override // defpackage.hvh
    public final void dL() {
        if (this.a instanceof ili) {
            dU();
        }
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        int i;
        char c;
        hvg hvgVar = this.a;
        hvgVar.getClass();
        jjn f = ((jjr) hvgVar).f();
        jkvVar.getClass();
        jjn jjnVar = (jjn) jkvVar;
        if (f.b) {
            jjnVar.b = true;
        }
        if (f.c) {
            jjnVar.c = true;
        }
        cop copVar = f.a;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
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
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        jku jkuVar = (jku) obj;
                        if (!jjnVar.a.g(jkuVar)) {
                            jjnVar.a.e(jkuVar, obj2);
                        } else if (obj2 instanceof jjb) {
                            Object f2 = jjnVar.a.f(jkuVar);
                            f2.getClass();
                            cop copVar2 = jjnVar.a;
                            jjb jjbVar = (jjb) f2;
                            c = '\b';
                            String str = jjbVar.a;
                            if (str == null) {
                                str = ((jjb) obj2).a;
                            }
                            ffbv ffbvVar = jjbVar.b;
                            if (ffbvVar == null) {
                                ffbvVar = ((jjb) obj2).b;
                            }
                            copVar2.e(jkuVar, new jjb(str, ffbvVar));
                            j >>= c;
                            i4++;
                        }
                    }
                    c = '\b';
                    j >>= c;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.hyk
    public final void dP(hzo hzoVar) {
        hvg hvgVar = this.a;
        if (!(hvgVar instanceof hyi)) {
            imn.c("onFocusEvent called on wrong node");
        }
        ((hyi) hvgVar).d();
    }

    @Override // defpackage.iti
    public final void dQ(ioc iocVar) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        ehr ehrVar = (ehr) hvgVar;
        if (ehrVar.a) {
            return;
        }
        ehrVar.a = true;
        ffgu ffguVar = ehrVar.b;
        if (ffguVar != null) {
            ffguVar.w(ffcu.a);
        }
        ehrVar.b = null;
    }

    @Override // defpackage.hvh
    public final void dT() {
        v(true);
    }

    @Override // defpackage.ixl
    public final void dU() {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        ilh ilhVar = (ilh) ((ili) hvgVar).c;
        if (ilhVar.c == 2) {
            ili iliVar = ilhVar.b;
            long uptimeMillis = SystemClock.uptimeMillis();
            ilg ilgVar = new ilg(iliVar);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            ilgVar.invoke(obtain);
            obtain.recycle();
            ilhVar.b();
        }
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        ilh ilhVar = (ilh) ((ili) hvgVar).c;
        boolean z = ilhVar.b.b;
        List list = ikiVar.a;
        boolean z2 = true;
        if (!z) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z2 = false;
                    break;
                }
                iku ikuVar = (iku) list.get(i);
                if (ikj.d(ikuVar) || ikj.f(ikuVar)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (ilhVar.c != 3) {
            if (ikkVar == ikk.a && z2) {
                ilhVar.a(ikiVar);
            }
            if (ikkVar == ikk.c && !z2) {
                ilhVar.a(ikiVar);
            }
        }
        if (ikkVar == ikk.c) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!ikj.f((iku) list.get(i2))) {
                    return;
                }
            }
            ilhVar.b();
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    @Override // defpackage.its
    public final void dY(ioc iocVar) {
        this.d = iocVar;
        hvg hvgVar = this.a;
        if (hvgVar instanceof ipz) {
            ((ipz) hvgVar).d();
        }
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        return ((ion) hvgVar).e(inyVar, inxVar, i);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }

    @Override // defpackage.ixi
    public final Object eb(Object obj) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        return ((iqg) hvgVar).d();
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        return ((ion) hvgVar).f(inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        return ((ion) hvgVar).g(inyVar, inxVar, i);
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        return ((ion) hvgVar).h(inyVar, inxVar, i);
    }

    @Override // defpackage.its
    public final void i(long j) {
        hvg hvgVar = this.a;
        if (hvgVar instanceof iqc) {
            ((iqc) hvgVar).d();
        }
    }

    @Override // defpackage.hxi
    public final jzn j() {
        return isx.d(this).s;
    }

    @Override // defpackage.hxi
    public final kah k() {
        return isx.d(this).t;
    }

    @Override // defpackage.hzg
    public final void p(hzc hzcVar) {
        hvg hvgVar = this.a;
        if (!(hvgVar instanceof hyt)) {
            imn.c("applyFocusProperties called on wrong node");
        }
        ((hyt) hvgVar).d();
    }

    @Override // defpackage.irt
    public final irr q() {
        irl irlVar = this.e;
        return irlVar != null ? irlVar : irm.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.irw
    public final Object r(irn irnVar) {
        ivu ivuVar;
        this.c.add(irnVar);
        if (!this.p.z) {
            imn.c("visitAncestors called on an unattached node");
        }
        hvh hvhVar = this.p.s;
        iui d = isx.d(this);
        while (d != null) {
            if ((d.x.e.r & 32) != 0) {
                while (hvhVar != null) {
                    if ((hvhVar.q & 32) != 0) {
                        isz iszVar = hvhVar;
                        ?? r4 = 0;
                        while (iszVar != 0) {
                            if (iszVar instanceof irt) {
                                irt irtVar = (irt) iszVar;
                                if (irtVar.q().c(irnVar)) {
                                    return irtVar.q().a(irnVar);
                                }
                            } else if ((iszVar.q & 32) != 0 && (iszVar instanceof isz)) {
                                hvh hvhVar2 = iszVar.n;
                                int i = 0;
                                iszVar = iszVar;
                                r4 = r4;
                                while (hvhVar2 != null) {
                                    if ((hvhVar2.q & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            iszVar = hvhVar2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new hne(new hvh[16]);
                                            }
                                            if (iszVar != 0) {
                                                r4.n(iszVar);
                                            }
                                            r4.n(hvhVar2);
                                            iszVar = 0;
                                        }
                                    }
                                    hvhVar2 = hvhVar2.t;
                                    iszVar = iszVar;
                                    r4 = r4;
                                }
                                if (i != 1) {
                                }
                            }
                            iszVar = isx.a(r4);
                        }
                    }
                    hvhVar = hvhVar.s;
                }
            }
            d = d.u();
            hvhVar = (d == null || (ivuVar = d.x) == null) ? null : ivuVar.d;
        }
        return irnVar.a.invoke();
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        hxr hxrVar = (hxr) hvgVar;
        if (this.b && (hvgVar instanceof hxq)) {
            ((AndroidComposeView) isx.f(this)).v.d(this, isk.b, new ise(hvgVar));
            this.b = false;
        }
        hxrVar.d(ifoVar);
    }

    @Override // defpackage.hvh
    public final void t() {
        x();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.itg
    public final void u() {
        this.b = true;
        ith.a(this);
    }

    public final void v(boolean z) {
        if (!this.z) {
            imn.c("initializeModifier called on unattached node");
        }
        hvg hvgVar = this.a;
        if ((this.q & 32) != 0) {
            if (hvgVar instanceof iro) {
                isx.f(this).y(new isc(this));
            }
            if (hvgVar instanceof irv) {
                irv irvVar = (irv) hvgVar;
                irl irlVar = this.e;
                if (irlVar == null || !irlVar.c(irvVar.j())) {
                    this.e = new irl(irvVar);
                    if (isk.a(this)) {
                        irq irqVar = ((AndroidComposeView) isx.f(this)).H;
                        irx j = irvVar.j();
                        irqVar.a.n(this);
                        irqVar.b.n(j);
                        irqVar.a();
                    }
                } else {
                    irlVar.a = irvVar;
                    irq irqVar2 = ((AndroidComposeView) isx.f(this)).H;
                    irx j2 = irvVar.j();
                    irqVar2.a.n(this);
                    irqVar2.b.n(j2);
                    irqVar2.a();
                }
            }
        }
        if ((this.q & 4) != 0) {
            if (hvgVar instanceof hxq) {
                this.b = true;
            }
            if (!z) {
                itz.a(this);
            }
        }
        if ((this.q & 2) != 0) {
            if (isk.a(this)) {
                iwi iwiVar = this.v;
                iwiVar.getClass();
                ((itx) iwiVar).H(this);
                iwiVar.al();
            }
            if (!z) {
                itz.a(this);
                isx.d(this).S();
            }
        }
        if (hvgVar instanceof iqo) {
            ((iqo) hvgVar).d(isx.d(this));
        }
        if ((this.q & 128) != 0) {
            if ((hvgVar instanceof iqc) && isk.a(this)) {
                isx.d(this).S();
            }
            if (hvgVar instanceof ipz) {
                this.d = null;
                if (isk.a(this)) {
                    iwx f = isx.f(this);
                    AndroidComposeView androidComposeView = (AndroidComposeView) f;
                    androidComposeView.y.f.n(new isd(this));
                    androidComposeView.ab(null);
                }
            }
        }
        if ((this.q & 256) != 0 && (hvgVar instanceof ehr) && isk.a(this)) {
            isx.d(this).S();
        }
        if (hvgVar instanceof hzj) {
            ((hzj) hvgVar).d().d.n(this);
        }
        int i = this.q;
        if ((i & 16) != 0 && (hvgVar instanceof ili)) {
            ((ili) hvgVar).c.a = this.v;
        }
        if ((i & 8) != 0) {
            isx.f(this).x();
        }
    }

    @Override // defpackage.ixl
    public final boolean w() {
        hvg hvgVar = this.a;
        hvgVar.getClass();
        return true;
    }

    public final void x() {
        if (!this.z) {
            imn.c("unInitializeModifier called on unattached node");
        }
        hvg hvgVar = this.a;
        if ((this.q & 32) != 0) {
            if (hvgVar instanceof irv) {
                irq irqVar = ((AndroidComposeView) isx.f(this)).H;
                irx j = ((irv) hvgVar).j();
                irqVar.c.n(isx.d(this));
                irqVar.d.n(j);
                irqVar.a();
            }
            if (hvgVar instanceof iro) {
                ((iro) hvgVar).d(isk.a);
            }
        }
        if ((this.q & 8) != 0) {
            isx.f(this).x();
        }
        if (hvgVar instanceof hzj) {
            ((hzj) hvgVar).d().d.m(this);
        }
    }

    @Override // defpackage.ixl
    public final void y() {
        hvg hvgVar = this.a;
        hvgVar.getClass();
    }

    public final void z() {
        if (this.z) {
            this.c.clear();
            ((AndroidComposeView) isx.f(this)).v.d(this, isk.c, new isf(this));
        }
    }
}
