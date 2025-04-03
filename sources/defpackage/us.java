package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class us extends vm {
    final /* synthetic */ uu a;

    public us(uu uuVar) {
        this.a = uuVar;
    }

    @Override // defpackage.vm
    public final void a() {
        uu uuVar = this.a;
        uuVar.d = uuVar.b.a();
        sn snVar = (sn) uuVar.c;
        snVar.a.p();
        snVar.d();
    }

    @Override // defpackage.vm
    public final void b(int i, int i2) {
        uu uuVar = this.a;
        uuVar.c.e(uuVar, i, i2, null);
    }

    @Override // defpackage.vm
    public final void c(int i, int i2, Object obj) {
        uu uuVar = this.a;
        uuVar.c.e(uuVar, i, i2, obj);
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        uu uuVar = this.a;
        uuVar.d += i2;
        sn snVar = (sn) uuVar.c;
        snVar.a.w(i + snVar.a(uuVar), i2);
        uu uuVar2 = this.a;
        if (uuVar2.d <= 0 || uuVar2.b.c != 2) {
            return;
        }
        ((sn) uuVar2.c).d();
    }

    @Override // defpackage.vm
    public final void e(int i, int i2) {
        uu uuVar = this.a;
        uuVar.d -= i2;
        sn snVar = (sn) uuVar.c;
        snVar.a.x(i + snVar.a(uuVar), i2);
        uu uuVar2 = this.a;
        if (uuVar2.d > 0 || uuVar2.b.c != 2) {
            return;
        }
        ((sn) uuVar2.c).d();
    }

    @Override // defpackage.vm
    public final void f() {
        ((sn) this.a.c).d();
    }

    @Override // defpackage.vm
    public final void g(int i, int i2) {
        ksw.b(true, "moving more than 1 item is not supported in RecyclerView");
        uu uuVar = this.a;
        sn snVar = (sn) uuVar.c;
        int a = snVar.a(uuVar);
        snVar.a.t(i + a, i2 + a);
    }
}
