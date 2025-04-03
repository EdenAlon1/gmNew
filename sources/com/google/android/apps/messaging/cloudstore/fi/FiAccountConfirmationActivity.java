package com.google.android.apps.messaging.cloudstore.fi;

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
import com.google.android.apps.messaging.cloudstore.fi.FiAccountConfirmationActivity;
import defpackage.a;
import defpackage.akgb;
import defpackage.axdf;
import defpackage.cwml;
import defpackage.dcxg;
import defpackage.dcxh;
import defpackage.eito;
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
import defpackage.epdx;
import defpackage.eped;
import defpackage.epgc;
import defpackage.epge;
import defpackage.epgf;
import defpackage.fazw;
import defpackage.lkk;
import defpackage.lkv;
import defpackage.tev;
import defpackage.tew;
import defpackage.tig;
import defpackage.tik;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FiAccountConfirmationActivity extends tik implements ekhu, ekhr, ekke {
    private boolean A;
    private tev n;
    private boolean p;
    private Context q;
    private lkv s;
    private final ekwr o = new ekwr(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final tev J() {
        K();
        return this.n;
    }

    private final void K() {
        if (this.n == null) {
            if (!this.p) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.A && !isFinishing()) {
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
                        if (!(activity instanceof FiAccountConfirmationActivity)) {
                            throw new IllegalStateException(a.I(activity, tev.class, "Attempt to inject a Activity wrapper of type "));
                        }
                        FiAccountConfirmationActivity fiAccountConfirmationActivity = (FiAccountConfirmationActivity) activity;
                        fiAccountConfirmationActivity.getClass();
                        this.n = new tev(fiAccountConfirmationActivity, (eito) ((akgb) aX).w.b(), (axdf) ((akgb) aX).b.a.cm.b(), new dcxh());
                        f.close();
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    @Override // defpackage.ekhr
    public final long D() {
        return this.r;
    }

    @Override // defpackage.cwqf
    public final /* synthetic */ fazw E() {
        return new ekks(this);
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return tev.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        tev tevVar = this.n;
        if (tevVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.A) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return tevVar;
    }

    @Override // defpackage.cwps
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.hl, defpackage.lkr
    public final lkk P() {
        if (this.s == null) {
            this.s = new ekkf(this);
        }
        return this.s;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.q;
        }
        ellt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.q = context;
        ellt.a(context);
        super.attachBaseContext(context);
        this.q = null;
    }

    @Override // defpackage.cwps
    protected final cwml eY() {
        J();
        return cwml.o;
    }

    @Override // defpackage.efac, android.app.Activity
    public final void finish() {
        elav a = this.o.a();
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
        elav k = this.o.k();
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
        elav r = this.o.r();
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
        elav b = this.o.b();
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
        elav c = this.o.c();
        try {
            super.onBackPressed();
            J().a.gE().d();
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
        elav s = this.o.s();
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

    /* JADX WARN: Type inference failed for: r2v2, types: [ekko, java.lang.Object] */
    @Override // defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        elav t = this.o.t();
        try {
            this.p = true;
            K();
            ((ekkf) P()).h(this.o);
            aX().aP().a();
            super.onCreate(bundle);
            final tev J = J();
            J.e = eped.a(J.a.getIntent().getIntExtra("entry_point", 1));
            if (bundle != null) {
                J.d = bundle.getBoolean("loggedImpressionKey", false);
            }
            dcxh dcxhVar = J.c;
            new dcxg(J.a, new Runnable() { // from class: teu
                @Override // java.lang.Runnable
                public final void run() {
                    tev tevVar = tev.this;
                    if (tevVar.e == 3) {
                        FiAccountConfirmationActivity fiAccountConfirmationActivity = tevVar.a;
                        Toast.makeText(fiAccountConfirmationActivity, fiAccountConfirmationActivity.getString(R.string.fi_growthkit_flow_cancelled_message), 1).show();
                    }
                }
            });
            ellg.a(this).b = findViewById(android.R.id.content);
            ellj.a(this, tig.class, new tew(this.n));
            this.p = false;
            this.o.m();
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
        elav u = this.o.u();
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
        elav d = this.o.d();
        try {
            super.onDestroy();
            this.A = true;
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
        elav e = this.o.e(intent);
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
        elav w = this.o.w();
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

    @Override // defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onPause() {
        elav f = this.o.f();
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
        elav x = this.o.x();
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
        elav y = this.o.y();
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
        elav g = this.o.g();
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

    @Override // defpackage.cwps, defpackage.efac, defpackage.eg, defpackage.abe, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        elav z = this.o.z();
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

    @Override // defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.o.h();
        try {
            super.onResume();
            tev J = J();
            if (!J.d) {
                J.d = true;
                axdf axdfVar = J.b;
                int i = J.e;
                epgc epgcVar = (epgc) epge.a.createBuilder();
                epgcVar.copyOnWrite();
                epge epgeVar = (epge) epgcVar.instance;
                epgeVar.c = 2;
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
        elav A = this.o.A();
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("loggedImpressionKey", J().d);
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

    @Override // defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        elav i = this.o.i();
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

    @Override // defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        elav j = this.o.j();
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
        elav l = this.o.l();
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
