package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class crlw {
    public static final /* synthetic */ int a = 0;
    private static Typeface b;
    private static Typeface c;
    private static Typeface d;
    private static Typeface e;
    private static Typeface f;
    private static Typeface g;
    private static final entd h = entd.c("Bugle");

    @Deprecated
    public static synchronized Typeface a(Context context) {
        synchronized (crlw.class) {
            if (((Boolean) cful.ao.e()).booleanValue()) {
                return Typeface.create("sans-serif", 0);
            }
            try {
                if (d == null) {
                    d = kpp.b(context, R.font.google_sans);
                }
                return d;
            } catch (Exception unused) {
                return d();
            }
        }
    }

    @Deprecated
    public static synchronized Typeface b(Context context) {
        synchronized (crlw.class) {
            if (((Boolean) cful.ao.e()).booleanValue()) {
                return Typeface.create("sans-serif", 0);
            }
            try {
                if (e == null) {
                    e = kpp.b(context, R.font.google_sans_text);
                }
                return e;
            } catch (RuntimeException unused) {
                return d();
            }
        }
    }

    @Deprecated
    public static synchronized Typeface c() {
        Typeface typeface;
        synchronized (crlw.class) {
            if (b == null) {
                b = Typeface.create(Typeface.SANS_SERIF, 1);
            }
            typeface = b;
        }
        return typeface;
    }

    @Deprecated
    public static synchronized Typeface d() {
        Typeface typeface;
        synchronized (crlw.class) {
            if (c == null) {
                c = Typeface.create(Typeface.SANS_SERIF, 0);
            }
            typeface = c;
        }
        return typeface;
    }

    public static synchronized Typeface e(Context context) {
        Typeface typeface;
        synchronized (crlw.class) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.themeFontFamilyContent, typedValue, true);
            try {
                if (f == null) {
                    f = Typeface.create(kpp.b(context, typedValue.resourceId), 1);
                }
                typeface = f;
            } catch (Exception unused) {
                ensz enszVar = (ensz) h.j();
                enszVar.X(100);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/ui/util/Typefaces", "getThemeFontContentBold", 111, "Typefaces.java")).q("ThemeFontContentBold could not be created. Fallback to Roboto bold.");
                return c();
            }
        }
        return typeface;
    }

    public static synchronized Typeface f(Context context) {
        Typeface typeface;
        synchronized (crlw.class) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.themeFontFamilyContent, typedValue, true);
            try {
                if (g == null) {
                    g = Typeface.create(kpp.b(context, typedValue.resourceId), 0);
                }
                typeface = g;
            } catch (Exception unused) {
                ensz enszVar = (ensz) h.j();
                enszVar.X(100);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/ui/util/Typefaces", "getThemeFontContentNormal", 129, "Typefaces.java")).q("ThemeFontContentNormal could not be created. Fallback to Roboto normal.");
                return d();
            }
        }
        return typeface;
    }
}
