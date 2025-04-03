package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgd {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static etgc a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            etgc etgcVar = (etgc) it.next();
            if (etgcVar.b(str)) {
                return etgcVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
