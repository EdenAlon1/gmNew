package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvk {
    private static final engw a = engw.B("textclassifier3_jni_agsa", "textclassifier3_jni_aiai", "textclassifier3_jni_aosp", "textclassifier3_jni_gmscore", "textclassifier3_jni_google3", "textclassifier3_jni_tclib", "textclassifier3_jni_tclib_assistant", "textclassifier3_jni_tclib-experimental", "tclibapitest_jni", "nga_jni", "nga_jni_tclib_testing");
    private static final engw b = engw.s("com/google/android/apps/gsa/nga/testing/headless/inject/libnga_jni_headless.so", "com/google/android/apps/gsa/nga/engine/annotators/libnga_jni_tclib_testing.so");
    private static final Object c = new Object();
    private static Boolean d;

    private ewvk() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a() {
        int i;
        boolean booleanValue;
        synchronized (c) {
            if (d == null) {
                try {
                    Class.forName("com.google.knowledge.cerebra.sense.textclassifier.lib3.DoNotLoadJniLibs");
                    d = false;
                } catch (ClassNotFoundException unused) {
                    d = true;
                }
            }
            booleanValue = d.booleanValue();
        }
        if (booleanValue) {
            engw engwVar = a;
            int i2 = ((enou) engwVar).c;
            for (int i3 = 0; i3 < i2; i3++) {
                String str = (String) engwVar.get(i3);
                try {
                    System.loadLibrary(str);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    if (e.getMessage() != null && !e.getMessage().contains("findLibrary returned null") && !e.getMessage().contains("not found")) {
                        Log.w("tclib", "Failed to load ".concat(String.valueOf(str)), e);
                    }
                }
            }
            engw engwVar2 = b;
            int i4 = ((enou) engwVar2).c;
            for (i = 0; i < i4; i++) {
                try {
                    eoes.a((String) engwVar2.get(i));
                    return;
                } catch (UnsatisfiedLinkError unused2) {
                }
            }
            engr engrVar = new engr();
            engrVar.j(a);
            engrVar.j(b);
            throw new UnsatisfiedLinkError("Could not load any of the native libraries: " + TextUtils.join(", ", engrVar.g()) + " in the classloader " + String.valueOf(ewvk.class.getClassLoader()));
        }
    }
}
