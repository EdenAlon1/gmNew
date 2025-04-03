package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.BrellaInvocationOptions;
import com.google.android.gms.learning.internal.training.IBrellaInvocationCallback;
import com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBrellaInvocation extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBrellaInvocation {
        static final int TRANSACTION_addHttpUrlConnectionFactory = 4;
        static final int TRANSACTION_cancel = 3;
        static final int TRANSACTION_runInBackgroundProcess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBrellaInvocation {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IBrellaInvocation");
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocation
            public void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iHttpUrlConnectionFactory);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocation
            public void cancel(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IBrellaInvocation
            public void runInBackgroundProcess(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, BrellaInvocationOptions brellaInvocationOptions, IStatusCallback iStatusCallback, IBrellaInvocationCallback iBrellaInvocationCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, brellaInvocationOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.f(obtainAndWriteInterfaceToken, iBrellaInvocationCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IBrellaInvocation");
        }

        public static IBrellaInvocation asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IBrellaInvocation");
            return queryLocalInterface instanceof IBrellaInvocation ? (IBrellaInvocation) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                BrellaInvocationOptions brellaInvocationOptions = (BrellaInvocationOptions) rve.a(parcel, BrellaInvocationOptions.CREATOR);
                IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                IBrellaInvocationCallback asInterface4 = IBrellaInvocationCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                runInBackgroundProcess(asInterface, asInterface2, brellaInvocationOptions, asInterface3, asInterface4);
            } else if (i == 3) {
                IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                cancel(asInterface5);
            } else {
                if (i != 4) {
                    return false;
                }
                String readString = parcel.readString();
                IHttpUrlConnectionFactory asInterface6 = IHttpUrlConnectionFactory.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                addHttpUrlConnectionFactory(readString, asInterface6);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory);

    void cancel(IStatusCallback iStatusCallback);

    void runInBackgroundProcess(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, BrellaInvocationOptions brellaInvocationOptions, IStatusCallback iStatusCallback, IBrellaInvocationCallback iBrellaInvocationCallback);
}
