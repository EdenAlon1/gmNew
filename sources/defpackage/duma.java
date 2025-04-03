package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duma implements duof {
    public static final duvz b;
    public static final a c;
    private static volatile duma h;
    public final AccessibilityManager d;
    public final Application e;
    public volatile boolean f;
    private final errm i = duoc.b;
    private volatile boolean j;
    private volatile boolean k;
    private volatile boolean l;
    private final emyl m;
    private ListenableFuture n;
    private ListenableFuture o;
    private final Set p;
    private final Set q;
    private final duwp r;
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils");
    private static final duvz g = duwb.a("screen_reader_min_version_for_lift_to_type", 60105832);

    /* compiled from: PG */
    final class a extends duxx {
    }

    static {
        duwb.d("deprecate_accessibility_type_announcement");
        b = duwb.d("force_disable_type_announcement");
        a aVar = new a();
        c = aVar;
        enip.r(duog.SWITCH_ACCESS.n, duog.VOICE_ACCESS.n);
        duyb.c("TouchExplorationEnabled", aVar);
        new duly();
        int i = dulu.a;
    }

    public duma(Context context) {
        ListenableFuture listenableFuture = erre.a;
        this.n = listenableFuture;
        this.o = listenableFuture;
        this.p = enpw.g(4);
        this.q = enpw.g(4);
        this.r = new dulz();
        Application application = (Application) context.getApplicationContext();
        this.e = application;
        this.d = (AccessibilityManager) application.getSystemService("accessibility");
        emys.a(new emyl() { // from class: dulx
            @Override // defpackage.emyl
            public final Object get() {
                return (AudioManager) duma.this.e.getSystemService("audio");
            }
        });
        this.m = emys.a(new emyl() { // from class: duls
            @Override // defpackage.emyl
            public final Object get() {
                return (PowerManager) duma.this.e.getSystemService("power");
            }
        });
    }

    public static duma a(Context context) {
        final duma dumaVar;
        duma dumaVar2 = h;
        if (dumaVar2 != null) {
            return dumaVar2;
        }
        synchronized (duma.class) {
            dumaVar = h;
            if (dumaVar == null) {
                dumaVar = new duma(context.getApplicationContext());
                dumaVar.g();
                dumaVar.d.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: dulv
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                    public final void onAccessibilityStateChanged(boolean z) {
                        duma dumaVar3 = duma.this;
                        dumaVar3.g();
                        dumaVar3.h(3);
                    }
                });
                dumaVar.d.addTouchExplorationStateChangeListener(new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: dulw
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        duma.this.f(z);
                    }
                });
                duyi.a().d(dumaVar.r, duwq.class, duoc.a);
                duoe.a.a(dumaVar);
                h = dumaVar;
            }
        }
        return dumaVar;
    }

    public static void e(View view, CharSequence charSequence) {
        LocaleList locales;
        Locale locale;
        locales = view.getContext().getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        view.setContentDescription(dvar.a(locale, charSequence));
    }

    public final void b(int i) {
        c(this.e.getString(i, new Object[0]));
    }

    public final void c(CharSequence charSequence) {
        ((Boolean) b.b()).booleanValue();
        if (!this.k || !((PowerManager) this.m.get()).isInteractive() || TextUtils.isEmpty(charSequence)) {
            ListenableFuture listenableFuture = erre.a;
            return;
        }
        this.n.cancel(false);
        this.o.cancel(false);
        final CharSequence a2 = dvar.a(null, charSequence);
        this.o = this.i.schedule(new Runnable() { // from class: dulr
            @Override // java.lang.Runnable
            public final void run() {
                duma dumaVar = duma.this;
                if (dumaVar.f) {
                    CharSequence charSequence2 = a2;
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(128);
                    obtain.setClassName("");
                    obtain.setPackageName(dumaVar.e.getPackageName());
                    obtain.setEnabled(true);
                    obtain.setContentDescription(charSequence2);
                    obtain.getText().add(charSequence2);
                    obtain.setSource(null);
                    try {
                        dumaVar.d.sendAccessibilityEvent(obtain);
                    } catch (IllegalStateException e) {
                        ((enrr) ((enrr) duma.a.a(duwj.a).g(e)).h("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "announceInternal", 733, "AccessibilityUtils.java")).q("accessibilityManager can't send event when accessibility is not enabled");
                        enru enruVar = duxu.a;
                        duxs.a.b(dulq.A11Y_CRASH, new Object[0]);
                    }
                }
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    public final void d(View view) {
        if (!this.k || view == null) {
            return;
        }
        view.sendAccessibilityEvent(128);
    }

    public final void f(boolean z) {
        ArrayList arrayList;
        if (this.j == z) {
            return;
        }
        this.j = z;
        synchronized (this.q) {
            arrayList = new ArrayList(this.q);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AccessibilityManager.TouchExplorationStateChangeListener) arrayList.get(i)).onTouchExplorationStateChanged(this.j);
        }
        if (z) {
            duyb.d(c);
            return;
        }
        a aVar = c;
        duyb.a(aVar);
        final Class<?> cls = aVar.getClass();
        final duyi a2 = duyi.a();
        dvag b2 = duyi.b(duyi.c(cls));
        try {
            duyd duydVar = (duyd) a2.d.remove(cls);
            if (duydVar != null) {
                a2.e(duydVar.getClass(), duyi.b, new Predicate() { // from class: duyf
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        Class cls2 = (Class) obj;
                        return cls2 == cls || duyi.this.d.remove(cls2) != null;
                    }
                });
            }
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g() {
        boolean z;
        ArrayList arrayList;
        ResolveInfo resolveInfo;
        ApplicationInfo applicationInfo;
        PackageManager.PackageInfoFlags of;
        PackageManager.ApplicationInfoFlags of2;
        AccessibilityManager accessibilityManager = this.d;
        boolean z2 = this.k;
        this.f = accessibilityManager.isEnabled();
        f(this.f && this.d.isTouchExplorationEnabled());
        this.k = this.f && this.f && !this.d.getEnabledAccessibilityServiceList(1).isEmpty();
        try {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.d.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList != null) {
                if (!enabledAccessibilityServiceList.isEmpty()) {
                    Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
                    while (true) {
                        if (!it.hasNext() || (resolveInfo = it.next().getResolveInfo()) == null) {
                            break;
                        }
                        String str = resolveInfo.serviceInfo.packageName;
                        Application application = this.e;
                        PackageInfo packageInfo = null;
                        try {
                            if (Build.VERSION.SDK_INT >= 33) {
                                PackageManager packageManager = application.getPackageManager();
                                of2 = PackageManager.ApplicationInfoFlags.of(128L);
                                applicationInfo = packageManager.getApplicationInfo(str, of2);
                            } else {
                                applicationInfo = application.getPackageManager().getApplicationInfo(str, 128);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            ((enrr) ((enrr) dvam.a.j()).h("com/google/android/libraries/inputmethod/utils/PackageUtil", "getApplicationInfo", 50, "PackageUtil.java")).t("Package %s not found.", str);
                            applicationInfo = null;
                        }
                        Application application2 = this.e;
                        try {
                            if (Build.VERSION.SDK_INT >= 33) {
                                PackageManager packageManager2 = application2.getPackageManager();
                                of = PackageManager.PackageInfoFlags.of(0L);
                                packageInfo = packageManager2.getPackageInfo(str, of);
                            } else {
                                packageInfo = application2.getPackageManager().getPackageInfo(str, 0);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            ((enrr) ((enrr) dvam.a.j()).h("com/google/android/libraries/inputmethod/utils/PackageUtil", "getPackageInfo", 31, "PackageUtil.java")).t("Package %s not found.", str);
                        }
                        if (applicationInfo == null || packageInfo == null) {
                            break;
                        }
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null && bundle.getBoolean("support_lift_to_type")) {
                            if (packageInfo.versionCode >= ((Long) g.b()).longValue()) {
                                z = true;
                            }
                        }
                    }
                }
            }
        } catch (SecurityException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "isScreenReaderSupportLiftToType", 913, "AccessibilityUtils.java")).o();
        }
        z = false;
        this.l = z;
        float f = Settings.System.getFloat(this.e.getContentResolver(), "font_scale", 1.0f);
        boolean z3 = Settings.Secure.getInt(this.e.getContentResolver(), "high_text_contrast_enabled", 0) != 0;
        enrr enrrVar = (enrr) ((enrr) a.d()).h("com/google/android/libraries/inputmethod/accessibility/AccessibilityUtils", "logA11ySettingsChangeEvents", 874, "AccessibilityUtils.java");
        Boolean valueOf = Boolean.valueOf(this.k);
        Boolean valueOf2 = Boolean.valueOf(this.j);
        Float valueOf3 = Float.valueOf(f);
        Boolean valueOf4 = Boolean.valueOf(z3);
        enrrVar.K("A11y metrics. Screen reader activated %s, Touch exploration enabled %s, Font scale %f, High text contrast %s", valueOf, valueOf2, valueOf3, valueOf4);
        enru enruVar = duxu.a;
        duxs.a.b(dulq.A11Y_SETTINGS_CHANGED, Boolean.valueOf(this.k), Boolean.valueOf(this.j), valueOf3, valueOf4);
        if (z2 != this.k) {
            synchronized (this.p) {
                arrayList = new ArrayList(this.p);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AccessibilityManager.AccessibilityStateChangeListener) arrayList.get(i)).onAccessibilityStateChanged(this.k);
            }
        }
    }

    public final void h(final int i) {
        if (!this.f || this.k || i <= 0) {
            return;
        }
        this.n = this.i.schedule(new Runnable() { // from class: dult
            @Override // java.lang.Runnable
            public final void run() {
                duma dumaVar = duma.this;
                dumaVar.g();
                dumaVar.h(i - 1);
            }
        }, 500L, TimeUnit.MILLISECONDS);
    }

    public final String toString() {
        emwz b2 = emxa.b(this);
        b2.h("isTouchExplorationEnabled", this.j);
        b2.h("isAccessibilityEnabled", this.f);
        b2.h("isScreenReaderActive", this.k);
        b2.h("isScreenReaderSupportLiftToType", this.l);
        b2.b("currentEntry", null);
        return b2.toString();
    }
}
