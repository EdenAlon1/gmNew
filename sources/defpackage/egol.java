package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
class egol extends ehbo implements fbat, fbam {
    private ContextWrapper ah;
    private boolean ai;
    private volatile fbae aj;
    private final Object ak = new Object();
    public boolean ag = false;

    private final void aV() {
        if (this.ah == null) {
            this.ah = new fbal.a(super.z(), this);
            this.ai = aY(X()) ? fazm.a(super.z()) : true;
        }
    }

    private static final boolean aY(Object obj) {
        if (obj instanceof fbas) {
            return !(obj instanceof fbam) || ((fbam) obj).e();
        }
        return false;
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return !aY(X()) ? super.R() : fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.aj == null) {
            synchronized (this.ak) {
                if (this.aj == null) {
                    this.aj = new fbae(this);
                }
            }
        }
        return this.aj;
    }

    protected final void aU() {
        if (aY(X()) && !this.ag) {
            this.ag = true;
            egot egotVar = (egot) this;
            akgt akgtVar = (akgt) aX();
            egotVar.ah = akgtVar.a.b.cU();
            egotVar.ai = (egrf) akgtVar.c.cW.b();
            egotVar.aj = (egaj) akgtVar.c.bU.b();
            egotVar.ak = (dvyc) akgtVar.a.b.jx.b();
            egotVar.al = (dvxi) akgtVar.a.b.jA.b();
            egotVar.am = akgtVar.c.ax();
            egotVar.an = (egjk) akgtVar.c.cm.b();
            egotVar.ao = (egdg) akgtVar.c.bF.b();
            egotVar.ap = (egcx) akgtVar.c.cX.b();
            egotVar.aq = (egrj) akgtVar.c.cs.b();
        }
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ah;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aV();
        aU();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.ag;
    }

    @Override // defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aV();
        aU();
    }

    @Override // defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater gI = super.gI(bundle);
        return gI.cloneInContext(new fbal.a(gI, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.ai) {
            return null;
        }
        aV();
        return this.ah;
    }
}
