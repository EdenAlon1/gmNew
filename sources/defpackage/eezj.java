package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eezj {
    private static final Bundle c = new Bundle();
    public final List a = new ArrayList();
    protected final List b = new ArrayList();
    private eezi d;
    private eezi e;
    private eezi f;
    private eezi g;
    private eezi h;

    public eezj() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public static final String G(efaa efaaVar) {
        if (efaaVar instanceof eezx) {
            return efaaVar instanceof efab ? ((efab) efaaVar).a() : efaaVar.getClass().getName();
        }
        return null;
    }

    public static final Bundle H(efaa efaaVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String G = G(efaaVar);
        return G != null ? bundle.getBundle(G) : c;
    }

    public static final void I(efaa efaaVar) {
        if (efaaVar instanceof eeye) {
            ((eeye) efaaVar).a();
        }
    }

    public final void A(Bundle bundle) {
        eezh eezhVar = new eezh(bundle);
        F(eezhVar);
        this.g = eezhVar;
    }

    public final void B() {
        eezf eezfVar = new eezf();
        F(eezfVar);
        this.e = eezfVar;
    }

    public final void C() {
        eezi eeziVar = this.e;
        if (eeziVar != null) {
            E(eeziVar);
            this.e = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            efaaVar.getClass();
            if (efaaVar instanceof eezz) {
                ((eezz) efaaVar).a();
            }
        }
    }

    public final void D(boolean z) {
        if (z) {
            eezi eeziVar = new eezi() { // from class: eezd
                @Override // defpackage.eezi
                public final void a(efaa efaaVar) {
                    eezj.I(efaaVar);
                }
            };
            F(eeziVar);
            this.h = eeziVar;
            return;
        }
        eezi eeziVar2 = this.h;
        if (eeziVar2 != null) {
            E(eeziVar2);
            this.h = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            I((efaa) this.a.get(i));
        }
    }

    public final void E(eezi eeziVar) {
        this.b.remove(eeziVar);
    }

    public final void F(eezi eeziVar) {
        efbd.c();
        for (int i = 0; i < this.a.size(); i++) {
            eeziVar.a((efaa) this.a.get(i));
        }
        this.b.add(eeziVar);
    }

    public final void J() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eezk) {
                ((eezk) efaaVar).a();
            }
        }
    }

    public final void K() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eezl) {
                ((eezl) efaaVar).a();
            }
        }
    }

    public final boolean L() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if ((efaaVar instanceof eezm) && ((eezm) efaaVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final void M() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eezo) {
                ((eezo) efaaVar).a();
            }
        }
    }

    public final boolean N() {
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eezp) {
                z |= ((eezp) efaaVar).a();
            }
        }
        return z;
    }

    public final boolean O() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if ((efaaVar instanceof eezs) && ((eezs) efaaVar).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean P() {
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eezu) {
                z |= ((eezu) efaaVar).a();
            }
        }
        return z;
    }

    public final void Q() {
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            if (efaaVar instanceof eezv) {
                ((eezv) efaaVar).a();
            }
        }
    }

    public void d() {
        eezi eeziVar = this.g;
        if (eeziVar != null) {
            E(eeziVar);
            this.g = null;
        }
        eezi eeziVar2 = this.d;
        if (eeziVar2 != null) {
            E(eeziVar2);
            this.d = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            efaaVar.getClass();
            if (efaaVar instanceof eezq) {
                ((eezq) efaaVar).a();
            }
        }
    }

    public void f() {
        eezi eeziVar = this.f;
        if (eeziVar != null) {
            E(eeziVar);
            this.f = null;
        }
        for (int i = 0; i < this.a.size(); i++) {
            efaa efaaVar = (efaa) this.a.get(i);
            efaaVar.getClass();
            if (efaaVar instanceof eezt) {
                ((eezt) efaaVar).a();
            }
        }
    }

    public final void x(Bundle bundle) {
        eeze eezeVar = new eeze(bundle);
        F(eezeVar);
        this.d = eezeVar;
    }

    public final void y() {
        for (efaa efaaVar : this.a) {
            if (efaaVar instanceof eezr) {
                ((eezr) efaaVar).a();
            }
        }
    }

    public final void z() {
        eezg eezgVar = new eezg();
        F(eezgVar);
        this.f = eezgVar;
    }
}
