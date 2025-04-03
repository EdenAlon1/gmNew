package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csog {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public csog(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    public final csof a(Consumer consumer, int i) {
        if (!ctid.e) {
            csoo csooVar = (csoo) this.a.b();
            ctwx ctwxVar = (ctwx) csooVar.a.b();
            ctwxVar.getClass();
            errl errlVar = (errl) csooVar.b.b();
            errlVar.getClass();
            ejlk ejlkVar = (ejlk) csooVar.c.b();
            ejlkVar.getClass();
            elbx elbxVar = (elbx) csooVar.d.b();
            elbxVar.getClass();
            csph csphVar = (csph) csooVar.e.b();
            csphVar.getClass();
            return new cson(ctwxVar, errlVar, ejlkVar, elbxVar, csphVar, consumer, i);
        }
        if (!ctid.f) {
            csph csphVar2 = (csph) this.d.b();
            if (koa.c(csphVar2.a, "android.permission.ACCESS_FINE_LOCATION") == 0 || koa.c(csphVar2.a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                cspg cspgVar = (cspg) this.c.b();
                ctwx ctwxVar2 = (ctwx) cspgVar.a.b();
                ctwxVar2.getClass();
                errl errlVar2 = (errl) cspgVar.b.b();
                errlVar2.getClass();
                ejlk ejlkVar2 = (ejlk) cspgVar.c.b();
                ejlkVar2.getClass();
                return new cspf(ctwxVar2, errlVar2, ejlkVar2, consumer, i);
            }
        }
        cspb cspbVar = (cspb) this.b.b();
        ctwx ctwxVar3 = (ctwx) cspbVar.a.b();
        ctwxVar3.getClass();
        errl errlVar3 = (errl) cspbVar.b.b();
        errlVar3.getClass();
        ejlk ejlkVar3 = (ejlk) cspbVar.c.b();
        ejlkVar3.getClass();
        csph csphVar3 = (csph) cspbVar.d.b();
        csphVar3.getClass();
        return new cspa(ctwxVar3, errlVar3, ejlkVar3, csphVar3, consumer, i);
    }
}
