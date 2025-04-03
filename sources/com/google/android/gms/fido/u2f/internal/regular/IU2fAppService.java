package com.google.android.gms.fido.u2f.internal.regular;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IU2fAppService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IU2fAppService {
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IU2fAppService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
            }

            @Override // com.google.android.gms.fido.u2f.internal.regular.IU2fAppService
            public void getRegisterIntent(IU2fAppCallbacks iU2fAppCallbacks, RegisterRequestParams registerRequestParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iU2fAppCallbacks);
                rve.d(obtainAndWriteInterfaceToken, registerRequestParams);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.regular.IU2fAppService
            public void getSignIntent(IU2fAppCallbacks iU2fAppCallbacks, SignRequestParams signRequestParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iU2fAppCallbacks);
                rve.d(obtainAndWriteInterfaceToken, signRequestParams);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        }

        public static IU2fAppService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
            return queryLocalInterface instanceof IU2fAppService ? (IU2fAppService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IU2fAppCallbacks asInterface = IU2fAppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                RegisterRequestParams registerRequestParams = (RegisterRequestParams) rve.a(parcel, RegisterRequestParams.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(asInterface, registerRequestParams);
            } else {
                if (i != 2) {
                    return false;
                }
                IU2fAppCallbacks asInterface2 = IU2fAppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SignRequestParams signRequestParams = (SignRequestParams) rve.a(parcel, SignRequestParams.CREATOR);
                enforceNoDataAvail(parcel);
                getSignIntent(asInterface2, signRequestParams);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getRegisterIntent(IU2fAppCallbacks iU2fAppCallbacks, RegisterRequestParams registerRequestParams);

    void getSignIntent(IU2fAppCallbacks iU2fAppCallbacks, SignRequestParams signRequestParams);
}
