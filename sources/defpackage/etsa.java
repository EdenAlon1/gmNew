package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsa {
    public static final etsa a = new etsa();
    private final Map b = new HashMap();

    public final synchronized void a(etrz etrzVar, Class cls) {
        etrz etrzVar2 = (etrz) this.b.get(cls);
        if (etrzVar2 != null && !etrzVar2.equals(etrzVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.b.put(cls, etrzVar);
    }
}
