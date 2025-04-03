package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.ekkz;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class cxiw extends akuc implements fbat {
    private ContextWrapper aj;
    private boolean ak;
    private volatile ekky al;
    private final Object an = new Object();
    private boolean ao = false;

    private final void aU() {
        if (this.aj == null) {
            this.aj = new ekkz.a(super.z(), this);
            this.ak = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return ekjv.a(this, super.R());
    }

    protected ekky aV() {
        throw null;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final ekky aW() {
        if (this.al == null) {
            synchronized (this.an) {
                if (this.al == null) {
                    this.al = aV();
                }
            }
        }
        return this.al;
    }

    @Override // defpackage.efad, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aU();
        ba();
    }

    protected final void ba() {
        if (this.ao) {
            return;
        }
        this.ao = true;
        aX();
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        aU();
        ba();
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.ak) {
            return null;
        }
        aU();
        return this.aj;
    }
}
