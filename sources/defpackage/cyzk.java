package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyzk implements ffjo {
    final /* synthetic */ eot a;
    final /* synthetic */ List b;
    final /* synthetic */ jzn c;
    final /* synthetic */ hho d;
    final /* synthetic */ boolean e;
    final /* synthetic */ czai f;

    public cyzk(eot eotVar, List list, jzn jznVar, hho hhoVar, boolean z, czai czaiVar) {
        this.a = eotVar;
        this.b = list;
        this.c = jznVar;
        this.d = hhoVar;
        this.e = z;
        this.f = czaiVar;
    }

    public static final float b(hho hhoVar) {
        return ((Number) hhoVar.a()).floatValue();
    }

    public static final long c(hho hhoVar) {
        return ((iak) hhoVar.a()).a;
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hvi d;
        hvi a;
        final int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((eoc) obj).getClass();
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f);
        }
        final ffsk ffskVar = (ffsk) f;
        hfdVar.v(-260652190);
        boolean F = ((((intValue2 & 112) ^ 48) > 32 && hfdVar.B(intValue)) || (intValue2 & 48) == 32) | hfdVar.F(ffskVar) | hfdVar.D(this.a) | hfdVar.F(this.b);
        final eot eotVar = this.a;
        final List list = this.b;
        Object f2 = hfdVar.f();
        if (F || f2 == hfc.a) {
            f2 = new ffix() { // from class: cyzd
                @Override // defpackage.ffix
                public final Object invoke() {
                    axol.k(ffsk.this, null, new cyzj(eotVar, intValue, list, null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f2);
        }
        final ffix ffixVar = (ffix) f2;
        hfdVar.o();
        d = ebs.d(hvi.e, 1.0f);
        hvi x = ebs.x(ebs.u(d, 0.0f, 400.0f, 1), 0.0f, 400.0f, 1);
        hfdVar.v(-260641378);
        boolean D = hfdVar.D(this.c);
        final jzn jznVar = this.c;
        final hho hhoVar = this.d;
        Object f3 = hfdVar.f();
        if (D || f3 == hfc.a) {
            f3 = new ffji() { // from class: cyze
                @Override // defpackage.ffji
                public final Object invoke(Object obj5) {
                    hhoVar.b(new jzq(ffln.b(((int) (((kaf) obj5).a >> 32)) / jzn.this.ec())));
                    return ffcu.a;
                }
            };
            hfdVar.y(f3);
        }
        hfdVar.o();
        hvi a2 = iqd.a(x, (ffji) f3);
        int i = huo.a;
        List list2 = this.b;
        boolean z = this.e;
        czai czaiVar = this.f;
        ipn a3 = dyc.a(hum.e, false);
        int a4 = hey.a(hfdVar);
        hgb c = hfdVar.c();
        hvi b = huz.b(hfdVar, a2);
        int i2 = ist.a;
        ffix ffixVar2 = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar2);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a3, iss.e);
        hlc.b(hfdVar, c, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a4))) {
            Integer valueOf = Integer.valueOf(a4);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar, b, iss.c);
        hfdVar.v(-253851674);
        Object f4 = hfdVar.f();
        if (f4 == hfc.a) {
            hic hicVar = new hic(Float.valueOf(1.0f), hla.a);
            hfdVar.y(hicVar);
            f4 = hicVar;
        }
        final hho hhoVar2 = (hho) f4;
        hfdVar.o();
        hfdVar.v(-253850033);
        Object f5 = hfdVar.f();
        if (f5 == hfc.a) {
            hic hicVar2 = new hic(new iak(0L), hla.a);
            hfdVar.y(hicVar2);
            f5 = hicVar2;
        }
        final hho hhoVar3 = (hho) f5;
        hfdVar.o();
        if (!z) {
            intValue = (intValue + 1) % list2.size();
        }
        dnym dnymVar = ((czai) list2.get(intValue)).a;
        hfdVar.v(-253836047);
        hvi hviVar = hvi.e;
        if (list2.size() < 2) {
            hve hveVar = hvi.e;
            ffcu ffcuVar = ffcu.a;
            hfdVar.v(900353015);
            Object f6 = hfdVar.f();
            if (f6 == hfc.a) {
                f6 = new cyzi(hhoVar2, hhoVar3);
                hfdVar.y(f6);
            }
            hfdVar.o();
            hvi a5 = ilv.a(hveVar, ffcuVar, (PointerInputEventHandler) f6);
            hfdVar.v(900381607);
            Object f7 = hfdVar.f();
            if (f7 == hfc.a) {
                f7 = new ffji() { // from class: cyzf
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj5) {
                        idd iddVar = (idd) obj5;
                        iddVar.getClass();
                        hho hhoVar4 = hho.this;
                        iddVar.x(cyzk.b(hhoVar4));
                        iddVar.y(cyzk.b(hhoVar4));
                        hho hhoVar5 = hhoVar3;
                        iddVar.D(Float.intBitsToFloat((int) (cyzk.c(hhoVar5) >> 32)));
                        iddVar.E(Float.intBitsToFloat((int) (cyzk.c(hhoVar5) & 4294967295L)));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f7);
            }
            hfdVar.o();
            hviVar = icf.a(a5, (ffji) f7);
        }
        hfdVar.o();
        hfdVar.v(-253798181);
        boolean D2 = hfdVar.D(ffixVar);
        Object f8 = hfdVar.f();
        if (D2 || f8 == hfc.a) {
            f8 = new ffix() { // from class: cyzg
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffix.this.invoke();
                    return ffcu.a;
                }
            };
            hfdVar.y(f8);
        }
        hfdVar.o();
        a = dlsj.a(jfw.a(dfb.d(hviVar, false, null, (ffix) f8, 7), "monogram"), czaiVar.c, true);
        dnxw.j(dnymVar, a, hfdVar, 0);
        hfdVar.n();
        return ffcu.a;
    }
}
