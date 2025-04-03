package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fbal;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxwp extends cxwl implements ekhu, fbas, ekhq, ekkk, elar {
    private cxxc a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public cxwp() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cxxc.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            final cxxc H = H();
            if (((Optional) H.g.b()).isPresent() && ((acio) ((Optional) H.g.b()).get()).m()) {
                ((Optional) H.h.b()).ifPresent(new Consumer() { // from class: cxwt
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        final acls aclsVar = (acls) obj;
                        cxxc cxxcVar = cxxc.this;
                        ((ejwl) cxxcVar.f.b()).b(new ejuy((ejvb) cxxcVar.i.b(), new eros() { // from class: cxws
                            @Override // defpackage.eros
                            public final erph a(erpc erpcVar) {
                                return new erph(acls.this.b());
                            }
                        }, "ditto_satellite_mode_key"), cxxcVar.l);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                H.b();
            }
            View s = H.o.s(layoutInflater, viewGroup, bundle);
            ekyf.q();
            return s;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.cxwl, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cxwl
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.ekhu
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cxxc H() {
        cxxc cxxcVar = this.a;
        if (cxxcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cxxcVar;
    }

    @Override // defpackage.cxwl, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof cxwp)) {
                        throw new IllegalStateException(a.J(eaVar, cxxc.class));
                    }
                    cxwp cxwpVar = (cxwp) eaVar;
                    fbbf fbbfVar = ((akgt) aX).a.q;
                    Activity activity = (Activity) ((akgt) aX).c.d.b();
                    akis akisVar = ((akgt) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar2 = akkpVar.nW;
                    fbbf fbbfVar3 = akisVar.b.fp;
                    fbbf fbbfVar4 = akkpVar.nk;
                    fbbf fbbfVar5 = akkpVar.eT;
                    fbbf fbbfVar6 = akkpVar.sF;
                    fbbf fbbfVar7 = ((akgt) aX).aJ;
                    fbbf fbbfVar8 = ((akgt) aX).k;
                    fazb a = fbaz.a(((akgt) aX).c.aK);
                    fbbf fbbfVar9 = ((akgt) aX).c.aG;
                    akis akisVar2 = ((akgt) aX).a;
                    fbbf fbbfVar10 = akisVar2.dy;
                    akko akkoVar = akisVar2.b;
                    fbbf fbbfVar11 = akkoVar.fa;
                    fbbf fbbfVar12 = akisVar2.aZ;
                    akkp akkpVar2 = akisVar2.a;
                    cxxc cxxcVar = new cxxc(cxwpVar, fbbfVar, activity, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, a, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, akkpVar2.Z, ((akgt) aX).b.f, ((akgt) aX).aK, akkpVar2.c, akkpVar2.ld, akkoVar.oG, akkpVar2.nV, ((akgt) aX).aL, akkoVar.pn);
                    this.a = cxxcVar;
                    cxxcVar.o = this;
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cxwl, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
