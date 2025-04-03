package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dsas extends dtaa implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    dsas() {
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
        dsbf dsbfVar = (dsbf) this;
        akgt akgtVar = (akgt) aX();
        dsbfVar.aK = (ernh) akgtVar.a.lm.b();
        dsbfVar.aL = akgtVar.a.ll;
        dsbfVar.aM = (ffsk) akgtVar.g.b();
        dsbfVar.aN = Optional.of(akgtVar.c.cR);
        akgb akgbVar = akgtVar.c;
        dsbfVar.a = new dsbx(akgbVar.d, akgtVar.g, akgbVar.bl, akgtVar.a.ll);
        dsbfVar.b = Optional.of(true);
        dsbfVar.c = Optional.of(true);
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

    @Override // defpackage.fbat
    /* renamed from: he, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        e();
        return this.a;
    }

    public dsas(Integer num) {
        super(num);
        this.d = new Object();
        this.e = false;
    }
}
