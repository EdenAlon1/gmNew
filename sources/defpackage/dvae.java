package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvae implements duof {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/systemproperty/SystemProperties");
    public static final dvae b = new dvae();
    public final cmh c = new cmh();
    public final Method d;

    private dvae() {
        Method method;
        try {
            method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        } catch (Exception e) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/systemproperty/SystemProperties", "<init>", '9', "SystemProperties.java")).q("Cannot find android.os.SystemProperties#get(String)");
            method = null;
        }
        this.d = method;
        duoe.a.a(this);
    }
}
