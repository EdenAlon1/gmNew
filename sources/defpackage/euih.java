package defpackage;

import java.security.Provider;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euih implements euik {
    private final euit a;

    public euih(euit euitVar) {
        this.a = euitVar;
    }

    @Override // defpackage.euik
    public final Object a(String str) {
        Iterator it = euil.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.a.a(str, null);
    }
}
