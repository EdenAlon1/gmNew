package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvf implements cum, hjk {
    public boolean a;
    public final hho c;
    public final hho d;
    public final hho e;
    public final hho g;
    public final hho h;
    public icv i;
    public cvf k;
    public final hjx l = new hhw(0.0f);
    public final hho b = new hic(true, hla.a);
    public final hho f = new hic(false, hla.a);
    public ffix j = cve.a;
    private final hho m = new hic(null, hla.a);

    public cvf(cvd cvdVar, csb csbVar, cvk cvkVar, cwd cwdVar, cvn cvnVar) {
        this.c = new hic(cvdVar, hla.a);
        this.d = new hic(csbVar, hla.a);
        this.e = new hic(cvkVar, hla.a);
        this.g = new hic(cwdVar, hla.a);
        this.h = new hic(cvnVar, hla.a);
    }

    @Override // defpackage.cum
    public final float a() {
        return this.l.c();
    }

    @Override // defpackage.cum
    public final void b(ifr ifrVar) {
        iga f = f();
        if (f != null && this.a && l()) {
            if (d().a() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.");
            }
            iam a = d().a();
            iak iakVar = a != null ? new iak(a.c()) : null;
            iakVar.getClass();
            long j = iakVar.a;
            int i = (int) (4294967295L & j);
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            float f2 = -intBitsToFloat2;
            float f3 = -intBitsToFloat;
            ifrVar.t().c.e(intBitsToFloat, intBitsToFloat2);
            try {
                ige.a(ifrVar, f);
            } finally {
                ifrVar.t().c.e(f3, f2);
            }
        }
    }

    public final csb c() {
        return (csb) this.d.a();
    }

    public final cvd d() {
        return (cvd) this.c.a();
    }

    public final cvn e() {
        return (cvn) this.h.a();
    }

    public final iga f() {
        return (iga) this.m.a();
    }

    @Override // defpackage.hjk
    public final void h() {
        cwb cwbVar = d().b;
        cvd d = d();
        d.d.remove(this);
        if (d.d.isEmpty()) {
            d.g();
            cwb cwbVar2 = d.b;
            cvr.a().b(d);
        } else {
            d.b.g(d, d.e, d.f);
        }
        cwbVar.e.invoke(cwbVar);
        d.b.f();
        cwbVar.h.remove(this);
        if (d.d.isEmpty()) {
            ffqy.d(d.b.b, null, null, new cvu(d, null), 3);
        }
        d().h();
    }

    @Override // defpackage.hjk
    public final void i() {
        cwb cwbVar = d().b;
        cvd d = d();
        d.d.add(this);
        d.b.g(d, d.e, d.f);
        cwbVar.e.invoke(cwbVar);
        d.b.f();
        int i = 0;
        htg htgVar = new htg(cwbVar.h, 0);
        while (true) {
            if (!htgVar.hasNext()) {
                i = -1;
                break;
            }
            cum cumVar = (cum) htgVar.next();
            cvf cvfVar = cumVar instanceof cvf ? (cvf) cumVar : null;
            if (ffkj.e(cvfVar != null ? cvfVar.d() : null, d())) {
                break;
            } else {
                i++;
            }
        }
        if (i == cwbVar.h.a() - 1 || i == -1) {
            cwbVar.h.add(this);
        } else {
            cwbVar.h.add(i + 1, this);
        }
        d().h();
    }

    public final void j(iga igaVar) {
        this.m.b(igaVar);
    }

    public final boolean k() {
        return ffkj.e(d().c, this) || !((Boolean) this.f.a()).booleanValue();
    }

    public final boolean l() {
        return k() && d().i() && ((Boolean) this.b.a()).booleanValue() && d().b.a();
    }

    @Override // defpackage.hjk
    public final void g() {
    }
}
