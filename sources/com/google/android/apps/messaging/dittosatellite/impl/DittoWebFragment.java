package com.google.android.apps.messaging.dittosatellite.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.acio;
import defpackage.acow;
import defpackage.acoz;
import defpackage.acpo;
import defpackage.acpr;
import defpackage.acqc;
import defpackage.acsu;
import defpackage.acxa;
import defpackage.ael;
import defpackage.akgb;
import defpackage.akgt;
import defpackage.akis;
import defpackage.akko;
import defpackage.akkp;
import defpackage.akzt;
import defpackage.axnw;
import defpackage.csjb;
import defpackage.ctbx;
import defpackage.ctid;
import defpackage.ctuf;
import defpackage.ctuk;
import defpackage.ea;
import defpackage.efbd;
import defpackage.ejlq;
import defpackage.ekhq;
import defpackage.ekht;
import defpackage.ekhu;
import defpackage.ekkg;
import defpackage.ekkj;
import defpackage.ekkk;
import defpackage.ekkn;
import defpackage.ekku;
import defpackage.ekyf;
import defpackage.elar;
import defpackage.elav;
import defpackage.eldl;
import defpackage.elds;
import defpackage.fazb;
import defpackage.fbae;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.fbaz;
import defpackage.fbbb;
import defpackage.fbbf;
import defpackage.kud;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.lkk;
import defpackage.lkv;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DittoWebFragment extends acpr implements ekhu, fbas, ekhq, ekkk, elar {
    public final lkv a = new lkv(this);
    private boolean ag;
    private acow d;
    private Context e;

    @Deprecated
    public DittoWebFragment() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return acow.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final acow H = H();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.ditto_web_fragment, viewGroup, false);
            if (ctid.i) {
                kud kudVar = new kud() { // from class: acom
                    @Override // defpackage.kud
                    public final kxh ey(View view, kxh kxhVar) {
                        cskc cskcVar = acow.a;
                        kpt f = kxhVar.f(519);
                        view.setPadding(0, f.c, 0, kxhVar.u(8) ? kxhVar.f(8).e : f.e);
                        return kxhVar;
                    }
                };
                int[] iArr = kvo.a;
                kvd.k(viewGroup2, kudVar);
            }
            Intent intent = H.a().getIntent();
            String stringExtra = intent.getStringExtra("conversation_id_for_launch");
            csjb a = acow.a.a();
            a.A("conversationId", stringExtra);
            a.r();
            if (((Optional) H.f.b()).isPresent()) {
                if (!intent.getBooleanExtra("need_permission", false)) {
                    boolean booleanExtra = intent.getBooleanExtra("show_switcher", false);
                    if (((Optional) H.f.b()).isPresent()) {
                        ((acio) ((Optional) H.f.b()).get()).h(booleanExtra);
                    }
                } else if (((Optional) H.f.b()).isEmpty()) {
                    acow.a.r("dittoExtensions is empty.");
                } else {
                    Optional b = ((acio) ((Optional) H.f.b()).get()).b(H.a());
                    if (b.isPresent()) {
                        acow.a.p("Request to set default sms app.");
                        H.e.O(new ael(), H.G).c(b.get());
                    } else {
                        acow.a.r("defaultSmsAppIntent is empty.");
                    }
                }
            }
            acxa acxaVar = (acxa) H.x.b();
            H.a();
            if (acxaVar.g()) {
                ((akzt) H.l.b()).c("Bugle.Satellite.Notifications.PermissionsNotGranted.Counts");
                if (ctid.f) {
                    ((ctuk) H.y.b()).h(ctuf.NOTIFICATIONS, new acoz(H));
                }
            }
            H.e(viewGroup2, stringExtra);
            ((Optional) H.i.b()).ifPresent(new Consumer() { // from class: acol
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    acow acowVar = acow.this;
                    ((ejwl) acowVar.k.b()).b(((aclb) obj).b(), acowVar.C);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((Optional) H.i.b()).ifPresent(new Consumer() { // from class: acoo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    acow acowVar = acow.this;
                    ((ejwl) acowVar.k.b()).b(((aclb) obj).a(), new acpc(acowVar, acowVar.I));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (acsu.c(intent)) {
                H.c(intent);
            }
            ekyf.q();
            return viewGroup2;
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
        return this.a;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final acow H() {
        acow acowVar = this.d;
        if (acowVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return acowVar;
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
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.acpr, defpackage.efaf, defpackage.ea
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ai() {
        elav b = this.c.b();
        try {
            ba();
            acow H = H();
            ctbx ctbxVar = H.B;
            if (ctbxVar != null) {
                ctbxVar.a();
                H.B = null;
            }
            acpo acpoVar = (acpo) H.j.b();
            ctbx ctbxVar2 = acpoVar.i;
            if (ctbxVar2 != null) {
                ctbxVar2.a();
                acpoVar.i = null;
            }
            ctbx ctbxVar3 = acpoVar.h;
            if (ctbxVar3 != null) {
                ctbxVar3.a();
                acpoVar.h = null;
            }
            ctbx ctbxVar4 = acpoVar.j;
            if (ctbxVar4 != null) {
                ctbxVar4.a();
                acpoVar.j = null;
            }
            Object obj = H.v.get();
            ((acqc) obj).e.set(true);
            ((acqc) obj).b.b().k(axnw.b(), ((acqc) obj).d);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ao() {
        elav b = this.c.b();
        try {
            bi();
            H().d();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acpr
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

    @Override // defpackage.acpr, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof DittoWebFragment)) {
                        throw new IllegalStateException(a.J(eaVar, acow.class));
                    }
                    DittoWebFragment dittoWebFragment = (DittoWebFragment) eaVar;
                    akgb akgbVar = ((akgt) aX).c;
                    fbbf fbbfVar = akgbVar.aK;
                    fbbf fbbfVar2 = akgbVar.aG;
                    fbbf fbbfVar3 = ((akgt) aX).V;
                    fbbf fbbfVar4 = ((akgt) aX).W;
                    akko akkoVar = ((akgt) aX).a.b;
                    fbbf fbbfVar5 = akkoVar.oU;
                    fbbf fbbfVar6 = ((akgt) aX).l;
                    fazb a = fbaz.a(akkoVar.u);
                    akis akisVar = ((akgt) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar7 = akkpVar.Pv;
                    akko akkoVar2 = akisVar.b;
                    fbbf fbbfVar8 = akkoVar2.q;
                    fbbf fbbfVar9 = akkoVar2.oW;
                    fbbf fbbfVar10 = ((akgt) aX).k;
                    fbbf fbbfVar11 = akkpVar.f;
                    fbbf fbbfVar12 = akisVar.aJ;
                    fazb a2 = fbaz.a(((akgt) aX).aa);
                    akis akisVar2 = ((akgt) aX).a;
                    fbbf fbbfVar13 = akisVar2.aZ;
                    fbbf fbbfVar14 = ((akgt) aX).ab;
                    fbbf fbbfVar15 = akisVar2.cU;
                    fbbf fbbfVar16 = akisVar2.p;
                    this.d = new acow(dittoWebFragment, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, a, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, a2, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar16, ((akgt) aX).ac, ((akgt) aX).ad, akisVar2.dy, akisVar2.dQ, akisVar2.b.v, ((akgt) aX).c.g);
                    this.Z.c(new ekkg(this.c, this.a));
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            acow H = H();
            ((ejlq) H.h.b()).k(H.F);
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

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bl();
            acow H = H();
            H.A = true;
            ((acqc) H.v.get()).b();
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

    @Override // defpackage.acpr, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
