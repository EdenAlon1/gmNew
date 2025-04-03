package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plu {
    public final ClassLoader a;
    public final pgp b;
    public final pgj c;

    public plu(ClassLoader classLoader, pgp pgpVar) {
        this.a = classLoader;
        this.b = pgpVar;
        this.c = new pgj(classLoader);
    }

    private final boolean f() {
        return pnz.a("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new plq(this));
    }

    public final WindowLayoutComponent a() {
        WindowExtensions windowExtensions;
        WindowLayoutComponent windowLayoutComponent;
        if (this.c.b() && pnz.a("WindowExtensions#getWindowLayoutComponent is not valid", new plt(this)) && pnz.a("FoldingFeature class is not valid", new plo(this))) {
            int i = pgq.a;
            int a = pgq.a();
            if (a <= 0) {
                return null;
            }
            boolean z = true;
            if (a == 1) {
                z = f();
            } else if (a < 5) {
                z = e();
            } else if (!e() || !pnz.a("DisplayFoldFeature is not valid", new pln(this)) || !pnz.a("SupportedWindowFeatures is not valid", new pls(this)) || !pnz.a("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new plp(this))) {
                z = false;
            }
            if (z) {
                try {
                    windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                    windowLayoutComponent = windowExtensions.getWindowLayoutComponent();
                    return windowLayoutComponent;
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        return null;
    }

    public final Class b() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        loadClass.getClass();
        return loadClass;
    }

    public final Class c() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        loadClass.getClass();
        return loadClass;
    }

    public final Class d() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        return loadClass;
    }

    public final boolean e() {
        if (!f()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return pnz.a(sb.toString(), new plr(this));
    }
}
