package com.google.android.apps.messaging.gaia.expresssignin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.adlp;
import defpackage.adlq;
import defpackage.adlr;
import defpackage.adls;
import defpackage.adlt;
import defpackage.admj;
import defpackage.admx;
import defpackage.adng;
import defpackage.adni;
import defpackage.akgb;
import defpackage.akis;
import defpackage.akko;
import defpackage.audf;
import defpackage.cg;
import defpackage.cgds;
import defpackage.cgdt;
import defpackage.csgj;
import defpackage.cwmk;
import defpackage.cwml;
import defpackage.ea;
import defpackage.ekhr;
import defpackage.ekht;
import defpackage.ekhu;
import defpackage.ekke;
import defpackage.ekkf;
import defpackage.ekks;
import defpackage.ekwr;
import defpackage.ekyf;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.eldl;
import defpackage.eleg;
import defpackage.ellt;
import defpackage.fazw;
import defpackage.fbae;
import defpackage.fbbb;
import defpackage.fbbf;
import defpackage.fr;
import defpackage.lkk;
import defpackage.lkv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleExpressSignInActivity extends admx implements ekhu, ekhr, ekke {
    private adls o;
    private boolean q;
    private Context r;
    private lkv t;
    private boolean u;
    private final ekwr p = new ekwr(this, this);
    private final long s = SystemClock.elapsedRealtime();

    private final void E() {
        Throwable th;
        if (this.o != null) {
            return;
        }
        if (!this.q) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.u && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        ekzz f = eleg.f("CreateComponent");
        try {
            aX();
            f.close();
            ekzz f2 = eleg.f("CreatePeer");
            try {
                try {
                    try {
                        Object aX = aX();
                        Activity activity = (Activity) ((akgb) aX).d.b();
                        if (!(activity instanceof BugleExpressSignInActivity)) {
                            throw new IllegalStateException(a.I(activity, adls.class, "Attempt to inject a Activity wrapper of type "));
                        }
                        BugleExpressSignInActivity bugleExpressSignInActivity = (BugleExpressSignInActivity) activity;
                        bugleExpressSignInActivity.getClass();
                        fbbf fbbfVar = ((akgb) aX).P;
                        fbbf fbbfVar2 = ((akgb) aX).Q;
                        fbbf fbbfVar3 = ((akgb) aX).R;
                        fbbf fbbfVar4 = ((akgb) aX).S;
                        fbbf fbbfVar5 = ((akgb) aX).V;
                        fbbf fbbfVar6 = ((akgb) aX).W;
                        fbbf fbbfVar7 = ((akgb) aX).X;
                        fbbf fbbfVar8 = ((akgb) aX).Y;
                        fbbf fbbfVar9 = ((akgb) aX).Z;
                        fbbf fbbfVar10 = ((akgb) aX).aa;
                        fbbf fbbfVar11 = ((akgb) aX).ab;
                        akis akisVar = ((akgb) aX).b;
                        akko akkoVar = akisVar.b;
                        this.o = new adls(bugleExpressSignInActivity, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, akkoVar.kp, akisVar.a.nW, ((akgb) aX).h, akkoVar.nH);
                        f2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        try {
                            f2.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    f2.close();
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        } finally {
        }
    }

    @Override // defpackage.admx
    public final /* synthetic */ fazw B() {
        return new ekks(this);
    }

    @Override // defpackage.ekhr
    public final long D() {
        return this.s;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return adls.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        adls adlsVar = this.o;
        if (adlsVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return adlsVar;
    }

    @Override // defpackage.hl, defpackage.lkr
    public final lkk P() {
        if (this.t == null) {
            this.t = new ekkf(this);
        }
        return this.t;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.r;
        }
        ellt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.r = context;
        ellt.a(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    @Override // defpackage.efac, android.app.Activity
    public final void finish() {
        elav a = this.p.a();
        try {
            super.finish();
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

    @Override // defpackage.iy
    public final boolean hq() {
        elav k = this.p.k();
        try {
            boolean hq = super.hq();
            k.close();
            return hq;
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.iy, android.app.Activity
    public final void invalidateOptionsMenu() {
        elav k = ekyf.k();
        try {
            super.invalidateOptionsMenu();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        elav r = this.p.r();
        try {
            super.onActivityResult(i, i2, intent);
            r.close();
        } catch (Throwable th) {
            try {
                r.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        elav b = this.p.b();
        try {
            super.onAttachedToWindow();
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

    @Override // defpackage.efac, defpackage.abe, android.app.Activity
    public final void onBackPressed() {
        elav c = this.p.c();
        try {
            super.onBackPressed();
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.abe, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        elav s = this.p.s();
        try {
            super.onConfigurationChanged(configuration);
            s.close();
        } catch (Throwable th) {
            try {
                s.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ekko, java.lang.Object] */
    @Override // defpackage.admx, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        elav t = this.p.t();
        try {
            this.q = true;
            E();
            ((ekkf) P()).h(this.p);
            aX().aP().a();
            super.onCreate(bundle);
            E();
            adls adlsVar = this.o;
            if (((audf) adlsVar.o.b()).a()) {
                ((cwmk) adlsVar.n.b()).a(adlsVar.a, cwml.o);
            }
            BugleExpressSignInActivity bugleExpressSignInActivity = adlsVar.a;
            bugleExpressSignInActivity.setContentView(R.layout.bugle_express_sign_in_activity);
            bugleExpressSignInActivity.setFinishOnTouchOutside(false);
            int intExtra = bugleExpressSignInActivity.getIntent().getIntExtra("EXPRESS_SIGN_IN_FLOW_KEY", -1);
            adlsVar.q = intExtra == admj.h.j ? (adni) ((Optional) adlsVar.i.b()).orElse(adlsVar.p) : intExtra == admj.i.j ? (adni) ((Optional) adlsVar.j.b()).orElse(adlsVar.p) : intExtra == admj.a.j ? (adni) ((Optional) adlsVar.b.b()).orElse(adlsVar.p) : intExtra == admj.b.j ? (adni) ((Optional) ((fbbb) adlsVar.c).a).orElse(adlsVar.p) : intExtra == admj.c.j ? (adni) ((Optional) adlsVar.d.b()).orElse(adlsVar.p) : intExtra == admj.d.j ? (adni) ((Optional) adlsVar.f.b()).orElse(adlsVar.p) : intExtra == admj.e.j ? (adni) ((Optional) ((fbbb) adlsVar.e).a).orElse(adlsVar.p) : intExtra == admj.f.j ? (adni) ((Optional) adlsVar.g.b()).orElse(adlsVar.p) : intExtra == admj.g.j ? (adni) ((Optional) adlsVar.h.b()).orElse(adlsVar.p) : adlsVar.p;
            if (bugleExpressSignInActivity.a().g(R.id.fragment_container) == null) {
                cg cgVar = new cg(bugleExpressSignInActivity.a());
                adlt adltVar = new adlt();
                fbae.e(adltVar);
                cgVar.s(R.id.fragment_container, adltVar);
                cgVar.c();
            }
            if (intExtra == admj.d.j) {
                adng adngVar = (adng) adlsVar.k.b();
                BugleExpressSignInActivity bugleExpressSignInActivity2 = adlsVar.a;
                fr a = bugleExpressSignInActivity.a();
                String stringExtra = bugleExpressSignInActivity2.getIntent().getStringExtra("LAUNCH_CONTEXT");
                adng.a.m("launch context: ".concat(String.valueOf(stringExtra)));
                if (stringExtra != null) {
                    int hashCode = stringExtra.hashCode();
                    if (hashCode != -1713483035) {
                        if (hashCode != 561262773) {
                            if (hashCode == 998245427 && stringExtra.equals("PASSWORD_INVALID")) {
                                Intent intent = bugleExpressSignInActivity2.getIntent();
                                intent.getClass();
                                if (Build.VERSION.SDK_INT > 33) {
                                    parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.INTENT", Intent.class);
                                    parcelableExtra = (Parcelable) parcelableExtra2;
                                } else {
                                    parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
                                }
                                Intent intent2 = (Intent) parcelableExtra;
                                if (intent2 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                adng.a.m("Showing dialog for password invalidation");
                                ea h = a.h("GaiaAuthFailureDialogFragment");
                                if (h == null) {
                                    int i = cgdt.g;
                                    cgds.a(intent2, 2).t(a, "GaiaAuthFailureDialogFragment");
                                } else {
                                    cg cgVar2 = new cg(a);
                                    cgVar2.q(h);
                                    cgVar2.c();
                                }
                                bugleExpressSignInActivity2.getIntent().removeExtra("android.intent.extra.INTENT");
                                bugleExpressSignInActivity2.getIntent().removeExtra("LAUNCH_CONTEXT");
                            }
                        } else if (stringExtra.equals("ACCOUNT_CAPABILITY_FAILURE")) {
                            adng.a.m("Showing dialog for account capability failure");
                            adngVar.a(bugleExpressSignInActivity2, R.string.lighter_esi_account_capability_failure_dialog_title, R.string.lighter_esi_account_capability_failure_dialog_body);
                            bugleExpressSignInActivity2.getIntent().removeExtra("LAUNCH_CONTEXT");
                        }
                    } else if (stringExtra.equals("FAILED_TO_REGISTER")) {
                        adngVar.a(bugleExpressSignInActivity2, R.string.lighter_esi_registration_failure_dialog_title, R.string.lighter_esi_registration_failure_dialog_body);
                        bugleExpressSignInActivity2.getIntent().removeExtra("LAUNCH_CONTEXT");
                    }
                }
                adng.a.r("Unknown launch context: ".concat(String.valueOf(stringExtra)));
                bugleExpressSignInActivity2.getIntent().removeExtra("LAUNCH_CONTEXT");
            }
            if (intExtra == admj.g.j) {
                bugleExpressSignInActivity.gE().a(new adlp(adlsVar, bugleExpressSignInActivity));
            }
            if (((Boolean) csgj.q.e()).booleanValue() && intExtra == admj.e.j) {
                bugleExpressSignInActivity.gE().a(new adlq(adlsVar, bugleExpressSignInActivity));
            }
            if (intExtra == admj.h.j) {
                bugleExpressSignInActivity.gE().a(new adlr(bugleExpressSignInActivity));
            }
            this.q = false;
            this.p.m();
            t.close();
        } catch (Throwable th) {
            try {
                t.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abe, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        elav u = this.p.u();
        try {
            super.onCreatePanelMenu(i, menu);
            u.close();
            return true;
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.admx, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        elav d = this.p.d();
        try {
            super.onDestroy();
            this.u = true;
            d.close();
        } catch (Throwable th) {
            try {
                d.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.abe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        elav e = this.p.e(intent);
        try {
            super.onNewIntent(intent);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        elav w = this.p.w();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            w.close();
            return onOptionsItemSelected;
        } catch (Throwable th) {
            try {
                w.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onPause() {
        elav f = this.p.f();
        try {
            super.onPause();
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

    @Override // defpackage.abe, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        elav x = this.p.x();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            x.close();
        } catch (Throwable th) {
            try {
                x.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        elav y = this.p.y();
        try {
            super.onPostCreate(bundle);
            y.close();
        } catch (Throwable th) {
            try {
                y.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        elav g = this.p.g();
        try {
            super.onPostResume();
            g.close();
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        elav k = ekyf.k();
        try {
            boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            k.close();
            return onPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        elav z = this.p.z();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            z.close();
        } catch (Throwable th) {
            try {
                z.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.p.h();
        try {
            super.onResume();
            h.close();
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        elav A = this.p.A();
        try {
            super.onSaveInstanceState(bundle);
            A.close();
        } catch (Throwable th) {
            try {
                A.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        elav i = this.p.i();
        try {
            super.onStart();
            i.close();
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        elav j = this.p.j();
        try {
            super.onStop();
            j.close();
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity
    public final void onUserInteraction() {
        elav l = this.p.l();
        try {
            super.onUserInteraction();
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efac, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.efac, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.iy
    protected final void r() {
    }

    @Override // defpackage.iy
    protected final void s() {
    }
}
