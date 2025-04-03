package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aesq extends drwc {
    private ContextWrapper aq;
    private boolean ar;
    private boolean as = false;

    private final void aU() {
        if (this.aq == null) {
            this.aq = new fbal.a(super.z(), this);
            this.ar = fazm.a(super.z());
        }
    }

    @Override // defpackage.druz
    protected final void aT() {
        if (this.as) {
            return;
        }
        this.as = true;
        ((drwc) ((aesr) this)).ao = ((akgt) aX()).d();
    }

    @Override // defpackage.druz, defpackage.efam, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.aq;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aU();
        aT();
    }

    @Override // defpackage.druz, defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aU();
        aT();
    }

    @Override // defpackage.druz, defpackage.dn, defpackage.ea
    public LayoutInflater gI(Bundle bundle) {
        LayoutInflater gI = super.gI(bundle);
        return gI.cloneInContext(new fbal.a(gI, this));
    }

    @Override // defpackage.druz, defpackage.ea
    public Context z() {
        if (super.z() == null && !this.ar) {
            return null;
        }
        aU();
        return this.aq;
    }
}
