package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtit extends dtaa implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    dtit() {
        this.d = new Object();
        this.e = false;
    }

    private final void e() {
        if (this.a == null) {
            this.a = new fbal.a(super.z(), this);
            this.b = fazm.a(super.z());
        }
    }

    @Override // defpackage.ea, defpackage.lkd
    public final lms R() {
        return fazp.b(this, super.R());
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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
        e();
        b();
    }

    protected final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        dtjq dtjqVar = (dtjq) this;
        akgt akgtVar = (akgt) aX();
        dtjqVar.aK = (ernh) akgtVar.a.lm.b();
        dtjqVar.aL = akgtVar.a.ll;
        dtjqVar.aM = (ffsk) akgtVar.g.b();
        dtjqVar.aN = Optional.empty();
        dtjqVar.b = (dqli) akgtVar.c.bl.b();
        dtjqVar.c = (AudioManager) akgtVar.a.nY.b();
        akko akkoVar = akgtVar.a.b;
        dtjqVar.d = new dtld(new dtdy((Context) akkoVar.a.q.b(), (ffsk) akkoVar.a.a.p.b()), (Activity) akgtVar.c.d.b(), Optional.of(new dtkq()));
    }

    @Override // defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        e();
        b();
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
        e();
        return this.a;
    }

    public dtit(Integer num) {
        super(num);
        this.d = new Object();
        this.e = false;
    }
}
