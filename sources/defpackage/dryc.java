package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryc implements dsyi {
    final /* synthetic */ dryd a;

    public dryc(dryd drydVar) {
        this.a = drydVar;
    }

    @Override // defpackage.dsyi
    public final void a(int i, float f) {
        if (i != 0) {
            if (i == 1 && this.a.a.d() == dsmm.a) {
                dryd drydVar = this.a;
                drydVar.a.e(drydVar.b.g, false);
                return;
            }
            return;
        }
        if (this.a.c.b()) {
            dryd drydVar2 = this.a;
            if (drydVar2.f) {
                drydVar2.f();
            }
        }
    }

    @Override // defpackage.dsyi
    public final void b(int i) {
        dryd drydVar = this.a;
        if (drydVar.f) {
            drydVar.a(i, false);
        }
    }
}
