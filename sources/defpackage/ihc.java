package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihc extends iib {
    public ibq a;
    public float e;
    public ibq f;
    public float j;
    public float l;
    public boolean o;
    public icv p;
    private ifv q;
    private final icv r;
    private final ffbz s;
    public float b = 1.0f;
    public List c = iii.a;
    public float d = 1.0f;
    public int g = 0;
    public int h = 0;
    public float i = 4.0f;
    public float k = 1.0f;
    public boolean m = true;
    public boolean n = true;

    public ihc() {
        ibc ibcVar = new ibc((byte[]) null);
        this.r = ibcVar;
        this.p = ibcVar;
        this.s = ffca.b(3, ihb.a);
    }

    private final void c() {
        if (this.j == 0.0f && this.k == 1.0f) {
            this.p = this.r;
            return;
        }
        if (ffkj.e(this.p, this.r)) {
            this.p = new ibc((byte[]) null);
        } else {
            int a = this.p.a();
            this.p.l();
            this.p.m(a);
        }
        d().c(this.r);
        float a2 = d().a();
        float f = this.j;
        float f2 = this.l;
        float f3 = ((f + f2) % 1.0f) * a2;
        float f4 = ((this.k + f2) % 1.0f) * a2;
        if (f3 <= f4) {
            d().b(f3, f4, this.p);
        } else {
            d().b(f3, a2, this.p);
            d().b(0.0f, f4, this.p);
        }
    }

    private final ibe d() {
        return (ibe) this.s.a();
    }

    @Override // defpackage.iib
    public final void b(ifr ifrVar) {
        ifr ifrVar2;
        ifv ifvVar;
        if (this.m) {
            iia.a(this.c, this.r);
            c();
        } else if (this.o) {
            c();
        }
        this.m = false;
        this.o = false;
        ibq ibqVar = this.a;
        if (ibqVar != null) {
            ifrVar2 = ifrVar;
            ifq.n(ifrVar2, this.p, ibqVar, this.b, null, 56);
        } else {
            ifrVar2 = ifrVar;
        }
        ibq ibqVar2 = this.f;
        if (ibqVar2 != null) {
            ifv ifvVar2 = this.q;
            if (this.n || ifvVar2 == null) {
                ifv ifvVar3 = new ifv(this.e, this.i, this.g, this.h, 16);
                this.q = ifvVar3;
                this.n = false;
                ifvVar = ifvVar3;
            } else {
                ifvVar = ifvVar2;
            }
            ifq.n(ifrVar2, this.p, ibqVar2, this.d, ifvVar, 48);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
