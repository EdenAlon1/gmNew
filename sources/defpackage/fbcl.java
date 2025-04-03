package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbcl extends fbcc {
    private final fbcc b;

    public fbcl(fbcc fbccVar) {
        this.b = fbccVar;
    }

    @Override // defpackage.fbcc
    public final void b(Throwable th) {
        try {
            this.b.b(th);
        } catch (RuntimeException e) {
            fbco.c(e, this.b, "failed", th);
        }
    }

    @Override // defpackage.fbcc
    public final void c() {
        try {
            this.b.c();
        } catch (RuntimeException e) {
            fbco.e(e, this.b, "methodFinished");
        }
    }

    @Override // defpackage.fbcc
    public final void d() {
        try {
            this.b.d();
        } catch (RuntimeException e) {
            fbco.e(e, this.b, "methodStarting");
        }
    }

    @Override // defpackage.fbcc
    public final void e() {
        try {
            this.b.e();
        } catch (RuntimeException e) {
            fbco.e(e, this.b, "ready");
        }
    }

    @Override // defpackage.fbcc
    public final void f() {
        try {
            this.b.f();
        } catch (RuntimeException e) {
            fbco.e(e, this.b, "requested");
        }
    }

    @Override // defpackage.fbcc
    public final void g(Object obj) {
        try {
            this.b.g(obj);
        } catch (RuntimeException e) {
            fbco.c(e, this.b, "succeeded", obj);
        }
    }
}
