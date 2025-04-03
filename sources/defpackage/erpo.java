package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erpo extends erob {
    private erpn b;

    public erpo(engi engiVar, boolean z, Executor executor, erog erogVar) {
        super(engiVar, z, false);
        this.b = new erpl(this, erogVar, executor);
        o();
    }

    @Override // defpackage.erob
    public final void g() {
        erpn erpnVar = this.b;
        if (erpnVar != null) {
            erpnVar.f();
        }
    }

    @Override // defpackage.ernr
    protected final void k() {
        erpn erpnVar = this.b;
        if (erpnVar != null) {
            erpnVar.h();
        }
    }

    @Override // defpackage.erob
    public final void q(int i) {
        super.q(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public erpo(engi engiVar, boolean z, Executor executor, Callable callable) {
        super(engiVar, z, false);
        this.b = new erpm(this, callable, executor);
        o();
    }

    @Override // defpackage.erob
    public final void e(int i, Object obj) {
    }
}
