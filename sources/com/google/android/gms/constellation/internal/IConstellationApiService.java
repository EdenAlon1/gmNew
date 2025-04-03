package com.google.android.gms.constellation.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.internal.IConstellationCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IConstellationApiService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IConstellationApiService {
        static final int TRANSACTION_getIidToken = 4;
        static final int TRANSACTION_verifyPhoneNumber = 3;
        static final int TRANSACTION_verifyPhoneNumberSingleUse = 2;
        static final int TRANSACTION_verifyPhoneNumberV1 = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IConstellationApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.constellation.internal.IConstellationApiService");
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void getIidToken(IConstellationCallbacks iConstellationCallbacks, GetIidTokenRequest getIidTokenRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iConstellationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, getIidTokenRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void verifyPhoneNumber(IConstellationCallbacks iConstellationCallbacks, VerifyPhoneNumberRequest verifyPhoneNumberRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iConstellationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, verifyPhoneNumberRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void verifyPhoneNumberSingleUse(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iConstellationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationApiService
            public void verifyPhoneNumberV1(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iConstellationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.constellation.internal.IConstellationApiService");
        }

        public static IConstellationApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationApiService");
            return queryLocalInterface instanceof IConstellationApiService ? (IConstellationApiService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IConstellationCallbacks asInterface = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyPhoneNumberV1(asInterface, bundle, apiMetadata);
            } else if (i == 2) {
                IConstellationCallbacks asInterface2 = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyPhoneNumberSingleUse(asInterface2, bundle2, apiMetadata2);
            } else if (i == 3) {
                IConstellationCallbacks asInterface3 = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                VerifyPhoneNumberRequest verifyPhoneNumberRequest = (VerifyPhoneNumberRequest) rve.a(parcel, VerifyPhoneNumberRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                verifyPhoneNumber(asInterface3, verifyPhoneNumberRequest, apiMetadata3);
            } else {
                if (i != 4) {
                    return false;
                }
                IConstellationCallbacks asInterface4 = IConstellationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                GetIidTokenRequest getIidTokenRequest = (GetIidTokenRequest) rve.a(parcel, GetIidTokenRequest.CREATOR);
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getIidToken(asInterface4, getIidTokenRequest, apiMetadata4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getIidToken(IConstellationCallbacks iConstellationCallbacks, GetIidTokenRequest getIidTokenRequest, ApiMetadata apiMetadata);

    void verifyPhoneNumber(IConstellationCallbacks iConstellationCallbacks, VerifyPhoneNumberRequest verifyPhoneNumberRequest, ApiMetadata apiMetadata);

    void verifyPhoneNumberSingleUse(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata);

    void verifyPhoneNumberV1(IConstellationCallbacks iConstellationCallbacks, Bundle bundle, ApiMetadata apiMetadata);
}
