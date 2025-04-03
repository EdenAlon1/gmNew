package com.google.android.gms.learning;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public interface IExampleStoreIteratorCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreIteratorCallback {
        static final int TRANSACTION_onIteratorNextFailure = 3;
        static final int TRANSACTION_onIteratorNextSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreIteratorCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.IExampleStoreIteratorCallback");
            }

            @Override // com.google.android.gms.learning.IExampleStoreIteratorCallback
            public void onIteratorNextFailure(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.IExampleStoreIteratorCallback
            public void onIteratorNextSuccess(ExampleStoreResult exampleStoreResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, exampleStoreResult);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.IExampleStoreIteratorCallback");
        }

        public static IExampleStoreIteratorCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.IExampleStoreIteratorCallback");
            return queryLocalInterface instanceof IExampleStoreIteratorCallback ? (IExampleStoreIteratorCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ExampleStoreResult exampleStoreResult = (ExampleStoreResult) rve.a(parcel, ExampleStoreResult.CREATOR);
                enforceNoDataAvail(parcel);
                onIteratorNextSuccess(exampleStoreResult);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onIteratorNextFailure(status);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onIteratorNextFailure(Status status);

    void onIteratorNextSuccess(ExampleStoreResult exampleStoreResult);
}
