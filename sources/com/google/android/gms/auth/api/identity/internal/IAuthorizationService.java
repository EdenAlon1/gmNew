package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleRequest;
import com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback;
import com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthorizationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthorizationService {
        static final int TRANSACTION_authorize = 1;
        static final int TRANSACTION_revokeAccess = 3;
        static final int TRANSACTION_verifyWithGoogle = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthorizationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void authorize(IAuthorizationCallback iAuthorizationCallback, AuthorizationRequest authorizationRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAuthorizationCallback);
                rve.d(obtainAndWriteInterfaceToken, authorizationRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void revokeAccess(IStatusCallback iStatusCallback, RevokeAccessRequest revokeAccessRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, revokeAccessRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationService
            public void verifyWithGoogle(IVerifyWithGoogleCallback iVerifyWithGoogleCallback, VerifyWithGoogleRequest verifyWithGoogleRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iVerifyWithGoogleCallback);
                rve.d(obtainAndWriteInterfaceToken, verifyWithGoogleRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        }

        public static IAuthorizationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            return queryLocalInterface instanceof IAuthorizationService ? (IAuthorizationService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IAuthorizationCallback asInterface = IAuthorizationCallback.Stub.asInterface(parcel.readStrongBinder());
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) rve.a(parcel, AuthorizationRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                authorize(asInterface, authorizationRequest, apiMetadata);
            } else if (i == 2) {
                IVerifyWithGoogleCallback asInterface2 = IVerifyWithGoogleCallback.Stub.asInterface(parcel.readStrongBinder());
                VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) rve.a(parcel, VerifyWithGoogleRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyWithGoogle(asInterface2, verifyWithGoogleRequest, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) rve.a(parcel, RevokeAccessRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                revokeAccess(asInterface3, revokeAccessRequest, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void authorize(IAuthorizationCallback iAuthorizationCallback, AuthorizationRequest authorizationRequest, ApiMetadata apiMetadata);

    void revokeAccess(IStatusCallback iStatusCallback, RevokeAccessRequest revokeAccessRequest, ApiMetadata apiMetadata);

    void verifyWithGoogle(IVerifyWithGoogleCallback iVerifyWithGoogleCallback, VerifyWithGoogleRequest verifyWithGoogleRequest, ApiMetadata apiMetadata);
}
