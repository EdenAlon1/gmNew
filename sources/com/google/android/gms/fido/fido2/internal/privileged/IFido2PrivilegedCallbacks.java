package com.google.android.gms.fido.fido2.internal.privileged;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFido2PrivilegedCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFido2PrivilegedCallbacks {
        static final int TRANSACTION_onPendingIntentFetched = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFido2PrivilegedCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
            }

            @Override // com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks
            public void onPendingIntentFetched(Status status, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
        }

        public static IFido2PrivilegedCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
            return queryLocalInterface instanceof IFido2PrivilegedCallbacks ? (IFido2PrivilegedCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            PendingIntent pendingIntent = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
            enforceNoDataAvail(parcel);
            onPendingIntentFetched(status, pendingIntent);
            return true;
        }
    }

    void onPendingIntentFetched(Status status, PendingIntent pendingIntent);
}
