package com.google.android.gms.auth.firstparty.delegate;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthDelegateService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthDelegateService {
        static final int TRANSACTION_accountSetupWorkflowAction = 9;
        static final int TRANSACTION_getAccountRemovalAllowedWorkflowIntent = 8;
        static final int TRANSACTION_getConfirmCredentialsWorkflowIntent = 4;
        static final int TRANSACTION_getFinishSessionWorkflowIntent = 7;
        static final int TRANSACTION_getSetupAccountWorkflowIntent = 1;
        static final int TRANSACTION_getStartAddAccountSessionWorkflowIntent = 5;
        static final int TRANSACTION_getStartUpdateCredentialsSessionWorkflowIntent = 6;
        static final int TRANSACTION_getTokenRetrievalWorkflowIntent = 2;
        static final int TRANSACTION_getUpdateCredentialsWorkflowIntent = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthDelegateService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public Bundle accountSetupWorkflowAction(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, setupAccountWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getAccountRemovalAllowedWorkflowIntent(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, accountRemovalAllowedWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getConfirmCredentialsWorkflowIntent(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, confirmCredentialsWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getFinishSessionWorkflowIntent(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, finishSessionWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getSetupAccountWorkflowIntent(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, setupAccountWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getStartAddAccountSessionWorkflowIntent(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, startAddAccountSessionWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getStartUpdateCredentialsSessionWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, updateCredentialsWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getTokenRetrievalWorkflowIntent(TokenWorkflowRequest tokenWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, tokenWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService
            public PendingIntent getUpdateCredentialsWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, updateCredentialsWorkflowRequest);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
        }

        public static IAuthDelegateService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
            return queryLocalInterface instanceof IAuthDelegateService ? (IAuthDelegateService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    SetupAccountWorkflowRequest setupAccountWorkflowRequest = (SetupAccountWorkflowRequest) rve.a(parcel, SetupAccountWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent setupAccountWorkflowIntent = getSetupAccountWorkflowIntent(setupAccountWorkflowRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, setupAccountWorkflowIntent);
                    return true;
                case 2:
                    TokenWorkflowRequest tokenWorkflowRequest = (TokenWorkflowRequest) rve.a(parcel, TokenWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent tokenRetrievalWorkflowIntent = getTokenRetrievalWorkflowIntent(tokenWorkflowRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, tokenRetrievalWorkflowIntent);
                    return true;
                case 3:
                    UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest = (UpdateCredentialsWorkflowRequest) rve.a(parcel, UpdateCredentialsWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent updateCredentialsWorkflowIntent = getUpdateCredentialsWorkflowIntent(updateCredentialsWorkflowRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, updateCredentialsWorkflowIntent);
                    return true;
                case 4:
                    ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest = (ConfirmCredentialsWorkflowRequest) rve.a(parcel, ConfirmCredentialsWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent confirmCredentialsWorkflowIntent = getConfirmCredentialsWorkflowIntent(confirmCredentialsWorkflowRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, confirmCredentialsWorkflowIntent);
                    return true;
                case 5:
                    StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest = (StartAddAccountSessionWorkflowRequest) rve.a(parcel, StartAddAccountSessionWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent startAddAccountSessionWorkflowIntent = getStartAddAccountSessionWorkflowIntent(startAddAccountSessionWorkflowRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, startAddAccountSessionWorkflowIntent);
                    return true;
                case 6:
                    UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest2 = (UpdateCredentialsWorkflowRequest) rve.a(parcel, UpdateCredentialsWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent startUpdateCredentialsSessionWorkflowIntent = getStartUpdateCredentialsSessionWorkflowIntent(updateCredentialsWorkflowRequest2);
                    parcel2.writeNoException();
                    rve.e(parcel2, startUpdateCredentialsSessionWorkflowIntent);
                    return true;
                case 7:
                    FinishSessionWorkflowRequest finishSessionWorkflowRequest = (FinishSessionWorkflowRequest) rve.a(parcel, FinishSessionWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent finishSessionWorkflowIntent = getFinishSessionWorkflowIntent(finishSessionWorkflowRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, finishSessionWorkflowIntent);
                    return true;
                case 8:
                    AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest = (AccountRemovalAllowedWorkflowRequest) rve.a(parcel, AccountRemovalAllowedWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    PendingIntent accountRemovalAllowedWorkflowIntent = getAccountRemovalAllowedWorkflowIntent(accountRemovalAllowedWorkflowRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, accountRemovalAllowedWorkflowIntent);
                    return true;
                case 9:
                    SetupAccountWorkflowRequest setupAccountWorkflowRequest2 = (SetupAccountWorkflowRequest) rve.a(parcel, SetupAccountWorkflowRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle accountSetupWorkflowAction = accountSetupWorkflowAction(setupAccountWorkflowRequest2);
                    parcel2.writeNoException();
                    rve.e(parcel2, accountSetupWorkflowAction);
                    return true;
                default:
                    return false;
            }
        }
    }

    Bundle accountSetupWorkflowAction(SetupAccountWorkflowRequest setupAccountWorkflowRequest);

    PendingIntent getAccountRemovalAllowedWorkflowIntent(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest);

    PendingIntent getConfirmCredentialsWorkflowIntent(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest);

    PendingIntent getFinishSessionWorkflowIntent(FinishSessionWorkflowRequest finishSessionWorkflowRequest);

    PendingIntent getSetupAccountWorkflowIntent(SetupAccountWorkflowRequest setupAccountWorkflowRequest);

    PendingIntent getStartAddAccountSessionWorkflowIntent(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest);

    PendingIntent getStartUpdateCredentialsSessionWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);

    PendingIntent getTokenRetrievalWorkflowIntent(TokenWorkflowRequest tokenWorkflowRequest);

    PendingIntent getUpdateCredentialsWorkflowIntent(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest);
}
