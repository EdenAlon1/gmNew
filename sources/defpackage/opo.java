package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class opo extends vm {
    private final opq a;

    public opo(opq opqVar) {
        ksw.a(true);
        this.a = opqVar;
    }

    @Override // defpackage.vm
    public final void a() {
        this.a.f();
    }

    @Override // defpackage.vm
    public final void c(int i, int i2, Object obj) {
        if ("Selection-Changed".equals(obj)) {
            return;
        }
        this.a.f();
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        this.a.c();
    }

    @Override // defpackage.vm
    public final void e(int i, int i2) {
        this.a.c();
        this.a.f();
    }

    @Override // defpackage.vm
    public final void g(int i, int i2) {
        this.a.c();
    }
}
