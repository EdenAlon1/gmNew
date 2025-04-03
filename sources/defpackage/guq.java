package defpackage;

import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guq extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ gks b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guq(ffjm ffjmVar, gks gksVar, ffjm ffjmVar2) {
        super(2);
        this.a = ffjmVar;
        this.b = gksVar;
        this.c = ffjmVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi j;
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            jpo a2 = gvu.a(hec.a, hfdVar);
            gvu.a(hec.b, hfdVar);
            jpo a3 = gvu.a(hec.c, hfdVar);
            hvi i = eba.i(hvi.e, gvc.a, 0.0f, 2);
            ffjm ffjmVar = this.a;
            gks gksVar = this.b;
            ffjm ffjmVar2 = this.c;
            dxq dxqVar = dxu.c;
            int i2 = huo.a;
            ipn a4 = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a5 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, i);
            int i3 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a4, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar3);
            }
            hlc.b(hfdVar, b, iss.c);
            hfdVar.v(-449829309);
            hfdVar.o();
            hve hveVar = hvi.e;
            if (ffjmVar == null) {
                j = eba.i(hveVar, 0.0f, 4.0f, 1);
            } else {
                float f = gvc.b;
                j = eba.j((!Float.isNaN(f) ? dwz.a(imt.a, f, 0.0f, 4) : hvi.e).a(!Float.isNaN(Float.NaN) ? dwz.a(imt.b, 0.0f, Float.NaN, 2) : hvi.e), 0.0f, 0.0f, 0.0f, gvc.c, 7);
            }
            ipn a6 = dyc.a(hum.a, false);
            int a7 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b2 = huz.b(hfdVar, j);
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a6, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a7))) {
                Integer valueOf2 = Integer.valueOf(a7);
                hfdVar.y(valueOf2);
                hfdVar.h(valueOf2, ffjmVar4);
            }
            hlc.b(hfdVar, b2, iss.c);
            hfz.b(new hil[]{fzc.a.c(new ibw(gksVar.b)), grl.a.c(a3)}, ffjmVar2, hfdVar, 8);
            hfdVar.n();
            if (ffjmVar == null) {
                hfdVar.v(-449098081);
            } else {
                hfdVar.v(-449098080);
                a = hvi.e.a(new SizeElement(0.0f, 1 == (r11 & 1) ? Float.NaN : gvc.d, 0.0f, (r11 & 2) != 0 ? Float.NaN : 0.0f, false, 5));
                hvi j2 = eba.j(a, 0.0f, 0.0f, 0.0f, gvc.e, 7);
                ipn a8 = dyc.a(hum.a, false);
                int a9 = hey.a(hfdVar);
                hgb c3 = hfdVar.c();
                hvi b3 = huz.b(hfdVar, j2);
                ffix ffixVar3 = iss.a;
                hfdVar.M();
                hfdVar.x();
                if (hfdVar.H()) {
                    hfdVar.j(ffixVar3);
                } else {
                    hfdVar.z();
                }
                hlc.b(hfdVar, a8, iss.e);
                hlc.b(hfdVar, c3, iss.d);
                ffjm ffjmVar5 = iss.f;
                if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a9))) {
                    Integer valueOf3 = Integer.valueOf(a9);
                    hfdVar.y(valueOf3);
                    hfdVar.h(valueOf3, ffjmVar5);
                }
                hlc.b(hfdVar, b3, iss.c);
                hfz.b(new hil[]{fzc.a.c(new ibw(gksVar.d)), grl.a.c(a2)}, ffjmVar, hfdVar, 8);
                hfdVar.n();
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
