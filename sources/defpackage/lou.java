package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lou extends lpb implements Runnable {
    boolean a;
    final /* synthetic */ lov b;

    public lou(lov lovVar) {
        this.b = lovVar;
    }

    @Override // defpackage.lpb
    protected final Object a() {
        try {
            return this.b.b();
        } catch (kqz e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.lpb
    protected final void b(Object obj) {
        this.b.c(this, obj);
    }

    @Override // defpackage.lpb
    protected final void c(Object obj) {
        lov lovVar = this.b;
        if (lovVar.a != this) {
            lovVar.c(this, obj);
            return;
        }
        if (lovVar.e) {
            lovVar.e(obj);
            return;
        }
        lovVar.i();
        SystemClock.uptimeMillis();
        lovVar.a = null;
        lovVar.j(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.d();
    }
}
