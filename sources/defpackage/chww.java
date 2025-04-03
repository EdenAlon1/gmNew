package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chww {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public chww(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
    }

    public final chwu a(bzge bzgeVar, esaa esaaVar) {
        chwx chwxVar = (chwx) this.c.b();
        chwxVar.getClass();
        cgcu cgcuVar = (cgcu) this.b.b();
        cgcuVar.getClass();
        esaaVar.getClass();
        return new chwu(chwxVar, cgcuVar, bzgeVar, esaaVar);
    }

    public final chwu b(cila cilaVar, esaa esaaVar) {
        bzge bzgeVar;
        chwx chwxVar = (chwx) this.d.b();
        chwxVar.getClass();
        cgcu cgcuVar = (cgcu) this.b.b();
        cgcuVar.getClass();
        cilaVar.getClass();
        esaaVar.getClass();
        int i = chwv.k;
        fcek fcekVar = cilaVar.c;
        if (fcekVar == null) {
            fcekVar = fcek.a;
        }
        if (fcekVar.d.equals("GDitto")) {
            fcek fcekVar2 = cilaVar.l;
            if (fcekVar2 == null) {
                fcekVar2 = fcek.a;
            }
            fcek fcekVar3 = cilaVar.c;
            if (fcekVar3 == null) {
                fcekVar3 = fcek.a;
            }
            bzgeVar = new bzge(fcekVar2, fcekVar3.c, Optional.of(cilaVar.m));
        } else {
            fcek fcekVar4 = cilaVar.c;
            fcek fcekVar5 = fcekVar4 == null ? fcek.a : fcekVar4;
            if (fcekVar4 == null) {
                fcekVar4 = fcek.a;
            }
            bzgeVar = new bzge(fcekVar5, fcekVar4.c, Optional.empty());
        }
        return new chwu(chwxVar, cgcuVar, bzgeVar, esaaVar);
    }

    public final chwu c(fcek fcekVar, Optional optional, esaa esaaVar) {
        chwx chwxVar = (chwx) this.a.b();
        chwxVar.getClass();
        cgcu cgcuVar = (cgcu) this.b.b();
        cgcuVar.getClass();
        fcekVar.getClass();
        esaaVar.getClass();
        return new chwu(chwxVar, cgcuVar, fcekVar, optional, esaaVar);
    }
}
