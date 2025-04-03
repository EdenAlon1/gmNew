package com.google.android.gms.learning;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.learning.IExampleStoreIteratorCallback;
import defpackage.rve;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public interface IExampleStoreIterator extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreIterator {
        static final int TRANSACTION_close = 4;
        static final int TRANSACTION_next = 2;
        static final int TRANSACTION_request = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreIterator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.IExampleStoreIterator");
            }

            @Override // com.google.android.gms.learning.IExampleStoreIterator
            public void close() {
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.IExampleStoreIterator
            public void next(IExampleStoreIteratorCallback iExampleStoreIteratorCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iExampleStoreIteratorCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.IExampleStoreIterator
            public void request(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.IExampleStoreIterator");
        }

        public static IExampleStoreIterator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.IExampleStoreIterator");
            return queryLocalInterface instanceof IExampleStoreIterator ? (IExampleStoreIterator) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IExampleStoreIteratorCallback asInterface = IExampleStoreIteratorCallback.Stub.asInterface(parcel.readStrongBinder());
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

    void next(IExampleStoreIteratorCallback iExampleStoreIteratorCallback);

    void request(int i);
}
