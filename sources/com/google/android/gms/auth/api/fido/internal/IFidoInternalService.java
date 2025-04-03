package com.google.android.gms.auth.api.fido.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.common.IStatusAndBooleanCallback;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.RegisteredCredentialData;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.auth.api.fido.internal.IIncrementAndGetCounterCallback;
import com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback;
import com.google.android.gms.auth.api.fido.internal.IListRegisteredCredentialsCallback;
import com.google.android.gms.auth.api.fido.internal.IPendingIntentCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFidoInternalService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFidoInternalService {
        static final int TRANSACTION_deleteRegisteredCredential = 5;
        static final int TRANSACTION_getAuthenticationIntent = 7;
        static final int TRANSACTION_getCredentialListForBrowser = 11;
        static final int TRANSACTION_getCryptauthKeyAndPendingIntentForAuthentication = 10;
        static final int TRANSACTION_getRegistrationIntent = 6;
        static final int TRANSACTION_hasDiscoverableKey = 9;
        static final int TRANSACTION_hasKey = 8;
        static final int TRANSACTION_incrementAndGetCounter = 4;
        static final int TRANSACTION_listRegisteredCredentials = 3;
        static final int TRANSACTION_saveRegisteredCredential = 2;
        static final int TRANSACTION_validateCallingBrowser = 13;
        static final int TRANSACTION_validateRpIdAndCallingPackage = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFidoInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void deleteRegisteredCredential(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getAuthenticationIntent(IPendingIntentCallback iPendingIntentCallback, AuthenticationOptions authenticationOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPendingIntentCallback);
                rve.d(obtainAndWriteInterfaceToken, authenticationOptions);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getCredentialListForBrowser(IListKeysForBrowserCallback iListKeysForBrowserCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iListKeysForBrowserCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getCryptauthKeyAndPendingIntentForAuthentication(IPendingIntentCallback iPendingIntentCallback, String str, Account account, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPendingIntentCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void getRegistrationIntent(IPendingIntentCallback iPendingIntentCallback, RegistrationOptions registrationOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPendingIntentCallback);
                rve.d(obtainAndWriteInterfaceToken, registrationOptions);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void hasDiscoverableKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void hasKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, List<PublicKeyCredentialDescriptor> list, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                obtainAndWriteInterfaceToken.writeList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void incrementAndGetCounter(IIncrementAndGetCounterCallback iIncrementAndGetCounterCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iIncrementAndGetCounterCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void listRegisteredCredentials(IListRegisteredCredentialsCallback iListRegisteredCredentialsCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iListRegisteredCredentialsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void saveRegisteredCredential(IStatusCallback iStatusCallback, RegisteredCredentialData registeredCredentialData, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, registeredCredentialData);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void validateCallingBrowser(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IFidoInternalService
            public void validateRpIdAndCallingPackage(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusAndBooleanCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
        }

        public static IFidoInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IFidoInternalService");
            return queryLocalInterface instanceof IFidoInternalService ? (IFidoInternalService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    RegisteredCredentialData registeredCredentialData = (RegisteredCredentialData) rve.a(parcel, RegisteredCredentialData.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    saveRegisteredCredential(asInterface, registeredCredentialData, apiMetadata);
                    break;
                case 3:
                    IListRegisteredCredentialsCallback asInterface2 = IListRegisteredCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listRegisteredCredentials(asInterface2, readString, apiMetadata2);
                    break;
                case 4:
                    IIncrementAndGetCounterCallback asInterface3 = IIncrementAndGetCounterCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    incrementAndGetCounter(asInterface3, readString2, apiMetadata3);
                    break;
                case 5:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteRegisteredCredential(asInterface4, readString3, apiMetadata4);
                    break;
                case 6:
                    IPendingIntentCallback asInterface5 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    RegistrationOptions registrationOptions = (RegistrationOptions) rve.a(parcel, RegistrationOptions.CREATOR);
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getRegistrationIntent(asInterface5, registrationOptions, apiMetadata5);
                    break;
                case 7:
                    IPendingIntentCallback asInterface6 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    AuthenticationOptions authenticationOptions = (AuthenticationOptions) rve.a(parcel, AuthenticationOptions.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAuthenticationIntent(asInterface6, authenticationOptions, apiMetadata6);
                    break;
                case 8:
                    IStatusAndBooleanCallback asInterface7 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList b = rve.b(parcel);
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasKey(asInterface7, b, readString4, readString5, apiMetadata7);
                    break;
                case 9:
                    IStatusAndBooleanCallback asInterface8 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasDiscoverableKey(asInterface8, readString6, readString7, apiMetadata8);
                    break;
                case 10:
                    IPendingIntentCallback asInterface9 = IPendingIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    boolean g = rve.g(parcel);
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCryptauthKeyAndPendingIntentForAuthentication(asInterface9, readString8, account, g, apiMetadata9);
                    break;
                case 11:
                    IListKeysForBrowserCallback asInterface10 = IListKeysForBrowserCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCredentialListForBrowser(asInterface10, readString9, apiMetadata10);
                    break;
                case 12:
                    IStatusAndBooleanCallback asInterface11 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    validateRpIdAndCallingPackage(asInterface11, readString10, readString11, apiMetadata11);
                    break;
                case 13:
                    IStatusAndBooleanCallback asInterface12 = IStatusAndBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    validateCallingBrowser(asInterface12, readString12, apiMetadata12);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteRegisteredCredential(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void getAuthenticationIntent(IPendingIntentCallback iPendingIntentCallback, AuthenticationOptions authenticationOptions, ApiMetadata apiMetadata);

    void getCredentialListForBrowser(IListKeysForBrowserCallback iListKeysForBrowserCallback, String str, ApiMetadata apiMetadata);

    void getCryptauthKeyAndPendingIntentForAuthentication(IPendingIntentCallback iPendingIntentCallback, String str, Account account, boolean z, ApiMetadata apiMetadata);

    void getRegistrationIntent(IPendingIntentCallback iPendingIntentCallback, RegistrationOptions registrationOptions, ApiMetadata apiMetadata);

    void hasDiscoverableKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata);

    void hasKey(IStatusAndBooleanCallback iStatusAndBooleanCallback, List<PublicKeyCredentialDescriptor> list, String str, String str2, ApiMetadata apiMetadata);

    void incrementAndGetCounter(IIncrementAndGetCounterCallback iIncrementAndGetCounterCallback, String str, ApiMetadata apiMetadata);

    void listRegisteredCredentials(IListRegisteredCredentialsCallback iListRegisteredCredentialsCallback, String str, ApiMetadata apiMetadata);

    void saveRegisteredCredential(IStatusCallback iStatusCallback, RegisteredCredentialData registeredCredentialData, ApiMetadata apiMetadata);

    void validateCallingBrowser(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, ApiMetadata apiMetadata);

    void validateRpIdAndCallingPackage(IStatusAndBooleanCallback iStatusAndBooleanCallback, String str, String str2, ApiMetadata apiMetadata);
}
