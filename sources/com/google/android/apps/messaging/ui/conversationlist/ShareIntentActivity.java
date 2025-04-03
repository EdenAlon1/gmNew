package com.google.android.apps.messaging.ui.conversationlist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import defpackage.a;
import defpackage.akgb;
import defpackage.akgg;
import defpackage.akis;
import defpackage.akkp;
import defpackage.cwml;
import defpackage.czyq;
import defpackage.czzb;
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
import defpackage.fazb;
import defpackage.fazw;
import defpackage.fbaz;
import defpackage.fbbf;
import defpackage.lkk;
import defpackage.lkv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShareIntentActivity extends czyq implements ekhu, ekhr, ekke {
    private boolean A;
    private czzb n;
    private boolean p;
    private Context q;
    private lkv s;
    private final ekwr o = new ekwr(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final czzb J() {
        K();
        return this.n;
    }

    private final void K() {
        if (this.n != null) {
            return;
        }
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
                    if (!(activity instanceof ShareIntentActivity)) {
                        throw new IllegalStateException(a.I(activity, czzb.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    ShareIntentActivity shareIntentActivity = (ShareIntentActivity) activity;
                    shareIntentActivity.getClass();
                    akgg akggVar = ((akgb) aX).c;
                    fbbf fbbfVar = akggVar.aw;
                    fbbf fbbfVar2 = akggVar.e;
                    akis akisVar = ((akgb) aX).b;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar3 = akkpVar.nW;
                    fbbf fbbfVar4 = akisVar.b.fp;
                    fbbf fbbfVar5 = akkpVar.nk;
                    fbbf fbbfVar6 = akkpVar.Pu;
                    fazb a = fbaz.a(((akgb) aX).aK);
                    akis akisVar2 = ((akgb) aX).b;
                    fbbf fbbfVar7 = akisVar2.aZ;
                    akkp akkpVar2 = akisVar2.a;
                    this.n = new czzb(shareIntentActivity, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, a, fbbfVar7, akkpVar2.Px, akisVar2.he, akkpVar2.nV);
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
        return czzb.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        czzb czzbVar = this.n;
        if (czzbVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.A) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czzbVar;
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
        return cwml.h;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0 A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:3:0x0011, B:5:0x0057, B:7:0x006b, B:9:0x0079, B:10:0x02d6, B:15:0x0097, B:18:0x00a3, B:19:0x00b8, B:21:0x00c6, B:24:0x00e8, B:26:0x00f0, B:28:0x0100, B:32:0x0118, B:34:0x013c, B:36:0x01ce, B:37:0x01db, B:39:0x01e6, B:40:0x01fb, B:41:0x021f, B:43:0x022d, B:44:0x0241, B:46:0x024d, B:48:0x0259, B:50:0x0265, B:51:0x02ae, B:53:0x02bd), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118 A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:3:0x0011, B:5:0x0057, B:7:0x006b, B:9:0x0079, B:10:0x02d6, B:15:0x0097, B:18:0x00a3, B:19:0x00b8, B:21:0x00c6, B:24:0x00e8, B:26:0x00f0, B:28:0x0100, B:32:0x0118, B:34:0x013c, B:36:0x01ce, B:37:0x01db, B:39:0x01e6, B:40:0x01fb, B:41:0x021f, B:43:0x022d, B:44:0x0241, B:46:0x024d, B:48:0x0259, B:50:0x0265, B:51:0x02ae, B:53:0x02bd), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021f A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:3:0x0011, B:5:0x0057, B:7:0x006b, B:9:0x0079, B:10:0x02d6, B:15:0x0097, B:18:0x00a3, B:19:0x00b8, B:21:0x00c6, B:24:0x00e8, B:26:0x00f0, B:28:0x0100, B:32:0x0118, B:34:0x013c, B:36:0x01ce, B:37:0x01db, B:39:0x01e6, B:40:0x01fb, B:41:0x021f, B:43:0x022d, B:44:0x0241, B:46:0x024d, B:48:0x0259, B:50:0x0265, B:51:0x02ae, B:53:0x02bd), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Type inference failed for: r7v2, types: [ekko, java.lang.Object] */
    @Override // defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity.onCreate(android.os.Bundle):void");
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
