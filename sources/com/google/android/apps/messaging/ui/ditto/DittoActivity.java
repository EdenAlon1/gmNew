package com.google.android.apps.messaging.ui.ditto;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.abh;
import defpackage.adhu;
import defpackage.adtn;
import defpackage.adtt;
import defpackage.adwg;
import defpackage.akgb;
import defpackage.akis;
import defpackage.akkp;
import defpackage.akzt;
import defpackage.asmo;
import defpackage.auxx;
import defpackage.cful;
import defpackage.cthp;
import defpackage.ctyx;
import defpackage.cvde;
import defpackage.cwpw;
import defpackage.dafa;
import defpackage.dbqi;
import defpackage.dbqk;
import defpackage.dbql;
import defpackage.dbqm;
import defpackage.dbrk;
import defpackage.dbrm;
import defpackage.dbsz;
import defpackage.eisx;
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
import defpackage.eoio;
import defpackage.fazb;
import defpackage.fazw;
import defpackage.fbaz;
import defpackage.fbbf;
import defpackage.im;
import defpackage.lkk;
import defpackage.lkv;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DittoActivity extends dbrm implements ekhu, ekhr, ekke {
    private boolean L;
    private Context M;
    private lkv O;
    private boolean P;
    private dbqk n;
    private final ekwr K = new ekwr(this, this);
    private final long N = SystemClock.elapsedRealtime();

    private final dbqk M() {
        N();
        return this.n;
    }

    private final void N() {
        if (this.n != null) {
            return;
        }
        if (!this.L) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.P && !isFinishing()) {
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
                    if (!(activity instanceof DittoActivity)) {
                        throw new IllegalStateException(a.I(activity, dbqk.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    DittoActivity dittoActivity = (DittoActivity) activity;
                    dittoActivity.getClass();
                    fbbf fbbfVar = ((akgb) aX).b.a.alj;
                    fazb a = fbaz.a(((akgb) aX).c.bN);
                    akis akisVar = ((akgb) aX).b;
                    akkp akkpVar = akisVar.a;
                    this.n = new dbqk(dittoActivity, fbbfVar, a, akkpVar.f, akisVar.aU, akkpVar.an, ((akgb) aX).c.bt, akkpVar.db, akisVar.nX, ((akgb) aX).w, akkpVar.Uk, ((akgb) aX).x, akisVar.b.ox, akkpVar.RR);
                    f.close();
                    this.n.q = this;
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

    @Override // defpackage.ekhr
    public final long D() {
        return this.N;
    }

    @Override // defpackage.cwqf
    public final /* synthetic */ fazw E() {
        return new ekks(this);
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dbqk.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        dbqk dbqkVar = this.n;
        if (dbqkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.P) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dbqkVar;
    }

    @Override // defpackage.cwps
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.hl, defpackage.lkr
    public final lkk P() {
        if (this.O == null) {
            this.O = new ekkf(this);
        }
        return this.O;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.M;
        }
        ellt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.iy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.M = context;
        ellt.a(context);
        super.attachBaseContext(context);
        this.M = null;
    }

    @Override // defpackage.efac, android.app.Activity
    public final void finish() {
        elav a = this.K.a();
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
        elav k = this.K.k();
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
        elav r = this.K.r();
        try {
            super.onActivityResult(i, i2, intent);
            dbqk M = M();
            if (i == 301) {
                if (i2 == -1) {
                    dbqk.a.m("Ditto Battery de-optimization accepted.");
                    ((akzt) M.h.b()).c("Bugle.Ditto.Battery.Deoptimization.Accepted.Counts");
                } else {
                    dbqk.a.m("Ditto Battery de-optimization rejected.");
                    ((akzt) M.h.b()).c("Bugle.Ditto.Battery.Deoptimization.Rejected.Counts");
                }
            }
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
        elav b = this.K.b();
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
        elav c = this.K.c();
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
        elav s = this.K.s();
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
    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        elav t = this.K.t();
        try {
            this.L = true;
            N();
            ((ekkf) P()).h(this.K);
            aX().aP().a();
            super.onCreate(bundle);
            dbqk M = M();
            if (!((Boolean) cful.i.e()).booleanValue()) {
                if (((asmo) M.o.b()).a()) {
                    M.e.finish();
                } else {
                    M.e.finish();
                }
            }
            if (M.e.getIntent().getBooleanExtra("started_from_notification", false)) {
                ((akzt) M.h.b()).c("Bugle.Ditto.Notification.Connected.Click");
            }
            if (bundle == null) {
                ((akzt) M.h.b()).c("Bugle.Ditto.Pairing.Seen");
            }
            boolean a = ((auxx) M.n.b()).a();
            if (a) {
                abh.a(M.e);
            }
            M.e.setContentView(R.layout.ditto_activity_gm3);
            ViewGroup viewGroup = (ViewGroup) M.e.findViewById(android.R.id.content);
            if (!a) {
                viewGroup.setSystemUiVisibility(1280);
                M.e.getWindow().setStatusBarColor(0);
            }
            ((ctyx) M.i.b()).h("ditto_has_seen_pairing_screen", true);
            im k = M.e.k();
            if (k != null) {
                cwpw.c(M.e.getApplicationContext(), k, R.string.qr_action_bar_device_pairing_title);
                k.setDisplayHomeAsUpEnabled(true);
            }
            M.c = M.e.findViewById(R.id.appBarLayout);
            if (bundle != null) {
                M.b = bundle.getInt("uistate");
                if (adhu.b()) {
                    M.p = Optional.of((eisx) bundle.getParcelable("accountId"));
                }
            }
            M.d = new dbqi(M);
            M.e.gE().b(M.e, M.d);
            if (!adhu.b()) {
                M.b(Optional.empty());
            }
            ellg.a(this).b = findViewById(android.R.id.content);
            dbqk dbqkVar = this.n;
            ellj.a(this, dbsz.class, new dbql(dbqkVar));
            ellj.a(this, dbrk.class, new dbqm(dbqkVar));
            this.L = false;
            this.K.m();
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

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        dbqk M = M();
        M.e.getMenuInflater().inflate(R.menu.ditto_welcome_menu, menu);
        if (((Boolean) adwg.a.e()).booleanValue()) {
            menu.findItem(R.id.action_help_and_feedback).setVisible(false);
            menu.findItem(R.id.action_help).setVisible(true);
            menu.findItem(R.id.action_advanced_feedback).setVisible(true);
        }
        if (M.k) {
            ((dafa) M.g.b()).a(menu.addSubMenu(0, 0, 1000, "Debug"), false);
        }
        cvde.a(menu);
        return true;
    }

    @Override // defpackage.abe, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        elav u = this.K.u();
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
        elav d = this.K.d();
        try {
            super.onDestroy();
            this.P = true;
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
        elav e = this.K.e(intent);
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
        NotificationChannel notificationChannel;
        elav w = this.K.w();
        try {
            dbqk M = M();
            int itemId = menuItem.getItemId();
            boolean z = true;
            if (itemId == R.id.action_help_and_feedback) {
                M.a();
            } else if (itemId == R.id.action_help) {
                M.a();
            } else if (itemId == R.id.action_advanced_feedback) {
                adtn adtnVar = (adtn) M.l.b();
                DittoActivity dittoActivity = M.e;
                adtt adttVar = new adtt();
                adttVar.b(eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
                adtnVar.b(dittoActivity, adttVar.a());
            } else if (itemId == R.id.notification_settings) {
                DittoActivity dittoActivity2 = M.e;
                cthp cthpVar = (cthp) M.j.b();
                cthpVar.a();
                notificationChannel = ((NotificationManager) cthpVar.a.b()).getNotificationChannel("bugle_connected_to_web_channel_v1");
                notificationChannel.getClass();
                Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.CHANNEL_ID", "bugle_connected_to_web_channel_v1");
                intent.putExtra("android.provider.extra.APP_PACKAGE", cthpVar.b.getPackageName());
                eldl.p(dittoActivity2, intent);
            } else if (itemId == 16908332) {
                M.e.gE().d();
            } else {
                if (M.k) {
                    ((dafa) M.g.b()).d(itemId, M.e, dafa.a);
                }
                z = super.onOptionsItemSelected(menuItem);
            }
            w.close();
            return z;
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
        elav f = this.K.f();
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
        elav x = this.K.x();
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
        elav y = this.K.y();
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
        elav g = this.K.g();
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
        elav z = this.K.z();
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

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.K.h();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.cwps, defpackage.efac, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        elav A = this.K.A();
        try {
            super.onSaveInstanceState(bundle);
            dbqk M = M();
            bundle.putInt("uistate", M.b);
            if (adhu.b() && M.p.isPresent()) {
                bundle.putParcelable("accountId", M.p.get());
            }
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
        elav i = this.K.i();
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
        elav j = this.K.j();
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
        elav l = this.K.l();
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
