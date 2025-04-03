package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.internal.IExampleStoreIteratorV2;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExampleStoreQueryCallbackV2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreQueryCallbackV2 {
        static final int TRANSACTION_onStartQueryFailure = 3;
        static final int TRANSACTION_onStartQuerySuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreQueryCallbackV2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2
            public void onStartQueryFailure(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2
            public void onStartQuerySuccess(IExampleStoreIteratorV2 iExampleStoreIteratorV2, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iExampleStoreIteratorV2);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
        }

        public static IExampleStoreQueryCallbackV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
            return queryLocalInterface instanceof IExampleStoreQueryCallbackV2 ? (IExampleStoreQueryCallbackV2) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IExampleStoreIteratorV2 asInterface = IExampleStoreIteratorV2.Stub.asInterface(parcel.readStrongBinder());
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                onStartQuerySuccess(asInterface, readLong);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                long readLong2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                onStartQueryFailure(status, readLong2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onStartQueryFailure(Status status, long j);

    void onStartQuerySuccess(IExampleStoreIteratorV2 iExampleStoreIteratorV2, long j);
}
