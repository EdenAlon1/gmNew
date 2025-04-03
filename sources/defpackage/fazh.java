package defpackage;

import java.lang.annotation.Annotation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fazh {
    public static Object a(Object obj, Class cls) {
        boolean z;
        if (!(obj instanceof fbar)) {
            if (obj instanceof fbas) {
                return a(((fbas) obj).aX(), cls);
            }
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), fbar.class, fbas.class));
        }
        if (obj instanceof fbav) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            fbau.a(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }
}
