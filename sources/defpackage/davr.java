package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class davr extends ea implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    public davr() {
        this.d = new Object();
        this.e = false;
    }

    private final void a() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
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
        f();
    }

    @Override // defpackage.fbat
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
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

    protected final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        DebugMmsConfigFragment debugMmsConfigFragment = (DebugMmsConfigFragment) this;
        akgt akgtVar = (akgt) aX();
        debugMmsConfigFragment.e = (ctwb) akgtVar.a.a.c.b();
        akkp akkpVar = akgtVar.a.a;
        debugMmsConfigFragment.ag = new daee(akkpVar.ft, akkpVar.hO, akkpVar.DJ);
        debugMmsConfigFragment.ah = (csrv) akgtVar.a.a.iK.b();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        a();
        f();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }

    davr(int i) {
        super(i);
        this.d = new Object();
        this.e = false;
    }
}
