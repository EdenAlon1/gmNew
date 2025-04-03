package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExampleStoreIteratorCallbackV2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreIteratorCallbackV2 {
        static final int TRANSACTION_onIteratorNextFailure = 3;
        static final int TRANSACTION_onIteratorNextSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreIteratorCallbackV2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2
            public void onIteratorNextFailure(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2
            public void onIteratorNextSuccess(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
        }

        public static IExampleStoreIteratorCallbackV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
            return queryLocalInterface instanceof IExampleStoreIteratorCallbackV2 ? (IExampleStoreIteratorCallbackV2) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                onIteratorNextSuccess(asInterface, asInterface2, readLong);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                long readLong2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                onIteratorNextFailure(status, readLong2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onIteratorNextFailure(Status status, long j);

    void onIteratorNextSuccess(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, long j);
}
