package com.google.android.gms.auth.api.identity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.internal.IClearCredentialCallback;
import com.google.android.gms.auth.api.identity.internal.ICreateCredentialCallback;
import com.google.android.gms.auth.api.identity.internal.IGetCredentialCallback;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialProviderService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialProviderService {
        static final int TRANSACTION_clearCredential = 3;
        static final int TRANSACTION_createCredential = 2;
        static final int TRANSACTION_getCredential = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialProviderService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialProviderService
            public void clearCredential(IClearCredentialCallback iClearCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iClearCredentialCallback);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialProviderService
            public void createCredential(ICreateCredentialCallback iCreateCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCreateCredentialCallback);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICredentialProviderService
            public void getCredential(IGetCredentialCallback iGetCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetCredentialCallback);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
        }

        public static ICredentialProviderService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialProviderService");
            return queryLocalInterface instanceof ICredentialProviderService ? (ICredentialProviderService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IGetCredentialCallback asInterface = IGetCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                String readString = parcel.readString();
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getCredential(asInterface, bundle, readString, apiMetadata);
            } else if (i == 2) {
                ICreateCredentialCallback asInterface2 = ICreateCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                String readString2 = parcel.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                createCredential(asInterface2, bundle2, readString2, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                IClearCredentialCallback asInterface3 = IClearCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                String readString3 = parcel.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                clearCredential(asInterface3, bundle3, readString3, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearCredential(IClearCredentialCallback iClearCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata);

    void createCredential(ICreateCredentialCallback iCreateCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata);

    void getCredential(IGetCredentialCallback iGetCredentialCallback, Bundle bundle, String str, ApiMetadata apiMetadata);
}
