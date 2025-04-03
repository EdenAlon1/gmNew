package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes2.dex */
class akql extends efae implements fbat {
    private ContextWrapper ag;
    private boolean ai;
    private volatile fbae aj;
    private final Object ak = new Object();
    private boolean al = false;

    private final void aY() {
        if (this.ag == null) {
            this.ag = new fbal.a(super.z(), this);
            this.ai = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.aj == null) {
            synchronized (this.ak) {
                if (this.aj == null) {
                    this.aj = aU();
                }
            }
        }
        return this.aj;
    }

    protected fbae aU() {
        throw null;
    }

    protected final void aV() {
        if (this.al) {
            return;
        }
        this.al = true;
        aX();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.efae, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aY();
        aV();
    }

    @Override // defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aY();
        aV();
    }

    @Override // defpackage.dn, defpackage.ea
    public LayoutInflater gI(Bundle bundle) {
        LayoutInflater gI = super.gI(bundle);
        return gI.cloneInContext(new fbal.a(gI, this));
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.ai) {
            return null;
        }
        aY();
        return this.ag;
    }
}
