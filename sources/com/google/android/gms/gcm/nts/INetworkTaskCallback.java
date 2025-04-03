package com.google.android.gms.gcm.nts;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INetworkTaskCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INetworkTaskCallback {
        static final int TRANSACTION_taskFinished = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INetworkTaskCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.gcm.nts.INetworkTaskCallback");
            }

            @Override // com.google.android.gms.gcm.nts.INetworkTaskCallback
            public void taskFinished(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.gcm.nts.INetworkTaskCallback");
        }

        public static INetworkTaskCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.nts.INetworkTaskCallback");
            return queryLocalInterface instanceof INetworkTaskCallback ? (INetworkTaskCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            taskFinished(readInt);
            parcel2.writeNoException();
            return true;
        }
    }

    void taskFinished(int i);
}
