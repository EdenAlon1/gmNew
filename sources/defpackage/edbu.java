package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edbu {
    public final boolean a = true;
    public final String b;
    public final eyee c;
    public final enip d;
    public final enhk e;
    private final edbt f;

    public edbu(ecxu ecxuVar, edbt edbtVar) {
        if (ecxuVar.b.b.isEmpty()) {
            ecxm.a.equals(ecxuVar.c);
        }
        this.b = ecxuVar.f();
        this.c = ecxuVar.d();
        ecxuVar.e();
        ecxuVar.a();
        Map g = ecxuVar.g();
        this.d = g != null ? enip.o(g.keySet()) : enpd.a;
        ecxq b = ecxuVar.b();
        enhd h = enhk.h(b.b.size() + 3);
        enqu listIterator = b.b.listIterator();
        while (listIterator.hasNext()) {
            ecxp ecxpVar = (ecxp) listIterator.next();
            h.k(ecxpVar.c(), ecxpVar.b());
        }
        h.k("__phenotype_server_token", ecxuVar.e());
        h.k("__phenotype_snapshot_token", ecxuVar.f());
        h.k("__phenotype_configuration_version", Long.valueOf(ecxuVar.a()));
        this.e = h.b();
        this.f = edbtVar;
    }

    final ecwt a() {
        edbt edbtVar = this.f;
        if (edbtVar.a) {
            return ecwt.a;
        }
        ecwq ecwqVar = (ecwq) ecwt.a.createBuilder();
        int i = edbtVar.b;
        ecwqVar.copyOnWrite();
        ecwt ecwtVar = (ecwt) ecwqVar.instance;
        ecwtVar.c = ecws.a(i);
        ecwtVar.b |= 1;
        int i2 = edbtVar.c;
        ecwqVar.copyOnWrite();
        ecwt ecwtVar2 = (ecwt) ecwqVar.instance;
        ecwtVar2.d = ecwr.a(i2);
        ecwtVar2.b |= 2;
        return (ecwt) ecwqVar.build();
    }

    public edbu(edbx edbxVar, edbt edbtVar) {
        eyee eyeeVar;
        String str;
        edbx.a.equals(edbxVar);
        this.b = edbxVar.c;
        this.c = edbxVar.d;
        String str2 = edbxVar.e;
        long j = edbxVar.f;
        this.d = enpd.a;
        enhd h = enhk.h(edbxVar.g.size() + 3);
        for (edbz edbzVar : edbxVar.g) {
            int i = edbzVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                h.k(edbzVar.e, Long.valueOf(i == 2 ? ((Long) edbzVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                h.k(edbzVar.e, Boolean.valueOf(i == 3 ? ((Boolean) edbzVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                h.k(edbzVar.e, Double.valueOf(i == 4 ? ((Double) edbzVar.d).doubleValue() : eobe.a));
            } else if (i3 == 3) {
                String str3 = edbzVar.e;
                if (i == 5) {
                    str = (String) edbzVar.d;
                } else {
                    str = "";
                }
                h.k(str3, str);
            } else if (i3 == 4) {
                String str4 = edbzVar.e;
                if (i == 6) {
                    eyeeVar = (eyee) edbzVar.d;
                } else {
                    eyeeVar = eyee.b;
                }
                h.k(str4, eyeeVar.I());
            }
        }
        h.k("__phenotype_server_token", edbxVar.e);
        h.k("__phenotype_snapshot_token", edbxVar.c);
        h.k("__phenotype_configuration_version", Long.valueOf(edbxVar.f));
        this.e = h.b();
        this.f = edbtVar;
    }
}
