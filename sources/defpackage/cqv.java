package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqv<S> extends cun {
    public das a;
    public hkx b;
    public cqw c;
    private long d = -9223372034707292160L;

    public cqv(das dasVar, hkx hkxVar, cqw cqwVar) {
        this.a = dasVar;
        this.b = hkxVar;
        this.c = cqwVar;
    }

    public final long a(long j) {
        long j2 = this.d;
        return kaf.e(j2, -9223372034707292160L) ? j : j2;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        long j2;
        ipo ei;
        iqk e = iplVar.e(j);
        if (ipqVar.eu()) {
            j2 = (e.a << 32) | (e.b & 4294967295L);
        } else {
            das dasVar = this.a;
            if (dasVar == null) {
                j2 = (e.a << 32) | (e.b & 4294967295L);
                this.d = j2;
            } else {
                long j3 = (e.b & 4294967295L) | (e.a << 32);
                hkx b = dasVar.b(new cqt(this, j3), new cqu(this, j3));
                j2 = ((kaf) b.a()).a;
                this.d = ((kaf) b.a()).a;
            }
        }
        ei = ipqVar.ei((int) (j2 >> 32), (int) (4294967295L & j2), ffem.a, new cqs(this, e, j2));
        return ei;
    }

    @Override // defpackage.hvh
    public final void dS() {
        this.d = -9223372034707292160L;
    }
}
