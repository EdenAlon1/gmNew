package com.google.android.gms.fido.fido2.internal.regular;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.fido2.api.IBooleanCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFido2AppService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFido2AppService {
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailable = 3;
        static final int TRANSACTION_isUserVerifyingPlatformAuthenticatorAvailableForCredential = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFido2AppService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void getRegisterIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFido2AppCallbacks);
                rve.d(obtainAndWriteInterfaceToken, publicKeyCredentialCreationOptions);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void getSignIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFido2AppCallbacks);
                rve.d(obtainAndWriteInterfaceToken, publicKeyCredentialRequestOptions);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBooleanCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.internal.regular.IFido2AppService
            public void isUserVerifyingPlatformAuthenticatorAvailableForCredential(IBooleanCallback iBooleanCallback, String str, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBooleanCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        }

        public static IFido2AppService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            return queryLocalInterface instanceof IFido2AppService ? (IFido2AppService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IFido2AppCallbacks asInterface = IFido2AppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) rve.a(parcel, PublicKeyCredentialCreationOptions.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(asInterface, publicKeyCredentialCreationOptions);
            } else if (i == 2) {
                IFido2AppCallbacks asInterface2 = IFido2AppCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) rve.a(parcel, PublicKeyCredentialRequestOptions.CREATOR);
                enforceNoDataAvail(parcel);
                getSignIntent(asInterface2, publicKeyCredentialRequestOptions);
            } else if (i == 3) {
                IBooleanCallback asInterface3 = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                isUserVerifyingPlatformAuthenticatorAvailable(asInterface3);
            } else {
                if (i != 4) {
                    return false;
                }
                IBooleanCallback asInterface4 = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                isUserVerifyingPlatformAuthenticatorAvailableForCredential(asInterface4, readString, createByteArray);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getRegisterIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions);

    void getSignIntent(IFido2AppCallbacks iFido2AppCallbacks, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions);

    void isUserVerifyingPlatformAuthenticatorAvailable(IBooleanCallback iBooleanCallback);

    void isUserVerifyingPlatformAuthenticatorAvailableForCredential(IBooleanCallback iBooleanCallback, String str, byte[] bArr);
}
