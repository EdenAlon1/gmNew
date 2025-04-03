package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBrellaInvocationCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBrellaInvocationCallback {
        static final int TRANSACTION_onComputationCompleted = 4;
        static final int TRANSACTION_onInvocationFinished = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBrellaInvocationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocationCallback
            public void onComputationCompleted(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocationCallback
            public void onInvocationFinished(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
        }

        public static IBrellaInvocationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IBrellaInvocationCallback");
            return queryLocalInterface instanceof IBrellaInvocationCallback ? (IBrellaInvocationCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 4) {
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onComputationCompleted(createByteArray);
            } else {
                if (i != 5) {
                    return false;
                }
                byte[] createByteArray2 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onInvocationFinished(createByteArray2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onComputationCompleted(byte[] bArr);

    void onInvocationFinished(byte[] bArr);
}
