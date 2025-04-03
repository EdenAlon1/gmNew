package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abe extends hl implements lkr, lmy, lkd, owz, acd, ado, kop, koq, gx, gy, ktt {
    private final owy a;
    private lmx b;
    private final ffbz c;
    private final AtomicInteger d;
    private final CopyOnWriteArrayList e;
    public final adb f = new adb();
    public final ktv g = new ktv(new Runnable() { // from class: aam
        @Override // java.lang.Runnable
        public final void run() {
            abe.this.invalidateOptionsMenu();
        }
    });
    public final adn h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final aav m;
    private final ffbz q;
    private final ffbz r;
    private final CopyOnWriteArrayList sw;
    private boolean sx;
    private boolean sy;

    public abe() {
        owy a = owx.a(this);
        this.a = a;
        this.m = new aav(this);
        this.c = ffca.a(new aba(this));
        this.d = new AtomicInteger();
        this.h = new aay(this);
        this.e = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.sw = new CopyOnWriteArrayList();
        if (P() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        P().c(new lkp() { // from class: aan
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                Window window;
                View peekDecorView;
                if (lkiVar != lki.ON_STOP || (window = abe.this.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                    return;
                }
                peekDecorView.cancelPendingInputEvents();
            }
        });
        P().c(new lkp() { // from class: aao
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                if (lkiVar == lki.ON_DESTROY) {
                    abe abeVar = abe.this;
                    abeVar.f.b = null;
                    if (!abeVar.isChangingConfigurations()) {
                        abeVar.S().c();
                    }
                    aav aavVar = abeVar.m;
                    aavVar.b.getWindow().getDecorView().removeCallbacks(aavVar);
                    aavVar.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(aavVar);
                }
            }
        });
        P().c(new aas(this));
        a.a();
        lmc.c(this);
        U().b("android:support:activity-result", new owu() { // from class: aap
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle = new Bundle();
                adn adnVar = abe.this.h;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(adnVar.c.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(adnVar.c.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(adnVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(adnVar.g));
                return bundle;
            }
        });
        y(new adc() { // from class: aaq
            @Override // defpackage.adc
            public final void a() {
                abe abeVar = abe.this;
                Bundle a2 = abeVar.U().a("android:support:activity-result");
                if (a2 != null) {
                    adn adnVar = abeVar.h;
                    ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        adnVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle != null) {
                        adnVar.g.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (adnVar.c.containsKey(str)) {
                            Integer num = (Integer) adnVar.c.remove(str);
                            if (!adnVar.g.containsKey(str)) {
                                Map map = adnVar.b;
                                fflf.g(map);
                                map.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        num2.getClass();
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        str2.getClass();
                        adnVar.d(intValue, str2);
                    }
                }
            }
        });
        this.q = ffca.a(new aaz(this));
        this.r = ffca.a(new abd(this));
    }

    public final void A() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        lmz.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        lna.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        oxa.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        aci.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // defpackage.lkd
    public lms R() {
        return (lms) this.q.a();
    }

    @Override // defpackage.lmy
    public final lmx S() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        z();
        lmx lmxVar = this.b;
        lmxVar.getClass();
        return lmxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lkd
    public lnx T() {
        loa loaVar = new loa((byte[]) (0 == true ? 1 : 0));
        if (getApplication() != null) {
            lnw lnwVar = lmp.b;
            Application application = getApplication();
            application.getClass();
            loaVar.b(lnwVar, application);
        }
        loaVar.b(lmc.a, this);
        loaVar.b(lmc.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            loaVar.b(lmc.c, extras);
        }
        return loaVar;
    }

    @Override // defpackage.owz
    public final owv U() {
        return this.a.a;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ado
    public final adn d() {
        return this.h;
    }

    @Override // defpackage.kop
    public final void g(ksp kspVar) {
        kspVar.getClass();
        this.e.remove(kspVar);
    }

    @Override // defpackage.acd
    public final aca gE() {
        return (aca) this.r.a();
    }

    @Override // defpackage.kop
    public final void hv(ksp kspVar) {
        kspVar.getClass();
        this.e.add(kspVar);
    }

    @Override // android.app.Activity
    @ffbs
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.f(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @ffbs
    public void onBackPressed() {
        gE().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ksp) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.a.b(bundle);
        adb adbVar = this.f;
        adbVar.b = this;
        Iterator it = adbVar.a.iterator();
        while (it.hasNext()) {
            ((adc) it.next()).a();
        }
        super.onCreate(bundle);
        int i = lls.a;
        llp.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.g.a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.g.c(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @ffbs
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.sx) {
            return;
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ksp) it.next()).accept(new gw(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((ksp) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.g.b.iterator();
        while (it.hasNext()) {
            ((fa) it.next()).a.D(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @ffbs
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.sy) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((ksp) it.next()).accept(new gz(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.g.b(menu);
        return true;
    }

    @Override // android.app.Activity
    @ffbs
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.h.f(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        aat aatVar;
        lmx lmxVar = this.b;
        if (lmxVar == null && (aatVar = (aat) getLastNonConfigurationInstance()) != null) {
            lmxVar = aatVar.a;
        }
        if (lmxVar == null) {
            return null;
        }
        aat aatVar2 = new aat();
        aatVar2.a = lmxVar;
        return aatVar2;
    }

    @Override // defpackage.hl, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (P() instanceof lkv) {
            lkk P = P();
            P.getClass();
            ((lkv) P).f(lkj.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((ksp) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.sw.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ozg.c()) {
                ozg.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            abn u = u();
            synchronized (u.a) {
                u.b = true;
                Iterator it = u.c.iterator();
                while (it.hasNext()) {
                    ((ffix) it.next()).invoke();
                }
                u.c.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @ffbs
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @ffbs
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final abn u() {
        return (abn) this.c.a();
    }

    public final adg v(adu aduVar, adf adfVar) {
        adn adnVar = this.h;
        adnVar.getClass();
        return adnVar.c("activity_rq#" + this.d.getAndIncrement(), this, aduVar, adfVar);
    }

    public final void x(final aca acaVar) {
        P().c(new lkp() { // from class: aar
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                OnBackInvokedDispatcher onBackInvokedDispatcher;
                if (lkiVar == lki.ON_CREATE) {
                    abe abeVar = this;
                    aca acaVar2 = aca.this;
                    onBackInvokedDispatcher = abeVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    acaVar2.e(onBackInvokedDispatcher);
                }
            }
        });
    }

    public final void y(adc adcVar) {
        adb adbVar = this.f;
        if (adbVar.b != null) {
            adcVar.a();
        }
        adbVar.a.add(adcVar);
    }

    public final void z() {
        if (this.b == null) {
            aat aatVar = (aat) getLastNonConfigurationInstance();
            if (aatVar != null) {
                this.b = aatVar.a;
            }
            if (this.b == null) {
                this.b = new lmx();
            }
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.sx = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.sx = false;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((ksp) it.next()).accept(new gw(z));
            }
        } catch (Throwable th) {
            this.sx = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.sy = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.sy = false;
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((ksp) it.next()).accept(new gz(z));
            }
        } catch (Throwable th) {
            this.sy = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @ffbs
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @ffbs
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
