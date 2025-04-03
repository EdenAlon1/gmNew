package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback;
import com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback;
import com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISignInService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignInService {
        static final int TRANSACTION_beginSignIn = 1;
        static final int TRANSACTION_getPhoneNumberHintIntent = 4;
        static final int TRANSACTION_getSignInIntent = 3;
        static final int TRANSACTION_signOut = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignInService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void beginSignIn(IBeginSignInCallback iBeginSignInCallback, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBeginSignInCallback);
                rve.d(obtainAndWriteInterfaceToken, beginSignInRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void getPhoneNumberHintIntent(IGetPhoneNumberHintIntentCallback iGetPhoneNumberHintIntentCallback, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetPhoneNumberHintIntentCallback);
                rve.d(obtainAndWriteInterfaceToken, getPhoneNumberHintIntentRequest);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void getSignInIntent(IGetSignInIntentCallback iGetSignInIntentCallback, GetSignInIntentRequest getSignInIntentRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetSignInIntentCallback);
                rve.d(obtainAndWriteInterfaceToken, getSignInIntentRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISignInService
            public void signOut(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ISignInService");
        }

        public static ISignInService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
            return queryLocalInterface instanceof ISignInService ? (ISignInService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IBeginSignInCallback asInterface = IBeginSignInCallback.Stub.asInterface(parcel.readStrongBinder());
                BeginSignInRequest beginSignInRequest = (BeginSignInRequest) rve.a(parcel, BeginSignInRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                beginSignIn(asInterface, beginSignInRequest, apiMetadata);
            } else if (i == 2) {
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                signOut(asInterface2, readString, apiMetadata2);
            } else if (i == 3) {
                IGetSignInIntentCallback asInterface3 = IGetSignInIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) rve.a(parcel, GetSignInIntentRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSignInIntent(asInterface3, getSignInIntentRequest, apiMetadata3);
            } else {
                if (i != 4) {
                    return false;
                }
                IGetPhoneNumberHintIntentCallback asInterface4 = IGetPhoneNumberHintIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = (GetPhoneNumberHintIntentRequest) rve.a(parcel, GetPhoneNumberHintIntentRequest.CREATOR);
                String readString2 = parcel.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getPhoneNumberHintIntent(asInterface4, getPhoneNumberHintIntentRequest, readString2, apiMetadata4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void beginSignIn(IBeginSignInCallback iBeginSignInCallback, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata);

    void getPhoneNumberHintIntent(IGetPhoneNumberHintIntentCallback iGetPhoneNumberHintIntentCallback, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str, ApiMetadata apiMetadata);

    void getSignInIntent(IGetSignInIntentCallback iGetSignInIntentCallback, GetSignInIntentRequest getSignInIntentRequest, ApiMetadata apiMetadata);

    void signOut(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);
}
