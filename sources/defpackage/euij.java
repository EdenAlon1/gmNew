package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euij implements euik {
    private final euit a;

    public euij(euit euitVar) {
        this.a = euitVar;
    }

    @Override // defpackage.euik
    public final Object a(String str) {
        Iterator it = euil.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
