package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.settings.MessageOrganizationSettingsActivity;
import com.google.android.apps.messaging.notifications.settings.NotificationSettingsActivity;
import cwto.a;
import cwto.c;
import cwto.d;
import defpackage.ekkz;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwrw extends cxip implements ekhu, fbas, ekhq, ekkk, elar {
    private cwto aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public cwrw() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return cwto.class;
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

    @Override // defpackage.ekhu
    /* renamed from: aU, reason: merged with bridge method [inline-methods] */
    public final cwto H() {
        cwto cwtoVar = this.aj;
        if (cwtoVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwtoVar;
    }

    @Override // defpackage.cxip
    protected final /* bridge */ /* synthetic */ ekky aV() {
        return new ekkt(this, true);
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
            cwto H = H();
            if (i == 1001) {
                ((altk) H.j.b()).ar(null, H.i.f());
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

    @Override // defpackage.cxip, defpackage.efad, defpackage.ea
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x018c, TryCatch #1 {all -> 0x018c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:10:0x0029, B:11:0x0042, B:13:0x0050, B:14:0x0094, B:16:0x0098, B:19:0x009f, B:21:0x00a7, B:22:0x00f2, B:25:0x0125, B:27:0x0129, B:30:0x0130, B:31:0x0156, B:33:0x0164, B:35:0x0168, B:38:0x016f, B:39:0x0181, B:43:0x014f, B:44:0x0101, B:46:0x0105, B:49:0x010c, B:50:0x011e, B:51:0x00b9, B:53:0x00c1, B:54:0x00d6, B:55:0x00eb, B:56:0x0065, B:58:0x006b, B:59:0x0080, B:60:0x003b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[Catch: all -> 0x018c, TryCatch #1 {all -> 0x018c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:10:0x0029, B:11:0x0042, B:13:0x0050, B:14:0x0094, B:16:0x0098, B:19:0x009f, B:21:0x00a7, B:22:0x00f2, B:25:0x0125, B:27:0x0129, B:30:0x0130, B:31:0x0156, B:33:0x0164, B:35:0x0168, B:38:0x016f, B:39:0x0181, B:43:0x014f, B:44:0x0101, B:46:0x0105, B:49:0x010c, B:50:0x011e, B:51:0x00b9, B:53:0x00c1, B:54:0x00d6, B:55:0x00eb, B:56:0x0065, B:58:0x006b, B:59:0x0080, B:60:0x003b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0129 A[Catch: all -> 0x018c, TryCatch #1 {all -> 0x018c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:10:0x0029, B:11:0x0042, B:13:0x0050, B:14:0x0094, B:16:0x0098, B:19:0x009f, B:21:0x00a7, B:22:0x00f2, B:25:0x0125, B:27:0x0129, B:30:0x0130, B:31:0x0156, B:33:0x0164, B:35:0x0168, B:38:0x016f, B:39:0x0181, B:43:0x014f, B:44:0x0101, B:46:0x0105, B:49:0x010c, B:50:0x011e, B:51:0x00b9, B:53:0x00c1, B:54:0x00d6, B:55:0x00eb, B:56:0x0065, B:58:0x006b, B:59:0x0080, B:60:0x003b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164 A[Catch: all -> 0x018c, TryCatch #1 {all -> 0x018c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:10:0x0029, B:11:0x0042, B:13:0x0050, B:14:0x0094, B:16:0x0098, B:19:0x009f, B:21:0x00a7, B:22:0x00f2, B:25:0x0125, B:27:0x0129, B:30:0x0130, B:31:0x0156, B:33:0x0164, B:35:0x0168, B:38:0x016f, B:39:0x0181, B:43:0x014f, B:44:0x0101, B:46:0x0105, B:49:0x010c, B:50:0x011e, B:51:0x00b9, B:53:0x00c1, B:54:0x00d6, B:55:0x00eb, B:56:0x0065, B:58:0x006b, B:59:0x0080, B:60:0x003b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101 A[Catch: all -> 0x018c, TryCatch #1 {all -> 0x018c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:10:0x0029, B:11:0x0042, B:13:0x0050, B:14:0x0094, B:16:0x0098, B:19:0x009f, B:21:0x00a7, B:22:0x00f2, B:25:0x0125, B:27:0x0129, B:30:0x0130, B:31:0x0156, B:33:0x0164, B:35:0x0168, B:38:0x016f, B:39:0x0181, B:43:0x014f, B:44:0x0101, B:46:0x0105, B:49:0x010c, B:50:0x011e, B:51:0x00b9, B:53:0x00c1, B:54:0x00d6, B:55:0x00eb, B:56:0x0065, B:58:0x006b, B:59:0x0080, B:60:0x003b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9 A[Catch: all -> 0x018c, TryCatch #1 {all -> 0x018c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:10:0x0029, B:11:0x0042, B:13:0x0050, B:14:0x0094, B:16:0x0098, B:19:0x009f, B:21:0x00a7, B:22:0x00f2, B:25:0x0125, B:27:0x0129, B:30:0x0130, B:31:0x0156, B:33:0x0164, B:35:0x0168, B:38:0x016f, B:39:0x0181, B:43:0x014f, B:44:0x0101, B:46:0x0105, B:49:0x010c, B:50:0x011e, B:51:0x00b9, B:53:0x00c1, B:54:0x00d6, B:55:0x00eb, B:56:0x0065, B:58:0x006b, B:59:0x0080, B:60:0x003b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065 A[Catch: all -> 0x018c, TryCatch #1 {all -> 0x018c, blocks: (B:3:0x0006, B:5:0x0014, B:8:0x001b, B:10:0x0029, B:11:0x0042, B:13:0x0050, B:14:0x0094, B:16:0x0098, B:19:0x009f, B:21:0x00a7, B:22:0x00f2, B:25:0x0125, B:27:0x0129, B:30:0x0130, B:31:0x0156, B:33:0x0164, B:35:0x0168, B:38:0x016f, B:39:0x0181, B:43:0x014f, B:44:0x0101, B:46:0x0105, B:49:0x010c, B:50:0x011e, B:51:0x00b9, B:53:0x00c1, B:54:0x00d6, B:55:0x00eb, B:56:0x0065, B:58:0x006b, B:59:0x0080, B:60:0x003b), top: B:2:0x0006 }] */
    @Override // defpackage.efad, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ao() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwrw.ao():void");
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

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
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

    @Override // defpackage.cxip, defpackage.ea
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
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof cwrw)) {
                        throw new IllegalStateException(a.J(eaVar, cwto.class));
                    }
                    cwrw cwrwVar = (cwrw) eaVar;
                    akis akisVar = ((akgo) aX).a;
                    fbbf fbbfVar = akisVar.a.Px;
                    ctyx ctyxVar = (ctyx) akisVar.aU.b();
                    cthp cthpVar = (cthp) ((akgo) aX).a.a.an.b();
                    akkp akkpVar = ((akgo) aX).a.a;
                    fbbf fbbfVar2 = akkpVar.fP;
                    ctvi ctviVar = (ctvi) akkpVar.e.b();
                    ctvb ctvbVar = (ctvb) ((akgo) aX).a.a.u.b();
                    akis akisVar2 = ((akgo) aX).a;
                    akkp akkpVar2 = akisVar2.a;
                    fbbf fbbfVar3 = akkpVar2.nj;
                    fbbf fbbfVar4 = akisVar2.fM;
                    cuye cuyeVar = (cuye) akkpVar2.ff.b();
                    Optional optional = (Optional) ((akgo) aX).a.mk.b();
                    csrv csrvVar = (csrv) ((akgo) aX).a.a.iK.b();
                    fbbf fbbfVar5 = ((akgo) aX).eB;
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    ejxn ejxnVar = (ejxn) ((akgo) aX).n.b();
                    ejvb ejvbVar = (ejvb) ((akgo) aX).a.dy.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    Optional of = Optional.of(((akgo) aX).a.cr());
                    Optional of2 = Optional.of(new cinh());
                    elhk elhkVar = (elhk) ((akgo) aX).i.b();
                    ctxt ctxtVar = (ctxt) ((akgo) aX).a.mx.b();
                    fbbf fbbfVar6 = ((akgo) aX).eC;
                    fbbf fbbfVar7 = ((akgo) aX).b.an;
                    fbbf fbbfVar8 = ((akgo) aX).a.a.f;
                    Optional.of(fbaz.a(((akgo) aX).eD));
                    Optional.of(((akgo) aX).n());
                    fazb a = fbaz.a(((akgo) aX).bE);
                    akkp akkpVar3 = ((akgo) aX).a.a;
                    fbbf fbbfVar9 = akkpVar3.as;
                    Optional empty = Optional.empty();
                    Optional of3 = Optional.of(((akgo) aX).a.a.p());
                    fjft rM = ((akgo) aX).a.a.rM();
                    fbbf fbbfVar10 = ((akgo) aX).eE;
                    fbbf fbbfVar11 = ((akgo) aX).db;
                    akkp akkpVar4 = ((akgo) aX).a.a;
                    cwto cwtoVar = new cwto(eisxVar, cwrwVar, fbbfVar, ctyxVar, cthpVar, fbbfVar2, ctviVar, ctvbVar, fbbfVar3, fbbfVar4, cuyeVar, optional, csrvVar, fbbfVar5, ejwlVar, ejxnVar, ejvbVar, ejlqVar, of, of2, elhkVar, ctxtVar, fbbfVar6, fbbfVar7, fbbfVar8, a, fbbfVar9, empty, of3, rM, fbbfVar10, fbbfVar11, akkpVar4.lD, akkpVar4.r, ((akgo) aX).cC, (Optional) ((akgo) aX).eF.b(), (Optional) ((akgo) aX).a.cs.b(), ((akgo) aX).a.b.az());
                    this.aj = cwtoVar;
                    cwtoVar.al = this;
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
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
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
        ffbr ffbrVar;
        this.an.k();
        try {
            super.h(bundle);
            final cwto H = H();
            H.u.ifPresent(new Consumer() { // from class: cwsl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ejuh a = ((cnlo) obj).a();
                    ejwa ejwaVar = ejwa.FEW_SECONDS;
                    cwto cwtoVar = cwto.this;
                    cwtoVar.q.c(a, ejwaVar, cwtoVar.new c());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.P = H.new d();
            H.t.k(H.P);
            H.Q = H.new a();
            H.t.k(H.Q);
            H.ai = H.b(H.f.Y(R.string.swipe_action_pref_key));
            if (!H.ai.isEmpty() && (ffbrVar = H.I) != null) {
                H.r.g(R.id.swipe_action_settings_summary_subscription_id, new cxid((cxig) ffbrVar.b()), new ejxk() { // from class: cwtb
                    @Override // defpackage.ejxk
                    public final /* synthetic */ void a(Throwable th) {
                        ejxj.a(th);
                    }

                    @Override // defpackage.ejxk
                    public final void b(Object obj) {
                        Optional optional = (Optional) obj;
                        if (optional.isPresent()) {
                            cwto cwtoVar = cwto.this;
                            Preference preference = (Preference) cwtoVar.ai.get();
                            Context z = cwtoVar.f.z();
                            z.getClass();
                            cxhw cxhwVar = (cxhw) optional.get();
                            ejui ejuiVar = cxig.a;
                            cxhv b = cxhv.b(cxhwVar.c);
                            if (b == null) {
                                b = cxhv.ARCHIVE;
                            }
                            cxhv b2 = cxhv.b(cxhwVar.d);
                            if (b2 == null) {
                                b2 = cxhv.ARCHIVE;
                            }
                            String a = cxig.a(z, b2);
                            String a2 = cxig.a(z, b);
                            preference.n(z.getString(R.string.swipe_actions_summary_right, a) + "\n" + z.getString(R.string.swipe_actions_summary_left, a2));
                        }
                    }
                });
            }
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
            H().e.a(bundle);
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
            cwto H = H();
            H.f.b().q().registerOnSharedPreferenceChangeListener(H);
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
            cwto H = H();
            H.f.b().q().unregisterOnSharedPreferenceChangeListener(H);
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

    @Override // defpackage.ont, defpackage.ooe
    public final boolean s(Preference preference) {
        cwto H = H();
        if (!Objects.equals(preference.s, H.T)) {
            return super.s(preference);
        }
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
        String f = H.h.f(H.T, null);
        if (f == null) {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
        } else if (f.length() == 0) {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", (Parcelable) null);
        } else {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Uri.parse(f));
        }
        H.f.startActivityForResult(intent, 1003);
        return true;
    }

    @Override // defpackage.ont
    public final void t(Bundle bundle) {
        final cwto H = H();
        H.e.c(bundle);
        H.f.b.f("bugle");
        H.f.gi(R.xml.preferences_application);
        H.f.b().ag();
        H.S = H.a(R.string.notifications_pref_key);
        H.R = H.f.Y(R.string.notifications_enabled_pref_key);
        H.ac = H.a(R.string.notifications_remind_action_pref_key);
        H.S.ifPresent(new Consumer() { // from class: cwrx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cwto cwtoVar = cwto.this;
                Preference preference = (Preference) obj;
                if (cwto.f()) {
                    preference.t = new Intent(cwtoVar.f.b().j, (Class<?>) NotificationSettingsActivity.class);
                } else {
                    preference.o = new oni() { // from class: cwsk
                        @Override // defpackage.oni
                        public final boolean a(Preference preference2) {
                            cwto cwtoVar2 = cwto.this;
                            String string = cwtoVar2.f.G().getString(R.string.notifications_enabled_pref_key);
                            if (!cwtoVar2.h.q(string, cwtoVar2.f.B().getBoolean(R.bool.notifications_enabled_pref_default))) {
                                cwtoVar2.h.h(string, true);
                            }
                            cixd cixdVar = (cixd) cwtoVar2.G.b();
                            Intent a = akuv.d("android.settings.APP_NOTIFICATION_SETTINGS").a();
                            a.putExtra("android.provider.extra.APP_PACKAGE", cixdVar.a.getPackageName());
                            cwtoVar2.f.startActivityForResult(a, 1001);
                            return true;
                        }
                    };
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.T = H.f.Y(R.string.notification_sound_pref_key);
        H.U = H.b(H.T);
        H.W = H.b(H.f.Y(R.string.smarts_settings_parent_pref));
        H.X = H.b(H.f.Y(R.string.rich_cards_settings_root_id));
        H.Y = H.b(H.f.Y(R.string.vsms_settings_root_id));
        H.Z = H.b(H.f.Y(R.string.bubble_settings_pref_key));
        H.aa = H.b(H.f.Y(R.string.rcs_pref_key));
        final Optional b = H.b(H.f.Y(R.string.super_sort_pref_key));
        if (((Boolean) aitk.a.e()).booleanValue() && ((Optional) H.y.b()).isPresent()) {
            ((Optional) H.y.b()).ifPresent(new Consumer() { // from class: cwsz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final cwrw cwrwVar = cwto.this.f;
                    cwrwVar.getClass();
                    final ffji ffjiVar = new ffji() { // from class: ahgm
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            Preference preference = (Preference) obj2;
                            preference.getClass();
                            boolean booleanValue = ((Boolean) aitk.a.e()).booleanValue();
                            ont ontVar = ont.this;
                            if (booleanValue) {
                                preference.t = new Intent(ontVar.b().j, (Class<?>) MessageOrganizationSettingsActivity.class);
                            } else {
                                ontVar.b().af(preference);
                            }
                            return ffcu.a;
                        }
                    };
                    b.ifPresent(new Consumer() { // from class: ahgn
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            ffji.this.invoke(obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            cwto.a.p("Message organization entry point absent, removing message organization preference");
            b.ifPresent(new Consumer() { // from class: cwta
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cwto.this.f.b().af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        H.ab = H.b(H.f.Y(R.string.federated_learning_settings_parent_pref_key));
        H.e(H.f.b().q());
        H.V = H.b(H.x.b());
        H.V.ifPresent(new Consumer() { // from class: cwrz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final cwto cwtoVar = cwto.this;
                ((Preference) obj).o = new oni() { // from class: cwsj
                    @Override // defpackage.oni
                    public final boolean a(Preference preference) {
                        ((cwvh) cwto.this.p.b()).c();
                        return true;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.c();
        if (H.o.q()) {
            H.f.gi(R.xml.preferences_application_debug);
        }
        Optional optional = H.W;
        if (optional != null && optional.isPresent()) {
            ((PreferenceScreen) H.W.get()).t = ((akvg) H.g.b()).f(H.f.b().j);
        }
        H.b(H.f.Y(R.string.hqms_pref_key)).ifPresent(new Consumer() { // from class: cwst
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cwto cwtoVar = cwto.this;
                eixo eixoVar = (eixo) cwtoVar.C.b();
                eisx eisxVar = cwtoVar.d;
                eisxVar.getClass();
                cwtoVar.q.b(eixoVar.a(eisxVar), new cwtd(cwtoVar, (Preference) obj));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional b2 = H.b(H.f.Y(R.string.protection_safety_settings_pref_key));
        Optional b3 = H.b(H.f.Y(R.string.spam_settings_pref_key));
        if (cubs.f()) {
            b2.ifPresent(new Consumer() { // from class: cwsa
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cwto cwtoVar = cwto.this;
                    ((Preference) obj).t = ((akvg) cwtoVar.g.b()).n(cwtoVar.f.b().j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            b3.ifPresent(new Consumer() { // from class: cwsb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cwto.this.f.b().af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            b3.ifPresent(new Consumer() { // from class: cwsc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cwto cwtoVar = cwto.this;
                    ((Preference) obj).t = ((akvg) cwtoVar.g.b()).q(cwtoVar.f.b().j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            b2.ifPresent(new Consumer() { // from class: cwsd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cwto.this.f.b().af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (ctid.d) {
            H.Z.ifPresent(new Consumer() { // from class: cwse
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cixd cixdVar = (cixd) cwto.this.G.b();
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", cixdVar.a.getPackageName());
                    intent.putExtra("app_uid", cixdVar.a.getApplicationInfo().uid);
                    ((PreferenceScreen) obj).t = intent;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Optional optional2 = H.X;
        if (optional2 != null && optional2.isPresent()) {
            Context context = H.f.b().j;
            eisx eisxVar = H.d;
            Intent p = ((akvg) H.g.b()).p(context);
            eiuy.c(p, eisxVar);
            ((PreferenceScreen) H.X.get()).t = p;
        }
        Optional optional3 = H.Y;
        if (optional3 == null || optional3.isEmpty()) {
            cwto.a.p("verifiedSmsPreference was not found");
        } else {
            ((PreferenceScreen) H.Y.get()).t = ((akvg) H.g.b()).s(H.f.b().j);
            ((PreferenceScreen) H.Y.get()).N(false);
            H.q.c(new ejuy(H.s, new eros() { // from class: cwsm
                @Override // defpackage.eros
                public final erph a(erpc erpcVar) {
                    return new erph(cwto.this.m.a());
                }
            }, "VERIFIED_SMS_CONTENT_KEY"), ejwa.FEW_SECONDS, new cwtk(H));
        }
        Optional optional4 = H.ab;
        if (optional4 != null && optional4.isPresent()) {
            if (((Boolean) ctjd.D.e()).booleanValue() && H.n.isPresent()) {
                ((PreferenceScreen) H.ab.get()).t = ((akvg) H.g.b()).b(H.f.b().j);
            } else {
                H.f.b().af((Preference) H.ab.get());
            }
        }
        Optional b4 = H.b(H.f.Y(R.string.advanced_pref_key));
        boolean booleanExtra = H.f.G().getIntent().getBooleanExtra("top_level_settings", false);
        if (b4.isPresent()) {
            if (booleanExtra) {
                ((PreferenceScreen) b4.get()).t = ((akvg) H.g.b()).j(H.f.b().j);
            } else {
                H.f.b().af((Preference) b4.get());
            }
        }
        H.b(H.f.Y(R.string.swipe_action_pref_key)).ifPresent(new Consumer() { // from class: cwsf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                preferenceScreen.N(true);
                cwto cwtoVar = cwto.this;
                preferenceScreen.t = ((akvg) cwtoVar.g.b()).r(cwtoVar.f.b().j);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.b(H.f.Y(R.string.about_app_pref_key)).ifPresent(new Consumer() { // from class: cwsg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cwto cwtoVar = cwto.this;
                ((PreferenceScreen) obj).t = ((akvg) cwtoVar.g.b()).i(cwtoVar.f.b().j);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional b5 = H.b(H.f.Y(R.string.google_account_pref_key));
        if (!b5.isEmpty()) {
            H.ah = Optional.of(new AtomicReference());
            H.g();
            H.f.b().af((Preference) b5.get());
            ejxn ejxnVar = H.r;
            fjft fjftVar = H.H;
            eisx eisxVar2 = H.d;
            ((axkm) fjftVar.a.b()).getClass();
            babf babfVar = (babf) fjftVar.b.b();
            babfVar.getClass();
            eixo eixoVar = (eixo) fjftVar.c.b();
            eixoVar.getClass();
            ejvp ejvpVar = (ejvp) fjftVar.d.b();
            ejvpVar.getClass();
            ffsk ffskVar = (ffsk) fjftVar.e.b();
            ffskVar.getClass();
            ejxnVar.g(R.id.bnr_ui_data_local_subscription_id, new fjfq(new fjfs(babfVar, eixoVar, ejvpVar, ffskVar, (Optional) ((fbbb) fjftVar.f).a, fjftVar.g, eisxVar2)), new cwtl(H));
        }
        H.ad = H.a(R.string.split_view_pref_key);
        H.ad.ifPresent(new Consumer() { // from class: cwsw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Preference preference = (Preference) obj;
                final cwto cwtoVar = cwto.this;
                Context z = cwtoVar.f.z();
                z.getClass();
                if (ahpj.b(z)) {
                    preference.n = new onh() { // from class: cwsi
                        @Override // defpackage.onh
                        public final boolean a(Preference preference2, Object obj2) {
                            csjb c = cwto.a.c();
                            c.I("Split view prefs changed");
                            c.A("newValue", obj2);
                            c.r();
                            Boolean bool = (Boolean) obj2;
                            ahpj.a = bool;
                            cwto cwtoVar2 = cwto.this;
                            ayfg ayfgVar = (ayfg) cwtoVar2.z.b();
                            Context z2 = cwtoVar2.f.z();
                            z2.getClass();
                            ayfgVar.j(z2, null);
                            ((akzt) cwtoVar2.A.b()).e("Bugle.SplitView.Toggle.Count", bool.booleanValue() ? 1 : 0);
                            return true;
                        }
                    };
                } else {
                    cwtoVar.f.b().af(preference);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.ae = H.a(R.string.pinch_zoom_pref_key);
        if (!H.ae.isEmpty() && !((Optional) H.B.b()).isEmpty()) {
            if (H.e.b()) {
                ((SwitchPreferenceCompat) H.ae.get()).G(false);
                ((SwitchPreferenceCompat) H.ae.get()).N(false);
                H.q.b(((cymq) ((Optional) H.B.b()).get()).a(), H.D);
                ((SwitchPreferenceCompat) H.ae.get()).n = new elhi(H.w, "ApplicationSettingsFragmentPeer:setupPinchZoomPreference", new onh() { // from class: cwso
                    @Override // defpackage.onh
                    public final boolean a(final Preference preference, Object obj) {
                        cwto cwtoVar = cwto.this;
                        if (((Optional) cwtoVar.B.b()).isEmpty()) {
                            return false;
                        }
                        boolean equals = Boolean.TRUE.equals(obj);
                        cwtoVar.ae.ifPresent(new Consumer() { // from class: cwsp
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                cskc cskcVar = cwto.a;
                                Preference.this.G(false);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        ((cymq) ((Optional) cwtoVar.B.b()).get()).c(equals);
                        return false;
                    }
                });
            } else {
                H.f.b().af((Preference) H.ae.get());
            }
        }
        Optional a = H.a(R.string.choose_theme_pref_key);
        ((crjx) H.K.b()).h();
        if (ctid.c) {
            a.ifPresent(new Consumer() { // from class: cwsv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    Preference preference = (Preference) obj;
                    final cwto cwtoVar = cwto.this;
                    preference.o = new oni() { // from class: cwsq
                        @Override // defpackage.oni
                        public final boolean a(Preference preference2) {
                            final aeox aeoxVar = (aeox) ((aedr) cwto.this.L.b()).d.b();
                            Context context2 = aeoxVar.c;
                            context2.getClass();
                            ehft ehftVar = new ehft(context2);
                            ehftVar.w(aeoxVar.d, aeoxVar.e, new aeow(aeoxVar));
                            ehftVar.x(R.string.theme_setting_dialog_title);
                            ehftVar.t(android.R.string.ok, new elbb(aeoxVar.b, "ThemeSettingDialog#onSelectionChanged", new DialogInterface.OnClickListener() { // from class: aeou
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    aeox aeoxVar2 = aeox.this;
                                    int i2 = aeoxVar2.e;
                                    if (i2 == 0) {
                                        aeoxVar2.a.f(1);
                                    } else if (i2 == 1) {
                                        aeoxVar2.a.f(2);
                                    } else {
                                        if (i2 != 2) {
                                            return;
                                        }
                                        aeoxVar2.a.f(-1);
                                    }
                                }
                            }));
                            ehftVar.o(android.R.string.cancel, null);
                            ehftVar.s(new DialogInterface.OnDismissListener() { // from class: aeov
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    aeox aeoxVar2 = aeox.this;
                                    aeoxVar2.c = null;
                                    iv ivVar = aeoxVar2.f;
                                    if (ivVar != null) {
                                        ivVar.dismiss();
                                        aeoxVar2.f = null;
                                    }
                                }
                            });
                            aeoxVar.f = ehftVar.create();
                            aeoxVar.f.show();
                            return true;
                        }
                    };
                    preference.N(true);
                    int a2 = ((crjx) cwtoVar.K.b()).a();
                    if (a2 == 1) {
                        preference.J(R.string.theme_setting_dialog_options_light_mode);
                    } else if (a2 != 2) {
                        preference.J(R.string.theme_setting_dialog_options_system_default_mode);
                    } else {
                        preference.J(R.string.theme_setting_dialog_options_dark_mode);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            a.ifPresent(new Consumer() { // from class: cwsu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cwto.this.f.b().af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Optional a2 = H.a(R.string.choose_theme_legacy_pref_key);
        ((crjx) H.K.b()).h();
        if (ctid.c) {
            a2.ifPresent(new Consumer() { // from class: cwtc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cwto.this.f.b().af((SwitchPreferenceCompat) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            a2.ifPresent(new Consumer() { // from class: cwry
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                    final cwto cwtoVar = cwto.this;
                    switchPreferenceCompat.o = new oni() { // from class: cwss
                        @Override // defpackage.oni
                        public final boolean a(Preference preference) {
                            aedr aedrVar = (aedr) cwto.this.L.b();
                            if (((crjx) aedrVar.b.b()).g()) {
                                ((crjx) aedrVar.b.b()).b();
                                return true;
                            }
                            ((crjx) aedrVar.b.b()).c();
                            return true;
                        }
                    };
                    switchPreferenceCompat.k(((crjx) cwtoVar.K.b()).g());
                    switchPreferenceCompat.N(true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        H.a(R.string.gemini_screen_pref_key).ifPresent(new Consumer() { // from class: cwsx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Preference preference = (Preference) obj;
                boolean booleanValue = ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue();
                cwto cwtoVar = cwto.this;
                if (!booleanValue || cwtoVar.N.isEmpty()) {
                    cwtoVar.f.b().af(preference);
                } else {
                    preference.M(cwtoVar.f.Y(R.string.gemini_settings_page_title));
                    preference.t = ((akvg) cwtoVar.g.b()).c(cwtoVar.f.b().j);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.af = H.a(R.string.vmt_pref_key);
        H.af.ifPresent(new Consumer() { // from class: cwsy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                boolean booleanValue = ((Boolean) ((cfup) shw.a.get()).e()).booleanValue();
                cwto cwtoVar = cwto.this;
                if (!booleanValue || cwtoVar.F.isEmpty()) {
                    cwtoVar.f.b().af(preferenceScreen);
                    return;
                }
                cwtoVar.F.get();
                preferenceScreen.L(R.string.vmt_preference_page_title);
                preferenceScreen.t = smv.a(cwtoVar.f.b().j);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        H.aj = H.a(R.string.fast_photo_send_pref_key);
        if (!H.aj.isEmpty()) {
            ((SwitchPreferenceCompat) H.aj.get()).G(false);
            ((SwitchPreferenceCompat) H.aj.get()).N(false);
            if (!H.O.a()) {
                H.r.g(R.id.fast_image_sending_setting_subscription_id, new ctaw((ctax) H.J.b()), new cwtj(H));
                ((SwitchPreferenceCompat) H.aj.get()).n = new elhi(H.w, "ApplicationSettingsFragmentPeer:setupFastImageSendingPreference", new onh() { // from class: cwsr
                    @Override // defpackage.onh
                    public final boolean a(Preference preference, Object obj) {
                        final ctax ctaxVar = (ctax) cwto.this.J.b();
                        final boolean equals = Boolean.TRUE.equals(obj);
                        ctaxVar.b.a(ctaxVar.b().j(new emwl() { // from class: ctav
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                ctax ctaxVar2 = ctax.this;
                                ctau ctauVar = (ctau) obj2;
                                if (equals) {
                                    ctat ctatVar = (ctat) ctauVar.toBuilder();
                                    ctatVar.copyOnWrite();
                                    ctau ctauVar2 = (ctau) ctatVar.instance;
                                    ctauVar2.b |= 4;
                                    ctauVar2.e = true;
                                    int intValue = ((Integer) ctay.a.e()).intValue();
                                    ctatVar.copyOnWrite();
                                    ctau ctauVar3 = (ctau) ctatVar.instance;
                                    ctauVar3.b = 1 | ctauVar3.b;
                                    ctauVar3.c = intValue;
                                    int intValue2 = ((Integer) ctay.b.e()).intValue();
                                    ctatVar.copyOnWrite();
                                    ctau ctauVar4 = (ctau) ctatVar.instance;
                                    ctauVar4.b |= 2;
                                    ctauVar4.d = intValue2;
                                    ctau ctauVar5 = (ctau) ctatVar.build();
                                    ((akzt) ctaxVar2.c.b()).c("Bugle.Media.FastImageSending.OptIn.Count");
                                    return ctauVar5;
                                }
                                ctat ctatVar2 = (ctat) ctauVar.toBuilder();
                                ctatVar2.copyOnWrite();
                                ctau ctauVar6 = (ctau) ctatVar2.instance;
                                ctauVar6.b |= 4;
                                ctauVar6.e = false;
                                int intValue3 = ((Integer) ctay.c.e()).intValue();
                                ctatVar2.copyOnWrite();
                                ctau ctauVar7 = (ctau) ctatVar2.instance;
                                ctauVar7.b = 1 | ctauVar7.b;
                                ctauVar7.c = intValue3;
                                int intValue4 = ((Integer) ctay.d.e()).intValue();
                                ctatVar2.copyOnWrite();
                                ctau ctauVar8 = (ctau) ctatVar2.instance;
                                ctauVar8.b |= 2;
                                ctauVar8.d = intValue4;
                                ctau ctauVar9 = (ctau) ctatVar2.build();
                                ((akzt) ctaxVar2.c.b()).c("Bugle.Media.FastImageSending.OptOut.Count");
                                return ctauVar9;
                            }
                        }), ctax.a);
                        return false;
                    }
                });
            }
        }
        H.ag = H.a(R.string.send_sound_pref_key);
        if (!H.ag.isEmpty()) {
            ((Preference) H.ag.get()).L(R.string.incoming_outgoing_sound_pref_title);
        }
        H.ak = H.a(R.string.expressive_animations_pref_key);
        if (H.ak.isEmpty()) {
            return;
        }
        if (H.M.isEmpty()) {
            H.f.b().af((Preference) H.ak.get());
            return;
        }
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) H.ak.get();
        switchPreferenceCompat.L(R.string.expressive_animations_pref_title);
        ((SwitchPreferenceCompat) H.ak.get()).G(false);
        ((SwitchPreferenceCompat) H.ak.get()).N(false);
        H.r.g(R.id.expressive_animations_settings_subscription_id, ((cwqs) H.M.get()).a(), new cwtg(H));
        ((SwitchPreferenceCompat) H.ak.get()).n = new elhi(H.w, "ApplicationSettingsFragmentPeer:setupExpressiveAnimationsPreference", new onh() { // from class: cwsh
            @Override // defpackage.onh
            public final boolean a(Preference preference, Object obj) {
                ((cwqs) cwto.this.M.get()).d(Boolean.TRUE.equals(obj));
                return false;
            }
        });
    }

    @Override // defpackage.cxip, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
