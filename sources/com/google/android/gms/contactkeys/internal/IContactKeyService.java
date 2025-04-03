package com.google.android.gms.contactkeys.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.contactkeys.internal.IContactKeyCallback;
import com.google.android.gms.contactkeys.internal.IContactKeyIntCallback;
import com.google.android.gms.contactkeys.internal.IContactKeyIntentCallback;
import com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback;
import com.google.android.gms.contactkeys.internal.IContactKeysCallback;
import com.google.android.gms.contactkeys.internal.ISelfKeyCallback;
import com.google.android.gms.contactkeys.internal.ISelfKeysCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactKeyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactKeyService {
        static final int TRANSACTION_getAllE2eeContactKeys = 2;
        static final int TRANSACTION_getAllE2eeSelfKeys = 1;
        static final int TRANSACTION_getAllOwnerE2eeContactKeys = 21;
        static final int TRANSACTION_getE2eeContactKey = 4;
        static final int TRANSACTION_getE2eeSelfKey = 3;
        static final int TRANSACTION_getMaxKeySizeBytes = 17;
        static final int TRANSACTION_getOnboardingIntent = 20;
        static final int TRANSACTION_getOwnerE2eeContactKeys = 6;
        static final int TRANSACTION_getOwnerE2eeSelfKeys = 5;
        static final int TRANSACTION_getScanQrCodeIntent = 19;
        static final int TRANSACTION_getShowQrCodeIntent = 18;
        static final int TRANSACTION_removeE2eeContactKey = 15;
        static final int TRANSACTION_removeE2eeSelfKey = 16;
        static final int TRANSACTION_updateE2eeContactKeyLocalVerificationState = 11;
        static final int TRANSACTION_updateE2eeContactKeyLocalVerificationStateForPackage = 12;
        static final int TRANSACTION_updateE2eeContactKeyRemoteVerificationState = 13;
        static final int TRANSACTION_updateE2eeContactKeyRemoteVerificationStateForPackage = 14;
        static final int TRANSACTION_updateE2eeSelfKeyRemoteVerificationState = 9;
        static final int TRANSACTION_updateE2eeSelfKeyRemoteVerificationStateForPackage = 10;
        static final int TRANSACTION_updateOrInsertE2eeContactKey = 7;
        static final int TRANSACTION_updateOrInsertE2eeSelfKey = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactKeyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.contactkeys.internal.IContactKeyService");
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeysCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSelfKeysCallback);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getAllOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeysCallback);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getE2eeContactKey(IContactKeyCallback iContactKeyCallback, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getE2eeSelfKey(ISelfKeyCallback iSelfKeyCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSelfKeyCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getMaxKeySizeBytes(IContactKeyIntCallback iContactKeyIntCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyIntCallback);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getOnboardingIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyIntentCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeysCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getOwnerE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSelfKeysCallback);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getScanQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyIntentCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void getShowQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyIntentCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void removeE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void removeE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyLocalVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyLocalVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, String str4, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeContactKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, String str4, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeSelfKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateE2eeSelfKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateOrInsertE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, byte[] bArr, String str4, String str5, String str6) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeString(str5);
                obtainAndWriteInterfaceToken.writeString(str6);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyService
            public void updateOrInsertE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactKeyStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.contactkeys.internal.IContactKeyService");
        }

        public static IContactKeyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contactkeys.internal.IContactKeyService");
            return queryLocalInterface instanceof IContactKeyService ? (IContactKeyService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    ISelfKeysCallback asInterface = ISelfKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAllE2eeSelfKeys(asInterface);
                    break;
                case 2:
                    IContactKeysCallback asInterface2 = IContactKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getAllE2eeContactKeys(asInterface2, readString);
                    break;
                case 3:
                    ISelfKeyCallback asInterface3 = ISelfKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getE2eeSelfKey(asInterface3, readString2, readString3);
                    break;
                case 4:
                    IContactKeyCallback asInterface4 = IContactKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getE2eeContactKey(asInterface4, readString4, readString5, readString6);
                    break;
                case 5:
                    ISelfKeysCallback asInterface5 = ISelfKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getOwnerE2eeSelfKeys(asInterface5);
                    break;
                case 6:
                    IContactKeysCallback asInterface6 = IContactKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getOwnerE2eeContactKeys(asInterface6, readString7);
                    break;
                case 7:
                    IContactKeyStatusCallback asInterface7 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    updateOrInsertE2eeContactKey(asInterface7, readString8, readString9, readString10, createByteArray, readString11, readString12, readString13);
                    break;
                case 8:
                    IContactKeyStatusCallback asInterface8 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    byte[] createByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    updateOrInsertE2eeSelfKey(asInterface8, readString14, readString15, createByteArray2);
                    break;
                case 9:
                    IContactKeyStatusCallback asInterface9 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeSelfKeyRemoteVerificationState(asInterface9, readString16, readString17, readInt);
                    break;
                case 10:
                    IContactKeyStatusCallback asInterface10 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString18 = parcel.readString();
                    String readString19 = parcel.readString();
                    String readString20 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeSelfKeyRemoteVerificationStateForPackage(asInterface10, readString18, readString19, readString20, readInt2);
                    break;
                case 11:
                    IContactKeyStatusCallback asInterface11 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString21 = parcel.readString();
                    String readString22 = parcel.readString();
                    String readString23 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyLocalVerificationState(asInterface11, readString21, readString22, readString23, readInt3);
                    break;
                case 12:
                    IContactKeyStatusCallback asInterface12 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString24 = parcel.readString();
                    String readString25 = parcel.readString();
                    String readString26 = parcel.readString();
                    String readString27 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyLocalVerificationStateForPackage(asInterface12, readString24, readString25, readString26, readString27, readInt4);
                    break;
                case 13:
                    IContactKeyStatusCallback asInterface13 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString28 = parcel.readString();
                    String readString29 = parcel.readString();
                    String readString30 = parcel.readString();
                    int readInt5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyRemoteVerificationState(asInterface13, readString28, readString29, readString30, readInt5);
                    break;
                case 14:
                    IContactKeyStatusCallback asInterface14 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString31 = parcel.readString();
                    String readString32 = parcel.readString();
                    String readString33 = parcel.readString();
                    String readString34 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    updateE2eeContactKeyRemoteVerificationStateForPackage(asInterface14, readString31, readString32, readString33, readString34, readInt6);
                    break;
                case 15:
                    IContactKeyStatusCallback asInterface15 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString35 = parcel.readString();
                    String readString36 = parcel.readString();
                    String readString37 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeE2eeContactKey(asInterface15, readString35, readString36, readString37);
                    break;
                case 16:
                    IContactKeyStatusCallback asInterface16 = IContactKeyStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString38 = parcel.readString();
                    String readString39 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeE2eeSelfKey(asInterface16, readString38, readString39);
                    break;
                case 17:
                    IContactKeyIntCallback asInterface17 = IContactKeyIntCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getMaxKeySizeBytes(asInterface17);
                    break;
                case 18:
                    IContactKeyIntentCallback asInterface18 = IContactKeyIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString40 = parcel.readString();
                    boolean g = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    getShowQrCodeIntent(asInterface18, readString40, g);
                    break;
                case 19:
                    IContactKeyIntentCallback asInterface19 = IContactKeyIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString41 = parcel.readString();
                    boolean g2 = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    getScanQrCodeIntent(asInterface19, readString41, g2);
                    break;
                case 20:
                    IContactKeyIntentCallback asInterface20 = IContactKeyIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString42 = parcel.readString();
                    String readString43 = parcel.readString();
                    String readString44 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getOnboardingIntent(asInterface20, readString42, readString43, readString44);
                    break;
                case 21:
                    IContactKeysCallback asInterface21 = IContactKeysCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getAllOwnerE2eeContactKeys(asInterface21);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getAllE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str);

    void getAllE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback);

    void getAllOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback);

    void getE2eeContactKey(IContactKeyCallback iContactKeyCallback, String str, String str2, String str3);

    void getE2eeSelfKey(ISelfKeyCallback iSelfKeyCallback, String str, String str2);

    void getMaxKeySizeBytes(IContactKeyIntCallback iContactKeyIntCallback);

    void getOnboardingIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, String str2, String str3);

    void getOwnerE2eeContactKeys(IContactKeysCallback iContactKeysCallback, String str);

    void getOwnerE2eeSelfKeys(ISelfKeysCallback iSelfKeysCallback);

    void getScanQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z);

    void getShowQrCodeIntent(IContactKeyIntentCallback iContactKeyIntentCallback, String str, boolean z);

    void removeE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3);

    void removeE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2);

    void updateE2eeContactKeyLocalVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i);

    void updateE2eeContactKeyLocalVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, String str4, int i);

    void updateE2eeContactKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i);

    void updateE2eeContactKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, String str4, int i);

    void updateE2eeSelfKeyRemoteVerificationState(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, int i);

    void updateE2eeSelfKeyRemoteVerificationStateForPackage(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, int i);

    void updateOrInsertE2eeContactKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, String str3, byte[] bArr, String str4, String str5, String str6);

    void updateOrInsertE2eeSelfKey(IContactKeyStatusCallback iContactKeyStatusCallback, String str, String str2, byte[] bArr);
}
