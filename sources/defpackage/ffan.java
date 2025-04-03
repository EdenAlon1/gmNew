package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffan extends ffam {
    private final fdxo a;
    private boolean b = false;
    private boolean c = false;

    public ffan(fdxo fdxoVar) {
        this.a = fdxoVar;
    }

    @Override // defpackage.ffbc
    public final void a() {
        this.a.d();
        this.c = true;
    }

    @Override // defpackage.ffbc
    public final void b(Throwable th) {
        this.a.c("Cancelled by client with StreamObserver.onError()", th);
        this.b = true;
    }

    @Override // defpackage.ffbc
    public final void c(Object obj) {
        emxf.m(!this.b, "Stream was terminated by error, no further calls are allowed");
        emxf.m(!this.c, "Stream is already completed, no further calls are allowed");
        this.a.f(obj);
    }

    @Override // defpackage.ffam
    public final void d(String str, Throwable th) {
        this.a.c(str, th);
    }

    public final void e() {
        this.a.e(1);
    }
}
