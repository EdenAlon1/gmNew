package defpackage;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgq {
    public static final /* synthetic */ int a = 0;

    static {
        int i = fflc.a;
        new ffkb(pgq.class).c();
    }

    private pgq() {
    }

    public static final int a() {
        WindowExtensions windowExtensions;
        int vendorApiLevel;
        try {
            windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            vendorApiLevel = windowExtensions.getVendorApiLevel();
            return vendorApiLevel;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
