package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvu implements ffjm {
    final /* synthetic */ ahvn a;

    public ahvu(ahvn ahvnVar) {
        this.a = ahvnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi b;
        hvi d;
        hvi b2;
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            b = ebs.b(hvi.e, 1.0f);
            ahvn ahvnVar = this.a;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b3 = huz.b(hfdVar, b);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
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
            hlc.b(hfdVar, b3, iss.c);
            dotb dotbVar = ahvnVar.d;
            hfdVar.v(1376684126);
            ahvm ahvmVar = ahvnVar.e;
            hfdVar.o();
            doti.b(dotbVar, null, null, null, false, hfdVar, 0, 30);
            List list = ahvnVar.b;
            ahvm ahvmVar2 = ahvnVar.e;
            aidb.a(list, true, hfdVar, 48, 0);
            d = ebs.d(hvi.e, 1.0f);
            b2 = dys.b(d, 1.0f, true);
            ahvm ahvmVar3 = ahvnVar.e;
            hfdVar.v(-271815478);
            long j = gft.a(hfdVar).p;
            hfdVar.o();
            a = dee.a(b2, j, idb.a);
            ebv.a(a, hfdVar);
            ahwa.a(ahvnVar.c, hfdVar, 0);
            hfdVar.n();
            ahvv.a(this.a.d.b.k, hfdVar, 0);
        }
        return ffcu.a;
    }
}
