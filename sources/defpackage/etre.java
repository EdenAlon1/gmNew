package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etre {
    private final Map a;
    private final Map b;

    public etre(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final Enum a(Object obj) {
        Enum r0 = (Enum) this.b.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(String.valueOf(obj))));
    }

    public final Object b(Enum r3) {
        Object obj = this.a.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(String.valueOf(r3))));
    }
}
