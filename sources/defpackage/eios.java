package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eios {
    public static final String a = "eios";
    public static Bundle b = null;
    public static Bundle c = null;
    public static Bundle d = null;
    public static Bundle e = null;
    public static Bundle f = null;
    public static Bundle g = null;
    public static Bundle h = null;
    public static Bundle i = null;
    public static Bundle j = null;
    public static Bundle k = null;
    public static int l = 1;
    public static int m;
    public static int n;
    private static eios q;
    private static ContentObserver r;
    private static int s;
    private static boolean t;
    Bundle o;
    final EnumMap p;

    private eios(Context context) {
        this.o = null;
        EnumMap enumMap = new EnumMap(eioq.class);
        this.p = enumMap;
        Bundle bundle = this.o;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.o = context.getContentResolver().call(g(), "getOverlayConfig", (String) null, (Bundle) null);
                enumMap.clear();
                String str = a;
                Bundle bundle2 = this.o;
                Log.i(str, a.G(bundle2 != null ? Integer.valueOf(bundle2.size()) : "(null)", "PartnerConfigsBundle="));
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "Fail to get config from suw provider");
            }
        }
        if (t(context)) {
            if (r != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(r);
                    r = null;
                } catch (IllegalArgumentException | NullPointerException | SecurityException e2) {
                    Log.w(a, "Failed to unregister content observer: ".concat(e2.toString()));
                }
            }
            Uri g2 = g();
            try {
                r = new eior();
                context.getContentResolver().registerContentObserver(g2, true, r);
            } catch (IllegalArgumentException | NullPointerException | SecurityException e3) {
                Log.w(a, "Failed to register content observer for " + String.valueOf(g2) + ": " + e3.toString());
            }
        }
    }

    private static float B(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public static Activity e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    public static Uri g() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    public static synchronized eios h(Context context) {
        eios eiosVar;
        synchronized (eios.class) {
            Configuration configuration = context.getResources().getConfiguration();
            boolean z = true;
            if (q == null) {
                if (!n(context) || !eipk.c()) {
                    z = false;
                }
                t = z;
                s = configuration.uiMode & 48;
                l = configuration.orientation;
                n = configuration.screenWidthDp;
                m = configuration.screenHeightDp;
            } else {
                boolean z2 = t(context) && (configuration.uiMode & 48) != s;
                if (!n(context) || !eipk.c()) {
                    z = false;
                }
                if (z2 || z != t || configuration.orientation != l || configuration.screenWidthDp != n || configuration.screenHeightDp != m) {
                    s = configuration.uiMode & 48;
                    l = configuration.orientation;
                    m = configuration.screenHeightDp;
                    n = configuration.screenWidthDp;
                    k();
                }
                eiosVar = q;
            }
            q = new eios(context);
            eiosVar = q;
        }
        return eiosVar;
    }

    public static synchronized void k() {
        synchronized (eios.class) {
            q = null;
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            h = null;
            j = null;
            k = null;
            i = null;
        }
    }

    public static boolean n(Context context) {
        if (h == null) {
            try {
                h = context.getContentResolver().call(g(), "isEmbeddedActivityOnePaneEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard one-pane support in embedded activity status unknown; return as false.");
                h = null;
                return false;
            }
        }
        Bundle bundle = h;
        return bundle != null && bundle.getBoolean("isEmbeddedActivityOnePaneEnabled", false);
    }

    public static boolean o(Context context) {
        if (g == null) {
            try {
                g = context.getContentResolver().call(g(), "isFontWeightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "Font weight supporting status unknown; return as false.");
                g = null;
                return false;
            }
        }
        Bundle bundle = g;
        return bundle != null && bundle.getBoolean("isFontWeightEnabled", true);
    }

    public static boolean p(Context context) {
        Bundle bundle = j;
        if (bundle == null || bundle.isEmpty()) {
            try {
                j = context.getContentResolver().call(g(), "isForceTwoPaneEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "isForceTwoPaneEnabled status is unknown; return as false.");
            }
        }
        Bundle bundle2 = j;
        if (bundle2 == null || bundle2.isEmpty()) {
            return false;
        }
        return j.getBoolean("isForceTwoPaneEnabled", false);
    }

    public static boolean q(Context context) {
        Bundle bundle = k;
        if (bundle == null || bundle.isEmpty()) {
            try {
                k = context.getContentResolver().call(g(), "isGlifExpressiveEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "isGlifExpressiveEnabled status is unknown; return as false.");
            }
        }
        Bundle bundle2 = k;
        if (bundle2 != null && !bundle2.isEmpty()) {
            return k.getBoolean("isGlifExpressiveEnabled", false);
        }
        if (context.getTheme() != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.sucGlifExpressiveStyleEnabled});
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            Log.i(a, a.q(z, "isGlifExpressiveStyleEnabled is "));
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(Context context) {
        Bundle bundle = i;
        if (bundle == null || bundle.isEmpty()) {
            try {
                i = context.getContentResolver().call(g(), "isKeyboardFocusEnhancementEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard keyboard focus enhancement status unknown; return as false.");
                i = null;
                return false;
            }
        }
        Bundle bundle2 = i;
        if (bundle2 == null || bundle2.isEmpty()) {
            return false;
        }
        return i.getBoolean("isKeyboardFocusEnhancementEnabled");
    }

    public static boolean t(Context context) {
        if (b == null) {
            try {
                b = context.getContentResolver().call(g(), "isSuwDayNightEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard DayNight supporting status unknown; return as false.");
                b = null;
                return false;
            }
        }
        Bundle bundle = b;
        return bundle != null && bundle.getBoolean("isSuwDayNightEnabled", false);
    }

    public static boolean u(Context context) {
        if (f == null) {
            try {
                f = context.getContentResolver().call(g(), "isFullDynamicColorEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard full dynamic color supporting status unknown; return as false.");
                f = null;
                return false;
            }
        }
        Bundle bundle = f;
        return bundle != null && bundle.getBoolean("isFullDynamicColorEnabled", false);
    }

    public static boolean v(Context context) {
        if (c == null) {
            try {
                c = context.getContentResolver().call(g(), "isExtendedPartnerConfigEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(a, "SetupWizard extended partner configs supporting status unknown; return as false.");
                c = null;
                return false;
            }
        }
        Bundle bundle = c;
        return bundle != null && bundle.getBoolean("isExtendedPartnerConfigEnabled", false);
    }

    static final eiot w(Context context, eiot eiotVar) {
        String resourceTypeName;
        String concat;
        int identifier;
        try {
            resourceTypeName = eiotVar.d.getResourceTypeName(eiotVar.c);
            concat = eiotVar.b.concat("_embedded_activity");
            identifier = eiotVar.d.getIdentifier(concat, resourceTypeName, eiotVar.a);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
        }
        if (identifier != 0) {
            Log.i(a, a.t(concat, "use embedded activity resource:"));
            return new eiot(eiotVar.a, concat, identifier, eiotVar.d);
        }
        Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
        int identifier2 = resourcesForApplication.getIdentifier(concat, resourceTypeName, "com.google.android.setupwizard");
        if (identifier2 != 0) {
            return new eiot("com.google.android.setupwizard", concat, identifier2, resourcesForApplication);
        }
        return eiotVar;
    }

    static final eiot x(Context context, eiot eiotVar) {
        if (context != null) {
            try {
                String resourceTypeName = eiotVar.d.getResourceTypeName(eiotVar.c);
                String concat = eiotVar.b.concat("_two_pane");
                int identifier = eiotVar.d.getIdentifier(concat, resourceTypeName, eiotVar.a);
                if (identifier != 0) {
                    Log.i(a, a.t(concat, "two pane resource="));
                    return new eiot(eiotVar.a, concat, identifier, eiotVar.d);
                }
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
                int identifier2 = resourcesForApplication.getIdentifier(concat, resourceTypeName, "com.google.android.setupwizard");
                if (identifier2 != 0) {
                    return new eiot("com.google.android.setupwizard", concat, identifier2, resourcesForApplication);
                }
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            }
        }
        return eiotVar;
    }

    static final eiot y(eiot eiotVar) {
        try {
            if (Objects.equals(eiotVar.a, "com.google.android.setupwizard")) {
                String resourceTypeName = eiotVar.d.getResourceTypeName(eiotVar.c);
                String concat = eiotVar.b.concat("_expressive");
                int identifier = eiotVar.d.getIdentifier(concat, resourceTypeName, eiotVar.a);
                if (identifier != 0) {
                    Log.i(a, a.t(concat, "use expressive resource:"));
                    return new eiot(eiotVar.a, concat, identifier, eiotVar.d);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        return eiotVar;
    }

    static final eiot z(eiot eiotVar) {
        try {
            if (Objects.equals(eiotVar.a, "com.google.android.setupwizard")) {
                String resourceTypeName = eiotVar.d.getResourceTypeName(eiotVar.c);
                String concat = eiotVar.b.concat("_material_you");
                int identifier = eiotVar.d.getIdentifier(concat, resourceTypeName, eiotVar.a);
                if (identifier != 0) {
                    Log.i(a, a.t(concat, "use material you resource:"));
                    return new eiot(eiotVar.a, concat, identifier, eiotVar.d);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        return eiotVar;
    }

    public final float A(Context context, eioq eioqVar) {
        if (eioqVar.bA != 7) {
            throw new IllegalArgumentException("Not a fraction resource");
        }
        if (this.p.containsKey(eioqVar)) {
            return ((Float) this.p.get(eioqVar)).floatValue();
        }
        try {
            eiot i2 = i(context, eioqVar.bz);
            float fraction = i2.d.getFraction(i2.c, 1, 1);
            try {
                this.p.put((EnumMap) eioqVar, (eioq) Float.valueOf(fraction));
                return fraction;
            } catch (Resources.NotFoundException | NullPointerException unused) {
                return fraction;
            }
        } catch (Resources.NotFoundException | NullPointerException unused2) {
            return 0.0f;
        }
    }

    public final float a(Context context, eioq eioqVar) {
        return b(context, eioqVar, 0.0f);
    }

    public final float b(Context context, eioq eioqVar, float f2) {
        if (eioqVar.bA != 6) {
            throw new IllegalArgumentException("Not a dimension resource");
        }
        if (this.p.containsKey(eioqVar)) {
            return B(context, (TypedValue) this.p.get(eioqVar));
        }
        try {
            eiot i2 = i(context, eioqVar.bz);
            Resources resources = i2.d;
            int i3 = i2.c;
            resources.getDimension(i3);
            TypedValue typedValue = new TypedValue();
            resources.getValue(i3, typedValue, true);
            if (typedValue.type == 5) {
                this.p.put((EnumMap) eioqVar, (eioq) typedValue);
                return B(context, (TypedValue) this.p.get(eioqVar));
            }
            throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i3) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return f2;
        }
    }

    public final int c(Context context, eioq eioqVar) {
        if (eioqVar.bA != 3) {
            throw new IllegalArgumentException("Not a color resource");
        }
        if (this.p.containsKey(eioqVar)) {
            return ((Integer) this.p.get(eioqVar)).intValue();
        }
        int i2 = 0;
        try {
            eiot i3 = i(context, eioqVar.bz);
            Resources resources = i3.d;
            int i4 = i3.c;
            TypedValue typedValue = new TypedValue();
            resources.getValue(i4, typedValue, true);
            if (typedValue.type == 1 && typedValue.data == 0) {
                return 0;
            }
            i2 = resources.getColor(i4, null);
            this.p.put((EnumMap) eioqVar, (eioq) Integer.valueOf(i2));
            return i2;
        } catch (NullPointerException unused) {
            return i2;
        }
    }

    public final int d(Context context, eioq eioqVar, int i2) {
        if (eioqVar.bA != 1) {
            throw new IllegalArgumentException("Not a integer resource");
        }
        if (this.p.containsKey(eioqVar)) {
            return ((Integer) this.p.get(eioqVar)).intValue();
        }
        try {
            eiot i3 = i(context, eioqVar.bz);
            i2 = i3.d.getInteger(i3.c);
            this.p.put((EnumMap) eioqVar, (eioq) Integer.valueOf(i2));
            return i2;
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return i2;
        }
    }

    public final Drawable f(Context context, eioq eioqVar) {
        if (eioqVar.bA != 4) {
            throw new IllegalArgumentException("Not a drawable resource");
        }
        if (this.p.containsKey(eioqVar)) {
            return (Drawable) this.p.get(eioqVar);
        }
        Drawable drawable = null;
        try {
            eiot i2 = i(context, eioqVar.bz);
            Resources resources = i2.d;
            int i3 = i2.c;
            TypedValue typedValue = new TypedValue();
            resources.getValue(i3, typedValue, true);
            if (typedValue.type == 1 && typedValue.data == 0) {
                return null;
            }
            drawable = resources.getDrawable(i3, null);
            this.p.put((EnumMap) eioqVar, (eioq) drawable);
            return drawable;
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return drawable;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        if (r0.getBoolean("IsMaterialYouStyleEnabled", false) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        r6 = z(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (q(r5) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        if (v(r5) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.eiot i(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            android.os.Bundle r0 = r4.o
            android.os.Bundle r0 = r0.getBundle(r6)
            android.os.Bundle r1 = r4.o
            java.lang.String r2 = "fallbackConfig"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 == 0) goto L17
            android.os.Bundle r6 = r1.getBundle(r6)
            r0.putBundle(r2, r6)
        L17:
            eiot r6 = defpackage.eiot.a(r5, r0)
            boolean r0 = defpackage.eipk.c()
            if (r0 == 0) goto L42
            android.app.Activity r0 = e(r5)     // Catch: java.lang.IllegalArgumentException -> L3b
            boolean r1 = n(r5)
            if (r1 == 0) goto L42
            pgx r1 = defpackage.pgx.a(r0)
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L42
            eiot r6 = w(r5, r6)
            goto Lb9
        L3b:
            java.lang.String r0 = defpackage.eios.a
            java.lang.String r1 = "Not a Activity instance in parent tree"
            android.util.Log.w(r0, r1)
        L42:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L53
            boolean r0 = q(r5)
            if (r0 == 0) goto L53
            eiot r6 = y(r6)
            goto Lb9
        L53:
            boolean r0 = defpackage.eipk.c()
            if (r0 == 0) goto L64
            boolean r0 = p(r5)
            if (r0 == 0) goto L64
            eiot r6 = x(r5, r6)
            goto Lb9
        L64:
            boolean r0 = defpackage.eipk.b()
            if (r0 == 0) goto Lb9
            android.os.Bundle r0 = defpackage.eios.d
            java.lang.String r1 = "IsMaterialYouStyleEnabled"
            if (r0 == 0) goto L76
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9a
        L76:
            r0 = 0
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Lb0
            android.net.Uri r3 = g()     // Catch: java.lang.Throwable -> Lb0
            android.os.Bundle r2 = r2.call(r3, r1, r0, r0)     // Catch: java.lang.Throwable -> Lb0
            defpackage.eios.d = r2     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9a
            boolean r2 = defpackage.eipk.b()     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto L9a
            boolean r0 = v(r5)     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto Lb9
            goto Lab
        L9a:
            android.os.Bundle r0 = defpackage.eios.d
            if (r0 == 0) goto La5
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Lab
        La5:
            boolean r0 = q(r5)
            if (r0 == 0) goto Lb9
        Lab:
            eiot r6 = z(r6)
            goto Lb9
        Lb0:
            java.lang.String r1 = defpackage.eios.a
            java.lang.String r2 = "SetupWizard Material You configs supporting status unknown; return as false."
            android.util.Log.w(r1, r2)
            defpackage.eios.d = r0
        Lb9:
            android.content.res.Resources r0 = r6.d
            android.content.res.Configuration r1 = r0.getConfiguration()
            boolean r5 = t(r5)
            if (r5 != 0) goto Le6
            int r5 = r1.uiMode
            r5 = r5 & 48
            r2 = 32
            if (r5 != r2) goto Le6
            if (r6 != 0) goto Ld7
            java.lang.String r5 = defpackage.eios.a
            java.lang.String r0 = "resourceEntry is null, skip to force day mode."
            android.util.Log.w(r5, r0)
            goto Le6
        Ld7:
            int r5 = r1.uiMode
            r5 = r5 & (-49)
            r5 = r5 | 16
            r1.uiMode = r5
            android.util.DisplayMetrics r5 = r0.getDisplayMetrics()
            r0.updateConfiguration(r1, r5)
        Le6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eios.i(android.content.Context, java.lang.String):eiot");
    }

    public final String j(Context context, eioq eioqVar) {
        if (eioqVar.bA != 5) {
            throw new IllegalArgumentException("Not a string resource");
        }
        if (this.p.containsKey(eioqVar)) {
            return (String) this.p.get(eioqVar);
        }
        try {
            eiot i2 = i(context, eioqVar.bz);
            String string = i2.d.getString(i2.c);
            try {
                this.p.put((EnumMap) eioqVar, (eioq) string);
                return string;
            } catch (NullPointerException unused) {
                return string;
            }
        } catch (NullPointerException unused2) {
            return null;
        }
    }

    public final boolean l(Context context, eioq eioqVar, boolean z) {
        if (eioqVar.bA != 2) {
            throw new IllegalArgumentException("Not a bool resource");
        }
        if (this.p.containsKey(eioqVar)) {
            return ((Boolean) this.p.get(eioqVar)).booleanValue();
        }
        try {
            eiot i2 = i(context, eioqVar.bz);
            z = i2.d.getBoolean(i2.c);
            this.p.put((EnumMap) eioqVar, (eioq) Boolean.valueOf(z));
            return z;
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return z;
        }
    }

    public final boolean m() {
        Bundle bundle = this.o;
        return (bundle == null || bundle.isEmpty()) ? false : true;
    }

    public final boolean s(eioq eioqVar) {
        return m() && this.o.containsKey(eioqVar.bz);
    }
}
