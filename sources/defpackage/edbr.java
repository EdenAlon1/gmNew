package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edbr implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        InputStream a = new efdy().a(efbhVar);
        try {
            ecxu c = ecxu.c(eyel.K(a));
            if (a != null) {
                a.close();
            }
            return c;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
