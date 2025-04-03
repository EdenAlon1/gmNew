package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxl extends hvh implements hxj, iwn, hxi {
    public ffji a;
    private final hxn b;
    private boolean c;

    public hxl(hxn hxnVar, ffji ffjiVar) {
        this.b = hxnVar;
        this.a = ffjiVar;
        hxnVar.a = this;
    }

    @Override // defpackage.iwn
    public final void a() {
        b();
    }

    @Override // defpackage.hxj
    public final void b() {
        this.c = false;
        this.b.r();
        ith.a(this);
    }

    @Override // defpackage.hxi
    public final long c() {
        return kag.d(isx.e(this, 128).c);
    }

    @Override // defpackage.hvh
    public final void dK() {
        b();
    }

    @Override // defpackage.hvh
    public final void dL() {
        b();
    }

    @Override // defpackage.hxi
    public final jzn j() {
        return isx.g(this);
    }

    @Override // defpackage.hxi
    public final kah k() {
        return isx.h(this);
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        if (!this.c) {
            hxn hxnVar = this.b;
            hxnVar.r();
            iwo.a(this, new hxk(this, hxnVar));
            if (hxnVar.b == null) {
                imn.a("DrawResult not defined, did you forget to call onDraw?");
                throw new ffbx();
            }
            this.c = true;
        }
        hxt hxtVar = this.b.b;
        hxtVar.getClass();
        hxtVar.a.invoke(ifoVar);
    }

    @Override // defpackage.itg
    public final void u() {
        b();
    }

    @Override // defpackage.hvh
    public final void t() {
    }
}
