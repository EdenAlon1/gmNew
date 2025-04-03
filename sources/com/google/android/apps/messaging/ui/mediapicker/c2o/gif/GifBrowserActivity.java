package com.google.android.apps.messaging.ui.mediapicker.c2o.gif;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import defpackage.a;
import defpackage.akgb;
import defpackage.akis;
import defpackage.akkp;
import defpackage.altk;
import defpackage.cful;
import defpackage.crlw;
import defpackage.csjk;
import defpackage.dcil;
import defpackage.dcin;
import defpackage.dcio;
import defpackage.dcip;
import defpackage.dcit;
import defpackage.dcjk;
import defpackage.dede;
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
import defpackage.emcs;
import defpackage.emcu;
import defpackage.epts;
import defpackage.errl;
import defpackage.fazw;
import defpackage.fbbf;
import defpackage.fbeh;
import defpackage.fbei;
import defpackage.im;
import defpackage.lkk;
import defpackage.lkv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GifBrowserActivity extends dcjk implements ekhu, ekhr, ekke {
    private dcil K;
    private boolean M;
    private Context N;
    private lkv P;
    private boolean Q;
    private final ekwr L = new ekwr(this, this);
    private final long O = SystemClock.elapsedRealtime();

    private final dcil ag() {
        ah();
        return this.K;
    }

    private final void ah() {
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
                    if (!(activity instanceof GifBrowserActivity)) {
                        throw new IllegalStateException(a.I(activity, dcil.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    GifBrowserActivity gifBrowserActivity = (GifBrowserActivity) activity;
                    gifBrowserActivity.getClass();
                    errl errlVar = (errl) ((akgb) aX).b.cK.b();
                    errl errlVar2 = (errl) ((akgb) aX).b.ps.b();
                    akis akisVar = ((akgb) aX).b;
                    fbbf fbbfVar = akisVar.a.fP;
                    emcu emcuVar = (emcu) akisVar.b.iX.b();
                    emcs emcsVar = new emcs((emcu) ((akgb) aX).b.b.iX.b());
                    akkp akkpVar = ((akgb) aX).b.a;
                    this.K = new dcil(gifBrowserActivity, errlVar, errlVar2, fbbfVar, emcuVar, emcsVar, akkpVar.AJ, (csjk) akkpVar.el.b(), (dede) ((akgb) aX).b.b.iq.b(), new dcip(((akgb) aX).bo));
                    f.close();
                    this.K.v = this;
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
        return this.O;
    }

    @Override // defpackage.cwqf
    public final /* synthetic */ fazw E() {
        return new ekks(this);
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return dcil.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        dcil dcilVar = this.K;
        if (dcilVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.Q) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return dcilVar;
    }

    @Override // defpackage.cwps
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.dbxx
    protected final epts M() {
        ag();
        return epts.GIF;
    }

    @Override // defpackage.dbxx
    protected final Class N() {
        ag();
        return GifContentItem.class;
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
            dcil ag = ag();
            ag.l.ak(ag.j.d);
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) ag.k.o;
            if (staggeredGridLayoutManager != null) {
                staggeredGridLayoutManager.J(dcil.c(configuration));
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

    /* JADX WARN: Type inference failed for: r2v2, types: [ekko, java.lang.Object] */
    @Override // defpackage.dbxx, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        elav t = this.L.t();
        try {
            this.M = true;
            ah();
            ((ekkf) P()).h(this.L);
            aX().aP().a();
            super.onCreate(bundle);
            dcil ag = ag();
            ag.a.setContentView(R.layout.activity_gif_browser);
            dcip dcipVar = ag.h;
            GifBrowserActivity gifBrowserActivity = ag.a;
            dcit dcitVar = (dcit) dcipVar.a.b();
            dcitVar.getClass();
            ag.j = new dcio(dcitVar, gifBrowserActivity, ag);
            GifBrowserActivity gifBrowserActivity2 = ag.a;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
            ag.m = (ProgressBar) ag.a.findViewById(R.id.gif_browser_loading_spinner);
            ag.l = (RecyclerView) ag.a.findViewById(R.id.gif_browser_category_recycler_view);
            ag.l.am(ag.j);
            ag.l.ap(linearLayoutManager);
            ag.l.aL();
            dcin dcinVar = new dcin(ag.a, ag);
            dcinVar.B(true);
            ag.i = dcinVar;
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(dcil.c(ag.a.getResources().getConfiguration()));
            staggeredGridLayoutManager.N();
            ag.k = (RecyclerView) ag.a.findViewById(R.id.gif_recycler_view);
            ag.k.am(ag.i);
            ag.k.ap(staggeredGridLayoutManager);
            ag.k.aL();
            fbeh fbehVar = (fbeh) fbei.a.createBuilder();
            fbehVar.copyOnWrite();
            ((fbei) fbehVar.instance).b = 180;
            fbei fbeiVar = (fbei) fbehVar.build();
            Intent intent = ag.a.getIntent();
            ag.e.d = ag;
            emcs emcsVar = ag.e;
            fbeh fbehVar2 = (fbeh) fbei.a.createBuilder();
            int intExtra = intent.getIntExtra("max_attachment_width", 0);
            fbehVar2.copyOnWrite();
            ((fbei) fbehVar2.instance).b = intExtra;
            int intExtra2 = intent.getIntExtra("max_attachment_height", 0);
            fbehVar2.copyOnWrite();
            ((fbei) fbehVar2.instance).c = intExtra2;
            emcsVar.c.b = (fbei) fbehVar2.build();
            ag.e.c.c = intent.getIntExtra("max_attachment_size", 0);
            emcs emcsVar2 = ag.e;
            emcsVar2.c.d = fbeiVar;
            emcsVar2.c.e = ((Integer) cful.e.e()).intValue();
            String stringExtra = intent.getStringExtra("search_text");
            ag.g(true);
            if (((Boolean) cful.d.e()).booleanValue() && TextUtils.isEmpty(stringExtra)) {
                ag.s = true;
                ag.f();
                ag.k(stringExtra);
            } else {
                ag.s = false;
                ag.t = stringExtra;
                ag.e.a(stringExtra);
                if (ag.k(stringExtra)) {
                    ag.u = 3;
                } else {
                    ag.r = stringExtra;
                    ag.u = 4;
                }
            }
            View findViewById = ag.a.findViewById(R.id.gif_browser_activity);
            findViewById.setSystemUiVisibility(1792);
            findViewById.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dcif
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
            ag.k.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dcig
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
            ((altk) ag.c.b()).aB(2, ag.u, ag.n());
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

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        final dcil ag = ag();
        ag.a.getMenuInflater().inflate(R.menu.gif_browser_menu, menu);
        ag.q = (BugleSearchView) menu.findItem(R.id.action_search_gifs).getActionView();
        ag.q.setZeroEffectivePadding();
        ag.q.setMaxWidth(Alert.DURATION_SHOW_INDEFINITELY);
        ag.q.setQueryHint(ag.a.getString(R.string.c2o_gif_hint));
        ag.q.setOnQueryTextListener(ag);
        BugleSearchView bugleSearchView = ag.q;
        bugleSearchView.setImeOptions(bugleSearchView.getImeOptions() | VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        ag.q.getSearchTextView().setTypeface(crlw.a(ag.a));
        ag.o = (ImageView) ag.q.findViewById(R.id.search_close_btn);
        ag.o.setImageResource(R.drawable.tinted_quantum_ic_close_24);
        ag.p = (ImageView) ag.q.findViewById(R.id.search_button);
        ag.p.setOnClickListener(new View.OnClickListener() { // from class: dcih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcil dcilVar = dcil.this;
                dcilVar.h(false);
                dcilVar.o.setVisibility(8);
            }
        });
        if (!TextUtils.isEmpty(ag.r)) {
            ag.h(false);
            ag.q.setQuery(ag.r, false);
            ag.q.clearFocus();
        } else if (ag.a.getIntent().hasExtra("search_text")) {
            ag.h(true);
        } else {
            ag.h(false);
            ag.o.setVisibility(8);
        }
        ag.j();
        im k = ag.a.k();
        if (k != null) {
            k.setHomeAsUpIndicator((Drawable) null);
            k.setHomeActionContentDescription(R.string.action_back);
            k.setElevation(0.0f);
            View customView = k.getCustomView();
            if (customView == null || customView.getId() != R.id.gif_browser_title_container) {
                k.setDisplayShowTitleEnabled(false);
                k.setDisplayShowCustomEnabled(true);
                k.setCustomView(R.layout.action_bar_gif_browser_title_m2);
                TextView textView = (TextView) k.getCustomView().findViewById(R.id.gif_browser_title);
                textView.setText(ag.a.getString(R.string.action_search_gifs));
                textView.setOnClickListener(new View.OnClickListener() { // from class: dcii
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dcil dcilVar = dcil.this;
                        dcilVar.h(false);
                        dcilVar.o.setVisibility(8);
                    }
                });
            }
        }
        return true;
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
            dcil ag = ag();
            emcs emcsVar = ag.e;
            emcsVar.b.removeCallbacks(emcsVar.a);
            emcsVar.d = null;
            ((altk) ag.c.b()).aB(5, ag.u, ag.n());
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

    @Override // defpackage.dbxx, defpackage.cwpv, defpackage.efac, android.app.Activity
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

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected final void onResume() {
        elav h = this.L.h();
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
        elav A = this.L.A();
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
