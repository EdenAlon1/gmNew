package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efxm extends ea implements fbat, fbam {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d = new Object();
    public boolean ap = false;

    private final void a() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = b(X()) ? fazm.a(super.z()) : true;
        }
    }

    private static final boolean b(Object obj) {
        if (obj instanceof fbas) {
            return !(obj instanceof fbam) || ((fbam) obj).e();
        }
        return false;
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return !b(X()) ? super.R() : fazp.b(this, super.R());
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        q();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.ap;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        q();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.fbat
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new fbae(this);
                }
            }
        }
        return this.c;
    }

    protected final void q() {
        if (b(X()) && !this.ap) {
            this.ap = true;
            efxl efxlVar = (efxl) this;
            akgt akgtVar = (akgt) aX();
            efxlVar.a = akgtVar.b();
            efxlVar.ao = akgtVar.c.at();
            efxlVar.c = (egdg) akgtVar.c.bF.b();
            efxlVar.d = akgtVar.a.b.oC;
            efxlVar.e = (egda) akgtVar.c.cr.b();
            efxlVar.ag = (dvyc) akgtVar.a.b.jx.b();
            efxlVar.ah = (dvxy) akgtVar.a.b.jy.b();
            efxlVar.ai = (dvxi) akgtVar.a.b.jA.b();
        }
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }
}
