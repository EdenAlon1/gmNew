package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jz extends je implements LayoutInflater.Factory2, ob {
    private static final cpn O = new cpn();
    private static final int[] P = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    public jx F;
    public boolean G;
    boolean H;
    public Configuration I;
    public int J;
    boolean K;
    int L;
    public Rect M;
    public Rect N;
    private CharSequence Q;
    private jm R;
    private jy S;
    private TextView T;
    private boolean U;
    private boolean V;
    private boolean W;
    private jx[] X;
    private boolean Y;
    private boolean Z;
    private int aa;
    private int ab;
    private boolean ac;
    private ju ad;
    private ju ae;
    private boolean ag;
    private AppCompatViewInflater ah;
    private OnBackInvokedDispatcher ai;
    private OnBackInvokedCallback aj;
    final Object j;
    final Context k;
    public Window l;
    public jr m;
    final iz n;
    im o;
    MenuInflater p;
    public so q;
    nc r;
    ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public boolean x;
    ViewGroup y;
    public View z;
    kwd v = null;
    public boolean w = true;
    private final Runnable af = new jf(this);

    public jz(Context context, Window window, iz izVar, Object obj) {
        iy iyVar = null;
        this.aa = -100;
        this.k = context;
        this.n = izVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof iy)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        iyVar = (iy) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iyVar != null) {
                this.aa = ((jz) iyVar.l()).aa;
            }
        }
        if (this.aa == -100) {
            cpn cpnVar = O;
            Integer num = (Integer) cpnVar.get(this.j.getClass().getName());
            if (num != null) {
                this.aa = num.intValue();
                cpnVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            U(window);
        }
        qu.f();
    }

    private final ju S(Context context) {
        if (this.ae == null) {
            this.ae = new js(this, context);
        }
        return this.ae;
    }

    private final ju T(Context context) {
        if (this.ad == null) {
            if (kn.a == null) {
                Context applicationContext = context.getApplicationContext();
                kn.a = new kn(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ad = new jv(this, kn.a);
        }
        return this.ad;
    }

    private final void U(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof jr) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        jr jrVar = new jr(this, callback);
        this.m = jrVar;
        window.setCallback(jrVar);
        yt k = yt.k(this.k, null, P);
        Drawable i2 = k.i(0);
        if (i2 != null) {
            window.setBackgroundDrawable(i2);
        }
        k.o();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || this.ai != null) {
            return;
        }
        Object obj = this.j;
        if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
            this.ai = null;
        } else {
            onBackInvokedDispatcher = ((Activity) this.j).getOnBackInvokedDispatcher();
            this.ai = onBackInvokedDispatcher;
        }
        I();
    }

    private final void V() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                U(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void W(int i2) {
        this.L = (1 << i2) | this.L;
        if (this.K) {
            return;
        }
        View decorView = this.l.getDecorView();
        Runnable runnable = this.af;
        int[] iArr = kvo.a;
        decorView.postOnAnimation(runnable);
        this.K = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x014c, code lost:
    
        if (r13.f != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(defpackage.jx r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.X(jx, android.view.KeyEvent):void");
    }

    private final void Y() {
        if (this.x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final void Z(boolean z) {
        R(z, true);
    }

    final void A(int i2, jx jxVar, Menu menu) {
        if (menu == null) {
            menu = jxVar.h;
        }
        if (jxVar.m && !this.H) {
            jr jrVar = this.m;
            Window.Callback callback = this.l.getCallback();
            try {
                jrVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                jrVar.b = false;
            }
        }
    }

    final void B(od odVar) {
        if (this.W) {
            return;
        }
        this.W = true;
        this.q.b();
        Window.Callback x = x();
        if (x != null && !this.H) {
            x.onPanelClosed(108, odVar);
        }
        this.W = false;
    }

    final void C(jx jxVar, boolean z) {
        ViewGroup viewGroup;
        so soVar;
        if (z && jxVar.a == 0 && (soVar = this.q) != null && soVar.t()) {
            B(jxVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && jxVar.m && (viewGroup = jxVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                A(jxVar.a, jxVar, null);
            }
        }
        jxVar.k = false;
        jxVar.l = false;
        jxVar.m = false;
        jxVar.f = null;
        jxVar.n = true;
        if (this.F == jxVar) {
            this.F = null;
        }
        if (jxVar.a == 0) {
            I();
        }
    }

    final void D(int i2) {
        jx P2 = P(i2);
        if (P2.h != null) {
            Bundle bundle = new Bundle();
            P2.h.o(bundle);
            if (bundle.size() > 0) {
                P2.p = bundle;
            }
            P2.h.s();
            P2.h.clear();
        }
        P2.o = true;
        P2.n = true;
        if ((i2 == 108 || i2 == 0) && this.q != null) {
            jx P3 = P(0);
            P3.k = false;
            M(P3, null);
        }
    }

    public final void E() {
        kwd kwdVar = this.v;
        if (kwdVar != null) {
            kwdVar.a();
        }
    }

    public final void F() {
        ViewGroup viewGroup;
        if (this.x) {
            return;
        }
        TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(kt.k);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            r(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            r(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            r(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            r(10);
        }
        this.D = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        V();
        this.l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.k);
        if (this.E) {
            viewGroup = this.C ? (ViewGroup) from.inflate(com.google.android.apps.messaging.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.google.android.apps.messaging.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.D) {
            viewGroup = (ViewGroup) from.inflate(com.google.android.apps.messaging.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.B = false;
            this.A = false;
        } else if (this.A) {
            TypedValue typedValue = new TypedValue();
            this.k.getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new aeo(this.k, typedValue.resourceId) : this.k).inflate(com.google.android.apps.messaging.R.layout.abc_screen_toolbar, (ViewGroup) null);
            so soVar = (so) viewGroup.findViewById(com.google.android.apps.messaging.R.id.decor_content_parent);
            this.q = soVar;
            soVar.o(x());
            if (this.B) {
                this.q.d(109);
            }
            if (this.U) {
                this.q.d(2);
            }
            if (this.V) {
                this.q.d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        jg jgVar = new jg(this);
        int[] iArr = kvo.a;
        kvd.k(viewGroup, jgVar);
        if (this.q == null) {
            this.T = (TextView) viewGroup.findViewById(com.google.android.apps.messaging.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.apps.messaging.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.i = new jh(this);
        this.y = viewGroup;
        CharSequence z = z();
        if (!TextUtils.isEmpty(z)) {
            so soVar2 = this.q;
            if (soVar2 != null) {
                soVar2.p(z);
            } else {
                im imVar = this.o;
                if (imVar != null) {
                    imVar.setWindowTitle(z);
                } else {
                    TextView textView = this.T;
                    if (textView != null) {
                        textView.setText(z);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.y.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.k.obtainStyledAttributes(kt.k);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
        if (obtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.x = true;
        jx P2 = P(0);
        if (this.H || P2.h != null) {
            return;
        }
        W(108);
    }

    public final void G() {
        F();
        if (this.A && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new ks((Activity) obj, this.B);
            } else if (obj instanceof Dialog) {
                this.o = new ks((Dialog) obj);
            }
            im imVar = this.o;
            if (imVar != null) {
                imVar.setDefaultDisplayHomeAsUpEnabled(this.ag);
            }
        }
    }

    @Override // defpackage.ob
    public final void H(od odVar) {
        so soVar = this.q;
        if (soVar == null || !soVar.q() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.q.s())) {
            jx P2 = P(0);
            P2.n = true;
            C(P2, false);
            X(P2, null);
            return;
        }
        Window.Callback x = x();
        if (this.q.t()) {
            this.q.r();
            if (this.H) {
                return;
            }
            x.onPanelClosed(108, P(0).h);
            return;
        }
        if (x == null || this.H) {
            return;
        }
        if (this.K && (1 & this.L) != 0) {
            this.l.getDecorView().removeCallbacks(this.af);
            this.af.run();
        }
        jx P3 = P(0);
        od odVar2 = P3.h;
        if (odVar2 == null || P3.o || !x.onPreparePanel(0, P3.g, odVar2)) {
            return;
        }
        x.onMenuOpened(108, P3.h);
        this.q.v();
    }

    final void I() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ai == null || (!P(0).m && this.r == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.aj;
                if (onBackInvokedCallback != null) {
                    this.ai.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                    this.aj = null;
                    return;
                }
                return;
            }
            if (this.aj == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.ai;
                OnBackInvokedCallback onBackInvokedCallback2 = new OnBackInvokedCallback() { // from class: jq
                    public final void onBackInvoked() {
                        jz.this.K();
                    }
                };
                onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback2);
                this.aj = onBackInvokedCallback2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        if (r7 != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean J(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.J(android.view.KeyEvent):boolean");
    }

    final boolean K() {
        boolean z = this.Y;
        this.Y = false;
        jx P2 = P(0);
        if (P2.m) {
            if (!z) {
                C(P2, true);
            }
            return true;
        }
        nc ncVar = this.r;
        if (ncVar != null) {
            ncVar.f();
            return true;
        }
        im b = b();
        return b != null && b.collapseActionView();
    }

    @Override // defpackage.ob
    public final boolean L(od odVar, MenuItem menuItem) {
        jx w;
        Window.Callback x = x();
        if (x == null || this.H || (w = w(odVar.a())) == null) {
            return false;
        }
        return x.onMenuItemSelected(w.a, menuItem);
    }

    public final boolean M(jx jxVar, KeyEvent keyEvent) {
        so soVar;
        so soVar2;
        Resources.Theme theme;
        so soVar3;
        so soVar4;
        if (this.H) {
            return false;
        }
        if (jxVar.k) {
            return true;
        }
        jx jxVar2 = this.F;
        if (jxVar2 != null && jxVar2 != jxVar) {
            C(jxVar2, false);
        }
        Window.Callback x = x();
        if (x != null) {
            jxVar.g = x.onCreatePanelView(jxVar.a);
        }
        int i2 = jxVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (soVar4 = this.q) != null) {
            soVar4.n();
        }
        if (jxVar.g == null && (!z || !(this.o instanceof kk))) {
            od odVar = jxVar.h;
            if (odVar == null || jxVar.o) {
                if (odVar == null) {
                    Context context = this.k;
                    int i3 = jxVar.a;
                    if ((i3 == 0 || i3 == 108) && this.q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            aeo aeoVar = new aeo(context, 0);
                            aeoVar.getTheme().setTo(theme);
                            context = aeoVar;
                        }
                    }
                    od odVar2 = new od(context);
                    odVar2.b = this;
                    jxVar.a(odVar2);
                    if (jxVar.h == null) {
                        return false;
                    }
                }
                if (z && (soVar2 = this.q) != null) {
                    if (this.R == null) {
                        this.R = new jm(this);
                    }
                    soVar2.m(jxVar.h, this.R);
                }
                jxVar.h.s();
                if (!x.onCreatePanelMenu(jxVar.a, jxVar.h)) {
                    jxVar.a(null);
                    if (z && (soVar = this.q) != null) {
                        soVar.m(null, this.R);
                    }
                    return false;
                }
                jxVar.o = false;
            }
            jxVar.h.s();
            Bundle bundle = jxVar.p;
            if (bundle != null) {
                jxVar.h.n(bundle);
                jxVar.p = null;
            }
            if (!x.onPreparePanel(0, jxVar.g, jxVar.h)) {
                if (z && (soVar3 = this.q) != null) {
                    soVar3.m(null, this.R);
                }
                jxVar.h.r();
                return false;
            }
            jxVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            jxVar.h.r();
        }
        jxVar.k = true;
        jxVar.l = false;
        this.F = jxVar;
        return true;
    }

    final boolean N() {
        ViewGroup viewGroup;
        return this.x && (viewGroup = this.y) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00dc, code lost:
    
        if (r9.equals("Spinner") != false) goto L68;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View O(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.O(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final jx P(int i2) {
        jx[] jxVarArr = this.X;
        if (jxVarArr == null || jxVarArr.length <= i2) {
            jx[] jxVarArr2 = new jx[i2 + 1];
            if (jxVarArr != null) {
                System.arraycopy(jxVarArr, 0, jxVarArr2, 0, jxVarArr.length);
            }
            this.X = jxVarArr2;
            jxVarArr = jxVarArr2;
        }
        jx jxVar = jxVarArr[i2];
        if (jxVar != null) {
            return jxVar;
        }
        jx jxVar2 = new jx(i2);
        jxVarArr[i2] = jxVar2;
        return jxVar2;
    }

    public final boolean Q(jx jxVar, int i2, KeyEvent keyEvent) {
        od odVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jxVar.k || M(jxVar, keyEvent)) && (odVar = jxVar.h) != null) {
            return odVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0165, code lost:
    
        if (r6 == false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.R(boolean, boolean):void");
    }

    @Override // defpackage.je
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.je
    public final im b() {
        G();
        return this.o;
    }

    @Override // defpackage.je
    public final View c(int i2) {
        F();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.je
    public final void d(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        ((ViewGroup) this.y.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void e() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof jz) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.je
    public final void f() {
        if (this.o == null || b().invalidateOptionsMenu()) {
            return;
        }
        W(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.je
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.je.g
            monitor-enter(r0)
            defpackage.je.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.K
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.af
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.H = r0
            int r0 = r3.aa
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.j
            cpn r1 = defpackage.jz.O
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.aa
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5c
        L4d:
            java.lang.Object r0 = r3.j
            cpn r1 = defpackage.jz.O
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5c:
            im r0 = r3.o
            if (r0 == 0) goto L63
            r0.onDestroy()
        L63:
            ju r0 = r3.ad
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            ju r0 = r3.ae
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.g():void");
    }

    @Override // defpackage.je
    public final void h() {
        im b = b();
        if (b != null) {
            b.setShowHideAnimationEnabled(false);
        }
    }

    @Override // defpackage.je
    public final void j(int i2) {
        F();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void k(View view) {
        F();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.je
    public final void m(int i2) {
        if (this.aa != i2) {
            this.aa = i2;
            if (this.G) {
                p();
            }
        }
    }

    @Override // defpackage.je
    public final void n(CharSequence charSequence) {
        this.Q = charSequence;
        so soVar = this.q;
        if (soVar != null) {
            soVar.p(charSequence);
            return;
        }
        im imVar = this.o;
        if (imVar != null) {
            imVar.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }

    @Override // defpackage.je
    public final void p() {
        Z(true);
    }

    @Override // defpackage.je
    public final void q() {
        String str;
        this.G = true;
        Z(false);
        V();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                str = klr.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                im imVar = this.o;
                if (imVar == null) {
                    this.ag = true;
                } else {
                    imVar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            synchronized (je.g) {
                je.i(this);
                je.f.add(new WeakReference(this));
            }
        }
        this.I = new Configuration(this.k.getResources().getConfiguration());
        this.Z = true;
    }

    @Override // defpackage.je
    public final void r(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.E && i2 == 108) {
            return;
        }
        if (this.A && i2 == 1) {
            this.A = false;
        }
        if (i2 == 1) {
            Y();
            this.E = true;
            return;
        }
        if (i2 == 2) {
            Y();
            this.U = true;
            return;
        }
        if (i2 == 5) {
            Y();
            this.V = true;
            return;
        }
        if (i2 == 10) {
            Y();
            this.C = true;
        } else if (i2 == 108) {
            Y();
            this.A = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            Y();
            this.B = true;
        }
    }

    public final int s() {
        int i2 = this.aa;
        return i2 != -100 ? i2 : je.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0122 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int t(android.content.Context r21, int r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.t(android.content.Context, int):int");
    }

    public final Context u() {
        im b = b();
        Context themedContext = b != null ? b.getThemedContext() : null;
        return themedContext == null ? this.k : themedContext;
    }

    public final Configuration v(Context context, int i2, kqx kqxVar, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (kqxVar != null) {
            jp.b(configuration2, kqxVar);
        }
        return configuration2;
    }

    final jx w(Menu menu) {
        jx[] jxVarArr = this.X;
        int length = jxVarArr != null ? jxVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            jx jxVar = jxVarArr[i2];
            if (jxVar != null && jxVar.h == menu) {
                return jxVar;
            }
        }
        return null;
    }

    final Window.Callback x() {
        return this.l.getCallback();
    }

    final kqx y(Context context) {
        kqx kqxVar;
        kqx b;
        if (Build.VERSION.SDK_INT >= 33 || (kqxVar = je.c) == null) {
            return null;
        }
        kqx a = jp.a(context.getApplicationContext().getResources().getConfiguration());
        if (kqxVar.g()) {
            b = kqx.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < kqxVar.a() + a.a()) {
                Locale f = i2 < kqxVar.a() ? kqxVar.f(i2) : a.f(i2 - kqxVar.a());
                if (f != null) {
                    linkedHashSet.add(f);
                }
                i2++;
            }
            b = kqx.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return b.g() ? a : b;
    }

    final CharSequence z() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.Q;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return O(str, context, attributeSet);
    }
}
