package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppTrainerCanceller extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppTrainerCanceller {
        static final int TRANSACTION_cancelJobsByType = 2;
        static final int TRANSACTION_init = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppTrainerCanceller {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainerCanceller
            public void cancelJobsByType(int i, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainerCanceller
            public boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
        }

        public static IInAppTrainerCanceller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainerCanceller");
            return queryLocalInterface instanceof IInAppTrainerCanceller ? (IInAppTrainerCanceller) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                boolean init = init(asInterface, asInterface2, asInterface3);
                parcel2.writeNoException();
                int i3 = rve.a;
                parcel2.writeInt(init ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                int readInt = parcel.readInt();
                IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                cancelJobsByType(readInt, asInterface4);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void cancelJobsByType(int i, IStatusCallback iStatusCallback);

    boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IStatusCallback iStatusCallback);
}
