package defpackage;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.android.vcard.VCardConfig;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class einu extends TemplateLayout {
    public static final /* synthetic */ int c = 0;
    private static final eipn f = new eipn("PartnerCustomizationLayout");
    protected Activity a;
    final ViewTreeObserver.OnWindowFocusChangeListener b;
    private boolean g;
    private boolean h;
    private boolean i;

    public einu(Context context) {
        this(context, 0, 0);
    }

    private void l(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, einv.d, i, 0);
        boolean z = true;
        boolean z2 = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        if (z2) {
            setSystemUiVisibility(1024);
        }
        k(eipi.class, new eipi(this, this.a.getWindow(), attributeSet, i));
        k(eipj.class, new eipj(this, this.a.getWindow()));
        k(eipb.class, new eipb(this, attributeSet, i));
        eipj eipjVar = (eipj) i(eipj.class);
        if (Build.VERSION.SDK_INT >= 27) {
            TypedArray obtainStyledAttributes2 = eipjVar.a.getContext().obtainStyledAttributes(attributeSet, einv.f, i, 0);
            int color = obtainStyledAttributes2.getColor(1, 0);
            eipjVar.e = color;
            if (eipjVar.b != null) {
                if (eipjVar.c && !eipjVar.d) {
                    Context context = eipjVar.a.getContext();
                    color = eios.h(context).c(context, eioq.CONFIG_NAVIGATION_BAR_BG_COLOR);
                }
                eipjVar.b.setNavigationBarColor(color);
            }
            Window window = eipjVar.b;
            if (window != null && (window.getDecorView().getSystemUiVisibility() & 16) != 16) {
                z = false;
            }
            boolean z3 = obtainStyledAttributes2.getBoolean(0, z);
            if (eipjVar.b != null) {
                if (eipjVar.c) {
                    Context context2 = eipjVar.a.getContext();
                    z3 = eios.h(context2).l(context2, eioq.CONFIG_LIGHT_NAVIGATION_BAR, false);
                }
                if (z3) {
                    eipjVar.b.getDecorView().setSystemUiVisibility(eipjVar.b.getDecorView().getSystemUiVisibility() | 16);
                } else {
                    eipjVar.b.getDecorView().setSystemUiVisibility(eipjVar.b.getDecorView().getSystemUiVisibility() & (-17));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                TypedArray obtainStyledAttributes3 = eipjVar.a.getContext().obtainStyledAttributes(new int[]{R.attr.navigationBarDividerColor});
                int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
                if (Build.VERSION.SDK_INT >= 28 && eipjVar.b != null) {
                    if (eipjVar.c) {
                        Context context3 = eipjVar.a.getContext();
                        if (eios.h(context3).s(eioq.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR)) {
                            color2 = eios.h(context3).c(context3, eioq.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR);
                        }
                    }
                    eipjVar.b.setNavigationBarDividerColor(color2);
                }
                obtainStyledAttributes3.recycle();
            }
            obtainStyledAttributes2.recycle();
        }
        this.a.getWindow().addFlags(Integer.MIN_VALUE);
        this.a.getWindow().clearFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        this.a.getWindow().clearFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = com.google.android.apps.messaging.R.layout.partner_customization_layout;
        }
        return h(layoutInflater, 0, i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected ViewGroup b(int i) {
        if (i == 0) {
            i = com.google.android.apps.messaging.R.id.suc_layout_content;
        }
        return super.b(i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected final void c(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.g = true;
        Activity e = eios.e(getContext());
        this.a = e;
        boolean a = eips.a(e.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, einv.d, i, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            f.d("Attribute sucUsePartnerResource not found in ".concat(String.valueOf(String.valueOf(this.a.getComponentName()))));
        }
        if (!a && !obtainStyledAttributes.getBoolean(2, true)) {
            z = false;
        }
        this.g = z;
        this.i = obtainStyledAttributes.hasValue(0);
        this.h = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        f.a("activity=" + this.a.getClass().getSimpleName() + " isSetupFlow=" + a + " enablePartnerResourceLoading=true usePartnerResourceAttr=" + this.g + " useDynamicColor=" + this.i + " useFullDynamicColorAttr=" + this.h);
    }

    public final boolean d() {
        if (!eipk.a() || !eios.h(getContext()).m()) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Context context = getContext();
        if (eios.e == null) {
            try {
                eios.e = context.getContentResolver().call(eios.g(), "isDynamicColorEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(eios.a, "SetupWizard dynamic color supporting status unknown; return as false.");
                eios.e = null;
            }
        }
        Bundle bundle = eios.e;
        return bundle != null && bundle.getBoolean("isDynamicColorEnabled", false);
    }

    public final boolean e() {
        return this.g && Build.VERSION.SDK_INT >= 29 && eios.h(getContext()).m();
    }

    public final boolean f() {
        if (d()) {
            return this.h || eios.u(getContext());
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        FragmentManager fragmentManager;
        super.onAttachedToWindow();
        Activity activity = this.a;
        String str = eioa.a;
        eioa eioaVar = null;
        if (eips.a(activity.getIntent()) && (fragmentManager = activity.getFragmentManager()) != null && !fragmentManager.isDestroyed()) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
            if (findFragmentByTag == null) {
                eioa eioaVar2 = new eioa();
                try {
                    fragmentManager.beginTransaction().add(eioaVar2, "lifecycle_monitor").commitNow();
                    findFragmentByTag = eioaVar2;
                } catch (IllegalStateException e) {
                    Log.e(eioa.a, "Error occurred when attach to Activity:".concat(String.valueOf(String.valueOf(activity.getComponentName()))), e);
                }
            } else if (!(findFragmentByTag instanceof eioa)) {
                Log.wtf(eioa.a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
            }
            eioaVar = (eioa) findFragmentByTag;
        }
        if (eioaVar == null) {
            eipn eipnVar = f;
            Activity activity2 = this.a;
            eipnVar.a("Unable to attach lifecycle fragment to the host activity. Activity=".concat(String.valueOf(activity2 != null ? activity2.getClass().getSimpleName() : "null")));
        }
        if (eips.a(this.a.getIntent())) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.b);
        }
        eipb eipbVar = (eipb) i(eipb.class);
        eipbVar.o.b(eipbVar.f(), false);
        eipbVar.o.c(eipbVar.g(), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 29 && eips.a(this.a.getIntent())) {
            eipb eipbVar = (eipb) i(eipb.class);
            eiop eiopVar = eipbVar.o;
            boolean f2 = eipbVar.f();
            boolean g = eipbVar.g();
            eiopVar.a = eiop.a(eiopVar.a, f2);
            eiopVar.b = eiop.a(eiopVar.b, g);
            eipc eipcVar = eipbVar.h;
            eipc eipcVar2 = eipbVar.i;
            PersistableBundle a = eipcVar != null ? eipcVar.a("PrimaryFooterButton") : PersistableBundle.EMPTY;
            PersistableBundle a2 = eipcVar2 != null ? eipcVar2.a("SecondaryFooterButton") : PersistableBundle.EMPTY;
            eiop eiopVar2 = eipbVar.o;
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("PrimaryButtonVisibility", eiopVar2.a);
            persistableBundle.putString("SecondaryButtonVisibility", eiopVar2.b);
            PersistableBundle[] persistableBundleArr = {a2, PersistableBundle.EMPTY};
            int i = eiob.a;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(persistableBundle, a));
            Collections.addAll(arrayList, persistableBundleArr);
            PersistableBundle persistableBundle2 = new PersistableBundle();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PersistableBundle persistableBundle3 = (PersistableBundle) arrayList.get(i2);
                Iterator<String> it = persistableBundle3.keySet().iterator();
                while (it.hasNext()) {
                    eioc.a(!persistableBundle2.containsKey(r8), String.format("Found duplicate key [%s] while attempting to merge bundles.", it.next()));
                }
                persistableBundle2.putAll(persistableBundle3);
            }
            eioo.a(getContext(), CustomEvent.b(MetricKey.b("SetupCompatMetrics", this.a), persistableBundle2));
        }
        getViewTreeObserver().removeOnWindowFocusChangeListener(this.b);
    }

    public einu(Context context, int i) {
        this(context, i, 0);
    }

    public einu(Context context, int i, int i2) {
        super(context, i, i2);
        this.b = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: eint
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                einu einuVar = einu.this;
                eiof a = eiof.a(einuVar.getContext());
                String shortString = einuVar.a.getComponentName().toShortString();
                Activity activity = einuVar.a;
                Bundle bundle = new Bundle();
                bundle.putString("packageName", activity.getComponentName().getPackageName());
                bundle.putString("screenName", activity.getComponentName().getShortClassName());
                bundle.putInt("hash", einuVar.hashCode());
                bundle.putBoolean("focus", z);
                bundle.putLong("timeInMillis", System.currentTimeMillis());
                a.e(shortString, bundle);
            }
        };
        l(null, com.google.android.apps.messaging.R.attr.sucLayoutTheme);
    }

    public einu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: eint
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                einu einuVar = einu.this;
                eiof a = eiof.a(einuVar.getContext());
                String shortString = einuVar.a.getComponentName().toShortString();
                Activity activity = einuVar.a;
                Bundle bundle = new Bundle();
                bundle.putString("packageName", activity.getComponentName().getPackageName());
                bundle.putString("screenName", activity.getComponentName().getShortClassName());
                bundle.putInt("hash", einuVar.hashCode());
                bundle.putBoolean("focus", z);
                bundle.putLong("timeInMillis", System.currentTimeMillis());
                a.e(shortString, bundle);
            }
        };
        l(attributeSet, com.google.android.apps.messaging.R.attr.sucLayoutTheme);
    }

    public einu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: eint
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                einu einuVar = einu.this;
                eiof a = eiof.a(einuVar.getContext());
                String shortString = einuVar.a.getComponentName().toShortString();
                Activity activity = einuVar.a;
                Bundle bundle = new Bundle();
                bundle.putString("packageName", activity.getComponentName().getPackageName());
                bundle.putString("screenName", activity.getComponentName().getShortClassName());
                bundle.putInt("hash", einuVar.hashCode());
                bundle.putBoolean("focus", z);
                bundle.putLong("timeInMillis", System.currentTimeMillis());
                a.e(shortString, bundle);
            }
        };
        l(attributeSet, i);
    }
}
