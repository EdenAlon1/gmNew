package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class druz extends efam implements fbat {
    private ContextWrapper ag;
    private boolean ah;
    private volatile fbae ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private void aU() {
        if (this.ag == null) {
            this.ag = new fbal.a(super.z(), this);
            this.ah = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    protected void aT() {
        if (this.ak) {
            return;
        }
        this.ak = true;
        ((drwc) this).ao = ((akgt) aX()).d();
    }

    protected fbae aV() {
        return new fbae(this);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.ai == null) {
            synchronized (this.aj) {
                if (this.ai == null) {
                    this.ai = aV();
                }
            }
        }
        return this.ai;
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
        aU();
        aT();
    }

    @Override // defpackage.dn, defpackage.ea
    public void g(Context context) {
        super.g(context);
        aU();
        aT();
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
        aU();
        return this.ag;
    }
}
