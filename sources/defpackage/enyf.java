package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class enyf {
    public static int a(enyi enyiVar, enxz enxzVar) {
        return ermw.a(enyiVar.a().k(), enxzVar.d);
    }

    public static enxz b(enyi enyiVar) {
        return new enxz(enyiVar.a().k());
    }

    public static enyr c(enyi enyiVar) {
        return enyr.m(b(enyiVar).z());
    }

    public static boolean d(enyi enyiVar, enyr enyrVar) {
        enxz u = enxz.u(enyrVar);
        enyiVar.b(u);
        if (!enyiVar.d() && b(enyiVar).y().I(u)) {
            return true;
        }
        if (enyiVar.c()) {
            return false;
        }
        enyiVar.e();
        return b(enyiVar).x().C(u);
    }

    public static int e(enyi enyiVar, enxz enxzVar) {
        enyiVar.b(enxzVar.y());
        if (!enyiVar.d()) {
            if (b(enyiVar).C(enxzVar) && b(enyiVar).y().I(enxzVar)) {
                return 1;
            }
            if (b(enyiVar).I(enxzVar.x())) {
                return 2;
            }
        }
        if (enyiVar.c()) {
            return 3;
        }
        enyiVar.e();
        return b(enyiVar).x().C(enxzVar) ? 1 : 3;
    }
}
