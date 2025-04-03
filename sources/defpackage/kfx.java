package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kfx extends ffkk implements ffji {
    final /* synthetic */ kif a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfx(kif kifVar) {
        super(1);
        this.a = kifVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        if (!Float.isNaN(this.a.f) || !Float.isNaN(this.a.g)) {
            iddVar.C(ids.a(Float.isNaN(this.a.f) ? 0.5f : this.a.f, Float.isNaN(this.a.g) ? 0.5f : this.a.g));
        }
        if (!Float.isNaN(this.a.h)) {
            iddVar.u(this.a.h);
        }
        if (!Float.isNaN(this.a.i)) {
            iddVar.v(this.a.i);
        }
        if (!Float.isNaN(this.a.j)) {
            iddVar.w(this.a.j);
        }
        if (!Float.isNaN(this.a.k)) {
            iddVar.D(this.a.k);
        }
        if (!Float.isNaN(this.a.l)) {
            iddVar.E(this.a.l);
        }
        if (!Float.isNaN(this.a.m)) {
            iddVar.z(this.a.m);
        }
        if (!Float.isNaN(this.a.n) || !Float.isNaN(this.a.o)) {
            iddVar.x(Float.isNaN(this.a.n) ? 1.0f : this.a.n);
            iddVar.y(Float.isNaN(this.a.o) ? 1.0f : this.a.o);
        }
        if (!Float.isNaN(this.a.p)) {
            iddVar.a(this.a.p);
        }
        return ffcu.a;
    }
}
