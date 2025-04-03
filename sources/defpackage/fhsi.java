package defpackage;

import java.security.Provider;
import java.security.Security;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhsi extends fhsk {
    private static volatile Provider b;

    public fhsi() {
        super(c());
    }

    private static synchronized Provider c() {
        synchronized (fhsi.class) {
            Provider provider = Security.getProvider("BC");
            if (provider instanceof fhsp) {
                return provider;
            }
            if (b != null) {
                return b;
            }
            b = new fhsp();
            return b;
        }
    }
}
