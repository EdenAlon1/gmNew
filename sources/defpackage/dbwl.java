package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbwl extends efam implements fbat {
    private ContextWrapper ag;
    private boolean ah;
    private volatile fbae ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void aT() {
        if (this.ag == null) {
            this.ag = new fbal.a(super.z(), this);
            this.ah = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    protected fbae aU() {
        throw null;
    }

    @Override // defpackage.fbat
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.ai == null) {
            synchronized (this.aj) {
                if (this.ai == null) {
                    this.ai = aU();
                }
            }
        }
        return this.ai;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    protected final void aY() {
        if (this.ak) {
            return;
        }
        this.ak = true;
        aX();
    }

    @Override // defpackage.efam, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aT();
        aY();
    }

    @Override // defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aT();
        aY();
    }

    @Override // defpackage.dn, defpackage.ea
    public LayoutInflater gI(Bundle bundle) {
        LayoutInflater gI = super.gI(bundle);
        return gI.cloneInContext(new fbal.a(gI, this));
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.ah) {
            return null;
        }
        aT();
        return this.ag;
    }
}
