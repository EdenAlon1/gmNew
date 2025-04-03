package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import defpackage.fbal;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aipz extends aipx implements ekhu, fbas, ekhq, ekkk, elar {
    private aiqg aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public aipz() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return aiqg.class;
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
        return this.al;
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

    @Override // defpackage.aipx
    protected final /* synthetic */ fbae aV() {
        return new ekku(this);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ak == null) {
            this.ak = new ekkn(this, super.z());
        }
        return this.ak;
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
            aiqg H = H();
            if (i == 1001 && i2 == -1) {
                H.g.ar(H.o, H.i.f());
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

    @Override // defpackage.aipx, defpackage.efad, defpackage.ea
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
    public final void ao() {
        elav b = this.an.b();
        try {
            super.ao();
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
    public final aiqg H() {
        aiqg aiqgVar = this.aj;
        if (aiqgVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aiqgVar;
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
        H();
        return false;
    }

    @Override // defpackage.aipx, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    if (!(eaVar instanceof aipz)) {
                        throw new IllegalStateException(a.J(eaVar, aiqg.class));
                    }
                    this.aj = new aiqg((aipz) eaVar, (ejwl) ((akgt) aX).k.b(), (ejlq) ((akgt) aX).l.b(), (elhk) ((akgt) aX).am.b(), Optional.of(((akgt) aX).a.cr()), (altk) ((akgt) aX).a.a.fP.b(), (ctia) ((akgt) aX).a.cM.b(), (cthp) ((akgt) aX).a.a.an.b(), (ctyz) ((akgt) aX).a.fM.b());
                    this.Z.c(new ekkg(this.an, this.al));
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
            aiqg H = H();
            H.f.isPresent();
            H.c.c(((cnlo) H.f.get()).a(), ejwa.FEW_SECONDS, H.k);
            H.d.k(H.l);
            H.d.k(H.m);
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
        final aiqg H = H();
        H.b.gi(R.xml.notification_preferences);
        H.n = H.a(R.string.notifications_remind_action_pref_key);
        if (!H.n.isEmpty()) {
            if (H.f.isEmpty()) {
                H.b.b().af((Preference) H.n.get());
            } else {
                ((TwoStatePreference) H.n.get()).n = new elhi(H.e, "Notification Action Setting Changed", new onh() { // from class: aiqb
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj) {
                        final boolean equals = Boolean.TRUE.equals(obj);
                        aiqg aiqgVar = aiqg.this;
                        final cnlo cnloVar = (cnlo) aiqgVar.f.get();
                        aiqgVar.d.i(ejlp.b(elfl.g(cnloVar.a.b(new emwl() { // from class: cnll
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cnli cnliVar = (cnli) obj2;
                                cnlh cnlhVar = (cnlh) cnliVar.toBuilder();
                                if (!cnliVar.c) {
                                    cnlhVar.copyOnWrite();
                                    cnli cnliVar2 = (cnli) cnlhVar.instance;
                                    cnliVar2.b |= 1;
                                    cnliVar2.c = true;
                                }
                                boolean z = equals;
                                cnlhVar.copyOnWrite();
                                cnli cnliVar3 = (cnli) cnlhVar.instance;
                                cnliVar3.b |= 2;
                                cnliVar3.d = z;
                                return (cnli) cnlhVar.build();
                            }
                        }, erpp.a)).h(new emwl() { // from class: cnlm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                Void r4 = (Void) obj2;
                                cnlo.this.b.a(elfo.e(null), "reminder_settings_data_service");
                                return r4;
                            }
                        }, erpp.a)), new ejlm(Boolean.valueOf(equals)), aiqgVar.l);
                        aiqgVar.g.aR(true != equals ? 3 : 2);
                        return false;
                    }
                });
            }
        }
        H.a(R.string.notifications_system_settings_pref_key).ifPresent(new Consumer() { // from class: aiqa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final aiqg aiqgVar = aiqg.this;
                ((Preference) obj).o = new elhj(aiqgVar.e, "Notification Setting Clicked", new oni() { // from class: aiqc
                    @Override // defpackage.oni
                    public final boolean a(Preference preference) {
                        aiqg aiqgVar2 = aiqg.this;
                        Resources B = aiqgVar2.b.B();
                        final String string = B.getString(R.string.notifications_enabled_pref_key);
                        final boolean z = B.getBoolean(R.bool.notifications_enabled_pref_default);
                        final ctyz ctyzVar = aiqgVar2.j;
                        aiqgVar2.d.i(ejlp.b(elfo.g(new Callable() { // from class: ctyy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ctyz ctyzVar2 = ctyz.this;
                                ctyx ctyxVar = ctyzVar2.a;
                                String str = string;
                                if (ctyxVar.q(str, z)) {
                                    return null;
                                }
                                ctyzVar2.a.g(str, true);
                                return null;
                            }
                        }, ctyzVar.d)), new ejlm(null), aiqgVar2.m);
                        return true;
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.aipx, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
