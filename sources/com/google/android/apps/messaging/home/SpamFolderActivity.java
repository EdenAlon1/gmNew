package com.google.android.apps.messaging.home;

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
import defpackage.a;
import defpackage.abh;
import defpackage.adzp;
import defpackage.adzx;
import defpackage.adzz;
import defpackage.aedu;
import defpackage.akgb;
import defpackage.akis;
import defpackage.akko;
import defpackage.aubf;
import defpackage.auxx;
import defpackage.axnw;
import defpackage.cins;
import defpackage.cubr;
import defpackage.ddwp;
import defpackage.ea;
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
import defpackage.elfo;
import defpackage.ellt;
import defpackage.erdt;
import defpackage.fazw;
import defpackage.fbbf;
import defpackage.im;
import defpackage.lkk;
import defpackage.lkv;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpamFolderActivity extends adzx implements ekhu, ekhr, ekke {
    private boolean L;
    private Context M;
    private lkv O;
    private boolean P;
    private aedu n;
    private final ekwr K = new ekwr(this, this);
    private final long N = SystemClock.elapsedRealtime();

    private final aedu M() {
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
                    if (!(activity instanceof SpamFolderActivity)) {
                        throw new IllegalStateException(a.I(activity, aedu.class, "Attempt to inject a Activity wrapper of type "));
                    }
                    SpamFolderActivity spamFolderActivity = (SpamFolderActivity) activity;
                    spamFolderActivity.getClass();
                    ddwp ddwpVar = (ddwp) ((akgb) aX).k.b();
                    cins cinsVar = (cins) ((akgb) aX).b.a.jc.b();
                    cubr cubrVar = (cubr) ((akgb) aX).b.a.ty.b();
                    fbbf fbbfVar = ((akgb) aX).w;
                    fbbf fbbfVar2 = ((akgb) aX).b.a.Uk;
                    fbbf fbbfVar3 = ((akgb) aX).x;
                    Optional empty = Optional.empty();
                    akis akisVar = ((akgb) aX).b;
                    akko akkoVar = akisVar.b;
                    this.n = new aedu(spamFolderActivity, ddwpVar, cinsVar, cubrVar, fbbfVar, fbbfVar2, fbbfVar3, empty, akkoVar.jB, akkoVar.kG, akisVar.a.RR);
                    f.close();
                    this.n.g = this;
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
        return aedu.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        aedu aeduVar = this.n;
        if (aeduVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.P) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aeduVar;
    }

    @Override // defpackage.cwps
    protected final boolean I() {
        return false;
    }

    @Override // defpackage.cwpv
    public final boolean K() {
        M();
        return true;
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

    @Override // defpackage.cwpv
    protected final void fx(im imVar) {
        super.fx(imVar);
        aedu M = M();
        SpamFolderActivity spamFolderActivity = M.a;
        Toolbar eZ = spamFolderActivity.eZ();
        ddwp ddwpVar = M.f;
        adzp.b(spamFolderActivity, eZ, imVar, R.string.spam_folder_activity_title, ((aubf) M.d.b()).a());
    }

    @Override // defpackage.efac, defpackage.eg
    public final void h(ea eaVar) {
        super.h(eaVar);
        boolean z = eaVar instanceof adzz;
        aedu M = M();
        if (z) {
            ((adzz) eaVar).H().aM = M;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [ekko, java.lang.Object] */
    @Override // defpackage.cwqd, defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        elav t = this.K.t();
        try {
            this.L = true;
            N();
            ((ekkf) P()).h(this.K);
            aX().aP().a();
            aedu M = M();
            super.onCreate(bundle);
            if (((auxx) M.e.b()).a()) {
                abh.a(M.a);
            }
            M.a.setContentView(R.layout.home_activity_with_fragment_container);
            Intent intent = M.a.getIntent();
            if (intent != null) {
                final int a = erdt.a(intent.getIntExtra("spam_folder_opened_source", 0));
                final cubr cubrVar = M.c;
                if (a == 0) {
                    throw null;
                }
                axnw.h(elfo.f(new Runnable() { // from class: cubq
                    @Override // java.lang.Runnable
                    public final void run() {
                        bsob e = bsom.e();
                        e.z("logSpamFolderOpened");
                        e.i(new Function() { // from class: cubp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsol bsolVar = (bsol) obj;
                                bsolVar.c(byyt.SPAM_FOLDER);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final int i = e.b().i();
                        cugd cugdVar = (cugd) cubr.this.c.b();
                        final int i2 = a;
                        cugdVar.b(new ffji() { // from class: cufy
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj) {
                                ereu ereuVar = (ereu) obj;
                                cfup cfupVar = cugd.a;
                                ereuVar.getClass();
                                erdr erdrVar = (erdr) erdu.a.createBuilder();
                                erdrVar.getClass();
                                erdrVar.copyOnWrite();
                                erdu erduVar = (erdu) erdrVar.instance;
                                erduVar.c = i2 - 1;
                                erduVar.b |= 1;
                                Object e2 = cugd.a.e();
                                e2.getClass();
                                long min = Math.min(i, ((Number) e2).longValue());
                                erdrVar.copyOnWrite();
                                erdu erduVar2 = (erdu) erdrVar.instance;
                                erduVar2.b |= 2;
                                erduVar2.d = min;
                                eyfy build = erdrVar.build();
                                build.getClass();
                                erdp erdpVar = ereuVar.a;
                                erdpVar.copyOnWrite();
                                erdq erdqVar = (erdq) erdpVar.instance;
                                erdq erdqVar2 = erdq.a;
                                erdqVar.c = (erdu) build;
                                erdqVar.b = 1;
                                return ffcu.a;
                            }
                        });
                    }
                }, cubrVar.d));
            }
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
        elav w = this.K.w();
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
            M().b.g();
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
        elav A = this.K.A();
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
