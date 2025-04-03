package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggh {
    public static final void a(ffhd ffhdVar, Throwable th) {
        Iterator it = fggg.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(ffhdVar, th);
            } catch (fggm unused) {
                return;
            } catch (Throwable th2) {
                fggg.a(ffsf.a(th, th2));
            }
        }
        try {
            ffbt.a(th, new fggj(ffhdVar));
        } catch (Throwable unused2) {
        }
        fggg.a(th);
    }
}
