package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgj {
    public final ClassLoader a;

    public pgj(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public final Class a() {
        Class<?> loadClass = this.a.loadClass("androidx.window.extensions.WindowExtensions");
        loadClass.getClass();
        return loadClass;
    }

    public final boolean b() {
        return pnz.b(new pgh(this)) && pnz.a("WindowExtensionsProvider#getWindowExtensions is not valid", new pgi(this));
    }
}
