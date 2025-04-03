package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdp implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        efdw efdwVar = new efdw();
        efdwVar.c();
        ParcelFileDescriptor open = ParcelFileDescriptor.open((File) efbhVar.a.c(efbhVar.f, efdwVar), 805306368);
        try {
            open.getFd();
            if (open == null) {
                return null;
            }
            open.close();
            return null;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
