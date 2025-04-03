package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eewu {
    public static final Class a;
    public static final boolean b;
    private static final Class c;
    private static final Class d;

    static {
        if (eexk.a(eeww.a)) {
            a = a("com.google.android.libraries.stitch.debug.poke.stetho.StethoInitializer");
            c = a("com.google.android.libraries.stitch.debug.poke.ui.PokeActivity");
            d = a("com.google.android.libraries.stitch.debug.poke.provider.PokeContentProvider");
        } else {
            a = null;
            c = null;
            d = null;
        }
        boolean z = true;
        if (a == null && c == null && d == null) {
            z = false;
        }
        b = z;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
