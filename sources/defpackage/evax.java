package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evax {
    public static evax b(String str) {
        emxf.f(emvk.a.h(str), "Only ASCII header keys are permitted: %s", str);
        return new euzs(str.toLowerCase(Locale.US));
    }

    public abstract String a();
}
