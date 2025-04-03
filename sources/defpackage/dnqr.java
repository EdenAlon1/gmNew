package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqr implements ffjm {
    final /* synthetic */ dnsh a;
    final /* synthetic */ ffix b;
    final /* synthetic */ iir c;
    final /* synthetic */ hho d;
    final /* synthetic */ boolean e;
    final /* synthetic */ hho f;
    final /* synthetic */ float g;
    final /* synthetic */ ffjn h;

    public dnqr(dnsh dnshVar, ffix ffixVar, iir iirVar, hho hhoVar, boolean z, hho hhoVar2, float f, ffjn ffjnVar) {
        this.a = dnshVar;
        this.b = ffixVar;
        this.c = iirVar;
        this.d = hhoVar;
        this.e = z;
        this.f = hhoVar2;
        this.g = f;
        this.h = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi hviVar;
        hvi b;
        final ffji ffjiVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            kah kahVar = (kah) hfdVar.e(jdr.j);
            hfdVar.v(248218997);
            dnsh dnshVar = this.a;
            boolean z = dnrv.o(dnshVar) && !dnrv.v(dnshVar, hfdVar);
            hfdVar.o();
            if (z) {
                hfdVar.v(-895066044);
                hvi b2 = dnrv.b(hvi.e, this.a, this.b, this.c);
                ffcu ffcuVar = ffcu.a;
                hfdVar.v(248224530);
                boolean D = hfdVar.D(this.a) | hfdVar.D(this.d) | hfdVar.D(kahVar) | hfdVar.F(this.c);
                dnsh dnshVar2 = this.a;
                hho hhoVar = this.d;
                iir iirVar = this.c;
                hho hhoVar2 = this.f;
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    dnqq dnqqVar = new dnqq(dnshVar2, hhoVar, kahVar, iirVar, hhoVar2);
                    hfdVar.y(dnqqVar);
                    f = dnqqVar;
                }
                hfdVar.o();
                hviVar = ilv.a(b2, ffcuVar, (PointerInputEventHandler) f);
                hfdVar.o();
            } else if (this.a.f != dnor.b) {
                hfdVar.v(-894716116);
                dnsh dnshVar3 = this.a;
                boolean z2 = this.e;
                hho hhoVar3 = this.d;
                hvi hviVar2 = hvi.e;
                kah kahVar2 = (kah) hfdVar.e(jdr.j);
                iir iirVar2 = this.c;
                hfdVar.v(248239252);
                final hho hhoVar4 = this.f;
                Object f2 = hfdVar.f();
                if (f2 == hfc.a) {
                    f2 = new ffji() { // from class: dnqo
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            hho.this.b(Float.valueOf(dnrv.a(((Float) obj3).floatValue())));
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f2);
                }
                ffji ffjiVar2 = (ffji) f2;
                hfdVar.o();
                hfdVar.v(-1376984276);
                ffix ffixVar = dnshVar3.v;
                if (ffixVar == null) {
                    hfdVar.o();
                } else {
                    Object[] objArr = {dnshVar3.f, hhoVar3, dnshVar3.a};
                    hfdVar.v(-916413233);
                    boolean D2 = hfdVar.D(hhoVar3) | hfdVar.D(ffixVar) | hfdVar.D(kahVar2) | hfdVar.D(dnshVar3) | hfdVar.E(z2) | hfdVar.F(iirVar2);
                    Object f3 = hfdVar.f();
                    if (D2 || f3 == hfc.a) {
                        f3 = new dnrm(hhoVar3, ffjiVar2, ffixVar, kahVar2, dnshVar3, z2, iirVar2);
                        hfdVar.y(f3);
                    }
                    hfdVar.o();
                    hviVar2 = ilv.c(hviVar2, objArr, (PointerInputEventHandler) f3);
                    hfdVar.o();
                }
                hviVar = dnrv.b(hviVar2, this.a, this.b, this.c);
                hfdVar.o();
            } else {
                hfdVar.v(-894332398);
                hfdVar.o();
                hviVar = hvi.e;
            }
            dnsh dnshVar4 = this.a;
            fffs fffsVar = new fffs((byte[]) null);
            String str = dnshVar4.u;
            if (str != null && (ffjiVar = dnshVar4.t) != null) {
                fffsVar.add(new jjf(str, new ffix() { // from class: dnpk
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffji.this.invoke(dnse.b);
                        return true;
                    }
                }));
            }
            final List a = ffdx.a(fffsVar);
            if (!a.isEmpty()) {
                hviVar = jjs.c(hviVar, false, new ffji() { // from class: dnpl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        jkv jkvVar = (jkv) obj3;
                        jkvVar.getClass();
                        List list = a;
                        jkr.l(jkvVar, list.subList(0, Math.min(((fffs) list).c, 32)));
                        return ffcu.a;
                    }
                });
            }
            dnsh dnshVar5 = this.a;
            hho hhoVar5 = this.f;
            float f4 = this.g;
            ffjn ffjnVar = this.h;
            hvi b3 = dlsj.b(hviVar);
            ipn a2 = dyc.a(dnsi.e(dnshVar5), false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b4 = huz.b(hfdVar, b3);
            int i = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b4, iss.c);
            boolean z3 = f4 != 0.0f;
            dyi dyiVar = dyi.a;
            dnrv.k(dyiVar, dnshVar5, hhoVar5, z3, hfdVar, 390);
            dnrv.i(dyiVar, dnshVar5, hfdVar, 6);
            if (dnshVar5.B.a) {
                int i2 = dnshVar5.D - 1;
                b = i2 != 0 ? i2 != 1 ? ebs.d(hvi.e, 1.0f) : eao.b(hvi.e, 1) : eao.b(hvi.e, 2);
            } else {
                b = dnshVar5.i ? eao.b(hvi.e, 2) : eao.b(hvi.e, 1);
            }
            dxq dxqVar = dxu.c;
            int i3 = huo.a;
            ipn a4 = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a5 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b5 = huz.b(hfdVar, b);
            ffix ffixVar3 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar3);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar2);
            }
            hlc.b(hfdVar, b5, iss.c);
            dys dysVar = dys.a;
            dnrv.l(dnshVar5, hfdVar, 0);
            ffjnVar.a(dysVar, hfdVar, 6);
            hfdVar.n();
            hfdVar.n();
            dnsh dnshVar6 = this.a;
            if (dnshVar6.f == dnor.a) {
                dnrv.m(dnshVar6, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
