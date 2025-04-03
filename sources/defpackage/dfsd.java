package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfsd extends BasePendingResult implements dfse {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected dfsd(dfqt dfqtVar, dfre dfreVar) {
        super(dfreVar);
        dfwv.o(dfreVar, "GoogleApiClient must not be null");
        dfwv.o(dfqtVar, "Api must not be null");
        dfqs dfqsVar = dfqtVar.b;
    }

    private final void n(RemoteException remoteException) {
        i(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void b(dfqk dfqkVar);

    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void h(dfqk dfqkVar) {
        try {
            b(dfqkVar);
        } catch (DeadObjectException e) {
            n(e);
            throw e;
        } catch (RemoteException e2) {
            n(e2);
        }
    }

    public final void i(Status status) {
        dfwv.b(!status.d(), "Failed result must not be success");
        l(a(status));
    }
}
