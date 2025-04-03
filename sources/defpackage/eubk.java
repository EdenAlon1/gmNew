package defpackage;

import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubk {
    public static final eubk a = new eubk("NIST_P256", etrc.a);
    public static final eubk b = new eubk("NIST_P384", etrc.b);
    public static final eubk c = new eubk("NIST_P521", etrc.c);
    public final String d;
    public final ECParameterSpec e;

    private eubk(String str, ECParameterSpec eCParameterSpec) {
        this.d = str;
        this.e = eCParameterSpec;
    }

    public final String toString() {
        return this.d;
    }
}
