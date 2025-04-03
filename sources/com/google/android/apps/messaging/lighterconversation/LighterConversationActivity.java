package com.google.android.apps.messaging.lighterconversation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.ahlb;
import defpackage.ahln;
import defpackage.ahlp;
import defpackage.akgb;
import defpackage.cg;
import defpackage.dzja;
import defpackage.eaar;
import defpackage.eabn;
import defpackage.eisx;
import defpackage.ekhr;
import defpackage.ekht;
import defpackage.ekhu;
import defpackage.ekke;
import defpackage.ekkf;
import defpackage.ekks;
import defpackage.ekky;
import defpackage.ekwr;
import defpackage.ekyf;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.eldl;
import defpackage.eleg;
import defpackage.ellt;
import defpackage.emxc;
import defpackage.fazw;
import defpackage.fbae;
import defpackage.lkk;
import defpackage.lkv;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LighterConversationActivity extends ahlb implements ekhu, ekhr, ekke {
    private ahln o;
    private boolean q;
    private Context r;
    private lkv t;
    private boolean u;
    private final ekwr p = new ekwr(this, this);
    private final long s = SystemClock.elapsedRealtime();

    private final ahln G() {
        I();
        return this.o;
    }

    private final void I() {
        if (this.o == null) {
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
                        if (!(activity instanceof LighterConversationActivity)) {
                            throw new IllegalStateException(a.I(activity, ahln.class, "Attempt to inject a Activity wrapper of type "));
                        }
                        LighterConversationActivity lighterConversationActivity = (LighterConversationActivity) activity;
                        lighterConversationActivity.getClass();
                        this.o = new ahln(lighterConversationActivity, ((akgb) aX).b.b.kN);
                        f.close();
                        this.o.d = this;
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

    @Override // defpackage.ahlb
    public final /* synthetic */ fazw C() {
        return new ekks(this);
    }

    @Override // defpackage.ekhr
    public final long D() {
        return this.s;
    }

    @Override // defpackage.ekhu
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final ahln H() {
        ahln ahlnVar = this.o;
        if (ahlnVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ahlnVar;
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ahln.class;
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

    /* JADX WARN: Type inference failed for: r13v3, types: [ekko, java.lang.Object] */
    @Override // defpackage.ahlb, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        elav elavVar;
        LighterConversationActivity lighterConversationActivity = this;
        elav t = lighterConversationActivity.p.t();
        try {
            lighterConversationActivity.q = true;
            lighterConversationActivity.I();
            ((ekkf) lighterConversationActivity.P()).h(lighterConversationActivity.p);
            lighterConversationActivity.aX().aP().a();
            super.onCreate(bundle);
            ahln G = lighterConversationActivity.G();
            Intent intent = G.b.getIntent();
            eisx eisxVar = (eisx) intent.getParcelableExtra("account_id");
            elavVar = t;
            try {
                if (eisxVar == null) {
                    ahln.a.m("Account ID null!");
                    G.b.finish();
                } else {
                    try {
                        G.b.setContentView(R.layout.lighter_conversation_activity);
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("account_context", (dzja) intent.getSerializableExtra("account_context"));
                        bundle2.putParcelable("account_id", eisxVar);
                        bundle2.putString("conversation_draft_message", intent.getStringExtra("conversation_draft_message"));
                        bundle2.putSerializable("conversation_id", (Serializable) intent.getParcelableExtra("conversation_id"));
                        bundle2.putInt("entry_point", intent.getIntExtra("entry_point", 0));
                        bundle2.putLong("lighter_entry_point_id", intent.getLongExtra("lighter_entry_point_id", 0L));
                        bundle2.putString("lighter_entry_point_tracking_event_id", intent.getStringExtra("lighter_entry_point_tracking_event_id"));
                        bundle2.putLong("lighter_entry_point_tracking_id", intent.getLongExtra("lighter_entry_point_tracking_id", 0L));
                        if (((Boolean) G.c.b()).booleanValue()) {
                            if (intent.hasExtra("smart_context_image_url")) {
                                bundle2.putString("smart_context_image_url", intent.getStringExtra("smart_context_image_url"));
                            }
                            if (intent.hasExtra("smart_context_sub_title")) {
                                bundle2.putString("smart_context_sub_title", intent.getStringExtra("smart_context_sub_title"));
                            }
                            if (intent.hasExtra("smart_context_title")) {
                                bundle2.putString("smart_context_title", intent.getStringExtra("smart_context_title"));
                            }
                        }
                        ahlp ahlpVar = new ahlp();
                        fbae.e(ahlpVar);
                        ekky.b(ahlpVar, eisxVar);
                        ahlpVar.at(bundle2);
                        cg cgVar = new cg(G.b.a());
                        cgVar.t(R.id.lighter_conversation_fragment_container, ahlpVar, "LIGHTER_FRAGMENT");
                        cgVar.c();
                        lighterConversationActivity = this;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            elavVar.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                lighterConversationActivity.q = false;
                lighterConversationActivity.p.m();
                elavVar.close();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            elavVar = t;
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

    @Override // defpackage.ahlb, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
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

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, dzzi] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, dzzi] */
    @Override // defpackage.efac, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ahln G = G();
        ahlp ahlpVar = (ahlp) G.b.a().h("LIGHTER_FRAGMENT");
        if (ahlpVar != null) {
            eaar eaarVar = ahlpVar.H().t;
            if (keyEvent.getKeyCode() == 4) {
                if (eaarVar.a.f().getVisibility() == 0) {
                    eabn eabnVar = eaarVar.v;
                    ?? r6 = eaarVar.a;
                    View c = r6.c();
                    eabnVar.a.c(emxc.j(r6.g()), c);
                    return true;
                }
                boolean z = eaarVar.p;
                boolean z2 = eaarVar.q;
                boolean z3 = eaarVar.r;
                emxc emxcVar = eaarVar.o;
                eaarVar.B.c(eaarVar.b);
                if (eaarVar.i.a()) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.efac, defpackage.abe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        elav e = this.p.e(intent);
        try {
            super.onNewIntent(intent);
            ahln G = G();
            G.b.finish();
            eldl.p(G.b, intent);
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
