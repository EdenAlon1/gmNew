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
public abstract class drdv extends drgb implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    public drdv(drgk drgkVar, drfe drfeVar) {
        super(R.string.gif_search_hint, R.string.gif_screen_no_result, drgkVar, drfeVar);
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
        q();
    }

    @Override // defpackage.drgb, defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        a();
        q();
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        LayoutInflater aO = aO();
        return aO.cloneInContext(new fbal.a(aO, this));
    }

    @Override // defpackage.fbat
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
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

    protected final void q() {
        if (this.e) {
            return;
        }
        this.e = true;
        drds drdsVar = (drds) this;
        akgt akgtVar = (akgt) aX();
        drdsVar.aK = (ernh) akgtVar.a.lm.b();
        drdsVar.aL = akgtVar.a.ll;
        drdsVar.aM = (ffsk) akgtVar.g.b();
        drdsVar.aN = Optional.of(akgtVar.a.b.pQ);
        drdsVar.aq = (ffsk) akgtVar.a.a.p.b();
        drdsVar.ar = akgtVar.E();
        drdsVar.as = (dtdg) akgtVar.bQ.b();
        drdsVar.at = akgtVar.bW;
        drdsVar.au = akgtVar.F();
        fbbf fbbfVar = akgtVar.g;
        akis akisVar = akgtVar.a;
        fbbf fbbfVar2 = akisVar.q;
        akko akkoVar = akisVar.b;
        drdsVar.av = new drgx(fbbfVar, fbbfVar2, akkoVar.pR, akgtVar.bX);
        akis akisVar2 = akgtVar.a;
        fbbf fbbfVar3 = akisVar2.ln;
        akkp akkpVar = akisVar2.a;
        akko akkoVar2 = akisVar2.b;
        drdsVar.aw = new dqiz(fbbfVar3, akkpVar.p, akkoVar2.pS, akisVar2.lm, akisVar2.ll);
        drdsVar.b = new drea(akgtVar.a.ll);
        drdsVar.c = (dtdg) akgtVar.bQ.b();
        drdsVar.e = (dree) akgtVar.a.b.pR.b();
        drdsVar.ag = (ffsk) akgtVar.a.a.q.b();
    }

    @Override // defpackage.ea
    public final Context z() {
        if (super.z() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }
}
