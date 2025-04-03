package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkg implements ljv {
    private final lkv a;
    private final ekxu b;

    public ekkg(ekxu ekxuVar, lkv lkvVar) {
        this.a = lkvVar;
        this.b = ekxuVar;
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        ekyf.j();
        try {
            this.a.e(lki.ON_PAUSE);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        ekxu ekxuVar = this.b;
        try {
            elav b = ekxuVar.b();
            try {
                this.a.e(lki.ON_RESUME);
                b.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } finally {
            ekxuVar.a = null;
            ekxuVar.b = null;
        }
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        ekyf.j();
        try {
            this.a.e(lki.ON_STOP);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        elav b = this.b.b();
        try {
            this.a.e(lki.ON_DESTROY);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        ekyf.j();
        try {
            this.a.e(lki.ON_CREATE);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        ekyf.j();
        try {
            this.a.e(lki.ON_START);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
