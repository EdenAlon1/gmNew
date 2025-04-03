package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAccountTransferService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAccountTransferService {
        static final int TRANSACTION_exportAccounts = 1;
        static final int TRANSACTION_exportExternalAccounts = 3;
        static final int TRANSACTION_getDeviceMetaData = 7;
        static final int TRANSACTION_importAccounts = 2;
        static final int TRANSACTION_importExternalAccounts = 4;
        static final int TRANSACTION_launchChallenge = 8;
        static final int TRANSACTION_notifyCompletion = 9;
        static final int TRANSACTION_retrieveData = 6;
        static final int TRANSACTION_sendData = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAccountTransferService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void exportAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, accountTransferMsg);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void exportExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, authenticatorTransferInfo);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void getDeviceMetaData(IAccountTransferCallbacks iAccountTransferCallbacks, DeviceMetaDataRequest deviceMetaDataRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, deviceMetaDataRequest);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void importAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, accountTransferMsg);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void importExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, authenticatorTransferInfo);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void launchChallenge(IAccountTransferCallbacks iAccountTransferCallbacks, UserChallengeRequest userChallengeRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, userChallengeRequest);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void notifyCompletion(IAccountTransferCallbacks iAccountTransferCallbacks, NotifyCompletionRequest notifyCompletionRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, notifyCompletionRequest);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void retrieveData(IAccountTransferCallbacks iAccountTransferCallbacks, RetrieveDataRequest retrieveDataRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, retrieveDataRequest);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService
            public void sendData(IAccountTransferCallbacks iAccountTransferCallbacks, SendDataRequest sendDataRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAccountTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, sendDataRequest);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        }

        public static IAccountTransferService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
            return queryLocalInterface instanceof IAccountTransferService ? (IAccountTransferService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IAccountTransferCallbacks asInterface = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountTransferMsg accountTransferMsg = (AccountTransferMsg) rve.a(parcel, AccountTransferMsg.CREATOR);
                    enforceNoDataAvail(parcel);
                    exportAccounts(asInterface, accountTransferMsg);
                    break;
                case 2:
                    IAccountTransferCallbacks asInterface2 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountTransferMsg accountTransferMsg2 = (AccountTransferMsg) rve.a(parcel, AccountTransferMsg.CREATOR);
                    enforceNoDataAvail(parcel);
                    importAccounts(asInterface2, accountTransferMsg2);
                    break;
                case 3:
                    IAccountTransferCallbacks asInterface3 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AuthenticatorTransferInfo authenticatorTransferInfo = (AuthenticatorTransferInfo) rve.a(parcel, AuthenticatorTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    exportExternalAccounts(asInterface3, authenticatorTransferInfo);
                    break;
                case 4:
                    IAccountTransferCallbacks asInterface4 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AuthenticatorTransferInfo authenticatorTransferInfo2 = (AuthenticatorTransferInfo) rve.a(parcel, AuthenticatorTransferInfo.CREATOR);
                    enforceNoDataAvail(parcel);
                    importExternalAccounts(asInterface4, authenticatorTransferInfo2);
                    break;
                case 5:
                    IAccountTransferCallbacks asInterface5 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    SendDataRequest sendDataRequest = (SendDataRequest) rve.a(parcel, SendDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    sendData(asInterface5, sendDataRequest);
                    break;
                case 6:
                    IAccountTransferCallbacks asInterface6 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    RetrieveDataRequest retrieveDataRequest = (RetrieveDataRequest) rve.a(parcel, RetrieveDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    retrieveData(asInterface6, retrieveDataRequest);
                    break;
                case 7:
                    IAccountTransferCallbacks asInterface7 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    DeviceMetaDataRequest deviceMetaDataRequest = (DeviceMetaDataRequest) rve.a(parcel, DeviceMetaDataRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDeviceMetaData(asInterface7, deviceMetaDataRequest);
                    break;
                case 8:
                    IAccountTransferCallbacks asInterface8 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    UserChallengeRequest userChallengeRequest = (UserChallengeRequest) rve.a(parcel, UserChallengeRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    launchChallenge(asInterface8, userChallengeRequest);
                    break;
                case 9:
                    IAccountTransferCallbacks asInterface9 = IAccountTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    NotifyCompletionRequest notifyCompletionRequest = (NotifyCompletionRequest) rve.a(parcel, NotifyCompletionRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    notifyCompletion(asInterface9, notifyCompletionRequest);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void exportAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg);

    void exportExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo);

    void getDeviceMetaData(IAccountTransferCallbacks iAccountTransferCallbacks, DeviceMetaDataRequest deviceMetaDataRequest);

    void importAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AccountTransferMsg accountTransferMsg);

    void importExternalAccounts(IAccountTransferCallbacks iAccountTransferCallbacks, AuthenticatorTransferInfo authenticatorTransferInfo);

    void launchChallenge(IAccountTransferCallbacks iAccountTransferCallbacks, UserChallengeRequest userChallengeRequest);

    void notifyCompletion(IAccountTransferCallbacks iAccountTransferCallbacks, NotifyCompletionRequest notifyCompletionRequest);

    void retrieveData(IAccountTransferCallbacks iAccountTransferCallbacks, RetrieveDataRequest retrieveDataRequest);

    void sendData(IAccountTransferCallbacks iAccountTransferCallbacks, SendDataRequest sendDataRequest);
}
