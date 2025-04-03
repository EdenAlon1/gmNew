package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IConnectionCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IConnectionCallback {
        static final int TRANSACTION_onConnectionUpdate = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IConnectionCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IConnectionCallback");
            }

            @Override // com.google.android.gms.wearable.internal.IConnectionCallback
            public void onConnectionUpdate(ConnectionEvent connectionEvent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, connectionEvent);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IConnectionCallback");
        }

        public static IConnectionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IConnectionCallback");
            return queryLocalInterface instanceof IConnectionCallback ? (IConnectionCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            ConnectionEvent connectionEvent = (ConnectionEvent) rve.a(parcel, ConnectionEvent.CREATOR);
            enforceNoDataAvail(parcel);
            onConnectionUpdate(connectionEvent);
            parcel2.writeNoException();
            return true;
        }
    }

    void onConnectionUpdate(ConnectionEvent connectionEvent);
}
