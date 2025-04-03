package com.google.android.apps.messaging.ui.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchActivity;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;
import defpackage.a;
import defpackage.abh;
import defpackage.adio;
import defpackage.ahpj;
import defpackage.akgb;
import defpackage.auxx;
import defpackage.coke;
import defpackage.cwml;
import defpackage.ddly;
import defpackage.ddmc;
import defpackage.ddmd;
import defpackage.ddny;
import defpackage.ddqu;
import defpackage.ddzb;
import defpackage.dede;
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
import defpackage.im;
import defpackage.lkk;
import defpackage.lkv;
import defpackage.llh;
import defpackage.tam;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ZeroStateSearchActivity extends ddly implements ekhu, ekhr, ekke {
    private boolean A;
    private ddmd n;
    private boolean p;
    private Context q;
    private lkv s;
    private final ekwr o = new ekwr(this, this);
    private final long r = SystemClock.elapsedRealtime();

    private final ddmd J() {
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
                    if (!(activity instanceof ZeroStateSearchActivity)) {
                        throw new IllegalStateException(a.I(activity, ddmd.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    ZeroStateSearchActivity zeroStateSearchActivity = (ZeroStateSearchActivity) activity;
                    zeroStateSearchActivity.getClass();
                    ddny ddnyVar = (ddny) ((akgb) aX).b.b.oz.b();
                    dede dedeVar = (dede) ((akgb) aX).b.b.iq.b();
                    coke cokeVar = (coke) ((akgb) aX).b.a.RH.b();
                    ddqu ddquVar = (ddqu) ((akgb) aX).bt.b();
                    tam tamVar = (tam) ((akgb) aX).m.b();
                    eito eitoVar = (eito) ((akgb) aX).w.b();
                    adio adioVar = (adio) ((akgb) aX).x.b();
                    this.n = new ddmd(zeroStateSearchActivity, ddnyVar, dedeVar, cokeVar, ddquVar, tamVar, eitoVar, adioVar, ((akgb) aX).b.a.RR);
                    f.close();
                    this.n.k = this;
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
        return ddmd.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        ddmd ddmdVar = this.n;
        if (ddmdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.A) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ddmdVar;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [ekko, java.lang.Object] */
    @Override // defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        elav t = this.o.t();
        try {
            this.p = true;
            K();
            ((ekkf) P()).h(this.o);
            aX().aP().a();
            super.onCreate(bundle);
            final ddmd J = J();
            J.h.e(J);
            if (((auxx) J.i.b()).a()) {
                abh.a(J.b);
            } else {
                J.b.getWindow().requestFeature(13);
                J.b.getWindow().requestFeature(12);
            }
            J.b.setContentView(R.layout.zero_state_search_activity);
            J.f.i().f(J.b, new llh() { // from class: ddmb
                @Override // defpackage.llh
                public final void a(Object obj) {
                    SelectedSearchResult selectedSearchResult = (SelectedSearchResult) obj;
                    if (selectedSearchResult != null) {
                        ddmd ddmdVar = ddmd.this;
                        int b = selectedSearchResult.b();
                        if (b != 2 && b != 3) {
                            if (b == 4 || b == 5) {
                                ddmdVar.c.a(ddmdVar.b, selectedSearchResult.b());
                                dede dedeVar = ddmdVar.d;
                                ZeroStateSearchActivity zeroStateSearchActivity = ddmdVar.b;
                                dedeVar.i(zeroStateSearchActivity, zeroStateSearchActivity.findViewById(android.R.id.content));
                                return;
                            }
                            return;
                        }
                        ddqu ddquVar = ddmdVar.f;
                        ConversationIdType conversationIdType = bdgq.a;
                        ConversationFilterDataItem m = ddquVar.m();
                        if (m != null) {
                            conversationIdType = m.a().a;
                        }
                        ConversationIdType conversationIdType2 = conversationIdType;
                        SearchQuery.ParticipantSearchFilter k = ddmdVar.f.k();
                        ddmdVar.c.b(ddmdVar.b, conversationIdType2, k != null ? k.a : null, ddmdVar.f.l() != null, selectedSearchResult.a(), selectedSearchResult.b() == 3 ? "video/" : "image/");
                        dede dedeVar2 = ddmdVar.d;
                        ZeroStateSearchActivity zeroStateSearchActivity2 = ddmdVar.b;
                        dedeVar2.i(zeroStateSearchActivity2, zeroStateSearchActivity2.findViewById(android.R.id.content));
                    }
                }
            });
            J.f.q(bundle);
            J.b.n((Toolbar) J.b.findViewById(R.id.toolbar));
            im k = J.b.k();
            k.getClass();
            k.setHomeAsUpIndicator(R.drawable.quantum_ic_arrow_back_white_24);
            k.hide();
            J.e.d();
            if (ahpj.a(J.b, J.g.a)) {
                ddzb.p(J.b, J.b.findViewById(R.id.zero_state_fragment_container));
            }
            if (!J.b.getIntent().getBooleanExtra("skip_back_press", false)) {
                J.j = new ddmc(J);
                J.b.gE().b(J.b, J.j);
            }
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
        boolean onOptionsItemSelected;
        elav w = this.o.w();
        try {
            ddmd J = J();
            if (menuItem.getItemId() != 16908332 || J.f.i().a() == null) {
                onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            } else {
                J.e();
                onOptionsItemSelected = true;
            }
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
            J().f.r(bundle);
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
