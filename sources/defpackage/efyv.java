package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efyv extends ea implements fbat, fbam {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d = new Object();
    public boolean at = false;

    private final void f() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = p(X()) ? fazm.a(super.z()) : true;
        }
    }

    private static final boolean p(Object obj) {
        if (obj instanceof fbas) {
            return !(obj instanceof fbam) || ((fbam) obj).e();
        }
        return false;
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return !p(X()) ? super.R() : fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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
        f();
        b();
    }

    protected final void b() {
        if (p(X()) && !this.at) {
            this.at = true;
            efyu efyuVar = (efyu) this;
            akgt akgtVar = (akgt) aX();
            efyuVar.a = (lmw) akgtVar.c.cl.b();
            efyuVar.b = (egrf) akgtVar.c.cW.b();
            efyuVar.d = akgtVar.a.b.oC;
            efyuVar.e = (egdg) akgtVar.c.bF.b();
            efyuVar.ag = (egda) akgtVar.c.cr.b();
            efyuVar.ah = (dvyc) akgtVar.a.b.jx.b();
            efyuVar.ai = (dvxy) akgtVar.a.b.jy.b();
            efyuVar.aj = (dvxi) akgtVar.a.b.jA.b();
        }
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.at;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        f();
        b();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        f();
        return this.a;
    }
}
