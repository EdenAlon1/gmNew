package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsml implements dsma, dsmn {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int k = 0;
    public final Activity b;
    public final dsoe c;
    public final ffsk d;
    public WeakReference e;
    public ffud f;
    public final Set g;
    public boolean h;
    public int i;
    public int j;
    private final dsmr l;
    private final dqkk m;
    private final InputMethodManager n;
    private WeakReference o;
    private final ffls p;
    private final ffls q;
    private final dqku r;
    private int s;
    private final ffbz t;

    static {
        ffko ffkoVar = new ffko(dsml.class, "detectionState", "getDetectionState()Lcom/google/android/libraries/compose/ui/keyboard/KeyboardManagerImpl$Companion$DetectionState;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(dsml.class, "keyboardState", "getKeyboardState()Lcom/google/android/libraries/compose/ui/keyboard/KeyboardState;", 0)};
    }

    public dsml(Activity activity, dsmr dsmrVar, dsoe dsoeVar, dqkk dqkkVar, ffsk ffskVar, final Optional optional) {
        activity.getClass();
        dqkkVar.getClass();
        ffskVar.getClass();
        this.b = activity;
        this.l = dsmrVar;
        this.c = dsoeVar;
        this.m = dqkkVar;
        this.d = ffskVar;
        Object systemService = activity.getSystemService("input_method");
        systemService.getClass();
        this.n = (InputMethodManager) systemService;
        this.g = new LinkedHashSet();
        this.p = new dsmj(dsmf.a, this);
        this.q = new dsmk(dsmm.d, this);
        this.r = new dqku(new dsmi(activity), new ffji() { // from class: dsmc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return Integer.valueOf(dsml.this.o());
            }
        });
        this.s = o();
        this.i = -1;
        this.j = -1;
        this.t = ffca.a(new ffix() { // from class: dsmd
            @Override // defpackage.ffix
            public final Object invoke() {
                int i = dsml.k;
                Boolean bool = (Boolean) fflm.a(Optional.this, false);
                bool.booleanValue();
                return bool;
            }
        });
    }

    static /* synthetic */ void q(dsml dsmlVar, dsmm dsmmVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            dsmmVar = dsmlVar.r();
        }
        if ((i2 & 2) != 0) {
            i = dsmlVar.s;
        }
        if (dsmmVar == dsmm.a && i >= 0) {
            if (dskj.f(dsmlVar.b)) {
                dsmlVar.i = i;
            } else {
                dsmlVar.j = i;
            }
        }
        if (dsmmVar != dsmm.d) {
            dsmlVar.h = true;
        }
    }

    private final dsmm r() {
        return (dsmm) this.q.c(a[1]);
    }

    private final void s(dsmg dsmgVar) {
        this.p.d(a[0], dsmgVar);
    }

    @Override // defpackage.dsma
    public final int a() {
        Integer valueOf = Integer.valueOf(dskj.f(this.b) ? this.i : this.j);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : ((Number) this.r.a()).intValue();
    }

    @Override // defpackage.dsma
    public final int b() {
        return c(r());
    }

    @Override // defpackage.dsma
    public final int c(dsmm dsmmVar) {
        dsmmVar.getClass();
        dsmm dsmmVar2 = dsmm.a;
        int ordinal = dsmmVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return this.s;
        }
        if (ordinal == 3) {
            return 0;
        }
        throw new ffcd();
    }

    @Override // defpackage.dsma
    public final dsmm d() {
        return r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = r4.getWindowInsetsController();
     */
    @Override // defpackage.dsma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            r4.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L2d
            android.app.Activity r0 = r3.b
            boolean r0 = defpackage.dski.d(r0)
            if (r0 != 0) goto L2d
            android.view.WindowInsetsController r0 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r0 == 0) goto L2d
            int r1 = defpackage.aeb$$ExternalSyntheticApiModelOutline0.m$1()
            defpackage.aeb$$ExternalSyntheticApiModelOutline0.m(r0, r1)
            ffbz r0 = r3.t
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L42
            goto L37
        L2d:
            android.view.inputmethod.InputMethodManager r0 = r3.n
            android.os.IBinder r1 = r4.getWindowToken()
            r2 = 0
            r0.hideSoftInputFromWindow(r1, r2)
        L37:
            if (r5 == 0) goto L42
            boolean r5 = r4.hasFocus()
            if (r5 == 0) goto L42
            r4.clearFocus()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsml.e(android.view.View, boolean):void");
    }

    @Override // defpackage.dsma
    public final void f(View view, boolean z) {
        WindowInsetsController windowInsetsController;
        int ime;
        view.getClass();
        this.e = z ? new WeakReference(view) : null;
        if (!view.hasFocus()) {
            view.requestFocus();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (Build.VERSION.SDK_INT <= 32) {
                this.n.isActive(view);
            }
            windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
                return;
            }
        }
        this.n.showSoftInput(view, 0);
    }

    @Override // defpackage.dsma
    public final void g() {
        a();
    }

    @Override // defpackage.dsma
    public final boolean h() {
        return this.l.c();
    }

    @Override // defpackage.dsma
    public final void i() {
        View currentFocus = this.b.getCurrentFocus();
        if (currentFocus != null) {
            this.o = new WeakReference(currentFocus);
        } else {
            currentFocus = this.b.getWindow().getDecorView().getRootView();
        }
        this.n.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // defpackage.dsma
    public final void j() {
        View rootView;
        WeakReference weakReference = this.o;
        if (weakReference == null || (rootView = (View) weakReference.get()) == null) {
            rootView = this.b.getWindow().getDecorView().getRootView();
        }
        this.o = null;
        this.n.showSoftInput(rootView, 0);
    }

    @Override // defpackage.dsma
    public final void k(dsmn dsmnVar) {
        dsmnVar.getClass();
        if (this.g.isEmpty()) {
            this.h = false;
            this.m.e("KeyboardManagerImpl#attach", new ffix() { // from class: dsmb
                @Override // defpackage.ffix
                public final Object invoke() {
                    dsml dsmlVar = dsml.this;
                    dsmlVar.f = ffqy.d(dsmlVar.d, null, null, new dsmh(dsmlVar, null), 3);
                    return ffcu.a;
                }
            });
            s(new dsme(this.l));
        }
        this.g.add(dsmnVar);
    }

    @Override // defpackage.dsmn
    public final void l(int i) {
        p(i);
        q(this, null, i, 1);
        this.c.l(i);
    }

    @Override // defpackage.dsmn
    public final void m(dsmm dsmmVar) {
        dsmmVar.getClass();
        this.q.d(a[1], dsmmVar);
        q(this, dsmmVar, 0, 2);
        this.c.m(dsmmVar);
    }

    @Override // defpackage.dsma
    public final void n(dsmn dsmnVar) {
        dsmnVar.getClass();
        if (this.g.remove(dsmnVar) && this.g.isEmpty()) {
            ffud ffudVar = this.f;
            if (ffudVar != null) {
                ffudVar.t(null);
            }
            this.f = null;
            s(dsmf.a);
        }
    }

    public final int o() {
        return this.b.getResources().getDimensionPixelSize(R.dimen.keyboard_height_fallback);
    }

    public final void p(int i) {
        if (this.s != i) {
            this.s = i;
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((dsmn) it.next()).l(i);
            }
        }
    }
}
