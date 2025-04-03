package com.google.android.gms.learning;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.learning.IExampleStoreQueryCallback;
import defpackage.rve;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public interface IExampleStore extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStore {
        static final int TRANSACTION_startQuery = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStore {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.IExampleStore");
            }

            @Override // com.google.android.gms.learning.IExampleStore
            public void startQuery(String str, byte[] bArr, byte[] bArr2, IExampleStoreQueryCallback iExampleStoreQueryCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                rve.f(obtainAndWriteInterfaceToken, iExampleStoreQueryCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.IExampleStore");
        }

        public static IExampleStore asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.IExampleStore");
            return queryLocalInterface instanceof IExampleStore ? (IExampleStore) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            byte[] createByteArray = parcel.createByteArray();
            byte[] createByteArray2 = parcel.createByteArray();
            IExampleStoreQueryCallback asInterface = IExampleStoreQueryCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            startQuery(readString, createByteArray, createByteArray2, asInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void startQuery(String str, byte[] bArr, byte[] bArr2, IExampleStoreQueryCallback iExampleStoreQueryCallback);
}
