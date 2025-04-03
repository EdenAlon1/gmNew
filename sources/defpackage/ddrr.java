package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class ddrr extends ddtz implements fbat {
    private ContextWrapper ag;
    private boolean ah;
    private volatile fbae ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void ba() {
        if (this.ag == null) {
            this.ag = new fbal.a(super.z(), this);
            this.ah = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.ai == null) {
            synchronized (this.aj) {
                if (this.ai == null) {
                    this.ai = new fbae(this);
                }
            }
        }
        return this.ai;
    }

    protected final void aU() {
        if (this.ak) {
            return;
        }
        this.ak = true;
        ddso ddsoVar = (ddso) this;
        akgt akgtVar = (akgt) aX();
        ddsoVar.ai = (akvg) akgtVar.a.a.Px.b();
        ddsoVar.aj = (ayfg) akgtVar.a.a.nW.b();
        ddsoVar.ak = (ddqu) akgtVar.c.bt.b();
        ddsoVar.al = akgtVar.bH;
        ddsoVar.am = akgtVar.c.m;
        akis akisVar = akgtVar.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ba();
        aU();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        ba();
        aU();
    }

    @Override // defpackage.dn, defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater gI = super.gI(bundle);
        return gI.cloneInContext(new fbal.a(gI, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.ah) {
            return null;
        }
        ba();
        return this.ag;
    }
}
