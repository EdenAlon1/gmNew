package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import cxch.a;
import defpackage.fbal;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbg extends cwwg implements ekhu, fbas, ekhq, ekkk, elar {
    private cxch ak;
    private Context al;
    private boolean ao;
    public final lkv aj = new lkv(this);
    private final ekxu an = new ekxu(this);

    @Deprecated
    public cxbg() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cxch.class;
    }

    @Override // defpackage.efad, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View M = super.M(layoutInflater, viewGroup, bundle);
            ekyf.q();
            return M;
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
        return this.aj;
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

    @Override // defpackage.efad, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.an.j();
        try {
            boolean aM = super.aM(menuItem);
            j.close();
            return aM;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.an.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.cwwg
    protected final /* synthetic */ fbae aV() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.al == null) {
            this.al = new ekkn(this, super.z());
        }
        return this.al;
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ae(Bundle bundle) {
        this.an.k();
        try {
            super.ae(bundle);
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

    @Override // defpackage.efad, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.an.f();
        try {
            super.af(i, i2, intent);
            cxch H = H();
            if (i == 1038 && i2 == -1) {
                H.j(cmip.TOGGLE_STATE_ENABLED);
                H.i();
                if (!((aupn) H.Y.b()).a()) {
                    H.k();
                }
                ((cmgr) H.Q.b()).k();
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwwg, defpackage.efad, defpackage.ea
    public final void ag(Activity activity) {
        this.an.k();
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

    @Override // defpackage.efad, defpackage.ea
    public final void ai() {
        elav b = this.an.b();
        try {
            super.ai();
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

    @Override // defpackage.efad, defpackage.ea
    public final void am() {
        this.an.k();
        try {
            super.am();
            cxch H = H();
            SharedPreferences q = H.q.b().q();
            q.getClass();
            q.unregisterOnSharedPreferenceChangeListener(H);
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

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(3:2|3|(4:5|(2:7|8)|10|11)(1:13))|15|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r1.m(((defpackage.ckge) ((defpackage.csjk) r1.u.b()).a()).d()) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.addSuppressed(r0);
     */
    @Override // defpackage.efad, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ao() {
        /*
            r3 = this;
            ekxu r0 = r3.an
            elav r0 = r0.b()
            super.ao()     // Catch: java.lang.Throwable -> L4e
            cxch r1 = r3.H()     // Catch: java.lang.Throwable -> L4e
            ffbr r2 = r1.R     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L4e
            asqs r2 = (defpackage.asqs) r2     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L22
            boolean r2 = r1.l()     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L4a
            goto L3a
        L22:
            ffbr r2 = r1.u     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L4e
            csjk r2 = (defpackage.csjk) r2     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L4e
            ckge r2 = (defpackage.ckge) r2     // Catch: java.lang.Throwable -> L4e
            eqwf r2 = r2.d()     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r1.m(r2)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L4a
        L3a:
            cxbg r2 = r1.q     // Catch: java.lang.Throwable -> L4e
            androidx.preference.PreferenceScreen r2 = r2.b()     // Catch: java.lang.Throwable -> L4e
            android.content.SharedPreferences r2 = r2.q()     // Catch: java.lang.Throwable -> L4e
            r2.getClass()     // Catch: java.lang.Throwable -> L4e
            r2.registerOnSharedPreferenceChangeListener(r1)     // Catch: java.lang.Throwable -> L4e
        L4a:
            r0.close()
            return
        L4e:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            r1.addSuppressed(r0)
        L57:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxbg.ao():void");
    }

    @Override // defpackage.akuc, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.an.k();
        try {
            super.ap(view, bundle);
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

    @Override // defpackage.ekhu
    /* renamed from: ba, reason: merged with bridge method [inline-methods] */
    public final cxch H() {
        cxch cxchVar = this.ak;
        if (cxchVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cxchVar;
    }

    @Override // defpackage.elar
    public final elds bb() {
        return this.an.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.an.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.an.b = eldsVar;
    }

    @Override // defpackage.akuc
    protected final boolean bf() {
        return true;
    }

    @Override // defpackage.cwwg, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof cxbg)) {
                        throw new IllegalStateException(a.J(eaVar, cxch.class));
                    }
                    cxbg cxbgVar = (cxbg) eaVar;
                    akis akisVar = ((akgt) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar = akkpVar.dp;
                    fbbf fbbfVar2 = akkpVar.D;
                    fbbf fbbfVar3 = akkpVar.dl;
                    fbbf fbbfVar4 = akkpVar.ha;
                    fbbf fbbfVar5 = akkpVar.Px;
                    fbbf fbbfVar6 = ((akgt) aX).b.bt;
                    fbbf fbbfVar7 = akkpVar.fQ;
                    fbbf fbbfVar8 = akkpVar.f;
                    fbbf fbbfVar9 = ((akgt) aX).c.e;
                    fbbf fbbfVar10 = ((akgt) aX).ax;
                    fbbf fbbfVar11 = akisVar.aU;
                    fbbf fbbfVar12 = ((akgt) aX).aw;
                    fbbf fbbfVar13 = ((akgt) aX).ay;
                    fbbf fbbfVar14 = akkpVar.ck;
                    fbbf fbbfVar15 = ((akgt) aX).k;
                    fbbf fbbfVar16 = ((akgt) aX).f;
                    fbbf fbbfVar17 = ((akgt) aX).az;
                    fbbf fbbfVar18 = ((akgt) aX).aA;
                    fbbf fbbfVar19 = akisVar.aJ;
                    fbbf fbbfVar20 = akisVar.mO;
                    fbbf fbbfVar21 = ((akgt) aX).l;
                    fbbf fbbfVar22 = akisVar.aR;
                    fbbf fbbfVar23 = akkpVar.CE;
                    fbbf fbbfVar24 = ((akgt) aX).aB;
                    fbbf fbbfVar25 = ((akgt) aX).am;
                    fbbf fbbfVar26 = akkpVar.pN;
                    fbbf fbbfVar27 = akisVar.mP;
                    fbbf fbbfVar28 = ((akgt) aX).aC;
                    akko akkoVar = akisVar.b;
                    this.ak = new cxch(cxbgVar, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, akkoVar.kd, akkpVar.wi, akkpVar.bo, akkpVar.bj, akkpVar.pL, akisVar.cz, akkpVar.Cv, akkpVar.CA, akkoVar.G, akkpVar.EP, akisVar.aZ, akkoVar.pj, akkoVar.li, akkoVar.lr, akkoVar.pk);
                    this.Z.c(new ekkg(this.an, this.aj));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.an;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void h(Bundle bundle) {
        this.an.k();
        try {
            super.h(bundle);
            final cxch H = H();
            ((ejxn) H.C.b()).g(R.id.rcs_default_on_consent_subscription_id, new dcye((dcyg) H.M.b()), new cxci(H));
            ((ejxn) H.C.b()).g(R.id.rcs_settings_subscription_id, ((cmgr) H.Q.b()).d(H.q.aj), H.aa);
            ((ejlq) H.G.b()).k(H.ae);
            H.K = H.new a();
            ((ejlq) H.G.b()).k(H.K);
            ((ejlq) H.G.b()).k(H.ab);
            ((ejlq) H.G.b()).k(H.ac);
            ((ejlq) H.G.b()).k(H.af);
            H.ag = H.q.O(new ael(), new adf() { // from class: cxbs
                @Override // defpackage.adf
                public final void a(Object obj) {
                    if (((ade) obj).a == -1) {
                        cxch.this.c();
                    }
                }
            });
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

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void i() {
        elav b = this.an.b();
        try {
            super.i();
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

    @Override // defpackage.efad, defpackage.ea
    public final void j() {
        elav a = this.an.a();
        try {
            super.j();
            this.ao = true;
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

    @Override // defpackage.efad, defpackage.ea
    public final void k(Bundle bundle) {
        this.an.k();
        try {
            super.k(bundle);
            cxch H = H();
            H.N.a(bundle);
            H.O.a(bundle);
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

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void l() {
        this.an.k();
        try {
            super.l();
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

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void m() {
        this.an.k();
        try {
            super.m();
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

    @Override // defpackage.ont
    public final void t(Bundle bundle) {
        cxch H = H();
        eg G = H.q.G();
        if (G == null || !((cwqc) H.w.b()).e(G)) {
            ((ejwl) H.B.b()).b(((axkm) H.A.b()).e(), H.ad);
            H.N.c(bundle);
            H.O.c(bundle);
            H.h = ((dcxt) H.y.b()).a(epgt.PROVISIONING_UI_TYPE_GOOGLE_TOS_PROMO_WITH_COST, 2);
            H.d();
        }
    }

    @Override // defpackage.cwwg, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
