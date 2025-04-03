package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dhmy<T extends IInterface> extends dfwc<T> {
    public dhmy(Context context, Looper looper, int i, dfvs dfvsVar, dfsm dfsmVar, dftw dftwVar, dhmh dhmhVar) {
        super(context, looper, i, dfvsVar, dfsmVar, dftwVar);
        if (dhmhVar != null) {
            throw null;
        }
    }

    public final IInterface M() {
        try {
            return w();
        } catch (IllegalStateException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("ComponentName", null);
        return bundle;
    }
}
