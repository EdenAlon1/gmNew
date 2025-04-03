package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.messaging.R;
import defpackage.fbal;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dscs extends drgb implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    public dscs(drgk drgkVar, drfe drfeVar) {
        super(R.string.sticker_search_hint, R.string.sticker_screen_no_result, drgkVar, drfeVar);
        this.d = new Object();
        this.e = false;
    }

    private final void bk() {
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
        bk();
        b();
    }

    protected final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        dsed dsedVar = (dsed) this;
        akgt akgtVar = (akgt) aX();
        dsedVar.aK = (ernh) akgtVar.a.lm.b();
        dsedVar.aL = akgtVar.a.ll;
        dsedVar.aM = (ffsk) akgtVar.g.b();
        dsedVar.aN = Optional.of(akgtVar.a.b.pU);
        dsedVar.aq = (ffsk) akgtVar.a.a.p.b();
        dsedVar.ar = akgtVar.E();
        dsedVar.as = (dtdg) akgtVar.bQ.b();
        dsedVar.at = akgtVar.cc;
        dsedVar.au = akgtVar.F();
        fbbf fbbfVar = akgtVar.g;
        akis akisVar = akgtVar.a;
        fbbf fbbfVar2 = akisVar.q;
        akko akkoVar = akisVar.b;
        dsedVar.av = new drgx(fbbfVar, fbbfVar2, akkoVar.pR, akgtVar.cd);
        akis akisVar2 = akgtVar.a;
        fbbf fbbfVar3 = akisVar2.ln;
        akkp akkpVar = akisVar2.a;
        akko akkoVar2 = akisVar2.b;
        dsedVar.aw = new dqiz(fbbfVar3, akkpVar.p, akkoVar2.pV, akisVar2.lm, akisVar2.ll);
        dsedVar.ag = akgtVar.E();
        dsedVar.az = (ffsk) akgtVar.a.a.p.b();
        dsedVar.aA = (ffsk) akgtVar.a.a.q.b();
        dsedVar.aB = (dtdg) akgtVar.bQ.b();
        dsedVar.aC = new dsel(akgtVar.bV);
        eere eereVar = (eere) akgtVar.a.b.a.a.vS.b();
        eereVar.getClass();
        dsedVar.aD = new dscc(eereVar);
        dsedVar.aE = (dree) akgtVar.a.b.pR.b();
    }

    @Override // defpackage.drgb, defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        bk();
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
        bk();
        return this.a;
    }
}
