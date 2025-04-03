package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ejgn extends ekkd implements fbat {
    private ContextWrapper a;
    private final Object ag = new Object();
    private boolean ah = false;
    private boolean d;
    private volatile fbae e;

    private final void f() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.d = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbae aW() {
        if (this.e == null) {
            synchronized (this.ag) {
                if (this.e == null) {
                    this.e = b();
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.efaf, defpackage.ea
    public void ag(Activity activity) {
        super.ag(activity);
        ContextWrapper contextWrapper = this.a;
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
        if (this.ah) {
            return;
        }
        this.ah = true;
        aX();
    }

    @Override // defpackage.ekkd, defpackage.ea
    public void g(Context context) {
        super.g(context);
        f();
        e();
    }

    @Override // defpackage.ea
    public Context z() {
        if (super.z() == null && !this.d) {
            return null;
        }
        f();
        return this.a;
    }
}
