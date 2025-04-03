package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mdj implements mbh {
    private final Object a = new Object();
    private mds b;
    protected final mdt n;

    public mdj(mdt mdtVar) {
        this.n = mdtVar;
    }

    @Override // defpackage.mbh
    public /* synthetic */ void c() {
        throw null;
    }

    public abstract int d();

    protected void e() {
        synchronized (this.a) {
            mds mdsVar = this.b;
            if (mdsVar != null) {
                this.n.f(mdsVar);
            }
        }
    }

    public abstract void g();

    public abstract void h(mbj mbjVar);

    public abstract void i();

    public void j(Bitmap bitmap, lqf lqfVar, ltr ltrVar) {
        throw new UnsupportedOperationException();
    }

    public void n(lqf lqfVar) {
        throw new UnsupportedOperationException();
    }

    public final void s(mds mdsVar) {
        synchronized (this.a) {
            this.b = mdsVar;
        }
    }

    public Surface v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mbh
    public final void w() {
        this.n.d(new mds() { // from class: mdi
            @Override // defpackage.mds
            public final void a() {
                mdj.this.e();
            }
        });
    }

    public void y(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void z(mbv mbvVar) {
        throw new UnsupportedOperationException();
    }

    public void l() {
    }

    public void o() {
    }

    @Override // defpackage.mbh
    public /* synthetic */ void b(lqh lqhVar) {
    }

    public void r(lqf lqfVar, boolean z) {
    }
}
