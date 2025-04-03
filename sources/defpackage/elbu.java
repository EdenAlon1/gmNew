package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbu implements fl {
    ekzm a = null;
    boolean b = false;
    final /* synthetic */ elbx c;

    public elbu(elbx elbxVar) {
        this.c = elbxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fl
    public final void c(ea eaVar, boolean z) {
        if (z && this.a == null && !ekyf.v()) {
            boolean w = ekyf.w();
            this.b = w;
            if (!w) {
                this.a = this.c.b("FragmentTransaction Popped");
            }
        }
        if (Build.VERSION.SDK_INT >= 34 && z && (eaVar instanceof elar)) {
            ((elar) eaVar).be(elds.b());
        }
    }

    @Override // defpackage.fl
    public final void d() {
        if (this.b) {
            this.b = false;
            ekyf.q();
            return;
        }
        ekzm ekzmVar = this.a;
        if (ekzmVar != null) {
            ekzmVar.close();
            this.a = null;
        }
    }

    @Override // defpackage.fl
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.fl
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.fl
    public final /* synthetic */ void b(ea eaVar, boolean z) {
    }
}
