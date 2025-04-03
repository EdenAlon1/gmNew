package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cud extends cun {
    public dbe a;
    public das b;
    public das c;
    public das d;
    public cue e;
    public cug f;
    public ffix g;
    public huo h;
    public csu i;
    private long j = -9223372034707292160L;
    private final ffji k;
    private final ffji l;

    public cud(dbe dbeVar, das dasVar, das dasVar2, das dasVar3, cue cueVar, cug cugVar, ffix ffixVar, csu csuVar) {
        this.a = dbeVar;
        this.b = dasVar;
        this.c = dasVar2;
        this.d = dasVar3;
        this.e = cueVar;
        this.f = cugVar;
        this.g = ffixVar;
        this.i = csuVar;
        jzl.k(0, 0, 0, 15);
        this.k = new cub(this);
        this.l = new cuc(this);
    }

    public final huo a() {
        csd csdVar;
        huo huoVar;
        huo huoVar2;
        if (this.a.d().d(cst.a, cst.b)) {
            csd csdVar2 = this.e.b().c;
            if (csdVar2 != null && (huoVar2 = csdVar2.a) != null) {
                return huoVar2;
            }
            csdVar = this.f.b().c;
            if (csdVar == null) {
                return null;
            }
        } else {
            csd csdVar3 = this.f.b().c;
            if (csdVar3 != null && (huoVar = csdVar3.a) != null) {
                return huoVar;
            }
            csdVar = this.e.b().c;
            if (csdVar == null) {
                return null;
            }
        }
        return csdVar.a;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        idr idrVar;
        char c;
        long j2;
        ipo ei2;
        ipo ei3;
        if (this.a.e() == this.a.f()) {
            this.h = null;
        } else if (this.h == null) {
            huo a = a();
            if (a == null) {
                int i = huo.a;
                a = hum.a;
            }
            this.h = a;
        }
        if (ipqVar.eu()) {
            iqk e = iplVar.e(j);
            long j3 = (e.a << 32) | (e.b & 4294967295L);
            this.j = j3;
            ei3 = ipqVar.ei((int) (j3 >> 32), (int) (4294967295L & j3), ffem.a, new ctu(e));
            return ei3;
        }
        if (!((Boolean) this.g.invoke()).booleanValue()) {
            iqk e2 = iplVar.e(j);
            ei = ipqVar.ei(e2.a, e2.b, ffem.a, new ctw(e2));
            return ei;
        }
        csu csuVar = this.i;
        das dasVar = csuVar.a;
        das dasVar2 = csuVar.b;
        dbe dbeVar = csuVar.c;
        cue cueVar = csuVar.d;
        cug cugVar = csuVar.e;
        das dasVar3 = csuVar.f;
        dac dacVar = ctt.a;
        hkx b = dasVar != null ? dasVar.b(new csx(cueVar, cugVar), new csy(cueVar, cugVar)) : null;
        hkx b2 = dasVar2 != null ? dasVar2.b(new cta(cueVar, cugVar), new ctb(cueVar, cugVar)) : null;
        if (dbeVar.e() == cst.a) {
            cup cupVar = cueVar.b().d;
            if (cupVar != null) {
                idrVar = new idr(cupVar.b);
            } else {
                cup cupVar2 = cugVar.b().d;
                if (cupVar2 != null) {
                    idrVar = new idr(cupVar2.b);
                }
                idrVar = null;
            }
        } else {
            cup cupVar3 = cugVar.b().d;
            if (cupVar3 != null) {
                idrVar = new idr(cupVar3.b);
            } else {
                cup cupVar4 = cueVar.b().d;
                if (cupVar4 != null) {
                    idrVar = new idr(cupVar4.b);
                }
                idrVar = null;
            }
        }
        csz cszVar = new csz(b, b2, dasVar3 != null ? dasVar3.b(ctc.a, new ctd(idrVar, cueVar, cugVar)) : null);
        iqk e3 = iplVar.e(j);
        long j4 = this.j;
        long j5 = (e3.a << 32) | (e3.b & 4294967295L);
        if (true != cry.a(j4)) {
            j4 = j5;
        }
        das dasVar4 = this.b;
        hkx b3 = dasVar4 != null ? dasVar4.b(this.k, new ctx(this, j4)) : null;
        if (b3 != null) {
            j5 = ((kaf) b3.a()).a;
        }
        long e4 = jzl.e(j, j5);
        das dasVar5 = this.c;
        long j6 = dasVar5 != null ? ((kaa) dasVar5.b(cty.a, new ctz(this, j4)).a()).a : 0L;
        das dasVar6 = this.d;
        if (dasVar6 != null) {
            c = ' ';
            j2 = ((kaa) dasVar6.b(this.l, new cua(this, j4)).a()).a;
        } else {
            c = ' ';
            j2 = 0;
        }
        huo huoVar = this.h;
        ei2 = ipqVar.ei((int) (e4 >> c), (int) (e4 & 4294967295L), ffem.a, new ctv(e3, kaa.d(huoVar != null ? huoVar.a(j4, e4, kah.a) : 0L, j2), j6, cszVar));
        return ei2;
    }

    @Override // defpackage.hvh
    public final void dT() {
        this.j = -9223372034707292160L;
    }
}
