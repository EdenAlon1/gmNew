package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmje implements ffjo {
    final /* synthetic */ dmjg a;

    public dmje(dmjg dmjgVar) {
        this.a = dmjgVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hvi b;
        gwd gwdVar = (gwd) obj;
        int intValue = ((Number) obj2).intValue();
        hfd hfdVar = (hfd) obj3;
        ((Number) obj4).intValue();
        gwdVar.getClass();
        dmjb dmjbVar = (dmjb) this.a.a.get(intValue);
        hvi d = dfb.d(hvi.e, false, null, dmjbVar.c(), 7);
        eqd eqdVar = gft.c(hfdVar).e;
        hfdVar.v(440683050);
        hfdVar.v(152582312);
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        boolean D = hfdVar.D(gwdVar.a) | hfdVar.D(jznVar);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new eqi(new gwc(gwdVar, eqdVar, jznVar));
            hfdVar.y(f);
        }
        hfdVar.o();
        hvi a = hxo.a(d, (eqi) f);
        hfdVar.o();
        int i = huo.a;
        ipn a2 = dyc.a(hum.a, false);
        int a3 = hey.a(hfdVar);
        hgb c = hfdVar.c();
        hvi b2 = huz.b(hfdVar, a);
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
        hlc.b(hfdVar, b2, iss.c);
        dyi dyiVar = dyi.a;
        b = ebs.b(hvi.e, 1.0f);
        Uri a4 = dmjbVar.a();
        String b3 = dmjbVar.b();
        int i3 = inp.a;
        dnac.a(a4, b3, b, null, null, null, ino.a, null, 0.0f, null, null, null, null, null, null, null, hfdVar, 12583296, 0, 524152);
        hfdVar.v(-1334536640);
        if (dmjbVar instanceof dmja) {
            dwho.a(dnaa.a(dmzz.cW, hfdVar), null, dyiVar.a(ebs.k(hvi.e, 24.0f), hum.e), ibw.d, hfdVar, 3072, 0);
        }
        hfdVar.o();
        hfdVar.n();
        return ffcu.a;
    }
}
