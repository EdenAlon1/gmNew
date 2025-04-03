package com.google.android.apps.messaging.lighterconversation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.a;
import defpackage.admj;
import defpackage.ahkz;
import defpackage.ahlc;
import defpackage.ahlm;
import defpackage.akgb;
import defpackage.akis;
import defpackage.akko;
import defpackage.akkp;
import defpackage.ecqk;
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
import defpackage.ellt;
import defpackage.fazw;
import defpackage.fbbf;
import defpackage.lkk;
import defpackage.lkv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LaunchLighterConversationActivity extends ahkz implements ekhu, ekhr, ekke {
    private ahlm o;
    private boolean q;
    private Context r;
    private lkv t;
    private boolean u;
    private final ekwr p = new ekwr(this, this);
    private final long s = SystemClock.elapsedRealtime();

    public LaunchLighterConversationActivity() {
        y(new ahlc(this));
    }

    private final ahlm m() {
        l();
        return this.o;
    }

    @Override // defpackage.ekhr
    public final long D() {
        return this.s;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ahlm.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        ahlm ahlmVar = this.o;
        if (ahlmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ahlmVar;
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.r = context;
        ellt.a(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    @Override // android.app.Activity
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

    @Override // defpackage.ahkz
    public final /* synthetic */ fazw k() {
        return new ekks(this);
    }

    public final void l() {
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
            f = eleg.f("CreatePeer");
            try {
                try {
                    Object aX = aX();
                    Activity activity = (Activity) ((akgb) aX).d.b();
                    if (!(activity instanceof LaunchLighterConversationActivity)) {
                        throw new IllegalStateException(a.I(activity, ahlm.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    LaunchLighterConversationActivity launchLighterConversationActivity = (LaunchLighterConversationActivity) activity;
                    launchLighterConversationActivity.getClass();
                    eito eitoVar = (eito) ((akgb) aX).w.b();
                    akis akisVar = ((akgb) aX).b;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar = akkpVar.Dw;
                    akko akkoVar = akisVar.b;
                    this.o = new ahlm(launchLighterConversationActivity, eitoVar, fbbfVar, akkoVar.nP, akkpVar.KS, akkpVar.KW, akisVar.p, akkpVar.ej, akkoVar.oj, akkoVar.kN);
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

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
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

    @Override // android.app.Activity, android.view.Window.Callback
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

    @Override // defpackage.abe, android.app.Activity
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

    @Override // defpackage.abe, android.app.Activity, android.content.ComponentCallbacks
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:3:0x0007, B:5:0x0022, B:6:0x0090, B:11:0x002f, B:13:0x0037, B:14:0x0044, B:16:0x0053, B:17:0x0060, B:28:0x008a, B:29:0x008d), top: B:2:0x0007 }] */
    @Override // defpackage.ahkz, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            ekwr r0 = r6.p
            elav r0 = r0.t()
            r1 = 1
            r6.q = r1     // Catch: java.lang.Throwable -> L9b
            lkk r2 = r6.P()     // Catch: java.lang.Throwable -> L9b
            ekwr r3 = r6.p     // Catch: java.lang.Throwable -> L9b
            ekkf r2 = (defpackage.ekkf) r2     // Catch: java.lang.Throwable -> L9b
            r2.h(r3)     // Catch: java.lang.Throwable -> L9b
            super.onCreate(r7)     // Catch: java.lang.Throwable -> L9b
            ahlm r7 = r6.m()     // Catch: java.lang.Throwable -> L9b
            boolean r2 = defpackage.cgje.a()     // Catch: java.lang.Throwable -> L9b
            r3 = 0
            if (r2 != 0) goto L2f
            cskc r1 = defpackage.ahlm.b     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "lighter is not enabled."
            r1.r(r2)     // Catch: java.lang.Throwable -> L9b
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r7 = r7.c     // Catch: java.lang.Throwable -> L9b
            r7.finish()     // Catch: java.lang.Throwable -> L9b
            goto L90
        L2f:
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r2 = r7.c     // Catch: java.lang.Throwable -> L9b
            android.content.Intent r2 = r2.getIntent()     // Catch: java.lang.Throwable -> L9b
            if (r2 != 0) goto L44
            cskc r1 = defpackage.ahlm.b     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "intent is null."
            r1.r(r2)     // Catch: java.lang.Throwable -> L9b
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r7 = r7.c     // Catch: java.lang.Throwable -> L9b
            r7.finish()     // Catch: java.lang.Throwable -> L9b
            goto L90
        L44:
            java.lang.String r4 = "EXPRESS_SIGN_IN_FLOW_KEY"
            admj r5 = defpackage.admj.d     // Catch: java.lang.Throwable -> L9b
            int r5 = r5.j     // Catch: java.lang.Throwable -> L9b
            r2.putExtra(r4, r5)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.getAction()     // Catch: java.lang.Throwable -> L9b
            if (r2 != 0) goto L60
            cskc r1 = defpackage.ahlm.b     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "intent action is null."
            r1.r(r2)     // Catch: java.lang.Throwable -> L9b
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r7 = r7.c     // Catch: java.lang.Throwable -> L9b
            r7.finish()     // Catch: java.lang.Throwable -> L9b
            goto L90
        L60:
            int r4 = r2.hashCode()     // Catch: java.lang.Throwable -> L9b
            r5 = -1908079756(0xffffffff8e450374, float:-2.4283787E-30)
            if (r4 == r5) goto L79
            r5 = 2634405(0x2832a5, float:3.691588E-39)
            if (r4 == r5) goto L6f
            goto L83
        L6f:
            java.lang.String r4 = "VIEW"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L83
            r2 = r1
            goto L84
        L79:
            java.lang.String r4 = "com.google.business.ACTION_INITIATE_BUSINESS_CHAT"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L83
            r2 = r3
            goto L84
        L83:
            r2 = -1
        L84:
            if (r2 == 0) goto L8d
            if (r2 == r1) goto L89
            goto L90
        L89:
            r1 = 2
            r7.l = r1     // Catch: java.lang.Throwable -> L9b
            goto L90
        L8d:
            r1 = 4
            r7.l = r1     // Catch: java.lang.Throwable -> L9b
        L90:
            r6.q = r3     // Catch: java.lang.Throwable -> L9b
            ekwr r7 = r6.p     // Catch: java.lang.Throwable -> L9b
            r7.m()     // Catch: java.lang.Throwable -> L9b
            r0.close()
            return
        L9b:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r0 = move-exception
            r7.addSuppressed(r0)
        La4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity.onCreate(android.os.Bundle):void");
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

    @Override // defpackage.ahkz, defpackage.eg, android.app.Activity
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

    @Override // defpackage.eg, defpackage.abe, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        elav v = this.p.v();
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

    @Override // defpackage.abe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        elav e = this.p.e(intent);
        try {
            super.onNewIntent(intent);
            ahlm m = m();
            ahlm.b.m("launch express sign in with new intent.");
            m.j = true;
            intent.putExtra("EXPRESS_SIGN_IN_FLOW_KEY", admj.d.j);
            m.c.setIntent(intent);
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

    @Override // android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // android.app.Activity
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

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.p.h();
        try {
            super.onResume();
            ahlm m = m();
            if (m.j) {
                m.j = false;
                m.k = false;
                m.f();
            } else if (m.k) {
                if (((Boolean) m.h.b()).booleanValue()) {
                    ecqk.a.d(ahlm.a);
                }
                m.c.finish();
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

    @Override // defpackage.abe, defpackage.hl, android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // defpackage.eg, android.app.Activity
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

    @Override // android.app.Activity
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

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (ekht.a(intent, getApplicationContext())) {
            eldl.o(intent);
        }
        super.startActivity(intent, bundle);
    }
}
