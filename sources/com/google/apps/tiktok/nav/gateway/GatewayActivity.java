package com.google.apps.tiktok.nav.gateway;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.akgb;
import defpackage.akis;
import defpackage.ejlq;
import defpackage.ekhr;
import defpackage.ekht;
import defpackage.ekhu;
import defpackage.ekke;
import defpackage.ekkf;
import defpackage.ekks;
import defpackage.eknu;
import defpackage.eknx;
import defpackage.ekod;
import defpackage.ekof;
import defpackage.ekwr;
import defpackage.ekyf;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.eldl;
import defpackage.eleg;
import defpackage.ellt;
import defpackage.emxc;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.fazw;
import defpackage.lkk;
import defpackage.lkv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GatewayActivity extends ekof implements ekhu, ekhr, ekke {
    private eknu p;
    private boolean r;
    private Context s;
    private lkv u;
    private boolean v;
    private final ekwr q = new ekwr(this, this);
    private final long t = SystemClock.elapsedRealtime();

    private final eknu l() {
        m();
        return this.p;
    }

    private final void m() {
        if (this.p == null) {
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
                        akis akisVar = ((akgb) aX).b;
                        enhd h = enhk.h(7);
                        h.k("com.google.android.apps.messaging.samsung.settings.AndromedaSettingsDeeplink", akisVar.b.oD);
                        h.k("com.google.android.apps.messaging.deeplinks.InstallDeepLink", ((akgb) aX).b.b.oE);
                        h.k("com.google.android.apps.messaging.emergency.EmergencySosConversation", ((akgb) aX).c.bP);
                        h.k("com.google.android.apps.messaging.emergency.DemoEmergencySosConversation", ((akgb) aX).c.bP);
                        h.k("com.google.android.apps.messaging.conversation.deeplink.ConversationDeeplink", ((akgb) aX).c.bQ);
                        h.k("com.google.android.apps.messaging.ui.conversation.rbm.RbmDeepLink", ((akgb) aX).b.b.oF);
                        h.k("com.google.android.apps.messaging.ui.conversation.smsdeeplinks.SmsDeepLink", ((akgb) aX).b.b.oH);
                        this.p = new eknu(new ekod(activity, h.c(), emxc.j(((akgb) aX).cH), (ejlq) ((akgb) aX).u.b()));
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
        return this.t;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return eknu.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        eknu eknuVar = this.p;
        if (eknuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.v) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return eknuVar;
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

    @Override // defpackage.ekof
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
        elav s = this.q.s();
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

    /* JADX WARN: Type inference failed for: r1v3, types: [ekko, java.lang.Object] */
    @Override // defpackage.ekof, defpackage.efag, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        elav t = this.q.t();
        try {
            this.r = true;
            m();
            ((ekkf) P()).h(this.q);
            aX().aP().a();
            super.onCreate(bundle);
            ekod ekodVar = l().a;
            ekodVar.b.k(ekodVar.e);
            if (bundle != null) {
                ekodVar.f = bundle.getInt("theme", 0);
                ekodVar.g = bundle.getInt("layout", 0);
                ekodVar.a();
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

    @Override // defpackage.ekof, defpackage.efag, defpackage.eg, android.app.Activity
    public final void onDestroy() {
        elav d = this.q.d();
        try {
            super.onDestroy();
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
            eknu l = l();
            if (bundle == null) {
                ekod ekodVar = l.a;
                if (ekodVar.c == null) {
                    ekodVar.b(eknx.a(null));
                } else if (!ekodVar.d) {
                    ekodVar.c();
                }
            }
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
            ekod ekodVar = l().a;
            bundle.putInt("theme", ekodVar.f);
            bundle.putInt("layout", ekodVar.g);
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
