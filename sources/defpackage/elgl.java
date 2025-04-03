package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elgl extends fect {
    private final fect a;
    private final elds b;

    public elgl(fect fectVar, elds eldsVar) {
        this.a = fectVar;
        this.b = eldsVar;
    }

    @Override // defpackage.fect
    public final void a() {
        elav a = this.b.a();
        try {
            this.a.a();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fect
    public final void b() {
        elav a = this.b.a();
        try {
            this.a.b();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fect
    public final void c() {
        elav a = this.b.a();
        try {
            this.a.c();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fect
    public final void d(Object obj) {
        elav a = this.b.a();
        try {
            this.a.d(obj);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fect
    public final void e() {
        elav a = this.b.a();
        try {
            this.a.e();
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
