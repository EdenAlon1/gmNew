package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExampleStoreIteratorV2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreIteratorV2 {
        static final int TRANSACTION_close = 4;
        static final int TRANSACTION_next = 2;
        static final int TRANSACTION_request = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreIteratorV2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
            public void close() {
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
            public void next(IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iExampleStoreIteratorCallbackV2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
            public void request(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
        }

        public static IExampleStoreIteratorV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
            return queryLocalInterface instanceof IExampleStoreIteratorV2 ? (IExampleStoreIteratorV2) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IExampleStoreIteratorCallbackV2 asInterface = IExampleStoreIteratorCallbackV2.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                next(asInterface);
            } else if (i == 3) {
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                request(readInt);
            } else {
                if (i != 4) {
                    return false;
                }
                close();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void close();

    void next(IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2);

    void request(int i);
}
