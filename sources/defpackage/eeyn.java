package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eeyn extends eezj {
    private eezi c;
    private eezi d;
    private eezi e;
    private eezi f;

    public final void a() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eexm) {
                ((eexm) efaaVar).a();
            }
        }
    }

    public final void b() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eexn) {
                ((eexn) efaaVar).a();
            }
        }
    }

    public final void c() {
        eeym eeymVar = new eeym();
        F(eeymVar);
        this.f = eeymVar;
    }

    @Override // defpackage.eezj
    public final void d() {
        eezi eeziVar = this.d;
        if (eeziVar != null) {
            E(eeziVar);
            this.d = null;
        }
        eezi eeziVar2 = this.c;
        if (eeziVar2 != null) {
            E(eeziVar2);
            this.c = null;
        }
        super.d();
    }

    public final void e() {
        eezi eeziVar = this.f;
        if (eeziVar != null) {
            E(eeziVar);
            this.f = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            efaaVar.getClass();
            if (efaaVar instanceof eext) {
                ((eext) efaaVar).a();
            }
        }
    }

    @Override // defpackage.eezj
    public final void f() {
        eezi eeziVar = this.e;
        if (eeziVar != null) {
            E(eeziVar);
            this.e = null;
        }
        super.f();
    }

    public final void g(Bundle bundle) {
        eeyj eeyjVar = new eeyj(bundle);
        F(eeyjVar);
        this.c = eeyjVar;
    }

    public final void h() {
        eeyl eeylVar = new eeyl();
        F(eeylVar);
        this.e = eeylVar;
    }

    public final void i(Bundle bundle) {
        eeyk eeykVar = new eeyk(bundle);
        F(eeykVar);
        this.d = eeykVar;
    }

    public final void j() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eeyf) {
                ((eeyf) efaaVar).a();
            }
        }
    }

    public final void k() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eeyg) {
                ((eeyg) efaaVar).a();
            }
        }
    }

    public final boolean l() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if ((efaaVar instanceof eexs) && ((eexs) efaaVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if ((efaaVar instanceof eexl) && ((eexl) efaaVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final void n() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eexq) {
                ((eexq) efaaVar).a();
            }
        }
    }

    public final void o(Consumer consumer) {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eexu) {
                ((eexu) efaaVar).a();
                return;
            }
        }
        consumer.accept(Collections.EMPTY_LIST);
    }

    public final boolean p() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if ((efaaVar instanceof eexv) && ((eexv) efaaVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if ((efaaVar instanceof eexw) && ((eexw) efaaVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final void r() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eexx) {
                ((eexx) efaaVar).a();
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eexy) {
                ((eexy) efaaVar).a();
                return;
            }
        }
    }

    public final void t() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eeyb) {
                ((eeyb) efaaVar).a();
            }
        }
    }

    public final void u() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eeyc) {
                ((eeyc) efaaVar).a();
            }
        }
    }

    public final void v() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eeyh) {
                ((eeyh) efaaVar).a();
            }
        }
    }

    public final void w() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eeyi) {
                ((eeyi) efaaVar).a();
            }
        }
    }
}
