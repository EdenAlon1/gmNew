package com.google.android.gms.auth.api.credentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialsService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialsService {
        static final int TRANSACTION_performCredentialsDeleteOperation = 3;
        static final int TRANSACTION_performCredentialsRequestOperation = 1;
        static final int TRANSACTION_performCredentialsSaveOperation = 2;
        static final int TRANSACTION_performDisableAutoSignInOperation = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsDeleteOperation(ICredentialsCallbacks iCredentialsCallbacks, DeleteRequest deleteRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                rve.d(obtainAndWriteInterfaceToken, deleteRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsRequestOperation(ICredentialsCallbacks iCredentialsCallbacks, CredentialRequest credentialRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                rve.d(obtainAndWriteInterfaceToken, credentialRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsSaveOperation(ICredentialsCallbacks iCredentialsCallbacks, SaveRequest saveRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                rve.d(obtainAndWriteInterfaceToken, saveRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performDisableAutoSignInOperation(ICredentialsCallbacks iCredentialsCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCredentialsCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        }

        public static ICredentialsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            return queryLocalInterface instanceof ICredentialsService ? (ICredentialsService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ICredentialsCallbacks asInterface = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                CredentialRequest credentialRequest = (CredentialRequest) rve.a(parcel, CredentialRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                performCredentialsRequestOperation(asInterface, credentialRequest, apiMetadata);
            } else if (i == 2) {
                ICredentialsCallbacks asInterface2 = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SaveRequest saveRequest = (SaveRequest) rve.a(parcel, SaveRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                performCredentialsSaveOperation(asInterface2, saveRequest, apiMetadata2);
            } else if (i == 3) {
                ICredentialsCallbacks asInterface3 = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                DeleteRequest deleteRequest = (DeleteRequest) rve.a(parcel, DeleteRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                performCredentialsDeleteOperation(asInterface3, deleteRequest, apiMetadata3);
            } else {
                if (i != 4) {
                    return false;
                }
                ICredentialsCallbacks asInterface4 = ICredentialsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                performDisableAutoSignInOperation(asInterface4, apiMetadata4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void performCredentialsDeleteOperation(ICredentialsCallbacks iCredentialsCallbacks, DeleteRequest deleteRequest, ApiMetadata apiMetadata);

    void performCredentialsRequestOperation(ICredentialsCallbacks iCredentialsCallbacks, CredentialRequest credentialRequest, ApiMetadata apiMetadata);

    void performCredentialsSaveOperation(ICredentialsCallbacks iCredentialsCallbacks, SaveRequest saveRequest, ApiMetadata apiMetadata);

    void performDisableAutoSignInOperation(ICredentialsCallbacks iCredentialsCallbacks, ApiMetadata apiMetadata);
}
