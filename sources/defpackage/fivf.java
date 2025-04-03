package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivf {
    public static final /* synthetic */ int a = 0;

    static {
        String property = System.getProperty("org.jpeg.jpegli.wrapper.lib");
        if (property != null) {
            try {
                System.load(new File(property).getAbsolutePath());
            } catch (UnsatisfiedLinkError e) {
                throw new IllegalStateException("If the nested exception message says that some standard library (stdc++, tcmalloc, etc.) was not found, it is likely that JDK discovered by the build system overrides library search path. Try specifying a different JDK via JAVA_HOME environment variable and doing a clean build.", e);
            }
        }
    }
}
