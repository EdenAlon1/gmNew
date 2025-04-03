package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csq extends ffkk implements ffjm {
    final /* synthetic */ dbe a;
    final /* synthetic */ cyq b;
    final /* synthetic */ Object c;
    final /* synthetic */ ffjn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csq(dbe dbeVar, cyq cyqVar, Object obj, ffjn ffjnVar) {
        super(2);
        this.a = dbeVar;
        this.b = cyqVar;
        this.c = obj;
        this.d = ffjnVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [cyq, java.lang.Object] */
    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Object e;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            dbe dbeVar = this.a;
            csn csnVar = new csn(this.b);
            Object obj3 = this.c;
            dbv dbvVar = dcp.a;
            if (dbeVar.t()) {
                hfdVar.v(1888611722);
                hfdVar.o();
                e = dbeVar.e();
            } else {
                hfdVar.v(1888357677);
                boolean D = hfdVar.D(dbeVar);
                e = hfdVar.f();
                if (D || e == hfc.a) {
                    hrw a = hrv.a();
                    ffji k = a != null ? a.k() : null;
                    hrw b = hrv.b(a);
                    try {
                        Object e2 = dbeVar.e();
                        hrv.e(a, b, k);
                        hfdVar.y(e2);
                        e = e2;
                    } catch (Throwable th) {
                        hrv.e(a, b, k);
                        throw th;
                    }
                }
                hfdVar.o();
            }
            hfdVar.v(-438678252);
            float f = true != ffkj.e(e, obj3) ? 0.0f : 1.0f;
            hfdVar.o();
            Float valueOf = Float.valueOf(f);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                cso csoVar = new cso(dbeVar);
                hqg hqgVar = hkg.a;
                hgk hgkVar = new hgk(csoVar, null);
                hfdVar.y(hgkVar);
                f2 = hgkVar;
            }
            Object a2 = ((hkx) f2).a();
            hfdVar.v(-438678252);
            float f3 = true == ffkj.e(a2, obj3) ? 1.0f : 0.0f;
            hfdVar.o();
            Float valueOf2 = Float.valueOf(f3);
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                csp cspVar = new csp(dbeVar);
                hqg hqgVar2 = hkg.a;
                hgk hgkVar2 = new hgk(cspVar, null);
                hfdVar.y(hgkVar2);
                f4 = hgkVar2;
            }
            hkx f5 = dbs.f(dbeVar, valueOf, valueOf2, csnVar.a(((hkx) f4).a(), hfdVar, 0), dbvVar, hfdVar, 0);
            hve hveVar = hvi.e;
            boolean D2 = hfdVar.D(f5);
            Object f6 = hfdVar.f();
            if (D2 || f6 == hfc.a) {
                f6 = new csm(f5);
                hfdVar.y(f6);
            }
            hvi a3 = icf.a(hveVar, (ffji) f6);
            ffjn ffjnVar = this.d;
            Object obj4 = this.c;
            int i2 = huo.a;
            ipn a4 = dyc.a(hum.a, false);
            int a5 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a3);
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
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a5))) {
                Integer valueOf3 = Integer.valueOf(a5);
                hfdVar.y(valueOf3);
                hfdVar.h(valueOf3, ffjmVar);
            }
            hlc.b(hfdVar, b2, iss.c);
            ffjnVar.a(obj4, hfdVar, 0);
            hfdVar.n();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
