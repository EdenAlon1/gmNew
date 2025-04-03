package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eezc extends eezj {
    private eezi c;
    private eezi d;
    private eezi e;
    private eezi f;
    private eezi g;
    private eezi h;

    public static final void i(efaa efaaVar) {
        if (efaaVar instanceof eeyu) {
            ((eeyu) efaaVar).a();
        }
    }

    public final void a(Bundle bundle) {
        eeyx eeyxVar = new eeyx(bundle);
        F(eeyxVar);
        this.d = eeyxVar;
    }

    public final void b() {
        eezi eeziVar = this.e;
        if (eeziVar != null) {
            E(eeziVar);
            this.e = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            efaaVar.getClass();
            if (efaaVar instanceof eeyq) {
                ((eeyq) efaaVar).a();
            }
        }
    }

    public final void c() {
        eezi eeziVar = this.c;
        if (eeziVar != null) {
            E(eeziVar);
            this.c = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            efaaVar.getClass();
            if (efaaVar instanceof eeyr) {
                ((eeyr) efaaVar).a();
            }
        }
    }

    @Override // defpackage.eezj
    public final void d() {
        super.d();
        eezi eeziVar = this.d;
        if (eeziVar != null) {
            E(eeziVar);
            this.d = null;
        }
        eezi eeziVar2 = this.f;
        if (eeziVar2 != null) {
            E(eeziVar2);
            this.f = null;
        }
        eezi eeziVar3 = this.h;
        if (eeziVar3 != null) {
            E(eeziVar3);
            this.h = null;
        }
    }

    public final void e() {
        if (this.h != null) {
            return;
        }
        eezb eezbVar = new eezb();
        F(eezbVar);
        this.h = eezbVar;
    }

    public final void g(Bundle bundle) {
        eeyz eeyzVar = new eeyz(bundle);
        F(eeyzVar);
        this.f = eeyzVar;
    }

    public final void h(boolean z) {
        eezi eeziVar = this.g;
        if (eeziVar != null) {
            E(eeziVar);
            this.g = null;
        }
        if (!z) {
            eeyy eeyyVar = new eeyy();
            F(eeyyVar);
            this.g = eeyyVar;
        } else {
            for (int i = 0; i < this.a.size(); i++) {
                i((efaa) this.a.get(i));
            }
        }
    }

    public final void j() {
        eeyw eeywVar = new eeyw();
        F(eeywVar);
        this.c = eeywVar;
    }

    public final void k(Bundle bundle) {
        eeza eezaVar = new eeza(bundle);
        F(eezaVar);
        this.e = eezaVar;
    }
}
