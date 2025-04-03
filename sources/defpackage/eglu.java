package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eglu extends ea implements fbat, fbam {
    private ContextWrapper a;
    public boolean as;
    private boolean b;
    private volatile fbae c;
    private final Object d;

    public eglu() {
        this.d = new Object();
        this.as = false;
    }

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
        t();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.as;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        a();
        t();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.fbat
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
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

    protected final void t() {
        if (b(X()) && !this.as) {
            this.as = true;
            DevicePhotosFragment devicePhotosFragment = (DevicePhotosFragment) this;
            akgt akgtVar = (akgt) aX();
            devicePhotosFragment.a = ((egdr) akgtVar.c.bQ.b()).a();
            akgb akgbVar = akgtVar.c;
            fbbf fbbfVar = akgbVar.bU;
            akko akkoVar = akgtVar.a.b;
            devicePhotosFragment.b = new eglt(fbbfVar, akkoVar.jA, akkoVar.jx, akgbVar.cm, akgbVar.cX);
            devicePhotosFragment.c = (egrf) akgtVar.c.cW.b();
            devicePhotosFragment.d = (dvyc) akgtVar.a.b.jx.b();
            devicePhotosFragment.e = (dvxy) akgtVar.a.b.jy.b();
            devicePhotosFragment.ag = (dvxi) akgtVar.a.b.jA.b();
            devicePhotosFragment.ah = akgtVar.c.ax();
            devicePhotosFragment.ai = (egjk) akgtVar.c.cm.b();
            devicePhotosFragment.aj = (egdg) akgtVar.c.bF.b();
            devicePhotosFragment.ak = (egcx) akgtVar.c.cX.b();
            devicePhotosFragment.al = akgtVar.a.b.oC;
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

    eglu(int i) {
        super(i);
        this.d = new Object();
        this.as = false;
    }
}
