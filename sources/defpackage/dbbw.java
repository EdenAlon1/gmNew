package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbw implements ffjm {
    final /* synthetic */ ddyq a;
    final /* synthetic */ dbby b;

    public dbbw(ddyq ddyqVar, dbby dbbyVar) {
        this.a = ddyqVar;
        this.b = dbbyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        dbby dbbyVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi d = eba.d(hvi.e, 10.0f);
            ddyq ddyqVar = this.a;
            dbby dbbyVar2 = this.b;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            jpo jpoVar = gft.d(hfdVar).f;
            dbby dbbyVar3 = dbbyVar2;
            dwjt.b("Rows by CMS Life Cycle", eba.j(hvi.e, 0.0f, 10.0f, 0.0f, 10.0f, 5), gft.a(hfdVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar, 6, 0, 65528);
            hfd hfdVar2 = hfdVar;
            fjp.a(eba.j(hvi.e, 0.0f, 0.0f, 0.0f, 10.0f, 7), 0L, 0.0f, hfdVar2, 6, 14);
            if (ddyqVar instanceof ddyo) {
                hfdVar2.v(-1189913270);
                dwjt.b("Loading", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar2, 6, 0, 131070);
                hfdVar2 = hfdVar2;
                hfdVar2.o();
            } else if (ddyqVar instanceof ddyn) {
                hfdVar2.v(-1189911313);
                Object obj3 = ((ddyn) ddyqVar).a;
                Objects.toString(obj3);
                dwjt.b("Database lookup failed: ".concat(obj3.toString()), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar2, 0, 0, 131070);
                hfdVar2 = hfdVar2;
                hfdVar2.o();
            } else {
                if (!(ddyqVar instanceof ddyp)) {
                    hfdVar2.v(-1189914833);
                    hfdVar2.o();
                    throw new ffcd();
                }
                hfdVar2.v(1767558875);
                csgg[] values = csgg.values();
                int length = values.length;
                int i3 = 0;
                while (i3 < length) {
                    csgg csggVar = values[i3];
                    ddyp ddypVar = (ddyp) ddyqVar;
                    if (((Map) ddypVar.a).containsKey(csggVar)) {
                        hfdVar2.v(-490941409);
                        Object obj4 = ((Map) ddypVar.a).get(csggVar);
                        obj4.getClass();
                        dbbyVar = dbbyVar3;
                        dbbyVar.d(csggVar, ((Number) obj4).intValue(), hfdVar2, 0);
                        hfdVar2.o();
                    } else {
                        dbbyVar = dbbyVar3;
                        hfdVar2.v(-490825531);
                        dbbyVar.d(csggVar, 0, hfdVar2, 48);
                        hfdVar2.o();
                    }
                    i3++;
                    dbbyVar3 = dbbyVar;
                }
                hfdVar2.o();
            }
            hfdVar2.n();
        }
        return ffcu.a;
    }
}
