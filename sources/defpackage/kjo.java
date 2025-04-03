package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjo extends kjv {
    public kjo(kiu kiuVar) {
        super(kiuVar);
        kiuVar.o.d();
        kiuVar.p.d();
        this.g = ((kiy) kiuVar).e;
    }

    private final void g(kjk kjkVar) {
        this.i.j.add(kjkVar);
        kjkVar.k.add(this.i);
    }

    @Override // defpackage.kjv
    public final void b() {
        kiu kiuVar = this.d;
        kiy kiyVar = (kiy) kiuVar;
        int i = kiyVar.b;
        int i2 = kiyVar.c;
        float f = kiyVar.a;
        if (kiyVar.e == 1) {
            if (i != -1) {
                this.i.k.add(kiuVar.ae.o.i);
                this.d.ae.o.i.j.add(this.i);
                this.i.e = i;
            } else if (i2 != -1) {
                this.i.k.add(kiuVar.ae.o.j);
                this.d.ae.o.j.j.add(this.i);
                this.i.e = -i2;
            } else {
                kjk kjkVar = this.i;
                kjkVar.b = true;
                kjkVar.k.add(kiuVar.ae.o.j);
                this.d.ae.o.j.j.add(this.i);
            }
            g(this.d.o.i);
            g(this.d.o.j);
            return;
        }
        if (i != -1) {
            this.i.k.add(kiuVar.ae.p.i);
            this.d.ae.p.i.j.add(this.i);
            this.i.e = i;
        } else if (i2 != -1) {
            this.i.k.add(kiuVar.ae.p.j);
            this.d.ae.p.j.j.add(this.i);
            this.i.e = -i2;
        } else {
            kjk kjkVar2 = this.i;
            kjkVar2.b = true;
            kjkVar2.k.add(kiuVar.ae.p.j);
            this.d.ae.p.j.j.add(this.i);
        }
        g(this.d.p.i);
        g(this.d.p.j);
    }

    @Override // defpackage.kjv
    public final void c() {
        kiu kiuVar = this.d;
        if (((kiy) kiuVar).e == 1) {
            kiuVar.aj = this.i.f;
        } else {
            kiuVar.ak = this.i.f;
        }
    }

    @Override // defpackage.kjv
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.kjv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.kjv, defpackage.kji
    public final void f() {
        kjk kjkVar = this.i;
        if (kjkVar.c && !kjkVar.i) {
            this.i.c((int) ((((kjk) kjkVar.k.get(0)).f * ((kiy) this.d).a) + 0.5f));
        }
    }
}
