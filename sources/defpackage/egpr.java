package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
class egpr extends ea implements fbat, fbam {
    private ContextWrapper b;
    private boolean c;
    private volatile fbae d;
    private final Object e = new Object();
    public boolean a = false;

    private final void f() {
        if (this.b == null) {
            this.b = new fbal.a(super.z(), this);
            this.c = p(X()) ? fazm.a(super.z()) : true;
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
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = new fbae(this);
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        f();
        b();
    }

    protected final void b() {
        if (p(X()) && !this.a) {
            this.a = true;
            egpu egpuVar = (egpu) this;
            akgt akgtVar = (akgt) aX();
            egpuVar.b = new egpw(akgtVar.c.aH());
            egpuVar.c = akgtVar.G();
            egpuVar.d = (dvyc) akgtVar.a.b.jx.b();
            egpuVar.e = (egrf) akgtVar.c.cW.b();
        }
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.a;
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
        if (super.z() == null && !this.c) {
            return null;
        }
        f();
        return this.b;
    }
}
