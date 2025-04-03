package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.fbal;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqfi extends dtaa implements fbat {
    private ContextWrapper a;
    private boolean b;
    private volatile fbae c;
    private final Object d;
    private boolean e;

    dqfi() {
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
        bk();
    }

    @Override // defpackage.fbat
    /* renamed from: bj, reason: merged with bridge method [inline-methods] */
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

    protected final void bk() {
        if (this.e) {
            return;
        }
        this.e = true;
        dqfc dqfcVar = (dqfc) this;
        akgt akgtVar = (akgt) aX();
        dqfcVar.aK = (ernh) akgtVar.a.lm.b();
        dqfcVar.aL = akgtVar.a.ll;
        dqfcVar.aM = (ffsk) akgtVar.g.b();
        dqfcVar.aN = Optional.of(akgtVar.P);
        dqfcVar.am = (dqlu) akgtVar.bK.b();
        akis akisVar = akgtVar.a;
        fbbf fbbfVar = akisVar.a.q;
        fbbf fbbfVar2 = akgtVar.N;
        akko akkoVar = akisVar.b;
        dqfcVar.an = new dpfu(fbbfVar, fbbfVar2, akkoVar.oN, akgtVar.L, akisVar.ll, akkoVar.ky);
        dqfcVar.ao = (dqli) akgtVar.c.bl.b();
        dqfcVar.ap = new dqft(akgtVar.bN);
        final ffsk ffskVar = (ffsk) akgtVar.g.b();
        final ea eaVar = (ea) ((fbbb) akgtVar.d).a;
        dpnq dpnqVar = new dpnq(new dpnu(akgtVar.a.ll));
        akgb akgbVar = akgtVar.c;
        Optional of = Optional.of(new dpnp(dpnqVar, Optional.of(new dpxo(new dpye(akgbVar.d, akgtVar.d, akgtVar.bO, akgtVar.a.ll, akgtVar.g, akgtVar.N, akgbVar.bl))), new dpyf(new dpyj(akgtVar.a.ll))));
        ffskVar.getClass();
        final ffji ffjiVar = new ffji() { // from class: dqfo
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dpnl dpnlVar = (dpnl) obj;
                dpnlVar.getClass();
                return new dqfn(ffsk.this, eaVar, dpnlVar);
            }
        };
        Optional map = of.map(new Function() { // from class: dqfp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        dqfcVar.aq = map;
        dqfcVar.ar = new dqga(akgtVar.c.bl);
        dqfcVar.as = new dtav(akgtVar.d);
        dqfcVar.at = new dqgj();
        dqfcVar.au = (Activity) akgtVar.c.d.b();
        dqfcVar.av = Optional.empty();
        dqfcVar.aw = Optional.empty();
        dqfcVar.ax = (drpd) akgtVar.a.b.oN.b();
        dqfcVar.ay = (dpaa) akgtVar.L.b();
        dqfcVar.az = (ffsk) akgtVar.a.a.q.b();
        dqfcVar.aA = Optional.of((uij) akgtVar.c.B.b());
        dqfcVar.aB = new dqdc(akgtVar.c.d, akgtVar.bQ);
        dqfcVar.aC = akgtVar.a.b.ky;
    }

    @Override // defpackage.dslv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        a();
        bk();
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

    public dqfi(Integer num, dtab dtabVar) {
        super(num, dtabVar);
        this.d = new Object();
        this.e = false;
    }
}
