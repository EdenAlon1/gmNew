package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efvh extends ea implements fbat, fbam {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d = new Object();
    public boolean as = false;

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
        if (p(X()) && !this.as) {
            this.as = true;
            efvf efvfVar = (efvf) this;
            akgt akgtVar = (akgt) aX();
            efvfVar.a = akgtVar.b();
            akgb akgbVar = akgtVar.c;
            fbbf fbbfVar = akgbVar.bU;
            akko akkoVar = akgtVar.a.b;
            efvfVar.b = new efzq(fbbfVar, akkoVar.jx, akkoVar.jy, akkoVar.jA, akgbVar.cm);
            efvfVar.ar = akgtVar.c.at();
            efvfVar.c = (dvxy) akgtVar.a.b.jy.b();
            efvfVar.d = (dvyc) akgtVar.a.b.jx.b();
            efvfVar.e = (egdg) akgtVar.c.bF.b();
            efvfVar.ag = (egde) akgtVar.cg.b();
            efvfVar.ah = (egda) akgtVar.c.cr.b();
            efvfVar.ai = (egrf) akgtVar.c.cW.b();
        }
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.as;
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
