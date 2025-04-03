package defpackage;

import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evas implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ evat b;

    public evas(evat evatVar, CronetException cronetException) {
        this.a = cronetException;
        this.b = evatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetException cronetException = this.a;
        if (!(cronetException instanceof CallbackException) && (cronetException instanceof NetworkException)) {
            ((NetworkException) cronetException).getErrorCode();
        }
        evat evatVar = this.b;
        evatVar.a.setException(new evaw(cronetException));
    }
}
