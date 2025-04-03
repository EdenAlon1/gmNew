package defpackage;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dkqn {
    public static IInterface a(dkqo dkqoVar) {
        IInterface iInterface = dkqoVar.getInterface();
        if (!dipo.a(dkqoVar.getContext()).c().k()) {
            throw new IllegalStateException("No permission to run RCS Engine.");
        }
        if (iInterface != null) {
            return iInterface;
        }
        if (((Boolean) dkqp.a.a()).booleanValue()) {
            throw new IllegalStateException("JibeService Not Initialized");
        }
        throw new RemoteException("JibeService Not Initialized");
    }
}
