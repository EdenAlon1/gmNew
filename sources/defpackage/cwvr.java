package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class cwvr extends akuc implements fbat {
    private ContextWrapper aj;
    private boolean ak;
    private volatile fbae al;
    private final Object an = new Object();
    private boolean ao = false;

    private final void aU() {
        if (this.aj == null) {
            this.aj = new fbal.a(super.z(), this);
            this.ak = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.al == null) {
            synchronized (this.an) {
                if (this.al == null) {
                    this.al = new fbae(this);
                }
            }
        }
        return this.al;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    protected final void aY() {
        if (this.ao) {
            return;
        }
        this.ao = true;
        akgt akgtVar = (akgt) aX();
        ((cwrn) this).aj = (ctbe) akgtVar.a.b.hn.b();
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aU();
        aY();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        aU();
        aY();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.ak) {
            return null;
        }
        aU();
        return this.aj;
    }
}
