package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctoy extends emlp {
    private final emmt a;

    public ctoy(emmt emmtVar) {
        this.a = emmtVar;
    }

    @Override // defpackage.emlp
    public final Optional a(emhv emhvVar, Map map) {
        try {
            int i = emhvVar.b;
            if ((i & 1) != 0) {
                try {
                    cgmb i2 = this.a.i(emhvVar);
                    try {
                        Optional of = Optional.of(exdc.a(Uri.parse(i2.a()), map));
                        i2.close();
                        return of;
                    } catch (Throwable th) {
                        try {
                            i2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    if ((emhvVar.b & 2) == 0) {
                        return Optional.empty();
                    }
                    return Optional.of(exdc.a(excw.a(emhvVar.d), map));
                } catch (Exception e) {
                    if ((emhvVar.b & 2) != 0) {
                        return Optional.of(exdc.a(excw.a(emhvVar.d), map));
                    }
                    throw new emlq(e);
                }
            }
            if ((i & 2) != 0) {
                return Optional.of(exdc.a(excw.a(emhvVar.d), map));
            }
            emhx emhxVar = emhvVar.c;
            if (emhxVar == null) {
                emhxVar = emhx.a;
            }
            String str = emhxVar.c;
            emhx emhxVar2 = emhvVar.c;
            if (emhxVar2 == null) {
                emhxVar2 = emhx.a;
            }
            throw new emlq("FileSpec is not supported: MDD id: " + str + " MDD group: " + emhxVar2.d + " file pat1h: " + emhvVar.d);
        } catch (Exception e2) {
            throw new emlq(e2);
        }
    }
}
