package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efyo extends ea implements fbat, fbam {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d = new Object();
    public boolean av = false;

    private final void a() {
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
        f();
    }

    @Override // defpackage.fbat
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.fbam
    public final boolean e() {
        return this.av;
    }

    protected final void f() {
        if (p(X()) && !this.av) {
            this.av = true;
            efyj efyjVar = (efyj) this;
            akgt akgtVar = (akgt) aX();
            efyjVar.a = akgtVar.b();
            efyjVar.b = (lmw) akgtVar.c.cl.b();
            efyjVar.au = akgtVar.c.at();
            akko akkoVar = akgtVar.a.b;
            efyjVar.c = new efyn(akkoVar.jx, akkoVar.jy, akkoVar.jA);
            efyjVar.d = (egrf) akgtVar.c.cW.b();
            efyjVar.e = akgtVar.a.b.oC;
            efyjVar.ag = (egdg) akgtVar.c.bF.b();
            efyjVar.ah = (egda) akgtVar.c.cr.b();
            efyjVar.ai = (dvyc) akgtVar.a.b.jx.b();
            efyjVar.aj = (dvxy) akgtVar.a.b.jy.b();
            efyjVar.ak = (dvxi) akgtVar.a.b.jA.b();
        }
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        f();
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
        a();
        return this.a;
    }
}
