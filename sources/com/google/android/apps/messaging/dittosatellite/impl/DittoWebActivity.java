package com.google.android.apps.messaging.dittosatellite.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.aciy;
import defpackage.acja;
import defpackage.aclr;
import defpackage.acoc;
import defpackage.acof;
import defpackage.acog;
import defpackage.acow;
import defpackage.acpf;
import defpackage.acpq;
import defpackage.acxa;
import defpackage.acyu;
import defpackage.akgb;
import defpackage.akzt;
import defpackage.axnw;
import defpackage.csjb;
import defpackage.ctuk;
import defpackage.dgho;
import defpackage.dghp;
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
import defpackage.elfl;
import defpackage.ellt;
import defpackage.errm;
import defpackage.fazw;
import defpackage.fbaz;
import defpackage.le;
import defpackage.lkk;
import defpackage.lkv;
import defpackage.sfx;
import defpackage.sfy;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DittoWebActivity extends acpq implements ekhu, ekhr, ekke {
    private acog p;
    private boolean r;
    private Context s;
    private lkv u;
    private boolean v;
    private final ekwr q = new ekwr(this, this);
    private final long t = SystemClock.elapsedRealtime();

    private final acog l() {
        m();
        return this.p;
    }

    private final void m() {
        if (this.p != null) {
            return;
        }
        if (!this.r) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.v && !isFinishing()) {
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
                    if (!(activity instanceof DittoWebActivity)) {
                        throw new IllegalStateException(a.I(activity, acog.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    DittoWebActivity dittoWebActivity = (DittoWebActivity) activity;
                    dittoWebActivity.getClass();
                    this.p = new acog(dittoWebActivity, fbaz.a(((akgb) aX).w), ((akgb) aX).b.a.f, fbaz.a(((akgb) aX).I), fbaz.a(((akgb) aX).b.b.oc), ((akgb) aX).b.dQ, ((akgb) aX).K, ((akgb) aX).M, ((akgb) aX).g);
                    f.close();
                    this.p.j = this;
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
        return this.t;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return acog.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        acog acogVar = this.p;
        if (acogVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.v) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return acogVar;
    }

    @Override // defpackage.hl, defpackage.lkr
    public final lkk P() {
        if (this.u == null) {
            this.u = new ekkf(this);
        }
        return this.u;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.s;
        }
        ellt.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.s = context;
        ellt.a(context);
        super.attachBaseContext(context);
        this.s = null;
    }

    @Override // defpackage.efag, android.app.Activity
    public final void finish() {
        elav a = this.q.a();
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

    @Override // android.app.Activity
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

    @Override // defpackage.acpq
    public final /* synthetic */ fazw j() {
        return new ekks(this);
    }

    @Override // defpackage.efag, defpackage.eg, defpackage.abe, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        elav r = this.q.r();
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

    @Override // defpackage.efag, android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        elav b = this.q.b();
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

    @Override // defpackage.efag, defpackage.abe, android.app.Activity
    public final void onBackPressed() {
        elav c = this.q.c();
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

    @Override // defpackage.efag, defpackage.abe, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        WebView webView;
        elav s = this.q.s();
        try {
            super.onConfigurationChanged(configuration);
            acog l = l();
            DittoWebFragment dittoWebFragment = (DittoWebFragment) l.c.a().g(R.id.ditto_web_fragment_ref);
            if (dittoWebFragment != null) {
                DittoWebActivity dittoWebActivity = l.c;
                AtomicBoolean atomicBoolean = l.f;
                boolean a = acog.a(dittoWebActivity);
                if (a != atomicBoolean.getAndSet(a)) {
                    acow H = dittoWebFragment.H();
                    acyu acyuVar = H.I;
                    if (acyuVar != null) {
                        H.b(acyuVar);
                    }
                    acow H2 = dittoWebFragment.H();
                    View view = H2.e.Q;
                    if (view != null && (webView = (WebView) view.findViewById(R.id.ditto_web_view)) != null) {
                        acow.a.p("Persisting and removing the WebView");
                        acow.c.set(Optional.of(new acoc(webView, H2.I)));
                        ((CoordinatorLayout) webView.getParent()).removeView(webView);
                        elfl.g(((errm) H2.q.b()).schedule(new Runnable() { // from class: acop
                            @Override // java.lang.Runnable
                            public final void run() {
                                acow.f();
                            }
                        }, 10000L, TimeUnit.MILLISECONDS)).k(axnw.b(), (Executor) H2.p.b());
                    }
                    l.c.recreate();
                }
            } else {
                acog.b.r("Cannot find DittoWebFragment");
            }
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

    /* JADX WARN: Type inference failed for: r1v3, types: [ekko, java.lang.Object] */
    @Override // defpackage.acpq, defpackage.efag, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        elav t = this.q.t();
        try {
            this.r = true;
            m();
            ((ekkf) P()).h(this.q);
            aX().aP().a();
            super.onCreate(bundle);
            acog l = l();
            if (!((Boolean) acog.a.e()).booleanValue() || ((acpf) l.e.b()).a()) {
                l.c.setContentView(R.layout.ditto_web_activity);
                l.f.set(acog.a(l.c));
                l.c.gE().b(l.c, new acof(l));
            } else {
                ((akzt) l.d.b()).c("Bugle.Satellite.Feature.Off.Launch.Counts");
            }
            this.r = false;
            this.q.m();
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
        elav u = this.q.u();
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

    @Override // defpackage.acpq, defpackage.efag, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        elav d = this.q.d();
        try {
            super.onDestroy();
            DittoWebFragment dittoWebFragment = (DittoWebFragment) l().c.a().g(R.id.ditto_web_fragment_ref);
            if (dittoWebFragment != null) {
                dittoWebFragment.H();
                acow.f();
            }
            this.v = true;
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

    @Override // defpackage.efag, android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        aciy a = ((acja) l().g.b()).a();
        cancellationSignal.getClass();
        consumer.getClass();
        a.e.b(consumer);
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        elav v = this.q.v();
        try {
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            v.close();
            return onMenuItemSelected;
        } catch (Throwable th) {
            try {
                v.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efag, defpackage.abe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        elav e = this.q.e(intent);
        try {
            super.onNewIntent(intent);
            acog l = l();
            DittoWebFragment dittoWebFragment = (DittoWebFragment) l.c.a().g(R.id.ditto_web_fragment_ref);
            if (dittoWebFragment == null) {
                acog.b.r("Cannot find DittoWebFragment");
            } else if (intent == null || !"ForwardDraftIntentToDittoAction".equals(intent.getAction())) {
                aclr aclrVar = new aclr(intent.getStringExtra("conversation_id_for_launch"));
                Uri data = intent.getData();
                String type = intent.getType();
                String stringExtra = intent.getStringExtra("SatelliteDittoLog");
                String stringExtra2 = intent.getStringExtra("SatelliteDittoServerVersion");
                String stringExtra3 = intent.getStringExtra("SatellitePairedBugleVersion");
                if (!aclrVar.b()) {
                    csjb a = acog.b.a();
                    a.A("conversationId", aclrVar);
                    a.r();
                    acow H = dittoWebFragment.H();
                    ((acxa) H.x.b()).c(aclrVar.toString());
                    H.e(null, aclrVar.toString());
                } else if (data != null && type != null) {
                    acow H2 = dittoWebFragment.H();
                    if (le.u(type)) {
                        sfx a2 = ((sfy) H2.t.b()).a("Bugle.Satellite.Attachment.Save.Duration");
                        a2.b(data, type, null, null);
                        a2.e(new Void[0]);
                    } else if (H2.K != null) {
                        H2.D = data;
                        H2.E = type;
                        Bundle bundle = new Bundle();
                        bundle.putString("messaging.attachment.documentName", le.z(type) ? H2.e.z().getString(R.string.default_vcard_file_name) : H2.e.z().getString(R.string.default_attachment_name));
                        bundle.putString("messaging.attachment.documentType", type);
                        H2.K.c(bundle);
                    } else {
                        acow.a.r("downloadFileLauncher is null, cannot download file");
                    }
                } else if (stringExtra == null || stringExtra2 == null || stringExtra3 == null) {
                    acog.b.r("Intent doesn't have actionable data");
                } else {
                    acow H3 = dittoWebFragment.H();
                    Bitmap a3 = dgho.a(H3.a());
                    dghp dghpVar = new dghp(H3.e.z());
                    dghpVar.c("SatelliteDittoLog", stringExtra);
                    dghpVar.c("SatelliteDittoServerVersion", stringExtra2);
                    dghpVar.c("SatellitePairedBugleVersion", stringExtra3);
                    if (a3 != null) {
                        dghpVar.a = a3;
                    }
                    ((dgho) H3.u.b()).c(dghpVar.a());
                }
            } else {
                DittoWebFragment dittoWebFragment2 = (DittoWebFragment) l.c.a().g(R.id.ditto_web_fragment_ref);
                if (dittoWebFragment2 != null) {
                    dittoWebFragment2.H().c(intent);
                } else {
                    acog.b.r("Cannot find DittoWebFragment");
                }
            }
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

    @Override // defpackage.efag, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        elav w = this.q.w();
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

    @Override // defpackage.efag, defpackage.eg, android.app.Activity
    protected final void onPause() {
        elav f = this.q.f();
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

    @Override // defpackage.efag, android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        aciy a = ((acja) l().g.b()).a();
        str.getClass();
        bundle.getClass();
        cancellationSignal.getClass();
        consumer.getClass();
        a.e.a(str, bundle, consumer);
    }

    @Override // defpackage.abe, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        elav x = this.q.x();
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

    @Override // defpackage.efag, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        elav y = this.q.y();
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

    @Override // defpackage.efag, defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        elav g = this.q.g();
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

    @Override // defpackage.efag, android.app.Activity
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

    @Override // defpackage.efag, defpackage.eg, defpackage.abe, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        elav z = this.q.z();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            ((ctuk) l().i.b()).l(i);
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

    @Override // defpackage.efag, defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.q.h();
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

    @Override // defpackage.efag, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        elav A = this.q.A();
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

    @Override // defpackage.efag, defpackage.eg, android.app.Activity
    protected final void onStart() {
        elav i = this.q.i();
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

    @Override // defpackage.efag, defpackage.eg, android.app.Activity
    protected final void onStop() {
        elav j = this.q.j();
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

    @Override // defpackage.efag, android.app.Activity
    public final void onUserInteraction() {
        elav l = this.q.l();
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

    @Override // defpackage.efag, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent);
    }

    @Override // defpackage.efag, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent, bundle);
    }
}
