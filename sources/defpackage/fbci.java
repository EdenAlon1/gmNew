package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbci extends fbcc {
    private final engw b;

    public fbci(engw engwVar) {
        this.b = engwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbcc
    public final void b(Throwable th) {
        engw a = this.b.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            fbcc fbccVar = (fbcc) a.get(i);
            try {
                fbccVar.b(th);
            } catch (RuntimeException e) {
                fbco.c(e, fbccVar, "failed", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbcc
    public final void c() {
        engw a = this.b.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            fbcc fbccVar = (fbcc) a.get(i);
            try {
                fbccVar.c();
            } catch (RuntimeException e) {
                fbco.e(e, fbccVar, "methodFinished");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbcc
    public final void d() {
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                return;
            }
            fbcc fbccVar = (fbcc) engwVar.get(i);
            try {
                fbccVar.d();
            } catch (RuntimeException e) {
                fbco.e(e, fbccVar, "methodStarting");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbcc
    public final void e() {
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                return;
            }
            fbcc fbccVar = (fbcc) engwVar.get(i);
            try {
                fbccVar.e();
            } catch (RuntimeException e) {
                fbco.e(e, fbccVar, "ready");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbcc
    public final void f() {
        int i = 0;
        while (true) {
            engw engwVar = this.b;
            if (i >= ((enou) engwVar).c) {
                return;
            }
            fbcc fbccVar = (fbcc) engwVar.get(i);
            try {
                fbccVar.f();
            } catch (RuntimeException e) {
                fbco.e(e, fbccVar, "requested");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbcc
    public final void g(Object obj) {
        engw a = this.b.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            fbcc fbccVar = (fbcc) a.get(i);
            try {
                fbccVar.g(obj);
            } catch (RuntimeException e) {
                fbco.c(e, fbccVar, "succeeded", obj);
            }
        }
    }
}
