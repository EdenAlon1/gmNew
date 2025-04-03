package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cws extends cun {
    public cxt a;
    public huo b;
    private boolean e;
    private long c = -9223372034707292160L;
    private long d = jzl.k(0, 0, 0, 15);
    private final hho f = new hic(null, hla.a);

    public cws(cxt cxtVar, huo huoVar) {
        this.a = cxtVar;
        this.b = huoVar;
    }

    public final void a(cwp cwpVar) {
        this.f.b(cwpVar);
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        iqk e;
        cws cwsVar;
        cwp cwpVar;
        char c;
        long j2;
        long e2;
        cwp cwpVar2;
        ipo ei;
        if (ipqVar.eu()) {
            this.d = j;
            this.e = true;
            e = iplVar.e(j);
        } else {
            e = iplVar.e(this.e ? this.d : j);
        }
        iqk iqkVar = e;
        long j3 = (iqkVar.b & 4294967295L) | (iqkVar.a << 32);
        if (ipqVar.eu()) {
            this.c = j3;
            cwsVar = this;
            e2 = j3;
            c = ' ';
            j2 = 4294967295L;
        } else {
            long j4 = this.c;
            if (true != cry.a(j4)) {
                j4 = j3;
            }
            cwp cwpVar3 = (cwp) this.f.a();
            if (cwpVar3 != null) {
                boolean z = (kaf.e(j4, ((kaf) cwpVar3.a.d()).a) || ((Boolean) cwpVar3.a.c.a()).booleanValue()) ? false : true;
                if (!kaf.e(j4, ((kaf) cwpVar3.a.c()).a) || z) {
                    cwpVar3.b = ((kaf) cwpVar3.a.d()).a;
                    cwpVar2 = cwpVar3;
                    cwsVar = this;
                    ffqy.d(D(), null, null, new cwq(cwpVar2, j4, cwsVar, null), 3);
                } else {
                    cwsVar = this;
                    cwpVar2 = cwpVar3;
                }
                cwpVar = cwpVar2;
                c = ' ';
                j2 = 4294967295L;
            } else {
                long j5 = j4;
                cwsVar = this;
                c = ' ';
                j2 = 4294967295L;
                cwpVar = new cwp(new cxj(new kaf(j5), dcp.h, new kaf(4294967297L), 8), j5);
            }
            cwsVar.a(cwpVar);
            e2 = jzl.e(j, ((kaf) cwpVar.a.d()).a);
        }
        int i = (int) (e2 >> c);
        int i2 = (int) (e2 & j2);
        ei = ipqVar.ei(i, i2, ffem.a, new cwr(cwsVar, j3, i, i2, ipqVar, iqkVar));
        return ei;
    }

    @Override // defpackage.hvh
    public final void dS() {
        a(null);
    }

    @Override // defpackage.hvh
    public final void dT() {
        this.c = -9223372034707292160L;
        this.e = false;
    }
}
