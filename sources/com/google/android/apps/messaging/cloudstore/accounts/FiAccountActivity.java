package com.google.android.apps.messaging.cloudstore.accounts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;
import defpackage.a;
import defpackage.akgb;
import defpackage.akis;
import defpackage.arep;
import defpackage.axdf;
import defpackage.dcxg;
import defpackage.dcxh;
import defpackage.ebbq;
import defpackage.eg;
import defpackage.eito;
import defpackage.ejhd;
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
import defpackage.ellg;
import defpackage.ellj;
import defpackage.ellt;
import defpackage.emxf;
import defpackage.epdx;
import defpackage.eped;
import defpackage.epgc;
import defpackage.epge;
import defpackage.epgf;
import defpackage.fazw;
import defpackage.ffbr;
import defpackage.iy;
import defpackage.lkk;
import defpackage.lkv;
import defpackage.tcr;
import defpackage.tcs;
import defpackage.tct;
import defpackage.tcu;
import defpackage.tdb;
import defpackage.tih;
import defpackage.tip;
import defpackage.tiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FiAccountActivity extends tdb implements ekhu, ekhr, ekke {
    private tcr K;
    private boolean M;
    private Context N;
    private lkv P;
    private boolean Q;
    private final ekwr L = new ekwr(this, this);
    private final long O = SystemClock.elapsedRealtime();

    private final tcr M() {
        N();
        return this.K;
    }

    private final void N() {
        if (this.K != null) {
            return;
        }
        if (!this.M) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.Q && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        ekzz f = eleg.f("CreateComponent");
        try {
            aX();
            f.close();
            f = eleg.f("CreatePeer");
            try {
                try {
                    Object aX = aX();
                    Activity activity = (Activity) ((akgb) aX).d.b();
                    if (!(activity instanceof FiAccountActivity)) {
                        throw new IllegalStateException(a.I(activity, tcr.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    FiAccountActivity fiAccountActivity = (FiAccountActivity) activity;
                    fiAccountActivity.getClass();
                    final eg egVar = (eg) ((akgb) aX).f.b();
                    emxf.l(egVar instanceof iy);
                    ejhd ejhdVar = new ejhd(new ffbr() { // from class: ejhe
                        @Override // defpackage.ffbr, defpackage.ffbq
                        public final Object b() {
                            eg egVar2 = eg.this;
                            ebbb a = ejgs.a(egVar2.a());
                            iy iyVar = (iy) egVar2;
                            String str = ebbq.a;
                            fr a2 = iyVar.a();
                            iyVar.getClass();
                            return new ebbr(a2, a, iyVar, ebcd.a(iyVar, ebcc.class)).a();
                        }
                    });
                    eito eitoVar = (eito) ((akgb) aX).w.b();
                    dcxh dcxhVar = new dcxh();
                    akis akisVar = ((akgb) aX).b;
                    this.K = new tcr(fiAccountActivity, ejhdVar, eitoVar, dcxhVar, akisVar.b.af(), (axdf) akisVar.a.cm.b(), (arep) ((akgb) aX).b.a.pL.b());
                    f.close();
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            } finally {
            }
        } finally {
            try {
                f.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    @Override // defpackage.aktz
    protected final int C() {
        return R.layout.base_toolbar_settings_activity_gm3;
    }

    @Override // defpackage.ekhr
    public final long D() {
        return this.O;
    }

    @Override // defpackage.cwqf
    public final /* synthetic */ fazw E() {
        return new ekks(this);
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return tcr.class;
    }

    @Override // defpackage.aktz
    protected final Integer G() {
        M();
        return null;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        tcr tcrVar = this.K;
        if (tcrVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.Q) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return tcrVar;
    }

    @Override // defpackage.cwps
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.hl, defpackage.lkr
    public final lkk P() {
        if (this.P == null) {
            this.P = new ekkf(this);
        }
        return this.P;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.N;
        }
        ellt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.N = context;
        ellt.a(context);
        super.attachBaseContext(context);
        this.N = null;
    }

    @Override // defpackage.efac, android.app.Activity
    public final void finish() {
        elav a = this.L.a();
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
        elav k = this.L.k();
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
        elav r = this.L.r();
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
        elav b = this.L.b();
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
        elav c = this.L.c();
        try {
            super.onBackPressed();
            M().a.gE().d();
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
        elav s = this.L.s();
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

    /* JADX WARN: Type inference failed for: r3v2, types: [ekko, java.lang.Object] */
    @Override // defpackage.aktz, defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        elav t = this.L.t();
        try {
            this.M = true;
            N();
            ((ekkf) P()).h(this.L);
            aX().aP().a();
            super.onCreate(bundle);
            final tcr M = M();
            ejhd ejhdVar = M.b;
            if (ejhdVar.b == null) {
                ejhdVar.b = (ebbq) ejhdVar.a.b();
            }
            Intent intent = M.a.getIntent();
            if (intent.hasExtra("entry_point")) {
                M.h = eped.a(intent.getIntExtra("entry_point", 1));
            } else {
                M.h = true != intent.getBooleanExtra("started_from_growthkit_flow", false) ? 2 : 3;
            }
            if (bundle != null) {
                M.g = bundle.getBoolean("loggedImpressionKey", false);
            }
            dcxh dcxhVar = M.e;
            new dcxg(M.a, new Runnable() { // from class: tcq
                @Override // java.lang.Runnable
                public final void run() {
                    tcr tcrVar = tcr.this;
                    if (tcrVar.h == 3) {
                        FiAccountActivity fiAccountActivity = tcrVar.a;
                        Toast.makeText(fiAccountActivity, fiAccountActivity.getString(R.string.fi_growthkit_flow_cancelled_message), 1).show();
                    }
                }
            });
            ellg.a(this).b = findViewById(android.R.id.content);
            tcr tcrVar = this.K;
            ellj.a(this, tiq.class, new tcs(tcrVar));
            ellj.a(this, tih.class, new tct(tcrVar));
            ellj.a(this, tip.class, new tcu(tcrVar));
            this.M = false;
            this.L.m();
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
        elav u = this.L.u();
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

    @Override // defpackage.cwqf, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        elav d = this.L.d();
        try {
            super.onDestroy();
            this.Q = true;
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
        elav e = this.L.e(intent);
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

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        elav w = this.L.w();
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

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onPause() {
        elav f = this.L.f();
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
        elav x = this.L.x();
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
        elav y = this.L.y();
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
        elav g = this.L.g();
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

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
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

    @Override // defpackage.cwps, defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        elav z = this.L.z();
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

    @Override // defpackage.efac, android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        M().c.a();
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.L.h();
        try {
            super.onResume();
            tcr M = M();
            if (!M.g) {
                M.g = true;
                axdf axdfVar = M.d;
                int i = M.h;
                epgc epgcVar = (epgc) epge.a.createBuilder();
                epgcVar.copyOnWrite();
                epge epgeVar = (epge) epgcVar.instance;
                epgeVar.c = 1;
                epgeVar.b = 1 | epgeVar.b;
                epgcVar.copyOnWrite();
                epge epgeVar2 = (epge) epgcVar.instance;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                epgeVar2.d = i2;
                epgeVar2.b |= 2;
                epge epgeVar3 = (epge) epgcVar.build();
                epdx epdxVar = (epdx) epgf.a.createBuilder();
                epdxVar.copyOnWrite();
                epgf epgfVar = (epgf) epdxVar.instance;
                epgeVar3.getClass();
                epgfVar.g = epgeVar3;
                epgfVar.b |= 16;
                axdfVar.q((epgf) epdxVar.build());
            }
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

    @Override // defpackage.cwps, defpackage.efac, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        elav A = this.L.A();
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("loggedImpressionKey", M().g);
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

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        elav i = this.L.i();
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

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        elav j = this.L.j();
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
        elav l = this.L.l();
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
