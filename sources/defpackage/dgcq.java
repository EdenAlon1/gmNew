package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgcq {
    static dfqu a(Exception exc, int i, String str) {
        dfqu dfquVar = new dfqu(new Status(i, str.concat(exc.getMessage() == null ? "" : ": ".concat(String.valueOf(exc.getMessage())))));
        dfquVar.initCause(exc);
        return dfquVar;
    }

    static dfqu b(RemoteException remoteException, String str) {
        return a(remoteException, true != (remoteException instanceof DeadObjectException) ? 19 : 20, str);
    }
}
