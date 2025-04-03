package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivb implements fiva {
    private static final Set a = Collections.singleton("UTC");

    @Override // defpackage.fiva
    public final Set a() {
        return a;
    }

    @Override // defpackage.fiva
    public final firk b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return firk.a;
        }
        return null;
    }
}
