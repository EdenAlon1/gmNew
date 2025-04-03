package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwf {
    private Executor a;
    private Context b;
    private emyl c;
    private emxc d;
    private emxc e;

    public dxwf() {
        emux emuxVar = emux.a;
        this.d = emuxVar;
        this.e = emuxVar;
    }

    public final dxwg a() {
        return new dxwq(this.b, this.e, this.a, this.d, this.c);
    }

    public final void b(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void c(Executor executor) {
        executor.getClass();
        this.a = new ersb(executor);
    }

    public final void d(dxwr dxwrVar) {
        this.d = emxc.j(dxwrVar);
    }

    public final void e(emyl emylVar) {
        this.c = emys.a(emylVar);
    }

    public final void f(Class cls) {
        this.e = emxc.j(cls);
    }
}
