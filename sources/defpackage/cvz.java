package defpackage;

import androidx.compose.animation.SharedBoundsNodeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvz extends ffkk implements ffjn {
    final /* synthetic */ cvn a;
    final /* synthetic */ dbe b;
    final /* synthetic */ ffji c;
    final /* synthetic */ cwb d;
    final /* synthetic */ cvk e;
    final /* synthetic */ cwd f;
    final /* synthetic */ cwc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvz(cvn cvnVar, dbe dbeVar, ffji ffjiVar, cwb cwbVar, cvk cvkVar, cwd cwdVar, cwc cwcVar) {
        super(3);
        this.a = cvnVar;
        this.b = dbeVar;
        this.c = ffjiVar;
        this.d = cwbVar;
        this.e = cvkVar;
        this.f = cwdVar;
        this.g = cwcVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dbe b;
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1843478929);
        Object obj4 = this.a.a;
        hfdVar.u(-359689844, obj4);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            cwb cwbVar = this.d;
            cvd cvdVar = (cvd) cwbVar.i.f(obj4);
            if (cvdVar == null) {
                cvdVar = new cvd(obj4, cwbVar);
                cwbVar.i.e(obj4, cvdVar);
            }
            f = cvdVar;
            hfdVar.y(f);
        }
        cvd cvdVar2 = (cvd) f;
        hfdVar.u(-359686031, this.b);
        if (this.b != null) {
            hfdVar.v(1734686048);
            dbe dbeVar = this.b;
            ffji ffjiVar = this.c;
            boolean D = hfdVar.D(dbeVar);
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = dbeVar.e();
                hfdVar.y(f2);
            }
            if (dbeVar.t()) {
                f2 = dbeVar.e();
            }
            hfdVar.v(1329676753);
            Boolean bool = (Boolean) ffjiVar.invoke(f2);
            bool.booleanValue();
            hfdVar.o();
            Object f3 = dbeVar.f();
            hfdVar.v(1329676753);
            Boolean bool2 = (Boolean) ffjiVar.invoke(f3);
            bool2.booleanValue();
            hfdVar.o();
            b = dbs.a(dbeVar, bool, bool2, (String) obj4, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.v(1734936683);
            ffji ffjiVar2 = this.c;
            fflf.e(ffjiVar2, 1);
            Boolean bool3 = (Boolean) ffjiVar2.invoke(ffcu.a);
            boolean booleanValue = bool3.booleanValue();
            Object f4 = hfdVar.f();
            if (f4 == hfc.a) {
                if (cvdVar2.a() != null) {
                    booleanValue = !booleanValue;
                }
                f4 = new czq(Boolean.valueOf(booleanValue));
                hfdVar.y(f4);
            }
            czq czqVar = (czq) f4;
            czqVar.d(bool3);
            b = dbs.b(czqVar, null, hfdVar, 0, 2);
            hfdVar.o();
        }
        hfdVar.u(-359623378, Boolean.valueOf(this.d.a()));
        das g = dbs.g(b, dcp.i, hfdVar, 0);
        hfdVar.m();
        boolean D2 = hfdVar.D(b);
        cwb cwbVar2 = this.d;
        cwc cwcVar = this.g;
        Object f5 = hfdVar.f();
        if (D2 || f5 == hfc.a) {
            f5 = new csb(cwbVar2, b, g, cwcVar);
            hfdVar.y(f5);
        }
        cwc cwcVar2 = this.g;
        csb csbVar = (csb) f5;
        if (!ffkj.e(csbVar.a(), g)) {
            csbVar.b.b(g);
            csbVar.e(null);
            csbVar.d = csc.a;
        }
        csbVar.c.b(cwcVar2);
        hfdVar.m();
        cvk cvkVar = this.e;
        cvn cvnVar = this.a;
        cwd cwdVar = this.f;
        Object f6 = hfdVar.f();
        if (f6 == hfc.a) {
            cvf cvfVar = new cvf(cvdVar2, csbVar, cvkVar, cwdVar, cvnVar);
            hfdVar.y(cvfVar);
            f6 = cvfVar;
        }
        cvf cvfVar2 = (cvf) f6;
        cvnVar.b.b(cvfVar2);
        cvfVar2.c.b(cvdVar2);
        cvfVar2.f.b(false);
        cvfVar2.d.b(csbVar);
        cvfVar2.e.b(cvkVar);
        cvfVar2.g.b(cwdVar);
        cvfVar2.l.i(0.0f);
        cvfVar2.b.b(true);
        cvfVar2.h.b(cvnVar);
        hfdVar.m();
        hvi a = hviVar.a(new SharedBoundsNodeElement(cvfVar2));
        hfdVar.o();
        return a;
    }
}
