package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes3.dex */
class czys extends ekkc implements fbat {
    private ContextWrapper b;
    private boolean c;
    private volatile fbae d;
    private final Object e = new Object();
    private boolean ag = false;

    private final void f() {
        if (this.b == null) {
            this.b = new fbal.a(super.z(), this);
            this.c = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = b();
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
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && fbae.d(contextWrapper) != activity) {
            z = false;
        }
        fbau.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        f();
        e();
    }

    protected fbae b() {
        throw null;
    }

    protected final void e() {
        if (this.ag) {
            return;
        }
        this.ag = true;
        aX();
    }

    @Override // defpackage.ekkc, defpackage.ea
    public void g(Context context) {
        super.g(context);
        f();
        e();
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.c) {
            return null;
        }
        f();
        return this.b;
    }
}
