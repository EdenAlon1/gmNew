package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igv extends iib {
    public ffji e;
    public float g;
    public float h;
    public float i;
    public float l;
    public float m;
    private float[] o;
    private icv q;
    private final List p = new ArrayList();
    public boolean a = true;
    public long b = ibw.h;
    public List c = iii.a;
    public boolean d = true;
    private final ffji r = new igu(this);
    public String f = "";
    public float j = 1.0f;
    public float k = 1.0f;
    public boolean n = true;

    private final void g() {
        this.a = false;
        this.b = ibw.h;
    }

    private final void h(ibq ibqVar) {
        if (this.a && ibqVar != null) {
            if (ibqVar instanceof idl) {
                i(((idl) ibqVar).a);
            } else {
                g();
            }
        }
    }

    private final void i(long j) {
        if (this.a && j != 16) {
            long j2 = this.b;
            if (j2 == 16) {
                this.b = j;
                return;
            }
            List list = iii.a;
            if (ibw.d(j2) == ibw.d(j) && ibw.c(j2) == ibw.c(j) && ibw.b(j2) == ibw.b(j)) {
                return;
            }
            g();
        }
    }

    private final boolean j() {
        return !this.c.isEmpty();
    }

    @Override // defpackage.iib
    public final ffji a() {
        return this.e;
    }

    @Override // defpackage.iib
    public final void b(ifr ifrVar) {
        if (this.n) {
            float[] fArr = this.o;
            if (fArr == null) {
                fArr = icm.e();
                this.o = fArr;
            } else {
                icm.c(fArr);
            }
            icm.f(fArr, this.l + this.h, this.m + this.i);
            double d = this.g * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = -sin;
            float f4 = fArr[1];
            float f5 = fArr[5];
            float f6 = fArr[2];
            float f7 = fArr[6];
            float f8 = fArr[3];
            float f9 = fArr[7];
            float f10 = (cos * f) + (sin * f2);
            fArr[0] = f10;
            float f11 = (cos * f4) + (sin * f5);
            fArr[1] = f11;
            float f12 = (cos * f6) + (sin * f7);
            fArr[2] = f12;
            float f13 = (cos * f8) + (sin * f9);
            fArr[3] = f13;
            float f14 = (f * f3) + (f2 * cos);
            fArr[4] = f14;
            float f15 = (f4 * f3) + (f5 * cos);
            fArr[5] = f15;
            float f16 = (f6 * f3) + (f7 * cos);
            fArr[6] = f16;
            float f17 = (f3 * f8) + (cos * f9);
            fArr[7] = f17;
            float f18 = this.j;
            float f19 = this.k;
            fArr[0] = f10 * f18;
            fArr[1] = f11 * f18;
            fArr[2] = f12 * f18;
            fArr[3] = f13 * f18;
            fArr[4] = f14 * f19;
            fArr[5] = f15 * f19;
            fArr[6] = f16 * f19;
            fArr[7] = f17 * f19;
            icm.f(fArr, -this.h, -this.i);
            this.n = false;
        }
        if (this.d) {
            if (j()) {
                icv icvVar = this.q;
                if (icvVar == null) {
                    icvVar = new ibc((byte[]) null);
                    this.q = icvVar;
                }
                iia.a(this.c, icvVar);
            }
            this.d = false;
        }
        ifl t = ifrVar.t();
        long a = t.a();
        t.b().l();
        try {
            ifn ifnVar = t.c;
            float[] fArr2 = this.o;
            if (fArr2 != null) {
                ifnVar.a.b().b(new icm(fArr2).a);
            }
            icv icvVar2 = this.q;
            if (j() && icvVar2 != null) {
                ifnVar.g(icvVar2);
            }
            List list = this.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((iib) list.get(i)).b(ifrVar);
            }
        } finally {
            t.b().j();
            t.h(a);
        }
    }

    public final void c(int i, iib iibVar) {
        if (i < this.p.size()) {
            this.p.set(i, iibVar);
        } else {
            this.p.add(iibVar);
        }
        d(iibVar);
        iibVar.e(this.r);
        f();
    }

    public final void d(iib iibVar) {
        if (iibVar instanceof ihc) {
            ihc ihcVar = (ihc) iibVar;
            h(ihcVar.a);
            h(ihcVar.f);
        } else if (iibVar instanceof igv) {
            igv igvVar = (igv) iibVar;
            if (igvVar.a && this.a) {
                i(igvVar.b);
            } else {
                g();
            }
        }
    }

    @Override // defpackage.iib
    public final void e(ffji ffjiVar) {
        this.e = ffjiVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f);
        List list = this.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iib iibVar = (iib) list.get(i);
            sb.append("\t");
            sb.append(iibVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
