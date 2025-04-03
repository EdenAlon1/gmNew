package com.google.android.gms.auth.api.credentials.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.internal.IBundleCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICredentialsInternalService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICredentialsInternalService {
        static final int TRANSACTION_disableYoloSaveDialogForApp = 12;
        static final int TRANSACTION_getAccountSettings = 6;
        static final int TRANSACTION_getFullCredential = 3;
        static final int TRANSACTION_listCredentialsForEnabledAccounts = 1;
        static final int TRANSACTION_listHints = 2;
        static final int TRANSACTION_requestIdToken = 4;
        static final int TRANSACTION_saveCredential = 5;
        static final int TRANSACTION_setAppNeverSave = 11;
        static final int TRANSACTION_setAutoSignInEnabled = 9;
        static final int TRANSACTION_setAutoSignInEnabledForApp = 10;
        static final int TRANSACTION_setIsFirstTimeWelcomeShown = 7;
        static final int TRANSACTION_setServiceEnabled = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICredentialsInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void disableYoloSaveDialogForApp(IBundleCallbacks iBundleCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void getAccountSettings(IBundleCallbacks iBundleCallbacks, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void getFullCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential, boolean z, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, credential);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void listCredentialsForEnabledAccounts(IBundleCallbacks iBundleCallbacks, String str, CredentialRequest credentialRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, credentialRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void listHints(IBundleCallbacks iBundleCallbacks, HintRequest hintRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, hintRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void requestIdToken(IBundleCallbacks iBundleCallbacks, Account account, String str, String str2, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void saveCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, credential);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setAppNeverSave(IBundleCallbacks iBundleCallbacks, Account account, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setAutoSignInEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setAutoSignInEnabledForApp(IBundleCallbacks iBundleCallbacks, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setIsFirstTimeWelcomeShown(IBundleCallbacks iBundleCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService
            public void setServiceEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBundleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
        }

        public static ICredentialsInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
            return queryLocalInterface instanceof ICredentialsInternalService ? (ICredentialsInternalService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IBundleCallbacks asInterface = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    CredentialRequest credentialRequest = (CredentialRequest) rve.a(parcel, CredentialRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    listCredentialsForEnabledAccounts(asInterface, readString, credentialRequest);
                    break;
                case 2:
                    IBundleCallbacks asInterface2 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    HintRequest hintRequest = (HintRequest) rve.a(parcel, HintRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    listHints(asInterface2, hintRequest);
                    break;
                case 3:
                    IBundleCallbacks asInterface3 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    String readString2 = parcel.readString();
                    Credential credential = (Credential) rve.a(parcel, Credential.CREATOR);
                    boolean g = rve.g(parcel);
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    getFullCredential(asInterface3, account, readString2, credential, g, readString3, readString4);
                    break;
                case 4:
                    IBundleCallbacks asInterface4 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    requestIdToken(asInterface4, account2, readString5, readString6, readString7);
                    break;
                case 5:
                    IBundleCallbacks asInterface5 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString8 = parcel.readString();
                    Credential credential2 = (Credential) rve.a(parcel, Credential.CREATOR);
                    enforceNoDataAvail(parcel);
                    saveCredential(asInterface5, account3, readString8, credential2);
                    break;
                case 6:
                    IBundleCallbacks asInterface6 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) rve.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAccountSettings(asInterface6, account4);
                    break;
                case 7:
                    IBundleCallbacks asInterface7 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setIsFirstTimeWelcomeShown(asInterface7);
                    break;
                case 8:
                    IBundleCallbacks asInterface8 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) rve.a(parcel, Account.CREATOR);
                    boolean g2 = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    setServiceEnabled(asInterface8, account5, g2);
                    break;
                case 9:
                    IBundleCallbacks asInterface9 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) rve.a(parcel, Account.CREATOR);
                    boolean g3 = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAutoSignInEnabled(asInterface9, account6, g3);
                    break;
                case 10:
                    IBundleCallbacks asInterface10 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    boolean g4 = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAutoSignInEnabledForApp(asInterface10, readString9, g4);
                    break;
                case 11:
                    IBundleCallbacks asInterface11 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account7 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString10 = parcel.readString();
                    boolean g5 = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    setAppNeverSave(asInterface11, account7, readString10, g5);
                    break;
                case 12:
                    IBundleCallbacks asInterface12 = IBundleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    disableYoloSaveDialogForApp(asInterface12, readString11);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void disableYoloSaveDialogForApp(IBundleCallbacks iBundleCallbacks, String str);

    void getAccountSettings(IBundleCallbacks iBundleCallbacks, Account account);

    void getFullCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential, boolean z, String str2, String str3);

    void listCredentialsForEnabledAccounts(IBundleCallbacks iBundleCallbacks, String str, CredentialRequest credentialRequest);

    void listHints(IBundleCallbacks iBundleCallbacks, HintRequest hintRequest);

    void requestIdToken(IBundleCallbacks iBundleCallbacks, Account account, String str, String str2, String str3);

    void saveCredential(IBundleCallbacks iBundleCallbacks, Account account, String str, Credential credential);

    void setAppNeverSave(IBundleCallbacks iBundleCallbacks, Account account, String str, boolean z);

    void setAutoSignInEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z);

    void setAutoSignInEnabledForApp(IBundleCallbacks iBundleCallbacks, String str, boolean z);

    void setIsFirstTimeWelcomeShown(IBundleCallbacks iBundleCallbacks);

    void setServiceEnabled(IBundleCallbacks iBundleCallbacks, Account account, boolean z);
}
