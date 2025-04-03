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
public abstract class drhd extends dtaa implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    drhd() {
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
        drie drieVar = (drie) this;
        akgt akgtVar = (akgt) aX();
        drieVar.aK = (ernh) akgtVar.a.lm.b();
        drieVar.aL = akgtVar.a.ll;
        drieVar.aM = (ffsk) akgtVar.g.b();
        drieVar.aN = Optional.empty();
        ea eaVar = (ea) ((fbbb) akgtVar.d).a;
        fbbf fbbfVar = akgtVar.aE;
        akis akisVar = akgtVar.a;
        akko akkoVar = akisVar.b;
        akkp akkpVar = akisVar.a;
        ffsk ffskVar = (ffsk) akgtVar.g.b();
        fbbf fbbfVar2 = akgtVar.a.aU;
        Optional optional = (Optional) akgtVar.aF.b();
        akko akkoVar2 = akgtVar.a.b;
        drieVar.a = Optional.of(new wlg(eaVar, fbbfVar, akkoVar.pT, akkpVar.Px, ffskVar, fbbfVar2, optional, akkoVar2.je, akkoVar2.hO, akkoVar2.jf));
        akis akisVar2 = akgtVar.a;
        drieVar.b = new dqiz(akisVar2.ln, akisVar2.a.p, akisVar2.b.jq, akisVar2.lm, akisVar2.ll);
    }

    @Override // defpackage.dslv, defpackage.ea
    public void g(Context context) {
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

    public drhd(Integer num, dtab dtabVar) {
        super(num, dtabVar);
        this.d = new Object();
        this.e = false;
    }
}
