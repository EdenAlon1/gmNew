package com.google.android.gms.fido.credentialstore.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;
import com.google.android.gms.fido.credentialstore.internal.IGetPasskeysCallbacks;
import com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks;
import com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks;
import com.google.android.gms.fido.credentialstore.internal.ILongValueCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialStoreService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialStoreService {
        static final int TRANSACTION_addUsage = 6;
        static final int TRANSACTION_deleteCredential = 11;
        static final int TRANSACTION_deleteDevicePublicKey = 10;
        static final int TRANSACTION_deleteKey = 4;
        static final int TRANSACTION_generateKey = 2;
        static final int TRANSACTION_getKey = 3;
        static final int TRANSACTION_getOrGenerateDevicePublicKey = 9;
        static final int TRANSACTION_getPasskeys = 8;
        static final int TRANSACTION_incrementAndGetCounter = 5;
        static final int TRANSACTION_listKeys = 7;
        static final int TRANSACTION_updatePasskey = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialStoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void addUsage(IStatusCallback iStatusCallback, String str, long j, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeLong(j);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void deleteCredential(IStatusCallback iStatusCallback, Account account, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void deleteDevicePublicKey(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void deleteKey(IStatusCallback iStatusCallback, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void generateKey(IKeyDataCallbacks iKeyDataCallbacks, KeyCreationRequestOptions keyCreationRequestOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iKeyDataCallbacks);
                rve.d(obtainAndWriteInterfaceToken, keyCreationRequestOptions);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void getKey(IKeyDataCallbacks iKeyDataCallbacks, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iKeyDataCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void getOrGenerateDevicePublicKey(IKeyDataCallbacks iKeyDataCallbacks, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iKeyDataCallbacks);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void getPasskeys(IGetPasskeysCallbacks iGetPasskeysCallbacks, Account account, String str, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetPasskeysCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void incrementAndGetCounter(ILongValueCallbacks iLongValueCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iLongValueCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void listKeys(IKeyDataListCallbacks iKeyDataListCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iKeyDataListCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService
            public void updatePasskey(IStatusCallback iStatusCallback, Account account, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
        }

        public static ICredentialStoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.ICredentialStoreService");
            return queryLocalInterface instanceof ICredentialStoreService ? (ICredentialStoreService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IKeyDataCallbacks asInterface = IKeyDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    KeyCreationRequestOptions keyCreationRequestOptions = (KeyCreationRequestOptions) rve.a(parcel, KeyCreationRequestOptions.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    generateKey(asInterface, keyCreationRequestOptions, apiMetadata);
                    break;
                case 3:
                    IKeyDataCallbacks asInterface2 = IKeyDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getKey(asInterface2, readString, createByteArray, apiMetadata2);
                    break;
                case 4:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    byte[] createByteArray2 = parcel.createByteArray();
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteKey(asInterface3, readString2, createByteArray2, apiMetadata3);
                    break;
                case 5:
                    ILongValueCallbacks asInterface4 = ILongValueCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    incrementAndGetCounter(asInterface4, readString3, apiMetadata4);
                    break;
                case 6:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    long readLong = parcel.readLong();
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addUsage(asInterface5, readString4, readLong, apiMetadata5);
                    break;
                case 7:
                    IKeyDataListCallbacks asInterface6 = IKeyDataListCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listKeys(asInterface6, readString5, apiMetadata6);
                    break;
                case 8:
                    IGetPasskeysCallbacks asInterface7 = IGetPasskeysCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    String readString6 = parcel.readString();
                    byte[] createByteArray3 = parcel.createByteArray();
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPasskeys(asInterface7, account, readString6, createByteArray3, apiMetadata7);
                    break;
                case 9:
                    IKeyDataCallbacks asInterface8 = IKeyDataCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray4 = parcel.createByteArray();
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getOrGenerateDevicePublicKey(asInterface8, createByteArray4, apiMetadata8);
                    break;
                case 10:
                    IStatusCallback asInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray5 = parcel.createByteArray();
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteDevicePublicKey(asInterface9, createByteArray5, apiMetadata9);
                    break;
                case 11:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString7 = parcel.readString();
                    byte[] createByteArray6 = parcel.createByteArray();
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteCredential(asInterface10, account2, readString7, createByteArray6, apiMetadata10);
                    break;
                case 12:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) rve.a(parcel, Account.CREATOR);
                    byte[] createByteArray7 = parcel.createByteArray();
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updatePasskey(asInterface11, account3, createByteArray7, apiMetadata11);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addUsage(IStatusCallback iStatusCallback, String str, long j, ApiMetadata apiMetadata);

    void deleteCredential(IStatusCallback iStatusCallback, Account account, String str, byte[] bArr, ApiMetadata apiMetadata);

    void deleteDevicePublicKey(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void deleteKey(IStatusCallback iStatusCallback, String str, byte[] bArr, ApiMetadata apiMetadata);

    void generateKey(IKeyDataCallbacks iKeyDataCallbacks, KeyCreationRequestOptions keyCreationRequestOptions, ApiMetadata apiMetadata);

    void getKey(IKeyDataCallbacks iKeyDataCallbacks, String str, byte[] bArr, ApiMetadata apiMetadata);

    void getOrGenerateDevicePublicKey(IKeyDataCallbacks iKeyDataCallbacks, byte[] bArr, ApiMetadata apiMetadata);

    void getPasskeys(IGetPasskeysCallbacks iGetPasskeysCallbacks, Account account, String str, byte[] bArr, ApiMetadata apiMetadata);

    void incrementAndGetCounter(ILongValueCallbacks iLongValueCallbacks, String str, ApiMetadata apiMetadata);

    void listKeys(IKeyDataListCallbacks iKeyDataListCallbacks, String str, ApiMetadata apiMetadata);

    void updatePasskey(IStatusCallback iStatusCallback, Account account, byte[] bArr, ApiMetadata apiMetadata);
}
